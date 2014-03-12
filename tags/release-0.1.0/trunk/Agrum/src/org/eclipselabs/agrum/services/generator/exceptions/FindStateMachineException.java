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
 * The class <code>FindStateMachineException</code> represents the exception thrown if the program can not find the state machine with the given name in the model.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class FindStateMachineException extends Exception{


	/**
	 * serialVersionUID (auto-generated)
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 */
	public FindStateMachineException(){
		super("The state machine does not exist in the file.");
	}
}
