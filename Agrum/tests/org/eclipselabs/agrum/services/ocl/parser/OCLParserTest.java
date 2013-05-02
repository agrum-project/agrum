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
package org.eclipselabs.agrum.services.ocl.parser;

import static org.junit.Assert.*;

import org.antlr.runtime.RecognitionException;
import org.eclipselabs.agrum.services.generator.exceptions.OCLTranslationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class OCLParserTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.eclipselabs.agrum.services.ocl.parser.OCLParser#parseOCLCondition(java.lang.String)}.
	 * @throws OCLTranslationException 
	 * @throws RecognitionException 
	 */
	@Test
	public void testParseOCLCondition() throws RecognitionException, OCLTranslationException {
		assertEquals("Translation is correct", "x == 1 && x == 2", OCLParser.parseOCLCondition("x=1 and x=2"));
	}

}
