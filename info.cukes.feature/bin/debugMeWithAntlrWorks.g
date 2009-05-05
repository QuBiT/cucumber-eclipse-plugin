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
(ruleFeature)
;

ruleFeature 

:
((ruleFeatureIdentifier)

(ruleFeatureDescription)

(ruleBusinessValueDefinition)

(ruleRoleDefinition)

(ruleSomeActionDefinition)

(ruleScenario)*
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
((RULE_BusinessValueIdentifier)

(ruleBusinessValueDescription)
)
;

RULE_BusinessValueIdentifier :

	 'In order to '
;

ruleBusinessValueDescription 

:
(ruleWord)+
;

ruleRoleDefinition 

:
((RULE_RoleIdentifier)

(ruleRoleDescription)
)
;

RULE_RoleIdentifier :

	 'As a '|'As an '
;

ruleRoleDescription 

:
(ruleWord)+
;

ruleSomeActionDefinition 

:
((RULE_SomeActionIdentifier)

(ruleSomeActionDescription)
)
;

RULE_SomeActionIdentifier :

	 'I want to '
;

ruleSomeActionDescription 

:
(ruleWord)+
;

ruleScenario 

:
((ruleScenarioIdentifier)

(ruleScenarioDescription)

(ruleGivenBlock)

(ruleWhenBlock)

(ruleThenBlock)
)
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
(RULE_NotInorderto
) |
(RULE_NotAsa
) |
(RULE_NotIwantto
) |
(		'.' 
))

;

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

