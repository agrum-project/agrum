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
 * The class <code>ModelConstructionException</code> represents the exception thrown if the state machine is ill-formed according to the modelling rules given in the approach.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class ModelConstructionException extends Exception{

	/**
	 * serialVersionUID (auto-generated)
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 * @param str - the reason of the exception
	 */
	public ModelConstructionException(String str){
		super("GENERATION ABORTED : model ill-formed. \n" + "Reason : "+str);
	}
}
