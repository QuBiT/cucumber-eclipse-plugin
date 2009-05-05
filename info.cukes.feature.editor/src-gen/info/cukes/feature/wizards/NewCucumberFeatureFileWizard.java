
package info.cukes.feature.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewFileWizard;

import info.cukes.feature.CucumberFeatureEditorPlugin;

public class NewCucumberFeatureFileWizard extends AbstractNewFileWizard {

	@Override
	protected LanguageUtilities getUtilities() {
		return CucumberFeatureEditorPlugin.getDefault().getUtilities();
	}
}
