/***********************************************************************
 * Copyright (c) 2013, Atos
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Anthony Fernandes Pires (Atos/ONERA) - initial API and implementation
 **********************************************************************/

package org.eclipselabs.agrum.services.model.plugin.parser;

import java.util.ArrayList;
import java.util.Iterator;

import org.antlr.runtime.RecognitionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.PseudostateKind;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.Trigger;
import org.eclipselabs.agrum.elements.acsl.basics.AssumesClause;
import org.eclipselabs.agrum.elements.acsl.basics.Behavior;
import org.eclipselabs.agrum.elements.acsl.basics.ACSLSymbol;
import org.eclipselabs.agrum.elements.acsl.basics.EnsuresClause;
import org.eclipselabs.agrum.elements.acsl.basics.FunctionContract;
import org.eclipselabs.agrum.elements.acsl.basics.RequiresClause;
import org.eclipselabs.agrum.elements.acsl.basics.VariableCondition;
import org.eclipselabs.agrum.elements.acsl.statemachine.SMAssumesClause;
import org.eclipselabs.agrum.elements.acsl.statemachine.SMBehavior;
import org.eclipselabs.agrum.elements.acsl.statemachine.SMNoOtherTransitionsEnsuresClause;
import org.eclipselabs.agrum.elements.acsl.statemachine.SMTransitionEnsuresClause;
import org.eclipselabs.agrum.services.generator.exceptions.ModelConstructionException;
import org.eclipselabs.agrum.services.generator.exceptions.OCLTranslationException;
import org.eclipselabs.agrum.services.ocl.parser.OCLParser;


import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;


/**
 * The class <code>ModelParser</code> represents the generator to .
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public abstract class ModelParser {

	/**
	 * The <code> true </code>value in ACSL
	 */
	private final static String ACSL_true="\\true";

	/**
	 * The value of the return of the transition fonction
	 */
	private final static String outputStateVariableName="\\result";

	/**
	 * The name of the event representing a clock tick
	 */
	private final static String clockTriggerName="tick";

	/**
	 * The representation of the empty set value in our approach
	 */
	private final static String emptySetName="Null";

	/**
	 * To get an iterator on each state of the state machine
	 * @param s - the state machine
	 * @return the iterator 
	 */
	private static Iterator<State> StateIterator(StateMachine s){
		Predicate<Object> allStates = Predicates.instanceOf(State.class);
		Iterator<EObject> result = Iterators.filter(s.eAllContents(), allStates);
		Iterator<State> states = Iterators.transform(result, new com.google.common.base.Function<EObject,State>(){
			@Override
			public State apply(EObject arg0) {
				return (State) arg0;
			}
		});
		return states;
	}

	/**
	 * To get an iterator on each state of the state machine which possessed at least one outgoing transition with a tick event trigger
	 * @param s - the state machine
	 * @return the iterator 
	 */
	private static Iterator<State> tickStateIterator(StateMachine s){
		Iterator<State> states_iter = StateIterator(s);
		Iterator<State> new_states_iter = Iterators.filter(states_iter, new com.google.common.base.Predicate<State>(){
			@Override
			public boolean apply(State arg0) {
				for (Transition t : arg0.getOutgoings())
					for (Trigger trg : t.getTriggers()){
						if (trg.getEvent().getName().equals(clockTriggerName))
							return true;
					}
				return false ;
			}
		});
		return new_states_iter;
	}

	/**
	 * To get an iterator on each state of the state machine which possessed at least one outgoing transition with a completion event trigger
	 * @param s - the state machine
	 * @return the iterator
	 */
	private static Iterator<State> completionStateIterator(StateMachine s){
		Iterator<State> states_iter = StateIterator(s);
		Iterator<State> new_states_iter = Iterators.filter(states_iter, new com.google.common.base.Predicate<State>(){
			@Override
			public boolean apply(State arg0) {
				for (Transition t : arg0.getOutgoings())
					if (t.getTriggers().isEmpty())
						return true;
				return false ;
			}
		});
		return new_states_iter;
	}

	/**
	 * To get an iterator on each outgoing transition of a state, which possessed a tick event as trigger
	 * @param s - the state
	 * @return the iterator
	 */
	private static Iterator<Transition> tickTransitionIterator(State s){
		Predicate<Object> allTransitions = Predicates.instanceOf(Transition.class);
		Iterator<Transition> transitions = Iterators.filter(s.getOutgoings().listIterator(), allTransitions);

		transitions = Iterators.filter(transitions,new com.google.common.base.Predicate<Transition>(){

			@Override
			public boolean apply(Transition arg0) {
				for (Trigger trg : arg0.getTriggers()){
					if (trg.getEvent().getName().equals(clockTriggerName))
						return true;
				}
				return false ;
			}
		});	
		return transitions;
	}

	/**
	 * To get an iterator on each outgoing transition of a state, which possessed a tick event as trigger
	 * @param s - the state
	 * @return the iterator
	 */
	private static Iterator<Transition> completionTransitionIterator(State s){
		Predicate<Object> allTransitions = Predicates.instanceOf(Transition.class);
		Iterator<Transition> transitions = Iterators.filter(s.getOutgoings().listIterator(), allTransitions);

		transitions = Iterators.filter(transitions,new com.google.common.base.Predicate<Transition>(){

			@Override
			public boolean apply(Transition arg0) {
				if (arg0.getTriggers().isEmpty())
					return true;
				return false ;
			}
		});	
		return transitions;
	}

	/**
	 * To get an iterator on each pseudostate of the state machine
	 * @param s the state machine
	 * @return the iterator
	 */
	private static Iterator<Pseudostate> pseudostateIterator(StateMachine s){
		Predicate<Object> allPseudostates = Predicates.instanceOf(Pseudostate.class);
		Iterator<EObject> result = Iterators.filter(s.eAllContents(), allPseudostates);
		Iterator<Pseudostate> pseudostates = Iterators.transform(result, new com.google.common.base.Function<EObject,Pseudostate>(){
			@Override
			public Pseudostate apply(EObject arg0) {
				return (Pseudostate) arg0;
			}
		});
		return pseudostates;
	}


	/**
	 * Method to create the behavior of a state according to the kind of transitions to verified (depending on the event defined as trigger)
	 * @param state_variable_name - the name representing the current state of the state machine in the code
	 * @param s - the state
	 * @param iter - the iterator to analyse the outgoing transitions of the state
	 * @return the behavior
	 * @throws RecognitionException
	 * @throws OCLTranslationException
	 */
	private static Behavior createBehavior(String state_variable_name, State s, Iterator<Transition> iter) throws RecognitionException, OCLTranslationException{
		SMAssumesClause ass = new SMAssumesClause(new VariableCondition(state_variable_name,ACSLSymbol.EQUAL.toString(),s.getName()));
		SMBehavior beh = new SMBehavior(s.getName(),ass, new ArrayList<EnsuresClause>());
		//for all outgoing transitions
		ArrayList<String> conditions = new ArrayList<String>();
		for (Iterator<Transition> iterT = iter; iterT.hasNext();){
			Transition t = iterT.next();
			//create the output condition on the targeted state
			VariableCondition bexp= new VariableCondition(outputStateVariableName,ACSLSymbol.EQUAL.toString(),t.getTarget().getName());
			//initialize the condition with the guard default value, true
			String condition = ACSL_true;
			//If a guard is defined, translate the condition in ACSL
			if (!t.getOwnedRules().isEmpty()) {
				//Creation of the ensures clause of this transition
				condition="("+OCLParser.parseOCLCondition(t.getOwnedRules().get(0).getSpecification().stringValue())+")";
			}

			conditions.add(condition);
			//Creation of the ensures clause of this transition
			SMTransitionEnsuresClause ens = new SMTransitionEnsuresClause(condition, bexp);

			//Addition of the ensures clause to the behavior of the state
			beh.addEnsuresClause(ens);
		}

		String condExp ="";
		for (Iterator<String> condItr = conditions.iterator(); condItr.hasNext();){
			String str = condItr.next();
			condExp=condExp+ACSLSymbol.NOT+str;
			if (condItr.hasNext()) condExp=condExp+ACSLSymbol.AND.toString();

		}

		SMNoOtherTransitionsEnsuresClause condEns= new SMNoOtherTransitionsEnsuresClause(condExp,new VariableCondition(outputStateVariableName,ACSLSymbol.EQUAL.toString(),emptySetName));
		beh.addEnsuresClause(condEns);
		
		return beh;
	}
	
	/**
	 * Method to get the function contract corresponding to the state machine for transitions with tick event trigger.
	 * @param state_variable_name - the name representing the current state of the state machine in the code
	 * @param sm - the state machine
	 * @return the function contract
	 * @throws ModelConstructionException
	 * @throws RecognitionException
	 * @throws OCLTranslationException
	 */
	public static FunctionContract parseStateMachineForTick(String state_variable_name, StateMachine sm)throws ModelConstructionException, RecognitionException, OCLTranslationException {
		//check StateMachine model
		FunctionContract ctr = new FunctionContract(new ArrayList<RequiresClause>(), new ArrayList<Behavior>());

		//for states with tick event on trigger of some outgoing transition
		for (Iterator<State> iterS = tickStateIterator(sm); iterS.hasNext();){
			State s = iterS.next();
			
			//Creation of the behavior
			Behavior beh = createBehavior(state_variable_name,s, tickTransitionIterator(s));

			//Addition of the behavior of the state to the function contract
			ctr.addBehavior(beh);		
		}

		String exp ="";
		for (Iterator<State> iterS = tickStateIterator(sm); iterS.hasNext();){
			State s = iterS.next();
			exp=exp+new VariableCondition(state_variable_name,ACSLSymbol.DIF.toString(),s.getName());
			if (iterS.hasNext()) exp=exp+ACSLSymbol.AND.toString();

		}
		AssumesClause assOtherStates = new AssumesClause(exp);
		SMBehavior behOtherStates = new SMBehavior("OtherStates",assOtherStates, new ArrayList<EnsuresClause>());
		behOtherStates.addEnsuresClause(new EnsuresClause(outputStateVariableName+ACSLSymbol.EQUAL.toString()+emptySetName));

		ctr.addBehavior(behOtherStates);

		return ctr;
	}


	/**
	 * Method to get the function contract corresponding to the state machine for transitions with completion event trigger.
	 * @param state_variable_name - the name representing the current state of the state machine in the code
	 * @param sm - the state machine
	 * @return the function contract corresponding to the state machine for transitions with completion event trigger.
	 * @throws ModelConstructionException
	 * @throws RecognitionException
	 * @throws OCLTranslationException
	 */
	public static FunctionContract parseStateMachineForCompletion(String state_variable_name, StateMachine sm)throws ModelConstructionException, RecognitionException, OCLTranslationException {


		FunctionContract ctr = new FunctionContract(new ArrayList<RequiresClause>(), new ArrayList<Behavior>());

		//parse the initial state (unique pseudostate in the statemachine)
		for (Iterator<Pseudostate> iterP = pseudostateIterator(sm); iterP.hasNext();){
			Pseudostate p = iterP.next();
			SMBehavior beh = new SMBehavior(p.getName(),new SMAssumesClause(new VariableCondition(state_variable_name,ACSLSymbol.EQUAL.toString(),p.getName())), new ArrayList<EnsuresClause>());
			for (Iterator<Transition> iterT = p.getOutgoings().iterator(); iterT.hasNext();){
				Transition t = iterT.next();	
				beh.addEnsuresClause(new SMTransitionEnsuresClause(ACSL_true, new VariableCondition(outputStateVariableName,ACSLSymbol.EQUAL.toString(),t.getTarget().getName())));
			}
			beh.addEnsuresClause(new SMNoOtherTransitionsEnsuresClause(ACSLSymbol.NOT.toString() + ACSL_true, new VariableCondition(outputStateVariableName,ACSLSymbol.EQUAL.toString(),emptySetName)));
			ctr.addBehavior(beh);
		}

		//for states with completion event on trigger of some outgoing transition
		for (Iterator<State> iterS = completionStateIterator(sm); iterS.hasNext();){
			State s = iterS.next();

			//Creation of the behavior
			Behavior beh = createBehavior(state_variable_name,s, completionTransitionIterator(s));
			
			//Addition of the behavior of the state to the function contract
			ctr.addBehavior(beh);
		}
		ArrayList<String> al = new ArrayList<String>();

		for (Iterator<Pseudostate> iterP = pseudostateIterator(sm); iterP.hasNext();){
			Pseudostate p = iterP.next();
			al.add(p.getName());
		}
		String exp ="";
		for (Iterator<State> iterS = completionStateIterator(sm); iterS.hasNext();){
			State s = iterS.next();
			al.add(s.getName());
		}


		for (Iterator<String> itr = al.iterator(); itr.hasNext();){
			String str = itr.next();
			exp=exp+new VariableCondition(state_variable_name,ACSLSymbol.DIF.toString(),str);
			if (itr.hasNext()) exp=exp+ACSLSymbol.AND.toString();

		}

		AssumesClause assOtherStates = new AssumesClause(exp);
		SMBehavior behOtherStates = new SMBehavior("OtherStates",assOtherStates, new ArrayList<EnsuresClause>());
		behOtherStates.addEnsuresClause(new EnsuresClause(outputStateVariableName+ACSLSymbol.EQUAL.toString()+emptySetName));

		ctr.addBehavior(behOtherStates);

		return ctr;
	}


	/**
	 * check if the state machine is well-formed
	 * @param sm - the state machine to check
	 * @throws ModelConstructionException
	 */
	public static void checkStateMachineModelling(StateMachine sm) throws ModelConstructionException{
		if(sm.getRegions().size()>1) throw new ModelConstructionException("There are more than one region in statemachine "+sm.getName()+".");
		if(!pseudostateIterator(sm).hasNext()) throw new ModelConstructionException("No initial pseudostate has been defined for statemachine "+sm.getName()+".");;

		//parse the initial state (unique pseudostate in the statemachine)
		for (Iterator<Pseudostate> iterP = pseudostateIterator(sm); iterP.hasNext();){
			Pseudostate p = iterP.next();
			if (iterP.hasNext()||p.getKind()!= PseudostateKind.INITIAL_LITERAL) throw new ModelConstructionException("Wrong pseudostates defined in statemachine "+ sm.getName() +", only an Initial pseudostate is autorized.");
			for (Iterator<Transition> iterT = p.getOutgoings().iterator(); iterT.hasNext();){
				Transition t = iterT.next();
				if (iterT.hasNext()) throw new ModelConstructionException("Too many outgoing transitions for the initial pseudostate "+p.getName()+ " in statemachine "+ sm.getName()+", only one autorized.");
				if (!t.eContents().isEmpty()) throw new ModelConstructionException("The outgoing transition of the initial pseudostate "+p.getName()+ " in statemachine "+ sm.getName()+" must not contain trigger or guard.");
			}		
		}
	}




}
