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

import org.eclipselabs.agrum.elements.acsl.basics.AssignsClause;

/**
 * The class <code>SMAssignsClause</code> represents the specific ACSL assigns clause of the approach for a state machine.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class SMAssignsClause extends AssignsClause{

	/**
	 * The constructor. The specific assigns clause of the approach. It verifies no variable changed. The property is represented by the keyword "\nothing" in ACSL.
	 */	
 public SMAssignsClause(){
	 super("\\nothing");
 }
 
}
