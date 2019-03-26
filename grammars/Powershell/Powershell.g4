/* Powershell grammar based on source, let's see it*/
/* https://github.com/PowerShell/PowerShell/blob/037e12eddc850393d2538a26abad4a67e048a989/src/System.Management.Automation/engine/parser/Parser.cs#L766
*/

grammar Powershell;    
        
startRule : scriptBlock EOF;

scriptBlock :
    usingStatements?
    paramBlock?
    statementTerminators?
    scriptBlockBody?
;

usingStatements : usingStatement+;

paramBlock: NEWLINES? attributeList? NEWLINES? 'param' NEWLINES? '(' parameterList? NEWLINES? ')' ;

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
    namedBlockList
    | statementList
;

namedBlockList : namedBlock+;

namedBlock : statementTerminators? blockName statementBlock;

statementBlock : NEWLINES? '{' statementList? NEWLINES? '}';

statementList : statement+;

statement :
    ifStatement
    | LABEL? labeledStatement
    | functionStatement
    | flowControlStatement STATEMENTTERMINATOR
    | trapStatement
    | tryStatement
    | dataStatement
    | pipeline STATEMENTTERMINATOR
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
    | unaryExpression
;

keyExpression :
    SIMPLENAME
    | unaryExpression
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
    | primaryExpression
;

switchBody : NEWLINES? '{' NEWLINES? switchClauses '}';

switchClauses : switchClause+;

switchClause : switchClauseCondition statementBlock statementTerminators?;

switchClauseCondition :
    commandArgument
    | primaryExpression
;

configurationStatement : 'configuration' NEWLINES? singleNameExpression NEWLINES? statementBlock;

singleNameExpression : commandArgument | primaryExpression;

foreachStatement :
    'foreach' NEWLINES? foreachParameters? NEWLINES? '(' NEWLINES? VARIABLE NEWLINES? 'in' NEWLINES? pipeline NEWLINES? ')' statementBlock;

foreachParameters : foreachParameter+ ;

foreachParameter :
    '-parallel'
    | '-throttelimit' NEWLINES? foreachThrottleLimit
;

foreachThrottleLimit :
    commandArgument
    | primaryExpression
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
    | expression redirections? pipelineTail?
    | command pipelineTail?
;    
            
assignmentExpression : expression ASSIGNMENTOPERATOR statement;

pipelineTail : ('|' NEWLINES? command)+;

redirections : redirection+;

redirection :
    MERGINGREDIRECTIONOPERATOR
    | FILEREDIRECTIONOPERATOR redirectedFileName
;

redirectedFileName :
    commandArgument
    | primaryExpression
;

command :
    commandName commandElements?
    | commandInvocationOperator commandModule? commandNameExpr commandElements?
;

commandInvocationOperator : '&' | '.';

commandModule : primaryExpression;

commandName :
    genericTokenWithSubExpr
    | genericToken
;

genericTokenWithSubExpr : GENERICTOKENWITHSUBEXPRSTART statementList? ')' commandName;

genericToken : SIMPLENAME;    

commandNameExpr :
    commandName
    | primaryExpression
;

commandElements : commandElement+ ;

commandElement :
    COMMANDPARAMETER
    | commandArgument
    | redirection
;

  
commandArgument : commandNameExpr;

expression : logicalExpression;

logicalExpression :
    logicalExpression '-and' NEWLINES? bitwiseExpression
    | logicalExpression '-or' NEWLINES? bitwiseExpression
    | logicalExpression '-xor' NEWLINES? bitwiseExpression
    | bitwiseExpression
;

bitwiseExpression :
    bitwiseExpression '-band' NEWLINES? comparisonExpression
    | bitwiseExpression '-bor' NEWLINES? comparisonExpression
    | bitwiseExpression '-bxor' NEWLINES? comparisonExpression
    | comparisonExpression
;

comparisonExpression :
    comparisonExpression comparisonOperator NEWLINES? additiveExpression
    | additiveExpression
;

additiveExpression :
    additiveExpression '+' NEWLINES? multiplicativeExpression
    | additiveExpression '-' NEWLINES? multiplicativeExpression
    | multiplicativeExpression
;    

multiplicativeExpression :
    multiplicativeExpression '*' NEWLINES? formatExpression
    | multiplicativeExpression '/' NEWLINES? formatExpression
    | multiplicativeExpression '%' NEWLINES? formatExpression
    | formatExpression
;

formatExpression :
    formatExpression FORMATOPERATOR NEWLINES? rangeExpression
    | rangeExpression
;

rangeExpression :
    rangeExpression '..' NEWLINES? arrayLiteralExpression
    | arrayLiteralExpression
;

arrayLiteralExpression :
    unaryExpression ',' NEWLINES? arrayLiteralExpression
    | unaryExpression
    ;

unaryExpression :
    primaryExpression
    | expressionWithUnaryOperator
    ;

expressionWithUnaryOperator :
    ',' NEWLINES? unaryExpression
    | '-not' NEWLINES? unaryExpression
    | '!' NEWLINES? unaryExpression
    | '-bnot' NEWLINES? unaryExpression
    | '+' NEWLINES? unaryExpression
    | '-' NEWLINES? unaryExpression
    | preIncrementExpression
    | preDecrementExpression
    | castExpression
    | '-split' NEWLINES? unaryExpression
    | '-join' NEWLINES? unaryExpression
;

preIncrementExpression : '++' NEWLINES? unaryExpression;

preDecrementExpression : '--' NEWLINES? unaryExpression;

castExpression : TYPELITERAL unaryExpression;

/* what about : | invocationExpression*/
primaryExpression :
    VALUE #valueExpr
    | primaryExpression '.' primaryExpression #memberAccessExpr
    | primaryExpression '::' primaryExpression #memberclassAccessExpr
    | primaryExpression '[' NEWLINES? expression NEWLINES? ']' #elementAccessExpr
   // | NEWLINES? expression '--' #postIncrementExpr
   // | NEWLINES? primaryExpression '++' #postDecrementExpr
    | parenthesizedExpression #parenthesizedExpr
    | subExpression #subExpr
    | arrayExpression #arrayExpr 
    | scriptBlockExpression #scriptBlockExpr
    | hashLiteralExpression #hashliteralExpr
;

VALUE :
    SIMPLENAME
    | STRINGLITERAL
    | STRINGLITERALWITHSUBEXPRESSION
    | LITERAL
    | TYPELITERAL
    | VARIABLE
;                        

hashtable : hashLiteralExpression;    
    
hashLiteralExpression :
    '@{' NEWLINES? hashLiteralBody? NEWLINES? '}' ;

hashLiteralBody : hashEntry (statementTerminators hashEntry)* ;

statementTerminators : STATEMENTTERMINATOR+ ;

hashEntry : keyExpression '=' NEWLINES? statement;

scriptBlockExpression : '{' NEWLINES? scriptBlock NEWLINES? '}';

arrayExpression : '@(' NEWLINES? statementList? NEWLINES? ')';

subExpression : '$(' NEWLINES? statementList? NEWLINES? ')';

parenthesizedExpression : '(' NEWLINES? pipeline NEWLINES? ')' ;

memberName :
    SIMPLENAME
    | STRINGLITERAL
    | STRINGLITERALWITHSUBEXPRESSION
    /*| expressionWithUnaryOperator*/
    /*| primaryExpression*/
;

/*memberAccess :
    primaryExpression '.' memberName
    | primaryExpression '::' memberName
;
*/
//invocationExpression : targetExpression memberName invokeParamList;

//targetExpression : expression;

/*invokeParamList :
    '(' invokeParamParentList
    | scriptBlock
;

invokeParamParentList : scriptBlock ')';
*/  
argumentList : '(' argumentExpressionList? NEWLINES? ')';

argumentExpressionList : argumentExpression (NEWLINES? ',' argumentExpression)* ;

argumentExpression : expression (',' expression)*;

//elementAccess : primaryExpression '[' NEWLINES? expression NEWLINES? ']';


blockName : ('dynamicparam' | 'begin' | 'process' | 'end');
                    

//lexer rule

comparisonOperator:
    DEQ | DNE | DGE | DGT | DLT | DLE | DIEQ | DINE | DIGE | DIGT | DILT | DILE | DCEQ | DCNE | DCGE |DCGT | DCLT | CLE | DLIKE | DNOTLIKE | DMATCH | DNOTMATCH | DILIKE | DINOTLIKE | DIMATCH | DINOTMATCH | DCLIKE | DCNOTLIKE | DCMATCH | DCNOTMATCH | DCONTAINS | DNOTCONTAINS | DICONTAINS | DINOTCONTAINS | DCCONTAINS | DCNOTCONTAINS | DISNOT | DIS | DAS | DREPLACE | DIREPLACE | DCREPLACE;

ASSIGNMENTOPERATOR : '=' | '+=' | '-=' | '*=' | '/=' | '%=';

FORMATOPERATOR : '-f';

//we might see another combination, please compltete    
MERGINGREDIRECTIONOPERATOR : '2>&1' | '3>&1' | '4>&1' | '5>&1' | '6>&1' | '1>&2'; 
FILEREDIRECTIONOPERATOR :  '>>' | '>' | '<<' | '<' | '>|' | '2>' | '2>>' | '1>>' | '3>' | '3>>' | '4>' | '4>>' | '5>' | '5>>' | '*>' | '*>>';    
    
VARIABLE :
    '$' [a-zA-Z0-9]+
    | '$' '{' ANY_CHAR+ '}'
;

IDENTIFIER : [a-zA-Z0-9_.]+;

COMMANDPARAMETER : ('-'|'--') [a-zA-Z] ':'?;        
    
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
    
STATEMENTTERMINATOR : ';' | '\n' | '\r';             
NEWLINES : '\r' '\n' | [\r\n\u2028\u2029];

STRINGLITERAL :
    '"' (~["\r\n] | '""')* '"'
    | '\'' (~["\r\n] | '\'\'')* '\'';

STRINGLITERALWITHSUBEXPRESSION :
    '"' ( (~["\r\n] | '""')* '$(' (~["\r\n] | '""')* ')' (~["\r\n] | '""')* )* '"';

GENERICTOKENWITHSUBEXPRSTART : '$(';    
        
TYPENAMEIDENTIFIERCHAR : [a-zA-Z0-9_äöüÄÖÜ.`]+;
TYPELITERAL : '[' [a-zA-Z0-9.]+ ']';
LABEL : ':' [a-zA-Z0-9.]+;
LITERAL : ':' [a-zA-Z0-9]+;
SIMPLENAME : [a-zA-Z0-9]+;    
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

