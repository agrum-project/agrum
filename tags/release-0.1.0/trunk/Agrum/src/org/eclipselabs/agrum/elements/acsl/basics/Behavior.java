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
 * The class <code>Behavior</code> represents a classical ACSL behavior
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public abstract class Behavior {

	/**
	 * The id of the behavior
	 */
	private String id;

	/**
	 * The assumes clause of the behavior
	 */
	private AssumesClause assumes;

	/**
	 * Collection of requires clauses of the behavior
	 */
	private Collection<RequiresClause> requires;

	/**
	 * The assigns clause of the behavior
	 */
	private AssignsClause assigns;

	/**
	 * Collection of ensures clauses of the behavior
	 */
	private Collection<EnsuresClause> ensuresClauses;

	/**
	 * Constructor. To create an ACSL behavior
	 * @param id_ - represents the name of the behavior
	 * @param assumes_ - represents the ACSL assumes clause
	 * @param requires_ - represents the ACSL requires clause (limited to one in our case)
	 * @param assigns_ - represents the ACSL assigns clause (limited to one in our case)
	 * @param ensures_ - represents a collection of ensures clauses
	 */
	public Behavior(String id_, AssumesClause assumes_, Collection<RequiresClause> requires_, AssignsClause assigns_, Collection<EnsuresClause> ensuresClauses_){
		id = id_;
		assumes = assumes_;
		requires = requires_;
		assigns = assigns_;
		ensuresClauses = ensuresClauses_;	
	}

	/**
	 * To add an ensures clause
	 * @param ensuresClause_ - represents the ensures clause to add
	 */
	public void addEnsuresClause(EnsuresClause ensuresClause_){
		ensuresClauses.add(ensuresClause_);
	}

	/**
	 * To obtain the textual representation of the behavior
	 * @return the string representation of the behavior consisting in the id of the behavior following by (in order) : the assumes clause, the requires clause, the assigns clause and all the ensures clause
	 */
	public String toString(){
		String result="behavior " + id + " :" + "\n";
		if (assumes!=null) result = result+ "    "+assumes;
		if (!requires.isEmpty()) {
			for(RequiresClause r : requires){
				result = result+ "    "+r;
			}
		}
		if (assigns!=null) result = result+ "    "+assigns;
		if (!ensuresClauses.isEmpty()) {
			for(EnsuresClause e : ensuresClauses){
				result = result+ "    "+e;
			}
		}
		return result;
	}
}
