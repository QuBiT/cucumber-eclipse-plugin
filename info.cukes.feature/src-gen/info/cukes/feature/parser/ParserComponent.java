package info.cukes.feature.parser;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.openarchitectureware.workflow.issues.Issues;
import org.openarchitectureware.xtext.parser.impl.AbstractParserComponent;
import org.openarchitectureware.xtext.resource.IXtextResource;

import info.cukes.feature.resource.CucumberFeatureResourceFactory;

public class ParserComponent extends AbstractParserComponent {
	static {
		CucumberFeatureResourceFactory.register();
	}

	protected String getFileExtension() {
		return "feature";
	}

}
