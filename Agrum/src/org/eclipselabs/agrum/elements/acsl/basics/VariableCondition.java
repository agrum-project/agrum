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
 * The class <code>VariableCondition</code> represents a boolean condition on a variable. The operators that can be used in the condition depends of the variable's type. 
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class VariableCondition {
	
	/**
	 * The variable to test
	 */
	private String var;
	
	/**
	 * the operator for the test
	 */
	private String op;
	
	/**
	 * the value to test
	 */
	private String val;
	
	/**
	 * Constructor. To create a boolean condition on a variable
	 * @param var_ - represents the variable
	 * @param op_ - represents the operator of the condition
	 * @param val_ - represents the specified value of the variable to be tested
	 */
	public VariableCondition(String var_, String op_, String val_){
		var=var_;
		op=op_;
		val=val_;
	}
	
	/**
	 * To obtain the textual representation a condition on a variable
	 * @return the string representation of the condition on the variable, consisting in the name of the variable following by the operator and the tested value.
	 */
	public String toString(){
		String result =var+op+val;
		return result;
	}

}
