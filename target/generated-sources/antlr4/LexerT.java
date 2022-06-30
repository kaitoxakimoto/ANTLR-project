// Generated from LexerT.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LexerT extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGIN=1, END=2, BEGINRECETA=3, ASIGN=4, INPUT=5, OUTPUT=6, VARNAME=7, 
		CADENA=8, INT=9, FLOAT=10, OR=11, AND=12, MAYOR=13, MENOR=14, EQUAL=15, 
		NOTEQUAL=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'"
	};
	public static final String[] ruleNames = {
		"BEGIN", "END", "BEGINRECETA", "ASIGN", "INPUT", "OUTPUT", "VARNAME", 
		"CADENA", "INT", "FLOAT", "OR", "AND", "MAYOR", "MENOR", "EQUAL", "NOTEQUAL", 
		"WS"
	};


	public LexerT(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LexerT.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u00d6\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\6\by\n\b\r"+
		"\b\16\bz\3\t\3\t\6\t\177\n\t\r\t\16\t\u0080\3\t\3\t\3\n\6\n\u0086\n\n"+
		"\r\n\16\n\u0087\3\13\6\13\u008b\n\13\r\13\16\13\u008c\3\13\3\13\6\13\u0091"+
		"\n\13\r\13\16\13\u0092\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\6\22\u00d1\n\22\r\22\16\22\u00d2"+
		"\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23\3\2\5\3\2c|\3\2\62;\5\2\13\f\17\17\"\"\u00db"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\3%\3\2\2\2\5\62\3\2\2\2\7<\3\2\2\2\tJ\3\2\2\2\13W\3\2\2\2\ro\3\2"+
		"\2\2\17x\3\2\2\2\21|\3\2\2\2\23\u0085\3\2\2\2\25\u008a\3\2\2\2\27\u0094"+
		"\3\2\2\2\31\u0096\3\2\2\2\33\u0098\3\2\2\2\35\u00a1\3\2\2\2\37\u00ac\3"+
		"\2\2\2!\u00bc\3\2\2\2#\u00d0\3\2\2\2%&\7K\2\2&\'\7p\2\2\'(\7i\2\2()\7"+
		"t\2\2)*\7g\2\2*+\7f\2\2+,\7k\2\2,-\7g\2\2-.\7p\2\2./\7v\2\2/\60\7g\2\2"+
		"\60\61\7u\2\2\61\4\3\2\2\2\62\63\7F\2\2\63\64\7k\2\2\64\65\7u\2\2\65\66"+
		"\7h\2\2\66\67\7t\2\2\678\7w\2\289\7v\2\29:\7g\2\2:;\7#\2\2;\6\3\2\2\2"+
		"<=\7K\2\2=>\7p\2\2>?\7u\2\2?@\7v\2\2@A\7t\2\2AB\7w\2\2BC\7e\2\2CD\7e\2"+
		"\2DE\7k\2\2EF\7q\2\2FG\7p\2\2GH\7g\2\2HI\7u\2\2I\b\3\2\2\2JK\7w\2\2KL"+
		"\7v\2\2LM\7k\2\2MN\7n\2\2NO\7k\2\2OP\7|\2\2PQ\7c\2\2QR\7t\2\2RS\7g\2\2"+
		"ST\7o\2\2TU\7q\2\2UV\7u\2\2V\n\3\2\2\2WX\7t\2\2XY\7g\2\2YZ\7e\2\2Z[\7"+
		"q\2\2[\\\7o\2\2\\]\7g\2\2]^\7p\2\2^_\7f\2\2_`\7c\2\2`a\7e\2\2ab\7k\2\2"+
		"bc\7q\2\2cd\7p\2\2de\7\"\2\2ef\7f\2\2fg\7g\2\2gh\7n\2\2hi\7\"\2\2ij\7"+
		"e\2\2jk\7j\2\2kl\7g\2\2lm\7h\2\2mn\7<\2\2n\f\3\2\2\2op\7g\2\2pq\7o\2\2"+
		"qr\7r\2\2rs\7n\2\2st\7c\2\2tu\7v\2\2uv\7g\2\2v\16\3\2\2\2wy\t\2\2\2xw"+
		"\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\20\3\2\2\2|~\7$\2\2}\177\t\2\2"+
		"\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\3\2\2\2\u0082\u0083\7$\2\2\u0083\22\3\2\2\2\u0084\u0086\t\3\2\2"+
		"\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088"+
		"\3\2\2\2\u0088\24\3\2\2\2\u0089\u008b\t\3\2\2\u008a\u0089\3\2\2\2\u008b"+
		"\u008c\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2"+
		"\2\2\u008e\u0090\7\60\2\2\u008f\u0091\t\3\2\2\u0090\u008f\3\2\2\2\u0091"+
		"\u0092\3\2\2\2\u0092\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093\26\3\2\2"+
		"\2\u0094\u0095\7q\2\2\u0095\30\3\2\2\2\u0096\u0097\7{\2\2\u0097\32\3\2"+
		"\2\2\u0098\u0099\7j\2\2\u0099\u009a\7c\2\2\u009a\u009b\7{\2\2\u009b\u009c"+
		"\7c\2\2\u009c\u009d\7\"\2\2\u009d\u009e\7o\2\2\u009e\u009f\7c\2\2\u009f"+
		"\u00a0\7u\2\2\u00a0\34\3\2\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7{\2\2\u00a4\u00a5\7c\2\2\u00a5\u00a6\7\"\2\2\u00a6\u00a7\7o\2"+
		"\2\u00a7\u00a8\7g\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7q\2\2\u00aa\u00ab"+
		"\7u\2\2\u00ab\36\3\2\2\2\u00ac\u00ad\7j\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af"+
		"\7{\2\2\u00af\u00b0\7c\2\2\u00b0\u00b1\7\"\2\2\u00b1\u00b2\7n\2\2\u00b2"+
		"\u00b3\7q\2\2\u00b3\u00b4\7u\2\2\u00b4\u00b5\7\"\2\2\u00b5\u00b6\7o\2"+
		"\2\u00b6\u00b7\7k\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7o\2\2\u00b9\u00ba"+
		"\7q\2\2\u00ba\u00bb\7u\2\2\u00bb \3\2\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be"+
		"\7q\2\2\u00be\u00bf\7\"\2\2\u00bf\u00c0\7j\2\2\u00c0\u00c1\7c\2\2\u00c1"+
		"\u00c2\7{\2\2\u00c2\u00c3\7c\2\2\u00c3\u00c4\7\"\2\2\u00c4\u00c5\7n\2"+
		"\2\u00c5\u00c6\7q\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9"+
		"\7o\2\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7u\2\2\u00cb\u00cc\7o\2\2\u00cc"+
		"\u00cd\7q\2\2\u00cd\u00ce\7u\2\2\u00ce\"\3\2\2\2\u00cf\u00d1\t\4\2\2\u00d0"+
		"\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d5\b\22\2\2\u00d5$\3\2\2\2\t\2z\u0080"+
		"\u0087\u008c\u0092\u00d2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}