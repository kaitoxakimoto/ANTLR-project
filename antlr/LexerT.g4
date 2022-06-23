lexer grammar LexerT;

BEGIN: 'Ingredientes';
END: 'Disfrute!';
BEGINRECETA: 'Instrucciones';

ASIGN: 'utilizaremos';
INPUT: 'recomendacion del chef:';
OUTPUT: 'emplate';

VARNAME: [a-z]+ ;
CADENA: '"'[a-z]+ '"' ;
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]+;


OR: 'o';
AND: 'y';

MAYOR: 'haya mas';
MENOR: 'haya menos';
EQUAL: 'haya los mismos';
NOTEQUAL: 'no haya los mismos';

WS : [ \t\r\n]+ -> skip ;