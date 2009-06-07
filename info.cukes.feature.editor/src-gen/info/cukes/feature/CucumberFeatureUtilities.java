package info.cukes.feature;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;
import org.openarchitectureware.xtext.AbstractLanguageUtilities;
import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.IXtextParser;

import info.cukes.feature.parser.XtextParser;

public class CucumberFeatureUtilities extends AbstractLanguageUtilities {

	// enforce eager registration of metamodel
	private static final EPackage EPACKAGE = info.cukes.feature.MetaModelRegistration.getEPackage();
	
	@Override
	protected IXtextParser internalParse(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

	public String getFileExtension() {
		return "feature";
	}

	public EPackage getEPackage() {
		return EPACKAGE;
	}

	List<String> r = new ArrayList<String>();
	{
		r.add("Feature:");
		r.add("Then");
		r.add("Given");
		r.add("Scenario:");
		r.add("When");
		r.add("And");
	}
	public List<String> allKeywords() {
		return r;
	}

	protected ClassLoader getClassLoader() {
		return this.getClass().getClassLoader();
	}

	public IPartitionTokenScanner getPartitionScanner() {
		return new GeneratedPartitionScanner();
	}

	@Override
	public AbstractXtextEditorPlugin getXtextEditorPlugin() {
		return CucumberFeatureEditorPlugin.getDefault();
	}
	
	@Override
	public String getPackageForExtensions() {
		return "info::cukes::feature";
	}
	
	public XtextFile getXtextFile() {
		return MetaModelRegistration.getXtextFile();
	}
	

}
