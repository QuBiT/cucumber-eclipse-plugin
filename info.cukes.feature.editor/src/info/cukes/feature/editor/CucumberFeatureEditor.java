package info.cukes.feature.editor;

import org.openarchitectureware.xtext.AbstractXtextEditorPlugin;
import org.openarchitectureware.xtext.editor.AbstractXtextEditor;

import info.cukes.feature.CucumberFeatureEditorPlugin;

public class CucumberFeatureEditor extends AbstractXtextEditor {

   public AbstractXtextEditorPlugin getPlugin() {
      return CucumberFeatureEditorPlugin.getDefault();
   }
}
