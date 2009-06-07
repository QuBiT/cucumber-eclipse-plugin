lexer grammar CucumberFeature;
@members {
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
@header {
package info.cukes.feature.parser;

import org.openarchitectureware.xtext.parser.ErrorMsg;
import org.openarchitectureware.xtext.parser.impl.AntlrUtil;

}

T10 : 'Feature:' ;
T11 : 'Background:' ;
T12 : 'Scenario Outline:' ;
T13 : 'Examples:' ;
T14 : 'Scenario:' ;
T15 : 'Given' ;
T16 : 'When' ;
T17 : 'Then' ;
T18 : 'And' ;
T19 : '.' ;
T20 : ':' ;
T21 : ',' ;
T22 : '|' ;
T23 : '<' ;
T24 : '>' ;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1222
RULE_SL_COMMENT :

	 '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1227
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1233
RULE_STRING :

	 '\"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\"') )* '\"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1240
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1246
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1252
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

