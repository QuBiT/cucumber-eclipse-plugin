// $ANTLR 3.0 ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g 2009-05-01 14:02:23

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



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class CucumberFeatureParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_BusinessValueIdentifier", "RULE_RoleIdentifier", "RULE_SomeActionIdentifier", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_NotInorderto", "RULE_NotAsa", "RULE_NotIwantto", "RULE_SL_COMMENT", "RULE_WS", "RULE_ML_COMMENT", "'Feature:'", "'Scenario:'", "'Given'", "'When'", "'Then'", "'And'", "'.'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_STRING=8;
    public static final int RULE_SomeActionIdentifier=6;
    public static final int RULE_NotIwantto=12;
    public static final int RULE_BusinessValueIdentifier=4;
    public static final int RULE_INT=9;
    public static final int RULE_RoleIdentifier=5;
    public static final int RULE_NotInorderto=10;
    public static final int RULE_WS=14;
    public static final int RULE_SL_COMMENT=13;
    public static final int EOF=-1;
    public static final int RULE_NotAsa=11;
    public static final int RULE_ML_COMMENT=15;

        public CucumberFeatureParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[46+1];
         }
        

    public String[] getTokenNames() { return tokenNames; }
    public String getGrammarFileName() { return "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g"; }



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



    // $ANTLR start parse
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:101:1: parse returns [Node r] : result= ruleCucumber EOF ;
    public Node parse() throws RecognitionException {
        Node r = null;
        int parse_StartIndex = input.index();
        EObject result = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 1) ) { return r; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:102:3: (result= ruleCucumber EOF )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:102:3: result= ruleCucumber EOF
            {
            pushFollow(FOLLOW_ruleCucumber_in_parse67);
            result=ruleCucumber();
            _fsp--;
            if (failed) return r;
            if ( backtracking==0 ) {

              if (result != null)
                ptm.setModelElement(result);
              r = ptm.getCurrent();
              ptm.ruleFinished(result);
            }
            match(input,EOF,FOLLOW_EOF_in_parse78); if (failed) return r;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 1, parse_StartIndex); }
        }
        return r;
    }
    // $ANTLR end parse


    // $ANTLR start ruleCucumber
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:112:1: ruleCucumber returns [EObject result] : (temp_Feature= ruleFeature ) ;
    public EObject ruleCucumber() throws RecognitionException {
        EObject result = null;
        int ruleCucumber_StartIndex = input.index();
        EObject temp_Feature = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:115:4: ( (temp_Feature= ruleFeature ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:115:4: (temp_Feature= ruleFeature )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Cucumber");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:118:1: (temp_Feature= ruleFeature )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:118:2: temp_Feature= ruleFeature
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(0)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleFeature_in_ruleCucumber106);
            temp_Feature=ruleFeature();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_Feature != null) {
                hasContent = true;
                ptm.setModelElement(temp_Feature);
                factory.set(result,"f",convert(temp_Feature),false);
                ptm.ruleFinished(temp_Feature);
              } else {
                ptm.destroyNode();
              }

            }

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 2, ruleCucumber_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleCucumber


    // $ANTLR start ruleFeature
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:136:1: ruleFeature returns [EObject result] : ( (temp_FeatureIdentifier= ruleFeatureIdentifier ) (temp_FeatureDescription= ruleFeatureDescription ) (temp_BusinessValueDefinition= ruleBusinessValueDefinition ) (temp_RoleDefinition= ruleRoleDefinition ) (temp_SomeActionDefinition= ruleSomeActionDefinition ) (temp_Scenario= ruleScenario )* ) ;
    public EObject ruleFeature() throws RecognitionException {
        EObject result = null;
        int ruleFeature_StartIndex = input.index();
        EObject temp_FeatureIdentifier = null;

        EObject temp_FeatureDescription = null;

        EObject temp_BusinessValueDefinition = null;

        EObject temp_RoleDefinition = null;

        EObject temp_SomeActionDefinition = null;

        EObject temp_Scenario = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:139:4: ( ( (temp_FeatureIdentifier= ruleFeatureIdentifier ) (temp_FeatureDescription= ruleFeatureDescription ) (temp_BusinessValueDefinition= ruleBusinessValueDefinition ) (temp_RoleDefinition= ruleRoleDefinition ) (temp_SomeActionDefinition= ruleSomeActionDefinition ) (temp_Scenario= ruleScenario )* ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:139:4: ( (temp_FeatureIdentifier= ruleFeatureIdentifier ) (temp_FeatureDescription= ruleFeatureDescription ) (temp_BusinessValueDefinition= ruleBusinessValueDefinition ) (temp_RoleDefinition= ruleRoleDefinition ) (temp_SomeActionDefinition= ruleSomeActionDefinition ) (temp_Scenario= ruleScenario )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Feature");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:142:1: ( (temp_FeatureIdentifier= ruleFeatureIdentifier ) (temp_FeatureDescription= ruleFeatureDescription ) (temp_BusinessValueDefinition= ruleBusinessValueDefinition ) (temp_RoleDefinition= ruleRoleDefinition ) (temp_SomeActionDefinition= ruleSomeActionDefinition ) (temp_Scenario= ruleScenario )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:142:2: (temp_FeatureIdentifier= ruleFeatureIdentifier ) (temp_FeatureDescription= ruleFeatureDescription ) (temp_BusinessValueDefinition= ruleBusinessValueDefinition ) (temp_RoleDefinition= ruleRoleDefinition ) (temp_SomeActionDefinition= ruleSomeActionDefinition ) (temp_Scenario= ruleScenario )*
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:142:2: (temp_FeatureIdentifier= ruleFeatureIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:142:3: temp_FeatureIdentifier= ruleFeatureIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleFeatureIdentifier_in_ruleFeature146);
            temp_FeatureIdentifier=ruleFeatureIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_FeatureIdentifier != null) {
                hasContent = true;
                ptm.setModelElement(temp_FeatureIdentifier);
                factory.set(result,"fi",convert(temp_FeatureIdentifier),false);
                ptm.ruleFinished(temp_FeatureIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:154:1: (temp_FeatureDescription= ruleFeatureDescription )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:154:2: temp_FeatureDescription= ruleFeatureDescription
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleFeatureDescription_in_ruleFeature157);
            temp_FeatureDescription=ruleFeatureDescription();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_FeatureDescription != null) {
                hasContent = true;
                ptm.setModelElement(temp_FeatureDescription);
                factory.set(result,"fd",convert(temp_FeatureDescription),false);
                ptm.ruleFinished(temp_FeatureDescription);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:166:1: (temp_BusinessValueDefinition= ruleBusinessValueDefinition )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:166:2: temp_BusinessValueDefinition= ruleBusinessValueDefinition
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)));
            }
            pushFollow(FOLLOW_ruleBusinessValueDefinition_in_ruleFeature168);
            temp_BusinessValueDefinition=ruleBusinessValueDefinition();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_BusinessValueDefinition != null) {
                hasContent = true;
                ptm.setModelElement(temp_BusinessValueDefinition);
                factory.set(result,"bvd",convert(temp_BusinessValueDefinition),false);
                ptm.ruleFinished(temp_BusinessValueDefinition);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:178:1: (temp_RoleDefinition= ruleRoleDefinition )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:178:2: temp_RoleDefinition= ruleRoleDefinition
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)));
            }
            pushFollow(FOLLOW_ruleRoleDefinition_in_ruleFeature179);
            temp_RoleDefinition=ruleRoleDefinition();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_RoleDefinition != null) {
                hasContent = true;
                ptm.setModelElement(temp_RoleDefinition);
                factory.set(result,"rd",convert(temp_RoleDefinition),false);
                ptm.ruleFinished(temp_RoleDefinition);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:190:1: (temp_SomeActionDefinition= ruleSomeActionDefinition )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:190:2: temp_SomeActionDefinition= ruleSomeActionDefinition
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)));
            }
            pushFollow(FOLLOW_ruleSomeActionDefinition_in_ruleFeature190);
            temp_SomeActionDefinition=ruleSomeActionDefinition();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_SomeActionDefinition != null) {
                hasContent = true;
                ptm.setModelElement(temp_SomeActionDefinition);
                factory.set(result,"sad",convert(temp_SomeActionDefinition),false);
                ptm.ruleFinished(temp_SomeActionDefinition);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:202:1: (temp_Scenario= ruleScenario )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==17) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:202:2: temp_Scenario= ruleScenario
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(5)));
            	    }
            	    pushFollow(FOLLOW_ruleScenario_in_ruleFeature201);
            	    temp_Scenario=ruleScenario();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Scenario != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_Scenario);
            	        factory.add(result,"ss",convert(temp_Scenario),false);
            	        ptm.ruleFinished(temp_Scenario);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 3, ruleFeature_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFeature


    // $ANTLR start ruleFeatureIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:221:1: ruleFeatureIdentifier returns [EObject result] : ( 'Feature:' ) ;
    public EObject ruleFeatureIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleFeatureIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:224:4: ( ( 'Feature:' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:224:4: ( 'Feature:' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FeatureIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:227:1: ( 'Feature:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:227:2: 'Feature:'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleFeatureIdentifier240); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 4, ruleFeatureIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFeatureIdentifier


    // $ANTLR start ruleFeatureDescription
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:239:1: ruleFeatureDescription returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleFeatureDescription() throws RecognitionException {
        EObject result = null;
        int ruleFeatureDescription_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:242:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:242:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FeatureDescription");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:245:1: (temp_Word= ruleWord )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=RULE_ID && LA2_0<=RULE_NotIwantto)||LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:245:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleFeatureDescription278);
            	    temp_Word=ruleWord();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Word != null) {
            	        hasContent = true;
            	        factory.add(result,"text",convert(temp_Word),false);
            	        ptm.ruleFinished(temp_Word);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 5, ruleFeatureDescription_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFeatureDescription


    // $ANTLR start ruleBusinessValueDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:262:1: ruleBusinessValueDefinition returns [EObject result] : ( ( RULE_BusinessValueIdentifier ) (temp_BusinessValueDescription= ruleBusinessValueDescription ) ) ;
    public EObject ruleBusinessValueDefinition() throws RecognitionException {
        EObject result = null;
        int ruleBusinessValueDefinition_StartIndex = input.index();
        EObject temp_BusinessValueDescription = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:265:4: ( ( ( RULE_BusinessValueIdentifier ) (temp_BusinessValueDescription= ruleBusinessValueDescription ) ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:265:4: ( ( RULE_BusinessValueIdentifier ) (temp_BusinessValueDescription= ruleBusinessValueDescription ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessValueDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:268:1: ( ( RULE_BusinessValueIdentifier ) (temp_BusinessValueDescription= ruleBusinessValueDescription ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:268:2: ( RULE_BusinessValueIdentifier ) (temp_BusinessValueDescription= ruleBusinessValueDescription )
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:268:2: ( RULE_BusinessValueIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:268:3: RULE_BusinessValueIdentifier
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_BusinessValueIdentifier,FOLLOW_RULE_BusinessValueIdentifier_in_ruleBusinessValueDefinition317); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(0)));
                factory.set(result,"bv",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:278:1: (temp_BusinessValueDescription= ruleBusinessValueDescription )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:278:2: temp_BusinessValueDescription= ruleBusinessValueDescription
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleBusinessValueDescription_in_ruleBusinessValueDefinition328);
            temp_BusinessValueDescription=ruleBusinessValueDescription();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_BusinessValueDescription != null) {
                hasContent = true;
                ptm.setModelElement(temp_BusinessValueDescription);
                factory.set(result,"bv_desc",convert(temp_BusinessValueDescription),false);
                ptm.ruleFinished(temp_BusinessValueDescription);
              } else {
                ptm.destroyNode();
              }

            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 6, ruleBusinessValueDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBusinessValueDefinition


    // $ANTLR start ruleBusinessValueDescription
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:302:1: ruleBusinessValueDescription returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleBusinessValueDescription() throws RecognitionException {
        EObject result = null;
        int ruleBusinessValueDescription_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:305:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:305:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessValueDescription");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:308:1: (temp_Word= ruleWord )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_ID && LA3_0<=RULE_NotIwantto)||LA3_0==22) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:308:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleBusinessValueDescription381);
            	    temp_Word=ruleWord();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Word != null) {
            	        hasContent = true;
            	        factory.add(result,"text",convert(temp_Word),false);
            	        ptm.ruleFinished(temp_Word);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 7, ruleBusinessValueDescription_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBusinessValueDescription


    // $ANTLR start ruleRoleDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:325:1: ruleRoleDefinition returns [EObject result] : ( ( RULE_RoleIdentifier ) (temp_RoleDescription= ruleRoleDescription ) ) ;
    public EObject ruleRoleDefinition() throws RecognitionException {
        EObject result = null;
        int ruleRoleDefinition_StartIndex = input.index();
        EObject temp_RoleDescription = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:328:4: ( ( ( RULE_RoleIdentifier ) (temp_RoleDescription= ruleRoleDescription ) ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:328:4: ( ( RULE_RoleIdentifier ) (temp_RoleDescription= ruleRoleDescription ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "RoleDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:331:1: ( ( RULE_RoleIdentifier ) (temp_RoleDescription= ruleRoleDescription ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:331:2: ( RULE_RoleIdentifier ) (temp_RoleDescription= ruleRoleDescription )
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:331:2: ( RULE_RoleIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:331:3: RULE_RoleIdentifier
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_RoleIdentifier,FOLLOW_RULE_RoleIdentifier_in_ruleRoleDefinition420); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(0)));
                factory.set(result,"ri",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:341:1: (temp_RoleDescription= ruleRoleDescription )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:341:2: temp_RoleDescription= ruleRoleDescription
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleRoleDescription_in_ruleRoleDefinition431);
            temp_RoleDescription=ruleRoleDescription();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_RoleDescription != null) {
                hasContent = true;
                ptm.setModelElement(temp_RoleDescription);
                factory.set(result,"role_desc",convert(temp_RoleDescription),false);
                ptm.ruleFinished(temp_RoleDescription);
              } else {
                ptm.destroyNode();
              }

            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 8, ruleRoleDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleRoleDefinition


    // $ANTLR start ruleRoleDescription
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:365:1: ruleRoleDescription returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleRoleDescription() throws RecognitionException {
        EObject result = null;
        int ruleRoleDescription_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:368:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:368:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "RoleDescription");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:371:1: (temp_Word= ruleWord )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_ID && LA4_0<=RULE_NotIwantto)||LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:371:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleRoleDescription486);
            	    temp_Word=ruleWord();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Word != null) {
            	        hasContent = true;
            	        factory.add(result,"text",convert(temp_Word),false);
            	        ptm.ruleFinished(temp_Word);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 9, ruleRoleDescription_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleRoleDescription


    // $ANTLR start ruleSomeActionDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:388:1: ruleSomeActionDefinition returns [EObject result] : ( ( RULE_SomeActionIdentifier ) (temp_SomeActionDescription= ruleSomeActionDescription ) ) ;
    public EObject ruleSomeActionDefinition() throws RecognitionException {
        EObject result = null;
        int ruleSomeActionDefinition_StartIndex = input.index();
        EObject temp_SomeActionDescription = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:391:4: ( ( ( RULE_SomeActionIdentifier ) (temp_SomeActionDescription= ruleSomeActionDescription ) ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:391:4: ( ( RULE_SomeActionIdentifier ) (temp_SomeActionDescription= ruleSomeActionDescription ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "SomeActionDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:394:1: ( ( RULE_SomeActionIdentifier ) (temp_SomeActionDescription= ruleSomeActionDescription ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:394:2: ( RULE_SomeActionIdentifier ) (temp_SomeActionDescription= ruleSomeActionDescription )
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:394:2: ( RULE_SomeActionIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:394:3: RULE_SomeActionIdentifier
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,RULE_SomeActionIdentifier,FOLLOW_RULE_SomeActionIdentifier_in_ruleSomeActionDefinition525); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                Token temp = getLastToken();
                ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(0)));
                factory.set(result,"sa",convert(temp),false);
                ptm.ruleFinished(temp);
              }
            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:404:1: (temp_SomeActionDescription= ruleSomeActionDescription )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:404:2: temp_SomeActionDescription= ruleSomeActionDescription
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(10)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleSomeActionDescription_in_ruleSomeActionDefinition536);
            temp_SomeActionDescription=ruleSomeActionDescription();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_SomeActionDescription != null) {
                hasContent = true;
                ptm.setModelElement(temp_SomeActionDescription);
                factory.set(result,"sa_desc",convert(temp_SomeActionDescription),false);
                ptm.ruleFinished(temp_SomeActionDescription);
              } else {
                ptm.destroyNode();
              }

            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 10, ruleSomeActionDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleSomeActionDefinition


    // $ANTLR start ruleSomeActionDescription
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:428:1: ruleSomeActionDescription returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleSomeActionDescription() throws RecognitionException {
        EObject result = null;
        int ruleSomeActionDescription_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:431:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:431:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "SomeActionDescription");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:434:1: (temp_Word= ruleWord )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_ID && LA5_0<=RULE_NotIwantto)||LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:434:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleSomeActionDescription589);
            	    temp_Word=ruleWord();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Word != null) {
            	        hasContent = true;
            	        factory.add(result,"text",convert(temp_Word),false);
            	        ptm.ruleFinished(temp_Word);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 11, ruleSomeActionDescription_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleSomeActionDescription


    // $ANTLR start ruleScenario
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:451:1: ruleScenario returns [EObject result] : ( (temp_ScenarioIdentifier= ruleScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock ) (temp_WhenBlock= ruleWhenBlock ) (temp_ThenBlock= ruleThenBlock ) ) ;
    public EObject ruleScenario() throws RecognitionException {
        EObject result = null;
        int ruleScenario_StartIndex = input.index();
        EObject temp_ScenarioIdentifier = null;

        EObject temp_ScenarioDescription = null;

        EObject temp_GivenBlock = null;

        EObject temp_WhenBlock = null;

        EObject temp_ThenBlock = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:454:4: ( ( (temp_ScenarioIdentifier= ruleScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock ) (temp_WhenBlock= ruleWhenBlock ) (temp_ThenBlock= ruleThenBlock ) ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:454:4: ( (temp_ScenarioIdentifier= ruleScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock ) (temp_WhenBlock= ruleWhenBlock ) (temp_ThenBlock= ruleThenBlock ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Scenario");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:457:1: ( (temp_ScenarioIdentifier= ruleScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock ) (temp_WhenBlock= ruleWhenBlock ) (temp_ThenBlock= ruleThenBlock ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:457:2: (temp_ScenarioIdentifier= ruleScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock ) (temp_WhenBlock= ruleWhenBlock ) (temp_ThenBlock= ruleThenBlock )
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:457:2: (temp_ScenarioIdentifier= ruleScenarioIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:457:3: temp_ScenarioIdentifier= ruleScenarioIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleScenarioIdentifier_in_ruleScenario630);
            temp_ScenarioIdentifier=ruleScenarioIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_ScenarioIdentifier != null) {
                hasContent = true;
                ptm.setModelElement(temp_ScenarioIdentifier);
                factory.set(result,"si",convert(temp_ScenarioIdentifier),false);
                ptm.ruleFinished(temp_ScenarioIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:469:1: (temp_ScenarioDescription= ruleScenarioDescription )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:469:2: temp_ScenarioDescription= ruleScenarioDescription
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleScenarioDescription_in_ruleScenario641);
            temp_ScenarioDescription=ruleScenarioDescription();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_ScenarioDescription != null) {
                hasContent = true;
                ptm.setModelElement(temp_ScenarioDescription);
                factory.set(result,"sd",convert(temp_ScenarioDescription),false);
                ptm.ruleFinished(temp_ScenarioDescription);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:481:1: (temp_GivenBlock= ruleGivenBlock )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:481:2: temp_GivenBlock= ruleGivenBlock
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(2)));
            }
            pushFollow(FOLLOW_ruleGivenBlock_in_ruleScenario652);
            temp_GivenBlock=ruleGivenBlock();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_GivenBlock != null) {
                hasContent = true;
                ptm.setModelElement(temp_GivenBlock);
                factory.set(result,"gb",convert(temp_GivenBlock),false);
                ptm.ruleFinished(temp_GivenBlock);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:493:1: (temp_WhenBlock= ruleWhenBlock )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:493:2: temp_WhenBlock= ruleWhenBlock
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(3)));
            }
            pushFollow(FOLLOW_ruleWhenBlock_in_ruleScenario663);
            temp_WhenBlock=ruleWhenBlock();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_WhenBlock != null) {
                hasContent = true;
                ptm.setModelElement(temp_WhenBlock);
                factory.set(result,"wb",convert(temp_WhenBlock),false);
                ptm.ruleFinished(temp_WhenBlock);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:505:1: (temp_ThenBlock= ruleThenBlock )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:505:2: temp_ThenBlock= ruleThenBlock
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)).eContents().get(4)));
            }
            pushFollow(FOLLOW_ruleThenBlock_in_ruleScenario674);
            temp_ThenBlock=ruleThenBlock();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_ThenBlock != null) {
                hasContent = true;
                ptm.setModelElement(temp_ThenBlock);
                factory.set(result,"tb",convert(temp_ThenBlock),false);
                ptm.ruleFinished(temp_ThenBlock);
              } else {
                ptm.destroyNode();
              }

            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, ruleScenario_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleScenario


    // $ANTLR start ruleScenarioIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:524:1: ruleScenarioIdentifier returns [EObject result] : ( 'Scenario:' ) ;
    public EObject ruleScenarioIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleScenarioIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:527:4: ( ( 'Scenario:' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:527:4: ( 'Scenario:' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ScenarioIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:530:1: ( 'Scenario:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:530:2: 'Scenario:'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,17,FOLLOW_17_in_ruleScenarioIdentifier712); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 13, ruleScenarioIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleScenarioIdentifier


    // $ANTLR start ruleScenarioDescription
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:542:1: ruleScenarioDescription returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleScenarioDescription() throws RecognitionException {
        EObject result = null;
        int ruleScenarioDescription_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:545:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:545:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ScenarioDescription");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:548:1: (temp_Word= ruleWord )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_NotIwantto)||LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:548:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleScenarioDescription750);
            	    temp_Word=ruleWord();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Word != null) {
            	        hasContent = true;
            	        factory.add(result,"text",convert(temp_Word),false);
            	        ptm.ruleFinished(temp_Word);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 14, ruleScenarioDescription_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleScenarioDescription


    // $ANTLR start ruleGivenBlock
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:565:1: ruleGivenBlock returns [EObject result] : ( (temp_GivenIdentifier= ruleGivenIdentifier ) (temp_GivenDefinition= ruleGivenDefinition ) (temp_AndBlock= ruleAndBlock )* ) ;
    public EObject ruleGivenBlock() throws RecognitionException {
        EObject result = null;
        int ruleGivenBlock_StartIndex = input.index();
        EObject temp_GivenIdentifier = null;

        EObject temp_GivenDefinition = null;

        EObject temp_AndBlock = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:568:4: ( ( (temp_GivenIdentifier= ruleGivenIdentifier ) (temp_GivenDefinition= ruleGivenDefinition ) (temp_AndBlock= ruleAndBlock )* ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:568:4: ( (temp_GivenIdentifier= ruleGivenIdentifier ) (temp_GivenDefinition= ruleGivenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "GivenBlock");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:571:1: ( (temp_GivenIdentifier= ruleGivenIdentifier ) (temp_GivenDefinition= ruleGivenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:571:2: (temp_GivenIdentifier= ruleGivenIdentifier ) (temp_GivenDefinition= ruleGivenDefinition ) (temp_AndBlock= ruleAndBlock )*
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:571:2: (temp_GivenIdentifier= ruleGivenIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:571:3: temp_GivenIdentifier= ruleGivenIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleGivenIdentifier_in_ruleGivenBlock791);
            temp_GivenIdentifier=ruleGivenIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_GivenIdentifier != null) {
                hasContent = true;
                ptm.setModelElement(temp_GivenIdentifier);
                factory.set(result,"gi",convert(temp_GivenIdentifier),false);
                ptm.ruleFinished(temp_GivenIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:583:1: (temp_GivenDefinition= ruleGivenDefinition )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:583:2: temp_GivenDefinition= ruleGivenDefinition
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleGivenDefinition_in_ruleGivenBlock802);
            temp_GivenDefinition=ruleGivenDefinition();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_GivenDefinition != null) {
                hasContent = true;
                ptm.setModelElement(temp_GivenDefinition);
                factory.set(result,"given_def",convert(temp_GivenDefinition),false);
                ptm.ruleFinished(temp_GivenDefinition);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:595:1: (temp_AndBlock= ruleAndBlock )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==21) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:595:2: temp_AndBlock= ruleAndBlock
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)).eContents().get(2)));
            	    }
            	    pushFollow(FOLLOW_ruleAndBlock_in_ruleGivenBlock813);
            	    temp_AndBlock=ruleAndBlock();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_AndBlock != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_AndBlock);
            	        factory.add(result,"ab",convert(temp_AndBlock),false);
            	        ptm.ruleFinished(temp_AndBlock);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 15, ruleGivenBlock_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleGivenBlock


    // $ANTLR start ruleGivenIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:614:1: ruleGivenIdentifier returns [EObject result] : ( 'Given' ) ;
    public EObject ruleGivenIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleGivenIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:617:4: ( ( 'Given' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:617:4: ( 'Given' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "GivenIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:620:1: ( 'Given' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:620:2: 'Given'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleGivenIdentifier852); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 16, ruleGivenIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleGivenIdentifier


    // $ANTLR start ruleWhenBlock
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:632:1: ruleWhenBlock returns [EObject result] : ( (temp_WhenIdentifier= ruleWhenIdentifier ) (temp_WhenDefinition= ruleWhenDefinition ) (temp_AndBlock= ruleAndBlock )* ) ;
    public EObject ruleWhenBlock() throws RecognitionException {
        EObject result = null;
        int ruleWhenBlock_StartIndex = input.index();
        EObject temp_WhenIdentifier = null;

        EObject temp_WhenDefinition = null;

        EObject temp_AndBlock = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:635:4: ( ( (temp_WhenIdentifier= ruleWhenIdentifier ) (temp_WhenDefinition= ruleWhenDefinition ) (temp_AndBlock= ruleAndBlock )* ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:635:4: ( (temp_WhenIdentifier= ruleWhenIdentifier ) (temp_WhenDefinition= ruleWhenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "WhenBlock");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:638:1: ( (temp_WhenIdentifier= ruleWhenIdentifier ) (temp_WhenDefinition= ruleWhenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:638:2: (temp_WhenIdentifier= ruleWhenIdentifier ) (temp_WhenDefinition= ruleWhenDefinition ) (temp_AndBlock= ruleAndBlock )*
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:638:2: (temp_WhenIdentifier= ruleWhenIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:638:3: temp_WhenIdentifier= ruleWhenIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleWhenIdentifier_in_ruleWhenBlock891);
            temp_WhenIdentifier=ruleWhenIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_WhenIdentifier != null) {
                hasContent = true;
                ptm.setModelElement(temp_WhenIdentifier);
                factory.set(result,"wi",convert(temp_WhenIdentifier),false);
                ptm.ruleFinished(temp_WhenIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:650:1: (temp_WhenDefinition= ruleWhenDefinition )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:650:2: temp_WhenDefinition= ruleWhenDefinition
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleWhenDefinition_in_ruleWhenBlock902);
            temp_WhenDefinition=ruleWhenDefinition();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_WhenDefinition != null) {
                hasContent = true;
                ptm.setModelElement(temp_WhenDefinition);
                factory.set(result,"when_def",convert(temp_WhenDefinition),false);
                ptm.ruleFinished(temp_WhenDefinition);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:662:1: (temp_AndBlock= ruleAndBlock )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==21) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:662:2: temp_AndBlock= ruleAndBlock
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)).eContents().get(2)));
            	    }
            	    pushFollow(FOLLOW_ruleAndBlock_in_ruleWhenBlock913);
            	    temp_AndBlock=ruleAndBlock();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_AndBlock != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_AndBlock);
            	        factory.add(result,"ab",convert(temp_AndBlock),false);
            	        ptm.ruleFinished(temp_AndBlock);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 17, ruleWhenBlock_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleWhenBlock


    // $ANTLR start ruleWhenIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:681:1: ruleWhenIdentifier returns [EObject result] : ( 'When' ) ;
    public EObject ruleWhenIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleWhenIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:684:4: ( ( 'When' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:684:4: ( 'When' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "WhenIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:687:1: ( 'When' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:687:2: 'When'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,19,FOLLOW_19_in_ruleWhenIdentifier952); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 18, ruleWhenIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleWhenIdentifier


    // $ANTLR start ruleThenBlock
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:699:1: ruleThenBlock returns [EObject result] : ( (temp_ThenIdentifier= ruleThenIdentifier ) (temp_ThenDefinition= ruleThenDefinition ) (temp_AndBlock= ruleAndBlock )* ) ;
    public EObject ruleThenBlock() throws RecognitionException {
        EObject result = null;
        int ruleThenBlock_StartIndex = input.index();
        EObject temp_ThenIdentifier = null;

        EObject temp_ThenDefinition = null;

        EObject temp_AndBlock = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:702:4: ( ( (temp_ThenIdentifier= ruleThenIdentifier ) (temp_ThenDefinition= ruleThenDefinition ) (temp_AndBlock= ruleAndBlock )* ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:702:4: ( (temp_ThenIdentifier= ruleThenIdentifier ) (temp_ThenDefinition= ruleThenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ThenBlock");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:705:1: ( (temp_ThenIdentifier= ruleThenIdentifier ) (temp_ThenDefinition= ruleThenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:705:2: (temp_ThenIdentifier= ruleThenIdentifier ) (temp_ThenDefinition= ruleThenDefinition ) (temp_AndBlock= ruleAndBlock )*
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:705:2: (temp_ThenIdentifier= ruleThenIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:705:3: temp_ThenIdentifier= ruleThenIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleThenIdentifier_in_ruleThenBlock991);
            temp_ThenIdentifier=ruleThenIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_ThenIdentifier != null) {
                hasContent = true;
                ptm.setModelElement(temp_ThenIdentifier);
                factory.set(result,"ti",convert(temp_ThenIdentifier),false);
                ptm.ruleFinished(temp_ThenIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:717:1: (temp_ThenDefinition= ruleThenDefinition )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:717:2: temp_ThenDefinition= ruleThenDefinition
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleThenDefinition_in_ruleThenBlock1002);
            temp_ThenDefinition=ruleThenDefinition();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_ThenDefinition != null) {
                hasContent = true;
                ptm.setModelElement(temp_ThenDefinition);
                factory.set(result,"then_def",convert(temp_ThenDefinition),false);
                ptm.ruleFinished(temp_ThenDefinition);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:729:1: (temp_AndBlock= ruleAndBlock )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==21) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:729:2: temp_AndBlock= ruleAndBlock
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(2)));
            	    }
            	    pushFollow(FOLLOW_ruleAndBlock_in_ruleThenBlock1013);
            	    temp_AndBlock=ruleAndBlock();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_AndBlock != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_AndBlock);
            	        factory.add(result,"ab",convert(temp_AndBlock),false);
            	        ptm.ruleFinished(temp_AndBlock);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 19, ruleThenBlock_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleThenBlock


    // $ANTLR start ruleThenIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:748:1: ruleThenIdentifier returns [EObject result] : ( 'Then' ) ;
    public EObject ruleThenIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleThenIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:751:4: ( ( 'Then' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:751:4: ( 'Then' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ThenIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:754:1: ( 'Then' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:754:2: 'Then'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,20,FOLLOW_20_in_ruleThenIdentifier1052); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(21)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 20, ruleThenIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleThenIdentifier


    // $ANTLR start ruleAndBlock
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:766:1: ruleAndBlock returns [EObject result] : ( (temp_AndIdentifier= ruleAndIdentifier ) (temp_AndDefinition= ruleAndDefinition ) ) ;
    public EObject ruleAndBlock() throws RecognitionException {
        EObject result = null;
        int ruleAndBlock_StartIndex = input.index();
        EObject temp_AndIdentifier = null;

        EObject temp_AndDefinition = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:769:4: ( ( (temp_AndIdentifier= ruleAndIdentifier ) (temp_AndDefinition= ruleAndDefinition ) ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:769:4: ( (temp_AndIdentifier= ruleAndIdentifier ) (temp_AndDefinition= ruleAndDefinition ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "AndBlock");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:772:1: ( (temp_AndIdentifier= ruleAndIdentifier ) (temp_AndDefinition= ruleAndDefinition ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:772:2: (temp_AndIdentifier= ruleAndIdentifier ) (temp_AndDefinition= ruleAndDefinition )
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:772:2: (temp_AndIdentifier= ruleAndIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:772:3: temp_AndIdentifier= ruleAndIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleAndIdentifier_in_ruleAndBlock1091);
            temp_AndIdentifier=ruleAndIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_AndIdentifier != null) {
                hasContent = true;
                ptm.setModelElement(temp_AndIdentifier);
                factory.set(result,"ai",convert(temp_AndIdentifier),false);
                ptm.ruleFinished(temp_AndIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:784:1: (temp_AndDefinition= ruleAndDefinition )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:784:2: temp_AndDefinition= ruleAndDefinition
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleAndDefinition_in_ruleAndBlock1102);
            temp_AndDefinition=ruleAndDefinition();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_AndDefinition != null) {
                hasContent = true;
                ptm.setModelElement(temp_AndDefinition);
                factory.set(result,"and_def",convert(temp_AndDefinition),false);
                ptm.ruleFinished(temp_AndDefinition);
              } else {
                ptm.destroyNode();
              }

            }

            }


            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 21, ruleAndBlock_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAndBlock


    // $ANTLR start ruleAndIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:803:1: ruleAndIdentifier returns [EObject result] : ( 'And' ) ;
    public EObject ruleAndIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleAndIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:806:4: ( ( 'And' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:806:4: ( 'And' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "AndIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:809:1: ( 'And' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:809:2: 'And'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,21,FOLLOW_21_in_ruleAndIdentifier1140); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(23)).eContents().get(1)));
                ptm.ruleFinished(getLastToken());
              }
            }

            }

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 22, ruleAndIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAndIdentifier


    // $ANTLR start ruleGivenDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:821:1: ruleGivenDefinition returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleGivenDefinition() throws RecognitionException {
        EObject result = null;
        int ruleGivenDefinition_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:824:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:824:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "GivenDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:827:1: (temp_Word= ruleWord )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_NotIwantto)||LA10_0==22) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:827:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleGivenDefinition1178);
            	    temp_Word=ruleWord();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Word != null) {
            	        hasContent = true;
            	        factory.add(result,"text",convert(temp_Word),false);
            	        ptm.ruleFinished(temp_Word);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 23, ruleGivenDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleGivenDefinition


    // $ANTLR start ruleWhenDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:844:1: ruleWhenDefinition returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleWhenDefinition() throws RecognitionException {
        EObject result = null;
        int ruleWhenDefinition_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:847:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:847:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "WhenDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:850:1: (temp_Word= ruleWord )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_ID && LA11_0<=RULE_NotIwantto)||LA11_0==22) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:850:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleWhenDefinition1218);
            	    temp_Word=ruleWord();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Word != null) {
            	        hasContent = true;
            	        factory.add(result,"text",convert(temp_Word),false);
            	        ptm.ruleFinished(temp_Word);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 24, ruleWhenDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleWhenDefinition


    // $ANTLR start ruleThenDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:867:1: ruleThenDefinition returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleThenDefinition() throws RecognitionException {
        EObject result = null;
        int ruleThenDefinition_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:870:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:870:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ThenDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:873:1: (temp_Word= ruleWord )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_NotIwantto)||LA12_0==22) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:873:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(26)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleThenDefinition1258);
            	    temp_Word=ruleWord();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Word != null) {
            	        hasContent = true;
            	        factory.add(result,"text",convert(temp_Word),false);
            	        ptm.ruleFinished(temp_Word);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 25, ruleThenDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleThenDefinition


    // $ANTLR start ruleAndDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:890:1: ruleAndDefinition returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleAndDefinition() throws RecognitionException {
        EObject result = null;
        int ruleAndDefinition_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:893:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:893:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "AndDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:896:1: (temp_Word= ruleWord )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_NotIwantto)||LA13_0==22) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:896:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(27)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleAndDefinition1298);
            	    temp_Word=ruleWord();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_Word != null) {
            	        hasContent = true;
            	        factory.add(result,"text",convert(temp_Word),false);
            	        ptm.ruleFinished(temp_Word);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            if ( backtracking==0 ) {
              if (!hasContent)
                result = null;
            }

            }

        }
        catch (RecognitionException re) {
            if (!hasContent)
                result = null;
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 26, ruleAndDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAndDefinition


    // $ANTLR start ruleWord
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:913:1: ruleWord returns [String s] : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_NotInorderto ) | ( RULE_NotAsa ) | ( RULE_NotIwantto ) | ( '.' ) ) ;
    public String ruleWord() throws RecognitionException {
        String s = null;
        int ruleWord_StartIndex = input.index();
        StringBuffer buff = new StringBuffer(); boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return s; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:916:1: ( ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_NotInorderto ) | ( RULE_NotAsa ) | ( RULE_NotIwantto ) | ( '.' ) ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:916:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_NotInorderto ) | ( RULE_NotAsa ) | ( RULE_NotIwantto ) | ( '.' ) )
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:916:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_NotInorderto ) | ( RULE_NotAsa ) | ( RULE_NotIwantto ) | ( '.' ) )
            int alt14=7;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt14=1;
                }
                break;
            case RULE_STRING:
                {
                alt14=2;
                }
                break;
            case RULE_INT:
                {
                alt14=3;
                }
                break;
            case RULE_NotInorderto:
                {
                alt14=4;
                }
                break;
            case RULE_NotAsa:
                {
                alt14=5;
                }
                break;
            case RULE_NotIwantto:
                {
                alt14=6;
                }
                break;
            case 22:
                {
                alt14=7;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("916:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( RULE_NotInorderto ) | ( RULE_NotAsa ) | ( RULE_NotIwantto ) | ( '.' ) )", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:916:2: ( RULE_ID )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:916:2: ( RULE_ID )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:916:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWord1336); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(0)));
                        ptm.ruleFinished(temp);
                        if (temp.getType() == CucumberFeatureLexer.RULE_ID)
                          temp.setText((String) convert(temp));
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;
                case 2 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:927:1: ( RULE_STRING )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:927:1: ( RULE_STRING )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:927:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWord1346); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(1)));
                        ptm.ruleFinished(temp);
                        if (temp.getType() == CucumberFeatureLexer.RULE_ID)
                          temp.setText((String) convert(temp));
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;
                case 3 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:938:1: ( RULE_INT )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:938:1: ( RULE_INT )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:938:2: RULE_INT
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWord1356); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(2)));
                        ptm.ruleFinished(temp);
                        if (temp.getType() == CucumberFeatureLexer.RULE_ID)
                          temp.setText((String) convert(temp));
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;
                case 4 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:949:1: ( RULE_NotInorderto )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:949:1: ( RULE_NotInorderto )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:949:2: RULE_NotInorderto
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_NotInorderto,FOLLOW_RULE_NotInorderto_in_ruleWord1366); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(3)));
                        ptm.ruleFinished(temp);
                        if (temp.getType() == CucumberFeatureLexer.RULE_ID)
                          temp.setText((String) convert(temp));
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;
                case 5 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:960:1: ( RULE_NotAsa )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:960:1: ( RULE_NotAsa )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:960:2: RULE_NotAsa
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_NotAsa,FOLLOW_RULE_NotAsa_in_ruleWord1376); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(4)));
                        ptm.ruleFinished(temp);
                        if (temp.getType() == CucumberFeatureLexer.RULE_ID)
                          temp.setText((String) convert(temp));
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;
                case 6 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:971:1: ( RULE_NotIwantto )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:971:1: ( RULE_NotIwantto )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:971:2: RULE_NotIwantto
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_NotIwantto,FOLLOW_RULE_NotIwantto_in_ruleWord1386); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(5)));
                        ptm.ruleFinished(temp);
                        if (temp.getType() == CucumberFeatureLexer.RULE_ID)
                          temp.setText((String) convert(temp));
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;
                case 7 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:982:1: ( '.' )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:982:1: ( '.' )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:982:3: '.'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,22,FOLLOW_22_in_ruleWord1397); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(0)).eContents().get(6)));
                        ptm.ruleFinished(temp);
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;

            }

            if ( backtracking==0 ) {
              if (hasContent)
                s =buff.toString();
            }

            }

        }
        catch (RecognitionException re) {
            if (hasContent)
            s =buff.toString();
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 27, ruleWord_StartIndex); }
        }
        return s;
    }
    // $ANTLR end ruleWord


 

    public static final BitSet FOLLOW_ruleCucumber_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleCucumber106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeatureIdentifier_in_ruleFeature146 = new BitSet(new long[]{0x0000000000401F80L});
    public static final BitSet FOLLOW_ruleFeatureDescription_in_ruleFeature157 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleBusinessValueDefinition_in_ruleFeature168 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRoleDefinition_in_ruleFeature179 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ruleSomeActionDefinition_in_ruleFeature190 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleFeature201 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_16_in_ruleFeatureIdentifier240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleFeatureDescription278 = new BitSet(new long[]{0x0000000000401F82L});
    public static final BitSet FOLLOW_RULE_BusinessValueIdentifier_in_ruleBusinessValueDefinition317 = new BitSet(new long[]{0x0000000000401F80L});
    public static final BitSet FOLLOW_ruleBusinessValueDescription_in_ruleBusinessValueDefinition328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleBusinessValueDescription381 = new BitSet(new long[]{0x0000000000401F82L});
    public static final BitSet FOLLOW_RULE_RoleIdentifier_in_ruleRoleDefinition420 = new BitSet(new long[]{0x0000000000401F80L});
    public static final BitSet FOLLOW_ruleRoleDescription_in_ruleRoleDefinition431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleRoleDescription486 = new BitSet(new long[]{0x0000000000401F82L});
    public static final BitSet FOLLOW_RULE_SomeActionIdentifier_in_ruleSomeActionDefinition525 = new BitSet(new long[]{0x0000000000401F80L});
    public static final BitSet FOLLOW_ruleSomeActionDescription_in_ruleSomeActionDefinition536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleSomeActionDescription589 = new BitSet(new long[]{0x0000000000401F82L});
    public static final BitSet FOLLOW_ruleScenarioIdentifier_in_ruleScenario630 = new BitSet(new long[]{0x0000000000401F80L});
    public static final BitSet FOLLOW_ruleScenarioDescription_in_ruleScenario641 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ruleGivenBlock_in_ruleScenario652 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_ruleScenario663 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleThenBlock_in_ruleScenario674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleScenarioIdentifier712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleScenarioDescription750 = new BitSet(new long[]{0x0000000000401F82L});
    public static final BitSet FOLLOW_ruleGivenIdentifier_in_ruleGivenBlock791 = new BitSet(new long[]{0x0000000000401F80L});
    public static final BitSet FOLLOW_ruleGivenDefinition_in_ruleGivenBlock802 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAndBlock_in_ruleGivenBlock813 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_18_in_ruleGivenIdentifier852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenIdentifier_in_ruleWhenBlock891 = new BitSet(new long[]{0x0000000000401F80L});
    public static final BitSet FOLLOW_ruleWhenDefinition_in_ruleWhenBlock902 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAndBlock_in_ruleWhenBlock913 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_19_in_ruleWhenIdentifier952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenIdentifier_in_ruleThenBlock991 = new BitSet(new long[]{0x0000000000401F80L});
    public static final BitSet FOLLOW_ruleThenDefinition_in_ruleThenBlock1002 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleAndBlock_in_ruleThenBlock1013 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_20_in_ruleThenIdentifier1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndIdentifier_in_ruleAndBlock1091 = new BitSet(new long[]{0x0000000000401F80L});
    public static final BitSet FOLLOW_ruleAndDefinition_in_ruleAndBlock1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleAndIdentifier1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleGivenDefinition1178 = new BitSet(new long[]{0x0000000000401F82L});
    public static final BitSet FOLLOW_ruleWord_in_ruleWhenDefinition1218 = new BitSet(new long[]{0x0000000000401F82L});
    public static final BitSet FOLLOW_ruleWord_in_ruleThenDefinition1258 = new BitSet(new long[]{0x0000000000401F82L});
    public static final BitSet FOLLOW_ruleWord_in_ruleAndDefinition1298 = new BitSet(new long[]{0x0000000000401F82L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWord1336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWord1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWord1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NotInorderto_in_ruleWord1366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NotAsa_in_ruleWord1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NotIwantto_in_ruleWord1386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleWord1397 = new BitSet(new long[]{0x0000000000000002L});

}