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

package org.eclipselabs.agrum.plugin.handler;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipse.emf.facet.infra.browser.uicore.internal.model.ModelElementItem;
import org.eclipselabs.agrum.plugin.wizard.GenerateWizard;


/**
 * The class <code>GenerateHandler</code> represents the action executed when the user clicks on "Generate ACSL contract". It opens a wizard if the selected element is a state machine or returns a warning message to the user.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class GenerateHandler extends AbstractHandler{

	/**
	 * The action of the handler
	 * @param event - the event representing the current state of the application
	 */

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// TODO Auto-generated method stub
		Shell shell = HandlerUtil.getActiveShell(event);
	    
		//get the object selected
		ISelection sel = HandlerUtil.getActiveMenuSelection(event);
	    IStructuredSelection selection = (IStructuredSelection) sel;
	    
	    //get the first model element of the selected subtree (in fact the current selected element)
	    Object adapter = ((ModelElementItem)selection.getFirstElement()).getAdapter(EObject.class);
	    EObject currentElement = (EObject)adapter;
	    
	    //if a state machine, open the wizard for the generation. Else say the user he is wrong by opening a message dialog window.
	    if (currentElement instanceof StateMachine){
		    WizardDialog dialog = new WizardDialog(shell, new GenerateWizard(shell, (StateMachine)currentElement));
		    dialog.open();
	    } else {
	    MessageDialog.openInformation(
				shell,
				"Wrong model element selected",
				"This is not a state machine : generation impossible");}

		return null;
	}


}
