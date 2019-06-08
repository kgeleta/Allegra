grammar SomeLanguage ;

classDeclaration : CLASS className IS (variableDeclaration)* (function)* BEGIN (line)* END;
className : ID ;

//instruction : ID SEMI ;


variableDeclaration : TYPE ID SEMI ;

function : FUNCTION ID LEFT_PAREN (argument)? RIGHT_PAREN RETURN TYPE IS BEGIN (line)* RETURN value SEMI END ;
argument : (TYPE COLON ID COMMA)*(TYPE COLON ID) ;

assignment : ID ASSIGN value SEMI;

value : STRING_VALUE | expression | functionCall;


expression : expression (TIMES | DIV) expression
    | expression (PLUS | MINUS) expression
    | LEFT_PAREN expression RIGHT_PAREN
    | (MINUS)? (ID | INTEGER_VALUE);


functionCall : ID LEFT_PAREN ((value COMMA)* value)? RIGHT_PAREN ;


logicalEquation : logicalEquation (AND | OR) logicalEquation
    | LEFT_PAREN logicalEquation RIGHT_PAREN
    | expression ( EQUAL | GREATER_EQUAL | GREATER | LESSER | LESSER_EQUAL) expression ;

printfCall : PRINTF LEFT_PAREN value RIGHT_PAREN SEMI;

line : ( assignment | printfCall) ;

CLASS : 'class' ;
IS : 'is' ;
BEGIN : 'begin' ;
END : 'end' ;
RETURN : 'return' ;
FUNCTION : 'function' ;

TIMES : '*' ;
DIV : '/';
PLUS : '+' ;
MINUS : '-' ;

COLON : ':';
SEMI : ';' ;
COMMA : ',' ;

LEFT_PAREN : '(' ;
RIGHT_PAREN : ')' ;

EQUAL : '==' ;
GREATER : '>' ;
LESSER : '<' ;
GREATER_EQUAL : '>=';
LESSER_EQUAL : '<=';

AND : '&&' ;
OR : '||' ;

PRINTF : 'printf' ;

RELATION_OPERATOR : ( EQUAL | GREATER_EQUAL | GREATER | LESSER | LESSER_EQUAL) ;

ASSIGN : ':=' ;

TYPE : 'Integer' | 'String' ;


INTEGER_VALUE : '0' | [1-9][0-9]* ;
STRING_VALUE : '"' ~["]* '"';

ID : [A-Za-z]+[a-zA-Z0-9]* ;
WS: [ \t\n\r]+ -> skip ;