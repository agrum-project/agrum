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

package org.eclipselabs.agrum.elements.acsl.statemachine;

import org.eclipselabs.agrum.elements.acsl.basics.ACSLSymbol;
import org.eclipselabs.agrum.elements.acsl.basics.EnsuresClause;
import org.eclipselabs.agrum.elements.acsl.basics.VariableCondition;

/**
 * The class <code>SMTransitionsEnsuresClause</code> represents a specific ACSL ensures clause used in the approach for a state machine. This clause verifies that if a transition guard is true, it is equivalent to the transition function returns the targeted state.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class SMTransitionEnsuresClause extends EnsuresClause{
	
	/**
	 * The constructor. This clause is composed of a boolean condition defined as a string here which is equivalent to a condition on a variable (The result of the transition function in the approach).
	 * @param condition - The boolean condition.
	 * @param exp - The condition on the variable.
	 */
	public SMTransitionEnsuresClause(String condition, VariableCondition exp){
		super(condition + ACSLSymbol.EQUI +exp);
	}

}
