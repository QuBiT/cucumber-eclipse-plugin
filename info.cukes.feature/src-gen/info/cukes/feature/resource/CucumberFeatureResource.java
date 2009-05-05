package info.cukes.feature.resource;

import java.io.InputStream;

import org.eclipse.emf.common.util.URI;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;
import org.openarchitectureware.xtext.parser.IXtextParser;
import org.openarchitectureware.xtext.resource.AbstractXtextResource;

import info.cukes.feature.parser.XtextParser;

public class CucumberFeatureResource extends AbstractXtextResource {
	public CucumberFeatureResource(URI uri) {
		super(uri);
		setFormattingExtension("info::cukes::feature::Formatting");
		setResourceLoader(new ResourceLoaderImpl(XtextParser.class.getClassLoader()));
	}

	@Override
	protected IXtextParser createParser(InputStream inputStream) {
		return new XtextParser(inputStream);
	}

}

