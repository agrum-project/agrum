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

package org.eclipselabs.agrum.services.generator.exceptions;

/**
 * The class <code>FindTransitionFunctionException</code> represents the exception thrown if the program can not find the transition function with the given name in the given c file.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class FindTransitionFunctionException extends Exception{


	/**
	 * serialVersionUID (auto-generated)
	 */
	private static final long serialVersionUID = 3457054112455486177L;

	/**
	 * Constructor
	 * @param transitionFunctionName - the name of the transition function
	 */
	public FindTransitionFunctionException(String transitionFunctionName){
		super("The transition function "+transitionFunctionName+ " does not exist in the file.");
	}
}
