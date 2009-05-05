package info.cukes.feature.resource;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;
import org.openarchitectureware.xtext.resource.IXtextResourceFactory;

public class CucumberFeatureResourceFactory extends ResourceFactoryImpl implements IXtextResourceFactory {
	@Override
	public Resource createResource(URI uri) {
		return new CucumberFeatureResource(uri);
	}
	
	public static void register() {
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("feature", new CucumberFeatureResourceFactory());
	}
}

