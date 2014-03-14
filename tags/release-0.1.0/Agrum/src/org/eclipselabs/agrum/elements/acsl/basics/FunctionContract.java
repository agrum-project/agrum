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

package org.eclipselabs.agrum.elements.acsl.basics;

import java.util.Collection;

/**
 * The class <code>FunctionContract</code> represents an ACSL function contract composed of requires clause and behaviors.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class FunctionContract{

	/**
	 * The requires clauses of the function contract
	 */
	private Collection<RequiresClause> requiresClauses;

	/**
	 * The behavior of the function contract
	 */
	private Collection<Behavior> behaviors;

	/**
	 * Constructor. To create a function contract for a C program
	 * @param rc - represents the collection of the requires clause (pre-condition)
	 * @param b - represents the collection of the behaviors
	 */
	public FunctionContract(Collection<RequiresClause> rc, Collection<Behavior> b){
		behaviors=b;
		requiresClauses=rc;
	}

	/**
	 * To add a behavior to the function contract
	 * @param behavior - represents the behavior to add
	 */
	public void addBehavior(Behavior behavior){
		behaviors.add(behavior);
	}

	/**
	 * To add a requires clause to the function contract
	 * @param requiresClause_ - represents the requires clause to add
	 */
	public void addRequiresClause(RequiresClause requiresClause_){
		requiresClauses.add(requiresClause_);
	}

	/**
	 * To add a collection of requires clause to the function contract
	 * @param requiresClause_ - represents the collection of requires clauses to add
	 */
	public void addAllRequiresClause(Collection<RequiresClause> requiresClause_){
		requiresClauses.addAll(requiresClause_);
	}

	/**
	 * To obtain the textual representation of the clause
	 * @return the string representation of the ACSL clause consisting in the collection of the requires clause following by all the behaviors.
	 */
	public String toString(){
		String result="/*@";
		if (!requiresClauses.isEmpty()){
			for(RequiresClause requiresClause_ : requiresClauses){
				result =result+requiresClause_;
			}
		}
		for(Behavior behavior : behaviors){
			result =result+ behavior + "\n";
		}
		result=result+"*/";
		return result;
	}


}