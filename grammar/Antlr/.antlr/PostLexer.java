// Generated from d:\Git\GitHub\Steadsoft\imperium\grammar\Antlr\Post.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PostLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, COMMENT=21, LINE_COMMENT=22, WS=23, NEWLINE=24, 
		TAB=25, BYTE_ORDER_MARK=26, CALL=27, GOTO=28, GO=29, TO=30, PROCEDURE=31, 
		PROC=32, END=33, DECLARE=34, ARGUMENT=35, DEFINE=36, BINARY=37, DECIMAL=38, 
		AUTOMATIC=39, BUILTIN=40, INTRINSIC=41, STATIC=42, VARIABLE=43, BASED=44, 
		DEFINED=45, INTERNAL=46, EXTERNAL=47, RETURN=48, IF=49, THEN=50, ELSE=51, 
		ELIF=52, RETURNS=53, POINTER=54, BIT=55, CHARACTER=56, ENTRY=57, FIXED=58, 
		FLOAT=59, OFFSET=60, STRING=61, VARYING=62, COROUTINE=63, COFUNCTION=64, 
		LOOP=65, WHILE=66, UNTIL=67, ENDLOOP=68, RELOOP=69, BASE_B=70, BASE_O=71, 
		BASE_D=72, BASE_H=73, FRAC_B=74, FRAC_D=75, FRAC_O=76, FRAC_H=77, IDENTIFIER=78, 
		BINARY_PATTERN=79, OCTAL_PATTERN=80, HEXADECIMAL_PATTERN=81, DECIMAL_PATTERN=82, 
		LSEP=83, BIN=84, OCT=85, DEC=86, HEX=87, ARROW=88, DOT=89, COMMA=90, LPAR=91, 
		RPAR=92, LBRACK=93, RBRACK=94, LBRACE=95, RBRACE=96, EQUALS=97, TIMES=98, 
		DIVIDE=99, PLUS=100, MINUS=101, SEMICOLON=102, POWER=103, COLON=104, DQUOTE=105, 
		QUOTE=106, QMARK=107;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "COMMENT", "LINE_COMMENT", "WS", "NEWLINE", 
			"TAB", "BYTE_ORDER_MARK", "CALL", "GOTO", "GO", "TO", "PROCEDURE", "PROC", 
			"END", "DECLARE", "ARGUMENT", "DEFINE", "BINARY", "DECIMAL", "AUTOMATIC", 
			"BUILTIN", "INTRINSIC", "STATIC", "VARIABLE", "BASED", "DEFINED", "INTERNAL", 
			"EXTERNAL", "RETURN", "IF", "THEN", "ELSE", "ELIF", "RETURNS", "POINTER", 
			"BIT", "CHARACTER", "ENTRY", "FIXED", "FLOAT", "OFFSET", "STRING", "VARYING", 
			"COROUTINE", "COFUNCTION", "LOOP", "WHILE", "UNTIL", "ENDLOOP", "RELOOP", 
			"BASE_B", "BASE_O", "BASE_D", "BASE_H", "FRAC_B", "FRAC_D", "FRAC_O", 
			"FRAC_H", "IDENTIFIER", "BINARY_PATTERN", "OCTAL_PATTERN", "HEXADECIMAL_PATTERN", 
			"DECIMAL_PATTERN", "LSEP", "BIN", "OCT", "DEC", "HEX", "ARROW", "DOT", 
			"COMMA", "LPAR", "RPAR", "LBRACK", "RBRACK", "LBRACE", "RBRACE", "EQUALS", 
			"TIMES", "DIVIDE", "PLUS", "MINUS", "SEMICOLON", "POWER", "COLON", "DQUOTE", 
			"QUOTE", "QMARK"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'%'", "'include'", "'.inc'", "'?|'", "'?&'", "'|'", "'~'", "'&'", 
			"'||'", "'>'", "'>='", "'<'", "'<='", "'~>'", "'~='", "'~<'", "'>>'", 
			"'<<'", "'>>>'", "'<<<'", null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'->'", 
			"'.'", "','", "'('", "')'", "'['", "']'", "'{'", "'}'", "'='", "'*'", 
			"'/'", "'+'", "'-'", "';'", "'**'", "':'", "'\"'", "'''", "'?'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "COMMENT", "LINE_COMMENT", 
			"WS", "NEWLINE", "TAB", "BYTE_ORDER_MARK", "CALL", "GOTO", "GO", "TO", 
			"PROCEDURE", "PROC", "END", "DECLARE", "ARGUMENT", "DEFINE", "BINARY", 
			"DECIMAL", "AUTOMATIC", "BUILTIN", "INTRINSIC", "STATIC", "VARIABLE", 
			"BASED", "DEFINED", "INTERNAL", "EXTERNAL", "RETURN", "IF", "THEN", "ELSE", 
			"ELIF", "RETURNS", "POINTER", "BIT", "CHARACTER", "ENTRY", "FIXED", "FLOAT", 
			"OFFSET", "STRING", "VARYING", "COROUTINE", "COFUNCTION", "LOOP", "WHILE", 
			"UNTIL", "ENDLOOP", "RELOOP", "BASE_B", "BASE_O", "BASE_D", "BASE_H", 
			"FRAC_B", "FRAC_D", "FRAC_O", "FRAC_H", "IDENTIFIER", "BINARY_PATTERN", 
			"OCTAL_PATTERN", "HEXADECIMAL_PATTERN", "DECIMAL_PATTERN", "LSEP", "BIN", 
			"OCT", "DEC", "HEX", "ARROW", "DOT", "COMMA", "LPAR", "RPAR", "LBRACK", 
			"RBRACK", "LBRACE", "RBRACE", "EQUALS", "TIMES", "DIVIDE", "PLUS", "MINUS", 
			"SEMICOLON", "POWER", "COLON", "DQUOTE", "QUOTE", "QMARK"
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


	    public String langcode = "en";

	    /* private Map<String, Integer> words; */


	public PostLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Post.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2m\u0360\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3"+
		"\21\3\21\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3"+
		"\25\3\25\3\26\3\26\3\26\3\26\3\26\7\26\u011e\n\26\f\26\16\26\u0121\13"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u012c\n\27\f\27"+
		"\16\27\u012f\13\27\3\27\3\27\3\27\3\27\3\30\6\30\u0136\n\30\r\30\16\30"+
		"\u0137\3\30\3\30\3\31\6\31\u013d\n\31\r\31\16\31\u013e\3\31\3\31\3\32"+
		"\6\32\u0144\n\32\r\32\16\32\u0145\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \5 \u016b\n \3!\3!\3!\3!\3!"+
		"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0180\n#\3$\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\5$\u018d\n$\3%\3%\3%\3%\3%\3%\3%\3%\3%\5%\u0198"+
		"\n%\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u01a3\n&\3\'\3\'\3\'\3\'\3\'\3\'\3\'"+
		"\3\'\3\'\3\'\5\'\u01af\n\'\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\3(\5(\u01be"+
		"\n(\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3+\3+\3+\3+"+
		"\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3/\3/\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63"+
		"\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66"+
		"\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\3\67\5\67\u022d\n\67\38\38\38\38\39\39\39\39\39\39\39\39\3"+
		"9\39\39\39\39\59\u0240\n9\3:\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3;\3<\3<\3"+
		"<\3<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\3=\5=\u025d\n=\3>\3>\3>\3>\3>\3>\3"+
		">\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u0270\n?\3@\3@\3@\3@\3@\3@\3@\3@\3"+
		"@\3@\3@\3@\5@\u027e\n@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\5A\u028d"+
		"\nA\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E"+
		"\3E\3E\3E\3F\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\5G\u02b3\nG\3H\3H\3H\3H\5H"+
		"\u02b9\nH\3I\3I\3I\3I\5I\u02bf\nI\3J\3J\3J\3J\5J\u02c5\nJ\3K\3K\6K\u02c9"+
		"\nK\rK\16K\u02ca\3L\3L\6L\u02cf\nL\rL\16L\u02d0\3M\3M\6M\u02d5\nM\rM\16"+
		"M\u02d6\3N\3N\6N\u02db\nN\rN\16N\u02dc\3O\6O\u02e0\nO\rO\16O\u02e1\3P"+
		"\3P\3P\3P\7P\u02e8\nP\fP\16P\u02eb\13P\6P\u02ed\nP\rP\16P\u02ee\3P\5P"+
		"\u02f2\nP\3P\3P\3Q\3Q\3Q\3Q\7Q\u02fa\nQ\fQ\16Q\u02fd\13Q\6Q\u02ff\nQ\r"+
		"Q\16Q\u0300\3Q\5Q\u0304\nQ\3Q\3Q\3R\3R\3R\3R\7R\u030c\nR\fR\16R\u030f"+
		"\13R\6R\u0311\nR\rR\16R\u0312\3R\5R\u0316\nR\3R\3R\3S\3S\3S\3S\7S\u031e"+
		"\nS\fS\16S\u0321\13S\6S\u0323\nS\rS\16S\u0324\3S\5S\u0328\nS\3S\5S\u032b"+
		"\nS\3T\3T\3U\3U\3V\3V\3W\3W\3X\3X\3Y\3Y\3Y\3Z\3Z\3[\3[\3\\\3\\\3]\3]\3"+
		"^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3c\3c\3d\3d\3e\3e\3f\3f\3g\3g\3h\3h\3h\3"+
		"i\3i\3j\3j\3k\3k\3l\3l\4\u011f\u012d\2m\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083"+
		"C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095L\u0097"+
		"M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00ab"+
		"W\u00adX\u00afY\u00b1Z\u00b3[\u00b5\\\u00b7]\u00b9^\u00bb_\u00bd`\u00bf"+
		"a\u00c1b\u00c3c\u00c5d\u00c7e\u00c9f\u00cbg\u00cdh\u00cfi\u00d1j\u00d3"+
		"k\u00d5l\u00d7m\3\2\t\4\2\f\f\17\17\3\2\62\63\3\2\62;\3\2\629\5\2\62;"+
		"CHch\5\2C\\aac|\4\2\"\"aa\2\u0388\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2"+
		"\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3"+
		"\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\3\u00d9\3\2\2"+
		"\2\5\u00db\3\2\2\2\7\u00e3\3\2\2\2\t\u00e8\3\2\2\2\13\u00eb\3\2\2\2\r"+
		"\u00ee\3\2\2\2\17\u00f0\3\2\2\2\21\u00f2\3\2\2\2\23\u00f4\3\2\2\2\25\u00f7"+
		"\3\2\2\2\27\u00f9\3\2\2\2\31\u00fc\3\2\2\2\33\u00fe\3\2\2\2\35\u0101\3"+
		"\2\2\2\37\u0104\3\2\2\2!\u0107\3\2\2\2#\u010a\3\2\2\2%\u010d\3\2\2\2\'"+
		"\u0110\3\2\2\2)\u0114\3\2\2\2+\u0118\3\2\2\2-\u0127\3\2\2\2/\u0135\3\2"+
		"\2\2\61\u013c\3\2\2\2\63\u0143\3\2\2\2\65\u0149\3\2\2\2\67\u014d\3\2\2"+
		"\29\u0152\3\2\2\2;\u0157\3\2\2\2=\u015a\3\2\2\2?\u016a\3\2\2\2A\u016c"+
		"\3\2\2\2C\u0171\3\2\2\2E\u017f\3\2\2\2G\u018c\3\2\2\2I\u0197\3\2\2\2K"+
		"\u01a2\3\2\2\2M\u01ae\3\2\2\2O\u01bd\3\2\2\2Q\u01bf\3\2\2\2S\u01c7\3\2"+
		"\2\2U\u01d1\3\2\2\2W\u01d8\3\2\2\2Y\u01e1\3\2\2\2[\u01e7\3\2\2\2]\u01ef"+
		"\3\2\2\2_\u01f8\3\2\2\2a\u0201\3\2\2\2c\u0208\3\2\2\2e\u020b\3\2\2\2g"+
		"\u0210\3\2\2\2i\u0215\3\2\2\2k\u021a\3\2\2\2m\u022c\3\2\2\2o\u022e\3\2"+
		"\2\2q\u023f\3\2\2\2s\u0241\3\2\2\2u\u0247\3\2\2\2w\u024d\3\2\2\2y\u025c"+
		"\3\2\2\2{\u025e\3\2\2\2}\u026f\3\2\2\2\177\u027d\3\2\2\2\u0081\u028c\3"+
		"\2\2\2\u0083\u028e\3\2\2\2\u0085\u0293\3\2\2\2\u0087\u0299\3\2\2\2\u0089"+
		"\u029f\3\2\2\2\u008b\u02a7\3\2\2\2\u008d\u02b2\3\2\2\2\u008f\u02b8\3\2"+
		"\2\2\u0091\u02be\3\2\2\2\u0093\u02c4\3\2\2\2\u0095\u02c6\3\2\2\2\u0097"+
		"\u02cc\3\2\2\2\u0099\u02d2\3\2\2\2\u009b\u02d8\3\2\2\2\u009d\u02df\3\2"+
		"\2\2\u009f\u02ec\3\2\2\2\u00a1\u02fe\3\2\2\2\u00a3\u0310\3\2\2\2\u00a5"+
		"\u0322\3\2\2\2\u00a7\u032c\3\2\2\2\u00a9\u032e\3\2\2\2\u00ab\u0330\3\2"+
		"\2\2\u00ad\u0332\3\2\2\2\u00af\u0334\3\2\2\2\u00b1\u0336\3\2\2\2\u00b3"+
		"\u0339\3\2\2\2\u00b5\u033b\3\2\2\2\u00b7\u033d\3\2\2\2\u00b9\u033f\3\2"+
		"\2\2\u00bb\u0341\3\2\2\2\u00bd\u0343\3\2\2\2\u00bf\u0345\3\2\2\2\u00c1"+
		"\u0347\3\2\2\2\u00c3\u0349\3\2\2\2\u00c5\u034b\3\2\2\2\u00c7\u034d\3\2"+
		"\2\2\u00c9\u034f\3\2\2\2\u00cb\u0351\3\2\2\2\u00cd\u0353\3\2\2\2\u00cf"+
		"\u0355\3\2\2\2\u00d1\u0358\3\2\2\2\u00d3\u035a\3\2\2\2\u00d5\u035c\3\2"+
		"\2\2\u00d7\u035e\3\2\2\2\u00d9\u00da\7\'\2\2\u00da\4\3\2\2\2\u00db\u00dc"+
		"\7k\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7e\2\2\u00de\u00df\7n\2\2\u00df"+
		"\u00e0\7w\2\2\u00e0\u00e1\7f\2\2\u00e1\u00e2\7g\2\2\u00e2\6\3\2\2\2\u00e3"+
		"\u00e4\7\60\2\2\u00e4\u00e5\7k\2\2\u00e5\u00e6\7p\2\2\u00e6\u00e7\7e\2"+
		"\2\u00e7\b\3\2\2\2\u00e8\u00e9\7A\2\2\u00e9\u00ea\7~\2\2\u00ea\n\3\2\2"+
		"\2\u00eb\u00ec\7A\2\2\u00ec\u00ed\7(\2\2\u00ed\f\3\2\2\2\u00ee\u00ef\7"+
		"~\2\2\u00ef\16\3\2\2\2\u00f0\u00f1\7\u0080\2\2\u00f1\20\3\2\2\2\u00f2"+
		"\u00f3\7(\2\2\u00f3\22\3\2\2\2\u00f4\u00f5\7~\2\2\u00f5\u00f6\7~\2\2\u00f6"+
		"\24\3\2\2\2\u00f7\u00f8\7@\2\2\u00f8\26\3\2\2\2\u00f9\u00fa\7@\2\2\u00fa"+
		"\u00fb\7?\2\2\u00fb\30\3\2\2\2\u00fc\u00fd\7>\2\2\u00fd\32\3\2\2\2\u00fe"+
		"\u00ff\7>\2\2\u00ff\u0100\7?\2\2\u0100\34\3\2\2\2\u0101\u0102\7\u0080"+
		"\2\2\u0102\u0103\7@\2\2\u0103\36\3\2\2\2\u0104\u0105\7\u0080\2\2\u0105"+
		"\u0106\7?\2\2\u0106 \3\2\2\2\u0107\u0108\7\u0080\2\2\u0108\u0109\7>\2"+
		"\2\u0109\"\3\2\2\2\u010a\u010b\7@\2\2\u010b\u010c\7@\2\2\u010c$\3\2\2"+
		"\2\u010d\u010e\7>\2\2\u010e\u010f\7>\2\2\u010f&\3\2\2\2\u0110\u0111\7"+
		"@\2\2\u0111\u0112\7@\2\2\u0112\u0113\7@\2\2\u0113(\3\2\2\2\u0114\u0115"+
		"\7>\2\2\u0115\u0116\7>\2\2\u0116\u0117\7>\2\2\u0117*\3\2\2\2\u0118\u0119"+
		"\7\61\2\2\u0119\u011a\7,\2\2\u011a\u011f\3\2\2\2\u011b\u011e\5+\26\2\u011c"+
		"\u011e\13\2\2\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e\u0121\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u011f\u011d\3\2\2\2\u0120\u0122\3\2\2\2\u0121"+
		"\u011f\3\2\2\2\u0122\u0123\7,\2\2\u0123\u0124\7\61\2\2\u0124\u0125\3\2"+
		"\2\2\u0125\u0126\b\26\2\2\u0126,\3\2\2\2\u0127\u0128\7\61\2\2\u0128\u0129"+
		"\7\61\2\2\u0129\u012d\3\2\2\2\u012a\u012c\13\2\2\2\u012b\u012a\3\2\2\2"+
		"\u012c\u012f\3\2\2\2\u012d\u012e\3\2\2\2\u012d\u012b\3\2\2\2\u012e\u0130"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u0130\u0131\7\f\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\b\27\3\2\u0133.\3\2\2\2\u0134\u0136\7\"\2\2\u0135\u0134\3\2\2\2"+
		"\u0136\u0137\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u0139"+
		"\3\2\2\2\u0139\u013a\b\30\4\2\u013a\60\3\2\2\2\u013b\u013d\t\2\2\2\u013c"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2"+
		"\2\2\u013f\u0140\3\2\2\2\u0140\u0141\b\31\4\2\u0141\62\3\2\2\2\u0142\u0144"+
		"\7\13\2\2\u0143\u0142\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0143\3\2\2\2"+
		"\u0145\u0146\3\2\2\2\u0146\u0147\3\2\2\2\u0147\u0148\b\32\4\2\u0148\64"+
		"\3\2\2\2\u0149\u014a\7\u00f1\2\2\u014a\u014b\7\u00bd\2\2\u014b\u014c\7"+
		"\u00c1\2\2\u014c\66\3\2\2\2\u014d\u014e\7e\2\2\u014e\u014f\7c\2\2\u014f"+
		"\u0150\7n\2\2\u0150\u0151\7n\2\2\u01518\3\2\2\2\u0152\u0153\7i\2\2\u0153"+
		"\u0154\7q\2\2\u0154\u0155\7v\2\2\u0155\u0156\7q\2\2\u0156:\3\2\2\2\u0157"+
		"\u0158\7i\2\2\u0158\u0159\7q\2\2\u0159<\3\2\2\2\u015a\u015b\7v\2\2\u015b"+
		"\u015c\7q\2\2\u015c>\3\2\2\2\u015d\u015e\7r\2\2\u015e\u015f\7t\2\2\u015f"+
		"\u0160\7q\2\2\u0160\u0161\7e\2\2\u0161\u0162\7g\2\2\u0162\u0163\7f\2\2"+
		"\u0163\u0164\7w\2\2\u0164\u0165\7t\2\2\u0165\u016b\7g\2\2\u0166\u0167"+
		"\7r\2\2\u0167\u0168\7t\2\2\u0168\u0169\7q\2\2\u0169\u016b\7e\2\2\u016a"+
		"\u015d\3\2\2\2\u016a\u0166\3\2\2\2\u016b@\3\2\2\2\u016c\u016d\7r\2\2\u016d"+
		"\u016e\7t\2\2\u016e\u016f\7q\2\2\u016f\u0170\7e\2\2\u0170B\3\2\2\2\u0171"+
		"\u0172\7g\2\2\u0172\u0173\7p\2\2\u0173\u0174\7f\2\2\u0174D\3\2\2\2\u0175"+
		"\u0176\7f\2\2\u0176\u0177\7g\2\2\u0177\u0178\7e\2\2\u0178\u0179\7n\2\2"+
		"\u0179\u017a\7c\2\2\u017a\u017b\7t\2\2\u017b\u0180\7g\2\2\u017c\u017d"+
		"\7f\2\2\u017d\u017e\7e\2\2\u017e\u0180\7n\2\2\u017f\u0175\3\2\2\2\u017f"+
		"\u017c\3\2\2\2\u0180F\3\2\2\2\u0181\u0182\7c\2\2\u0182\u0183\7t\2\2\u0183"+
		"\u0184\7i\2\2\u0184\u0185\7w\2\2\u0185\u0186\7o\2\2\u0186\u0187\7g\2\2"+
		"\u0187\u0188\7p\2\2\u0188\u018d\7v\2\2\u0189\u018a\7c\2\2\u018a\u018b"+
		"\7t\2\2\u018b\u018d\7i\2\2\u018c\u0181\3\2\2\2\u018c\u0189\3\2\2\2\u018d"+
		"H\3\2\2\2\u018e\u018f\7f\2\2\u018f\u0190\7g\2\2\u0190\u0191\7h\2\2\u0191"+
		"\u0192\7k\2\2\u0192\u0193\7p\2\2\u0193\u0198\7g\2\2\u0194\u0195\7f\2\2"+
		"\u0195\u0196\7g\2\2\u0196\u0198\7h\2\2\u0197\u018e\3\2\2\2\u0197\u0194"+
		"\3\2\2\2\u0198J\3\2\2\2\u0199\u019a\7d\2\2\u019a\u019b\7k\2\2\u019b\u019c"+
		"\7p\2\2\u019c\u019d\7c\2\2\u019d\u019e\7t\2\2\u019e\u01a3\7{\2\2\u019f"+
		"\u01a0\7d\2\2\u01a0\u01a1\7k\2\2\u01a1\u01a3\7p\2\2\u01a2\u0199\3\2\2"+
		"\2\u01a2\u019f\3\2\2\2\u01a3L\3\2\2\2\u01a4\u01a5\7f\2\2\u01a5\u01a6\7"+
		"g\2\2\u01a6\u01a7\7e\2\2\u01a7\u01a8\7k\2\2\u01a8\u01a9\7o\2\2\u01a9\u01aa"+
		"\7c\2\2\u01aa\u01af\7n\2\2\u01ab\u01ac\7f\2\2\u01ac\u01ad\7g\2\2\u01ad"+
		"\u01af\7e\2\2\u01ae\u01a4\3\2\2\2\u01ae\u01ab\3\2\2\2\u01afN\3\2\2\2\u01b0"+
		"\u01b1\7c\2\2\u01b1\u01b2\7w\2\2\u01b2\u01b3\7v\2\2\u01b3\u01b4\7q\2\2"+
		"\u01b4\u01b5\7o\2\2\u01b5\u01b6\7c\2\2\u01b6\u01b7\7v\2\2\u01b7\u01b8"+
		"\7k\2\2\u01b8\u01be\7e\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7w\2\2\u01bb"+
		"\u01bc\7v\2\2\u01bc\u01be\7q\2\2\u01bd\u01b0\3\2\2\2\u01bd\u01b9\3\2\2"+
		"\2\u01beP\3\2\2\2\u01bf\u01c0\7d\2\2\u01c0\u01c1\7w\2\2\u01c1\u01c2\7"+
		"k\2\2\u01c2\u01c3\7n\2\2\u01c3\u01c4\7v\2\2\u01c4\u01c5\7k\2\2\u01c5\u01c6"+
		"\7p\2\2\u01c6R\3\2\2\2\u01c7\u01c8\7k\2\2\u01c8\u01c9\7p\2\2\u01c9\u01ca"+
		"\7v\2\2\u01ca\u01cb\7t\2\2\u01cb\u01cc\7k\2\2\u01cc\u01cd\7p\2\2\u01cd"+
		"\u01ce\7u\2\2\u01ce\u01cf\7k\2\2\u01cf\u01d0\7e\2\2\u01d0T\3\2\2\2\u01d1"+
		"\u01d2\7u\2\2\u01d2\u01d3\7v\2\2\u01d3\u01d4\7c\2\2\u01d4\u01d5\7v\2\2"+
		"\u01d5\u01d6\7k\2\2\u01d6\u01d7\7e\2\2\u01d7V\3\2\2\2\u01d8\u01d9\7x\2"+
		"\2\u01d9\u01da\7c\2\2\u01da\u01db\7t\2\2\u01db\u01dc\7k\2\2\u01dc\u01dd"+
		"\7c\2\2\u01dd\u01de\7d\2\2\u01de\u01df\7n\2\2\u01df\u01e0\7g\2\2\u01e0"+
		"X\3\2\2\2\u01e1\u01e2\7d\2\2\u01e2\u01e3\7c\2\2\u01e3\u01e4\7u\2\2\u01e4"+
		"\u01e5\7g\2\2\u01e5\u01e6\7f\2\2\u01e6Z\3\2\2\2\u01e7\u01e8\7f\2\2\u01e8"+
		"\u01e9\7g\2\2\u01e9\u01ea\7h\2\2\u01ea\u01eb\7k\2\2\u01eb\u01ec\7p\2\2"+
		"\u01ec\u01ed\7g\2\2\u01ed\u01ee\7f\2\2\u01ee\\\3\2\2\2\u01ef\u01f0\7k"+
		"\2\2\u01f0\u01f1\7p\2\2\u01f1\u01f2\7v\2\2\u01f2\u01f3\7g\2\2\u01f3\u01f4"+
		"\7t\2\2\u01f4\u01f5\7p\2\2\u01f5\u01f6\7c\2\2\u01f6\u01f7\7n\2\2\u01f7"+
		"^\3\2\2\2\u01f8\u01f9\7g\2\2\u01f9\u01fa\7z\2\2\u01fa\u01fb\7v\2\2\u01fb"+
		"\u01fc\7g\2\2\u01fc\u01fd\7t\2\2\u01fd\u01fe\7p\2\2\u01fe\u01ff\7c\2\2"+
		"\u01ff\u0200\7n\2\2\u0200`\3\2\2\2\u0201\u0202\7t\2\2\u0202\u0203\7g\2"+
		"\2\u0203\u0204\7v\2\2\u0204\u0205\7w\2\2\u0205\u0206\7t\2\2\u0206\u0207"+
		"\7p\2\2\u0207b\3\2\2\2\u0208\u0209\7k\2\2\u0209\u020a\7h\2\2\u020ad\3"+
		"\2\2\2\u020b\u020c\7v\2\2\u020c\u020d\7j\2\2\u020d\u020e\7g\2\2\u020e"+
		"\u020f\7p\2\2\u020ff\3\2\2\2\u0210\u0211\7g\2\2\u0211\u0212\7n\2\2\u0212"+
		"\u0213\7u\2\2\u0213\u0214\7g\2\2\u0214h\3\2\2\2\u0215\u0216\7g\2\2\u0216"+
		"\u0217\7n\2\2\u0217\u0218\7k\2\2\u0218\u0219\7h\2\2\u0219j\3\2\2\2\u021a"+
		"\u021b\7t\2\2\u021b\u021c\7g\2\2\u021c\u021d\7v\2\2\u021d\u021e\7w\2\2"+
		"\u021e\u021f\7t\2\2\u021f\u0220\7p\2\2\u0220\u0221\7u\2\2\u0221l\3\2\2"+
		"\2\u0222\u0223\7r\2\2\u0223\u0224\7q\2\2\u0224\u0225\7k\2\2\u0225\u0226"+
		"\7p\2\2\u0226\u0227\7v\2\2\u0227\u0228\7g\2\2\u0228\u022d\7t\2\2\u0229"+
		"\u022a\7r\2\2\u022a\u022b\7v\2\2\u022b\u022d\7t\2\2\u022c\u0222\3\2\2"+
		"\2\u022c\u0229\3\2\2\2\u022dn\3\2\2\2\u022e\u022f\7d\2\2\u022f\u0230\7"+
		"k\2\2\u0230\u0231\7v\2\2\u0231p\3\2\2\2\u0232\u0233\7e\2\2\u0233\u0234"+
		"\7j\2\2\u0234\u0235\7c\2\2\u0235\u0236\7t\2\2\u0236\u0237\7c\2\2\u0237"+
		"\u0238\7e\2\2\u0238\u0239\7v\2\2\u0239\u023a\7g\2\2\u023a\u0240\7t\2\2"+
		"\u023b\u023c\7e\2\2\u023c\u023d\7j\2\2\u023d\u023e\7c\2\2\u023e\u0240"+
		"\7t\2\2\u023f\u0232\3\2\2\2\u023f\u023b\3\2\2\2\u0240r\3\2\2\2\u0241\u0242"+
		"\7g\2\2\u0242\u0243\7p\2\2\u0243\u0244\7v\2\2\u0244\u0245\7t\2\2\u0245"+
		"\u0246\7{\2\2\u0246t\3\2\2\2\u0247\u0248\7h\2\2\u0248\u0249\7k\2\2\u0249"+
		"\u024a\7z\2\2\u024a\u024b\7g\2\2\u024b\u024c\7f\2\2\u024cv\3\2\2\2\u024d"+
		"\u024e\7h\2\2\u024e\u024f\7n\2\2\u024f\u0250\7q\2\2\u0250\u0251\7c\2\2"+
		"\u0251\u0252\7v\2\2\u0252x\3\2\2\2\u0253\u0254\7q\2\2\u0254\u0255\7h\2"+
		"\2\u0255\u0256\7h\2\2\u0256\u0257\7u\2\2\u0257\u0258\7g\2\2\u0258\u025d"+
		"\7v\2\2\u0259\u025a\7q\2\2\u025a\u025b\7h\2\2\u025b\u025d\7z\2\2\u025c"+
		"\u0253\3\2\2\2\u025c\u0259\3\2\2\2\u025dz\3\2\2\2\u025e\u025f\7u\2\2\u025f"+
		"\u0260\7v\2\2\u0260\u0261\7t\2\2\u0261\u0262\7k\2\2\u0262\u0263\7p\2\2"+
		"\u0263\u0264\7i\2\2\u0264|\3\2\2\2\u0265\u0266\7x\2\2\u0266\u0267\7c\2"+
		"\2\u0267\u0268\7t\2\2\u0268\u0269\7{\2\2\u0269\u026a\7k\2\2\u026a\u026b"+
		"\7p\2\2\u026b\u0270\7i\2\2\u026c\u026d\7x\2\2\u026d\u026e\7c\2\2\u026e"+
		"\u0270\7t\2\2\u026f\u0265\3\2\2\2\u026f\u026c\3\2\2\2\u0270~\3\2\2\2\u0271"+
		"\u0272\7e\2\2\u0272\u0273\7q\2\2\u0273\u0274\7t\2\2\u0274\u0275\7q\2\2"+
		"\u0275\u0276\7w\2\2\u0276\u0277\7v\2\2\u0277\u0278\7k\2\2\u0278\u0279"+
		"\7p\2\2\u0279\u027e\7g\2\2\u027a\u027b\7e\2\2\u027b\u027c\7q\2\2\u027c"+
		"\u027e\7t\2\2\u027d\u0271\3\2\2\2\u027d\u027a\3\2\2\2\u027e\u0080\3\2"+
		"\2\2\u027f\u0280\7e\2\2\u0280\u0281\7q\2\2\u0281\u0282\7h\2\2\u0282\u0283"+
		"\7w\2\2\u0283\u0284\7p\2\2\u0284\u0285\7e\2\2\u0285\u0286\7v\2\2\u0286"+
		"\u0287\7k\2\2\u0287\u0288\7q\2\2\u0288\u028d\7p\2\2\u0289\u028a\7e\2\2"+
		"\u028a\u028b\7q\2\2\u028b\u028d\7h\2\2\u028c\u027f\3\2\2\2\u028c\u0289"+
		"\3\2\2\2\u028d\u0082\3\2\2\2\u028e\u028f\7n\2\2\u028f\u0290\7q\2\2\u0290"+
		"\u0291\7q\2\2\u0291\u0292\7r\2\2\u0292\u0084\3\2\2\2\u0293\u0294\7y\2"+
		"\2\u0294\u0295\7j\2\2\u0295\u0296\7k\2\2\u0296\u0297\7n\2\2\u0297\u0298"+
		"\7g\2\2\u0298\u0086\3\2\2\2\u0299\u029a\7w\2\2\u029a\u029b\7p\2\2\u029b"+
		"\u029c\7v\2\2\u029c\u029d\7k\2\2\u029d\u029e\7n\2\2\u029e\u0088\3\2\2"+
		"\2\u029f\u02a0\7g\2\2\u02a0\u02a1\7p\2\2\u02a1\u02a2\7f\2\2\u02a2\u02a3"+
		"\7n\2\2\u02a3\u02a4\7q\2\2\u02a4\u02a5\7q\2\2\u02a5\u02a6\7r\2\2\u02a6"+
		"\u008a\3\2\2\2\u02a7\u02a8\7t\2\2\u02a8\u02a9\7g\2\2\u02a9\u02aa\7n\2"+
		"\2\u02aa\u02ab\7q\2\2\u02ab\u02ac\7q\2\2\u02ac\u02ad\7r\2\2\u02ad\u008c"+
		"\3\2\2\2\u02ae\u02af\7<\2\2\u02af\u02b3\7d\2\2\u02b0\u02b1\7<\2\2\u02b1"+
		"\u02b3\7D\2\2\u02b2\u02ae\3\2\2\2\u02b2\u02b0\3\2\2\2\u02b3\u008e\3\2"+
		"\2\2\u02b4\u02b5\7<\2\2\u02b5\u02b9\7q\2\2\u02b6\u02b7\7<\2\2\u02b7\u02b9"+
		"\7Q\2\2\u02b8\u02b4\3\2\2\2\u02b8\u02b6\3\2\2\2\u02b9\u0090\3\2\2\2\u02ba"+
		"\u02bb\7<\2\2\u02bb\u02bf\7f\2\2\u02bc\u02bd\7<\2\2\u02bd\u02bf\7F\2\2"+
		"\u02be\u02ba\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u0092\3\2\2\2\u02c0\u02c1"+
		"\7<\2\2\u02c1\u02c5\7j\2\2\u02c2\u02c3\7<\2\2\u02c3\u02c5\7J\2\2\u02c4"+
		"\u02c0\3\2\2\2\u02c4\u02c2\3\2\2\2\u02c5\u0094\3\2\2\2\u02c6\u02c8\7\60"+
		"\2\2\u02c7\u02c9\t\3\2\2\u02c8\u02c7\3\2\2\2\u02c9\u02ca\3\2\2\2\u02ca"+
		"\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u0096\3\2\2\2\u02cc\u02ce\7\60"+
		"\2\2\u02cd\u02cf\t\4\2\2\u02ce\u02cd\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0"+
		"\u02ce\3\2\2\2\u02d0\u02d1\3\2\2\2\u02d1\u0098\3\2\2\2\u02d2\u02d4\7\60"+
		"\2\2\u02d3\u02d5\t\5\2\2\u02d4\u02d3\3\2\2\2\u02d5\u02d6\3\2\2\2\u02d6"+
		"\u02d4\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u009a\3\2\2\2\u02d8\u02da\7\60"+
		"\2\2\u02d9\u02db\t\6\2\2\u02da\u02d9\3\2\2\2\u02db\u02dc\3\2\2\2\u02dc"+
		"\u02da\3\2\2\2\u02dc\u02dd\3\2\2\2\u02dd\u009c\3\2\2\2\u02de\u02e0\t\7"+
		"\2\2\u02df\u02de\3\2\2\2\u02e0\u02e1\3\2\2\2\u02e1\u02df\3\2\2\2\u02e1"+
		"\u02e2\3\2\2\2\u02e2\u009e\3\2\2\2\u02e3\u02e9\5\u00a9U\2\u02e4\u02e5"+
		"\5\u00a7T\2\u02e5\u02e6\5\u00a9U\2\u02e6\u02e8\3\2\2\2\u02e7\u02e4\3\2"+
		"\2\2\u02e8\u02eb\3\2\2\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02ed\3\2\2\2\u02eb\u02e9\3\2\2\2\u02ec\u02e3\3\2\2\2\u02ed\u02ee\3\2"+
		"\2\2\u02ee\u02ec\3\2\2\2\u02ee\u02ef\3\2\2\2\u02ef\u02f1\3\2\2\2\u02f0"+
		"\u02f2\5\u0095K\2\u02f1\u02f0\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f3"+
		"\3\2\2\2\u02f3\u02f4\5\u008dG\2\u02f4\u00a0\3\2\2\2\u02f5\u02fb\5\u00ab"+
		"V\2\u02f6\u02f7\5\u00a7T\2\u02f7\u02f8\5\u00abV\2\u02f8\u02fa\3\2\2\2"+
		"\u02f9\u02f6\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb\u02fc"+
		"\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u02f5\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u0301\3\2\2\2\u0301\u0303\3\2"+
		"\2\2\u0302\u0304\5\u0099M\2\u0303\u0302\3\2\2\2\u0303\u0304\3\2\2\2\u0304"+
		"\u0305\3\2\2\2\u0305\u0306\5\u008fH\2\u0306\u00a2\3\2\2\2\u0307\u030d"+
		"\5\u00afX\2\u0308\u0309\5\u00a7T\2\u0309\u030a\5\u00afX\2\u030a\u030c"+
		"\3\2\2\2\u030b\u0308\3\2\2\2\u030c\u030f\3\2\2\2\u030d\u030b\3\2\2\2\u030d"+
		"\u030e\3\2\2\2\u030e\u0311\3\2\2\2\u030f\u030d\3\2\2\2\u0310\u0307\3\2"+
		"\2\2\u0311\u0312\3\2\2\2\u0312\u0310\3\2\2\2\u0312\u0313\3\2\2\2\u0313"+
		"\u0315\3\2\2\2\u0314\u0316\5\u009bN\2\u0315\u0314\3\2\2\2\u0315\u0316"+
		"\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\5\u0093J\2\u0318\u00a4\3\2\2"+
		"\2\u0319\u031f\5\u00adW\2\u031a\u031b\5\u00a7T\2\u031b\u031c\5\u00adW"+
		"\2\u031c\u031e\3\2\2\2\u031d\u031a\3\2\2\2\u031e\u0321\3\2\2\2\u031f\u031d"+
		"\3\2\2\2\u031f\u0320\3\2\2\2\u0320\u0323\3\2\2\2\u0321\u031f\3\2\2\2\u0322"+
		"\u0319\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0322\3\2\2\2\u0324\u0325\3\2"+
		"\2\2\u0325\u0327\3\2\2\2\u0326\u0328\5\u0097L\2\u0327\u0326\3\2\2\2\u0327"+
		"\u0328\3\2\2\2\u0328\u032a\3\2\2\2\u0329\u032b\5\u0091I\2\u032a\u0329"+
		"\3\2\2\2\u032a\u032b\3\2\2\2\u032b\u00a6\3\2\2\2\u032c\u032d\t\b\2\2\u032d"+
		"\u00a8\3\2\2\2\u032e\u032f\t\3\2\2\u032f\u00aa\3\2\2\2\u0330\u0331\t\5"+
		"\2\2\u0331\u00ac\3\2\2\2\u0332\u0333\t\4\2\2\u0333\u00ae\3\2\2\2\u0334"+
		"\u0335\t\6\2\2\u0335\u00b0\3\2\2\2\u0336\u0337\7/\2\2\u0337\u0338\7@\2"+
		"\2\u0338\u00b2\3\2\2\2\u0339\u033a\7\60\2\2\u033a\u00b4\3\2\2\2\u033b"+
		"\u033c\7.\2\2\u033c\u00b6\3\2\2\2\u033d\u033e\7*\2\2\u033e\u00b8\3\2\2"+
		"\2\u033f\u0340\7+\2\2\u0340\u00ba\3\2\2\2\u0341\u0342\7]\2\2\u0342\u00bc"+
		"\3\2\2\2\u0343\u0344\7_\2\2\u0344\u00be\3\2\2\2\u0345\u0346\7}\2\2\u0346"+
		"\u00c0\3\2\2\2\u0347\u0348\7\177\2\2\u0348\u00c2\3\2\2\2\u0349\u034a\7"+
		"?\2\2\u034a\u00c4\3\2\2\2\u034b\u034c\7,\2\2\u034c\u00c6\3\2\2\2\u034d"+
		"\u034e\7\61\2\2\u034e\u00c8\3\2\2\2\u034f\u0350\7-\2\2\u0350\u00ca\3\2"+
		"\2\2\u0351\u0352\7/\2\2\u0352\u00cc\3\2\2\2\u0353\u0354\7=\2\2\u0354\u00ce"+
		"\3\2\2\2\u0355\u0356\7,\2\2\u0356\u0357\7,\2\2\u0357\u00d0\3\2\2\2\u0358"+
		"\u0359\7<\2\2\u0359\u00d2\3\2\2\2\u035a\u035b\7$\2\2\u035b\u00d4\3\2\2"+
		"\2\u035c\u035d\7)\2\2\u035d\u00d6\3\2\2\2\u035e\u035f\7A\2\2\u035f\u00d8"+
		"\3\2\2\2,\2\u011d\u011f\u012d\u0137\u013e\u0145\u016a\u017f\u018c\u0197"+
		"\u01a2\u01ae\u01bd\u022c\u023f\u025c\u026f\u027d\u028c\u02b2\u02b8\u02be"+
		"\u02c4\u02ca\u02d0\u02d6\u02dc\u02e1\u02e9\u02ee\u02f1\u02fb\u0300\u0303"+
		"\u030d\u0312\u0315\u031f\u0324\u0327\u032a\5\2\4\2\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}