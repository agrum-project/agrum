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

import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.eclipselabs.agrum.services.generator.exceptions.OCLTranslationException;


/**
 * The abstract class <code>OCLParser</code> groups the methods for parsing an OCL condition and translates it in ACSL.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public abstract class OCLParser {
	
	/**
	 * Static method for parsing an OCL condition.
	 * @param oclCondition - the condition to parse.
	 * @return the translation in ACSL
	 * @throws RecognitionException
	 * @throws OCLTranslationException
	 */
	public static String parseOCLCondition(String oclCondition) throws RecognitionException, OCLTranslationException{
		OCLGrammarLexer lex = new OCLGrammarLexer(new ANTLRStringStream(oclCondition));
	    CommonTokenStream tokens = new CommonTokenStream(lex);
	    OCLGrammarParser parser = new OCLGrammarParser(tokens);

	    OCLGrammarParser.start_return ret = parser.start();
	    
	    CommonTree ast = (CommonTree) ret.tree;

	    return TranslationToACSL.translateToACSL(ast);
	}

}
