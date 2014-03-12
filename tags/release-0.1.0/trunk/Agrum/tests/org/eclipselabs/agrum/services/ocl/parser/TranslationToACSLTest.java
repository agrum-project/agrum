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

import org.antlr.runtime.CommonToken;
import org.antlr.runtime.tree.CommonTree;
import org.eclipselabs.agrum.services.generator.exceptions.OCLTranslationException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class TranslationToACSLTest {

	
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
	 * Test method for {@link org.eclipselabs.agrum.services.ocl.parser.TranslationToACSL#translateToACSL(org.antlr.runtime.tree.CommonTree)}.
	 * @throws OCLTranslationException 
	 */
	@Test
	public void testTranslateToACSL() throws OCLTranslationException {
		
		CommonTree ast1 = new CommonTree();
		ast1.addChild(new CommonTree(new CommonToken(OCLGrammarParser.AND)));
		assertEquals("AND is correctly translated", " && ", TranslationToACSL.translateToACSL(ast1));
		
		CommonTree ast2 = new CommonTree();
		ast2.addChild(new CommonTree(new CommonToken(OCLGrammarParser.OR)));
		assertEquals("OR is correctly translated", " || ", TranslationToACSL.translateToACSL(ast2));
		
		CommonTree ast3 = new CommonTree();
		ast3.addChild(new CommonTree(new CommonToken(OCLGrammarParser.XOR)));
		assertEquals("XOR is correctly translated", " ^^ ", TranslationToACSL.translateToACSL(ast3));
		
		CommonTree ast4 = new CommonTree();
		ast4.addChild(new CommonTree(new CommonToken(OCLGrammarParser.NOT)));
		assertEquals("NOT is correctly translated", " ! ", TranslationToACSL.translateToACSL(ast4));
		
		CommonTree ast5 = new CommonTree();
		ast5.addChild(new CommonTree(new CommonToken(OCLGrammarParser.EQ)));
		assertEquals("EQ is correctly translated", " == ", TranslationToACSL.translateToACSL(ast5));
		
		CommonTree ast6 = new CommonTree();
		ast6.addChild(new CommonTree(new CommonToken(OCLGrammarParser.DIF)));
		assertEquals("DIF is correctly translated", " != ", TranslationToACSL.translateToACSL(ast6));
		
		CommonTree ast7 = new CommonTree();
		ast7.addChild(new CommonTree(new CommonToken(OCLGrammarParser.GT)));
		assertEquals("GT is correctly translated", " > ", TranslationToACSL.translateToACSL(ast7));
		
		CommonTree ast8 = new CommonTree();
		ast8.addChild(new CommonTree(new CommonToken(OCLGrammarParser.LT)));
		assertEquals("LT is correctly translated", " < ", TranslationToACSL.translateToACSL(ast8));
		
		CommonTree ast9 = new CommonTree();
		ast9.addChild(new CommonTree(new CommonToken(OCLGrammarParser.LEQ)));
		assertEquals("LEQ is correctly translated", " <= ", TranslationToACSL.translateToACSL(ast9));
		
		CommonTree ast10 = new CommonTree();
		ast10.addChild(new CommonTree(new CommonToken(OCLGrammarParser.GEQ)));
		assertEquals("GEQ is correctly translated", " >= ", TranslationToACSL.translateToACSL(ast10));
		
		CommonTree ast11 = new CommonTree();
		ast11.addChild(new CommonTree(new CommonToken(OCLGrammarParser.LB)));
		assertEquals("LB is correctly translated", " ( ", TranslationToACSL.translateToACSL(ast11));
		
		CommonTree ast12 = new CommonTree();
		ast12.addChild(new CommonTree(new CommonToken(OCLGrammarParser.RB)));
		assertEquals("RB is correctly translated", " ) ", TranslationToACSL.translateToACSL(ast12));
		
		CommonTree ast13 = new CommonTree();
		ast13.addChild(new CommonTree(new CommonToken(OCLGrammarParser.PT)));
		assertEquals("PT is correctly translated", "_", TranslationToACSL.translateToACSL(ast13));

		CommonTree ast14 = new CommonTree();
		CommonToken ct1 = new CommonToken(OCLGrammarParser.VAR);
		ct1.setText("this is a VAR");
		ast14.addChild(new CommonTree(ct1));
		assertEquals("VAR is correctly translated", "this is a VAR", TranslationToACSL.translateToACSL(ast14));
		
		CommonTree ast15 = new CommonTree();
		CommonToken ct2 = new CommonToken(OCLGrammarParser.INT);
		ct2.setText("this is an INT");
		ast15.addChild(new CommonTree(ct2));
		assertEquals("INT is correctly translated", "this is an INT", TranslationToACSL.translateToACSL(ast15));
		
		CommonTree ast16 = new CommonTree();
		CommonToken ct3 = new CommonToken(OCLGrammarParser.FLOAT);
		ct3.setText("this is a FLOAT");
		ast16.addChild(new CommonTree(ct3));
		assertEquals("FLOAT is correctly translated", "this is a FLOAT", TranslationToACSL.translateToACSL(ast16));
		
		CommonTree ast17 = new CommonTree();
		CommonToken ct4 = new CommonToken(OCLGrammarParser.EOF);
		ast17.addChild(new CommonTree(ct4));
		assertEquals("EOF is correctly translated", "", TranslationToACSL.translateToACSL(ast17));
	
		ast14.addChild(ast1);
		ast14.addChild(ast15);
		assertEquals("Translation is correct", "this is a VAR && this is an INT", TranslationToACSL.translateToACSL(ast14));
	}

}
