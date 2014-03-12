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

package org.eclipselabs.agrum.plugin.wizard;

import java.io.IOException;

import org.antlr.runtime.RecognitionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.StateMachine;
import org.eclipselabs.agrum.services.generator.exceptions.FindTransitionFunctionException;
import org.eclipselabs.agrum.services.generator.exceptions.ModelConstructionException;
import org.eclipselabs.agrum.services.generator.exceptions.OCLTranslationException;
import org.eclipselabs.agrum.services.model.plugin.generator.Generator;


/**
 * The class <code>GenerateWizard</code> represents the wizard dialog window opened for the generation.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class GenerateWizard extends Wizard {
	/**
	 * The wizard page where the user can browse his/her file system and choose the c file to annotate.
	 */
	private GenerateWizardPage cFileBrowserPage;
	
	/**
	 * The shell of the wizard
	 */
	private Shell parent;
	
	/**
	 * The selected state machine.
	 */
	private StateMachine sm;

	/**
	 * The constructor. It first calls the constructor of the super class Wizard and store the shell of the wizard and the selected state machine.
	 * @param expression_ represents the body of the clause
	 */
	public GenerateWizard(Shell s_,StateMachine sm_){
		super();
	    setNeedsProgressMonitor(true);
		parent = s_;
		sm = sm_;
	}
	
	/**
	 * The method when the different pages of the wizard are added.
	 */
	@Override
	public void addPages(){
		cFileBrowserPage = new GenerateWizardPage("CFileBrowserPage");
		addPage(cFileBrowserPage);

	}

	/**
	 * The action executed when the Finish button is pressed
	 */
	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		if (!cFileBrowserPage.getBrowserField().isEmpty()){

			Generator g = new Generator(sm,cFileBrowserPage.getBrowserField());
			//try to generate. If ok, return a success message to the user. Else, return a warning message if the source of the problem.
			try {
				g.generateACSL("current_state");
				MessageDialog.openInformation(
						parent,
						"Generation Complete",
						"The annotated file has been generated");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				MessageDialog.openInformation(
						parent,
						"Generation failed",
						e.getMessage());
			} catch (FindTransitionFunctionException e) {
				// TODO Auto-generated catch block
				MessageDialog.openInformation(
						parent,
						"Generation failed",
						e.getMessage());
			} catch (ModelConstructionException e) {
				// TODO Auto-generated catch block
				MessageDialog.openInformation(
						parent,
						"Generation failed",
						e.getMessage());
			} catch (RecognitionException e) {
				// TODO Auto-generated catch block
				MessageDialog.openInformation(
						parent,
						"Generation failed",
						e.getMessage());
			} catch (OCLTranslationException e) {
				// TODO Auto-generated catch block
				MessageDialog.openInformation(
						parent,
						"Generation failed",
						e.getMessage());
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				MessageDialog.openInformation(
						parent,
						"Generation failed",
						e.getMessage());
			}
			
			
		}
		return true;
	}
	

}
