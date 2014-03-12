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
 * The possible boolean connectors encountered in ACSL
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public enum ACSLSymbol {
	AND (" && "),
	OR (" || "),
	XOR (" ^^ "),
	NOT (" ! "),
	EQUAL (" == "),
	DIF (" != "),
	IMP (" ==> "),
	EQUI (" <==> "),
	GT  (" > "),
	LT (" < "),
	LEQ (" <= "),
	GEQ (" >= "),
	LB (" ( "),
	RB (" ) "),
	UNDERSCORE ("_");

	private final String stringRepresentation;

	ACSLSymbol(String str){
		stringRepresentation = str;
	}

	/**
	 * The method to obtain the string representation of the connector
	 * @result the string representation
	 */
	public String toString(){
		return this.stringRepresentation;
	}
}
