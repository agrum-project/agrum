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

import java.util.HashMap;

import org.antlr.runtime.tree.CommonTree;
import org.eclipselabs.agrum.services.generator.exceptions.OCLTranslationException;
import org.eclipselabs.agrum.elements.acsl.basics.ACSLSymbol;

/**
 * The abstract class <code>TranslationToACSL</code> groups the methods for translating an OCL AST into an ACSL expression.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public abstract class TranslationToACSL {
	
	/**
	 * The correspondence between OCL operators defined in the grammar and ACSL operators.
	 */
	private static final HashMap<Integer,String> dictionary = new HashMap<Integer,String>();
	static {
		dictionary.put(OCLGrammarParser.AND, ACSLSymbol.AND.toString());
		dictionary.put(OCLGrammarParser.OR, ACSLSymbol.OR.toString());
		dictionary.put(OCLGrammarParser.XOR, ACSLSymbol.XOR.toString());
		dictionary.put(OCLGrammarParser.NOT, ACSLSymbol.NOT.toString());
		dictionary.put(OCLGrammarParser.EQ, ACSLSymbol.EQUAL.toString());
		dictionary.put(OCLGrammarParser.DIF, ACSLSymbol.DIF.toString());
		dictionary.put(OCLGrammarParser.GT, ACSLSymbol.GT.toString());
		dictionary.put(OCLGrammarParser.LT, ACSLSymbol.LT.toString());
		dictionary.put(OCLGrammarParser.LEQ, ACSLSymbol.LEQ.toString());
		dictionary.put(OCLGrammarParser.GEQ, ACSLSymbol.GEQ.toString());
		dictionary.put(OCLGrammarParser.LB, ACSLSymbol.LB.toString());
		dictionary.put(OCLGrammarParser.RB, ACSLSymbol.RB.toString());
		dictionary.put(OCLGrammarParser.PT, ACSLSymbol.UNDERSCORE.toString());
		
	}
			
	/**
	 * Translate an ast in an ACSL expression
	 * @param ast - the ast of an OCL condition
	 * @return the translation in ACSL as a string
	 * @throws OCLTranslationException
	 */
	public static String translateToACSL(CommonTree ast) throws OCLTranslationException{
		String acslExpression =""; 
	    if (ast==null) throw new OCLTranslationException();
	   	 for (Object o : ast.getChildren()){
	   		 	acslExpression = acslExpression + translateToACSL_node((CommonTree)o);
	   	 }
	   	 return acslExpression;
	}

	/**
	 * Method to translate each node of the ast in ACSL
	 * @param node the node to translate in ACSL
	 * @return the corresponding translation in ACSL
	 * @throws OCLTranslationException
	 */
	private static String translateToACSL_node(CommonTree node) throws OCLTranslationException{
		String acslOperator ="";
		if (dictionary.containsKey(node.getType()))
			acslOperator = dictionary.get(node.getType());
		else {
			switch (node.getType()){
			case OCLGrammarParser.VAR :
				acslOperator = node.getText();
				break;
			case OCLGrammarParser.INT :
				acslOperator = node.getText();
				break;
			case OCLGrammarParser.FLOAT :
				acslOperator = node.getText();
				break;
			case OCLGrammarParser.EOF :
				break;
			default :
				throw new OCLTranslationException();
			}
		}
 		
		return acslOperator;
	}
	
}
