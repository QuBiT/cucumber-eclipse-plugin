// $ANTLR 3.0 ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g 2009-06-07 18:03:07

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ML_COMMENT", "'Feature:'", "'Background:'", "'Scenario Outline:'", "'Examples:'", "'Scenario:'", "'Given'", "'When'", "'Then'", "'And'", "'.'", "':'", "','", "'|'", "'<'", "'>'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_STRING=5;
    public static final int RULE_INT=6;
    public static final int RULE_WS=8;
    public static final int EOF=-1;
    public static final int RULE_SL_COMMENT=7;
    public static final int RULE_ML_COMMENT=9;

        public CucumberFeatureParser(TokenStream input) {
            super(input);
            ruleMemo = new HashMap[73+1];
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
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:112:1: ruleCucumber returns [EObject result] : (temp_Feature= ruleFeature )* ;
    public EObject ruleCucumber() throws RecognitionException {
        EObject result = null;
        int ruleCucumber_StartIndex = input.index();
        EObject temp_Feature = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 2) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:115:4: ( (temp_Feature= ruleFeature )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:115:4: (temp_Feature= ruleFeature )*
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Cucumber");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:118:1: (temp_Feature= ruleFeature )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==10) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
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
            	        factory.add(result,"f",convert(temp_Feature),false);
            	        ptm.ruleFinished(temp_Feature);
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
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:136:1: ruleFeature returns [EObject result] : ( (temp_FeatureIdentifier= ruleFeatureIdentifier ) (temp_FeatureDescription= ruleFeatureDescription ) (temp_FeatureBlock= ruleFeatureBlock ) (temp_Background= ruleBackground )? (temp_Scenario= ruleScenario )* ) ;
    public EObject ruleFeature() throws RecognitionException {
        EObject result = null;
        int ruleFeature_StartIndex = input.index();
        EObject temp_FeatureIdentifier = null;

        EObject temp_FeatureDescription = null;

        EObject temp_FeatureBlock = null;

        EObject temp_Background = null;

        EObject temp_Scenario = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 3) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:139:4: ( ( (temp_FeatureIdentifier= ruleFeatureIdentifier ) (temp_FeatureDescription= ruleFeatureDescription ) (temp_FeatureBlock= ruleFeatureBlock ) (temp_Background= ruleBackground )? (temp_Scenario= ruleScenario )* ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:139:4: ( (temp_FeatureIdentifier= ruleFeatureIdentifier ) (temp_FeatureDescription= ruleFeatureDescription ) (temp_FeatureBlock= ruleFeatureBlock ) (temp_Background= ruleBackground )? (temp_Scenario= ruleScenario )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Feature");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:142:1: ( (temp_FeatureIdentifier= ruleFeatureIdentifier ) (temp_FeatureDescription= ruleFeatureDescription ) (temp_FeatureBlock= ruleFeatureBlock ) (temp_Background= ruleBackground )? (temp_Scenario= ruleScenario )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:142:2: (temp_FeatureIdentifier= ruleFeatureIdentifier ) (temp_FeatureDescription= ruleFeatureDescription ) (temp_FeatureBlock= ruleFeatureBlock ) (temp_Background= ruleBackground )? (temp_Scenario= ruleScenario )*
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:142:2: (temp_FeatureIdentifier= ruleFeatureIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:142:3: temp_FeatureIdentifier= ruleFeatureIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleFeatureIdentifier_in_ruleFeature147);
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
            pushFollow(FOLLOW_ruleFeatureDescription_in_ruleFeature158);
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

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:166:1: (temp_FeatureBlock= ruleFeatureBlock )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:166:2: temp_FeatureBlock= ruleFeatureBlock
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(2)));
            }
            pushFollow(FOLLOW_ruleFeatureBlock_in_ruleFeature169);
            temp_FeatureBlock=ruleFeatureBlock();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_FeatureBlock != null) {
                hasContent = true;
                ptm.setModelElement(temp_FeatureBlock);
                factory.set(result,"fb",convert(temp_FeatureBlock),false);
                ptm.ruleFinished(temp_FeatureBlock);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:178:1: (temp_Background= ruleBackground )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:178:2: temp_Background= ruleBackground
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(3)));
                    }
                    pushFollow(FOLLOW_ruleBackground_in_ruleFeature180);
                    temp_Background=ruleBackground();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      if (temp_Background != null) {
                        hasContent = true;
                        ptm.setModelElement(temp_Background);
                        factory.set(result,"b",convert(temp_Background),false);
                        ptm.ruleFinished(temp_Background);
                      } else {
                        ptm.destroyNode();
                      }

                    }

                    }
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:190:1: (temp_Scenario= ruleScenario )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12||LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:190:2: temp_Scenario= ruleScenario
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(1)).eContents().get(1)).eContents().get(4)));
            	    }
            	    pushFollow(FOLLOW_ruleScenario_in_ruleFeature192);
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
            	    break loop3;
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


    // $ANTLR start ruleFeatureBlock
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:209:1: ruleFeatureBlock returns [EObject result] : ( (temp_BusinessValueDefinition= ruleBusinessValueDefinition )? (temp_RoleDefinition= ruleRoleDefinition )? (temp_SomeActionDefinition= ruleSomeActionDefinition )? ) ;
    public EObject ruleFeatureBlock() throws RecognitionException {
        EObject result = null;
        int ruleFeatureBlock_StartIndex = input.index();
        EObject temp_BusinessValueDefinition = null;

        EObject temp_RoleDefinition = null;

        EObject temp_SomeActionDefinition = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 4) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:212:4: ( ( (temp_BusinessValueDefinition= ruleBusinessValueDefinition )? (temp_RoleDefinition= ruleRoleDefinition )? (temp_SomeActionDefinition= ruleSomeActionDefinition )? ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:212:4: ( (temp_BusinessValueDefinition= ruleBusinessValueDefinition )? (temp_RoleDefinition= ruleRoleDefinition )? (temp_SomeActionDefinition= ruleSomeActionDefinition )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FeatureBlock");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:215:1: ( (temp_BusinessValueDefinition= ruleBusinessValueDefinition )? (temp_RoleDefinition= ruleRoleDefinition )? (temp_SomeActionDefinition= ruleSomeActionDefinition )? )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:215:2: (temp_BusinessValueDefinition= ruleBusinessValueDefinition )? (temp_RoleDefinition= ruleRoleDefinition )? (temp_SomeActionDefinition= ruleSomeActionDefinition )?
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:215:2: (temp_BusinessValueDefinition= ruleBusinessValueDefinition )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA4_1 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt4=1;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA4_2 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt4=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA4_3 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt4=1;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA4_4 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt4=1;
                    }
                    }
                    break;
                case 20:
                    {
                    int LA4_5 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt4=1;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA4_6 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt4=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA4_7 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt4=1;
                    }
                    }
                    break;
                case 23:
                    {
                    int LA4_8 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt4=1;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA4_9 = input.LA(2);

                    if ( (synpred4()) ) {
                        alt4=1;
                    }
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:215:3: temp_BusinessValueDefinition= ruleBusinessValueDefinition
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)));
                    }
                    pushFollow(FOLLOW_ruleBusinessValueDefinition_in_ruleFeatureBlock235);
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
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:227:1: (temp_RoleDefinition= ruleRoleDefinition )?
            int alt5=2;
            switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA5_1 = input.LA(2);

                    if ( (synpred5()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA5_2 = input.LA(2);

                    if ( (synpred5()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA5_3 = input.LA(2);

                    if ( (synpred5()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case 19:
                    {
                    int LA5_4 = input.LA(2);

                    if ( (synpred5()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case 20:
                    {
                    int LA5_5 = input.LA(2);

                    if ( (synpred5()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case 21:
                    {
                    int LA5_6 = input.LA(2);

                    if ( (synpred5()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case 22:
                    {
                    int LA5_7 = input.LA(2);

                    if ( (synpred5()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case 23:
                    {
                    int LA5_8 = input.LA(2);

                    if ( (synpred5()) ) {
                        alt5=1;
                    }
                    }
                    break;
                case 24:
                    {
                    int LA5_9 = input.LA(2);

                    if ( (synpred5()) ) {
                        alt5=1;
                    }
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:227:2: temp_RoleDefinition= ruleRoleDefinition
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)));
                    }
                    pushFollow(FOLLOW_ruleRoleDefinition_in_ruleFeatureBlock247);
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
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:239:1: (temp_SomeActionDefinition= ruleSomeActionDefinition )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_ID && LA6_0<=RULE_INT)||(LA6_0>=19 && LA6_0<=24)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:239:2: temp_SomeActionDefinition= ruleSomeActionDefinition
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleSomeActionDefinition_in_ruleFeatureBlock259);
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
                    break;

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
            if ( backtracking>0 ) { memoize(input, 4, ruleFeatureBlock_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFeatureBlock


    // $ANTLR start ruleFeatureIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:258:1: ruleFeatureIdentifier returns [EObject result] : ( 'Feature:' ) ;
    public EObject ruleFeatureIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleFeatureIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 5) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:261:4: ( ( 'Feature:' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:261:4: ( 'Feature:' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FeatureIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:264:1: ( 'Feature:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:264:2: 'Feature:'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,10,FOLLOW_10_in_ruleFeatureIdentifier298); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(3)).eContents().get(1)));
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
            if ( backtracking>0 ) { memoize(input, 5, ruleFeatureIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFeatureIdentifier


    // $ANTLR start ruleFeatureDescription
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:276:1: ruleFeatureDescription returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleFeatureDescription() throws RecognitionException {
        EObject result = null;
        int ruleFeatureDescription_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 6) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:279:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:279:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "FeatureDescription");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:282:1: (temp_Word= ruleWord )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA7_1 = input.LA(2);

                    if ( (synpred7()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    int LA7_2 = input.LA(2);

                    if ( (synpred7()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case RULE_INT:
                    {
                    int LA7_3 = input.LA(2);

                    if ( (synpred7()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA7_4 = input.LA(2);

                    if ( (synpred7()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA7_5 = input.LA(2);

                    if ( (synpred7()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA7_6 = input.LA(2);

                    if ( (synpred7()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA7_7 = input.LA(2);

                    if ( (synpred7()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA7_8 = input.LA(2);

                    if ( (synpred7()) ) {
                        alt7=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA7_9 = input.LA(2);

                    if ( (synpred7()) ) {
                        alt7=1;
                    }


                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:282:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleFeatureDescription336);
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
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
            if ( backtracking>0 ) { memoize(input, 6, ruleFeatureDescription_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleFeatureDescription


    // $ANTLR start ruleBusinessValueDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:299:1: ruleBusinessValueDefinition returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleBusinessValueDefinition() throws RecognitionException {
        EObject result = null;
        int ruleBusinessValueDefinition_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 7) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:302:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:302:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BusinessValueDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:305:1: (temp_Word= ruleWord )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA8_1 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    int LA8_2 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case RULE_INT:
                    {
                    int LA8_3 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA8_4 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA8_5 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA8_6 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA8_7 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA8_8 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA8_9 = input.LA(2);

                    if ( (synpred8()) ) {
                        alt8=1;
                    }


                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:305:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleBusinessValueDefinition376);
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
            	    if ( cnt8 >= 1 ) break loop8;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
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
            if ( backtracking>0 ) { memoize(input, 7, ruleBusinessValueDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBusinessValueDefinition


    // $ANTLR start ruleRoleDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:322:1: ruleRoleDefinition returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleRoleDefinition() throws RecognitionException {
        EObject result = null;
        int ruleRoleDefinition_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 8) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:325:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:325:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "RoleDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:328:1: (temp_Word= ruleWord )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA9_1 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    int LA9_2 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case RULE_INT:
                    {
                    int LA9_3 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA9_4 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA9_5 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA9_6 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA9_7 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA9_8 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt9=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA9_9 = input.LA(2);

                    if ( (synpred9()) ) {
                        alt9=1;
                    }


                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:328:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleRoleDefinition416);
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
            	    if ( cnt9 >= 1 ) break loop9;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
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
            if ( backtracking>0 ) { memoize(input, 8, ruleRoleDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleRoleDefinition


    // $ANTLR start ruleSomeActionDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:345:1: ruleSomeActionDefinition returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleSomeActionDefinition() throws RecognitionException {
        EObject result = null;
        int ruleSomeActionDefinition_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 9) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:348:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:348:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "SomeActionDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:351:1: (temp_Word= ruleWord )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>=RULE_ID && LA10_0<=RULE_INT)||(LA10_0>=19 && LA10_0<=24)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:351:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(7)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleSomeActionDefinition456);
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
            if ( backtracking>0 ) { memoize(input, 9, ruleSomeActionDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleSomeActionDefinition


    // $ANTLR start ruleBackground
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:368:1: ruleBackground returns [EObject result] : ( (temp_BackgroundIdentifier= ruleBackgroundIdentifier ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? ) ;
    public EObject ruleBackground() throws RecognitionException {
        EObject result = null;
        int ruleBackground_StartIndex = input.index();
        EObject temp_BackgroundIdentifier = null;

        EObject temp_GivenBlock = null;

        EObject temp_WhenBlock = null;

        EObject temp_ThenBlock = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 10) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:371:4: ( ( (temp_BackgroundIdentifier= ruleBackgroundIdentifier ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:371:4: ( (temp_BackgroundIdentifier= ruleBackgroundIdentifier ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "Background");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:374:1: ( (temp_BackgroundIdentifier= ruleBackgroundIdentifier ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:374:2: (temp_BackgroundIdentifier= ruleBackgroundIdentifier ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )?
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:374:2: (temp_BackgroundIdentifier= ruleBackgroundIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:374:3: temp_BackgroundIdentifier= ruleBackgroundIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleBackgroundIdentifier_in_ruleBackground497);
            temp_BackgroundIdentifier=ruleBackgroundIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_BackgroundIdentifier != null) {
                hasContent = true;
                ptm.setModelElement(temp_BackgroundIdentifier);
                factory.set(result,"bi",convert(temp_BackgroundIdentifier),false);
                ptm.ruleFinished(temp_BackgroundIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:386:1: (temp_GivenBlock= ruleGivenBlock )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==15) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:386:2: temp_GivenBlock= ruleGivenBlock
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(1)));
                    }
                    pushFollow(FOLLOW_ruleGivenBlock_in_ruleBackground508);
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
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:398:1: (temp_WhenBlock= ruleWhenBlock )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==16) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:398:2: temp_WhenBlock= ruleWhenBlock
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleWhenBlock_in_ruleBackground520);
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
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:410:1: (temp_ThenBlock= ruleThenBlock )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==17) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:410:2: temp_ThenBlock= ruleThenBlock
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(8)).eContents().get(1)).eContents().get(3)));
                    }
                    pushFollow(FOLLOW_ruleThenBlock_in_ruleBackground532);
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
                    break;

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
            if ( backtracking>0 ) { memoize(input, 10, ruleBackground_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBackground


    // $ANTLR start ruleBackgroundIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:429:1: ruleBackgroundIdentifier returns [EObject result] : ( 'Background:' ) ;
    public EObject ruleBackgroundIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleBackgroundIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 11) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:432:4: ( ( 'Background:' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:432:4: ( 'Background:' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BackgroundIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:435:1: ( 'Background:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:435:2: 'Background:'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,11,FOLLOW_11_in_ruleBackgroundIdentifier571); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(9)).eContents().get(1)));
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
            if ( backtracking>0 ) { memoize(input, 11, ruleBackgroundIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBackgroundIdentifier


    // $ANTLR start ruleScenario
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:447:1: ruleScenario returns [EObject result] : (temp_basicscenario= ruleBasicScenario | temp_tablescenario= ruleTableScenario );
    public EObject ruleScenario() throws RecognitionException {
        EObject result = null;
        int ruleScenario_StartIndex = input.index();
        EObject temp_basicscenario = null;

        EObject temp_tablescenario = null;


        try {
            if ( backtracking>0 && alreadyParsedRule(input, 12) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:449:9: (temp_basicscenario= ruleBasicScenario | temp_tablescenario= ruleTableScenario )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==14) ) {
                alt14=1;
            }
            else if ( (LA14_0==12) ) {
                alt14=2;
            }
            else {
                if (backtracking>0) {failed=true; return result;}
                NoViableAltException nvae =
                    new NoViableAltException("447:1: ruleScenario returns [EObject result] : (temp_basicscenario= ruleBasicScenario | temp_tablescenario= ruleTableScenario );", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:449:9: temp_basicscenario= ruleBasicScenario
                    {
                    pushFollow(FOLLOW_ruleBasicScenario_in_ruleScenario604);
                    temp_basicscenario=ruleBasicScenario();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_basicscenario;
                    }

                    }
                    break;
                case 2 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:449:85: temp_tablescenario= ruleTableScenario
                    {
                    pushFollow(FOLLOW_ruleTableScenario_in_ruleScenario619);
                    temp_tablescenario=ruleTableScenario();
                    _fsp--;
                    if (failed) return result;
                    if ( backtracking==0 ) {
                      result =temp_tablescenario;
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
            if ( backtracking>0 ) { memoize(input, 12, ruleScenario_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleScenario


    // $ANTLR start ruleBasicScenario
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:451:1: ruleBasicScenario returns [EObject result] : ( (temp_ScenarioIdentifier= ruleScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? ) ;
    public EObject ruleBasicScenario() throws RecognitionException {
        EObject result = null;
        int ruleBasicScenario_StartIndex = input.index();
        EObject temp_ScenarioIdentifier = null;

        EObject temp_ScenarioDescription = null;

        EObject temp_GivenBlock = null;

        EObject temp_WhenBlock = null;

        EObject temp_ThenBlock = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 13) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:454:4: ( ( (temp_ScenarioIdentifier= ruleScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:454:4: ( (temp_ScenarioIdentifier= ruleScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "BasicScenario");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:457:1: ( (temp_ScenarioIdentifier= ruleScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:457:2: (temp_ScenarioIdentifier= ruleScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )?
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:457:2: (temp_ScenarioIdentifier= ruleScenarioIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:457:3: temp_ScenarioIdentifier= ruleScenarioIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleScenarioIdentifier_in_ruleBasicScenario650);
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
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleScenarioDescription_in_ruleBasicScenario661);
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

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:481:1: (temp_GivenBlock= ruleGivenBlock )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==15) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:481:2: temp_GivenBlock= ruleGivenBlock
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleGivenBlock_in_ruleBasicScenario672);
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
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:493:1: (temp_WhenBlock= ruleWhenBlock )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==16) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:493:2: temp_WhenBlock= ruleWhenBlock
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(3)));
                    }
                    pushFollow(FOLLOW_ruleWhenBlock_in_ruleBasicScenario684);
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
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:505:1: (temp_ThenBlock= ruleThenBlock )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==17) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:505:2: temp_ThenBlock= ruleThenBlock
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(11)).eContents().get(1)).eContents().get(4)));
                    }
                    pushFollow(FOLLOW_ruleThenBlock_in_ruleBasicScenario696);
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
                    break;

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
            if ( backtracking>0 ) { memoize(input, 13, ruleBasicScenario_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleBasicScenario


    // $ANTLR start ruleTableScenario
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:524:1: ruleTableScenario returns [EObject result] : ( (temp_TableScenarioIdentifier= ruleTableScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? (temp_TableBlock= ruleTableBlock ) ) ;
    public EObject ruleTableScenario() throws RecognitionException {
        EObject result = null;
        int ruleTableScenario_StartIndex = input.index();
        EObject temp_TableScenarioIdentifier = null;

        EObject temp_ScenarioDescription = null;

        EObject temp_GivenBlock = null;

        EObject temp_WhenBlock = null;

        EObject temp_ThenBlock = null;

        EObject temp_TableBlock = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 14) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:527:4: ( ( (temp_TableScenarioIdentifier= ruleTableScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? (temp_TableBlock= ruleTableBlock ) ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:527:4: ( (temp_TableScenarioIdentifier= ruleTableScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? (temp_TableBlock= ruleTableBlock ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "TableScenario");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:530:1: ( (temp_TableScenarioIdentifier= ruleTableScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? (temp_TableBlock= ruleTableBlock ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:530:2: (temp_TableScenarioIdentifier= ruleTableScenarioIdentifier ) (temp_ScenarioDescription= ruleScenarioDescription ) (temp_GivenBlock= ruleGivenBlock )? (temp_WhenBlock= ruleWhenBlock )? (temp_ThenBlock= ruleThenBlock )? (temp_TableBlock= ruleTableBlock )
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:530:2: (temp_TableScenarioIdentifier= ruleTableScenarioIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:530:3: temp_TableScenarioIdentifier= ruleTableScenarioIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleTableScenarioIdentifier_in_ruleTableScenario739);
            temp_TableScenarioIdentifier=ruleTableScenarioIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_TableScenarioIdentifier != null) {
                hasContent = true;
                ptm.setModelElement(temp_TableScenarioIdentifier);
                factory.set(result,"tsi",convert(temp_TableScenarioIdentifier),false);
                ptm.ruleFinished(temp_TableScenarioIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:542:1: (temp_ScenarioDescription= ruleScenarioDescription )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:542:2: temp_ScenarioDescription= ruleScenarioDescription
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleScenarioDescription_in_ruleTableScenario750);
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

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:554:1: (temp_GivenBlock= ruleGivenBlock )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:554:2: temp_GivenBlock= ruleGivenBlock
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(2)));
                    }
                    pushFollow(FOLLOW_ruleGivenBlock_in_ruleTableScenario761);
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
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:566:1: (temp_WhenBlock= ruleWhenBlock )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==16) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:566:2: temp_WhenBlock= ruleWhenBlock
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(3)));
                    }
                    pushFollow(FOLLOW_ruleWhenBlock_in_ruleTableScenario773);
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
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:578:1: (temp_ThenBlock= ruleThenBlock )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==17) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:578:2: temp_ThenBlock= ruleThenBlock
                    {
                    if ( backtracking==0 ) {
                      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(4)));
                    }
                    pushFollow(FOLLOW_ruleThenBlock_in_ruleTableScenario785);
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
                    break;

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:590:1: (temp_TableBlock= ruleTableBlock )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:590:2: temp_TableBlock= ruleTableBlock
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(12)).eContents().get(1)).eContents().get(5)));
            }
            pushFollow(FOLLOW_ruleTableBlock_in_ruleTableScenario797);
            temp_TableBlock=ruleTableBlock();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_TableBlock != null) {
                hasContent = true;
                ptm.setModelElement(temp_TableBlock);
                factory.set(result,"table_block",convert(temp_TableBlock),false);
                ptm.ruleFinished(temp_TableBlock);
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
            if ( backtracking>0 ) { memoize(input, 14, ruleTableScenario_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleTableScenario


    // $ANTLR start ruleTableScenarioIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:609:1: ruleTableScenarioIdentifier returns [EObject result] : ( 'Scenario Outline:' ) ;
    public EObject ruleTableScenarioIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleTableScenarioIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 15) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:612:4: ( ( 'Scenario Outline:' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:612:4: ( 'Scenario Outline:' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "TableScenarioIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:615:1: ( 'Scenario Outline:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:615:2: 'Scenario Outline:'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,12,FOLLOW_12_in_ruleTableScenarioIdentifier835); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(13)).eContents().get(1)));
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
            if ( backtracking>0 ) { memoize(input, 15, ruleTableScenarioIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleTableScenarioIdentifier


    // $ANTLR start ruleTableBlock
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:627:1: ruleTableBlock returns [EObject result] : ( (temp_TableIdentifier= ruleTableIdentifier ) (temp_TableHeader= ruleTableHeader ) (temp_TableRow= ruleTableRow )* ) ;
    public EObject ruleTableBlock() throws RecognitionException {
        EObject result = null;
        int ruleTableBlock_StartIndex = input.index();
        EObject temp_TableIdentifier = null;

        EObject temp_TableHeader = null;

        EObject temp_TableRow = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 16) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:630:4: ( ( (temp_TableIdentifier= ruleTableIdentifier ) (temp_TableHeader= ruleTableHeader ) (temp_TableRow= ruleTableRow )* ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:630:4: ( (temp_TableIdentifier= ruleTableIdentifier ) (temp_TableHeader= ruleTableHeader ) (temp_TableRow= ruleTableRow )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "TableBlock");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:633:1: ( (temp_TableIdentifier= ruleTableIdentifier ) (temp_TableHeader= ruleTableHeader ) (temp_TableRow= ruleTableRow )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:633:2: (temp_TableIdentifier= ruleTableIdentifier ) (temp_TableHeader= ruleTableHeader ) (temp_TableRow= ruleTableRow )*
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:633:2: (temp_TableIdentifier= ruleTableIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:633:3: temp_TableIdentifier= ruleTableIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleTableIdentifier_in_ruleTableBlock874);
            temp_TableIdentifier=ruleTableIdentifier();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_TableIdentifier != null) {
                hasContent = true;
                ptm.setModelElement(temp_TableIdentifier);
                factory.set(result,"ti",convert(temp_TableIdentifier),false);
                ptm.ruleFinished(temp_TableIdentifier);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:645:1: (temp_TableHeader= ruleTableHeader )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:645:2: temp_TableHeader= ruleTableHeader
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleTableHeader_in_ruleTableBlock885);
            temp_TableHeader=ruleTableHeader();
            _fsp--;
            if (failed) return result;
            if ( backtracking==0 ) {
              if (temp_TableHeader != null) {
                hasContent = true;
                ptm.setModelElement(temp_TableHeader);
                factory.set(result,"th",convert(temp_TableHeader),false);
                ptm.ruleFinished(temp_TableHeader);
              } else {
                ptm.destroyNode();
              }

            }

            }

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:657:1: (temp_TableRow= ruleTableRow )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_INT)||(LA21_0>=19 && LA21_0<=24)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:657:2: temp_TableRow= ruleTableRow
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(14)).eContents().get(1)).eContents().get(2)));
            	    }
            	    pushFollow(FOLLOW_ruleTableRow_in_ruleTableBlock896);
            	    temp_TableRow=ruleTableRow();
            	    _fsp--;
            	    if (failed) return result;
            	    if ( backtracking==0 ) {
            	      if (temp_TableRow != null) {
            	        hasContent = true;
            	        ptm.setModelElement(temp_TableRow);
            	        factory.add(result,"tr",convert(temp_TableRow),false);
            	        ptm.ruleFinished(temp_TableRow);
            	      } else {
            	        ptm.destroyNode();
            	      }

            	    }

            	    }
            	    break;

            	default :
            	    break loop21;
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
            if ( backtracking>0 ) { memoize(input, 16, ruleTableBlock_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleTableBlock


    // $ANTLR start ruleTableIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:676:1: ruleTableIdentifier returns [EObject result] : ( 'Examples:' ) ;
    public EObject ruleTableIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleTableIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 17) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:679:4: ( ( 'Examples:' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:679:4: ( 'Examples:' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "TableIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:682:1: ( 'Examples:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:682:2: 'Examples:'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,13,FOLLOW_13_in_ruleTableIdentifier935); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(15)).eContents().get(1)));
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
            if ( backtracking>0 ) { memoize(input, 17, ruleTableIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleTableIdentifier


    // $ANTLR start ruleTableHeader
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:694:1: ruleTableHeader returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleTableHeader() throws RecognitionException {
        EObject result = null;
        int ruleTableHeader_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 18) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:697:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:697:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "TableHeader");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:700:1: (temp_Word= ruleWord )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA22_1 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    int LA22_2 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case RULE_INT:
                    {
                    int LA22_3 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA22_4 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA22_5 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA22_6 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA22_7 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA22_8 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt22=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA22_9 = input.LA(2);

                    if ( (synpred22()) ) {
                        alt22=1;
                    }


                    }
                    break;

                }

                switch (alt22) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:700:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleTableHeader973);
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
            	    if ( cnt22 >= 1 ) break loop22;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
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
            if ( backtracking>0 ) { memoize(input, 18, ruleTableHeader_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleTableHeader


    // $ANTLR start ruleTableRow
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:717:1: ruleTableRow returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleTableRow() throws RecognitionException {
        EObject result = null;
        int ruleTableRow_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 19) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:720:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:720:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "TableRow");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:723:1: (temp_Word= ruleWord )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case RULE_ID:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (synpred23()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case RULE_STRING:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (synpred23()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case RULE_INT:
                    {
                    int LA23_4 = input.LA(2);

                    if ( (synpred23()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 19:
                    {
                    int LA23_5 = input.LA(2);

                    if ( (synpred23()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 20:
                    {
                    int LA23_6 = input.LA(2);

                    if ( (synpred23()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 21:
                    {
                    int LA23_7 = input.LA(2);

                    if ( (synpred23()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 22:
                    {
                    int LA23_8 = input.LA(2);

                    if ( (synpred23()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 23:
                    {
                    int LA23_9 = input.LA(2);

                    if ( (synpred23()) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 24:
                    {
                    int LA23_10 = input.LA(2);

                    if ( (synpred23()) ) {
                        alt23=1;
                    }


                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:723:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleTableRow1013);
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
            	    if ( cnt23 >= 1 ) break loop23;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
            if ( backtracking>0 ) { memoize(input, 19, ruleTableRow_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleTableRow


    // $ANTLR start ruleScenarioIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:740:1: ruleScenarioIdentifier returns [EObject result] : ( 'Scenario:' ) ;
    public EObject ruleScenarioIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleScenarioIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 20) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:743:4: ( ( 'Scenario:' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:743:4: ( 'Scenario:' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ScenarioIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:746:1: ( 'Scenario:' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:746:2: 'Scenario:'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,14,FOLLOW_14_in_ruleScenarioIdentifier1050); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(18)).eContents().get(1)));
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
            if ( backtracking>0 ) { memoize(input, 20, ruleScenarioIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleScenarioIdentifier


    // $ANTLR start ruleScenarioDescription
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:758:1: ruleScenarioDescription returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleScenarioDescription() throws RecognitionException {
        EObject result = null;
        int ruleScenarioDescription_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 21) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:761:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:761:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ScenarioDescription");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:764:1: (temp_Word= ruleWord )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_INT)||(LA24_0>=19 && LA24_0<=24)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:764:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(19)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleScenarioDescription1088);
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
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
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
            if ( backtracking>0 ) { memoize(input, 21, ruleScenarioDescription_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleScenarioDescription


    // $ANTLR start ruleGivenBlock
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:781:1: ruleGivenBlock returns [EObject result] : ( (temp_GivenIdentifier= ruleGivenIdentifier ) (temp_GivenDefinition= ruleGivenDefinition ) (temp_AndBlock= ruleAndBlock )* ) ;
    public EObject ruleGivenBlock() throws RecognitionException {
        EObject result = null;
        int ruleGivenBlock_StartIndex = input.index();
        EObject temp_GivenIdentifier = null;

        EObject temp_GivenDefinition = null;

        EObject temp_AndBlock = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 22) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:784:4: ( ( (temp_GivenIdentifier= ruleGivenIdentifier ) (temp_GivenDefinition= ruleGivenDefinition ) (temp_AndBlock= ruleAndBlock )* ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:784:4: ( (temp_GivenIdentifier= ruleGivenIdentifier ) (temp_GivenDefinition= ruleGivenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "GivenBlock");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:787:1: ( (temp_GivenIdentifier= ruleGivenIdentifier ) (temp_GivenDefinition= ruleGivenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:787:2: (temp_GivenIdentifier= ruleGivenIdentifier ) (temp_GivenDefinition= ruleGivenDefinition ) (temp_AndBlock= ruleAndBlock )*
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:787:2: (temp_GivenIdentifier= ruleGivenIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:787:3: temp_GivenIdentifier= ruleGivenIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleGivenIdentifier_in_ruleGivenBlock1129);
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

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:799:1: (temp_GivenDefinition= ruleGivenDefinition )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:799:2: temp_GivenDefinition= ruleGivenDefinition
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleGivenDefinition_in_ruleGivenBlock1140);
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

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:811:1: (temp_AndBlock= ruleAndBlock )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==18) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:811:2: temp_AndBlock= ruleAndBlock
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(20)).eContents().get(1)).eContents().get(2)));
            	    }
            	    pushFollow(FOLLOW_ruleAndBlock_in_ruleGivenBlock1151);
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
            	    break loop25;
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
            if ( backtracking>0 ) { memoize(input, 22, ruleGivenBlock_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleGivenBlock


    // $ANTLR start ruleGivenIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:830:1: ruleGivenIdentifier returns [EObject result] : ( 'Given' ) ;
    public EObject ruleGivenIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleGivenIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 23) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:833:4: ( ( 'Given' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:833:4: ( 'Given' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "GivenIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:836:1: ( 'Given' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:836:2: 'Given'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,15,FOLLOW_15_in_ruleGivenIdentifier1190); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 23, ruleGivenIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleGivenIdentifier


    // $ANTLR start ruleWhenBlock
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:848:1: ruleWhenBlock returns [EObject result] : ( (temp_WhenIdentifier= ruleWhenIdentifier ) (temp_WhenDefinition= ruleWhenDefinition ) (temp_AndBlock= ruleAndBlock )* ) ;
    public EObject ruleWhenBlock() throws RecognitionException {
        EObject result = null;
        int ruleWhenBlock_StartIndex = input.index();
        EObject temp_WhenIdentifier = null;

        EObject temp_WhenDefinition = null;

        EObject temp_AndBlock = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 24) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:851:4: ( ( (temp_WhenIdentifier= ruleWhenIdentifier ) (temp_WhenDefinition= ruleWhenDefinition ) (temp_AndBlock= ruleAndBlock )* ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:851:4: ( (temp_WhenIdentifier= ruleWhenIdentifier ) (temp_WhenDefinition= ruleWhenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "WhenBlock");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:854:1: ( (temp_WhenIdentifier= ruleWhenIdentifier ) (temp_WhenDefinition= ruleWhenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:854:2: (temp_WhenIdentifier= ruleWhenIdentifier ) (temp_WhenDefinition= ruleWhenDefinition ) (temp_AndBlock= ruleAndBlock )*
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:854:2: (temp_WhenIdentifier= ruleWhenIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:854:3: temp_WhenIdentifier= ruleWhenIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleWhenIdentifier_in_ruleWhenBlock1229);
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

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:866:1: (temp_WhenDefinition= ruleWhenDefinition )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:866:2: temp_WhenDefinition= ruleWhenDefinition
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleWhenDefinition_in_ruleWhenBlock1240);
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

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:878:1: (temp_AndBlock= ruleAndBlock )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==18) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:878:2: temp_AndBlock= ruleAndBlock
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(22)).eContents().get(1)).eContents().get(2)));
            	    }
            	    pushFollow(FOLLOW_ruleAndBlock_in_ruleWhenBlock1251);
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
            	    break loop26;
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
            if ( backtracking>0 ) { memoize(input, 24, ruleWhenBlock_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleWhenBlock


    // $ANTLR start ruleWhenIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:897:1: ruleWhenIdentifier returns [EObject result] : ( 'When' ) ;
    public EObject ruleWhenIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleWhenIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 25) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:900:4: ( ( 'When' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:900:4: ( 'When' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "WhenIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:903:1: ( 'When' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:903:2: 'When'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,16,FOLLOW_16_in_ruleWhenIdentifier1290); if (failed) return result;
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
            if ( backtracking>0 ) { memoize(input, 25, ruleWhenIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleWhenIdentifier


    // $ANTLR start ruleThenBlock
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:915:1: ruleThenBlock returns [EObject result] : ( (temp_ThenIdentifier= ruleThenIdentifier ) (temp_ThenDefinition= ruleThenDefinition ) (temp_AndBlock= ruleAndBlock )* ) ;
    public EObject ruleThenBlock() throws RecognitionException {
        EObject result = null;
        int ruleThenBlock_StartIndex = input.index();
        EObject temp_ThenIdentifier = null;

        EObject temp_ThenDefinition = null;

        EObject temp_AndBlock = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 26) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:918:4: ( ( (temp_ThenIdentifier= ruleThenIdentifier ) (temp_ThenDefinition= ruleThenDefinition ) (temp_AndBlock= ruleAndBlock )* ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:918:4: ( (temp_ThenIdentifier= ruleThenIdentifier ) (temp_ThenDefinition= ruleThenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ThenBlock");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:921:1: ( (temp_ThenIdentifier= ruleThenIdentifier ) (temp_ThenDefinition= ruleThenDefinition ) (temp_AndBlock= ruleAndBlock )* )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:921:2: (temp_ThenIdentifier= ruleThenIdentifier ) (temp_ThenDefinition= ruleThenDefinition ) (temp_AndBlock= ruleAndBlock )*
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:921:2: (temp_ThenIdentifier= ruleThenIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:921:3: temp_ThenIdentifier= ruleThenIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleThenIdentifier_in_ruleThenBlock1329);
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

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:933:1: (temp_ThenDefinition= ruleThenDefinition )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:933:2: temp_ThenDefinition= ruleThenDefinition
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleThenDefinition_in_ruleThenBlock1340);
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

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:945:1: (temp_AndBlock= ruleAndBlock )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==18) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:945:2: temp_AndBlock= ruleAndBlock
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(24)).eContents().get(1)).eContents().get(2)));
            	    }
            	    pushFollow(FOLLOW_ruleAndBlock_in_ruleThenBlock1351);
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
            	    break loop27;
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
            if ( backtracking>0 ) { memoize(input, 26, ruleThenBlock_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleThenBlock


    // $ANTLR start ruleThenIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:964:1: ruleThenIdentifier returns [EObject result] : ( 'Then' ) ;
    public EObject ruleThenIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleThenIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 27) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:967:4: ( ( 'Then' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:967:4: ( 'Then' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ThenIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:970:1: ( 'Then' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:970:2: 'Then'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,17,FOLLOW_17_in_ruleThenIdentifier1390); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(25)).eContents().get(1)));
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
            if ( backtracking>0 ) { memoize(input, 27, ruleThenIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleThenIdentifier


    // $ANTLR start ruleAndBlock
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:982:1: ruleAndBlock returns [EObject result] : ( (temp_AndIdentifier= ruleAndIdentifier ) (temp_AndDefinition= ruleAndDefinition ) ) ;
    public EObject ruleAndBlock() throws RecognitionException {
        EObject result = null;
        int ruleAndBlock_StartIndex = input.index();
        EObject temp_AndIdentifier = null;

        EObject temp_AndDefinition = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 28) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:985:4: ( ( (temp_AndIdentifier= ruleAndIdentifier ) (temp_AndDefinition= ruleAndDefinition ) ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:985:4: ( (temp_AndIdentifier= ruleAndIdentifier ) (temp_AndDefinition= ruleAndDefinition ) )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "AndBlock");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:988:1: ( (temp_AndIdentifier= ruleAndIdentifier ) (temp_AndDefinition= ruleAndDefinition ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:988:2: (temp_AndIdentifier= ruleAndIdentifier ) (temp_AndDefinition= ruleAndDefinition )
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:988:2: (temp_AndIdentifier= ruleAndIdentifier )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:988:3: temp_AndIdentifier= ruleAndIdentifier
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(26)).eContents().get(1)).eContents().get(0)));
            }
            pushFollow(FOLLOW_ruleAndIdentifier_in_ruleAndBlock1429);
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

            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1000:1: (temp_AndDefinition= ruleAndDefinition )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1000:2: temp_AndDefinition= ruleAndDefinition
            {
            if ( backtracking==0 ) {
              ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(26)).eContents().get(1)).eContents().get(1)));
            }
            pushFollow(FOLLOW_ruleAndDefinition_in_ruleAndBlock1440);
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
            if ( backtracking>0 ) { memoize(input, 28, ruleAndBlock_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAndBlock


    // $ANTLR start ruleAndIdentifier
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1019:1: ruleAndIdentifier returns [EObject result] : ( 'And' ) ;
    public EObject ruleAndIdentifier() throws RecognitionException {
        EObject result = null;
        int ruleAndIdentifier_StartIndex = input.index();
        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 29) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1022:4: ( ( 'And' ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1022:4: ( 'And' )
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "AndIdentifier");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1025:1: ( 'And' )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1025:2: 'And'
            {
            if ( backtracking==0 ) {
              skipCurrentToken = false;
            }
            match(input,18,FOLLOW_18_in_ruleAndIdentifier1478); if (failed) return result;
            if ( backtracking==0 ) {
              if (!skipCurrentToken) {
                hasContent = true;
                ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(27)).eContents().get(1)));
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
            if ( backtracking>0 ) { memoize(input, 29, ruleAndIdentifier_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAndIdentifier


    // $ANTLR start ruleGivenDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1037:1: ruleGivenDefinition returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleGivenDefinition() throws RecognitionException {
        EObject result = null;
        int ruleGivenDefinition_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 30) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1040:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1040:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "GivenDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1043:1: (temp_Word= ruleWord )+
            int cnt28=0;
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_INT)||(LA28_0>=19 && LA28_0<=24)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1043:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(28)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleGivenDefinition1516);
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
            	    if ( cnt28 >= 1 ) break loop28;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(28, input);
                        throw eee;
                }
                cnt28++;
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
            if ( backtracking>0 ) { memoize(input, 30, ruleGivenDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleGivenDefinition


    // $ANTLR start ruleWhenDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1060:1: ruleWhenDefinition returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleWhenDefinition() throws RecognitionException {
        EObject result = null;
        int ruleWhenDefinition_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 31) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1063:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1063:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "WhenDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1066:1: (temp_Word= ruleWord )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_ID && LA29_0<=RULE_INT)||(LA29_0>=19 && LA29_0<=24)) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1066:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(29)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleWhenDefinition1556);
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
            	    if ( cnt29 >= 1 ) break loop29;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
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
            if ( backtracking>0 ) { memoize(input, 31, ruleWhenDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleWhenDefinition


    // $ANTLR start ruleThenDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1083:1: ruleThenDefinition returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleThenDefinition() throws RecognitionException {
        EObject result = null;
        int ruleThenDefinition_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 32) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1086:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1086:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "ThenDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1089:1: (temp_Word= ruleWord )+
            int cnt30=0;
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_ID && LA30_0<=RULE_INT)||(LA30_0>=19 && LA30_0<=24)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1089:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(30)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleThenDefinition1596);
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
            	    if ( cnt30 >= 1 ) break loop30;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(30, input);
                        throw eee;
                }
                cnt30++;
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
            if ( backtracking>0 ) { memoize(input, 32, ruleThenDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleThenDefinition


    // $ANTLR start ruleAndDefinition
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1106:1: ruleAndDefinition returns [EObject result] : (temp_Word= ruleWord )+ ;
    public EObject ruleAndDefinition() throws RecognitionException {
        EObject result = null;
        int ruleAndDefinition_StartIndex = input.index();
        String temp_Word = null;


        boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 33) ) { return result; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1109:4: ( (temp_Word= ruleWord )+ )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1109:4: (temp_Word= ruleWord )+
            {
            if ( backtracking==0 ) {

              				result = factory.create("", "AndDefinition");
              			 
            }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1112:1: (temp_Word= ruleWord )+
            int cnt31=0;
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( ((LA31_0>=RULE_ID && LA31_0<=RULE_INT)||(LA31_0>=19 && LA31_0<=24)) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1112:2: temp_Word= ruleWord
            	    {
            	    if ( backtracking==0 ) {
            	      ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(31)).eContents().get(1)));
            	    }
            	    pushFollow(FOLLOW_ruleWord_in_ruleAndDefinition1636);
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
            	    if ( cnt31 >= 1 ) break loop31;
            	    if (backtracking>0) {failed=true; return result;}
                        EarlyExitException eee =
                            new EarlyExitException(31, input);
                        throw eee;
                }
                cnt31++;
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
            if ( backtracking>0 ) { memoize(input, 33, ruleAndDefinition_StartIndex); }
        }
        return result;
    }
    // $ANTLR end ruleAndDefinition


    // $ANTLR start ruleWord
    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1129:1: ruleWord returns [String s] : ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( '.' ) | ( ':' ) | ( ',' ) | ( '|' ) | ( '<' ) | ( '>' ) ) ;
    public String ruleWord() throws RecognitionException {
        String s = null;
        int ruleWord_StartIndex = input.index();
        StringBuffer buff = new StringBuffer(); boolean hasContent = false;
        try {
            if ( backtracking>0 && alreadyParsedRule(input, 34) ) { return s; }
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1132:1: ( ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( '.' ) | ( ':' ) | ( ',' ) | ( '|' ) | ( '<' ) | ( '>' ) ) )
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1132:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( '.' ) | ( ':' ) | ( ',' ) | ( '|' ) | ( '<' ) | ( '>' ) )
            {
            // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1132:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( '.' ) | ( ':' ) | ( ',' ) | ( '|' ) | ( '<' ) | ( '>' ) )
            int alt32=9;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt32=1;
                }
                break;
            case RULE_STRING:
                {
                alt32=2;
                }
                break;
            case RULE_INT:
                {
                alt32=3;
                }
                break;
            case 19:
                {
                alt32=4;
                }
                break;
            case 20:
                {
                alt32=5;
                }
                break;
            case 21:
                {
                alt32=6;
                }
                break;
            case 22:
                {
                alt32=7;
                }
                break;
            case 23:
                {
                alt32=8;
                }
                break;
            case 24:
                {
                alt32=9;
                }
                break;
            default:
                if (backtracking>0) {failed=true; return s;}
                NoViableAltException nvae =
                    new NoViableAltException("1132:1: ( ( RULE_ID ) | ( RULE_STRING ) | ( RULE_INT ) | ( '.' ) | ( ':' ) | ( ',' ) | ( '|' ) | ( '<' ) | ( '>' ) )", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1132:2: ( RULE_ID )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1132:2: ( RULE_ID )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1132:3: RULE_ID
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleWord1674); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(32)).eContents().get(0)).eContents().get(0)));
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
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1143:1: ( RULE_STRING )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1143:1: ( RULE_STRING )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1143:2: RULE_STRING
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleWord1684); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(32)).eContents().get(0)).eContents().get(1)));
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
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1154:1: ( RULE_INT )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1154:1: ( RULE_INT )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1154:2: RULE_INT
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleWord1694); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(32)).eContents().get(0)).eContents().get(2)));
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
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1165:1: ( '.' )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1165:1: ( '.' )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1165:3: '.'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,19,FOLLOW_19_in_ruleWord1705); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(32)).eContents().get(0)).eContents().get(3)));
                        ptm.ruleFinished(temp);
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;
                case 5 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1173:1: ( ':' )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1173:1: ( ':' )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1173:3: ':'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,20,FOLLOW_20_in_ruleWord1717); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(32)).eContents().get(0)).eContents().get(4)));
                        ptm.ruleFinished(temp);
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;
                case 6 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1181:1: ( ',' )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1181:1: ( ',' )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1181:3: ','
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,21,FOLLOW_21_in_ruleWord1729); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(32)).eContents().get(0)).eContents().get(5)));
                        ptm.ruleFinished(temp);
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;
                case 7 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1189:1: ( '|' )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1189:1: ( '|' )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1189:3: '|'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,22,FOLLOW_22_in_ruleWord1741); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(32)).eContents().get(0)).eContents().get(6)));
                        ptm.ruleFinished(temp);
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;
                case 8 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1197:1: ( '<' )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1197:1: ( '<' )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1197:3: '<'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,23,FOLLOW_23_in_ruleWord1753); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(32)).eContents().get(0)).eContents().get(7)));
                        ptm.ruleFinished(temp);
                        buff.append(temp.getText());
                      }
                    }

                    }


                    }
                    break;
                case 9 :
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1205:1: ( '>' )
                    {
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1205:1: ( '>' )
                    // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:1205:3: '>'
                    {
                    if ( backtracking==0 ) {
                      skipCurrentToken = false;
                    }
                    match(input,24,FOLLOW_24_in_ruleWord1765); if (failed) return s;
                    if ( backtracking==0 ) {
                      if (!skipCurrentToken) {
                        hasContent = true;
                        Token temp = getLastToken();
                        ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(32)).eContents().get(0)).eContents().get(8)));
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
            if ( backtracking>0 ) { memoize(input, 34, ruleWord_StartIndex); }
        }
        return s;
    }
    // $ANTLR end ruleWord

    // $ANTLR start synpred4
    public void synpred4_fragment() throws RecognitionException {   
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:215:3: ( ruleBusinessValueDefinition )
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:215:3: ruleBusinessValueDefinition
        {
        if ( backtracking==0 ) {
          ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(0)));
        }
        pushFollow(FOLLOW_ruleBusinessValueDefinition_in_synpred4235);
        ruleBusinessValueDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred4

    // $ANTLR start synpred5
    public void synpred5_fragment() throws RecognitionException {   
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:227:2: ( ruleRoleDefinition )
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:227:2: ruleRoleDefinition
        {
        if ( backtracking==0 ) {
          ptm.createNode(((EObject)((EObject)((EObject)xtextfile.eContents().get(2)).eContents().get(1)).eContents().get(1)));
        }
        pushFollow(FOLLOW_ruleRoleDefinition_in_synpred5247);
        ruleRoleDefinition();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred5

    // $ANTLR start synpred7
    public void synpred7_fragment() throws RecognitionException {   
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:282:2: ( ruleWord )
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:282:2: ruleWord
        {
        if ( backtracking==0 ) {
          ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(4)).eContents().get(1)));
        }
        pushFollow(FOLLOW_ruleWord_in_synpred7336);
        ruleWord();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred7

    // $ANTLR start synpred8
    public void synpred8_fragment() throws RecognitionException {   
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:305:2: ( ruleWord )
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:305:2: ruleWord
        {
        if ( backtracking==0 ) {
          ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(5)).eContents().get(1)));
        }
        pushFollow(FOLLOW_ruleWord_in_synpred8376);
        ruleWord();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred8

    // $ANTLR start synpred9
    public void synpred9_fragment() throws RecognitionException {   
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:328:2: ( ruleWord )
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:328:2: ruleWord
        {
        if ( backtracking==0 ) {
          ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(6)).eContents().get(1)));
        }
        pushFollow(FOLLOW_ruleWord_in_synpred9416);
        ruleWord();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred9

    // $ANTLR start synpred22
    public void synpred22_fragment() throws RecognitionException {   
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:700:2: ( ruleWord )
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:700:2: ruleWord
        {
        if ( backtracking==0 ) {
          ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(16)).eContents().get(1)));
        }
        pushFollow(FOLLOW_ruleWord_in_synpred22973);
        ruleWord();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred22

    // $ANTLR start synpred23
    public void synpred23_fragment() throws RecognitionException {   
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:723:2: ( ruleWord )
        // ..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g:723:2: ruleWord
        {
        if ( backtracking==0 ) {
          ptm.createNode(((EObject)((EObject)xtextfile.eContents().get(17)).eContents().get(1)));
        }
        pushFollow(FOLLOW_ruleWord_in_synpred231013);
        ruleWord();
        _fsp--;
        if (failed) return ;

        }
    }
    // $ANTLR end synpred23

    public final boolean synpred9() {
        backtracking++;
        int start = input.mark();
        try {
            synpred9_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred5() {
        backtracking++;
        int start = input.mark();
        try {
            synpred5_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred7() {
        backtracking++;
        int start = input.mark();
        try {
            synpred7_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred8() {
        backtracking++;
        int start = input.mark();
        try {
            synpred8_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred23() {
        backtracking++;
        int start = input.mark();
        try {
            synpred23_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred22() {
        backtracking++;
        int start = input.mark();
        try {
            synpred22_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }
    public final boolean synpred4() {
        backtracking++;
        int start = input.mark();
        try {
            synpred4_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !failed;
        input.rewind(start);
        backtracking--;
        failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_ruleCucumber_in_parse67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_parse78 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFeature_in_ruleCucumber106 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruleFeatureIdentifier_in_ruleFeature147 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_ruleFeatureDescription_in_ruleFeature158 = new BitSet(new long[]{0x0000000001F85872L});
    public static final BitSet FOLLOW_ruleFeatureBlock_in_ruleFeature169 = new BitSet(new long[]{0x0000000000005802L});
    public static final BitSet FOLLOW_ruleBackground_in_ruleFeature180 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_ruleScenario_in_ruleFeature192 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_ruleBusinessValueDefinition_in_ruleFeatureBlock235 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleRoleDefinition_in_ruleFeatureBlock247 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleSomeActionDefinition_in_ruleFeatureBlock259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_ruleFeatureIdentifier298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleFeatureDescription336 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleWord_in_ruleBusinessValueDefinition376 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleWord_in_ruleRoleDefinition416 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleWord_in_ruleSomeActionDefinition456 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleBackgroundIdentifier_in_ruleBackground497 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_ruleGivenBlock_in_ruleBackground508 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_ruleBackground520 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_ruleBackground532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleBackgroundIdentifier571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicScenario_in_ruleScenario604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableScenario_in_ruleScenario619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleScenarioIdentifier_in_ruleBasicScenario650 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_ruleScenarioDescription_in_ruleBasicScenario661 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_ruleGivenBlock_in_ruleBasicScenario672 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_ruleBasicScenario684 = new BitSet(new long[]{0x0000000000020002L});
    public static final BitSet FOLLOW_ruleThenBlock_in_ruleBasicScenario696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableScenarioIdentifier_in_ruleTableScenario739 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_ruleScenarioDescription_in_ruleTableScenario750 = new BitSet(new long[]{0x000000000003A000L});
    public static final BitSet FOLLOW_ruleGivenBlock_in_ruleTableScenario761 = new BitSet(new long[]{0x0000000000032000L});
    public static final BitSet FOLLOW_ruleWhenBlock_in_ruleTableScenario773 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_ruleThenBlock_in_ruleTableScenario785 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ruleTableBlock_in_ruleTableScenario797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_ruleTableScenarioIdentifier835 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTableIdentifier_in_ruleTableBlock874 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_ruleTableHeader_in_ruleTableBlock885 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleTableRow_in_ruleTableBlock896 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_13_in_ruleTableIdentifier935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleTableHeader973 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleWord_in_ruleTableRow1013 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_14_in_ruleScenarioIdentifier1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleScenarioDescription1088 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleGivenIdentifier_in_ruleGivenBlock1129 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_ruleGivenDefinition_in_ruleGivenBlock1140 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleAndBlock_in_ruleGivenBlock1151 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_15_in_ruleGivenIdentifier1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWhenIdentifier_in_ruleWhenBlock1229 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_ruleWhenDefinition_in_ruleWhenBlock1240 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleAndBlock_in_ruleWhenBlock1251 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_16_in_ruleWhenIdentifier1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleThenIdentifier_in_ruleThenBlock1329 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_ruleThenDefinition_in_ruleThenBlock1340 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_ruleAndBlock_in_ruleThenBlock1351 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_17_in_ruleThenIdentifier1390 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndIdentifier_in_ruleAndBlock1429 = new BitSet(new long[]{0x0000000001F80070L});
    public static final BitSet FOLLOW_ruleAndDefinition_in_ruleAndBlock1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleAndIdentifier1478 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_ruleGivenDefinition1516 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleWord_in_ruleWhenDefinition1556 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleWord_in_ruleThenDefinition1596 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_ruleWord_in_ruleAndDefinition1636 = new BitSet(new long[]{0x0000000001F80072L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleWord1674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleWord1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleWord1694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleWord1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleWord1717 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleWord1729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleWord1741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleWord1753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleWord1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBusinessValueDefinition_in_synpred4235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRoleDefinition_in_synpred5247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_synpred7336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_synpred8376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_synpred9416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_synpred22973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleWord_in_synpred231013 = new BitSet(new long[]{0x0000000000000002L});

}