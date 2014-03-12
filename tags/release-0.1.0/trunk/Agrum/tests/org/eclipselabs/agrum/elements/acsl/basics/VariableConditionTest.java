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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class VariableConditionTest {
	
	private VariableCondition v;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		v = new VariableCondition("a", "==", "b");
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.eclipselabs.agrum.elements.acsl.basics.VariableCondition#VariableCondition(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testVariableCondition() {
		assertNotNull("Instance is created",v);
	}

	/**
	 * Test method for {@link org.eclipselabs.agrum.elements.acsl.basics.VariableCondition#toString()}.
	 */
	@Test
	public void testToString() {
		assertEquals("ToString is verified","a==b",v.toString());
	}

}
