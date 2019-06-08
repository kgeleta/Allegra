grammar SomeLanguage ;

classDeclaration : CLASS className IS (variableDeclaration)* (function)* BEGIN END;
className : ID ;

instruction : ID SEMI ;

variableDeclaration : TYPE ID SEMI ;

function : FUNCTION ID LEFT_PAREN (argument)? RIGHT_PAREN RETURN TYPE IS BEGIN (instruction | assignment)* END ;
argument : (TYPE COLON ID COMMA)*(TYPE COLON ID) ;

assignment : ID ASSIGN value SEMI;

value : STRING_VALUE | expression | functionCall;


expression : expression (TIMES | DIV) expression
    | expression (PLUS | MINUS) expression
    | LEFT_PAREN expression RIGHT_PAREN
    | (MINUS)? (ID | INTEGER_VALUE);


functionCall : ID LEFT_PAREN ((value COMMA)* value)? RIGHT_PAREN ;

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

ASSIGN : ':=' ;

TYPE : 'Integer' | 'String' ;


INTEGER_VALUE : '0' | [1-9][0-9]* ;
STRING_VALUE : '"' ~["]* '"';

ID : [A-Za-z]+[a-zA-Z0-9]* ;
WS: [ \t\n\r]+ -> skip ;