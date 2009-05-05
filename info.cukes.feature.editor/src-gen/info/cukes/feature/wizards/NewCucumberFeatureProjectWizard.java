package info.cukes.feature.wizards;

import org.openarchitectureware.xtext.LanguageUtilities;
import org.openarchitectureware.xtext.editor.wizards.AbstractNewProjectWizard;

import info.cukes.feature.CucumberFeatureEditorPlugin;

public class NewCucumberFeatureProjectWizard extends AbstractNewProjectWizard {

	public NewCucumberFeatureProjectWizard() {
		super();
		setLangName("CucumberFeature");
		setGeneratorProjectName("info.cukes.feature.generator");
		setDslProjectName("info.cukes.feature");
		setFileExtension("feature");
		setPackageName("info/cukes/feature/");
	}
	
	@Override
	protected LanguageUtilities getUtilities() {
		return CucumberFeatureEditorPlugin.getDefault().getUtilities();
	}
}

