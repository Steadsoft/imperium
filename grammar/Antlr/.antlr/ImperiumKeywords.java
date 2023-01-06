// Generated from d:\Git\GitHub\Steadsoft\imperium\grammar\Antlr\ImperiumKeywords.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImperiumKeywords extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CALL=1, GOTO=2, GO=3, TO=4, PROCEDURE=5, PROC=6, END=7, DECLARE=8, ARGUMENT=9, 
		DEFINE=10, BINARY=11, DECIMAL=12, AUTOMATIC=13, BUILTIN=14, INTRINSIC=15, 
		STATIC=16, VARIABLE=17, BASED=18, DEFINED=19, INTERNAL=20, EXTERNAL=21, 
		RETURN=22, IF=23, THEN=24, ELSE=25, ELIF=26, RETURNS=27, POINTER=28, BIT=29, 
		CHARACTER=30, ENTRY=31, FIXED=32, FLOAT=33, OFFSET=34, STRING=35, VARYING=36, 
		COROUTINE=37, COFUNCTION=38, LOOP=39, WHILE=40, UNTIL=41, ENDLOOP=42, 
		RELOOP=43, INCLUDE=44, INC=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CALL", "GOTO", "GO", "TO", "PROCEDURE", "PROC", "END", "DECLARE", "ARGUMENT", 
			"DEFINE", "BINARY", "DECIMAL", "AUTOMATIC", "BUILTIN", "INTRINSIC", "STATIC", 
			"VARIABLE", "BASED", "DEFINED", "INTERNAL", "EXTERNAL", "RETURN", "IF", 
			"THEN", "ELSE", "ELIF", "RETURNS", "POINTER", "BIT", "CHARACTER", "ENTRY", 
			"FIXED", "FLOAT", "OFFSET", "STRING", "VARYING", "COROUTINE", "COFUNCTION", 
			"LOOP", "WHILE", "UNTIL", "ENDLOOP", "RELOOP", "INCLUDE", "INC"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CALL", "GOTO", "GO", "TO", "PROCEDURE", "PROC", "END", "DECLARE", 
			"ARGUMENT", "DEFINE", "BINARY", "DECIMAL", "AUTOMATIC", "BUILTIN", "INTRINSIC", 
			"STATIC", "VARIABLE", "BASED", "DEFINED", "INTERNAL", "EXTERNAL", "RETURN", 
			"IF", "THEN", "ELSE", "ELIF", "RETURNS", "POINTER", "BIT", "CHARACTER", 
			"ENTRY", "FIXED", "FLOAT", "OFFSET", "STRING", "VARYING", "COROUTINE", 
			"COFUNCTION", "LOOP", "WHILE", "UNTIL", "ENDLOOP", "RELOOP", "INCLUDE", 
			"INC"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public ImperiumKeywords(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ImperiumKeywords.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01ca\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6{\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u0090\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n"+
		"\u009d\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u00a8\n\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b3\n\f\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\5\r\u00bf\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00ce\n\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u013d\n\35\3\36\3\36\3\36\3\36\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0150"+
		"\n\37\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\3#\5#\u016d\n#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3"+
		"%\3%\3%\3%\3%\3%\5%\u0180\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u018e"+
		"\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u019d\n\'"+
		"\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+"+
		"\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\2\2/\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/\3\2\2\2\u01d6\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5b\3\2\2\2\7g\3\2\2\2\tj\3\2\2\2\13z\3"+
		"\2\2\2\r|\3\2\2\2\17\u0081\3\2\2\2\21\u008f\3\2\2\2\23\u009c\3\2\2\2\25"+
		"\u00a7\3\2\2\2\27\u00b2\3\2\2\2\31\u00be\3\2\2\2\33\u00cd\3\2\2\2\35\u00cf"+
		"\3\2\2\2\37\u00d7\3\2\2\2!\u00e1\3\2\2\2#\u00e8\3\2\2\2%\u00f1\3\2\2\2"+
		"\'\u00f7\3\2\2\2)\u00ff\3\2\2\2+\u0108\3\2\2\2-\u0111\3\2\2\2/\u0118\3"+
		"\2\2\2\61\u011b\3\2\2\2\63\u0120\3\2\2\2\65\u0125\3\2\2\2\67\u012a\3\2"+
		"\2\29\u013c\3\2\2\2;\u013e\3\2\2\2=\u014f\3\2\2\2?\u0151\3\2\2\2A\u0157"+
		"\3\2\2\2C\u015d\3\2\2\2E\u016c\3\2\2\2G\u016e\3\2\2\2I\u017f\3\2\2\2K"+
		"\u018d\3\2\2\2M\u019c\3\2\2\2O\u019e\3\2\2\2Q\u01a3\3\2\2\2S\u01a9\3\2"+
		"\2\2U\u01af\3\2\2\2W\u01b7\3\2\2\2Y\u01be\3\2\2\2[\u01c6\3\2\2\2]^\7e"+
		"\2\2^_\7c\2\2_`\7n\2\2`a\7n\2\2a\4\3\2\2\2bc\7i\2\2cd\7q\2\2de\7v\2\2"+
		"ef\7q\2\2f\6\3\2\2\2gh\7i\2\2hi\7q\2\2i\b\3\2\2\2jk\7v\2\2kl\7q\2\2l\n"+
		"\3\2\2\2mn\7r\2\2no\7t\2\2op\7q\2\2pq\7e\2\2qr\7g\2\2rs\7f\2\2st\7w\2"+
		"\2tu\7t\2\2u{\7g\2\2vw\7r\2\2wx\7t\2\2xy\7q\2\2y{\7e\2\2zm\3\2\2\2zv\3"+
		"\2\2\2{\f\3\2\2\2|}\7r\2\2}~\7t\2\2~\177\7q\2\2\177\u0080\7e\2\2\u0080"+
		"\16\3\2\2\2\u0081\u0082\7g\2\2\u0082\u0083\7p\2\2\u0083\u0084\7f\2\2\u0084"+
		"\20\3\2\2\2\u0085\u0086\7f\2\2\u0086\u0087\7g\2\2\u0087\u0088\7e\2\2\u0088"+
		"\u0089\7n\2\2\u0089\u008a\7c\2\2\u008a\u008b\7t\2\2\u008b\u0090\7g\2\2"+
		"\u008c\u008d\7f\2\2\u008d\u008e\7e\2\2\u008e\u0090\7n\2\2\u008f\u0085"+
		"\3\2\2\2\u008f\u008c\3\2\2\2\u0090\22\3\2\2\2\u0091\u0092\7c\2\2\u0092"+
		"\u0093\7t\2\2\u0093\u0094\7i\2\2\u0094\u0095\7w\2\2\u0095\u0096\7o\2\2"+
		"\u0096\u0097\7g\2\2\u0097\u0098\7p\2\2\u0098\u009d\7v\2\2\u0099\u009a"+
		"\7c\2\2\u009a\u009b\7t\2\2\u009b\u009d\7i\2\2\u009c\u0091\3\2\2\2\u009c"+
		"\u0099\3\2\2\2\u009d\24\3\2\2\2\u009e\u009f\7f\2\2\u009f\u00a0\7g\2\2"+
		"\u00a0\u00a1\7h\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7p\2\2\u00a3\u00a8"+
		"\7g\2\2\u00a4\u00a5\7f\2\2\u00a5\u00a6\7g\2\2\u00a6\u00a8\7h\2\2\u00a7"+
		"\u009e\3\2\2\2\u00a7\u00a4\3\2\2\2\u00a8\26\3\2\2\2\u00a9\u00aa\7d\2\2"+
		"\u00aa\u00ab\7k\2\2\u00ab\u00ac\7p\2\2\u00ac\u00ad\7c\2\2\u00ad\u00ae"+
		"\7t\2\2\u00ae\u00b3\7{\2\2\u00af\u00b0\7d\2\2\u00b0\u00b1\7k\2\2\u00b1"+
		"\u00b3\7p\2\2\u00b2\u00a9\3\2\2\2\u00b2\u00af\3\2\2\2\u00b3\30\3\2\2\2"+
		"\u00b4\u00b5\7f\2\2\u00b5\u00b6\7g\2\2\u00b6\u00b7\7e\2\2\u00b7\u00b8"+
		"\7k\2\2\u00b8\u00b9\7o\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bf\7n\2\2\u00bb"+
		"\u00bc\7f\2\2\u00bc\u00bd\7g\2\2\u00bd\u00bf\7e\2\2\u00be\u00b4\3\2\2"+
		"\2\u00be\u00bb\3\2\2\2\u00bf\32\3\2\2\2\u00c0\u00c1\7c\2\2\u00c1\u00c2"+
		"\7w\2\2\u00c2\u00c3\7v\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7o\2\2\u00c5"+
		"\u00c6\7c\2\2\u00c6\u00c7\7v\2\2\u00c7\u00c8\7k\2\2\u00c8\u00ce\7e\2\2"+
		"\u00c9\u00ca\7c\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7v\2\2\u00cc\u00ce"+
		"\7q\2\2\u00cd\u00c0\3\2\2\2\u00cd\u00c9\3\2\2\2\u00ce\34\3\2\2\2\u00cf"+
		"\u00d0\7d\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7k\2\2\u00d2\u00d3\7n\2\2"+
		"\u00d3\u00d4\7v\2\2\u00d4\u00d5\7k\2\2\u00d5\u00d6\7p\2\2\u00d6\36\3\2"+
		"\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7p\2\2\u00d9\u00da\7v\2\2\u00da\u00db"+
		"\7t\2\2\u00db\u00dc\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7u\2\2\u00de"+
		"\u00df\7k\2\2\u00df\u00e0\7e\2\2\u00e0 \3\2\2\2\u00e1\u00e2\7u\2\2\u00e2"+
		"\u00e3\7v\2\2\u00e3\u00e4\7c\2\2\u00e4\u00e5\7v\2\2\u00e5\u00e6\7k\2\2"+
		"\u00e6\u00e7\7e\2\2\u00e7\"\3\2\2\2\u00e8\u00e9\7x\2\2\u00e9\u00ea\7c"+
		"\2\2\u00ea\u00eb\7t\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7c\2\2\u00ed\u00ee"+
		"\7d\2\2\u00ee\u00ef\7n\2\2\u00ef\u00f0\7g\2\2\u00f0$\3\2\2\2\u00f1\u00f2"+
		"\7d\2\2\u00f2\u00f3\7c\2\2\u00f3\u00f4\7u\2\2\u00f4\u00f5\7g\2\2\u00f5"+
		"\u00f6\7f\2\2\u00f6&\3\2\2\2\u00f7\u00f8\7f\2\2\u00f8\u00f9\7g\2\2\u00f9"+
		"\u00fa\7h\2\2\u00fa\u00fb\7k\2\2\u00fb\u00fc\7p\2\2\u00fc\u00fd\7g\2\2"+
		"\u00fd\u00fe\7f\2\2\u00fe(\3\2\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7p\2"+
		"\2\u0101\u0102\7v\2\2\u0102\u0103\7g\2\2\u0103\u0104\7t\2\2\u0104\u0105"+
		"\7p\2\2\u0105\u0106\7c\2\2\u0106\u0107\7n\2\2\u0107*\3\2\2\2\u0108\u0109"+
		"\7g\2\2\u0109\u010a\7z\2\2\u010a\u010b\7v\2\2\u010b\u010c\7g\2\2\u010c"+
		"\u010d\7t\2\2\u010d\u010e\7p\2\2\u010e\u010f\7c\2\2\u010f\u0110\7n\2\2"+
		"\u0110,\3\2\2\2\u0111\u0112\7t\2\2\u0112\u0113\7g\2\2\u0113\u0114\7v\2"+
		"\2\u0114\u0115\7w\2\2\u0115\u0116\7t\2\2\u0116\u0117\7p\2\2\u0117.\3\2"+
		"\2\2\u0118\u0119\7k\2\2\u0119\u011a\7h\2\2\u011a\60\3\2\2\2\u011b\u011c"+
		"\7v\2\2\u011c\u011d\7j\2\2\u011d\u011e\7g\2\2\u011e\u011f\7p\2\2\u011f"+
		"\62\3\2\2\2\u0120\u0121\7g\2\2\u0121\u0122\7n\2\2\u0122\u0123\7u\2\2\u0123"+
		"\u0124\7g\2\2\u0124\64\3\2\2\2\u0125\u0126\7g\2\2\u0126\u0127\7n\2\2\u0127"+
		"\u0128\7k\2\2\u0128\u0129\7h\2\2\u0129\66\3\2\2\2\u012a\u012b\7t\2\2\u012b"+
		"\u012c\7g\2\2\u012c\u012d\7v\2\2\u012d\u012e\7w\2\2\u012e\u012f\7t\2\2"+
		"\u012f\u0130\7p\2\2\u0130\u0131\7u\2\2\u01318\3\2\2\2\u0132\u0133\7r\2"+
		"\2\u0133\u0134\7q\2\2\u0134\u0135\7k\2\2\u0135\u0136\7p\2\2\u0136\u0137"+
		"\7v\2\2\u0137\u0138\7g\2\2\u0138\u013d\7t\2\2\u0139\u013a\7r\2\2\u013a"+
		"\u013b\7v\2\2\u013b\u013d\7t\2\2\u013c\u0132\3\2\2\2\u013c\u0139\3\2\2"+
		"\2\u013d:\3\2\2\2\u013e\u013f\7d\2\2\u013f\u0140\7k\2\2\u0140\u0141\7"+
		"v\2\2\u0141<\3\2\2\2\u0142\u0143\7e\2\2\u0143\u0144\7j\2\2\u0144\u0145"+
		"\7c\2\2\u0145\u0146\7t\2\2\u0146\u0147\7c\2\2\u0147\u0148\7e\2\2\u0148"+
		"\u0149\7v\2\2\u0149\u014a\7g\2\2\u014a\u0150\7t\2\2\u014b\u014c\7e\2\2"+
		"\u014c\u014d\7j\2\2\u014d\u014e\7c\2\2\u014e\u0150\7t\2\2\u014f\u0142"+
		"\3\2\2\2\u014f\u014b\3\2\2\2\u0150>\3\2\2\2\u0151\u0152\7g\2\2\u0152\u0153"+
		"\7p\2\2\u0153\u0154\7v\2\2\u0154\u0155\7t\2\2\u0155\u0156\7{\2\2\u0156"+
		"@\3\2\2\2\u0157\u0158\7h\2\2\u0158\u0159\7k\2\2\u0159\u015a\7z\2\2\u015a"+
		"\u015b\7g\2\2\u015b\u015c\7f\2\2\u015cB\3\2\2\2\u015d\u015e\7h\2\2\u015e"+
		"\u015f\7n\2\2\u015f\u0160\7q\2\2\u0160\u0161\7c\2\2\u0161\u0162\7v\2\2"+
		"\u0162D\3\2\2\2\u0163\u0164\7q\2\2\u0164\u0165\7h\2\2\u0165\u0166\7h\2"+
		"\2\u0166\u0167\7u\2\2\u0167\u0168\7g\2\2\u0168\u016d\7v\2\2\u0169\u016a"+
		"\7q\2\2\u016a\u016b\7h\2\2\u016b\u016d\7z\2\2\u016c\u0163\3\2\2\2\u016c"+
		"\u0169\3\2\2\2\u016dF\3\2\2\2\u016e\u016f\7u\2\2\u016f\u0170\7v\2\2\u0170"+
		"\u0171\7t\2\2\u0171\u0172\7k\2\2\u0172\u0173\7p\2\2\u0173\u0174\7i\2\2"+
		"\u0174H\3\2\2\2\u0175\u0176\7x\2\2\u0176\u0177\7c\2\2\u0177\u0178\7t\2"+
		"\2\u0178\u0179\7{\2\2\u0179\u017a\7k\2\2\u017a\u017b\7p\2\2\u017b\u0180"+
		"\7i\2\2\u017c\u017d\7x\2\2\u017d\u017e\7c\2\2\u017e\u0180\7t\2\2\u017f"+
		"\u0175\3\2\2\2\u017f\u017c\3\2\2\2\u0180J\3\2\2\2\u0181\u0182\7e\2\2\u0182"+
		"\u0183\7q\2\2\u0183\u0184\7t\2\2\u0184\u0185\7q\2\2\u0185\u0186\7w\2\2"+
		"\u0186\u0187\7v\2\2\u0187\u0188\7k\2\2\u0188\u0189\7p\2\2\u0189\u018e"+
		"\7g\2\2\u018a\u018b\7e\2\2\u018b\u018c\7q\2\2\u018c\u018e\7t\2\2\u018d"+
		"\u0181\3\2\2\2\u018d\u018a\3\2\2\2\u018eL\3\2\2\2\u018f\u0190\7e\2\2\u0190"+
		"\u0191\7q\2\2\u0191\u0192\7h\2\2\u0192\u0193\7w\2\2\u0193\u0194\7p\2\2"+
		"\u0194\u0195\7e\2\2\u0195\u0196\7v\2\2\u0196\u0197\7k\2\2\u0197\u0198"+
		"\7q\2\2\u0198\u019d\7p\2\2\u0199\u019a\7e\2\2\u019a\u019b\7q\2\2\u019b"+
		"\u019d\7h\2\2\u019c\u018f\3\2\2\2\u019c\u0199\3\2\2\2\u019dN\3\2\2\2\u019e"+
		"\u019f\7n\2\2\u019f\u01a0\7q\2\2\u01a0\u01a1\7q\2\2\u01a1\u01a2\7r\2\2"+
		"\u01a2P\3\2\2\2\u01a3\u01a4\7y\2\2\u01a4\u01a5\7j\2\2\u01a5\u01a6\7k\2"+
		"\2\u01a6\u01a7\7n\2\2\u01a7\u01a8\7g\2\2\u01a8R\3\2\2\2\u01a9\u01aa\7"+
		"w\2\2\u01aa\u01ab\7p\2\2\u01ab\u01ac\7v\2\2\u01ac\u01ad\7k\2\2\u01ad\u01ae"+
		"\7n\2\2\u01aeT\3\2\2\2\u01af\u01b0\7g\2\2\u01b0\u01b1\7p\2\2\u01b1\u01b2"+
		"\7f\2\2\u01b2\u01b3\7n\2\2\u01b3\u01b4\7q\2\2\u01b4\u01b5\7q\2\2\u01b5"+
		"\u01b6\7r\2\2\u01b6V\3\2\2\2\u01b7\u01b8\7t\2\2\u01b8\u01b9\7g\2\2\u01b9"+
		"\u01ba\7n\2\2\u01ba\u01bb\7q\2\2\u01bb\u01bc\7q\2\2\u01bc\u01bd\7r\2\2"+
		"\u01bdX\3\2\2\2\u01be\u01bf\7k\2\2\u01bf\u01c0\7p\2\2\u01c0\u01c1\7e\2"+
		"\2\u01c1\u01c2\7n\2\2\u01c2\u01c3\7w\2\2\u01c3\u01c4\7f\2\2\u01c4\u01c5"+
		"\7g\2\2\u01c5Z\3\2\2\2\u01c6\u01c7\7k\2\2\u01c7\u01c8\7p\2\2\u01c8\u01c9"+
		"\7e\2\2\u01c9\\\3\2\2\2\20\2z\u008f\u009c\u00a7\u00b2\u00be\u00cd\u013c"+
		"\u014f\u016c\u017f\u018d\u019c\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}