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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipselabs.agrum.elements.acsl.basics.EnsuresClause;
import org.eclipselabs.agrum.elements.acsl.basics.VariableCondition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class SMBehaviorTest {
	
	private SMBehavior smb;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		SMAssumesClause sma = new SMAssumesClause(new VariableCondition("a","==","b"));	
		Collection<EnsuresClause> list = new ArrayList<EnsuresClause>();
		list.add(new EnsuresClause("clause 1"));
		smb= new SMBehavior("first behavior", sma, list);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.eclipselabs.agrum.elements.acsl.statemachine.SMBehavior#SMBehavior(java.lang.String, org.eclipselabs.agrum.elements.acsl.basics.AssumesClause, java.util.Collection)}.
	 */
	@Test
	public void testSMBehavior() {
		assertNotNull("Instance is created",smb);
	}

	/**
	 * Test method for {@link org.eclipselabs.agrum.elements.acsl.basics.SMBehavior#addEnsuresClause(org.eclipselabs.agrum.elements.acsl.basics.EnsuresClause)}.
	 */
	@Test
	public void testAddEnsuresClause() {
		EnsuresClause e = new EnsuresClause("clause 2");
		smb.addEnsuresClause(e);
		
		SMAssumesClause assu = new SMAssumesClause(new VariableCondition("a","==","b"));
		Collection<EnsuresClause> list = new ArrayList<EnsuresClause>();
		EnsuresClause e2 = new EnsuresClause("clause 1");
		list.add(e2);
		list.add(e);		
		SMBehavior smb2= new SMBehavior("first behavior", assu, list);
		
		assertEquals("AddEnsuresClause is verified",smb.toString(),smb2.toString() );
	}
	
	/**
	 * Test method for {@link org.eclipselabs.agrum.elements.acsl.basics.Behavior#toString()}.
	 */
	@Test
	public void testToString() {
		String testStr = "behavior first behavior :\n    assumes a==b;\n    assigns \\nothing;\n    ensures clause 1;\n";
		assertEquals("ToString for a full behavior is verified",testStr,smb.toString());
	}

}
