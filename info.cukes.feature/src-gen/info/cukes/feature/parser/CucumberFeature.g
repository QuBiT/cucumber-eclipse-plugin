grammar CucumberFeature;
 options{backtrack=true; memoize=true;} 

@lexer::header {
package info.cukes.feature.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

@parser::header {
package info.cukes.feature.parser;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;

import org.openarchitectureware.xtext.parser.impl.AntlrUtil;
import org.openarchitectureware.xtext.XtextFile;
import org.openarchitectureware.xtext.parser.impl.EcoreModelFactory;
import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.model.ParseTreeManagerNeu;
import org.openarchitectureware.xtext.parser.parsetree.Node;

import info.cukes.feature.MetaModelRegistration;

}
@lexer::members {
	 private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	public String getErrorMessage(RecognitionException e, String[] tokenNames) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		return msg;
	}
}

@parser::members {

	private Token getLastToken() {
		return input.LT(-1);
	}

	protected Object convert(Object arg) {
		if (arg instanceof org.antlr.runtime.Token) {
			Token t = (Token) arg;
			String s = t.getText();
			if (t.getType() == CucumberFeatureLexer.RULE_ID && s.startsWith("^")) {
				return s.substring(1);
			} else if (t.getType()==CucumberFeatureLexer.RULE_STRING) {
				return s.substring(1,s.length()-1);
			} else if (t.getType()==CucumberFeatureLexer.RULE_INT) {
				return Integer.valueOf(s);
			}
			return s;
		}
		return arg;
	}


	private EcoreModelFactory factory = new EcoreModelFactory(MetaModelRegistration.getEPackage());
    private ParseTreeManagerNeu ptm = new ParseTreeManagerNeu();
	private XtextFile xtextfile = MetaModelRegistration.getXtextFile();
	
	{
		
	}

	public ParseTreeManagerNeu getResult() {
		return ptm;
	}

	private List<ErrorMsg> errors = new ArrayList<ErrorMsg>();
	public List<ErrorMsg> getErrors() {
		return errors;
	}

	@Override
	public void reportError(RecognitionException e) {
		String msg = super.getErrorMessage(e,tokenNames);
		errors.add(AntlrUtil.create(msg,e,tokenNames));
		ptm.addError(msg, e);
		// This doesn't work. ANTLR may simply report an superfluous token. In that case,
		// two nodes will be finished instead of one.
		// ptm.ruleFinished(null, end());
	}

    private boolean skipCurrentToken;
    
	@Override
	protected boolean recoverFromMismatchedElement(IntStream arg0, RecognitionException arg1, BitSet arg2) {
		skipCurrentToken = true;
		return super.recoverFromMismatchedElement(arg0, arg1, arg2);
	}
}


parse returns [Node r]:
	 result=ruleCucumber
	 // Always return the root node! This prevents that this method is called multiple times
	 // with interesting side effects.
{
if (result != null)
  ptm.setModelElement(result);
$r = ptm.getCurrent();
ptm.ruleFinished(result);}	 EOF
;

ruleCucumber returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Cucumber");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)));}temp_Feature=
ruleFeature{if (temp_Feature != null) {
  hasContent = true;
  ptm.setModelElement(temp_Feature);
  factory.set($result,"f",convert(temp_Feature),false);
  ptm.ruleFinished(temp_Feature);
} else {
  ptm.destroyNode();
}
}
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleFeature returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Feature");
			 }
(({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)));}temp_FeatureIdentifier=
ruleFeatureIdentifier{if (temp_FeatureIdentifier != null) {
  hasContent = true;
  ptm.setModelElement(temp_FeatureIdentifier);
  factory.set($result,"fi",convert(temp_FeatureIdentifier),false);
  ptm.ruleFinished(temp_FeatureIdentifier);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)));}temp_FeatureDescription=
ruleFeatureDescription{if (temp_FeatureDescription != null) {
  hasContent = true;
  ptm.setModelElement(temp_FeatureDescription);
  factory.set($result,"fd",convert(temp_FeatureDescription),false);
  ptm.ruleFinished(temp_FeatureDescription);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)));}temp_BusinessValueDefinition=
ruleBusinessValueDefinition{if (temp_BusinessValueDefinition != null) {
  hasContent = true;
  ptm.setModelElement(temp_BusinessValueDefinition);
  factory.set($result,"bvd",convert(temp_BusinessValueDefinition),false);
  ptm.ruleFinished(temp_BusinessValueDefinition);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)));}temp_RoleDefinition=
ruleRoleDefinition{if (temp_RoleDefinition != null) {
  hasContent = true;
  ptm.setModelElement(temp_RoleDefinition);
  factory.set($result,"rd",convert(temp_RoleDefinition),false);
  ptm.ruleFinished(temp_RoleDefinition);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)));}temp_SomeActionDefinition=
ruleSomeActionDefinition{if (temp_SomeActionDefinition != null) {
  hasContent = true;
  ptm.setModelElement(temp_SomeActionDefinition);
  factory.set($result,"sad",convert(temp_SomeActionDefinition),false);
  ptm.ruleFinished(temp_SomeActionDefinition);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)));}temp_Scenario=
ruleScenario{if (temp_Scenario != null) {
  hasContent = true;
  ptm.setModelElement(temp_Scenario);
  factory.add($result,"ss",convert(temp_Scenario),false);
  ptm.ruleFinished(temp_Scenario);
} else {
  ptm.destroyNode();
}
}
)*
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleFeatureIdentifier returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "FeatureIdentifier");
			 }
({skipCurrentToken = false;}'Feature:'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleFeatureDescription returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "FeatureDescription");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)));}temp_Word=
ruleWord{if (temp_Word != null) {
  hasContent = true;
  factory.add($result,"text",convert(temp_Word),false);
  ptm.ruleFinished(temp_Word);
} else {
  ptm.destroyNode();
}
}
)+
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleBusinessValueDefinition returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "BusinessValueDefinition");
			 }
(({skipCurrentToken = false;}
RULE_BusinessValueIdentifier{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)));
  factory.set($result,"bv",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)));}temp_BusinessValueDescription=
ruleBusinessValueDescription{if (temp_BusinessValueDescription != null) {
  hasContent = true;
  ptm.setModelElement(temp_BusinessValueDescription);
  factory.set($result,"bv_desc",convert(temp_BusinessValueDescription),false);
  ptm.ruleFinished(temp_BusinessValueDescription);
} else {
  ptm.destroyNode();
}
}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

RULE_BusinessValueIdentifier :

	 'In order to '
;

ruleBusinessValueDescription returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "BusinessValueDescription");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)));}temp_Word=
ruleWord{if (temp_Word != null) {
  hasContent = true;
  factory.add($result,"text",convert(temp_Word),false);
  ptm.ruleFinished(temp_Word);
} else {
  ptm.destroyNode();
}
}
)+
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleRoleDefinition returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "RoleDefinition");
			 }
(({skipCurrentToken = false;}
RULE_RoleIdentifier{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)));
  factory.set($result,"ri",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)));}temp_RoleDescription=
ruleRoleDescription{if (temp_RoleDescription != null) {
  hasContent = true;
  ptm.setModelElement(temp_RoleDescription);
  factory.set($result,"role_desc",convert(temp_RoleDescription),false);
  ptm.ruleFinished(temp_RoleDescription);
} else {
  ptm.destroyNode();
}
}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

RULE_RoleIdentifier :

	 'As a '|'As an '
;

ruleRoleDescription returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "RoleDescription");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)));}temp_Word=
ruleWord{if (temp_Word != null) {
  hasContent = true;
  factory.add($result,"text",convert(temp_Word),false);
  ptm.ruleFinished(temp_Word);
} else {
  ptm.destroyNode();
}
}
)+
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleSomeActionDefinition returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "SomeActionDefinition");
			 }
(({skipCurrentToken = false;}
RULE_SomeActionIdentifier{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)));
  factory.set($result,"sa",convert(temp),false);
  ptm.ruleFinished(temp);
}}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)));}temp_SomeActionDescription=
ruleSomeActionDescription{if (temp_SomeActionDescription != null) {
  hasContent = true;
  ptm.setModelElement(temp_SomeActionDescription);
  factory.set($result,"sa_desc",convert(temp_SomeActionDescription),false);
  ptm.ruleFinished(temp_SomeActionDescription);
} else {
  ptm.destroyNode();
}
}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

RULE_SomeActionIdentifier :

	 'I want to '
;

ruleSomeActionDescription returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "SomeActionDescription");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)));}temp_Word=
ruleWord{if (temp_Word != null) {
  hasContent = true;
  factory.add($result,"text",convert(temp_Word),false);
  ptm.ruleFinished(temp_Word);
} else {
  ptm.destroyNode();
}
}
)+
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleScenario returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "Scenario");
			 }
(({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)));}temp_ScenarioIdentifier=
ruleScenarioIdentifier{if (temp_ScenarioIdentifier != null) {
  hasContent = true;
  ptm.setModelElement(temp_ScenarioIdentifier);
  factory.set($result,"si",convert(temp_ScenarioIdentifier),false);
  ptm.ruleFinished(temp_ScenarioIdentifier);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)));}temp_ScenarioDescription=
ruleScenarioDescription{if (temp_ScenarioDescription != null) {
  hasContent = true;
  ptm.setModelElement(temp_ScenarioDescription);
  factory.set($result,"sd",convert(temp_ScenarioDescription),false);
  ptm.ruleFinished(temp_ScenarioDescription);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)));}temp_GivenBlock=
ruleGivenBlock{if (temp_GivenBlock != null) {
  hasContent = true;
  ptm.setModelElement(temp_GivenBlock);
  factory.set($result,"gb",convert(temp_GivenBlock),false);
  ptm.ruleFinished(temp_GivenBlock);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)));}temp_WhenBlock=
ruleWhenBlock{if (temp_WhenBlock != null) {
  hasContent = true;
  ptm.setModelElement(temp_WhenBlock);
  factory.set($result,"wb",convert(temp_WhenBlock),false);
  ptm.ruleFinished(temp_WhenBlock);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(4)));}temp_ThenBlock=
ruleThenBlock{if (temp_ThenBlock != null) {
  hasContent = true;
  ptm.setModelElement(temp_ThenBlock);
  factory.set($result,"tb",convert(temp_ThenBlock),false);
  ptm.ruleFinished(temp_ThenBlock);
} else {
  ptm.destroyNode();
}
}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleScenarioIdentifier returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "ScenarioIdentifier");
			 }
({skipCurrentToken = false;}'Scenario:'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleScenarioDescription returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "ScenarioDescription");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)));}temp_Word=
ruleWord{if (temp_Word != null) {
  hasContent = true;
  factory.add($result,"text",convert(temp_Word),false);
  ptm.ruleFinished(temp_Word);
} else {
  ptm.destroyNode();
}
}
)+
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleGivenBlock returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "GivenBlock");
			 }
(({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)));}temp_GivenIdentifier=
ruleGivenIdentifier{if (temp_GivenIdentifier != null) {
  hasContent = true;
  ptm.setModelElement(temp_GivenIdentifier);
  factory.set($result,"gi",convert(temp_GivenIdentifier),false);
  ptm.ruleFinished(temp_GivenIdentifier);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)));}temp_GivenDefinition=
ruleGivenDefinition{if (temp_GivenDefinition != null) {
  hasContent = true;
  ptm.setModelElement(temp_GivenDefinition);
  factory.set($result,"given_def",convert(temp_GivenDefinition),false);
  ptm.ruleFinished(temp_GivenDefinition);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)));}temp_AndBlock=
ruleAndBlock{if (temp_AndBlock != null) {
  hasContent = true;
  ptm.setModelElement(temp_AndBlock);
  factory.add($result,"ab",convert(temp_AndBlock),false);
  ptm.ruleFinished(temp_AndBlock);
} else {
  ptm.destroyNode();
}
}
)*
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleGivenIdentifier returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "GivenIdentifier");
			 }
({skipCurrentToken = false;}'Given'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleWhenBlock returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "WhenBlock");
			 }
(({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)));}temp_WhenIdentifier=
ruleWhenIdentifier{if (temp_WhenIdentifier != null) {
  hasContent = true;
  ptm.setModelElement(temp_WhenIdentifier);
  factory.set($result,"wi",convert(temp_WhenIdentifier),false);
  ptm.ruleFinished(temp_WhenIdentifier);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)));}temp_WhenDefinition=
ruleWhenDefinition{if (temp_WhenDefinition != null) {
  hasContent = true;
  ptm.setModelElement(temp_WhenDefinition);
  factory.set($result,"when_def",convert(temp_WhenDefinition),false);
  ptm.ruleFinished(temp_WhenDefinition);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)));}temp_AndBlock=
ruleAndBlock{if (temp_AndBlock != null) {
  hasContent = true;
  ptm.setModelElement(temp_AndBlock);
  factory.add($result,"ab",convert(temp_AndBlock),false);
  ptm.ruleFinished(temp_AndBlock);
} else {
  ptm.destroyNode();
}
}
)*
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleWhenIdentifier returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "WhenIdentifier");
			 }
({skipCurrentToken = false;}'When'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleThenBlock returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "ThenBlock");
			 }
(({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(0)));}temp_ThenIdentifier=
ruleThenIdentifier{if (temp_ThenIdentifier != null) {
  hasContent = true;
  ptm.setModelElement(temp_ThenIdentifier);
  factory.set($result,"ti",convert(temp_ThenIdentifier),false);
  ptm.ruleFinished(temp_ThenIdentifier);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(1)));}temp_ThenDefinition=
ruleThenDefinition{if (temp_ThenDefinition != null) {
  hasContent = true;
  ptm.setModelElement(temp_ThenDefinition);
  factory.set($result,"then_def",convert(temp_ThenDefinition),false);
  ptm.ruleFinished(temp_ThenDefinition);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(2)));}temp_AndBlock=
ruleAndBlock{if (temp_AndBlock != null) {
  hasContent = true;
  ptm.setModelElement(temp_AndBlock);
  factory.add($result,"ab",convert(temp_AndBlock),false);
  ptm.ruleFinished(temp_AndBlock);
} else {
  ptm.destroyNode();
}
}
)*
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleThenIdentifier returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "ThenIdentifier");
			 }
({skipCurrentToken = false;}'Then'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleAndBlock returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "AndBlock");
			 }
(({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(0)));}temp_AndIdentifier=
ruleAndIdentifier{if (temp_AndIdentifier != null) {
  hasContent = true;
  ptm.setModelElement(temp_AndIdentifier);
  factory.set($result,"ai",convert(temp_AndIdentifier),false);
  ptm.ruleFinished(temp_AndIdentifier);
} else {
  ptm.destroyNode();
}
}
)

({ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)));}temp_AndDefinition=
ruleAndDefinition{if (temp_AndDefinition != null) {
  hasContent = true;
  ptm.setModelElement(temp_AndDefinition);
  factory.set($result,"and_def",convert(temp_AndDefinition),false);
  ptm.ruleFinished(temp_AndDefinition);
} else {
  ptm.destroyNode();
}
}
)
)
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleAndIdentifier returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "AndIdentifier");
			 }
({skipCurrentToken = false;}'And'{if (!skipCurrentToken) {
  hasContent = true;
  ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)));
  ptm.ruleFinished(getLastToken());
}})
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleGivenDefinition returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "GivenDefinition");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)));}temp_Word=
ruleWord{if (temp_Word != null) {
  hasContent = true;
  factory.add($result,"text",convert(temp_Word),false);
  ptm.ruleFinished(temp_Word);
} else {
  ptm.destroyNode();
}
}
)+
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleWhenDefinition returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "WhenDefinition");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(1)));}temp_Word=
ruleWord{if (temp_Word != null) {
  hasContent = true;
  factory.add($result,"text",convert(temp_Word),false);
  ptm.ruleFinished(temp_Word);
} else {
  ptm.destroyNode();
}
}
)+
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleThenDefinition returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "ThenDefinition");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(26)).eContents().get(1)));}temp_Word=
ruleWord{if (temp_Word != null) {
  hasContent = true;
  factory.add($result,"text",convert(temp_Word),false);
  ptm.ruleFinished(temp_Word);
} else {
  ptm.destroyNode();
}
}
)+
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleAndDefinition returns [EObject result]
@init {boolean hasContent = false;}
:
			{
				$result = factory.create("", "AndDefinition");
			 }
({ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(27)).eContents().get(1)));}temp_Word=
ruleWord{if (temp_Word != null) {
  hasContent = true;
  factory.add($result,"text",convert(temp_Word),false);
  ptm.ruleFinished(temp_Word);
} else {
  ptm.destroyNode();
}
}
)+
 {if (!hasContent)
  $result = null;};
catch [RecognitionException re] {if (!hasContent)
    $result = null;
reportError(re);
recover(input,re);}

ruleWord returns [String s] @init {StringBuffer buff = new StringBuffer(); boolean hasContent = false;} :
	 

(({skipCurrentToken = false;}
RULE_ID
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(0)));
  ptm.ruleFinished(temp);
  if (temp.getType() == CucumberFeatureLexer.RULE_ID)
    temp.setText((String) convert(temp));
  buff.append(temp.getText());
}}) |
({skipCurrentToken = false;}
RULE_STRING
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(1)));
  ptm.ruleFinished(temp);
  if (temp.getType() == CucumberFeatureLexer.RULE_ID)
    temp.setText((String) convert(temp));
  buff.append(temp.getText());
}}) |
({skipCurrentToken = false;}
RULE_INT
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(2)));
  ptm.ruleFinished(temp);
  if (temp.getType() == CucumberFeatureLexer.RULE_ID)
    temp.setText((String) convert(temp));
  buff.append(temp.getText());
}}) |
({skipCurrentToken = false;}
RULE_NotInorderto
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(3)));
  ptm.ruleFinished(temp);
  if (temp.getType() == CucumberFeatureLexer.RULE_ID)
    temp.setText((String) convert(temp));
  buff.append(temp.getText());
}}) |
({skipCurrentToken = false;}
RULE_NotAsa
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(4)));
  ptm.ruleFinished(temp);
  if (temp.getType() == CucumberFeatureLexer.RULE_ID)
    temp.setText((String) convert(temp));
  buff.append(temp.getText());
}}) |
({skipCurrentToken = false;}
RULE_NotIwantto
{if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(5)));
  ptm.ruleFinished(temp);
  if (temp.getType() == CucumberFeatureLexer.RULE_ID)
    temp.setText((String) convert(temp));
  buff.append(temp.getText());
}}) |
(	{skipCurrentToken = false;}	'.' {if (!skipCurrentToken) {
  hasContent = true;
  Token temp = getLastToken();
  ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(6)));
  ptm.ruleFinished(temp);
  buff.append(temp.getText());
}}
))

{if (hasContent)
  $s =buff.toString();}
;
catch [RecognitionException re] {if (hasContent)
$s =buff.toString();
reportError(re);
recover(input,re);}

RULE_NotInorderto :

	 'In '(~'o')?|'In o'(~'r')?|'In or'(~'d')?|'In ord'(~'e')?|'In orde'(~'r')?| 'In order '(~'t')?|'In order t'(~'o')?
;

RULE_NotAsa :

	 'As '(~'a')?|'As a'(~'n')?
;

RULE_NotIwantto :

	 'I '(~'w')?|'I w'(~'a')?|'I wa'(~'n')?|'In wan'(~'t')?|'In want '(~'t')?|'In want t'(~'o')?
;

RULE_SL_COMMENT :

	 '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
;

RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

RULE_STRING :

	 '\"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\"') )* '\"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

RULE_INT :

	 ('-')?('0'..'9')+
	 
;

RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

