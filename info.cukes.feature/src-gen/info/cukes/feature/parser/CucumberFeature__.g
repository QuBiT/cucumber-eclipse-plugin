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

T16 : 'Feature:' ;
T17 : 'Scenario:' ;
T18 : 'Given' ;
T19 : 'When' ;
T20 : 'Then' ;
T21 : 'And' ;
T22 : '.' ;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 297
RULE_BusinessValueIdentifier :

	 'In order to '
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 360
RULE_RoleIdentifier :

	 'As a '|'As an '
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 423
RULE_SomeActionIdentifier :

	 'I want to '
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 999
RULE_NotInorderto :

	 'In '(~'o')?|'In o'(~'r')?|'In or'(~'d')?|'In ord'(~'e')?|'In orde'(~'r')?| 'In order '(~'t')?|'In order t'(~'o')?
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1004
RULE_NotAsa :

	 'As '(~'a')?|'As a'(~'n')?
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1009
RULE_NotIwantto :

	 'I '(~'w')?|'I w'(~'a')?|'I wa'(~'n')?|'In wan'(~'t')?|'In want '(~'t')?|'In want t'(~'o')?
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1014
RULE_SL_COMMENT :

	 '#' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1019
RULE_ID :

	 ('^')?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	 
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1025
RULE_STRING :

	 '\"' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\"') )* '\"' |
	 '\'' ( '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\') | ~('\\'|'\'') )* '\''
	 
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1032
RULE_INT :

	 ('-')?('0'..'9')+
	 
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1038
RULE_WS :

	 (' '|'\t'|'\r'|'\n')+ {$channel=HIDDEN;}
	 
;

// $ANTLR src "..//info.cukes.feature/src-gen/info/cukes/feature/parser/CucumberFeature.g" 1044
RULE_ML_COMMENT :

	 '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
	 
;

