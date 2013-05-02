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

import java.util.ArrayList;
import java.util.Collection;

import org.eclipselabs.agrum.elements.acsl.basics.AssumesClause;
import org.eclipselabs.agrum.elements.acsl.basics.Behavior;
import org.eclipselabs.agrum.elements.acsl.basics.EnsuresClause;
import org.eclipselabs.agrum.elements.acsl.basics.RequiresClause;


/**
 * The class <code>SMBehavior</code> represents the specific ACSL behavior of the approach for a state machine.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class SMBehavior extends Behavior{
	
	/**
	 * The constructor. The behavior is composed of an assumes clause, an assigns clause and a collection of ensures clause. The assigns clause is given by default as an SMAssignsClause.
	 * @param id - The id of the behavior
	 * @param a - The assumes clause of the behavior.
	 * @param e - The collection of ensures clauses.
	 */	
	public SMBehavior(String id, AssumesClause a, Collection<EnsuresClause> e){
		super(id, a, new ArrayList<RequiresClause>(), new SMAssignsClause(), e);
	}

}
