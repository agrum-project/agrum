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
 * The class <code>RequiresClause</code> represents the ACSL requires clause
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class RequiresClause extends Clause {

	/**
	 * Constructor. To create an requires clause with a given expression
	 * @param expression_ - represents the body of the clause
	 */
	public RequiresClause (String expression_){
		super("requires", expression_);

	}

}
