expression
    :    
    | expression '.' expression                           #memberAccessExpression
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
    | arrayExpression                                     #arrayLiteralExpression
    | subExpression                                       #subLiteralExpression
    | scriptBlockExpression                               #scriptBlockLiteralExpression
    //| hashExpression                                      #hashLiteralExpression  => todo in future
    | '(' expression ')'                                  #parenthesizedExpression
    ;

value :
    SIMPLENAME
    | STRINGLITERAL
    | STRINGLITERALWITHSUBEXPRESSION
    | LITERAL
    | TYPELITERAL
    | VARIABLE
    ;

scriptBlockExpression : '{' NEWLINES? scriptBlock NEWLINES? '}';       

arrayExpression : '@(' NEWLINES? statementList? NEWLINES? ')';

subExpression : '$(' NEWLINES? statementList? NEWLINES? ')';

parenthesizedExpression : '(' NEWLINES? pipeline NEWLINES? ')' ;

    

comparisonOperator:
    DEQ | DNE | DGE | DGT | DLT | DLE | DIEQ | DINE | DIGE | DIGT | DILT | DILE | DCEQ | DCNE | DCGE |DCGT | DCLT | CLE | DLIKE | DNOTLIKE | DMATCH | DNOTMATCH | DILIKE | DINOTLIKE | DIMATCH | DINOTMATCH | DCLIKE | DCNOTLIKE | DCMATCH | DCNOTMATCH | DCONTAINS | DNOTCONTAINS | DICONTAINS | DINOTCONTAINS | DCCONTAINS | DCNOTCONTAINS | DISNOT | DIS | DAS | DREPLACE | DIREPLACE | DCREPLACE;

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


            