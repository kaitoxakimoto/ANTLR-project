// Generated from ParserT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ParserTParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__23=1, T__22=2, T__21=3, T__20=4, T__19=5, T__18=6, T__17=7, T__16=8, 
		T__15=9, T__14=10, T__13=11, T__12=12, T__11=13, T__10=14, T__9=15, T__8=16, 
		T__7=17, T__6=18, T__5=19, T__4=20, T__3=21, T__2=22, T__1=23, T__0=24, 
		BEGIN=25, END=26, BEGINRECETA=27, ASIGN=28, INPUT=29, OUTPUT=30, VARNAME=31, 
		CADENA=32, INT=33, FLOAT=34, OR=35, AND=36, MAYOR=37, MENOR=38, EQUAL=39, 
		NOTEQUAL=40, WS=41;
	public static final String[] tokenNames = {
		"<INVALID>", "'por cada'", "', prosiga'", "'mientras'", "'haga'", "'si'", 
		"'porciones'", "'con'", "'que'", "', prosiga.'", "'hasta que'", "'cocine'", 
		"'divida'", "'quitar'", "'en cuadritos'", "'repita'", "'sazone'", "'marca'", 
		"'kg de'", "'agregar'", "'al'", "'mezclar'", "'en'", "'corte'", "','", 
		"'Ingredientes'", "'Disfrute!'", "'Instrucciones'", "'utilizaremos'", 
		"'recomendacion del chef:'", "'emplate'", "VARNAME", "CADENA", "INT", 
		"FLOAT", "'o'", "'y'", "'haya mas'", "'haya menos'", "'haya los mismos'", 
		"'no haya los mismos'", "WS"
	};
	public static final int
		RULE_program = 0, RULE_constan = 1, RULE_receta = 2, RULE_declavar = 3, 
		RULE_linea = 4, RULE_entero = 5, RULE_flotante = 6, RULE_statement = 7, 
		RULE_operacion = 8, RULE_ciclo = 9, RULE_asignacion = 10, RULE_lectura = 11, 
		RULE_impresion = 12, RULE_suma = 13, RULE_multiplicacion = 14, RULE_resta = 15, 
		RULE_division = 16, RULE_sqrt = 17, RULE_cos = 18, RULE_sin = 19, RULE_si = 20, 
		RULE_dowhile = 21, RULE_mientras = 22, RULE_senlogica = 23, RULE_afirmacion = 24, 
		RULE_mayor = 25, RULE_menor = 26, RULE_igual = 27, RULE_distinto = 28;
	public static final String[] ruleNames = {
		"program", "constan", "receta", "declavar", "linea", "entero", "flotante", 
		"statement", "operacion", "ciclo", "asignacion", "lectura", "impresion", 
		"suma", "multiplicacion", "resta", "division", "sqrt", "cos", "sin", "si", 
		"dowhile", "mientras", "senlogica", "afirmacion", "mayor", "menor", "igual", 
		"distinto"
	};

	@Override
	public String getGrammarFileName() { return "ParserT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ParserTParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public RecetaContext receta() {
			return getRuleContext(RecetaContext.class,0);
		}
		public ConstanContext constan() {
			return getRuleContext(ConstanContext.class,0);
		}
		public TerminalNode BEGIN() { return getToken(ParserTParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(ParserTParser.END, 0); }
		public TerminalNode BEGINRECETA() { return getToken(ParserTParser.BEGINRECETA, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58); match(BEGIN);
			setState(59); constan();
			setState(60); match(BEGINRECETA);
			setState(61); receta();
			setState(62); match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstanContext extends ParserRuleContext {
		public DeclavarContext declavar(int i) {
			return getRuleContext(DeclavarContext.class,i);
		}
		public List<DeclavarContext> declavar() {
			return getRuleContexts(DeclavarContext.class);
		}
		public ConstanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterConstan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitConstan(this);
		}
	}

	public final ConstanContext constan() throws RecognitionException {
		ConstanContext _localctx = new ConstanContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_constan);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VARNAME) | (1L << INT) | (1L << FLOAT))) != 0)) {
				{
				{
				setState(64); declavar();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RecetaContext extends ParserRuleContext {
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public RecetaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_receta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterReceta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitReceta(this);
		}
	}

	public final RecetaContext receta() throws RecognitionException {
		RecetaContext _localctx = new RecetaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_receta);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__21) | (1L << T__19) | (1L << T__13) | (1L << T__11) | (1L << T__8) | (1L << T__3) | (1L << T__1) | (1L << ASIGN) | (1L << INPUT) | (1L << OUTPUT))) != 0)) {
				{
				{
				setState(70); statement();
				}
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclavarContext extends ParserRuleContext {
		public EnteroContext entero() {
			return getRuleContext(EnteroContext.class,0);
		}
		public FlotanteContext flotante() {
			return getRuleContext(FlotanteContext.class,0);
		}
		public LineaContext linea() {
			return getRuleContext(LineaContext.class,0);
		}
		public DeclavarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declavar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDeclavar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDeclavar(this);
		}
	}

	public final DeclavarContext declavar() throws RecognitionException {
		DeclavarContext _localctx = new DeclavarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declavar);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case VARNAME:
				enterOuterAlt(_localctx, 1);
				{
				setState(76); linea();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(77); entero();
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(78); flotante();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineaContext extends ParserRuleContext {
		public TerminalNode CADENA() { return getToken(ParserTParser.CADENA, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public LineaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterLinea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitLinea(this);
		}
	}

	public final LineaContext linea() throws RecognitionException {
		LineaContext _localctx = new LineaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_linea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(VARNAME);
			setState(82); match(T__7);
			setState(83); match(CADENA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnteroContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ParserTParser.INT, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public EnteroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_entero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterEntero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitEntero(this);
		}
	}

	public final EnteroContext entero() throws RecognitionException {
		EnteroContext _localctx = new EnteroContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_entero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(INT);
			setState(86); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FlotanteContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public TerminalNode FLOAT() { return getToken(ParserTParser.FLOAT, 0); }
		public FlotanteContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_flotante; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterFlotante(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitFlotante(this);
		}
	}

	public final FlotanteContext flotante() throws RecognitionException {
		FlotanteContext _localctx = new FlotanteContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_flotante);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88); match(FLOAT);
			setState(89); match(T__6);
			setState(90); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public CicloContext ciclo() {
			return getRuleContext(CicloContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public OperacionContext operacion() {
			return getRuleContext(OperacionContext.class,0);
		}
		public LecturaContext lectura() {
			return getRuleContext(LecturaContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(97);
			switch (_input.LA(1)) {
			case T__23:
			case T__13:
			case T__11:
			case T__8:
			case T__3:
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92); operacion();
				}
				break;
			case T__21:
			case T__19:
				enterOuterAlt(_localctx, 2);
				{
				setState(93); ciclo();
				}
				break;
			case ASIGN:
				enterOuterAlt(_localctx, 3);
				{
				setState(94); asignacion();
				}
				break;
			case INPUT:
				enterOuterAlt(_localctx, 4);
				{
				setState(95); lectura();
				}
				break;
			case OUTPUT:
				enterOuterAlt(_localctx, 5);
				{
				setState(96); impresion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperacionContext extends ParserRuleContext {
		public SqrtContext sqrt() {
			return getRuleContext(SqrtContext.class,0);
		}
		public SumaContext suma() {
			return getRuleContext(SumaContext.class,0);
		}
		public RestaContext resta() {
			return getRuleContext(RestaContext.class,0);
		}
		public MultiplicacionContext multiplicacion() {
			return getRuleContext(MultiplicacionContext.class,0);
		}
		public SinContext sin() {
			return getRuleContext(SinContext.class,0);
		}
		public CosContext cos() {
			return getRuleContext(CosContext.class,0);
		}
		public OperacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterOperacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitOperacion(this);
		}
	}

	public final OperacionContext operacion() throws RecognitionException {
		OperacionContext _localctx = new OperacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operacion);
		try {
			setState(105);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(99); suma();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(100); multiplicacion();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); resta();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 4);
				{
				setState(102); sqrt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 5);
				{
				setState(103); cos();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 6);
				{
				setState(104); sin();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CicloContext extends ParserRuleContext {
		public MientrasContext mientras() {
			return getRuleContext(MientrasContext.class,0);
		}
		public SiContext si() {
			return getRuleContext(SiContext.class,0);
		}
		public CicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterCiclo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitCiclo(this);
		}
	}

	public final CicloContext ciclo() throws RecognitionException {
		CicloContext _localctx = new CicloContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ciclo);
		try {
			setState(109);
			switch (_input.LA(1)) {
			case T__19:
				enterOuterAlt(_localctx, 1);
				{
				setState(107); si();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 2);
				{
				setState(108); mientras();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsignacionContext extends ParserRuleContext {
		public TerminalNode ASIGN() { return getToken(ParserTParser.ASIGN, 0); }
		public DeclavarContext declavar() {
			return getRuleContext(DeclavarContext.class,0);
		}
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitAsignacion(this);
		}
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_asignacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111); match(ASIGN);
			setState(112); declavar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LecturaContext extends ParserRuleContext {
		public TerminalNode INPUT() { return getToken(ParserTParser.INPUT, 0); }
		public DeclavarContext declavar() {
			return getRuleContext(DeclavarContext.class,0);
		}
		public LecturaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lectura; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterLectura(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitLectura(this);
		}
	}

	public final LecturaContext lectura() throws RecognitionException {
		LecturaContext _localctx = new LecturaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_lectura);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(INPUT);
			setState(115); declavar();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImpresionContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(ParserTParser.OUTPUT, 0); }
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitImpresion(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117); match(OUTPUT);
			setState(118); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SumaContext extends ParserRuleContext {
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public SumaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_suma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSuma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSuma(this);
		}
	}

	public final SumaContext suma() throws RecognitionException {
		SumaContext _localctx = new SumaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_suma);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120); match(T__3);
			setState(121); match(VARNAME);
			setState(122); match(T__17);
			setState(123); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiplicacionContext extends ParserRuleContext {
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public MultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMultiplicacion(this);
		}
	}

	public final MultiplicacionContext multiplicacion() throws RecognitionException {
		MultiplicacionContext _localctx = new MultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_multiplicacion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125); match(T__23);
			setState(126); match(VARNAME);
			setState(127); match(T__5);
			setState(128); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RestaContext extends ParserRuleContext {
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public RestaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resta; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterResta(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitResta(this);
		}
	}

	public final RestaContext resta() throws RecognitionException {
		RestaContext _localctx = new RestaContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_resta);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130); match(T__11);
			setState(131); match(VARNAME);
			setState(132); match(T__4);
			setState(133); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DivisionContext extends ParserRuleContext {
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public DivisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_division; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDivision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDivision(this);
		}
	}

	public final DivisionContext division() throws RecognitionException {
		DivisionContext _localctx = new DivisionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_division);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(T__12);
			setState(136); match(VARNAME);
			setState(137); match(T__2);
			setState(138); match(VARNAME);
			setState(139); match(T__18);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SqrtContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public SqrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sqrt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSqrt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSqrt(this);
		}
	}

	public final SqrtContext sqrt() throws RecognitionException {
		SqrtContext _localctx = new SqrtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sqrt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(T__1);
			setState(142); match(VARNAME);
			setState(143); match(T__10);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CosContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public CosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterCos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitCos(this);
		}
	}

	public final CosContext cos() throws RecognitionException {
		CosContext _localctx = new CosContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_cos);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145); match(T__13);
			setState(146); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SinContext extends ParserRuleContext {
		public TerminalNode VARNAME() { return getToken(ParserTParser.VARNAME, 0); }
		public SinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSin(this);
		}
	}

	public final SinContext sin() throws RecognitionException {
		SinContext _localctx = new SinContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148); match(T__8);
			setState(149); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SiContext extends ParserRuleContext {
		public SenlogicaContext senlogica() {
			return getRuleContext(SenlogicaContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public SiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_si; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSi(this);
		}
	}

	public final SiContext si() throws RecognitionException {
		SiContext _localctx = new SiContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_si);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151); match(T__19);
			setState(152); senlogica();
			setState(153); match(T__0);
			setState(157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__21) | (1L << T__19) | (1L << T__13) | (1L << T__11) | (1L << T__8) | (1L << T__3) | (1L << T__1) | (1L << ASIGN) | (1L << INPUT) | (1L << OUTPUT))) != 0)) {
				{
				{
				setState(154); statement();
				}
				}
				setState(159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(160); match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DowhileContext extends ParserRuleContext {
		public SenlogicaContext senlogica() {
			return getRuleContext(SenlogicaContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public DowhileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dowhile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDowhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDowhile(this);
		}
	}

	public final DowhileContext dowhile() throws RecognitionException {
		DowhileContext _localctx = new DowhileContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dowhile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); match(T__9);
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__21) | (1L << T__19) | (1L << T__13) | (1L << T__11) | (1L << T__8) | (1L << T__3) | (1L << T__1) | (1L << ASIGN) | (1L << INPUT) | (1L << OUTPUT))) != 0)) {
				{
				{
				setState(163); statement();
				}
				}
				setState(168);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(169); match(T__14);
			setState(170); senlogica();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MientrasContext extends ParserRuleContext {
		public SenlogicaContext senlogica() {
			return getRuleContext(SenlogicaContext.class,0);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public MientrasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mientras; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMientras(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMientras(this);
		}
	}

	public final MientrasContext mientras() throws RecognitionException {
		MientrasContext _localctx = new MientrasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mientras);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(T__21);
			setState(173); senlogica();
			setState(174); match(T__20);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__21) | (1L << T__19) | (1L << T__13) | (1L << T__11) | (1L << T__8) | (1L << T__3) | (1L << T__1) | (1L << ASIGN) | (1L << INPUT) | (1L << OUTPUT))) != 0)) {
				{
				{
				setState(175); statement();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(181); match(T__22);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenlogicaContext extends ParserRuleContext {
		public TerminalNode AND(int i) {
			return getToken(ParserTParser.AND, i);
		}
		public List<AfirmacionContext> afirmacion() {
			return getRuleContexts(AfirmacionContext.class);
		}
		public AfirmacionContext afirmacion(int i) {
			return getRuleContext(AfirmacionContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(ParserTParser.AND); }
		public List<TerminalNode> OR() { return getTokens(ParserTParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(ParserTParser.OR, i);
		}
		public SenlogicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_senlogica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterSenlogica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitSenlogica(this);
		}
	}

	public final SenlogicaContext senlogica() throws RecognitionException {
		SenlogicaContext _localctx = new SenlogicaContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_senlogica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); afirmacion();
			setState(188);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR || _la==AND) {
				{
				{
				setState(184);
				_la = _input.LA(1);
				if ( !(_la==OR || _la==AND) ) {
				_errHandler.recoverInline(this);
				}
				consume();
				setState(185); afirmacion();
				}
				}
				setState(190);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AfirmacionContext extends ParserRuleContext {
		public IgualContext igual() {
			return getRuleContext(IgualContext.class,0);
		}
		public DistintoContext distinto() {
			return getRuleContext(DistintoContext.class,0);
		}
		public MenorContext menor() {
			return getRuleContext(MenorContext.class,0);
		}
		public MayorContext mayor() {
			return getRuleContext(MayorContext.class,0);
		}
		public AfirmacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_afirmacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterAfirmacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitAfirmacion(this);
		}
	}

	public final AfirmacionContext afirmacion() throws RecognitionException {
		AfirmacionContext _localctx = new AfirmacionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_afirmacion);
		try {
			setState(195);
			switch (_input.LA(1)) {
			case MAYOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); mayor();
				}
				break;
			case MENOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); menor();
				}
				break;
			case EQUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(193); igual();
				}
				break;
			case NOTEQUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(194); distinto();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MayorContext extends ParserRuleContext {
		public TerminalNode MAYOR() { return getToken(ParserTParser.MAYOR, 0); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public MayorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mayor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMayor(this);
		}
	}

	public final MayorContext mayor() throws RecognitionException {
		MayorContext _localctx = new MayorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mayor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197); match(MAYOR);
			setState(198); match(VARNAME);
			setState(199); match(T__16);
			setState(200); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MenorContext extends ParserRuleContext {
		public TerminalNode MENOR() { return getToken(ParserTParser.MENOR, 0); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public MenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitMenor(this);
		}
	}

	public final MenorContext menor() throws RecognitionException {
		MenorContext _localctx = new MenorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_menor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202); match(MENOR);
			setState(203); match(VARNAME);
			setState(204); match(T__16);
			setState(205); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IgualContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(ParserTParser.EQUAL, 0); }
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public IgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_igual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitIgual(this);
		}
	}

	public final IgualContext igual() throws RecognitionException {
		IgualContext _localctx = new IgualContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_igual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207); match(EQUAL);
			setState(208); match(VARNAME);
			setState(209); match(T__16);
			setState(210); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DistintoContext extends ParserRuleContext {
		public TerminalNode VARNAME(int i) {
			return getToken(ParserTParser.VARNAME, i);
		}
		public TerminalNode NOTEQUAL() { return getToken(ParserTParser.NOTEQUAL, 0); }
		public List<TerminalNode> VARNAME() { return getTokens(ParserTParser.VARNAME); }
		public DistintoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).enterDistinto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ParserTListener ) ((ParserTListener)listener).exitDistinto(this);
		}
	}

	public final DistintoContext distinto() throws RecognitionException {
		DistintoContext _localctx = new DistintoContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_distinto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212); match(NOTEQUAL);
			setState(213); match(VARNAME);
			setState(214); match(T__16);
			setState(215); match(VARNAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00dc\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\7\3D\n\3\f\3\16\3G\13\3\3\4\7\4J\n\4\f\4\16\4M\13\4\3\5\3\5\3"+
		"\5\5\5R\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\5\td\n\t\3\n\3\n\3\n\3\n\3\n\3\n\5\nl\n\n\3\13\3\13\5\13p\n\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20"+
		"\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\7\26\u009e\n\26\f\26\16\26\u00a1\13\26\3\26\3\26\3\27\3\27\7\27"+
		"\u00a7\n\27\f\27\16\27\u00aa\13\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\7\30\u00b3\n\30\f\30\16\30\u00b6\13\30\3\30\3\30\3\31\3\31\3\31\7\31"+
		"\u00bd\n\31\f\31\16\31\u00c0\13\31\3\32\3\32\3\32\3\32\5\32\u00c6\n\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\36\3\36\3\36\3\36\3\36\3\36\2\2\37\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:\2\3\3\2%&\u00d3\2<\3\2\2\2\4E\3\2"+
		"\2\2\6K\3\2\2\2\bQ\3\2\2\2\nS\3\2\2\2\fW\3\2\2\2\16Z\3\2\2\2\20c\3\2\2"+
		"\2\22k\3\2\2\2\24o\3\2\2\2\26q\3\2\2\2\30t\3\2\2\2\32w\3\2\2\2\34z\3\2"+
		"\2\2\36\177\3\2\2\2 \u0084\3\2\2\2\"\u0089\3\2\2\2$\u008f\3\2\2\2&\u0093"+
		"\3\2\2\2(\u0096\3\2\2\2*\u0099\3\2\2\2,\u00a4\3\2\2\2.\u00ae\3\2\2\2\60"+
		"\u00b9\3\2\2\2\62\u00c5\3\2\2\2\64\u00c7\3\2\2\2\66\u00cc\3\2\2\28\u00d1"+
		"\3\2\2\2:\u00d6\3\2\2\2<=\7\33\2\2=>\5\4\3\2>?\7\35\2\2?@\5\6\4\2@A\7"+
		"\34\2\2A\3\3\2\2\2BD\5\b\5\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2F"+
		"\5\3\2\2\2GE\3\2\2\2HJ\5\20\t\2IH\3\2\2\2JM\3\2\2\2KI\3\2\2\2KL\3\2\2"+
		"\2L\7\3\2\2\2MK\3\2\2\2NR\5\n\6\2OR\5\f\7\2PR\5\16\b\2QN\3\2\2\2QO\3\2"+
		"\2\2QP\3\2\2\2R\t\3\2\2\2ST\7!\2\2TU\7\23\2\2UV\7\"\2\2V\13\3\2\2\2WX"+
		"\7#\2\2XY\7!\2\2Y\r\3\2\2\2Z[\7$\2\2[\\\7\24\2\2\\]\7!\2\2]\17\3\2\2\2"+
		"^d\5\22\n\2_d\5\24\13\2`d\5\26\f\2ad\5\30\r\2bd\5\32\16\2c^\3\2\2\2c_"+
		"\3\2\2\2c`\3\2\2\2ca\3\2\2\2cb\3\2\2\2d\21\3\2\2\2el\5\34\17\2fl\5\36"+
		"\20\2gl\5 \21\2hl\5$\23\2il\5&\24\2jl\5(\25\2ke\3\2\2\2kf\3\2\2\2kg\3"+
		"\2\2\2kh\3\2\2\2ki\3\2\2\2kj\3\2\2\2l\23\3\2\2\2mp\5*\26\2np\5.\30\2o"+
		"m\3\2\2\2on\3\2\2\2p\25\3\2\2\2qr\7\36\2\2rs\5\b\5\2s\27\3\2\2\2tu\7\37"+
		"\2\2uv\5\b\5\2v\31\3\2\2\2wx\7 \2\2xy\7!\2\2y\33\3\2\2\2z{\7\27\2\2{|"+
		"\7!\2\2|}\7\t\2\2}~\7!\2\2~\35\3\2\2\2\177\u0080\7\3\2\2\u0080\u0081\7"+
		"!\2\2\u0081\u0082\7\25\2\2\u0082\u0083\7!\2\2\u0083\37\3\2\2\2\u0084\u0085"+
		"\7\17\2\2\u0085\u0086\7!\2\2\u0086\u0087\7\26\2\2\u0087\u0088\7!\2\2\u0088"+
		"!\3\2\2\2\u0089\u008a\7\16\2\2\u008a\u008b\7!\2\2\u008b\u008c\7\30\2\2"+
		"\u008c\u008d\7!\2\2\u008d\u008e\7\b\2\2\u008e#\3\2\2\2\u008f\u0090\7\31"+
		"\2\2\u0090\u0091\7!\2\2\u0091\u0092\7\20\2\2\u0092%\3\2\2\2\u0093\u0094"+
		"\7\r\2\2\u0094\u0095\7!\2\2\u0095\'\3\2\2\2\u0096\u0097\7\22\2\2\u0097"+
		"\u0098\7!\2\2\u0098)\3\2\2\2\u0099\u009a\7\7\2\2\u009a\u009b\5\60\31\2"+
		"\u009b\u009f\7\32\2\2\u009c\u009e\5\20\t\2\u009d\u009c\3\2\2\2\u009e\u00a1"+
		"\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a2\3\2\2\2\u00a1"+
		"\u009f\3\2\2\2\u00a2\u00a3\7\13\2\2\u00a3+\3\2\2\2\u00a4\u00a8\7\21\2"+
		"\2\u00a5\u00a7\5\20\t\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00ab\3\2\2\2\u00aa\u00a8\3\2"+
		"\2\2\u00ab\u00ac\7\f\2\2\u00ac\u00ad\5\60\31\2\u00ad-\3\2\2\2\u00ae\u00af"+
		"\7\5\2\2\u00af\u00b0\5\60\31\2\u00b0\u00b4\7\6\2\2\u00b1\u00b3\5\20\t"+
		"\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5"+
		"\3\2\2\2\u00b5\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\4\2\2\u00b8"+
		"/\3\2\2\2\u00b9\u00be\5\62\32\2\u00ba\u00bb\t\2\2\2\u00bb\u00bd\5\62\32"+
		"\2\u00bc\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf"+
		"\3\2\2\2\u00bf\61\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00c6\5\64\33\2\u00c2"+
		"\u00c6\5\66\34\2\u00c3\u00c6\58\35\2\u00c4\u00c6\5:\36\2\u00c5\u00c1\3"+
		"\2\2\2\u00c5\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6"+
		"\63\3\2\2\2\u00c7\u00c8\7\'\2\2\u00c8\u00c9\7!\2\2\u00c9\u00ca\7\n\2\2"+
		"\u00ca\u00cb\7!\2\2\u00cb\65\3\2\2\2\u00cc\u00cd\7(\2\2\u00cd\u00ce\7"+
		"!\2\2\u00ce\u00cf\7\n\2\2\u00cf\u00d0\7!\2\2\u00d0\67\3\2\2\2\u00d1\u00d2"+
		"\7)\2\2\u00d2\u00d3\7!\2\2\u00d3\u00d4\7\n\2\2\u00d4\u00d5\7!\2\2\u00d5"+
		"9\3\2\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8\7!\2\2\u00d8\u00d9\7\n\2\2\u00d9"+
		"\u00da\7!\2\2\u00da;\3\2\2\2\rEKQcko\u009f\u00a8\u00b4\u00be\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}