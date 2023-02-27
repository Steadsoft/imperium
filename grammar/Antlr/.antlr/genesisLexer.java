// Generated from d:\Git\GitHub\Steadsoft\imperium\grammar\Antlr\genesis.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class genesisLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PROC=1, DCL=2, END=3, THEN=4, ELSE=5, IF=6, EQUAL=7, LPAR=8, RPAR=9, COMMA=10, 
		DOT=11, PLUS=12, MINUS=13, TIMES=14, DIVIDE=15, COMMENT=16, IDENTIFIER=17, 
		BYTE_ORDER_MARK=18, PREAMBLE=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PROC", "DCL", "END", "THEN", "ELSE", "IF", "EQUAL", "LPAR", "RPAR", 
			"COMMA", "DOT", "PLUS", "MINUS", "TIMES", "DIVIDE", "COMMENT", "IDENTIFIER", 
			"BYTE_ORDER_MARK", "PREAMBLE", "BCOM", "ECOM", "SPACE", "TAB", "CR", 
			"LF", "SEMICOLON", "IDENTIFIER_START", "IDENTIFIER_REST"
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
			null, "PROC", "DCL", "END", "THEN", "ELSE", "IF", "EQUAL", "LPAR", "RPAR", 
			"COMMA", "DOT", "PLUS", "MINUS", "TIMES", "DIVIDE", "COMMENT", "IDENTIFIER", 
			"BYTE_ORDER_MARK", "PREAMBLE"
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


	public genesisLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "genesis.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16:
			IDENTIFIER_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void IDENTIFIER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			setText(getText().trim());
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u0099\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\21\7\21k\n\21\f\21\16\21n\13\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\7\22v\n\22\f\22\16\22y\13\22\3\22\3\22\3\23"+
		"\3\23\3\24\6\24\u0080\n\24\r\24\16\24\u0081\3\24\3\24\3\25\3\25\3\25\3"+
		"\26\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3"+
		"\34\3\35\3\35\3l\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27"+
		"\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\2+\2-\2/\2\61\2\63\2\65\2"+
		"\67\29\2\3\2\5\5\2\13\f\17\17\"\"\6\2&&C\\aac|\7\2&&\62;C\\aac|\2\u0093"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\3;\3\2\2\2\5@\3\2\2\2\7D\3\2\2\2\tH\3\2\2"+
		"\2\13M\3\2\2\2\rR\3\2\2\2\17U\3\2\2\2\21W\3\2\2\2\23Y\3\2\2\2\25[\3\2"+
		"\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3\2\2\2\35c\3\2\2\2\37e\3\2\2\2!g\3\2"+
		"\2\2#s\3\2\2\2%|\3\2\2\2\'\177\3\2\2\2)\u0085\3\2\2\2+\u0088\3\2\2\2-"+
		"\u008b\3\2\2\2/\u008d\3\2\2\2\61\u008f\3\2\2\2\63\u0091\3\2\2\2\65\u0093"+
		"\3\2\2\2\67\u0095\3\2\2\29\u0097\3\2\2\2;<\7r\2\2<=\7t\2\2=>\7q\2\2>?"+
		"\7e\2\2?\4\3\2\2\2@A\7f\2\2AB\7e\2\2BC\7n\2\2C\6\3\2\2\2DE\7g\2\2EF\7"+
		"p\2\2FG\7f\2\2G\b\3\2\2\2HI\7v\2\2IJ\7j\2\2JK\7g\2\2KL\7p\2\2L\n\3\2\2"+
		"\2MN\7g\2\2NO\7n\2\2OP\7u\2\2PQ\7g\2\2Q\f\3\2\2\2RS\7k\2\2ST\7h\2\2T\16"+
		"\3\2\2\2UV\7?\2\2V\20\3\2\2\2WX\7*\2\2X\22\3\2\2\2YZ\7+\2\2Z\24\3\2\2"+
		"\2[\\\7.\2\2\\\26\3\2\2\2]^\7\60\2\2^\30\3\2\2\2_`\7-\2\2`\32\3\2\2\2"+
		"ab\7/\2\2b\34\3\2\2\2cd\7,\2\2d\36\3\2\2\2ef\7\61\2\2f \3\2\2\2gl\5)\25"+
		"\2hk\5!\21\2ik\13\2\2\2jh\3\2\2\2ji\3\2\2\2kn\3\2\2\2lm\3\2\2\2lj\3\2"+
		"\2\2mo\3\2\2\2nl\3\2\2\2op\5+\26\2pq\3\2\2\2qr\b\21\2\2r\"\3\2\2\2sw\5"+
		"\67\34\2tv\59\35\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2y"+
		"w\3\2\2\2z{\b\22\3\2{$\3\2\2\2|}\7\uff01\2\2}&\3\2\2\2~\u0080\t\2\2\2"+
		"\177~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2"+
		"\2\u0082\u0083\3\2\2\2\u0083\u0084\b\24\2\2\u0084(\3\2\2\2\u0085\u0086"+
		"\7\61\2\2\u0086\u0087\7,\2\2\u0087*\3\2\2\2\u0088\u0089\7,\2\2\u0089\u008a"+
		"\7\61\2\2\u008a,\3\2\2\2\u008b\u008c\7\"\2\2\u008c.\3\2\2\2\u008d\u008e"+
		"\7\13\2\2\u008e\60\3\2\2\2\u008f\u0090\7\17\2\2\u0090\62\3\2\2\2\u0091"+
		"\u0092\7\f\2\2\u0092\64\3\2\2\2\u0093\u0094\7=\2\2\u0094\66\3\2\2\2\u0095"+
		"\u0096\t\3\2\2\u00968\3\2\2\2\u0097\u0098\t\4\2\2\u0098:\3\2\2\2\7\2j"+
		"lw\u0081\4\b\2\2\3\22\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}