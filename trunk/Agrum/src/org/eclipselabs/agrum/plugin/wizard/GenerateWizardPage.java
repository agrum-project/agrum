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

import org.eclipse.swt.graphics.Color;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

/**
 * The class <code>GenerateWizardPage</code> represents the wizard page for the selection of the C file to annotate.
 * @version 0.1.0
 * @author Anthony Fernandes Pires (Atos/ONERA)
 */
public class GenerateWizardPage extends WizardPage {
	
	/**
	 * the element representing the browser field
	 */
	private Text browserField;

	/**
	 * The constructor. It first calls the constructor of the super class WizardPage and set the page title and the description field.
	 * @param pageName - the page name.
	 */
	protected GenerateWizardPage(String pageName) {
		// TODO Auto-generated constructor stub
		super(pageName);
		setTitle("Generate ACSL annotations from StateMachine");
		setDescription("Choose the C file to annotate");
	}
	
	/**
	 * The method to create the controls for the page.
	 * @param arg0 - the parent composite.
	 */	
	@Override
	public void createControl(final Composite arg0) {
		// TODO Auto-generated method stub
		
		Composite container = new Composite(arg0, SWT.NONE);
	    //set the layout
		GridLayout layout = new GridLayout();
	    container.setLayout(layout);
	    layout.numColumns = 3;
	    
	    //create the label of the browser field
	    Label label1 = new Label(container, SWT.NONE);
	    label1.setText("Select the C file to annotate");

	    //create the browser field
	    browserField = new Text(container, SWT.BORDER | SWT.SINGLE);
	    browserField.setText("");
	    browserField.setEditable(false);
	    browserField.setBackground(new Color(Display.getCurrent(),255,255,255));
	    
	    //create the button fro browsing
	    Button browserButton = new Button(container,SWT.PUSH);
	    browserButton.setText("browse...");
	    browserButton.addSelectionListener(new SelectionAdapter(){
	    	public void widgetSelected(SelectionEvent e) {
	          Shell shell = arg0.getShell();
	          openFileDialog(shell);
	        }
	      });
	    
	    setControl(container);
	    setPageComplete(false);
	}
	
	/**
	 * The method to open the file dialog to get the c file to annotate. It also configures the file dialog.
	 * @param parent - the shell parent of the wizard.
	 */	
	private void openFileDialog(Shell parent) {
		FileDialog fileDialog = new FileDialog(parent);

	    fileDialog.setText("Select a .c file");

	    fileDialog.setFilterExtensions(new String[] { "*.c" });

	    fileDialog.setFilterNames(new String[] { "SourceFile(*.c)" });

	    browserField.setText(fileDialog.open());
	    //if the content of the browser field is not empty, authorise the user to close the window.
	    if (!browserField.getText().isEmpty()) setPageComplete(true);

	}
	
	/**
	 * To get the content of the browser field.
	 * @return a string representing the content of the browser field.
	 */	
	public String getBrowserField(){
		return browserField.getText();
	}
}
