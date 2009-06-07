grammar debugMeWithAntlrWorks;
 options{backtrack=true; memoize=true;} 



parse :
	 result=ruleCucumber
	 // Always return the root node! This prevents that this method is called multiple times
	 // with interesting side effects.
	 EOF
;

ruleCucumber 

:
(ruleFeature)*
;

ruleFeature 

:
((ruleFeatureIdentifier)

(ruleFeatureDescription)

(ruleFeatureBlock)

(ruleBackground)?

(ruleScenario)*
)
;

ruleFeatureBlock 

:
((ruleBusinessValueDefinition)?

(ruleRoleDefinition)?

(ruleSomeActionDefinition)?
)
;

ruleFeatureIdentifier 

:
('Feature:')
;

ruleFeatureDescription 

:
(ruleWord)+
;

ruleBusinessValueDefinition 

:
(ruleWord)+
;

ruleRoleDefinition 

:
(ruleWord)+
;

ruleSomeActionDefinition 

:
(ruleWord)+
;

ruleBackground 

:
((ruleBackgroundIdentifier)

(ruleGivenBlock)?

(ruleWhenBlock)?

(ruleThenBlock)?
)
;

ruleBackgroundIdentifier 

:
('Background:')
;

ruleScenario 
:
        temp_basicscenario=ruleBasicScenario 	|        temp_tablescenario=ruleTableScenario 	;

ruleBasicScenario 

:
((ruleScenarioIdentifier)

(ruleScenarioDescription)

(ruleGivenBlock)?

(ruleWhenBlock)?

(ruleThenBlock)?
)
;

ruleTableScenario 

:
((ruleTableScenarioIdentifier)

(ruleScenarioDescription)

(ruleGivenBlock)?

(ruleWhenBlock)?

(ruleThenBlock)?

(ruleTableBlock)
)
;

ruleTableScenarioIdentifier 

:
('Scenario Outline:')
;

ruleTableBlock 

:
((ruleTableIdentifier)

(ruleTableHeader)

(ruleTableRow)*
)
;

ruleTableIdentifier 

:
('Examples:')
;

ruleTableHeader 

:
(ruleWord)+
;

ruleTableRow 

:
(ruleWord)+
;

ruleScenarioIdentifier 

:
('Scenario:')
;

ruleScenarioDescription 

:
(ruleWord)+
;

ruleGivenBlock 

:
((ruleGivenIdentifier)

(ruleGivenDefinition)

(ruleAndBlock)*
)
;

ruleGivenIdentifier 

:
('Given')
;

ruleWhenBlock 

:
((ruleWhenIdentifier)

(ruleWhenDefinition)

(ruleAndBlock)*
)
;

ruleWhenIdentifier 

:
('When')
;

ruleThenBlock 

:
((ruleThenIdentifier)

(ruleThenDefinition)

(ruleAndBlock)*
)
;

ruleThenIdentifier 

:
('Then')
;

ruleAndBlock 

:
((ruleAndIdentifier)

(ruleAndDefinition)
)
;

ruleAndIdentifier 

:
('And')
;

ruleGivenDefinition 

:
(ruleWord)+
;

ruleWhenDefinition 

:
(ruleWord)+
;

ruleThenDefinition 

:
(ruleWord)+
;

ruleAndDefinition 

:
(ruleWord)+
;

ruleWord :

((RULE_ID
) |
(RULE_STRING
) |
(RULE_INT
) |
(		'.' 
) |
(		':' 
) |
(		',' 
) |
(		'|' 
) |
(		'<' 
) |
(		'>' 
))

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

