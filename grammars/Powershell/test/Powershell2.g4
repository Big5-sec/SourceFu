grammar Powershell2;

startRule: statementList EOF;

statementList : statement ( STATEMENTTERMINATOR statement)*;

statement:
    ifStatement
    | LABEL? labeledStatement
    //| functionStatement
    //parameterDeclaration
    | flowControlStatement
    | trapStatement
    //| finallyStatement
    | pipeline
;    

labeledStatement :
    switchStatement
/*    | foreachStatement
    | forStatement
    | whileStatement
    | doStatement*/
;

pipeline :
    assignmentExpression
    | firstPipelineElement ( '|' cmdletCall)*
;

assignmentExpression : lvalueExpression ASSIGNMENTOPERATOR pipeline;

lvalueExpression : lvalue ('[' lvalue ']' | '|' lvalue)*;

lvalue : simplelvalue propertyorarrayreferenceoperator*;

simplelvalue : TYPELITERAL* VariableToken;

firstPipelineElement :
    expression
    | cmdletCall
    ;

cmdletCall:
    commandInvocationOperator? (CmdletName |expression) commandElement*;

commandInvocationOperator : '&' | '.' ;

commandElement :
    ParameterToken
    | ParameterArgumentToken
    | PostfixOperator
    | redirection
    ;

redirection:
    redirectionOperator propertyorarrayreference
    ;                            


statementBlock : '{' statementList '}';    

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
    | ParameterArgumentToken
    | propertyorarrayreference
    | statementBlock
;

propertyorarrayreference : value propertyorarrayreferenceoperator*;

propertyorarrayreferenceoperator:
    '[' expression ']'
    //| '.' propertyNameToken parseCall?
    | '.' value
    ;
    
    /*
foreachStatement :
    'foreach' NEWLINES? foreachParameters? NEWLINES? '(' NEWLINES? VariableToken NEWLINES? 'in' NEWLINES? pipeline NEWLINES? ')' statementBlock;

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
    PropertyNameToken
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

PostfixOperator : '++' | '--';
    
TYPELITERAL : '[' [a-zA-Z0-9.]+ ']';

ExpandableStringToken : '"' ()*? '"';
LiteralStringToken : '\'' ()*? '\'';
VariableToken :
    '$' [a-zA-Z0-9]+
    | '$' '{' ()+? '}'
;

ParameterToken : '-' [a-zA-Z0-9] ':'?;

ParameterArgumentToken : [a-AA-Z0-9()+.-]+;

PropertyNameToken : [a-zA-Z]+;

CmdletName : [a-aA-Z0-9.-]+;

NEWLINES : '\r\n'+ | '\n'+ | [\r\n\u2028\u2029]+;
            
MultiLineComment:               '<#' .*? '#>'             -> channel(HIDDEN);
SingleLineComment:              '#' ~[\r\n]* -> channel(HIDDEN);
WhiteSpaces:                    [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN);

comparisonOperator:
    DEQ | DNE | DGE | DGT | DLT | DLE | DIEQ | DINE | DIGE | DIGT | DILT | DILE | DCEQ | DCNE | DCGE |DCGT | DCLT | CLE | DLIKE | DNOTLIKE | DMATCH | DNOTMATCH | DILIKE | DINOTLIKE | DIMATCH | DINOTMATCH | DCLIKE | DCNOTLIKE | DCMATCH | DCNOTMATCH | DCONTAINS | DNOTCONTAINS | DICONTAINS | DINOTCONTAINS | DCCONTAINS | DCNOTCONTAINS | DISNOT | DIS | DAS | DREPLACE | DIREPLACE | DCREPLACE;

ASSIGNMENTOPERATOR : '=' | '+=' | '-=' | '*=' | '/=' | '%=';
    
redirectionOperator : '2>&1' | '3>&1' | '4>&1' | '5>&1' | '6>&1' | '1>&2'; 

NumberToken : [0-9]+ ('.' [0-9]+)?;
        
DEQ : '-' E Q;
DNE : '-' N E; 
DGE : '-' G E;
DGT : '-' G T;
DLT : '-' L T;
DLE : '-' L E;
DIEQ : '-' I E Q;
DINE : '-' I N E;
DIGE : '-' I G E;
DIGT : '-' I G T;
DILT : '-' I L T;
DILE : '-' I L E;
DCEQ : '-' C E Q;
DCNE : '-' C N E;
DCGE : '-' C G E;
DCGT : '-' C G T;
DCLT : '-' C L T;
CLE : '-' C L E; 
DLIKE : '-'  L I K E;
DNOTLIKE : '-' N O T L I K E;
DMATCH : '-' M A T C H;
DNOTMATCH : '-' N O T M A T C H;
DILIKE : '-' I L I K E;
DINOTLIKE : '-' I N O T L I K E;
DIMATCH : '-' I M A T C H;
DINOTMATCH : '-' I N O T M A T C H;
DCLIKE : '-' C L I K E;
DCNOTLIKE : '-' C N O T L I K E;
DCMATCH : '-' C M A T C H;
DCNOTMATCH : '-' C N O T M A T C H;
DCONTAINS : '-' C O N T A I N S;
DNOTCONTAINS : '-' N O T C O N T A I N S;
DICONTAINS : '-' I C O N T A I N S;
DINOTCONTAINS : '-' I N O T C O N T A I N S;
DCCONTAINS : '-' C C O N T A I N S;
DCNOTCONTAINS : '-' C N O T C O N T A I N S;
DISNOT : '-' I S N O T;
DIS : '-' I S;
DAS : '-' A S;
DREPLACE : '-' R E P L A C E; 
DIREPLACE : '-' I R E P L A C E;
DCREPLACE : '-' C R E P L A C E;

STATEMENTTERMINATOR : ';' | '\n' | '\r' | '\r\n';
LABEL : [a-zA-Z0-9.]+ ':';

       
    
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');                        