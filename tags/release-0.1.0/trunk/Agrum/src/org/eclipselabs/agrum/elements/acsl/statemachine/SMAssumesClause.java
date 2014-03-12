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

import org.eclipselabs.agrum.elements.acsl.basics.AssumesClause;
import org.eclipselabs.agrum.elements.acsl.basics.VariableCondition;

/**
 * The class <code>SMAssumesClause</code> represents the specific ACSL assumes clause of the approach for a state machine. It corresponds to a test on the value of the current state.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class SMAssumesClause extends AssumesClause{

	/**
	 * The constructor. The specific assumes clause of the approach.
	 * @param exp - The condition on the variable representing the current state.
	 */	
	
 public SMAssumesClause(VariableCondition exp){
	 super(exp.toString());
 }
 
}
