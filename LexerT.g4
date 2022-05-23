lexer grammar LexerT;

BEGIN: 'Ingredientes';
END: 'Disfrute!';
BEGINRECETA: 'Instrucciones';

VARNAME: [A-Z]+ [a-z]+ ;
CADENA: [a-z]+ ;
INT: [0-9]+;
FLOAT: [0-9]+ ',' [0-9]+;

OR: 'o';
AND: 'y';

WS : [ \t\r\n]+ -> skip ;
