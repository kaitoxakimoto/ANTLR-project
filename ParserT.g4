grammar ParserT;
import LexerT;

program	: BEGIN constan BEGINRECETA receta END;

constan	: declavar* ;
receta	: statement* ;

declavar : linea | entero | flotante ;

linea	: VARNAME 'marca' CADENA; 
entero		: INT VARNAME ;
flotante	: FLOAT 'kg de' VARNAME ;

statement : operacion | ciclo | asignacion ;

operacion: suma | multiplicacion | resta ;
ciclo: si | mientras ;
asignacion: 'utilizaremos' declavar;

suma: 'mezclar' VARNAME 'con' VARNAME;
multiplicacion: 'por cada' VARNAME 'agregar' VARNAME;
resta: 'quitar' VARNAME 'al' VARNAME;

si : 'si' senlogica ',' statement* ', prosiga.' ;
mientras : 'repita' statement* 'hasta que' senlogica;

senlogica : afirmacion ((OR | AND) afirmacion)* ;
afirmacion : mayor | menor | igual | distinto ;

mayor: 'haya mas' VARNAME 'que' VARNAME;
menor: 'haya menos' VARNAME 'que' VARNAME;
igual: 'haya los mismos' VARNAME 'que' VARNAME;
distinto: 'no haya los mismos' VARNAME 'que' VARNAME;

