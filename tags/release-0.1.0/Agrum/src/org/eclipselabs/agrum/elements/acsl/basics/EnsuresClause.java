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
 * The class <code>EnsuresClause</code> represents the ACSL Ensures clause
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class EnsuresClause extends Clause{

	/**
	 * Constructor. To create an ensures clause with a given expression
	 * @param expression_ - represents the body of the clause
	 */
	public EnsuresClause (String expression_){
		super("ensures", expression_);

	}
}
