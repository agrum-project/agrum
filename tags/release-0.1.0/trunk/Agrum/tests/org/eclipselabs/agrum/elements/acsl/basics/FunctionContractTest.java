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

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipselabs.agrum.elements.acsl.statemachine.SMBehavior;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class FunctionContractTest {
	
	private FunctionContract f;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		Collection<RequiresClause> reqcol = new ArrayList<RequiresClause>();
		Collection<Behavior> behcol = new ArrayList<Behavior>();
		f= new FunctionContract(reqcol, behcol);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.eclipselabs.agrum.elements.acsl.basics.FunctionContract#FunctionContract(java.util.Collection, java.util.Collection)}.
	 */
	@Test
	public void testFunctionContract() {
		assertNotNull("Instance is created",f);
	}

	/**
	 * Test method for {@link org.eclipselabs.agrum.elements.acsl.basics.FunctionContract#addBehavior(org.eclipselabs.agrum.elements.acsl.basics.Behavior)}.
	 */
	@Test
	public void testAddBehavior() {
		AssumesClause assu = new AssumesClause("this is a test");
		Collection<EnsuresClause> list = new ArrayList<EnsuresClause>();
		Behavior b= new SMBehavior("first behavior", assu, list);
		
		f.addBehavior(b);
		
		Collection<RequiresClause> reqcol = new ArrayList<RequiresClause>();
		Collection<Behavior> behcol = new ArrayList<Behavior>();
		behcol.add(b);
		FunctionContract f2= new FunctionContract(reqcol, behcol);
		
		assertEquals("AddBehavior is verified",f.toString(),f2.toString() );
	}

	/**
	 * Test method for {@link org.eclipselabs.agrum.elements.acsl.basics.FunctionContract#addRequiresClause(org.eclipselabs.agrum.elements.acsl.basics.RequiresClause)}.
	 */
	@Test
	public void testAddRequiresClause() {
		RequiresClause r = new RequiresClause("this is a test");	
		f.addRequiresClause(r);
		
		Collection<RequiresClause> reqcol = new ArrayList<RequiresClause>();
		Collection<Behavior> behcol = new ArrayList<Behavior>();
		reqcol.add(r);
		FunctionContract f2= new FunctionContract(reqcol, behcol);
		
		assertEquals("AddRequiresClause is verified",f.toString(),f2.toString() );
	}

	/**
	 * Test method for {@link org.eclipselabs.agrum.elements.acsl.basics.FunctionContract#addAllRequiresClause(java.util.Collection)}.
	 */
	@Test
	public void testAddAllRequiresClause() {
		RequiresClause r = new RequiresClause("this is a test");
		RequiresClause r2 = new RequiresClause("this is a test");
		
		Collection<RequiresClause> reqs = new ArrayList<RequiresClause>();
		reqs.add(r);
		reqs.add(r2);
		
		f.addAllRequiresClause(reqs);

		Collection<RequiresClause> reqcol = new ArrayList<RequiresClause>();
		Collection<Behavior> behcol = new ArrayList<Behavior>();
		reqcol.addAll(reqs);
		FunctionContract f2= new FunctionContract(reqcol, behcol);
		
		assertEquals("AddAllRequiresClause is verified",f.toString(),f2.toString() );
	}

	/**
	 * Test method for {@link org.eclipselabs.agrum.elements.acsl.basics.FunctionContract#toString()}.
	 */
	@Test
	public void testToString() {
		String testStr = "/*@*/";
		assertEquals("ToString for empty function contract is verified",testStr,f.toString());
		
		RequiresClause req = new RequiresClause("clause 1");	
		f.addRequiresClause(req);
		
		testStr = "/*@requires clause 1;\n*/";
		assertEquals("ToString for function contract with only requires clause is verified",testStr,f.toString());
		
		AssumesClause assu = new AssumesClause("clause 2");
		Collection<EnsuresClause> list = new ArrayList<EnsuresClause>();
		Behavior b= new SMBehavior("first behavior", assu, list);
		
		f.addBehavior(b);
		
		testStr = "/*@requires clause 1;\nbehavior first behavior :\n    assumes clause 3;\n    requires clause 2;\n    assigns clause 4;\n\n*/";
		assertEquals("ToString for full function contract is verified",testStr,f.toString());
	}

}
