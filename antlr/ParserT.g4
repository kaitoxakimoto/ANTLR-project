grammar ParserT;
import LexerT;

program	: BEGIN constan BEGINRECETA receta END;

constan	: declavar* ;
receta	: statement* ;

declavar : linea | entero | flotante ;

linea	: VARNAME 'marca' CADENA; 
entero		: INT VARNAME ;
flotante	: FLOAT 'kg de' VARNAME ;

statement : operacion | ciclo | asignacion | lectura | impresion | reemplazo;

operacion: suma | multiplicacion | resta | sqrt | cos | sin;
ciclo: si | mientras ;
asignacion: ASIGN declavar;
lectura: 'sustituya' VARNAME 'por recomendacion del chef';
impresion: OUTPUT VARNAME;
reemplazo: 'sustituya' VARNAME 'por' VARNAME;

suma: 'mezclar' VARNAME 'con' VARNAME;
multiplicacion: 'por cada' VARNAME 'agregar' VARNAME;
resta: 'quitar' VARNAME 'al' VARNAME;
division: 'divida' VARNAME 'en' VARNAME 'porciones';

sqrt: 'corte' VARNAME 'en cuadritos';
cos: 'cocine' VARNAME;
sin: 'sazone' VARNAME;

si : 'si' senlogica ',' statement* ', prosiga.';
dowhile : 'repita' statement* 'hasta que' senlogica;
mientras: 'mientras' senlogica 'haga' statement* ', prosiga';


senlogica : afirmacion ((OR | AND) afirmacion)* ;
afirmacion : mayor | menor | igual | distinto ;

mayor: MAYOR VARNAME 'que' VARNAME;
menor: MENOR VARNAME 'que' VARNAME;
igual: EQUAL VARNAME 'que' VARNAME;
distinto: NOTEQUAL VARNAME 'que' VARNAME;

