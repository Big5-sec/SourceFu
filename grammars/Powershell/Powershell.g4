/* Powershell grammar based on source, let's see it*/
/* https://github.com/PowerShell/PowerShell/blob/037e12eddc850393d2538a26abad4a67e048a989/src/System.Management.Automation/engine/parser/Parser.cs#L766
*/

grammar Powershell;


startRule: scriptBlockBody? EOF;
    
/*        
startRule : scriptBlock EOF;
*/
scriptBlock :
    //usingStatements?
    //paramBlock?
    //statementTerminators?
    scriptBlockBody?
;
/*
usingStatements : usingStatement+;

usingStatement :
    'using' 'namespace' IDENTIFIER '=' IDENTIFIER 
    | 'using' 'namespace' IDENTIFIER
    | 'using' 'module' IDENTIFIER '=' IDENTIFIER
    | 'using' 'module' IDENTIFIER
    | 'using' 'module' IDENTIFIER '=' hashtable
    | 'using' 'module' hashtable
    | 'using' 'type' IDENTIFIER '=' IDENTIFIER
    | 'using' 'assembly' IDENTIFIER
    | 'using' 'command' IDENTIFIER '=' IDENTIFIER
;

    
paramBlock: NEWLINES? attributeList? NEWLINES? 'param' NEWLINES? '(' parameterList? NEWLINES? ')' ;
*/
parameterList : scriptParameter ( NEWLINES? ',' scriptParameter )* ;

scriptParameter : NEWLINES? attributeList? NEWLINES? VARIABLE scriptParameterDefault? ;

scriptParameterDefault : NEWLINES? '=' NEWLINES? expression;

attributeList : attribute+ ;

attribute : '[' attributeName '(' attributeArguments ')' ']' ;

attributeName : typeSpec;

attributeArguments : attributeArgument ( NEWLINES? ',' attributeArgument )* ;

attributeArgument :
    NEWLINES? expression
    | NEWLINES? PROPERTYNAME '=' NEWLINES? expression
;

typeSpec :
    arrayTypeName dimension? ']'
    | genericTypeName genericTypeArguments ']'
    | typeName
;

arrayTypeName : typeName '[';

genericTypeName : typeName '[';

dimension : (',')*;

genericTypeArguments : typeSpec (',' typeSpec)* ;

typeName : namespaceTypeName (',' assemblyNameSpec)? ;

namespaceTypeName :
    nestedTypeName
    | namespaceSpec '.' nestedTypeName
;

assemblyNameSpec : LABEL;
    
nestedTypeName : typeNameIDENTIFIER ( '+' typeNameIDENTIFIER)* ;

namespaceSpec : typeNameIDENTIFIER ('.' typeNameIDENTIFIER)* ;

typeNameIDENTIFIER : TYPENAMEIDENTIFIERCHAR+ ;

scriptBlockBody :
    statementBlock
    | statementList
;

statementBlock : NEWLINES? '{' statementList? NEWLINES? '}';

statementList : (statement STATEMENTTERMINATOR)*;

statement :
    ifStatement 
    | LABEL? labeledStatement
    | functionStatement
    | flowControlStatement 
    | trapStatement
    | tryStatement
    | dataStatement
    | pipeline 
;

labeledStatement :
    switchStatement
    | foreachStatement
    | forStatement
    | whileStatement
    | doStatement
;

flowControlStatement :
    'break' labelExpression?
    | 'continue' labelExpression?
    | 'throw' pipeline?
    | 'return' pipeline?
    | 'exit' pipeline?
;

labelExpression :
    SIMPLENAME
    | expression
;

keyExpression :
    SIMPLENAME
    | expression
;

//blockStatement : keyword statementBlock;

//this part of the grammar is quite unclear    
//command : InlineScript scriptBlockExpression;

ifStatement : 'if' NEWLINES? '(' pipeline ')' statementBlock elseifClauses? elseClause?;

elseifClauses : elseifClause+;

elseifClause : 'elseif' NEWLINES? '(' pipeline ')' statementBlock;

elseClause : 'else' statementBlock;

switchStatement : 'switch' NEWLINES? switchParameters? switchCondition switchBody;

switchParameters : switchParameter+;

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

switchFilename :
    commandArgument
    | expression
;

switchBody : NEWLINES? '{' NEWLINES? switchClauses '}';

switchClauses : switchClause+;

switchClause : switchClauseCondition statementBlock statementTerminators?;

switchClauseCondition :
    commandArgument
    | expression
;

configurationStatement : 'configuration' NEWLINES? singleNameExpression NEWLINES? statementBlock;

singleNameExpression : commandArgument | expression;

foreachStatement :
    'foreach' NEWLINES? foreachParameters? NEWLINES? '(' NEWLINES? VARIABLE NEWLINES? 'in' NEWLINES? pipeline NEWLINES? ')' statementBlock;

foreachParameters : foreachParameter+ ;

foreachParameter :
    '-parallel'
    | '-throttelimit' NEWLINES? foreachThrottleLimit
;

foreachThrottleLimit :
    commandArgument
    | expression
;

forStatement :
    'for' NEWLINES? '(' NEWLINES? forInitializer? STATEMENTTERMINATOR NEWLINES? forCondition? STATEMENTTERMINATOR NEWLINES? forIterator? NEWLINES? ')' statementBlock
    | 'for' NEWLINES? '(' NEWLINES? forInitializer? STATEMENTTERMINATOR NEWLINES? forCondition? NEWLINES? ')' statementBlock
    | 'for' NEWLINES? '(' NEWLINES? forInitializer? NEWLINES? ')' statementBlock
;

forInitializer : pipeline;

forCondition : pipeline;

forIterator : pipeline;

whileStatement : 'while' NEWLINES? '(' NEWLINES? whileCondition NEWLINES? ')' statementBlock;

doStatement :
    'do' statementBlock NEWLINES? 'while' NEWLINES? '(' whileCondition NEWLINES? ')'
    | 'do' statementBlock NEWLINES? 'until' NEWLINES? '(' whileCondition NEWLINES? ')'
;

whileCondition : NEWLINES? pipeline;

classStatement :
    attributeList? 'class' NEWLINES? className NEWLINES? '{' classMemberList '}'
    | attributeList? 'class' NEWLINES? className NEWLINES? ':' baseTypeList '{' classMemberList '}'
;

className : SIMPLENAME;

baseTypeList :
    NEWLINES? typeName NEWLINES?
    | baseClassList ',' NEWLINES? typeName NEWLINES?
;

baseClassList : (baseClass NEWLINES)+;

baseClass : className;        
    
classMemberList : (classMember NEWLINES?)+;

classMember :
    methodMember
    | propertyMember
    ;

methodMember : memberAttributeList? functionStatement;

propertyMember :
    memberAttributeList? VARIABLE '=' expression
    | memberAttributeList? VARIABLE
;

memberAttributeList : memberAttribute+ ;

memberAttribute :
    attribute
    | 'static'
    | 'hidden'
;

enumStatement : 'enum' NEWLINES? enumName '{' enumMemberList '}';

enumName : SIMPLENAME;

enumMemberList : (enumMember NEWLINES?)+ ;

enumMember :
    enumMemberName '=' expression
    | enumMemberName
;

enumMemberName : SIMPLENAME ;

methodStatement : NEWLINES? functionName functionParameterDeclaration baseCtorCall? '{' scriptBlock '}' ;

baseCtorCall : ':' NEWLINES? 'base' NEWLINES? parenthesizedExpression NEWLINES?;

functionStatement :
    'function' NEWLINES? functionName functionParameterDeclaration? '{' scriptBlock '}'
    | 'filter' NEWLINES? functionName functionParameterDeclaration? '{' scriptBlock '}'
    | 'workflow' NEWLINES? functionName functionParameterDeclaration? '{' scriptBlock '}'
;

functionName : commandArgument;

functionParameterDeclaration : NEWLINES? '(' parameterList NEWLINES? ')';

trapStatement : 'trap' NEWLINES? TYPELITERAL? statementBlock;
    
tryStatement :
     'try' statementBlock catchClauses finallyClause
    | 'try' statementBlock finallyClause    
    | 'try' statementBlock catchClauses
    ;

catchClauses : catchClause+ ;
    
catchClause : NEWLINES? 'catch' catchTypeList? statementBlock;

catchTypeList : NEWLINES? TYPELITERAL (NEWLINES? ',' NEWLINES? TYPELITERAL)*;

finallyClause : NEWLINES? 'finally' statementBlock;

dataStatement : 'data' NEWLINES? dataName dataCommandsAllowed? statementBlock;

dataName : SIMPLENAME;

dataCommandsAllowed : NEWLINES? '-suportedcommand' dataCommandsList;

dataCommandsList : NEWLINES? dataCommand (',' NEWLINES? dataCommand)*;

dataCommand : commandNameExpr;

pipeline :
    assignmentExpression
    | command pipelineTail?
    | expression redirections? pipelineTail?
;    

//pipelineexpr: expression redirections? pipelineTail?;
    
                
assignmentExpression : expression assignmentOperator statement;
//assignmentExpression : expression '=' statement;
//assignmentExpression : expression ASSIGNMENTOPERATOR expression;    

pipelineTail : ('|' NEWLINES? command)+;

redirections : redirection+;

redirection :
    mergingredirectionoperator
    | fileredirectionoperator redirectedFileName
;

redirectedFileName :
    commandArgument
    | expression
;

command :
    commandName commandElement*
    | commandInvocationOperator commandModule? commandNameExpr commandElement*
;

commandInvocationOperator : '&' | '.';

commandModule : expression;

commandName :
    //genericTokenWithSubExpr
    genericToken
;

//genericTokenWithSubExpr : GENERICTOKENWITHSUBEXPRSTART statementList? ')' commandName;

genericToken : SIMPLENAME;    

commandNameExpr :
    commandName
    | expression
;

commandElement :
    commandNameExpr
    | redirection
    | COMMANDPARAMETER
;

  
commandArgument : commandNameExpr;

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

value :
    SIMPLENAME
    | STRINGLITERAL
    | STRINGLITERALWITHSUBEXPRESSION
    | LITERAL
    | TYPELITERAL
    | VARIABLE
;                        

/*    
hashtable : hashLiteralExpression;    
    
hashLiteralExpression :
    '@{' NEWLINES? hashLiteralBody? NEWLINES? '}' ;
*/
//hashLiteralBody : hashEntry (statementTerminators hashEntry)* ;

statementTerminators : STATEMENTTERMINATOR+ ;
/*
hashEntry : keyExpression '=' NEWLINES? statement;

scriptBlockExpression : '{' NEWLINES? scriptBlock NEWLINES? '}';

arrayExpression : '@(' NEWLINES? statementList? NEWLINES? ')';

subExpression : '$(' NEWLINES? statementList? NEWLINES? ')';
*/
parenthesizedExpression : '(' NEWLINES? pipeline NEWLINES? ')' ;

memberName :
    SIMPLENAME
    | STRINGLITERAL
    | STRINGLITERALWITHSUBEXPRESSION
;

argumentList : '(' argumentExpressionList? NEWLINES? ')';

argumentExpressionList : argumentExpression (NEWLINES? ',' argumentExpression)* ;

argumentExpression : expression (',' expression)*;

blockName : ('dynamicparam' | 'begin' | 'process' | 'end');
                    



comparisonOperator:
    DEQ | DNE | DGE | DGT | DLT | DLE | DIEQ | DINE | DIGE | DIGT | DILT | DILE | DCEQ | DCNE | DCGE |DCGT | DCLT | CLE | DLIKE | DNOTLIKE | DMATCH | DNOTMATCH | DILIKE | DINOTLIKE | DIMATCH | DINOTMATCH | DCLIKE | DCNOTLIKE | DCMATCH | DCNOTMATCH | DCONTAINS | DNOTCONTAINS | DICONTAINS | DINOTCONTAINS | DCCONTAINS | DCNOTCONTAINS | DISNOT | DIS | DAS | DREPLACE | DIREPLACE | DCREPLACE;

//lexer rule

MultiLineComment:               '<#' .*? '#>'             -> channel(HIDDEN);
SingleLineComment:              '#' ~[\r\n]* -> channel(HIDDEN);
WhiteSpaces:                    [\t\u000B\u000C\u0020\u00A0]+ -> channel(HIDDEN);
           
assignmentOperator : '=' | '+=' | '-=' | '*=' | '/=' | '%=';

FORMATOPERATOR : '-f';

//we might see another combination, please compltete    
mergingredirectionoperator : '2>&1' | '3>&1' | '4>&1' | '5>&1' | '6>&1' | '1>&2'; 
fileredirectionoperator :  '>>' | '>' | '<<' | '<' | '>|' | '2>' | '2>>' | '1>>' | '3>' | '3>>' | '4>' | '4>>' | '5>' | '5>>' | '*>' | '*>>';    
    
VARIABLE :
    '$' [a-zA-Z0-9]+
    | '$' '{' ANY_CHAR+ '}'
;

//IDENTIFIER : [a-zA-Z0-9_.]+;

COMMANDPARAMETER : ('-'|'--') [a-zA-Z]+ ':'?;        
    
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
    
STATEMENTTERMINATOR : ';' | '\r\n'+;             
NEWLINES : ('\r\n'+) ;

STRINGLITERAL :
    '"' (~["\r\n] | '""')* '"'
    | '\'' (~["\r\n] | '\'\'')* '\'';

STRINGLITERALWITHSUBEXPRESSION :
    '"' ( (~["\r\n] | '""')* '$(' (~["\r\n] | '""')* ')' (~["\r\n] | '""')* )* '"';

GENERICTOKENWITHSUBEXPRSTART : '$(';    
        
TYPENAMEIDENTIFIERCHAR : [a-zA-Z0-9_äöüÄÖÜ.`];
TYPELITERAL : '[' [a-zA-Z0-9.]+ ']';
LABEL : [a-zA-Z0-9.]+ ':';
LITERAL : ':' [a-zA-Z0-9]+;
SIMPLENAME : [a-zA-Z0-9\-.]+;    
PROPERTYNAME : [a-zA-Z]+;
    
fragment LETTER : [a-zA-Z_äöüÄÖÜ];
fragment DIGIT : [0-9];
fragment LETTERORDIGIT : [a-zA-Z0-9_äöüÄÖÜ];
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
fragment ANY_CHAR : .;

