package info.cukes.feature;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.LanguageUtilities;
import org.osgi.framework.BundleContext;

public class CucumberFeatureEditorPlugin extends AbstractXtextEditorPlugin {
   private static CucumberFeatureEditorPlugin plugin;
   public static CucumberFeatureEditorPlugin getDefault() {
      return plugin;
   }

   private CucumberFeatureUtilities utilities = new CucumberFeatureUtilities();
   public LanguageUtilities getUtilities() {
      return utilities;
   }

   public CucumberFeatureEditorPlugin() {
      plugin = this;
   }

   public void stop(BundleContext context) throws Exception {
      super.stop(context);
      plugin = null;
   }
}
