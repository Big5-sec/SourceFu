grammar Powershell2;

startRule: statementList EOF;

statementList : statement ( STATEMENTTERMINATOR statement)*;

statement:
    ifStatement
    //| LABEL? labeledStatement
    //| functionStatement
    //parameterDeclaration
    | flowControlStatement
    | trapStatement
    //| finallyStatement
    | pipeline
;    

labeledStatement :
    switchStatement
    | foreachStatement
    | forStatement
    | whileStatement
    | doStatement
;

pipeline :
    assignmentExpression
    | firstPipelineElement ( '|' cmdletCall)*
;

assignmentExpression : lvalueExpression ASSIGNMENTOPERATOR pipeline;

lvalueExpression : lvalue ('[' lvalue ']' | '|' lvalue)*;

lvalue : simplelvalue propertyorarrayreferenceoperator*;

simplelvalue : attributespecificationtoken* variableToken;

firstPipelineElement :
    expression
    | cmdletCall
    ;

cmdletCall:
    commandInvocationOperator? (name |expression) commandElement*;

commandInvocationOperator : '&' | '.' ;

commandElement :
    ParameterToken
    | ParameterArgumentToken
    | postfixOperator
    | redirection
    ;

redirection:
    redirectionOperator propertyorarrayreference
    ;                            


ifStatement : 'if' NEWLINES? '(' pipeline ')' statementBlock elseifClause* elseClause?;

elseifClause : 'elseif' NEWLINES? '(' pipeline ')' statementBlock;

elseClause : 'else' statementBlock;

switchStatement : 'switch' NEWLINES? switchParameter* switchCondition switchBody;

switchParameter :
    '-regex'
    | '-wildcard'
    | '-exact'
    | '-casesensitive'
    | '-parallel';

switchCondition :
    '(' NEWLINES? pipeline NEWLINES? ')'
    | '-file' NEWLINES? switchFilename
;

switchFilename : propertyorarrayreference;

switchBody : NEWLINES? '{' NEWLINES? switchClause* '}';

switchClause : switchClauseCondition statementBlock;

switchClauseCondition :
    'default'
    | Parameterargumenttoken
    | propertyorarrayreference
    | statementBlock
;

    /*
foreachStatement :
    'foreach' NEWLINES? foreachParameters? NEWLINES? '(' NEWLINES? variableToken NEWLINES? 'in' NEWLINES? pipeline NEWLINES? ')' statementBlock;

foreachParameters : foreachParameter+ ;

foreachParameter :
    '-parallel'
    | '-throttelimit' NEWLINES? foreachThrottleLimit
;

foreachThrottleLimit :
    commandArgument
    | expression
;

    */

trapStatement : 'trap' NEWLINES? TYPELITERAL? statementBlock;

flowControlStatement :
    'break' labelExpression?
    | 'continue' labelExpression?
    | 'throw' pipeline?
    | 'return' pipeline?
    | 'exit' pipeline?
;

labelExpression :
    propertyNameToken
    | propertyorarrayreference
    ;

/*    
functionStatement :
    'function' NEWLINES? functionName functionParameterDeclaration? '{' scriptBlock '}'
    | 'filter' NEWLINES? functionName functionParameterDeclaration? '{' scriptBlock '}'
    | 'workflow' NEWLINES? functionName functionParameterDeclaration? '{' scriptBlock '}'
; */



expression
    : expression '.' expression                           #memberAccessExpression
    | expression '::' expression                          #memberClassAccessExpression
    | expression '[' NEWLINES? expression NEWLINES? ']'   #elementAccessExpre
    | TYPELITERAL expression                              #castExpression
    | '-join' NEWLINES? expression                        #joinExpression
    | '-split' NEWLINES? expression                       #splitExpression
    | '++' expression                                     #preIncrementExpression
    | '--' expression                                     #preDecrementExpression
    | '+' expression                                      #unaryPlusExpression
    | '-' expression                                      #unaryMinusExpression
    | ('-not'| '-bnot') NEWLINES? expression              #notExpression
    | '!' expression                                      #notexclamExpression
    | expression '..' NEWLINES? expression                #rangeExpression
    | expression '-f' NEWLINES? expression                #formatExpression
    | expression ('*' | '/' | '%') NEWLINES? expression   #multiplicativeExpression
    | expression ('+'|'-') NEWLINES? expression           #additiveExpression
    | expression comparisonOperator NEWLINES? expression  #comparisonExpression
    | expression '-bxor' NEWLINES? expression             #bxorExpression    
    | expression '-bor' NEWLINES? expression              #borExpression
    | expression '-band' NEWLINES? expression             #bandExpression
    | expression '-xor' NEWLINES? expression              #xorExpression    
    | expression '-or' NEWLINES? expression               #orExpression
    | expression '-and' NEWLINES? expression              #andExpression 
    | value                                               #valueExpression
    //| arrayExpression                                     #arrayLiteralExpression
    //| subExpression                                       #subLiteralExpression
    //| scriptBlockExpression                               #scriptBlockLiteralExpression
    //| hashExpression                                      #hashLiteralExpression  => todo in future
    //| parenthesizedExpression                             #parenthesisExpression
    ;


value:
    //'(' assignmentExpression ')'
    //| '$(' statementList ')'
    //| '@(' statementList ')'
    //| '@{' hashliteral '}'
    //| cmdletbody
    //| Attributespecificationtoken propertyorarrayreference
    | NumberToken
    | LiteralStringToken
    | ExpandableStringToken
    | VariableToken
    ;

TYPELITERAL : '[' [a-zA-Z0-9.]+ ']';

ExpandableStringToken : '"' .* '"';
LiteralStringToken : '\'' .* '\'';
VariableToken :
    '$' [a-zA-Z0-9]+
    | '$' '{' .+ '}'
;

ParameterToken : '-' [a-ZA-Z] ':'?;

Parameterargumenttoken : ~[\n\r\t $\])];

MultiLineComment:               '<#' .*? '#>'             -> channel(HIDDEN);
SingleLineComment:              '#' ~[\r\n]* -> channel(HIDDEN);
WhiteSpaces:                    [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN);

                