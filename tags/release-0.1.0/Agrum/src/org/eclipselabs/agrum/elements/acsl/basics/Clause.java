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

/**
 * The abstract class <code>Clause</code> represents the pattern of an ACSL clause
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public abstract class Clause {

	/**
	 * the type of the clause
	 */
	private String sort;

	/**
	 * the property of the clause
	 */
	private String expression;

	/**
	 * Constructor. To create a clause with a given expression
	 * @param sort_ - represents the type of the ACSL clause (requires, assumes, assigns, ensures, etc...)
	 * @param expression_ - represents the body of the clause
	 */
	public Clause(String sort_, String expression_){
		sort = sort_;
		expression = expression_;
	}

	/**
	 * To obtain the textual representation of the clause
	 * @return the string representation of the ACSL clause consisting in the type of the clause following by its body (the expression). it ends by  a semi-colon.
	 */
	public String toString(){
		return sort + " " + expression + ";" + "\n";
	}
}
