
package info.cukes.feature;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.openarchitectureware.workflow.util.ResourceLoader;
import org.openarchitectureware.workflow.util.ResourceLoaderImpl;
import org.openarchitectureware.workflow.util.ResourceLoaderFactory;
import org.openarchitectureware.xtext.XtextFile;

public class MetaModelRegistration {
	
    static {
	    register();
		loadXtextFile();
	}
	
		public static void register() {
			String nsURI = "http://www.example.org/info/cukes/feature";
			if (EPackage.Registry.INSTANCE.get(nsURI) == null) {
   				try {
					EPackage pack = (EPackage) loadRootObject("info/cukes/feature/cucumberfeature" + ".ecore");
					EPackage.Registry.INSTANCE.put(nsURI, pack);
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
   	
	
	public static EPackage getEPackage() {
		return EPackage.Registry.INSTANCE.getEPackage("http://www.example.org/info/cukes/feature");
	}
	
	public static XtextFile xtextfile;
	
	public static XtextFile getXtextFile() {
		return xtextfile;
	}
	
	private static String getLanguagePath() {
	   return "info/cukes/feature/CucumberFeature";
	}
	
	private static EObject loadRootObject(final String resourceName) throws IOException {
	   if (resourceName == null)
	       return null;
	       
	  final URL url = ResourceLoaderFactory.createResourceLoader()
           .getResource(resourceName);

      // Get the URI of the model file.
      URI fileURI = URI.createURI(url.toExternalForm());

      ResourceSet resourceSet = new ResourceSetImpl();
      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
          .put(Resource.Factory.Registry.DEFAULT_EXTENSION,
                  new XMIResourceFactoryImpl());
      Resource resource = resourceSet.getResource(fileURI, true);

      resource.load(null);
      return resource.getContents().get(0);
	}
	
	private static void loadXtextFile(){
		if (xtextfile == null) {
		    ResourceLoader rl = ResourceLoaderFactory.createResourceLoader();
			try {
			    //intialize xtext mm
			    org.openarchitectureware.xtext.XtextPackage.eINSTANCE.getEFactoryInstance();
				ResourceLoaderFactory
						.setCurrentThreadResourceLoader(new ResourceLoaderImpl(
								MetaModelRegistration.class.getClassLoader()));

				xtextfile = (XtextFile) loadRootObject(getLanguagePath() + ".xmi");
			} catch (Exception e) {
				System.out.println("Couldn't load xmi file (" + getLanguagePath() + ".xmi)");
			} finally {
				ResourceLoaderFactory
						.setCurrentThreadResourceLoader(rl);
			}
		}
	}
}
