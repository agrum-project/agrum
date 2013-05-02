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
 * The class <code>OCLTranslationException</code> represents the exception thrown if an error appeared during the parsing of an OCL condition.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class OCLTranslationException extends Exception{

	/**
	 * serialVersionUID (auto-generated)
	 */
	private static final long serialVersionUID = -1054934569742190896L;

	/**
	 * Constructor
	 */
	public OCLTranslationException(){
		super("GENERATION ABORTED : OCL Translation failed");
	}
}
