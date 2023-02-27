// Generated from d:\Git\GitHub\Steadsoft\imperium\grammar\Antlr\Imperium.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ImperiumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ACCEPT=1, ALIAS=2, ALIGNED=3, ALL=4, ANY=5, ARGUMENT=6, AS=7, ASSEMBLER=8, 
		BASED=9, BINARY=10, BIT=11, BOOLEAN=12, BOOTSTRAP=13, BUILTIN=14, BY=15, 
		BYPASS=16, CALL=17, CHARACTER=18, COFUNCTION=19, COLD=20, COROUTINE=21, 
		DECIMAL=22, DECLARE=23, DEFINE=24, DEFINED=25, ELIF=26, ELSE=27, END=28, 
		ENDLOOP=29, ENTRY=30, ENUM=31, FIXED=32, FLOAT=33, FUNCTION=34, GOTO=35, 
		IF=36, INC=37, INCLUDE=38, INTERNAL=39, INTERRUPT=40, INTRINSIC=41, LANGUAGE=42, 
		LOOP=43, MAIN=44, NAKED=45, NORETURN=46, OFFSET=47, OTHERWISE=48, OUT=49, 
		PAD=50, POINTER=51, PRIVATE=52, PROCEDURE=53, PUBLIC=54, RAW=55, READONLY=56, 
		RECURSIVE=57, REF=58, RELOOP=59, RETAIN=60, RETURN=61, RETURNON=62, RETURNS=63, 
		SCANAS=64, SCOPE=65, SECTION=66, SELECT=67, SINGLET=68, STACK=69, STATIC=70, 
		STRING=71, STRUCTURE=72, THEN=73, TO=74, TRAITS=75, TYPE=76, UNALIGNED=77, 
		UNTIL=78, USES=79, USING=80, UTF=81, VARIABLE=82, VARYING=83, WHEN=84, 
		WHILE=85, YIELD=86, COMMENT=87, LINE_COMMENT=88, NEWLINE=89, STRING_LITERAL_3=90, 
		STRING_LITERAL_2=91, STRING_LITERAL_1=92, BYTE_ORDER_MARK=93, LABEL=94, 
		BINARY_PATTERN=95, OCTAL_PATTERN=96, HEXADECIMAL_PATTERN=97, INTEGER=98, 
		AINTEGER=99, DECIMAL_PATTERN=100, HASH=101, AT=102, RARROW_U=103, MAPSTO_U=104, 
		DOT=105, COMMA=106, LPAR=107, RPAR=108, LBRACK=109, RBRACK=110, LBRACE=111, 
		RBRACE=112, EQUALS=113, ASSIGN_U=114, TIMES=115, DIVIDE_U=116, PLUS=117, 
		MINUS=118, SEMICOLON=119, POWER_U=120, COLON=121, TRIQUOTE=122, DIQUOTE=123, 
		QUOTE=124, SQUOTE=125, NOT=126, GT=127, LT=128, GTE_U=129, LTE_U=130, 
		NGT=131, NLT=132, NE_U=133, PCNT=134, AND=135, OR=136, NAND=137, NOR=138, 
		XOR_U=139, XNOR_U=140, REDAND=141, REDOR=142, REDNAND=143, REDNOR=144, 
		REDXOR_U=145, REDXNOR_U=146, LOGAND=147, LOGOR=148, CONC=149, L_LOG_SHIFT=150, 
		R_LOG_SHIFT=151, R_ART_SHIFT=152, L_ROTATE_U=153, R_ROTATE_U=154, RANGE=155, 
		ASMS=156, ASME=157, IDENTIFIER=158, UNRECOGNIZED=159, ASSEMBLER_END=160, 
		ASSEMBLER_NEWLINE=161, ASM_IDENTIFIER=162, ASSEMBLER_DEC_INTEGER=163, 
		ASSEMBLER_HEX_INTEGER=164, ASSEMBLER_OCT_INTEGER=165, ASSEMBLER_BIN_INTEGER=166, 
		ASSEMBLER_COMMENT=167, ASSEMBLER_LINE_COMMENT=168, ASSEMBLER_PUNCTUATOR=169, 
		ASSEMBLER_SYMBOL=170, ASSEMBLER_BRACKET=171, ASSEMBLER_PAREN=172, ASM_LBRACE=173, 
		ASM_RBRACE=174, ASSEMBLER_SPACES=175;
	public static final int
		RULE_translationUnit = 0, RULE_uses = 1, RULE_scope = 2, RULE_scopeStart = 3, 
		RULE_scopeEnd = 4, RULE_assemblerToken = 5, RULE_traits = 6, RULE_traitsStart = 7, 
		RULE_traitsEnd = 8, RULE_declarationTraits = 9, RULE_declarationTrait = 10, 
		RULE_procedureTraits = 11, RULE_procedureTraitsList = 12, RULE_procedureTrait = 13, 
		RULE_procedureRule = 14, RULE_target = 15, RULE_asmBlock = 16, RULE_asmOptions = 17, 
		RULE_functionRule = 18, RULE_procedureStmt = 19, RULE_functionStmt = 20, 
		RULE_targetSpec = 21, RULE_procedureAttributes = 22, RULE_functionAttributes = 23, 
		RULE_procedureEnd = 24, RULE_functionEnd = 25, RULE_returnsDescriptor = 26, 
		RULE_terminator = 27, RULE_labelStmt = 28, RULE_passiveStmt = 29, RULE_assemblerStmt = 30, 
		RULE_assemblerInlineComment = 31, RULE_activeStmt = 32, RULE_nullStmt = 33, 
		RULE_assignmentStmt = 34, RULE_reference = 35, RULE_arguments = 36, RULE_argumentsList = 37, 
		RULE_basicReference = 38, RULE_structureQualification = 39, RULE_structureQualificationList = 40, 
		RULE_subscript = 41, RULE_subscriptCommalist = 42, RULE_parenthesizedExpression = 43, 
		RULE_primitiveExpression = 44, RULE_prefixExpression = 45, RULE_bitAdjustOperator = 46, 
		RULE_additionOperator = 47, RULE_multiplyOperator = 48, RULE_boolAndOperator = 49, 
		RULE_boolXorOperator = 50, RULE_boolOrOperator = 51, RULE_expression = 52, 
		RULE_map_set = 53, RULE_bool_set = 54, RULE_prefixOperator = 55, RULE_comparisonOperator = 56, 
		RULE_shiftOperator = 57, RULE_callStmt = 58, RULE_gotoStmt = 59, RULE_endloopStmt = 60, 
		RULE_reloopStmt = 61, RULE_declareStmt = 62, RULE_declareAsBody = 63, 
		RULE_declarationBody = 64, RULE_typeInfo = 65, RULE_dimensionSuffix = 66, 
		RULE_boundPair = 67, RULE_boundPairCommalist = 68, RULE_lowerBound = 69, 
		RULE_upperBound = 70, RULE_attributes = 71, RULE_memoryAttribute = 72, 
		RULE_dataAttribute = 73, RULE_numericScale = 74, RULE_linkageOption = 75, 
		RULE_linkageSection = 76, RULE_precision = 77, RULE_numberOfDigits = 78, 
		RULE_scale_factor = 79, RULE_maxStringLength = 80, RULE_maxLength = 81, 
		RULE_based = 82, RULE_defined = 83, RULE_coprocedureSpecifier = 84, RULE_handlerSpecifier = 85, 
		RULE_parameterNameCommalist = 86, RULE_returnStmt = 87, RULE_ifStmt = 88, 
		RULE_ifEnd = 89, RULE_thenClause = 90, RULE_elseClause = 91, RULE_elifClause = 92, 
		RULE_loopStmt = 93, RULE_whileLoop = 94, RULE_untilLoop = 95, RULE_loopEnd = 96, 
		RULE_whileOption = 97, RULE_untilOption = 98, RULE_selectStmt = 99, RULE_selectEnd = 100, 
		RULE_selectClause = 101, RULE_whenClause = 102, RULE_otherwiseClause = 103, 
		RULE_defineStmt = 104, RULE_enumType = 105, RULE_aliasType = 106, RULE_binaryEnum = 107, 
		RULE_decimalEnum = 108, RULE_stringEnum = 109, RULE_bitEnum = 110, RULE_enumBody = 111, 
		RULE_enumLiteral = 112, RULE_structType = 113, RULE_structBody = 114, 
		RULE_structMemberList = 115, RULE_structSubstruct = 116, RULE_structMember = 117, 
		RULE_stringLiteral = 118, RULE_numericLiteral = 119, RULE_hexLiteral = 120, 
		RULE_octalLiteral = 121, RULE_decimalLiteral = 122, RULE_binaryLiteral = 123, 
		RULE_identifier = 124;
	private static String[] makeRuleNames() {
		return new String[] {
			"translationUnit", "uses", "scope", "scopeStart", "scopeEnd", "assemblerToken", 
			"traits", "traitsStart", "traitsEnd", "declarationTraits", "declarationTrait", 
			"procedureTraits", "procedureTraitsList", "procedureTrait", "procedureRule", 
			"target", "asmBlock", "asmOptions", "functionRule", "procedureStmt", 
			"functionStmt", "targetSpec", "procedureAttributes", "functionAttributes", 
			"procedureEnd", "functionEnd", "returnsDescriptor", "terminator", "labelStmt", 
			"passiveStmt", "assemblerStmt", "assemblerInlineComment", "activeStmt", 
			"nullStmt", "assignmentStmt", "reference", "arguments", "argumentsList", 
			"basicReference", "structureQualification", "structureQualificationList", 
			"subscript", "subscriptCommalist", "parenthesizedExpression", "primitiveExpression", 
			"prefixExpression", "bitAdjustOperator", "additionOperator", "multiplyOperator", 
			"boolAndOperator", "boolXorOperator", "boolOrOperator", "expression", 
			"map_set", "bool_set", "prefixOperator", "comparisonOperator", "shiftOperator", 
			"callStmt", "gotoStmt", "endloopStmt", "reloopStmt", "declareStmt", "declareAsBody", 
			"declarationBody", "typeInfo", "dimensionSuffix", "boundPair", "boundPairCommalist", 
			"lowerBound", "upperBound", "attributes", "memoryAttribute", "dataAttribute", 
			"numericScale", "linkageOption", "linkageSection", "precision", "numberOfDigits", 
			"scale_factor", "maxStringLength", "maxLength", "based", "defined", "coprocedureSpecifier", 
			"handlerSpecifier", "parameterNameCommalist", "returnStmt", "ifStmt", 
			"ifEnd", "thenClause", "elseClause", "elifClause", "loopStmt", "whileLoop", 
			"untilLoop", "loopEnd", "whileOption", "untilOption", "selectStmt", "selectEnd", 
			"selectClause", "whenClause", "otherwiseClause", "defineStmt", "enumType", 
			"aliasType", "binaryEnum", "decimalEnum", "stringEnum", "bitEnum", "enumBody", 
			"enumLiteral", "structType", "structBody", "structMemberList", "structSubstruct", 
			"structMember", "stringLiteral", "numericLiteral", "hexLiteral", "octalLiteral", 
			"decimalLiteral", "binaryLiteral", "identifier"
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
			null, "ACCEPT", "ALIAS", "ALIGNED", "ALL", "ANY", "ARGUMENT", "AS", "ASSEMBLER", 
			"BASED", "BINARY", "BIT", "BOOLEAN", "BOOTSTRAP", "BUILTIN", "BY", "BYPASS", 
			"CALL", "CHARACTER", "COFUNCTION", "COLD", "COROUTINE", "DECIMAL", "DECLARE", 
			"DEFINE", "DEFINED", "ELIF", "ELSE", "END", "ENDLOOP", "ENTRY", "ENUM", 
			"FIXED", "FLOAT", "FUNCTION", "GOTO", "IF", "INC", "INCLUDE", "INTERNAL", 
			"INTERRUPT", "INTRINSIC", "LANGUAGE", "LOOP", "MAIN", "NAKED", "NORETURN", 
			"OFFSET", "OTHERWISE", "OUT", "PAD", "POINTER", "PRIVATE", "PROCEDURE", 
			"PUBLIC", "RAW", "READONLY", "RECURSIVE", "REF", "RELOOP", "RETAIN", 
			"RETURN", "RETURNON", "RETURNS", "SCANAS", "SCOPE", "SECTION", "SELECT", 
			"SINGLET", "STACK", "STATIC", "STRING", "STRUCTURE", "THEN", "TO", "TRAITS", 
			"TYPE", "UNALIGNED", "UNTIL", "USES", "USING", "UTF", "VARIABLE", "VARYING", 
			"WHEN", "WHILE", "YIELD", "COMMENT", "LINE_COMMENT", "NEWLINE", "STRING_LITERAL_3", 
			"STRING_LITERAL_2", "STRING_LITERAL_1", "BYTE_ORDER_MARK", "LABEL", "BINARY_PATTERN", 
			"OCTAL_PATTERN", "HEXADECIMAL_PATTERN", "INTEGER", "AINTEGER", "DECIMAL_PATTERN", 
			"HASH", "AT", "RARROW_U", "MAPSTO_U", "DOT", "COMMA", "LPAR", "RPAR", 
			"LBRACK", "RBRACK", "LBRACE", "RBRACE", "EQUALS", "ASSIGN_U", "TIMES", 
			"DIVIDE_U", "PLUS", "MINUS", "SEMICOLON", "POWER_U", "COLON", "TRIQUOTE", 
			"DIQUOTE", "QUOTE", "SQUOTE", "NOT", "GT", "LT", "GTE_U", "LTE_U", "NGT", 
			"NLT", "NE_U", "PCNT", "AND", "OR", "NAND", "NOR", "XOR_U", "XNOR_U", 
			"REDAND", "REDOR", "REDNAND", "REDNOR", "REDXOR_U", "REDXNOR_U", "LOGAND", 
			"LOGOR", "CONC", "L_LOG_SHIFT", "R_LOG_SHIFT", "R_ART_SHIFT", "L_ROTATE_U", 
			"R_ROTATE_U", "RANGE", "ASMS", "ASME", "IDENTIFIER", "UNRECOGNIZED", 
			"ASSEMBLER_END", "ASSEMBLER_NEWLINE", "ASM_IDENTIFIER", "ASSEMBLER_DEC_INTEGER", 
			"ASSEMBLER_HEX_INTEGER", "ASSEMBLER_OCT_INTEGER", "ASSEMBLER_BIN_INTEGER", 
			"ASSEMBLER_COMMENT", "ASSEMBLER_LINE_COMMENT", "ASSEMBLER_PUNCTUATOR", 
			"ASSEMBLER_SYMBOL", "ASSEMBLER_BRACKET", "ASSEMBLER_PAREN", "ASM_LBRACE", 
			"ASM_RBRACE", "ASSEMBLER_SPACES"
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

	@Override
	public String getGrammarFileName() { return "Imperium.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ImperiumParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class TranslationUnitContext extends VisitorContext {
		public ScopeContext scope;
		public List<ScopeContext> Scopes = new ArrayList<ScopeContext>();
		public TraitsContext Traits;
		public PassiveStmtContext passiveStmt;
		public List<PassiveStmtContext> PassiveStatements = new ArrayList<PassiveStmtContext>();
		public TerminalNode EOF() { return getToken(ImperiumParser.EOF, 0); }
		public TerminalNode BYTE_ORDER_MARK() { return getToken(ImperiumParser.BYTE_ORDER_MARK, 0); }
		public List<UsesContext> uses() {
			return getRuleContexts(UsesContext.class);
		}
		public UsesContext uses(int i) {
			return getRuleContext(UsesContext.class,i);
		}
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public List<TraitsContext> traits() {
			return getRuleContexts(TraitsContext.class);
		}
		public TraitsContext traits(int i) {
			return getRuleContext(TraitsContext.class,i);
		}
		public List<PassiveStmtContext> passiveStmt() {
			return getRuleContexts(PassiveStmtContext.class);
		}
		public PassiveStmtContext passiveStmt(int i) {
			return getRuleContext(PassiveStmtContext.class,i);
		}
		public TranslationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_translationUnit; }
	}

	public final TranslationUnitContext translationUnit() throws RecognitionException {
		TranslationUnitContext _localctx = new TranslationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_translationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BYTE_ORDER_MARK) {
				{
				setState(250);
				match(BYTE_ORDER_MARK);
				}
			}

			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==USES) {
				{
				{
				setState(253);
				uses();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(264);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT) | (1L << DECLARE) | (1L << DEFINE) | (1L << FUNCTION) | (1L << PROCEDURE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SCOPE - 65)) | (1L << (TRAITS - 65)) | (1L << (SEMICOLON - 65)))) != 0)) {
				{
				setState(262);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOPE:
					{
					setState(259);
					((TranslationUnitContext)_localctx).scope = scope();
					((TranslationUnitContext)_localctx).Scopes.add(((TranslationUnitContext)_localctx).scope);
					}
					break;
				case TRAITS:
					{
					setState(260);
					((TranslationUnitContext)_localctx).Traits = traits();
					}
					break;
				case ARGUMENT:
				case DECLARE:
				case DEFINE:
				case FUNCTION:
				case PROCEDURE:
				case SEMICOLON:
					{
					setState(261);
					((TranslationUnitContext)_localctx).passiveStmt = passiveStmt();
					((TranslationUnitContext)_localctx).PassiveStatements.add(((TranslationUnitContext)_localctx).passiveStmt);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(266);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(267);
			match(EOF);
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

	public static class UsesContext extends VisitorContext {
		public TerminalNode USES() { return getToken(ImperiumParser.USES, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ImperiumParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ImperiumParser.DOT, i);
		}
		public UsesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uses; }
	}

	public final UsesContext uses() throws RecognitionException {
		UsesContext _localctx = new UsesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_uses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			match(USES);
			setState(270);
			identifier();
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(271);
				match(DOT);
				setState(272);
				identifier();
				}
				}
				setState(277);
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

	public static class ScopeContext extends VisitorContext {
		public ScopeContext scope;
		public List<ScopeContext> Scopes = new ArrayList<ScopeContext>();
		public TraitsContext traits;
		public List<TraitsContext> Traits = new ArrayList<TraitsContext>();
		public PassiveStmtContext passiveStmt;
		public List<PassiveStmtContext> PassiveStatements = new ArrayList<PassiveStmtContext>();
		public ScopeStartContext scopeStart() {
			return getRuleContext(ScopeStartContext.class,0);
		}
		public ScopeEndContext scopeEnd() {
			return getRuleContext(ScopeEndContext.class,0);
		}
		public List<ScopeContext> scope() {
			return getRuleContexts(ScopeContext.class);
		}
		public ScopeContext scope(int i) {
			return getRuleContext(ScopeContext.class,i);
		}
		public List<TraitsContext> traits() {
			return getRuleContexts(TraitsContext.class);
		}
		public TraitsContext traits(int i) {
			return getRuleContext(TraitsContext.class,i);
		}
		public List<PassiveStmtContext> passiveStmt() {
			return getRuleContexts(PassiveStmtContext.class);
		}
		public PassiveStmtContext passiveStmt(int i) {
			return getRuleContext(PassiveStmtContext.class,i);
		}
		public ScopeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scope; }
	}

	public final ScopeContext scope() throws RecognitionException {
		ScopeContext _localctx = new ScopeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_scope);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			scopeStart();
			setState(284);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT) | (1L << DECLARE) | (1L << DEFINE) | (1L << FUNCTION) | (1L << PROCEDURE))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (SCOPE - 65)) | (1L << (TRAITS - 65)) | (1L << (SEMICOLON - 65)))) != 0)) {
				{
				setState(282);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case SCOPE:
					{
					setState(279);
					((ScopeContext)_localctx).scope = scope();
					((ScopeContext)_localctx).Scopes.add(((ScopeContext)_localctx).scope);
					}
					break;
				case TRAITS:
					{
					setState(280);
					((ScopeContext)_localctx).traits = traits();
					((ScopeContext)_localctx).Traits.add(((ScopeContext)_localctx).traits);
					}
					break;
				case ARGUMENT:
				case DECLARE:
				case DEFINE:
				case FUNCTION:
				case PROCEDURE:
				case SEMICOLON:
					{
					setState(281);
					((ScopeContext)_localctx).passiveStmt = passiveStmt();
					((ScopeContext)_localctx).PassiveStatements.add(((ScopeContext)_localctx).passiveStmt);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(286);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(287);
			scopeEnd();
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

	public static class ScopeStartContext extends VisitorContext {
		public TerminalNode SCOPE() { return getToken(ImperiumParser.SCOPE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(ImperiumParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(ImperiumParser.DOT, i);
		}
		public TerminalNode PRIVATE() { return getToken(ImperiumParser.PRIVATE, 0); }
		public ScopeStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeStart; }
	}

	public final ScopeStartContext scopeStart() throws RecognitionException {
		ScopeStartContext _localctx = new ScopeStartContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_scopeStart);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(SCOPE);
			setState(290);
			identifier();
			setState(295);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(291);
				match(DOT);
				setState(292);
				identifier();
				}
				}
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIVATE) {
				{
				setState(298);
				match(PRIVATE);
				}
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

	public static class ScopeEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SCOPE() { return getToken(ImperiumParser.SCOPE, 0); }
		public ScopeEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeEnd; }
	}

	public final ScopeEndContext scopeEnd() throws RecognitionException {
		ScopeEndContext _localctx = new ScopeEndContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_scopeEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(END);
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(302);
				match(SCOPE);
				}
				break;
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

	public static class AssemblerTokenContext extends VisitorContext {
		public TerminalNode IDENTIFIER() { return getToken(ImperiumParser.IDENTIFIER, 0); }
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(ImperiumParser.COMMA, 0); }
		public TerminalNode EQUALS() { return getToken(ImperiumParser.EQUALS, 0); }
		public TerminalNode LBRACK() { return getToken(ImperiumParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(ImperiumParser.RBRACK, 0); }
		public TerminalNode LBRACE() { return getToken(ImperiumParser.LBRACE, 0); }
		public TerminalNode RBRACE() { return getToken(ImperiumParser.RBRACE, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode HASH() { return getToken(ImperiumParser.HASH, 0); }
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public TerminalNode AINTEGER() { return getToken(ImperiumParser.AINTEGER, 0); }
		public AssemblerTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerToken; }
	}

	public final AssemblerTokenContext assemblerToken() throws RecognitionException {
		AssemblerTokenContext _localctx = new AssemblerTokenContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assemblerToken);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			_la = _input.LA(1);
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (INTEGER - 98)) | (1L << (AINTEGER - 98)) | (1L << (HASH - 98)) | (1L << (COMMA - 98)) | (1L << (LPAR - 98)) | (1L << (RPAR - 98)) | (1L << (LBRACK - 98)) | (1L << (RBRACK - 98)) | (1L << (LBRACE - 98)) | (1L << (RBRACE - 98)) | (1L << (EQUALS - 98)) | (1L << (SEMICOLON - 98)) | (1L << (IDENTIFIER - 98)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class TraitsContext extends VisitorContext {
		public TraitsStartContext traitsStart() {
			return getRuleContext(TraitsStartContext.class,0);
		}
		public TraitsEndContext traitsEnd() {
			return getRuleContext(TraitsEndContext.class,0);
		}
		public List<PassiveStmtContext> passiveStmt() {
			return getRuleContexts(PassiveStmtContext.class);
		}
		public PassiveStmtContext passiveStmt(int i) {
			return getRuleContext(PassiveStmtContext.class,i);
		}
		public TraitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traits; }
	}

	public final TraitsContext traits() throws RecognitionException {
		TraitsContext _localctx = new TraitsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_traits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			traitsStart();
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT) | (1L << DECLARE) | (1L << DEFINE) | (1L << FUNCTION) | (1L << PROCEDURE))) != 0) || _la==SEMICOLON) {
				{
				{
				setState(308);
				passiveStmt();
				}
				}
				setState(313);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(314);
			traitsEnd();
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

	public static class TraitsStartContext extends VisitorContext {
		public TerminalNode TRAITS() { return getToken(ImperiumParser.TRAITS, 0); }
		public DeclarationTraitsContext declarationTraits() {
			return getRuleContext(DeclarationTraitsContext.class,0);
		}
		public ProcedureTraitsContext procedureTraits() {
			return getRuleContext(ProcedureTraitsContext.class,0);
		}
		public TraitsStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitsStart; }
	}

	public final TraitsStartContext traitsStart() throws RecognitionException {
		TraitsStartContext _localctx = new TraitsStartContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_traitsStart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(TRAITS);
			setState(319);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
				{
				setState(317);
				declarationTraits();
				}
				break;
			case PROCEDURE:
				{
				setState(318);
				procedureTraits();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class TraitsEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode TRAITS() { return getToken(ImperiumParser.TRAITS, 0); }
		public TraitsEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitsEnd; }
	}

	public final TraitsEndContext traitsEnd() throws RecognitionException {
		TraitsEndContext _localctx = new TraitsEndContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_traitsEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(END);
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(322);
				match(TRAITS);
				}
				break;
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

	public static class DeclarationTraitsContext extends VisitorContext {
		public TerminalNode DECLARE() { return getToken(ImperiumParser.DECLARE, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public List<DeclarationTraitContext> declarationTrait() {
			return getRuleContexts(DeclarationTraitContext.class);
		}
		public DeclarationTraitContext declarationTrait(int i) {
			return getRuleContext(DeclarationTraitContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public DeclarationTraitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationTraits; }
	}

	public final DeclarationTraitsContext declarationTraits() throws RecognitionException {
		DeclarationTraitsContext _localctx = new DeclarationTraitsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declarationTraits);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(DECLARE);
			setState(326);
			match(LPAR);
			setState(327);
			declarationTrait();
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(328);
				match(COMMA);
				setState(329);
				declarationTrait();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(RPAR);
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

	public static class DeclarationTraitContext extends VisitorContext {
		public TerminalNode SECTION() { return getToken(ImperiumParser.SECTION, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode ALIGNED() { return getToken(ImperiumParser.ALIGNED, 0); }
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public TerminalNode RETAIN() { return getToken(ImperiumParser.RETAIN, 0); }
		public DeclarationTraitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationTrait; }
	}

	public final DeclarationTraitContext declarationTrait() throws RecognitionException {
		DeclarationTraitContext _localctx = new DeclarationTraitContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declarationTrait);
		int _la;
		try {
			setState(348);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(337);
				match(SECTION);
				setState(338);
				match(LPAR);
				setState(339);
				match(STRING_LITERAL_1);
				setState(340);
				match(RPAR);
				}
				break;
			case ALIGNED:
				enterOuterAlt(_localctx, 2);
				{
				setState(341);
				match(ALIGNED);
				setState(345);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(342);
					match(LPAR);
					setState(343);
					match(INTEGER);
					setState(344);
					match(RPAR);
					}
				}

				}
				break;
			case RETAIN:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				match(RETAIN);
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

	public static class ProcedureTraitsContext extends VisitorContext {
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ProcedureTraitsListContext procedureTraitsList() {
			return getRuleContext(ProcedureTraitsListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public ProcedureTraitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureTraits; }
	}

	public final ProcedureTraitsContext procedureTraits() throws RecognitionException {
		ProcedureTraitsContext _localctx = new ProcedureTraitsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_procedureTraits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(PROCEDURE);
			setState(351);
			match(LPAR);
			setState(352);
			procedureTraitsList();
			setState(353);
			match(RPAR);
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

	public static class ProcedureTraitsListContext extends VisitorContext {
		public List<ProcedureTraitContext> procedureTrait() {
			return getRuleContexts(ProcedureTraitContext.class);
		}
		public ProcedureTraitContext procedureTrait(int i) {
			return getRuleContext(ProcedureTraitContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public ProcedureTraitsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureTraitsList; }
	}

	public final ProcedureTraitsListContext procedureTraitsList() throws RecognitionException {
		ProcedureTraitsListContext _localctx = new ProcedureTraitsListContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_procedureTraitsList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
			procedureTrait();
			setState(360);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(356);
				match(COMMA);
				setState(357);
				procedureTrait();
				}
				}
				setState(362);
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

	public static class ProcedureTraitContext extends VisitorContext {
		public TerminalNode COLD() { return getToken(ImperiumParser.COLD, 0); }
		public TerminalNode NAKED() { return getToken(ImperiumParser.NAKED, 0); }
		public TerminalNode SECTION() { return getToken(ImperiumParser.SECTION, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode RETAIN() { return getToken(ImperiumParser.RETAIN, 0); }
		public ProcedureTraitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureTrait; }
	}

	public final ProcedureTraitContext procedureTrait() throws RecognitionException {
		ProcedureTraitContext _localctx = new ProcedureTraitContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_procedureTrait);
		try {
			setState(370);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLD:
				enterOuterAlt(_localctx, 1);
				{
				setState(363);
				match(COLD);
				}
				break;
			case NAKED:
				enterOuterAlt(_localctx, 2);
				{
				setState(364);
				match(NAKED);
				}
				break;
			case SECTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(365);
				match(SECTION);
				setState(366);
				match(LPAR);
				setState(367);
				match(STRING_LITERAL_1);
				setState(368);
				match(RPAR);
				}
				break;
			case RETAIN:
				enterOuterAlt(_localctx, 4);
				{
				setState(369);
				match(RETAIN);
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

	public static class ProcedureRuleContext extends VisitorContext {
		public IdentifierContext ProcedureName;
		public ProcedureStmtContext procedureStmt() {
			return getRuleContext(ProcedureStmtContext.class,0);
		}
		public ProcedureEndContext procedureEnd() {
			return getRuleContext(ProcedureEndContext.class,0);
		}
		public List<PassiveStmtContext> passiveStmt() {
			return getRuleContexts(PassiveStmtContext.class);
		}
		public PassiveStmtContext passiveStmt(int i) {
			return getRuleContext(PassiveStmtContext.class,i);
		}
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterNameCommalistContext parameterNameCommalist() {
			return getRuleContext(ParameterNameCommalistContext.class,0);
		}
		public List<AsmBlockContext> asmBlock() {
			return getRuleContexts(AsmBlockContext.class);
		}
		public AsmBlockContext asmBlock(int i) {
			return getRuleContext(AsmBlockContext.class,i);
		}
		public ProcedureRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureRule; }
	}

	public final ProcedureRuleContext procedureRule() throws RecognitionException {
		ProcedureRuleContext _localctx = new ProcedureRuleContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_procedureRule);
		int _la;
		try {
			int _alt;
			setState(398);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				procedureStmt();
				setState(377);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						setState(375);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
						case 1:
							{
							setState(373);
							passiveStmt();
							}
							break;
						case 2:
							{
							setState(374);
							activeStmt();
							}
							break;
						}
						} 
					}
					setState(379);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
				}
				setState(380);
				procedureEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				match(PROCEDURE);
				setState(383);
				((ProcedureRuleContext)_localctx).ProcedureName = identifier();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(384);
					parameterNameCommalist();
					}
				}

				setState(387);
				match(INTRINSIC);
				setState(388);
				target();
				setState(393);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ARGUMENT) | (1L << ASSEMBLER) | (1L << DECLARE) | (1L << DEFINE) | (1L << FUNCTION) | (1L << PROCEDURE))) != 0) || _la==SEMICOLON) {
					{
					setState(391);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case ARGUMENT:
					case DECLARE:
					case DEFINE:
					case FUNCTION:
					case PROCEDURE:
					case SEMICOLON:
						{
						setState(389);
						passiveStmt();
						}
						break;
					case ASSEMBLER:
						{
						setState(390);
						asmBlock();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(395);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(396);
				match(END);
				}
				break;
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

	public static class TargetContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(LPAR);
			setState(401);
			identifier();
			setState(402);
			match(RPAR);
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

	public static class AsmBlockContext extends VisitorContext {
		public TerminalNode ASSEMBLER() { return getToken(ImperiumParser.ASSEMBLER, 0); }
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public AsmOptionsContext asmOptions() {
			return getRuleContext(AsmOptionsContext.class,0);
		}
		public List<AssemblerStmtContext> assemblerStmt() {
			return getRuleContexts(AssemblerStmtContext.class);
		}
		public AssemblerStmtContext assemblerStmt(int i) {
			return getRuleContext(AssemblerStmtContext.class,i);
		}
		public AsmBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmBlock; }
	}

	public final AsmBlockContext asmBlock() throws RecognitionException {
		AsmBlockContext _localctx = new AsmBlockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_asmBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(404);
			match(ASSEMBLER);
			setState(406);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(405);
				asmOptions();
				}
				break;
			}
			setState(411);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & ((1L << (INTEGER - 98)) | (1L << (AINTEGER - 98)) | (1L << (HASH - 98)) | (1L << (COMMA - 98)) | (1L << (LPAR - 98)) | (1L << (RPAR - 98)) | (1L << (LBRACK - 98)) | (1L << (RBRACK - 98)) | (1L << (LBRACE - 98)) | (1L << (RBRACE - 98)) | (1L << (EQUALS - 98)) | (1L << (SEMICOLON - 98)) | (1L << (IDENTIFIER - 98)))) != 0)) {
				{
				{
				setState(408);
				assemblerStmt();
				}
				}
				setState(413);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(414);
			match(END);
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

	public static class AsmOptionsContext extends VisitorContext {
		public List<TerminalNode> LPAR() { return getTokens(ImperiumParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(ImperiumParser.LPAR, i);
		}
		public List<TerminalNode> RPAR() { return getTokens(ImperiumParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(ImperiumParser.RPAR, i);
		}
		public TerminalNode SECTION() { return getToken(ImperiumParser.SECTION, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public AsmOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asmOptions; }
	}

	public final AsmOptionsContext asmOptions() throws RecognitionException {
		AsmOptionsContext _localctx = new AsmOptionsContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asmOptions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(LPAR);
			setState(421);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SECTION) {
				{
				setState(417);
				match(SECTION);
				setState(418);
				match(LPAR);
				setState(419);
				match(STRING_LITERAL_1);
				setState(420);
				match(RPAR);
				}
			}

			setState(423);
			match(RPAR);
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

	public static class FunctionRuleContext extends VisitorContext {
		public FunctionStmtContext functionStmt() {
			return getRuleContext(FunctionStmtContext.class,0);
		}
		public FunctionEndContext functionEnd() {
			return getRuleContext(FunctionEndContext.class,0);
		}
		public List<PassiveStmtContext> passiveStmt() {
			return getRuleContexts(PassiveStmtContext.class);
		}
		public PassiveStmtContext passiveStmt(int i) {
			return getRuleContext(PassiveStmtContext.class,i);
		}
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public FunctionRuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionRule; }
	}

	public final FunctionRuleContext functionRule() throws RecognitionException {
		FunctionRuleContext _localctx = new FunctionRuleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_functionRule);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			functionStmt();
			setState(430);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(428);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
					case 1:
						{
						setState(426);
						passiveStmt();
						}
						break;
					case 2:
						{
						setState(427);
						activeStmt();
						}
						break;
					}
					} 
				}
				setState(432);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(433);
			functionEnd();
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

	public static class ProcedureStmtContext extends VisitorContext {
		public IdentifierContext ProcedureName;
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterNameCommalistContext parameterNameCommalist() {
			return getRuleContext(ParameterNameCommalistContext.class,0);
		}
		public ProcedureAttributesContext procedureAttributes() {
			return getRuleContext(ProcedureAttributesContext.class,0);
		}
		public TerminalNode TRAITS() { return getToken(ImperiumParser.TRAITS, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ProcedureTraitsListContext procedureTraitsList() {
			return getRuleContext(ProcedureTraitsListContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public ProcedureStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureStmt; }
	}

	public final ProcedureStmtContext procedureStmt() throws RecognitionException {
		ProcedureStmtContext _localctx = new ProcedureStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_procedureStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(435);
			match(PROCEDURE);
			setState(436);
			((ProcedureStmtContext)_localctx).ProcedureName = identifier();
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(437);
				parameterNameCommalist();
				}
			}

			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(440);
				procedureAttributes();
				}
				break;
			}
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(443);
				match(TRAITS);
				setState(444);
				match(LPAR);
				setState(445);
				procedureTraitsList();
				setState(446);
				match(RPAR);
				}
				break;
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

	public static class FunctionStmtContext extends VisitorContext {
		public IdentifierContext FunctionName;
		public TerminalNode FUNCTION() { return getToken(ImperiumParser.FUNCTION, 0); }
		public ReturnsDescriptorContext returnsDescriptor() {
			return getRuleContext(ReturnsDescriptorContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ParameterNameCommalistContext parameterNameCommalist() {
			return getRuleContext(ParameterNameCommalistContext.class,0);
		}
		public FunctionAttributesContext functionAttributes() {
			return getRuleContext(FunctionAttributesContext.class,0);
		}
		public FunctionStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionStmt; }
	}

	public final FunctionStmtContext functionStmt() throws RecognitionException {
		FunctionStmtContext _localctx = new FunctionStmtContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_functionStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			match(FUNCTION);
			setState(451);
			((FunctionStmtContext)_localctx).FunctionName = identifier();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(452);
				parameterNameCommalist();
				}
			}

			setState(455);
			returnsDescriptor();
			setState(457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(456);
				functionAttributes();
				}
				break;
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

	public static class TargetSpecContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TargetSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_targetSpec; }
	}

	public final TargetSpecContext targetSpec() throws RecognitionException {
		TargetSpecContext _localctx = new TargetSpecContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_targetSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			match(LPAR);
			setState(460);
			identifier();
			setState(461);
			match(RPAR);
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

	public static class ProcedureAttributesContext extends VisitorContext {
		public TerminalNode MAIN() { return getToken(ImperiumParser.MAIN, 0); }
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public TargetSpecContext targetSpec() {
			return getRuleContext(TargetSpecContext.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(ImperiumParser.RECURSIVE, 0); }
		public TerminalNode INTERRUPT() { return getToken(ImperiumParser.INTERRUPT, 0); }
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public ProcedureAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureAttributes; }
	}

	public final ProcedureAttributesContext procedureAttributes() throws RecognitionException {
		ProcedureAttributesContext _localctx = new ProcedureAttributesContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_procedureAttributes);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIN:
				enterOuterAlt(_localctx, 1);
				{
				setState(463);
				match(MAIN);
				}
				break;
			case INTRINSIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(464);
				match(INTRINSIC);
				setState(465);
				targetSpec();
				}
				break;
			case RECURSIVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(466);
				match(RECURSIVE);
				}
				break;
			case INTERRUPT:
				enterOuterAlt(_localctx, 4);
				{
				setState(467);
				match(INTERRUPT);
				}
				break;
			case COROUTINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(468);
				match(COROUTINE);
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

	public static class FunctionAttributesContext extends VisitorContext {
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public TargetSpecContext targetSpec() {
			return getRuleContext(TargetSpecContext.class,0);
		}
		public TerminalNode RECURSIVE() { return getToken(ImperiumParser.RECURSIVE, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public FunctionAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionAttributes; }
	}

	public final FunctionAttributesContext functionAttributes() throws RecognitionException {
		FunctionAttributesContext _localctx = new FunctionAttributesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_functionAttributes);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTRINSIC:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(INTRINSIC);
				setState(472);
				targetSpec();
				}
				break;
			case RECURSIVE:
				enterOuterAlt(_localctx, 2);
				{
				setState(473);
				match(RECURSIVE);
				}
				break;
			case COFUNCTION:
				enterOuterAlt(_localctx, 3);
				{
				setState(474);
				match(COFUNCTION);
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

	public static class ProcedureEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public ProcedureEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureEnd; }
	}

	public final ProcedureEndContext procedureEnd() throws RecognitionException {
		ProcedureEndContext _localctx = new ProcedureEndContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_procedureEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			match(END);
			setState(479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(478);
				match(PROCEDURE);
				}
				break;
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

	public static class FunctionEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(ImperiumParser.FUNCTION, 0); }
		public FunctionEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionEnd; }
	}

	public final FunctionEndContext functionEnd() throws RecognitionException {
		FunctionEndContext _localctx = new FunctionEndContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			match(END);
			setState(483);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(482);
				match(FUNCTION);
				}
				break;
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

	public static class ReturnsDescriptorContext extends VisitorContext {
		public TerminalNode RETURNS() { return getToken(ImperiumParser.RETURNS, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DataAttributeContext dataAttribute() {
			return getRuleContext(DataAttributeContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public ReturnsDescriptorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnsDescriptor; }
	}

	public final ReturnsDescriptorContext returnsDescriptor() throws RecognitionException {
		ReturnsDescriptorContext _localctx = new ReturnsDescriptorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_returnsDescriptor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(RETURNS);
			setState(486);
			match(LPAR);
			setState(487);
			dataAttribute();
			setState(488);
			match(RPAR);
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

	public static class TerminatorContext extends VisitorContext {
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
	}

	public final TerminatorContext terminator() throws RecognitionException {
		TerminatorContext _localctx = new TerminatorContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_terminator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(490);
			match(SEMICOLON);
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

	public static class LabelStmtContext extends VisitorContext {
		public TerminalNode LABEL() { return getToken(ImperiumParser.LABEL, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public LabelStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelStmt; }
	}

	public final LabelStmtContext labelStmt() throws RecognitionException {
		LabelStmtContext _localctx = new LabelStmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_labelStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(LABEL);
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(493);
				match(LPAR);
				setState(494);
				decimalLiteral();
				setState(495);
				match(RPAR);
				}
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

	public static class PassiveStmtContext extends VisitorContext {
		public PassiveStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_passiveStmt; }
	 
		public PassiveStmtContext() { }
		public void copyFrom(PassiveStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FunctionContext extends PassiveStmtContext {
		public FunctionRuleContext functionRule() {
			return getRuleContext(FunctionRuleContext.class,0);
		}
		public FunctionContext(PassiveStmtContext ctx) { copyFrom(ctx); }
	}
	public static class NullContext extends PassiveStmtContext {
		public NullStmtContext nullStmt() {
			return getRuleContext(NullStmtContext.class,0);
		}
		public NullContext(PassiveStmtContext ctx) { copyFrom(ctx); }
	}
	public static class DefiniionContext extends PassiveStmtContext {
		public DefineStmtContext defineStmt() {
			return getRuleContext(DefineStmtContext.class,0);
		}
		public DefiniionContext(PassiveStmtContext ctx) { copyFrom(ctx); }
	}
	public static class ProcedureContext extends PassiveStmtContext {
		public ProcedureRuleContext procedureRule() {
			return getRuleContext(ProcedureRuleContext.class,0);
		}
		public ProcedureContext(PassiveStmtContext ctx) { copyFrom(ctx); }
	}
	public static class DeclarationContext extends PassiveStmtContext {
		public DeclareStmtContext declareStmt() {
			return getRuleContext(DeclareStmtContext.class,0);
		}
		public DeclarationContext(PassiveStmtContext ctx) { copyFrom(ctx); }
	}

	public final PassiveStmtContext passiveStmt() throws RecognitionException {
		PassiveStmtContext _localctx = new PassiveStmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_passiveStmt);
		try {
			setState(504);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ARGUMENT:
			case DECLARE:
				_localctx = new DeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(499);
				declareStmt();
				}
				break;
			case DEFINE:
				_localctx = new DefiniionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(500);
				defineStmt();
				}
				break;
			case PROCEDURE:
				_localctx = new ProcedureContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(501);
				procedureRule();
				}
				break;
			case FUNCTION:
				_localctx = new FunctionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(502);
				functionRule();
				}
				break;
			case SEMICOLON:
				_localctx = new NullContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(503);
				nullStmt();
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

	public static class AssemblerStmtContext extends VisitorContext {
		public AssemblerTokenContext assemblerToken() {
			return getRuleContext(AssemblerTokenContext.class,0);
		}
		public NullStmtContext nullStmt() {
			return getRuleContext(NullStmtContext.class,0);
		}
		public AssemblerStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerStmt; }
	}

	public final AssemblerStmtContext assemblerStmt() throws RecognitionException {
		AssemblerStmtContext _localctx = new AssemblerStmtContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_assemblerStmt);
		try {
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(506);
				assemblerToken();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(507);
				nullStmt();
				}
				break;
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

	public static class AssemblerInlineCommentContext extends VisitorContext {
		public TerminalNode ASSEMBLER_LINE_COMMENT() { return getToken(ImperiumParser.ASSEMBLER_LINE_COMMENT, 0); }
		public AssemblerInlineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerInlineComment; }
	}

	public final AssemblerInlineCommentContext assemblerInlineComment() throws RecognitionException {
		AssemblerInlineCommentContext _localctx = new AssemblerInlineCommentContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_assemblerInlineComment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(ASSEMBLER_LINE_COMMENT);
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

	public static class ActiveStmtContext extends VisitorContext {
		public LabelStmtContext labelStmt() {
			return getRuleContext(LabelStmtContext.class,0);
		}
		public AssignmentStmtContext assignmentStmt() {
			return getRuleContext(AssignmentStmtContext.class,0);
		}
		public CallStmtContext callStmt() {
			return getRuleContext(CallStmtContext.class,0);
		}
		public GotoStmtContext gotoStmt() {
			return getRuleContext(GotoStmtContext.class,0);
		}
		public ReturnStmtContext returnStmt() {
			return getRuleContext(ReturnStmtContext.class,0);
		}
		public IfStmtContext ifStmt() {
			return getRuleContext(IfStmtContext.class,0);
		}
		public LoopStmtContext loopStmt() {
			return getRuleContext(LoopStmtContext.class,0);
		}
		public SelectStmtContext selectStmt() {
			return getRuleContext(SelectStmtContext.class,0);
		}
		public EndloopStmtContext endloopStmt() {
			return getRuleContext(EndloopStmtContext.class,0);
		}
		public ReloopStmtContext reloopStmt() {
			return getRuleContext(ReloopStmtContext.class,0);
		}
		public NullStmtContext nullStmt() {
			return getRuleContext(NullStmtContext.class,0);
		}
		public ActiveStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_activeStmt; }
	}

	public final ActiveStmtContext activeStmt() throws RecognitionException {
		ActiveStmtContext _localctx = new ActiveStmtContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_activeStmt);
		try {
			setState(523);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				labelStmt();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(513);
				assignmentStmt();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(514);
				callStmt();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(515);
				gotoStmt();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(516);
				returnStmt();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(517);
				ifStmt();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(518);
				loopStmt();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(519);
				selectStmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(520);
				endloopStmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(521);
				reloopStmt();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(522);
				nullStmt();
				}
				break;
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

	public static class NullStmtContext extends VisitorContext {
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public NullStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullStmt; }
	}

	public final NullStmtContext nullStmt() throws RecognitionException {
		NullStmtContext _localctx = new NullStmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_nullStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(SEMICOLON);
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

	public static class AssignmentStmtContext extends VisitorContext {
		public ReferenceContext Target;
		public ExpressionContext Source;
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode ASSIGN_U() { return getToken(ImperiumParser.ASSIGN_U, 0); }
		public TerminalNode EQUALS() { return getToken(ImperiumParser.EQUALS, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStmt; }
	}

	public final AssignmentStmtContext assignmentStmt() throws RecognitionException {
		AssignmentStmtContext _localctx = new AssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_assignmentStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(527);
			((AssignmentStmtContext)_localctx).Target = reference(0);
			setState(528);
			_la = _input.LA(1);
			if ( !(_la==EQUALS || _la==ASSIGN_U) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(529);
			((AssignmentStmtContext)_localctx).Source = expression(0);
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

	public static class ReferenceContext extends VisitorContext {
		public ReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reference; }
	 
		public ReferenceContext() { }
		public void copyFrom(ReferenceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BasicRefContext extends ReferenceContext {
		public BasicReferenceContext basicReference() {
			return getRuleContext(BasicReferenceContext.class,0);
		}
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public BasicRefContext(ReferenceContext ctx) { copyFrom(ctx); }
	}
	public static class PtrRefContext extends ReferenceContext {
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode RARROW_U() { return getToken(ImperiumParser.RARROW_U, 0); }
		public BasicReferenceContext basicReference() {
			return getRuleContext(BasicReferenceContext.class,0);
		}
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public PtrRefContext(ReferenceContext ctx) { copyFrom(ctx); }
	}

	public final ReferenceContext reference() throws RecognitionException {
		return reference(0);
	}

	private ReferenceContext reference(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ReferenceContext _localctx = new ReferenceContext(_ctx, _parentState);
		ReferenceContext _prevctx = _localctx;
		int _startState = 70;
		enterRecursionRule(_localctx, 70, RULE_reference, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new BasicRefContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(532);
			basicReference();
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(533);
				argumentsList();
				}
				break;
			}
			}
			_ctx.stop = _input.LT(-1);
			setState(544);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PtrRefContext(new ReferenceContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_reference);
					setState(536);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(537);
					match(RARROW_U);
					setState(538);
					basicReference();
					setState(540);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						setState(539);
						argumentsList();
						}
						break;
					}
					}
					} 
				}
				setState(546);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentsContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public SubscriptCommalistContext subscriptCommalist() {
			return getRuleContext(SubscriptCommalistContext.class,0);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(LPAR);
			setState(549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALIAS) | (1L << ALIGNED) | (1L << ALL) | (1L << ANY) | (1L << ARGUMENT) | (1L << AS) | (1L << ASSEMBLER) | (1L << BASED) | (1L << BINARY) | (1L << BIT) | (1L << BOOLEAN) | (1L << BOOTSTRAP) | (1L << BUILTIN) | (1L << BY) | (1L << BYPASS) | (1L << CALL) | (1L << CHARACTER) | (1L << COFUNCTION) | (1L << COLD) | (1L << COROUTINE) | (1L << DECIMAL) | (1L << DECLARE) | (1L << DEFINE) | (1L << DEFINED) | (1L << ELIF) | (1L << ELSE) | (1L << END) | (1L << ENDLOOP) | (1L << ENTRY) | (1L << ENUM) | (1L << FIXED) | (1L << FLOAT) | (1L << FUNCTION) | (1L << GOTO) | (1L << IF) | (1L << INC) | (1L << INCLUDE) | (1L << INTERNAL) | (1L << INTERRUPT) | (1L << INTRINSIC) | (1L << LANGUAGE) | (1L << LOOP) | (1L << MAIN) | (1L << NAKED) | (1L << NORETURN) | (1L << OFFSET) | (1L << OTHERWISE) | (1L << OUT) | (1L << PAD) | (1L << POINTER) | (1L << PRIVATE) | (1L << PROCEDURE) | (1L << PUBLIC) | (1L << RAW) | (1L << READONLY) | (1L << RECURSIVE) | (1L << REF) | (1L << RELOOP) | (1L << RETAIN) | (1L << RETURN) | (1L << RETURNON) | (1L << RETURNS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SCANAS - 64)) | (1L << (SCOPE - 64)) | (1L << (SECTION - 64)) | (1L << (SELECT - 64)) | (1L << (SINGLET - 64)) | (1L << (STACK - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCTURE - 64)) | (1L << (THEN - 64)) | (1L << (TO - 64)) | (1L << (TRAITS - 64)) | (1L << (TYPE - 64)) | (1L << (UNALIGNED - 64)) | (1L << (UNTIL - 64)) | (1L << (USES - 64)) | (1L << (USING - 64)) | (1L << (UTF - 64)) | (1L << (VARIABLE - 64)) | (1L << (VARYING - 64)) | (1L << (WHEN - 64)) | (1L << (WHILE - 64)) | (1L << (YIELD - 64)) | (1L << (STRING_LITERAL_3 - 64)) | (1L << (STRING_LITERAL_2 - 64)) | (1L << (STRING_LITERAL_1 - 64)) | (1L << (BINARY_PATTERN - 64)) | (1L << (OCTAL_PATTERN - 64)) | (1L << (HEXADECIMAL_PATTERN - 64)) | (1L << (INTEGER - 64)) | (1L << (DECIMAL_PATTERN - 64)) | (1L << (LPAR - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (NOT - 64)))) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & ((1L << (REDAND - 141)) | (1L << (REDOR - 141)) | (1L << (REDNAND - 141)) | (1L << (REDNOR - 141)) | (1L << (REDXOR_U - 141)) | (1L << (REDXNOR_U - 141)) | (1L << (IDENTIFIER - 141)))) != 0)) {
				{
				setState(548);
				subscriptCommalist();
				}
			}

			setState(551);
			match(RPAR);
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

	public static class ArgumentsListContext extends VisitorContext {
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public ArgumentsListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentsList; }
	}

	public final ArgumentsListContext argumentsList() throws RecognitionException {
		ArgumentsListContext _localctx = new ArgumentsListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_argumentsList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(554); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(553);
					arguments();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(556); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class BasicReferenceContext extends VisitorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructureQualificationListContext structureQualificationList() {
			return getRuleContext(StructureQualificationListContext.class,0);
		}
		public BasicReferenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basicReference; }
	}

	public final BasicReferenceContext basicReference() throws RecognitionException {
		BasicReferenceContext _localctx = new BasicReferenceContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_basicReference);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(559);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(558);
				structureQualificationList();
				}
				break;
			}
			setState(561);
			identifier();
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

	public static class StructureQualificationContext extends VisitorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode DOT() { return getToken(ImperiumParser.DOT, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public StructureQualificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureQualification; }
	}

	public final StructureQualificationContext structureQualification() throws RecognitionException {
		StructureQualificationContext _localctx = new StructureQualificationContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_structureQualification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(563);
			identifier();
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(564);
				arguments();
				}
			}

			setState(567);
			match(DOT);
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

	public static class StructureQualificationListContext extends VisitorContext {
		public List<StructureQualificationContext> structureQualification() {
			return getRuleContexts(StructureQualificationContext.class);
		}
		public StructureQualificationContext structureQualification(int i) {
			return getRuleContext(StructureQualificationContext.class,i);
		}
		public StructureQualificationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structureQualificationList; }
	}

	public final StructureQualificationListContext structureQualificationList() throws RecognitionException {
		StructureQualificationListContext _localctx = new StructureQualificationListContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_structureQualificationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(569);
					structureQualification();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(572); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class SubscriptContext extends VisitorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
	}

	public final SubscriptContext subscript() throws RecognitionException {
		SubscriptContext _localctx = new SubscriptContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_subscript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			expression(0);
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

	public static class SubscriptCommalistContext extends VisitorContext {
		public List<SubscriptContext> subscript() {
			return getRuleContexts(SubscriptContext.class);
		}
		public SubscriptContext subscript(int i) {
			return getRuleContext(SubscriptContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public SubscriptCommalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptCommalist; }
	}

	public final SubscriptCommalistContext subscriptCommalist() throws RecognitionException {
		SubscriptCommalistContext _localctx = new SubscriptCommalistContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_subscriptCommalist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(576);
			subscript();
			setState(581);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(577);
				match(COMMA);
				setState(578);
				subscript();
				}
				}
				setState(583);
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

	public static class ParenthesizedExpressionContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode REDAND() { return getToken(ImperiumParser.REDAND, 0); }
		public TerminalNode REDOR() { return getToken(ImperiumParser.REDOR, 0); }
		public TerminalNode REDXOR_U() { return getToken(ImperiumParser.REDXOR_U, 0); }
		public TerminalNode REDNAND() { return getToken(ImperiumParser.REDNAND, 0); }
		public TerminalNode REDNOR() { return getToken(ImperiumParser.REDNOR, 0); }
		public TerminalNode REDXNOR_U() { return getToken(ImperiumParser.REDXNOR_U, 0); }
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_parenthesizedExpression);
		try {
			setState(612);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(LPAR);
				setState(585);
				expression(0);
				setState(586);
				match(RPAR);
				}
				break;
			case REDAND:
				enterOuterAlt(_localctx, 2);
				{
				setState(588);
				match(REDAND);
				setState(589);
				expression(0);
				setState(590);
				match(RPAR);
				}
				break;
			case REDOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(592);
				match(REDOR);
				setState(593);
				expression(0);
				setState(594);
				match(RPAR);
				}
				break;
			case REDXOR_U:
				enterOuterAlt(_localctx, 4);
				{
				setState(596);
				match(REDXOR_U);
				setState(597);
				expression(0);
				setState(598);
				match(RPAR);
				}
				break;
			case REDNAND:
				enterOuterAlt(_localctx, 5);
				{
				setState(600);
				match(REDNAND);
				setState(601);
				expression(0);
				setState(602);
				match(RPAR);
				}
				break;
			case REDNOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(604);
				match(REDNOR);
				setState(605);
				expression(0);
				setState(606);
				match(RPAR);
				}
				break;
			case REDXNOR_U:
				enterOuterAlt(_localctx, 7);
				{
				setState(608);
				match(REDXNOR_U);
				setState(609);
				expression(0);
				setState(610);
				match(RPAR);
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

	public static class PrimitiveExpressionContext extends VisitorContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public PrimitiveExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveExpression; }
	}

	public final PrimitiveExpressionContext primitiveExpression() throws RecognitionException {
		PrimitiveExpressionContext _localctx = new PrimitiveExpressionContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primitiveExpression);
		try {
			setState(617);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_PATTERN:
			case OCTAL_PATTERN:
			case HEXADECIMAL_PATTERN:
			case INTEGER:
			case DECIMAL_PATTERN:
				enterOuterAlt(_localctx, 1);
				{
				setState(614);
				numericLiteral();
				}
				break;
			case STRING_LITERAL_3:
			case STRING_LITERAL_2:
			case STRING_LITERAL_1:
				enterOuterAlt(_localctx, 2);
				{
				setState(615);
				stringLiteral();
				}
				break;
			case ACCEPT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case ASSEMBLER:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCANAS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(616);
				reference(0);
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

	public static class PrefixExpressionContext extends VisitorContext {
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrefixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpression; }
	}

	public final PrefixExpressionContext prefixExpression() throws RecognitionException {
		PrefixExpressionContext _localctx = new PrefixExpressionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_prefixExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(619);
			prefixOperator();
			setState(620);
			expression(0);
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

	public static class BitAdjustOperatorContext extends VisitorContext {
		public TerminalNode L_ROTATE_U() { return getToken(ImperiumParser.L_ROTATE_U, 0); }
		public TerminalNode R_ROTATE_U() { return getToken(ImperiumParser.R_ROTATE_U, 0); }
		public TerminalNode L_LOG_SHIFT() { return getToken(ImperiumParser.L_LOG_SHIFT, 0); }
		public TerminalNode R_LOG_SHIFT() { return getToken(ImperiumParser.R_LOG_SHIFT, 0); }
		public TerminalNode R_ART_SHIFT() { return getToken(ImperiumParser.R_ART_SHIFT, 0); }
		public BitAdjustOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitAdjustOperator; }
	}

	public final BitAdjustOperatorContext bitAdjustOperator() throws RecognitionException {
		BitAdjustOperatorContext _localctx = new BitAdjustOperatorContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_bitAdjustOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(622);
			_la = _input.LA(1);
			if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (L_LOG_SHIFT - 150)) | (1L << (R_LOG_SHIFT - 150)) | (1L << (R_ART_SHIFT - 150)) | (1L << (L_ROTATE_U - 150)) | (1L << (R_ROTATE_U - 150)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class AdditionOperatorContext extends VisitorContext {
		public TerminalNode PLUS() { return getToken(ImperiumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperiumParser.MINUS, 0); }
		public AdditionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionOperator; }
	}

	public final AdditionOperatorContext additionOperator() throws RecognitionException {
		AdditionOperatorContext _localctx = new AdditionOperatorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_additionOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(624);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class MultiplyOperatorContext extends VisitorContext {
		public TerminalNode TIMES() { return getToken(ImperiumParser.TIMES, 0); }
		public TerminalNode DIVIDE_U() { return getToken(ImperiumParser.DIVIDE_U, 0); }
		public TerminalNode PCNT() { return getToken(ImperiumParser.PCNT, 0); }
		public MultiplyOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyOperator; }
	}

	public final MultiplyOperatorContext multiplyOperator() throws RecognitionException {
		MultiplyOperatorContext _localctx = new MultiplyOperatorContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_multiplyOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(626);
			_la = _input.LA(1);
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & ((1L << (TIMES - 115)) | (1L << (DIVIDE_U - 115)) | (1L << (PCNT - 115)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BoolAndOperatorContext extends VisitorContext {
		public TerminalNode AND() { return getToken(ImperiumParser.AND, 0); }
		public TerminalNode NAND() { return getToken(ImperiumParser.NAND, 0); }
		public BoolAndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolAndOperator; }
	}

	public final BoolAndOperatorContext boolAndOperator() throws RecognitionException {
		BoolAndOperatorContext _localctx = new BoolAndOperatorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_boolAndOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(628);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==NAND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BoolXorOperatorContext extends VisitorContext {
		public TerminalNode XOR_U() { return getToken(ImperiumParser.XOR_U, 0); }
		public TerminalNode XNOR_U() { return getToken(ImperiumParser.XNOR_U, 0); }
		public BoolXorOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolXorOperator; }
	}

	public final BoolXorOperatorContext boolXorOperator() throws RecognitionException {
		BoolXorOperatorContext _localctx = new BoolXorOperatorContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_boolXorOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !(_la==XOR_U || _la==XNOR_U) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class BoolOrOperatorContext extends VisitorContext {
		public TerminalNode OR() { return getToken(ImperiumParser.OR, 0); }
		public TerminalNode NOR() { return getToken(ImperiumParser.NOR, 0); }
		public TerminalNode NOT() { return getToken(ImperiumParser.NOT, 0); }
		public BoolOrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOrOperator; }
	}

	public final BoolOrOperatorContext boolOrOperator() throws RecognitionException {
		BoolOrOperatorContext _localctx = new BoolOrOperatorContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_boolOrOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & ((1L << (NOT - 126)) | (1L << (OR - 126)) | (1L << (NOR - 126)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ExpressionContext extends VisitorContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MapExpressionContext extends ExpressionContext {
		public ExpressionContext Mapex;
		public TerminalNode MAPSTO_U() { return getToken(ImperiumParser.MAPSTO_U, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Map_setContext map_set() {
			return getRuleContext(Map_setContext.class,0);
		}
		public Bool_setContext bool_set() {
			return getRuleContext(Bool_setContext.class,0);
		}
		public MapExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBoolAndContext extends ExpressionContext {
		public ExpressionContext Left;
		public ExpressionContext Rite;
		public BoolAndOperatorContext boolAndOperator() {
			return getRuleContext(BoolAndOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprBoolAndContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprConcatContext extends ExpressionContext {
		public ExpressionContext Left;
		public ExpressionContext Rite;
		public TerminalNode CONC() { return getToken(ImperiumParser.CONC, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprConcatContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprRaiseContext extends ExpressionContext {
		public ExpressionContext Left;
		public ExpressionContext Rite;
		public TerminalNode POWER_U() { return getToken(ImperiumParser.POWER_U, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprRaiseContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBoolXorContext extends ExpressionContext {
		public ExpressionContext Left;
		public ExpressionContext Rite;
		public BoolXorOperatorContext boolXorOperator() {
			return getRuleContext(BoolXorOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprBoolXorContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MapArgumentsContext extends ExpressionContext {
		public ArgumentsContext MapArgs;
		public TerminalNode MAPSTO_U() { return getToken(ImperiumParser.MAPSTO_U, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public Map_setContext map_set() {
			return getRuleContext(Map_setContext.class,0);
		}
		public Bool_setContext bool_set() {
			return getRuleContext(Bool_setContext.class,0);
		}
		public MapArgumentsContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLogAndContext extends ExpressionContext {
		public ExpressionContext Left;
		public ExpressionContext Rite;
		public TerminalNode LOGAND() { return getToken(ImperiumParser.LOGAND, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprLogAndContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBitAdjustContext extends ExpressionContext {
		public ExpressionContext Left;
		public ExpressionContext Rite;
		public BitAdjustOperatorContext bitAdjustOperator() {
			return getRuleContext(BitAdjustOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprBitAdjustContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprAddSubContext extends ExpressionContext {
		public ExpressionContext Left;
		public ExpressionContext Rite;
		public AdditionOperatorContext additionOperator() {
			return getRuleContext(AdditionOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprAddSubContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprParenthesizedContext extends ExpressionContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public ExprParenthesizedContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprMulDivContext extends ExpressionContext {
		public ExpressionContext Left;
		public ExpressionContext Rite;
		public MultiplyOperatorContext multiplyOperator() {
			return getRuleContext(MultiplyOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprMulDivContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprLogOrContext extends ExpressionContext {
		public ExpressionContext Left;
		public ExpressionContext Rite;
		public TerminalNode LOGOR() { return getToken(ImperiumParser.LOGOR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprLogOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprCompareContext extends ExpressionContext {
		public ExpressionContext Left;
		public ExpressionContext Rite;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprCompareContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrefixedContext extends ExpressionContext {
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public ExprPrefixedContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprBoolOrContext extends ExpressionContext {
		public ExpressionContext Left;
		public ExpressionContext Rite;
		public BoolOrOperatorContext boolOrOperator() {
			return getRuleContext(BoolOrOperatorContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprBoolOrContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ExprPrimitiveContext extends ExpressionContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public ExprPrimitiveContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 104;
		enterRecursionRule(_localctx, 104, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				_localctx = new ExprPrimitiveContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(635);
				primitiveExpression();
				}
				break;
			case 2:
				{
				_localctx = new ExprParenthesizedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(636);
				parenthesizedExpression();
				}
				break;
			case 3:
				{
				_localctx = new ExprPrefixedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(637);
				prefixExpression();
				}
				break;
			case 4:
				{
				_localctx = new MapArgumentsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(638);
				((MapArgumentsContext)_localctx).MapArgs = arguments();
				setState(639);
				match(MAPSTO_U);
				setState(642);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(640);
					map_set();
					}
					break;
				case 2:
					{
					setState(641);
					bool_set();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(694);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(692);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
					case 1:
						{
						_localctx = new ExprRaiseContext(new ExpressionContext(_parentctx, _parentState));
						((ExprRaiseContext)_localctx).Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(646);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(647);
						match(POWER_U);
						setState(648);
						((ExprRaiseContext)_localctx).Rite = expression(13);
						}
						break;
					case 2:
						{
						_localctx = new ExprMulDivContext(new ExpressionContext(_parentctx, _parentState));
						((ExprMulDivContext)_localctx).Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(649);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(650);
						multiplyOperator();
						setState(651);
						((ExprMulDivContext)_localctx).Rite = expression(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprAddSubContext(new ExpressionContext(_parentctx, _parentState));
						((ExprAddSubContext)_localctx).Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(653);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(654);
						additionOperator();
						setState(655);
						((ExprAddSubContext)_localctx).Rite = expression(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprBitAdjustContext(new ExpressionContext(_parentctx, _parentState));
						((ExprBitAdjustContext)_localctx).Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(657);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(658);
						bitAdjustOperator();
						setState(659);
						((ExprBitAdjustContext)_localctx).Rite = expression(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprConcatContext(new ExpressionContext(_parentctx, _parentState));
						((ExprConcatContext)_localctx).Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(661);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(662);
						match(CONC);
						setState(663);
						((ExprConcatContext)_localctx).Rite = expression(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprCompareContext(new ExpressionContext(_parentctx, _parentState));
						((ExprCompareContext)_localctx).Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(664);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(665);
						comparisonOperator();
						setState(666);
						((ExprCompareContext)_localctx).Rite = expression(9);
						}
						break;
					case 7:
						{
						_localctx = new ExprBoolAndContext(new ExpressionContext(_parentctx, _parentState));
						((ExprBoolAndContext)_localctx).Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(668);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(669);
						boolAndOperator();
						setState(670);
						((ExprBoolAndContext)_localctx).Rite = expression(8);
						}
						break;
					case 8:
						{
						_localctx = new ExprBoolXorContext(new ExpressionContext(_parentctx, _parentState));
						((ExprBoolXorContext)_localctx).Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(672);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(673);
						boolXorOperator();
						setState(674);
						((ExprBoolXorContext)_localctx).Rite = expression(7);
						}
						break;
					case 9:
						{
						_localctx = new ExprBoolOrContext(new ExpressionContext(_parentctx, _parentState));
						((ExprBoolOrContext)_localctx).Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(676);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(677);
						boolOrOperator();
						setState(678);
						((ExprBoolOrContext)_localctx).Rite = expression(6);
						}
						break;
					case 10:
						{
						_localctx = new ExprLogAndContext(new ExpressionContext(_parentctx, _parentState));
						((ExprLogAndContext)_localctx).Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(680);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(681);
						match(LOGAND);
						setState(682);
						((ExprLogAndContext)_localctx).Rite = expression(5);
						}
						break;
					case 11:
						{
						_localctx = new ExprLogOrContext(new ExpressionContext(_parentctx, _parentState));
						((ExprLogOrContext)_localctx).Left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(683);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(684);
						match(LOGOR);
						setState(685);
						((ExprLogOrContext)_localctx).Rite = expression(4);
						}
						break;
					case 12:
						{
						_localctx = new MapExpressionContext(new ExpressionContext(_parentctx, _parentState));
						((MapExpressionContext)_localctx).Mapex = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(686);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(687);
						match(MAPSTO_U);
						setState(690);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
						case 1:
							{
							setState(688);
							map_set();
							}
							break;
						case 2:
							{
							setState(689);
							bool_set();
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(696);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Map_setContext extends VisitorContext {
		public List<TerminalNode> LPAR() { return getTokens(ImperiumParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(ImperiumParser.LPAR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(ImperiumParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(ImperiumParser.COLON, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(ImperiumParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(ImperiumParser.RPAR, i);
		}
		public List<ArgumentsContext> arguments() {
			return getRuleContexts(ArgumentsContext.class);
		}
		public ArgumentsContext arguments(int i) {
			return getRuleContext(ArgumentsContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public Map_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_map_set; }
	}

	public final Map_setContext map_set() throws RecognitionException {
		Map_setContext _localctx = new Map_setContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_map_set);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(716); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(697);
					match(LPAR);
					setState(700);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
					case 1:
						{
						setState(698);
						expression(0);
						}
						break;
					case 2:
						{
						setState(699);
						arguments();
						}
						break;
					}
					setState(709);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(702);
						match(COMMA);
						setState(705);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
						case 1:
							{
							setState(703);
							expression(0);
							}
							break;
						case 2:
							{
							setState(704);
							arguments();
							}
							break;
						}
						}
						}
						setState(711);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(712);
					match(COLON);
					setState(713);
					expression(0);
					setState(714);
					match(RPAR);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(718); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,61,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(724);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				{
				setState(720);
				match(LPAR);
				setState(721);
				expression(0);
				setState(722);
				match(RPAR);
				}
				break;
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

	public static class Bool_setContext extends VisitorContext {
		public List<TerminalNode> LPAR() { return getTokens(ImperiumParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(ImperiumParser.LPAR, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> RPAR() { return getTokens(ImperiumParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(ImperiumParser.RPAR, i);
		}
		public Bool_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_set; }
	}

	public final Bool_setContext bool_set() throws RecognitionException {
		Bool_setContext _localctx = new Bool_setContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_bool_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(726);
			match(LPAR);
			setState(727);
			expression(0);
			setState(728);
			match(RPAR);
			}
			{
			setState(730);
			match(LPAR);
			setState(731);
			expression(0);
			setState(732);
			match(RPAR);
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

	public static class PrefixOperatorContext extends VisitorContext {
		public TerminalNode PLUS() { return getToken(ImperiumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperiumParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(ImperiumParser.NOT, 0); }
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
	}

	public final PrefixOperatorContext prefixOperator() throws RecognitionException {
		PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_prefixOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			_la = _input.LA(1);
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & ((1L << (PLUS - 117)) | (1L << (MINUS - 117)) | (1L << (NOT - 117)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ComparisonOperatorContext extends VisitorContext {
		public TerminalNode GT() { return getToken(ImperiumParser.GT, 0); }
		public TerminalNode GTE_U() { return getToken(ImperiumParser.GTE_U, 0); }
		public TerminalNode EQUALS() { return getToken(ImperiumParser.EQUALS, 0); }
		public TerminalNode LT() { return getToken(ImperiumParser.LT, 0); }
		public TerminalNode LTE_U() { return getToken(ImperiumParser.LTE_U, 0); }
		public TerminalNode NGT() { return getToken(ImperiumParser.NGT, 0); }
		public TerminalNode NE_U() { return getToken(ImperiumParser.NE_U, 0); }
		public TerminalNode NLT() { return getToken(ImperiumParser.NLT, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			_la = _input.LA(1);
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & ((1L << (EQUALS - 113)) | (1L << (GT - 113)) | (1L << (LT - 113)) | (1L << (GTE_U - 113)) | (1L << (LTE_U - 113)) | (1L << (NGT - 113)) | (1L << (NLT - 113)) | (1L << (NE_U - 113)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class ShiftOperatorContext extends VisitorContext {
		public TerminalNode R_LOG_SHIFT() { return getToken(ImperiumParser.R_LOG_SHIFT, 0); }
		public TerminalNode L_LOG_SHIFT() { return getToken(ImperiumParser.L_LOG_SHIFT, 0); }
		public TerminalNode R_ART_SHIFT() { return getToken(ImperiumParser.R_ART_SHIFT, 0); }
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
	}

	public final ShiftOperatorContext shiftOperator() throws RecognitionException {
		ShiftOperatorContext _localctx = new ShiftOperatorContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_shiftOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(738);
			_la = _input.LA(1);
			if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (L_LOG_SHIFT - 150)) | (1L << (R_LOG_SHIFT - 150)) | (1L << (R_ART_SHIFT - 150)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class CallStmtContext extends VisitorContext {
		public TerminalNode CALL() { return getToken(ImperiumParser.CALL, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
	}

	public final CallStmtContext callStmt() throws RecognitionException {
		CallStmtContext _localctx = new CallStmtContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_callStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			match(CALL);
			setState(741);
			reference(0);
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

	public static class GotoStmtContext extends VisitorContext {
		public TerminalNode GOTO() { return getToken(ImperiumParser.GOTO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public GotoStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gotoStmt; }
	}

	public final GotoStmtContext gotoStmt() throws RecognitionException {
		GotoStmtContext _localctx = new GotoStmtContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_gotoStmt);
		try {
			setState(751);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(743);
				match(GOTO);
				setState(744);
				identifier();
				setState(745);
				match(LPAR);
				setState(746);
				expression(0);
				setState(747);
				match(RPAR);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(749);
				match(GOTO);
				setState(750);
				reference(0);
				}
				}
				break;
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

	public static class EndloopStmtContext extends VisitorContext {
		public TerminalNode ENDLOOP() { return getToken(ImperiumParser.ENDLOOP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EndloopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endloopStmt; }
	}

	public final EndloopStmtContext endloopStmt() throws RecognitionException {
		EndloopStmtContext _localctx = new EndloopStmtContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_endloopStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(753);
			match(ENDLOOP);
			setState(755);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(754);
				identifier();
				}
				break;
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

	public static class ReloopStmtContext extends VisitorContext {
		public TerminalNode RELOOP() { return getToken(ImperiumParser.RELOOP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReloopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reloopStmt; }
	}

	public final ReloopStmtContext reloopStmt() throws RecognitionException {
		ReloopStmtContext _localctx = new ReloopStmtContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_reloopStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(757);
			match(RELOOP);
			setState(759);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(758);
				identifier();
				}
				break;
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

	public static class DeclareStmtContext extends VisitorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeclareAsBodyContext declareAsBody() {
			return getRuleContext(DeclareAsBodyContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(ImperiumParser.DECLARE, 0); }
		public TerminalNode ARGUMENT() { return getToken(ImperiumParser.ARGUMENT, 0); }
		public DimensionSuffixContext dimensionSuffix() {
			return getRuleContext(DimensionSuffixContext.class,0);
		}
		public DeclarationBodyContext declarationBody() {
			return getRuleContext(DeclarationBodyContext.class,0);
		}
		public DeclareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStmt; }
	}

	public final DeclareStmtContext declareStmt() throws RecognitionException {
		DeclareStmtContext _localctx = new DeclareStmtContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_declareStmt);
		int _la;
		try {
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(761);
				_la = _input.LA(1);
				if ( !(_la==ARGUMENT || _la==DECLARE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(762);
				identifier();
				setState(764);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(763);
					dimensionSuffix();
					}
				}

				setState(766);
				declareAsBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(768);
				_la = _input.LA(1);
				if ( !(_la==ARGUMENT || _la==DECLARE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(769);
				declarationBody();
				}
				break;
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

	public static class DeclareAsBodyContext extends VisitorContext {
		public TerminalNode AS() { return getToken(ImperiumParser.AS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MemoryAttributeContext memoryAttribute() {
			return getRuleContext(MemoryAttributeContext.class,0);
		}
		public DeclareAsBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareAsBody; }
	}

	public final DeclareAsBodyContext declareAsBody() throws RecognitionException {
		DeclareAsBodyContext _localctx = new DeclareAsBodyContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_declareAsBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(AS);
			setState(773);
			identifier();
			setState(775);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(774);
				memoryAttribute();
				}
				break;
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

	public static class DeclarationBodyContext extends VisitorContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeInfoContext typeInfo() {
			return getRuleContext(TypeInfoContext.class,0);
		}
		public DeclarationBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationBody; }
	}

	public final DeclarationBodyContext declarationBody() throws RecognitionException {
		DeclarationBodyContext _localctx = new DeclarationBodyContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_declarationBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			identifier();
			setState(778);
			typeInfo();
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

	public static class TypeInfoContext extends VisitorContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DimensionSuffixContext dimensionSuffix() {
			return getRuleContext(DimensionSuffixContext.class,0);
		}
		public TypeInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInfo; }
	}

	public final TypeInfoContext typeInfo() throws RecognitionException {
		TypeInfoContext _localctx = new TypeInfoContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_typeInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(780);
				dimensionSuffix();
				}
			}

			setState(783);
			attributes();
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

	public static class DimensionSuffixContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public BoundPairCommalistContext boundPairCommalist() {
			return getRuleContext(BoundPairCommalistContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public DimensionSuffixContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dimensionSuffix; }
	}

	public final DimensionSuffixContext dimensionSuffix() throws RecognitionException {
		DimensionSuffixContext _localctx = new DimensionSuffixContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_dimensionSuffix);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(785);
			match(LPAR);
			setState(786);
			boundPairCommalist();
			setState(787);
			match(RPAR);
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

	public static class BoundPairContext extends VisitorContext {
		public UpperBoundContext upperBound() {
			return getRuleContext(UpperBoundContext.class,0);
		}
		public LowerBoundContext lowerBound() {
			return getRuleContext(LowerBoundContext.class,0);
		}
		public TerminalNode COLON() { return getToken(ImperiumParser.COLON, 0); }
		public TerminalNode TIMES() { return getToken(ImperiumParser.TIMES, 0); }
		public BoundPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundPair; }
	}

	public final BoundPairContext boundPair() throws RecognitionException {
		BoundPairContext _localctx = new BoundPairContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_boundPair);
		try {
			setState(796);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case ASSEMBLER:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCANAS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case STRING_LITERAL_3:
			case STRING_LITERAL_2:
			case STRING_LITERAL_1:
			case BINARY_PATTERN:
			case OCTAL_PATTERN:
			case HEXADECIMAL_PATTERN:
			case INTEGER:
			case DECIMAL_PATTERN:
			case LPAR:
			case PLUS:
			case MINUS:
			case NOT:
			case REDAND:
			case REDOR:
			case REDNAND:
			case REDNOR:
			case REDXOR_U:
			case REDXNOR_U:
			case IDENTIFIER:
				enterOuterAlt(_localctx, 1);
				{
				setState(792);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
				case 1:
					{
					setState(789);
					lowerBound();
					setState(790);
					match(COLON);
					}
					break;
				}
				setState(794);
				upperBound();
				}
				break;
			case TIMES:
				enterOuterAlt(_localctx, 2);
				{
				setState(795);
				match(TIMES);
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

	public static class BoundPairCommalistContext extends VisitorContext {
		public List<BoundPairContext> boundPair() {
			return getRuleContexts(BoundPairContext.class);
		}
		public BoundPairContext boundPair(int i) {
			return getRuleContext(BoundPairContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public BoundPairCommalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boundPairCommalist; }
	}

	public final BoundPairCommalistContext boundPairCommalist() throws RecognitionException {
		BoundPairCommalistContext _localctx = new BoundPairCommalistContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_boundPairCommalist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			boundPair();
			setState(803);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(799);
				match(COMMA);
				setState(800);
				boundPair();
				}
				}
				setState(805);
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

	public static class LowerBoundContext extends VisitorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LowerBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerBound; }
	}

	public final LowerBoundContext lowerBound() throws RecognitionException {
		LowerBoundContext _localctx = new LowerBoundContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_lowerBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(806);
			expression(0);
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

	public static class UpperBoundContext extends VisitorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperBound; }
	}

	public final UpperBoundContext upperBound() throws RecognitionException {
		UpperBoundContext _localctx = new UpperBoundContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_upperBound);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			expression(0);
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

	public static class AttributesContext extends VisitorContext {
		public DataAttributeContext dataAttribute() {
			return getRuleContext(DataAttributeContext.class,0);
		}
		public MemoryAttributeContext memoryAttribute() {
			return getRuleContext(MemoryAttributeContext.class,0);
		}
		public LinkageOptionContext linkageOption() {
			return getRuleContext(LinkageOptionContext.class,0);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_attributes);
		try {
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(810);
				dataAttribute();
				setState(812);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
				case 1:
					{
					setState(811);
					memoryAttribute();
					}
					break;
				}
				setState(815);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
				case 1:
					{
					setState(814);
					linkageOption();
					}
					break;
				}
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(817);
				dataAttribute();
				setState(819);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
				case 1:
					{
					setState(818);
					linkageOption();
					}
					break;
				}
				setState(822);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(821);
					memoryAttribute();
					}
					break;
				}
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(824);
				memoryAttribute();
				setState(826);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(825);
					dataAttribute();
					}
					break;
				}
				setState(829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(828);
					linkageOption();
					}
					break;
				}
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(831);
				memoryAttribute();
				setState(833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
				case 1:
					{
					setState(832);
					linkageOption();
					}
					break;
				}
				setState(836);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(835);
					dataAttribute();
					}
					break;
				}
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(838);
				linkageOption();
				setState(840);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
				case 1:
					{
					setState(839);
					memoryAttribute();
					}
					break;
				}
				setState(843);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
				case 1:
					{
					setState(842);
					dataAttribute();
					}
					break;
				}
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(845);
				linkageOption();
				setState(847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
				case 1:
					{
					setState(846);
					dataAttribute();
					}
					break;
				}
				setState(850);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(849);
					memoryAttribute();
					}
					break;
				}
				}
				}
				break;
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

	public static class MemoryAttributeContext extends VisitorContext {
		public TerminalNode STACK() { return getToken(ImperiumParser.STACK, 0); }
		public TerminalNode STATIC() { return getToken(ImperiumParser.STATIC, 0); }
		public BasedContext based() {
			return getRuleContext(BasedContext.class,0);
		}
		public DefinedContext defined() {
			return getRuleContext(DefinedContext.class,0);
		}
		public MemoryAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryAttribute; }
	}

	public final MemoryAttributeContext memoryAttribute() throws RecognitionException {
		MemoryAttributeContext _localctx = new MemoryAttributeContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_memoryAttribute);
		try {
			setState(858);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STACK:
				enterOuterAlt(_localctx, 1);
				{
				setState(854);
				match(STACK);
				}
				break;
			case STATIC:
				enterOuterAlt(_localctx, 2);
				{
				setState(855);
				match(STATIC);
				}
				break;
			case BASED:
				enterOuterAlt(_localctx, 3);
				{
				setState(856);
				based();
				}
				break;
			case DEFINED:
				enterOuterAlt(_localctx, 4);
				{
				setState(857);
				defined();
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

	public static class DataAttributeContext extends VisitorContext {
		public TerminalNode BINARY() { return getToken(ImperiumParser.BINARY, 0); }
		public NumericScaleContext numericScale() {
			return getRuleContext(NumericScaleContext.class,0);
		}
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public TerminalNode DECIMAL() { return getToken(ImperiumParser.DECIMAL, 0); }
		public TerminalNode POINTER() { return getToken(ImperiumParser.POINTER, 0); }
		public TerminalNode BIT() { return getToken(ImperiumParser.BIT, 0); }
		public MaxLengthContext maxLength() {
			return getRuleContext(MaxLengthContext.class,0);
		}
		public TerminalNode CHARACTER() { return getToken(ImperiumParser.CHARACTER, 0); }
		public TerminalNode STRING() { return getToken(ImperiumParser.STRING, 0); }
		public MaxStringLengthContext maxStringLength() {
			return getRuleContext(MaxStringLengthContext.class,0);
		}
		public TerminalNode ENTRY() { return getToken(ImperiumParser.ENTRY, 0); }
		public TerminalNode LABEL() { return getToken(ImperiumParser.LABEL, 0); }
		public TerminalNode OFFSET() { return getToken(ImperiumParser.OFFSET, 0); }
		public TerminalNode VARYING() { return getToken(ImperiumParser.VARYING, 0); }
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public TerminalNode BUILTIN() { return getToken(ImperiumParser.BUILTIN, 0); }
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public DataAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataAttribute; }
	}

	public final DataAttributeContext dataAttribute() throws RecognitionException {
		DataAttributeContext _localctx = new DataAttributeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_dataAttribute);
		int _la;
		try {
			setState(902);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(861);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIXED || _la==FLOAT) {
					{
					setState(860);
					numericScale();
					}
				}

				setState(863);
				match(BINARY);
				setState(865);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(864);
					precision();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(868);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FIXED || _la==FLOAT) {
					{
					setState(867);
					numericScale();
					}
				}

				setState(870);
				match(DECIMAL);
				setState(872);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(871);
					precision();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(874);
				match(BINARY);
				setState(876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(875);
					precision();
					}
				}

				setState(879);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(878);
					numericScale();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(881);
				match(DECIMAL);
				setState(883);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(882);
					precision();
					}
				}

				setState(886);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(885);
					numericScale();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(888);
				match(POINTER);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(889);
				match(BIT);
				setState(890);
				maxLength();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(891);
				match(CHARACTER);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(892);
				match(STRING);
				setState(893);
				maxStringLength();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(894);
				match(ENTRY);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(895);
				match(LABEL);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(896);
				match(OFFSET);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(897);
				match(VARYING);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(898);
				match(COROUTINE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(899);
				match(COFUNCTION);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(900);
				match(BUILTIN);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(901);
				match(INTRINSIC);
				}
				break;
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

	public static class NumericScaleContext extends VisitorContext {
		public TerminalNode FIXED() { return getToken(ImperiumParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(ImperiumParser.FLOAT, 0); }
		public NumericScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericScale; }
	}

	public final NumericScaleContext numericScale() throws RecognitionException {
		NumericScaleContext _localctx = new NumericScaleContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_numericScale);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(904);
			_la = _input.LA(1);
			if ( !(_la==FIXED || _la==FLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LinkageOptionContext extends VisitorContext {
		public TerminalNode RETAIN() { return getToken(ImperiumParser.RETAIN, 0); }
		public TerminalNode MAIN() { return getToken(ImperiumParser.MAIN, 0); }
		public LinkageSectionContext linkageSection() {
			return getRuleContext(LinkageSectionContext.class,0);
		}
		public LinkageOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkageOption; }
	}

	public final LinkageOptionContext linkageOption() throws RecognitionException {
		LinkageOptionContext _localctx = new LinkageOptionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_linkageOption);
		try {
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(906);
				match(RETAIN);
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(907);
					match(MAIN);
					}
					break;
				}
				setState(911);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(910);
					linkageSection();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(913);
				match(RETAIN);
				setState(915);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(914);
					linkageSection();
					}
					break;
				}
				setState(918);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
				case 1:
					{
					setState(917);
					match(MAIN);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(920);
				match(MAIN);
				setState(922);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(921);
					match(RETAIN);
					}
					break;
				}
				setState(925);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
				case 1:
					{
					setState(924);
					linkageSection();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(927);
				match(MAIN);
				setState(929);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
				case 1:
					{
					setState(928);
					linkageSection();
					}
					break;
				}
				setState(932);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
				case 1:
					{
					setState(931);
					match(RETAIN);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(934);
				linkageSection();
				setState(936);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
				case 1:
					{
					setState(935);
					match(MAIN);
					}
					break;
				}
				setState(939);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
				case 1:
					{
					setState(938);
					match(RETAIN);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(941);
				linkageSection();
				setState(943);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
				case 1:
					{
					setState(942);
					match(RETAIN);
					}
					break;
				}
				setState(946);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
				case 1:
					{
					setState(945);
					match(MAIN);
					}
					break;
				}
				}
				break;
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

	public static class LinkageSectionContext extends VisitorContext {
		public TerminalNode SECTION() { return getToken(ImperiumParser.SECTION, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public LinkageSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkageSection; }
	}

	public final LinkageSectionContext linkageSection() throws RecognitionException {
		LinkageSectionContext _localctx = new LinkageSectionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_linkageSection);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(950);
			match(SECTION);
			setState(951);
			match(LPAR);
			setState(952);
			match(STRING_LITERAL_1);
			setState(953);
			match(RPAR);
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

	public static class PrecisionContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public NumberOfDigitsContext numberOfDigits() {
			return getRuleContext(NumberOfDigitsContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode COMMA() { return getToken(ImperiumParser.COMMA, 0); }
		public Scale_factorContext scale_factor() {
			return getRuleContext(Scale_factorContext.class,0);
		}
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_precision);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(955);
			match(LPAR);
			setState(956);
			numberOfDigits();
			setState(959);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(957);
				match(COMMA);
				setState(958);
				scale_factor();
				}
			}

			setState(961);
			match(RPAR);
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

	public static class NumberOfDigitsContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberOfDigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberOfDigits; }
	}

	public final NumberOfDigitsContext numberOfDigits() throws RecognitionException {
		NumberOfDigitsContext _localctx = new NumberOfDigitsContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_numberOfDigits);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(965);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(963);
				match(INTEGER);
				}
				break;
			case ACCEPT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case ASSEMBLER:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCANAS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(964);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class Scale_factorContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Scale_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale_factor; }
	}

	public final Scale_factorContext scale_factor() throws RecognitionException {
		Scale_factorContext _localctx = new Scale_factorContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_scale_factor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(967);
				match(INTEGER);
				}
				break;
			case ACCEPT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case ASSEMBLER:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCANAS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(968);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MaxStringLengthContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode TIMES() { return getToken(ImperiumParser.TIMES, 0); }
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MaxStringLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxStringLength; }
	}

	public final MaxStringLengthContext maxStringLength() throws RecognitionException {
		MaxStringLengthContext _localctx = new MaxStringLengthContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_maxStringLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			match(LPAR);
			setState(977);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TIMES:
				{
				setState(972);
				match(TIMES);
				}
				break;
			case ACCEPT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case ASSEMBLER:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCANAS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case INTEGER:
			case IDENTIFIER:
				{
				setState(975);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case INTEGER:
					{
					setState(973);
					match(INTEGER);
					}
					break;
				case ACCEPT:
				case ALIAS:
				case ALIGNED:
				case ALL:
				case ANY:
				case ARGUMENT:
				case AS:
				case ASSEMBLER:
				case BASED:
				case BINARY:
				case BIT:
				case BOOLEAN:
				case BOOTSTRAP:
				case BUILTIN:
				case BY:
				case BYPASS:
				case CALL:
				case CHARACTER:
				case COFUNCTION:
				case COLD:
				case COROUTINE:
				case DECIMAL:
				case DECLARE:
				case DEFINE:
				case DEFINED:
				case ELIF:
				case ELSE:
				case END:
				case ENDLOOP:
				case ENTRY:
				case ENUM:
				case FIXED:
				case FLOAT:
				case FUNCTION:
				case GOTO:
				case IF:
				case INC:
				case INCLUDE:
				case INTERNAL:
				case INTERRUPT:
				case INTRINSIC:
				case LANGUAGE:
				case LOOP:
				case MAIN:
				case NAKED:
				case NORETURN:
				case OFFSET:
				case OTHERWISE:
				case OUT:
				case PAD:
				case POINTER:
				case PRIVATE:
				case PROCEDURE:
				case PUBLIC:
				case RAW:
				case READONLY:
				case RECURSIVE:
				case REF:
				case RELOOP:
				case RETAIN:
				case RETURN:
				case RETURNON:
				case RETURNS:
				case SCANAS:
				case SCOPE:
				case SECTION:
				case SELECT:
				case SINGLET:
				case STACK:
				case STATIC:
				case STRING:
				case STRUCTURE:
				case THEN:
				case TO:
				case TRAITS:
				case TYPE:
				case UNALIGNED:
				case UNTIL:
				case USES:
				case USING:
				case UTF:
				case VARIABLE:
				case VARYING:
				case WHEN:
				case WHILE:
				case YIELD:
				case IDENTIFIER:
					{
					setState(974);
					identifier();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(979);
			match(RPAR);
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

	public static class MaxLengthContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public MaxLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maxLength; }
	}

	public final MaxLengthContext maxLength() throws RecognitionException {
		MaxLengthContext _localctx = new MaxLengthContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_maxLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(981);
			match(LPAR);
			setState(984);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				{
				setState(982);
				match(INTEGER);
				}
				break;
			case ACCEPT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case ASSEMBLER:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCANAS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
			case IDENTIFIER:
				{
				setState(983);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(986);
			match(RPAR);
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

	public static class BasedContext extends VisitorContext {
		public TerminalNode BASED() { return getToken(ImperiumParser.BASED, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public BasedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_based; }
	}

	public final BasedContext based() throws RecognitionException {
		BasedContext _localctx = new BasedContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_based);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(988);
			match(BASED);
			setState(993);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(989);
				match(LPAR);
				setState(990);
				reference(0);
				setState(991);
				match(RPAR);
				}
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

	public static class DefinedContext extends VisitorContext {
		public TerminalNode DEFINED() { return getToken(ImperiumParser.DEFINED, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public DefinedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defined; }
	}

	public final DefinedContext defined() throws RecognitionException {
		DefinedContext _localctx = new DefinedContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_defined);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			match(DEFINED);
			setState(1000);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(996);
				match(LPAR);
				setState(997);
				reference(0);
				setState(998);
				match(RPAR);
				}
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

	public static class CoprocedureSpecifierContext extends VisitorContext {
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public CoprocedureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coprocedureSpecifier; }
	}

	public final CoprocedureSpecifierContext coprocedureSpecifier() throws RecognitionException {
		CoprocedureSpecifierContext _localctx = new CoprocedureSpecifierContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_coprocedureSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1002);
			_la = _input.LA(1);
			if ( !(_la==COFUNCTION || _la==COROUTINE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class HandlerSpecifierContext extends VisitorContext {
		public TerminalNode INTERRUPT() { return getToken(ImperiumParser.INTERRUPT, 0); }
		public HandlerSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerSpecifier; }
	}

	public final HandlerSpecifierContext handlerSpecifier() throws RecognitionException {
		HandlerSpecifierContext _localctx = new HandlerSpecifierContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_handlerSpecifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(INTERRUPT);
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

	public static class ParameterNameCommalistContext extends VisitorContext {
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public ParameterNameCommalistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterNameCommalist; }
	}

	public final ParameterNameCommalistContext parameterNameCommalist() throws RecognitionException {
		ParameterNameCommalistContext _localctx = new ParameterNameCommalistContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_parameterNameCommalist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(LPAR);
			setState(1007);
			identifier();
			setState(1012);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1008);
				match(COMMA);
				setState(1009);
				identifier();
				}
				}
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1015);
			match(RPAR);
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

	public static class ReturnStmtContext extends VisitorContext {
		public TerminalNode RETURN() { return getToken(ImperiumParser.RETURN, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public ReturnStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStmt; }
	}

	public final ReturnStmtContext returnStmt() throws RecognitionException {
		ReturnStmtContext _localctx = new ReturnStmtContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_returnStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1017);
			match(RETURN);
			setState(1022);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1018);
				match(LPAR);
				setState(1019);
				expression(0);
				setState(1020);
				match(RPAR);
				}
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

	public static class IfStmtContext extends VisitorContext {
		public ActiveStmtContext Then;
		public ElseClauseContext ElseClause;
		public ElifClauseContext ElifClause;
		public ThenClauseContext thenClause() {
			return getRuleContext(ThenClauseContext.class,0);
		}
		public IfEndContext ifEnd() {
			return getRuleContext(IfEndContext.class,0);
		}
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public List<ElifClauseContext> elifClause() {
			return getRuleContexts(ElifClauseContext.class);
		}
		public ElifClauseContext elifClause(int i) {
			return getRuleContext(ElifClauseContext.class,i);
		}
		public IfStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStmt; }
	}

	public final IfStmtContext ifStmt() throws RecognitionException {
		IfStmtContext _localctx = new IfStmtContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_ifStmt);
		int _la;
		try {
			int _alt;
			setState(1050);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1024);
				thenClause();
				setState(1028);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1025);
						((IfStmtContext)_localctx).Then = activeStmt();
						}
						} 
					}
					setState(1030);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
				}
				setState(1032);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1031);
					((IfStmtContext)_localctx).ElseClause = elseClause();
					}
				}

				setState(1034);
				ifEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1036);
				thenClause();
				setState(1040);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1037);
						((IfStmtContext)_localctx).Then = activeStmt();
						}
						} 
					}
					setState(1042);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
				}
				setState(1044); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1043);
					((IfStmtContext)_localctx).ElifClause = elifClause();
					}
					}
					setState(1046); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ELIF );
				setState(1048);
				ifEnd();
				}
				break;
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

	public static class IfEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode IF() { return getToken(ImperiumParser.IF, 0); }
		public IfEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifEnd; }
	}

	public final IfEndContext ifEnd() throws RecognitionException {
		IfEndContext _localctx = new IfEndContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_ifEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			match(END);
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1053);
				match(IF);
				}
				break;
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

	public static class ThenClauseContext extends VisitorContext {
		public TerminalNode IF() { return getToken(ImperiumParser.IF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ImperiumParser.THEN, 0); }
		public ThenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thenClause; }
	}

	public final ThenClauseContext thenClause() throws RecognitionException {
		ThenClauseContext _localctx = new ThenClauseContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_thenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			match(IF);
			setState(1057);
			expression(0);
			setState(1058);
			match(THEN);
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

	public static class ElseClauseContext extends VisitorContext {
		public ActiveStmtContext Else;
		public TerminalNode ELSE() { return getToken(ImperiumParser.ELSE, 0); }
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_elseClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1060);
			match(ELSE);
			setState(1064);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1061);
					((ElseClauseContext)_localctx).Else = activeStmt();
					}
					} 
				}
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,125,_ctx);
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

	public static class ElifClauseContext extends VisitorContext {
		public ActiveStmtContext Elif;
		public TerminalNode ELIF() { return getToken(ImperiumParser.ELIF, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(ImperiumParser.THEN, 0); }
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public ElifClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elifClause; }
	}

	public final ElifClauseContext elifClause() throws RecognitionException {
		ElifClauseContext _localctx = new ElifClauseContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_elifClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1067);
			match(ELIF);
			setState(1068);
			expression(0);
			setState(1069);
			match(THEN);
			setState(1073);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1070);
					((ElifClauseContext)_localctx).Elif = activeStmt();
					}
					} 
				}
				setState(1075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,126,_ctx);
			}
			setState(1077);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1076);
				elseClause();
				}
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

	public static class LoopStmtContext extends VisitorContext {
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public LoopEndContext loopEnd() {
			return getRuleContext(LoopEndContext.class,0);
		}
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public UntilLoopContext untilLoop() {
			return getRuleContext(UntilLoopContext.class,0);
		}
		public LoopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStmt; }
	}

	public final LoopStmtContext loopStmt() throws RecognitionException {
		LoopStmtContext _localctx = new LoopStmtContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_loopStmt);
		try {
			int _alt;
			setState(1100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1079);
				match(LOOP);
				setState(1083);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1080);
						activeStmt();
						}
						} 
					}
					setState(1085);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,128,_ctx);
				}
				setState(1086);
				loopEnd();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1087);
				match(LOOP);
				setState(1090);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case WHILE:
					{
					setState(1088);
					whileLoop();
					}
					break;
				case UNTIL:
					{
					setState(1089);
					untilLoop();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1095);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1092);
						activeStmt();
						}
						} 
					}
					setState(1097);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,130,_ctx);
				}
				setState(1098);
				loopEnd();
				}
				break;
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

	public static class WhileLoopContext extends VisitorContext {
		public WhileOptionContext whileOption() {
			return getRuleContext(WhileOptionContext.class,0);
		}
		public UntilOptionContext untilOption() {
			return getRuleContext(UntilOptionContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1102);
			whileOption();
			setState(1104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1103);
				untilOption();
				}
				break;
			}
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

	public static class UntilLoopContext extends VisitorContext {
		public UntilOptionContext untilOption() {
			return getRuleContext(UntilOptionContext.class,0);
		}
		public WhileOptionContext whileOption() {
			return getRuleContext(WhileOptionContext.class,0);
		}
		public UntilLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilLoop; }
	}

	public final UntilLoopContext untilLoop() throws RecognitionException {
		UntilLoopContext _localctx = new UntilLoopContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_untilLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1106);
			untilOption();
			setState(1108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1107);
				whileOption();
				}
				break;
			}
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

	public static class LoopEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public LoopEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopEnd; }
	}

	public final LoopEndContext loopEnd() throws RecognitionException {
		LoopEndContext _localctx = new LoopEndContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_loopEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			match(END);
			setState(1112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				{
				setState(1111);
				match(LOOP);
				}
				break;
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

	public static class WhileOptionContext extends VisitorContext {
		public TerminalNode WHILE() { return getToken(ImperiumParser.WHILE, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public WhileOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileOption; }
	}

	public final WhileOptionContext whileOption() throws RecognitionException {
		WhileOptionContext _localctx = new WhileOptionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_whileOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(WHILE);
			setState(1115);
			match(LPAR);
			setState(1116);
			expression(0);
			setState(1117);
			match(RPAR);
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

	public static class UntilOptionContext extends VisitorContext {
		public TerminalNode UNTIL() { return getToken(ImperiumParser.UNTIL, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public UntilOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_untilOption; }
	}

	public final UntilOptionContext untilOption() throws RecognitionException {
		UntilOptionContext _localctx = new UntilOptionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_untilOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			match(UNTIL);
			setState(1120);
			match(LPAR);
			setState(1121);
			expression(0);
			setState(1122);
			match(RPAR);
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

	public static class SelectStmtContext extends VisitorContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public SelectEndContext selectEnd() {
			return getRuleContext(SelectEndContext.class,0);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public OtherwiseClauseContext otherwiseClause() {
			return getRuleContext(OtherwiseClauseContext.class,0);
		}
		public SelectStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStmt; }
	}

	public final SelectStmtContext selectStmt() throws RecognitionException {
		SelectStmtContext _localctx = new SelectStmtContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_selectStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			selectClause();
			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHEN) {
				{
				{
				setState(1125);
				whenClause();
				}
				}
				setState(1130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1131);
				otherwiseClause();
				}
			}

			setState(1134);
			selectEnd();
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

	public static class SelectEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SELECT() { return getToken(ImperiumParser.SELECT, 0); }
		public SelectEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectEnd; }
	}

	public final SelectEndContext selectEnd() throws RecognitionException {
		SelectEndContext _localctx = new SelectEndContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_selectEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(END);
			setState(1138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				{
				setState(1137);
				match(SELECT);
				}
				break;
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

	public static class SelectClauseContext extends VisitorContext {
		public TerminalNode SELECT() { return getToken(ImperiumParser.SELECT, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_selectClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1140);
			match(SELECT);
			setState(1145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1141);
				match(LPAR);
				setState(1142);
				expression(0);
				setState(1143);
				match(RPAR);
				}
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

	public static class WhenClauseContext extends VisitorContext {
		public TerminalNode WHEN() { return getToken(ImperiumParser.WHEN, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public TerminalNode ANY() { return getToken(ImperiumParser.ANY, 0); }
		public TerminalNode ALL() { return getToken(ImperiumParser.ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(ImperiumParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(ImperiumParser.COMMA, i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_whenClause);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1147);
			match(WHEN);
			setState(1149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL || _la==ANY) {
				{
				setState(1148);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1151);
			match(LPAR);
			{
			setState(1152);
			expression(0);
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1153);
				match(COMMA);
				setState(1154);
				expression(0);
				}
				}
				setState(1159);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
			setState(1160);
			match(RPAR);
			setState(1164);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1161);
					activeStmt();
					}
					} 
				}
				setState(1166);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,141,_ctx);
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

	public static class OtherwiseClauseContext extends VisitorContext {
		public TerminalNode ELSE() { return getToken(ImperiumParser.ELSE, 0); }
		public List<ActiveStmtContext> activeStmt() {
			return getRuleContexts(ActiveStmtContext.class);
		}
		public ActiveStmtContext activeStmt(int i) {
			return getRuleContext(ActiveStmtContext.class,i);
		}
		public OtherwiseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otherwiseClause; }
	}

	public final OtherwiseClauseContext otherwiseClause() throws RecognitionException {
		OtherwiseClauseContext _localctx = new OtherwiseClauseContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_otherwiseClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1167);
			match(ELSE);
			setState(1171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1168);
					activeStmt();
					}
					} 
				}
				setState(1173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,142,_ctx);
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

	public static class DefineStmtContext extends VisitorContext {
		public TerminalNode DEFINE() { return getToken(ImperiumParser.DEFINE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumTypeContext enumType() {
			return getRuleContext(EnumTypeContext.class,0);
		}
		public StructTypeContext structType() {
			return getRuleContext(StructTypeContext.class,0);
		}
		public AliasTypeContext aliasType() {
			return getRuleContext(AliasTypeContext.class,0);
		}
		public DefineStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defineStmt; }
	}

	public final DefineStmtContext defineStmt() throws RecognitionException {
		DefineStmtContext _localctx = new DefineStmtContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_defineStmt);
		try {
			setState(1186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1174);
				match(DEFINE);
				setState(1175);
				identifier();
				setState(1176);
				enumType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1178);
				match(DEFINE);
				setState(1179);
				identifier();
				setState(1180);
				structType();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1182);
				match(DEFINE);
				setState(1183);
				identifier();
				setState(1184);
				aliasType();
				}
				break;
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

	public static class EnumTypeContext extends VisitorContext {
		public List<TerminalNode> ENUM() { return getTokens(ImperiumParser.ENUM); }
		public TerminalNode ENUM(int i) {
			return getToken(ImperiumParser.ENUM, i);
		}
		public EnumBodyContext enumBody() {
			return getRuleContext(EnumBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public BinaryEnumContext binaryEnum() {
			return getRuleContext(BinaryEnumContext.class,0);
		}
		public DecimalEnumContext decimalEnum() {
			return getRuleContext(DecimalEnumContext.class,0);
		}
		public StringEnumContext stringEnum() {
			return getRuleContext(StringEnumContext.class,0);
		}
		public BitEnumContext bitEnum() {
			return getRuleContext(BitEnumContext.class,0);
		}
		public EnumTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumType; }
	}

	public final EnumTypeContext enumType() throws RecognitionException {
		EnumTypeContext _localctx = new EnumTypeContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_enumType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1188);
			match(ENUM);
			setState(1193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				{
				setState(1189);
				binaryEnum();
				}
				break;
			case 2:
				{
				setState(1190);
				decimalEnum();
				}
				break;
			case 3:
				{
				setState(1191);
				stringEnum();
				}
				break;
			case 4:
				{
				setState(1192);
				bitEnum();
				}
				break;
			}
			setState(1195);
			enumBody();
			setState(1196);
			match(END);
			setState(1198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1197);
				match(ENUM);
				}
				break;
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

	public static class AliasTypeContext extends VisitorContext {
		public TerminalNode ALIAS() { return getToken(ImperiumParser.ALIAS, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AliasTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasType; }
	}

	public final AliasTypeContext aliasType() throws RecognitionException {
		AliasTypeContext _localctx = new AliasTypeContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_aliasType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1200);
			match(ALIAS);
			setState(1201);
			attributes();
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

	public static class BinaryEnumContext extends VisitorContext {
		public TerminalNode BINARY() { return getToken(ImperiumParser.BINARY, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public BinaryEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryEnum; }
	}

	public final BinaryEnumContext binaryEnum() throws RecognitionException {
		BinaryEnumContext _localctx = new BinaryEnumContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_binaryEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1203);
			match(BINARY);
			setState(1204);
			match(LPAR);
			setState(1205);
			decimalLiteral();
			setState(1206);
			match(RPAR);
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

	public static class DecimalEnumContext extends VisitorContext {
		public TerminalNode DECIMAL() { return getToken(ImperiumParser.DECIMAL, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public DecimalEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalEnum; }
	}

	public final DecimalEnumContext decimalEnum() throws RecognitionException {
		DecimalEnumContext _localctx = new DecimalEnumContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_decimalEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1208);
			match(DECIMAL);
			setState(1209);
			match(LPAR);
			setState(1210);
			decimalLiteral();
			setState(1211);
			match(RPAR);
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

	public static class StringEnumContext extends VisitorContext {
		public TerminalNode STRING() { return getToken(ImperiumParser.STRING, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public StringEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringEnum; }
	}

	public final StringEnumContext stringEnum() throws RecognitionException {
		StringEnumContext _localctx = new StringEnumContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_stringEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1213);
			match(STRING);
			setState(1214);
			match(LPAR);
			setState(1215);
			decimalLiteral();
			setState(1216);
			match(RPAR);
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

	public static class BitEnumContext extends VisitorContext {
		public TerminalNode BIT() { return getToken(ImperiumParser.BIT, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public BitEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitEnum; }
	}

	public final BitEnumContext bitEnum() throws RecognitionException {
		BitEnumContext _localctx = new BitEnumContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_bitEnum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1218);
			match(BIT);
			setState(1219);
			match(LPAR);
			setState(1220);
			decimalLiteral();
			setState(1221);
			match(RPAR);
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

	public static class EnumBodyContext extends VisitorContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(ImperiumParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(ImperiumParser.EQUALS, i);
		}
		public List<EnumLiteralContext> enumLiteral() {
			return getRuleContexts(EnumLiteralContext.class);
		}
		public EnumLiteralContext enumLiteral(int i) {
			return getRuleContext(EnumLiteralContext.class,i);
		}
		public EnumBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumBody; }
	}

	public final EnumBodyContext enumBody() throws RecognitionException {
		EnumBodyContext _localctx = new EnumBodyContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_enumBody);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1223);
			identifier();
			setState(1226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQUALS) {
				{
				setState(1224);
				match(EQUALS);
				setState(1225);
				enumLiteral();
				}
			}

			setState(1235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1228);
					identifier();
					setState(1231);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==EQUALS) {
						{
						setState(1229);
						match(EQUALS);
						setState(1230);
						enumLiteral();
						}
					}

					}
					} 
				}
				setState(1237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,148,_ctx);
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

	public static class EnumLiteralContext extends VisitorContext {
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public BinaryLiteralContext binaryLiteral() {
			return getRuleContext(BinaryLiteralContext.class,0);
		}
		public EnumLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumLiteral; }
	}

	public final EnumLiteralContext enumLiteral() throws RecognitionException {
		EnumLiteralContext _localctx = new EnumLiteralContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_enumLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
			case DECIMAL_PATTERN:
				{
				setState(1238);
				decimalLiteral();
				}
				break;
			case STRING_LITERAL_3:
			case STRING_LITERAL_2:
			case STRING_LITERAL_1:
				{
				setState(1239);
				stringLiteral();
				}
				break;
			case BINARY_PATTERN:
				{
				setState(1240);
				binaryLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StructTypeContext extends VisitorContext {
		public List<TerminalNode> STRUCTURE() { return getTokens(ImperiumParser.STRUCTURE); }
		public TerminalNode STRUCTURE(int i) {
			return getToken(ImperiumParser.STRUCTURE, i);
		}
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public StructTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structType; }
	}

	public final StructTypeContext structType() throws RecognitionException {
		StructTypeContext _localctx = new StructTypeContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_structType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1243);
			match(STRUCTURE);
			setState(1244);
			structBody();
			setState(1245);
			match(END);
			setState(1247);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				{
				setState(1246);
				match(STRUCTURE);
				}
				break;
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

	public static class StructBodyContext extends VisitorContext {
		public StructMemberListContext structMemberList() {
			return getRuleContext(StructMemberListContext.class,0);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_structBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1249);
			structMemberList();
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

	public static class StructMemberListContext extends VisitorContext {
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public StructMemberListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMemberList; }
	}

	public final StructMemberListContext structMemberList() throws RecognitionException {
		StructMemberListContext _localctx = new StructMemberListContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_structMemberList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			structMember();
			setState(1255);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1252);
					structMember();
					}
					} 
				}
				setState(1257);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,151,_ctx);
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

	public static class StructSubstructContext extends VisitorContext {
		public IdentifierContext StructName;
		public List<TerminalNode> STRUCTURE() { return getTokens(ImperiumParser.STRUCTURE); }
		public TerminalNode STRUCTURE(int i) {
			return getToken(ImperiumParser.STRUCTURE, i);
		}
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DimensionSuffixContext dimensionSuffix() {
			return getRuleContext(DimensionSuffixContext.class,0);
		}
		public StructSubstructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structSubstruct; }
	}

	public final StructSubstructContext structSubstruct() throws RecognitionException {
		StructSubstructContext _localctx = new StructSubstructContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_structSubstruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			((StructSubstructContext)_localctx).StructName = identifier();
			setState(1260);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LPAR) {
				{
				setState(1259);
				dimensionSuffix();
				}
			}

			setState(1262);
			match(STRUCTURE);
			setState(1263);
			structBody();
			setState(1264);
			match(END);
			setState(1266);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				{
				setState(1265);
				match(STRUCTURE);
				}
				break;
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

	public static class StructMemberContext extends VisitorContext {
		public StructSubstructContext structSubstruct() {
			return getRuleContext(StructSubstructContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode AS() { return getToken(ImperiumParser.AS, 0); }
		public DimensionSuffixContext dimensionSuffix() {
			return getRuleContext(DimensionSuffixContext.class,0);
		}
		public DeclarationBodyContext declarationBody() {
			return getRuleContext(DeclarationBodyContext.class,0);
		}
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_structMember);
		int _la;
		try {
			setState(1277);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1268);
				structSubstruct();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1269);
				identifier();
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LPAR) {
					{
					setState(1270);
					dimensionSuffix();
					}
				}

				setState(1273);
				match(AS);
				setState(1274);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1276);
				declarationBody();
				}
				break;
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

	public static class StringLiteralContext extends VisitorContext {
		public TerminalNode STRING_LITERAL_3() { return getToken(ImperiumParser.STRING_LITERAL_3, 0); }
		public TerminalNode STRING_LITERAL_2() { return getToken(ImperiumParser.STRING_LITERAL_2, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_stringLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1279);
			_la = _input.LA(1);
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (STRING_LITERAL_3 - 90)) | (1L << (STRING_LITERAL_2 - 90)) | (1L << (STRING_LITERAL_1 - 90)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class NumericLiteralContext extends VisitorContext {
		public BinaryLiteralContext binaryLiteral() {
			return getRuleContext(BinaryLiteralContext.class,0);
		}
		public OctalLiteralContext octalLiteral() {
			return getRuleContext(OctalLiteralContext.class,0);
		}
		public HexLiteralContext hexLiteral() {
			return getRuleContext(HexLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_numericLiteral);
		try {
			setState(1285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY_PATTERN:
				enterOuterAlt(_localctx, 1);
				{
				setState(1281);
				binaryLiteral();
				}
				break;
			case OCTAL_PATTERN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1282);
				octalLiteral();
				}
				break;
			case HEXADECIMAL_PATTERN:
				enterOuterAlt(_localctx, 3);
				{
				setState(1283);
				hexLiteral();
				}
				break;
			case INTEGER:
			case DECIMAL_PATTERN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1284);
				decimalLiteral();
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

	public static class HexLiteralContext extends VisitorContext {
		public TerminalNode HEXADECIMAL_PATTERN() { return getToken(ImperiumParser.HEXADECIMAL_PATTERN, 0); }
		public HexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexLiteral; }
	}

	public final HexLiteralContext hexLiteral() throws RecognitionException {
		HexLiteralContext _localctx = new HexLiteralContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_hexLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1287);
			match(HEXADECIMAL_PATTERN);
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

	public static class OctalLiteralContext extends VisitorContext {
		public TerminalNode OCTAL_PATTERN() { return getToken(ImperiumParser.OCTAL_PATTERN, 0); }
		public OctalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octalLiteral; }
	}

	public final OctalLiteralContext octalLiteral() throws RecognitionException {
		OctalLiteralContext _localctx = new OctalLiteralContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_octalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1289);
			match(OCTAL_PATTERN);
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

	public static class DecimalLiteralContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public TerminalNode DECIMAL_PATTERN() { return getToken(ImperiumParser.DECIMAL_PATTERN, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_decimalLiteral);
		try {
			setState(1293);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1291);
				match(INTEGER);
				}
				}
				break;
			case DECIMAL_PATTERN:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(1292);
				match(DECIMAL_PATTERN);
				}
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

	public static class BinaryLiteralContext extends VisitorContext {
		public TerminalNode BINARY_PATTERN() { return getToken(ImperiumParser.BINARY_PATTERN, 0); }
		public BinaryLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLiteral; }
	}

	public final BinaryLiteralContext binaryLiteral() throws RecognitionException {
		BinaryLiteralContext _localctx = new BinaryLiteralContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_binaryLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1295);
			match(BINARY_PATTERN);
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

	public static class IdentifierContext extends VisitorContext {
		public TerminalNode ACCEPT() { return getToken(ImperiumParser.ACCEPT, 0); }
		public TerminalNode ALIAS() { return getToken(ImperiumParser.ALIAS, 0); }
		public TerminalNode ALIGNED() { return getToken(ImperiumParser.ALIGNED, 0); }
		public TerminalNode ALL() { return getToken(ImperiumParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(ImperiumParser.ANY, 0); }
		public TerminalNode ARGUMENT() { return getToken(ImperiumParser.ARGUMENT, 0); }
		public TerminalNode AS() { return getToken(ImperiumParser.AS, 0); }
		public TerminalNode ASSEMBLER() { return getToken(ImperiumParser.ASSEMBLER, 0); }
		public TerminalNode BASED() { return getToken(ImperiumParser.BASED, 0); }
		public TerminalNode BINARY() { return getToken(ImperiumParser.BINARY, 0); }
		public TerminalNode BIT() { return getToken(ImperiumParser.BIT, 0); }
		public TerminalNode BOOLEAN() { return getToken(ImperiumParser.BOOLEAN, 0); }
		public TerminalNode BOOTSTRAP() { return getToken(ImperiumParser.BOOTSTRAP, 0); }
		public TerminalNode BUILTIN() { return getToken(ImperiumParser.BUILTIN, 0); }
		public TerminalNode BY() { return getToken(ImperiumParser.BY, 0); }
		public TerminalNode BYPASS() { return getToken(ImperiumParser.BYPASS, 0); }
		public TerminalNode CALL() { return getToken(ImperiumParser.CALL, 0); }
		public TerminalNode CHARACTER() { return getToken(ImperiumParser.CHARACTER, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public TerminalNode COLD() { return getToken(ImperiumParser.COLD, 0); }
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public TerminalNode DECIMAL() { return getToken(ImperiumParser.DECIMAL, 0); }
		public TerminalNode DECLARE() { return getToken(ImperiumParser.DECLARE, 0); }
		public TerminalNode DEFINE() { return getToken(ImperiumParser.DEFINE, 0); }
		public TerminalNode DEFINED() { return getToken(ImperiumParser.DEFINED, 0); }
		public TerminalNode ELIF() { return getToken(ImperiumParser.ELIF, 0); }
		public TerminalNode ELSE() { return getToken(ImperiumParser.ELSE, 0); }
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode ENDLOOP() { return getToken(ImperiumParser.ENDLOOP, 0); }
		public TerminalNode ENTRY() { return getToken(ImperiumParser.ENTRY, 0); }
		public TerminalNode ENUM() { return getToken(ImperiumParser.ENUM, 0); }
		public TerminalNode FIXED() { return getToken(ImperiumParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(ImperiumParser.FLOAT, 0); }
		public TerminalNode FUNCTION() { return getToken(ImperiumParser.FUNCTION, 0); }
		public TerminalNode GOTO() { return getToken(ImperiumParser.GOTO, 0); }
		public TerminalNode IF() { return getToken(ImperiumParser.IF, 0); }
		public TerminalNode INC() { return getToken(ImperiumParser.INC, 0); }
		public TerminalNode INCLUDE() { return getToken(ImperiumParser.INCLUDE, 0); }
		public TerminalNode INTERNAL() { return getToken(ImperiumParser.INTERNAL, 0); }
		public TerminalNode INTERRUPT() { return getToken(ImperiumParser.INTERRUPT, 0); }
		public TerminalNode INTRINSIC() { return getToken(ImperiumParser.INTRINSIC, 0); }
		public TerminalNode LANGUAGE() { return getToken(ImperiumParser.LANGUAGE, 0); }
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public TerminalNode MAIN() { return getToken(ImperiumParser.MAIN, 0); }
		public TerminalNode NAKED() { return getToken(ImperiumParser.NAKED, 0); }
		public TerminalNode NORETURN() { return getToken(ImperiumParser.NORETURN, 0); }
		public TerminalNode OFFSET() { return getToken(ImperiumParser.OFFSET, 0); }
		public TerminalNode OTHERWISE() { return getToken(ImperiumParser.OTHERWISE, 0); }
		public TerminalNode OUT() { return getToken(ImperiumParser.OUT, 0); }
		public TerminalNode PAD() { return getToken(ImperiumParser.PAD, 0); }
		public TerminalNode POINTER() { return getToken(ImperiumParser.POINTER, 0); }
		public TerminalNode PRIVATE() { return getToken(ImperiumParser.PRIVATE, 0); }
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public TerminalNode PUBLIC() { return getToken(ImperiumParser.PUBLIC, 0); }
		public TerminalNode RAW() { return getToken(ImperiumParser.RAW, 0); }
		public TerminalNode READONLY() { return getToken(ImperiumParser.READONLY, 0); }
		public TerminalNode RECURSIVE() { return getToken(ImperiumParser.RECURSIVE, 0); }
		public TerminalNode REF() { return getToken(ImperiumParser.REF, 0); }
		public TerminalNode RELOOP() { return getToken(ImperiumParser.RELOOP, 0); }
		public TerminalNode RETAIN() { return getToken(ImperiumParser.RETAIN, 0); }
		public TerminalNode RETURN() { return getToken(ImperiumParser.RETURN, 0); }
		public TerminalNode RETURNON() { return getToken(ImperiumParser.RETURNON, 0); }
		public TerminalNode RETURNS() { return getToken(ImperiumParser.RETURNS, 0); }
		public TerminalNode SCANAS() { return getToken(ImperiumParser.SCANAS, 0); }
		public TerminalNode SCOPE() { return getToken(ImperiumParser.SCOPE, 0); }
		public TerminalNode SECTION() { return getToken(ImperiumParser.SECTION, 0); }
		public TerminalNode SELECT() { return getToken(ImperiumParser.SELECT, 0); }
		public TerminalNode SINGLET() { return getToken(ImperiumParser.SINGLET, 0); }
		public TerminalNode STACK() { return getToken(ImperiumParser.STACK, 0); }
		public TerminalNode STATIC() { return getToken(ImperiumParser.STATIC, 0); }
		public TerminalNode STRING() { return getToken(ImperiumParser.STRING, 0); }
		public TerminalNode STRUCTURE() { return getToken(ImperiumParser.STRUCTURE, 0); }
		public TerminalNode THEN() { return getToken(ImperiumParser.THEN, 0); }
		public TerminalNode TO() { return getToken(ImperiumParser.TO, 0); }
		public TerminalNode TRAITS() { return getToken(ImperiumParser.TRAITS, 0); }
		public TerminalNode TYPE() { return getToken(ImperiumParser.TYPE, 0); }
		public TerminalNode UNALIGNED() { return getToken(ImperiumParser.UNALIGNED, 0); }
		public TerminalNode UNTIL() { return getToken(ImperiumParser.UNTIL, 0); }
		public TerminalNode USES() { return getToken(ImperiumParser.USES, 0); }
		public TerminalNode USING() { return getToken(ImperiumParser.USING, 0); }
		public TerminalNode UTF() { return getToken(ImperiumParser.UTF, 0); }
		public TerminalNode VARIABLE() { return getToken(ImperiumParser.VARIABLE, 0); }
		public TerminalNode VARYING() { return getToken(ImperiumParser.VARYING, 0); }
		public TerminalNode WHEN() { return getToken(ImperiumParser.WHEN, 0); }
		public TerminalNode WHILE() { return getToken(ImperiumParser.WHILE, 0); }
		public TerminalNode YIELD() { return getToken(ImperiumParser.YIELD, 0); }
		public TerminalNode IDENTIFIER() { return getToken(ImperiumParser.IDENTIFIER, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_identifier);
		int _la;
		try {
			setState(1299);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ACCEPT:
			case ALIAS:
			case ALIGNED:
			case ALL:
			case ANY:
			case ARGUMENT:
			case AS:
			case ASSEMBLER:
			case BASED:
			case BINARY:
			case BIT:
			case BOOLEAN:
			case BOOTSTRAP:
			case BUILTIN:
			case BY:
			case BYPASS:
			case CALL:
			case CHARACTER:
			case COFUNCTION:
			case COLD:
			case COROUTINE:
			case DECIMAL:
			case DECLARE:
			case DEFINE:
			case DEFINED:
			case ELIF:
			case ELSE:
			case END:
			case ENDLOOP:
			case ENTRY:
			case ENUM:
			case FIXED:
			case FLOAT:
			case FUNCTION:
			case GOTO:
			case IF:
			case INC:
			case INCLUDE:
			case INTERNAL:
			case INTERRUPT:
			case INTRINSIC:
			case LANGUAGE:
			case LOOP:
			case MAIN:
			case NAKED:
			case NORETURN:
			case OFFSET:
			case OTHERWISE:
			case OUT:
			case PAD:
			case POINTER:
			case PRIVATE:
			case PROCEDURE:
			case PUBLIC:
			case RAW:
			case READONLY:
			case RECURSIVE:
			case REF:
			case RELOOP:
			case RETAIN:
			case RETURN:
			case RETURNON:
			case RETURNS:
			case SCANAS:
			case SCOPE:
			case SECTION:
			case SELECT:
			case SINGLET:
			case STACK:
			case STATIC:
			case STRING:
			case STRUCTURE:
			case THEN:
			case TO:
			case TRAITS:
			case TYPE:
			case UNALIGNED:
			case UNTIL:
			case USES:
			case USING:
			case UTF:
			case VARIABLE:
			case VARYING:
			case WHEN:
			case WHILE:
			case YIELD:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ACCEPT) | (1L << ALIAS) | (1L << ALIGNED) | (1L << ALL) | (1L << ANY) | (1L << ARGUMENT) | (1L << AS) | (1L << ASSEMBLER) | (1L << BASED) | (1L << BINARY) | (1L << BIT) | (1L << BOOLEAN) | (1L << BOOTSTRAP) | (1L << BUILTIN) | (1L << BY) | (1L << BYPASS) | (1L << CALL) | (1L << CHARACTER) | (1L << COFUNCTION) | (1L << COLD) | (1L << COROUTINE) | (1L << DECIMAL) | (1L << DECLARE) | (1L << DEFINE) | (1L << DEFINED) | (1L << ELIF) | (1L << ELSE) | (1L << END) | (1L << ENDLOOP) | (1L << ENTRY) | (1L << ENUM) | (1L << FIXED) | (1L << FLOAT) | (1L << FUNCTION) | (1L << GOTO) | (1L << IF) | (1L << INC) | (1L << INCLUDE) | (1L << INTERNAL) | (1L << INTERRUPT) | (1L << INTRINSIC) | (1L << LANGUAGE) | (1L << LOOP) | (1L << MAIN) | (1L << NAKED) | (1L << NORETURN) | (1L << OFFSET) | (1L << OTHERWISE) | (1L << OUT) | (1L << PAD) | (1L << POINTER) | (1L << PRIVATE) | (1L << PROCEDURE) | (1L << PUBLIC) | (1L << RAW) | (1L << READONLY) | (1L << RECURSIVE) | (1L << REF) | (1L << RELOOP) | (1L << RETAIN) | (1L << RETURN) | (1L << RETURNON) | (1L << RETURNS))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (SCANAS - 64)) | (1L << (SCOPE - 64)) | (1L << (SECTION - 64)) | (1L << (SELECT - 64)) | (1L << (SINGLET - 64)) | (1L << (STACK - 64)) | (1L << (STATIC - 64)) | (1L << (STRING - 64)) | (1L << (STRUCTURE - 64)) | (1L << (THEN - 64)) | (1L << (TO - 64)) | (1L << (TRAITS - 64)) | (1L << (TYPE - 64)) | (1L << (UNALIGNED - 64)) | (1L << (UNTIL - 64)) | (1L << (USES - 64)) | (1L << (USING - 64)) | (1L << (UTF - 64)) | (1L << (VARIABLE - 64)) | (1L << (VARYING - 64)) | (1L << (WHEN - 64)) | (1L << (WHILE - 64)) | (1L << (YIELD - 64)))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				match(IDENTIFIER);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 35:
			return reference_sempred((ReferenceContext)_localctx, predIndex);
		case 52:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean reference_sempred(ReferenceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b1\u0518\4\2\t"+
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
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\3\2\5\2\u00fe\n\2\3\2\7"+
		"\2\u0101\n\2\f\2\16\2\u0104\13\2\3\2\3\2\3\2\7\2\u0109\n\2\f\2\16\2\u010c"+
		"\13\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3\u0114\n\3\f\3\16\3\u0117\13\3\3\4\3"+
		"\4\3\4\3\4\7\4\u011d\n\4\f\4\16\4\u0120\13\4\3\4\3\4\3\5\3\5\3\5\3\5\7"+
		"\5\u0128\n\5\f\5\16\5\u012b\13\5\3\5\5\5\u012e\n\5\3\6\3\6\5\6\u0132\n"+
		"\6\3\7\3\7\3\b\3\b\7\b\u0138\n\b\f\b\16\b\u013b\13\b\3\b\3\b\3\t\3\t\3"+
		"\t\5\t\u0142\n\t\3\n\3\n\5\n\u0146\n\n\3\13\3\13\3\13\3\13\3\13\7\13\u014d"+
		"\n\13\f\13\16\13\u0150\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\5\f\u015c\n\f\3\f\5\f\u015f\n\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\7"+
		"\16\u0169\n\16\f\16\16\16\u016c\13\16\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\5\17\u0175\n\17\3\20\3\20\3\20\7\20\u017a\n\20\f\20\16\20\u017d\13"+
		"\20\3\20\3\20\3\20\3\20\3\20\5\20\u0184\n\20\3\20\3\20\3\20\3\20\7\20"+
		"\u018a\n\20\f\20\16\20\u018d\13\20\3\20\3\20\5\20\u0191\n\20\3\21\3\21"+
		"\3\21\3\21\3\22\3\22\5\22\u0199\n\22\3\22\7\22\u019c\n\22\f\22\16\22\u019f"+
		"\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\5\23\u01a8\n\23\3\23\3\23\3"+
		"\24\3\24\3\24\7\24\u01af\n\24\f\24\16\24\u01b2\13\24\3\24\3\24\3\25\3"+
		"\25\3\25\5\25\u01b9\n\25\3\25\5\25\u01bc\n\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u01c3\n\25\3\26\3\26\3\26\5\26\u01c8\n\26\3\26\3\26\5\26\u01cc\n"+
		"\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u01d8\n\30"+
		"\3\31\3\31\3\31\3\31\5\31\u01de\n\31\3\32\3\32\5\32\u01e2\n\32\3\33\3"+
		"\33\5\33\u01e6\n\33\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u01f4\n\36\3\37\3\37\3\37\3\37\3\37\5\37\u01fb\n\37\3"+
		" \3 \5 \u01ff\n \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\""+
		"\u020e\n\"\3#\3#\3$\3$\3$\3$\3%\3%\3%\5%\u0219\n%\3%\3%\3%\3%\5%\u021f"+
		"\n%\7%\u0221\n%\f%\16%\u0224\13%\3&\3&\5&\u0228\n&\3&\3&\3\'\6\'\u022d"+
		"\n\'\r\'\16\'\u022e\3(\5(\u0232\n(\3(\3(\3)\3)\5)\u0238\n)\3)\3)\3*\6"+
		"*\u023d\n*\r*\16*\u023e\3+\3+\3,\3,\3,\7,\u0246\n,\f,\16,\u0249\13,\3"+
		"-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3"+
		"-\3-\3-\3-\3-\5-\u0267\n-\3.\3.\3.\5.\u026c\n.\3/\3/\3/\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\3\66\3\66\3\66"+
		"\3\66\3\66\3\66\5\66\u0285\n\66\5\66\u0287\n\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3"+
		"\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u02b5"+
		"\n\66\7\66\u02b7\n\66\f\66\16\66\u02ba\13\66\3\67\3\67\3\67\5\67\u02bf"+
		"\n\67\3\67\3\67\3\67\5\67\u02c4\n\67\7\67\u02c6\n\67\f\67\16\67\u02c9"+
		"\13\67\3\67\3\67\3\67\3\67\6\67\u02cf\n\67\r\67\16\67\u02d0\3\67\3\67"+
		"\3\67\3\67\5\67\u02d7\n\67\38\38\38\38\38\38\38\38\39\39\3:\3:\3;\3;\3"+
		"<\3<\3<\3=\3=\3=\3=\3=\3=\3=\3=\5=\u02f2\n=\3>\3>\5>\u02f6\n>\3?\3?\5"+
		"?\u02fa\n?\3@\3@\3@\5@\u02ff\n@\3@\3@\3@\3@\5@\u0305\n@\3A\3A\3A\5A\u030a"+
		"\nA\3B\3B\3B\3C\5C\u0310\nC\3C\3C\3D\3D\3D\3D\3E\3E\3E\5E\u031b\nE\3E"+
		"\3E\5E\u031f\nE\3F\3F\3F\7F\u0324\nF\fF\16F\u0327\13F\3G\3G\3H\3H\3I\3"+
		"I\5I\u032f\nI\3I\5I\u0332\nI\3I\3I\5I\u0336\nI\3I\5I\u0339\nI\3I\3I\5"+
		"I\u033d\nI\3I\5I\u0340\nI\3I\3I\5I\u0344\nI\3I\5I\u0347\nI\3I\3I\5I\u034b"+
		"\nI\3I\5I\u034e\nI\3I\3I\5I\u0352\nI\3I\5I\u0355\nI\5I\u0357\nI\3J\3J"+
		"\3J\3J\5J\u035d\nJ\3K\5K\u0360\nK\3K\3K\5K\u0364\nK\3K\5K\u0367\nK\3K"+
		"\3K\5K\u036b\nK\3K\3K\5K\u036f\nK\3K\5K\u0372\nK\3K\3K\5K\u0376\nK\3K"+
		"\5K\u0379\nK\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\3K\5K\u0389\nK\3L"+
		"\3L\3M\3M\5M\u038f\nM\3M\5M\u0392\nM\3M\3M\5M\u0396\nM\3M\5M\u0399\nM"+
		"\3M\3M\5M\u039d\nM\3M\5M\u03a0\nM\3M\3M\5M\u03a4\nM\3M\5M\u03a7\nM\3M"+
		"\3M\5M\u03ab\nM\3M\5M\u03ae\nM\3M\3M\5M\u03b2\nM\3M\5M\u03b5\nM\5M\u03b7"+
		"\nM\3N\3N\3N\3N\3N\3O\3O\3O\3O\5O\u03c2\nO\3O\3O\3P\3P\5P\u03c8\nP\3Q"+
		"\3Q\5Q\u03cc\nQ\3R\3R\3R\3R\5R\u03d2\nR\5R\u03d4\nR\3R\3R\3S\3S\3S\5S"+
		"\u03db\nS\3S\3S\3T\3T\3T\3T\3T\5T\u03e4\nT\3U\3U\3U\3U\3U\5U\u03eb\nU"+
		"\3V\3V\3W\3W\3X\3X\3X\3X\7X\u03f5\nX\fX\16X\u03f8\13X\3X\3X\3Y\3Y\3Y\3"+
		"Y\3Y\5Y\u0401\nY\3Z\3Z\7Z\u0405\nZ\fZ\16Z\u0408\13Z\3Z\5Z\u040b\nZ\3Z"+
		"\3Z\3Z\3Z\7Z\u0411\nZ\fZ\16Z\u0414\13Z\3Z\6Z\u0417\nZ\rZ\16Z\u0418\3Z"+
		"\3Z\5Z\u041d\nZ\3[\3[\5[\u0421\n[\3\\\3\\\3\\\3\\\3]\3]\7]\u0429\n]\f"+
		"]\16]\u042c\13]\3^\3^\3^\3^\7^\u0432\n^\f^\16^\u0435\13^\3^\5^\u0438\n"+
		"^\3_\3_\7_\u043c\n_\f_\16_\u043f\13_\3_\3_\3_\3_\5_\u0445\n_\3_\7_\u0448"+
		"\n_\f_\16_\u044b\13_\3_\3_\5_\u044f\n_\3`\3`\5`\u0453\n`\3a\3a\5a\u0457"+
		"\na\3b\3b\5b\u045b\nb\3c\3c\3c\3c\3c\3d\3d\3d\3d\3d\3e\3e\7e\u0469\ne"+
		"\fe\16e\u046c\13e\3e\5e\u046f\ne\3e\3e\3f\3f\5f\u0475\nf\3g\3g\3g\3g\3"+
		"g\5g\u047c\ng\3h\3h\5h\u0480\nh\3h\3h\3h\3h\7h\u0486\nh\fh\16h\u0489\13"+
		"h\3h\3h\7h\u048d\nh\fh\16h\u0490\13h\3i\3i\7i\u0494\ni\fi\16i\u0497\13"+
		"i\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\3j\5j\u04a5\nj\3k\3k\3k\3k\3k\5k\u04ac"+
		"\nk\3k\3k\3k\5k\u04b1\nk\3l\3l\3l\3m\3m\3m\3m\3m\3n\3n\3n\3n\3n\3o\3o"+
		"\3o\3o\3o\3p\3p\3p\3p\3p\3q\3q\3q\5q\u04cd\nq\3q\3q\3q\5q\u04d2\nq\7q"+
		"\u04d4\nq\fq\16q\u04d7\13q\3r\3r\3r\5r\u04dc\nr\3s\3s\3s\3s\5s\u04e2\n"+
		"s\3t\3t\3u\3u\7u\u04e8\nu\fu\16u\u04eb\13u\3v\3v\5v\u04ef\nv\3v\3v\3v"+
		"\3v\5v\u04f5\nv\3w\3w\3w\5w\u04fa\nw\3w\3w\3w\3w\5w\u0500\nw\3x\3x\3y"+
		"\3y\3y\3y\5y\u0508\ny\3z\3z\3{\3{\3|\3|\5|\u0510\n|\3}\3}\3~\3~\5~\u0516"+
		"\n~\3~\2\4Hj\177\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088"+
		"\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0"+
		"\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8"+
		"\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0"+
		"\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8"+
		"\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\2\23\7\2deggls"+
		"yy\u00a0\u00a0\3\2st\3\2\u0098\u009c\3\2wx\4\2uv\u0088\u0088\4\2\u0089"+
		"\u0089\u008b\u008b\3\2\u008d\u008e\5\2\u0080\u0080\u008a\u008a\u008c\u008c"+
		"\4\2wx\u0080\u0080\4\2ss\u0081\u0087\3\2\u0098\u009a\4\2\b\b\31\31\3\2"+
		"\"#\4\2\25\25\27\27\3\2\6\7\3\2\\^\3\2\3X\2\u0580\2\u00fd\3\2\2\2\4\u010f"+
		"\3\2\2\2\6\u0118\3\2\2\2\b\u0123\3\2\2\2\n\u012f\3\2\2\2\f\u0133\3\2\2"+
		"\2\16\u0135\3\2\2\2\20\u013e\3\2\2\2\22\u0143\3\2\2\2\24\u0147\3\2\2\2"+
		"\26\u015e\3\2\2\2\30\u0160\3\2\2\2\32\u0165\3\2\2\2\34\u0174\3\2\2\2\36"+
		"\u0190\3\2\2\2 \u0192\3\2\2\2\"\u0196\3\2\2\2$\u01a2\3\2\2\2&\u01ab\3"+
		"\2\2\2(\u01b5\3\2\2\2*\u01c4\3\2\2\2,\u01cd\3\2\2\2.\u01d7\3\2\2\2\60"+
		"\u01dd\3\2\2\2\62\u01df\3\2\2\2\64\u01e3\3\2\2\2\66\u01e7\3\2\2\28\u01ec"+
		"\3\2\2\2:\u01ee\3\2\2\2<\u01fa\3\2\2\2>\u01fe\3\2\2\2@\u0200\3\2\2\2B"+
		"\u020d\3\2\2\2D\u020f\3\2\2\2F\u0211\3\2\2\2H\u0215\3\2\2\2J\u0225\3\2"+
		"\2\2L\u022c\3\2\2\2N\u0231\3\2\2\2P\u0235\3\2\2\2R\u023c\3\2\2\2T\u0240"+
		"\3\2\2\2V\u0242\3\2\2\2X\u0266\3\2\2\2Z\u026b\3\2\2\2\\\u026d\3\2\2\2"+
		"^\u0270\3\2\2\2`\u0272\3\2\2\2b\u0274\3\2\2\2d\u0276\3\2\2\2f\u0278\3"+
		"\2\2\2h\u027a\3\2\2\2j\u0286\3\2\2\2l\u02ce\3\2\2\2n\u02d8\3\2\2\2p\u02e0"+
		"\3\2\2\2r\u02e2\3\2\2\2t\u02e4\3\2\2\2v\u02e6\3\2\2\2x\u02f1\3\2\2\2z"+
		"\u02f3\3\2\2\2|\u02f7\3\2\2\2~\u0304\3\2\2\2\u0080\u0306\3\2\2\2\u0082"+
		"\u030b\3\2\2\2\u0084\u030f\3\2\2\2\u0086\u0313\3\2\2\2\u0088\u031e\3\2"+
		"\2\2\u008a\u0320\3\2\2\2\u008c\u0328\3\2\2\2\u008e\u032a\3\2\2\2\u0090"+
		"\u0356\3\2\2\2\u0092\u035c\3\2\2\2\u0094\u0388\3\2\2\2\u0096\u038a\3\2"+
		"\2\2\u0098\u03b6\3\2\2\2\u009a\u03b8\3\2\2\2\u009c\u03bd\3\2\2\2\u009e"+
		"\u03c7\3\2\2\2\u00a0\u03cb\3\2\2\2\u00a2\u03cd\3\2\2\2\u00a4\u03d7\3\2"+
		"\2\2\u00a6\u03de\3\2\2\2\u00a8\u03e5\3\2\2\2\u00aa\u03ec\3\2\2\2\u00ac"+
		"\u03ee\3\2\2\2\u00ae\u03f0\3\2\2\2\u00b0\u03fb\3\2\2\2\u00b2\u041c\3\2"+
		"\2\2\u00b4\u041e\3\2\2\2\u00b6\u0422\3\2\2\2\u00b8\u0426\3\2\2\2\u00ba"+
		"\u042d\3\2\2\2\u00bc\u044e\3\2\2\2\u00be\u0450\3\2\2\2\u00c0\u0454\3\2"+
		"\2\2\u00c2\u0458\3\2\2\2\u00c4\u045c\3\2\2\2\u00c6\u0461\3\2\2\2\u00c8"+
		"\u0466\3\2\2\2\u00ca\u0472\3\2\2\2\u00cc\u0476\3\2\2\2\u00ce\u047d\3\2"+
		"\2\2\u00d0\u0491\3\2\2\2\u00d2\u04a4\3\2\2\2\u00d4\u04a6\3\2\2\2\u00d6"+
		"\u04b2\3\2\2\2\u00d8\u04b5\3\2\2\2\u00da\u04ba\3\2\2\2\u00dc\u04bf\3\2"+
		"\2\2\u00de\u04c4\3\2\2\2\u00e0\u04c9\3\2\2\2\u00e2\u04db\3\2\2\2\u00e4"+
		"\u04dd\3\2\2\2\u00e6\u04e3\3\2\2\2\u00e8\u04e5\3\2\2\2\u00ea\u04ec\3\2"+
		"\2\2\u00ec\u04ff\3\2\2\2\u00ee\u0501\3\2\2\2\u00f0\u0507\3\2\2\2\u00f2"+
		"\u0509\3\2\2\2\u00f4\u050b\3\2\2\2\u00f6\u050f\3\2\2\2\u00f8\u0511\3\2"+
		"\2\2\u00fa\u0515\3\2\2\2\u00fc\u00fe\7_\2\2\u00fd\u00fc\3\2\2\2\u00fd"+
		"\u00fe\3\2\2\2\u00fe\u0102\3\2\2\2\u00ff\u0101\5\4\3\2\u0100\u00ff\3\2"+
		"\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103"+
		"\u010a\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0109\5\6\4\2\u0106\u0109\5\16"+
		"\b\2\u0107\u0109\5<\37\2\u0108\u0105\3\2\2\2\u0108\u0106\3\2\2\2\u0108"+
		"\u0107\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010d\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u010e\7\2\2\3\u010e"+
		"\3\3\2\2\2\u010f\u0110\7Q\2\2\u0110\u0115\5\u00fa~\2\u0111\u0112\7k\2"+
		"\2\u0112\u0114\5\u00fa~\2\u0113\u0111\3\2\2\2\u0114\u0117\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\5\3\2\2\2\u0117\u0115\3\2\2\2"+
		"\u0118\u011e\5\b\5\2\u0119\u011d\5\6\4\2\u011a\u011d\5\16\b\2\u011b\u011d"+
		"\5<\37\2\u011c\u0119\3\2\2\2\u011c\u011a\3\2\2\2\u011c\u011b\3\2\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2"+
		"\2\2\u0120\u011e\3\2\2\2\u0121\u0122\5\n\6\2\u0122\7\3\2\2\2\u0123\u0124"+
		"\7C\2\2\u0124\u0129\5\u00fa~\2\u0125\u0126\7k\2\2\u0126\u0128\5\u00fa"+
		"~\2\u0127\u0125\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2\2\2\u0129"+
		"\u012a\3\2\2\2\u012a\u012d\3\2\2\2\u012b\u0129\3\2\2\2\u012c\u012e\7\66"+
		"\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e\t\3\2\2\2\u012f\u0131"+
		"\7\36\2\2\u0130\u0132\7C\2\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\13\3\2\2\2\u0133\u0134\t\2\2\2\u0134\r\3\2\2\2\u0135\u0139\5\20\t\2\u0136"+
		"\u0138\5<\37\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2\2\2\u013c"+
		"\u013d\5\22\n\2\u013d\17\3\2\2\2\u013e\u0141\7M\2\2\u013f\u0142\5\24\13"+
		"\2\u0140\u0142\5\30\r\2\u0141\u013f\3\2\2\2\u0141\u0140\3\2\2\2\u0142"+
		"\21\3\2\2\2\u0143\u0145\7\36\2\2\u0144\u0146\7M\2\2\u0145\u0144\3\2\2"+
		"\2\u0145\u0146\3\2\2\2\u0146\23\3\2\2\2\u0147\u0148\7\31\2\2\u0148\u0149"+
		"\7m\2\2\u0149\u014e\5\26\f\2\u014a\u014b\7l\2\2\u014b\u014d\5\26\f\2\u014c"+
		"\u014a\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2"+
		"\2\2\u014f\u0151\3\2\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7n\2\2\u0152"+
		"\25\3\2\2\2\u0153\u0154\7D\2\2\u0154\u0155\7m\2\2\u0155\u0156\7^\2\2\u0156"+
		"\u015f\7n\2\2\u0157\u015b\7\5\2\2\u0158\u0159\7m\2\2\u0159\u015a\7d\2"+
		"\2\u015a\u015c\7n\2\2\u015b\u0158\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015f"+
		"\3\2\2\2\u015d\u015f\7>\2\2\u015e\u0153\3\2\2\2\u015e\u0157\3\2\2\2\u015e"+
		"\u015d\3\2\2\2\u015f\27\3\2\2\2\u0160\u0161\7\67\2\2\u0161\u0162\7m\2"+
		"\2\u0162\u0163\5\32\16\2\u0163\u0164\7n\2\2\u0164\31\3\2\2\2\u0165\u016a"+
		"\5\34\17\2\u0166\u0167\7l\2\2\u0167\u0169\5\34\17\2\u0168\u0166\3\2\2"+
		"\2\u0169\u016c\3\2\2\2\u016a\u0168\3\2\2\2\u016a\u016b\3\2\2\2\u016b\33"+
		"\3\2\2\2\u016c\u016a\3\2\2\2\u016d\u0175\7\26\2\2\u016e\u0175\7/\2\2\u016f"+
		"\u0170\7D\2\2\u0170\u0171\7m\2\2\u0171\u0172\7^\2\2\u0172\u0175\7n\2\2"+
		"\u0173\u0175\7>\2\2\u0174\u016d\3\2\2\2\u0174\u016e\3\2\2\2\u0174\u016f"+
		"\3\2\2\2\u0174\u0173\3\2\2\2\u0175\35\3\2\2\2\u0176\u017b\5(\25\2\u0177"+
		"\u017a\5<\37\2\u0178\u017a\5B\"\2\u0179\u0177\3\2\2\2\u0179\u0178\3\2"+
		"\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c"+
		"\u017e\3\2\2\2\u017d\u017b\3\2\2\2\u017e\u017f\5\62\32\2\u017f\u0191\3"+
		"\2\2\2\u0180\u0181\7\67\2\2\u0181\u0183\5\u00fa~\2\u0182\u0184\5\u00ae"+
		"X\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\7+\2\2\u0186\u018b\5 \21\2\u0187\u018a\5<\37\2\u0188\u018a\5\""+
		"\22\2\u0189\u0187\3\2\2\2\u0189\u0188\3\2\2\2\u018a\u018d\3\2\2\2\u018b"+
		"\u0189\3\2\2\2\u018b\u018c\3\2\2\2\u018c\u018e\3\2\2\2\u018d\u018b\3\2"+
		"\2\2\u018e\u018f\7\36\2\2\u018f\u0191\3\2\2\2\u0190\u0176\3\2\2\2\u0190"+
		"\u0180\3\2\2\2\u0191\37\3\2\2\2\u0192\u0193\7m\2\2\u0193\u0194\5\u00fa"+
		"~\2\u0194\u0195\7n\2\2\u0195!\3\2\2\2\u0196\u0198\7\n\2\2\u0197\u0199"+
		"\5$\23\2\u0198\u0197\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019d\3\2\2\2\u019a"+
		"\u019c\5> \2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b\3\2\2"+
		"\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0\u01a1"+
		"\7\36\2\2\u01a1#\3\2\2\2\u01a2\u01a7\7m\2\2\u01a3\u01a4\7D\2\2\u01a4\u01a5"+
		"\7m\2\2\u01a5\u01a6\7^\2\2\u01a6\u01a8\7n\2\2\u01a7\u01a3\3\2\2\2\u01a7"+
		"\u01a8\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\7n\2\2\u01aa%\3\2\2\2\u01ab"+
		"\u01b0\5*\26\2\u01ac\u01af\5<\37\2\u01ad\u01af\5B\"\2\u01ae\u01ac\3\2"+
		"\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b4\5\64"+
		"\33\2\u01b4\'\3\2\2\2\u01b5\u01b6\7\67\2\2\u01b6\u01b8\5\u00fa~\2\u01b7"+
		"\u01b9\5\u00aeX\2\u01b8\u01b7\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01bb"+
		"\3\2\2\2\u01ba\u01bc\5.\30\2\u01bb\u01ba\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01c2\3\2\2\2\u01bd\u01be\7M\2\2\u01be\u01bf\7m\2\2\u01bf\u01c0\5\32"+
		"\16\2\u01c0\u01c1\7n\2\2\u01c1\u01c3\3\2\2\2\u01c2\u01bd\3\2\2\2\u01c2"+
		"\u01c3\3\2\2\2\u01c3)\3\2\2\2\u01c4\u01c5\7$\2\2\u01c5\u01c7\5\u00fa~"+
		"\2\u01c6\u01c8\5\u00aeX\2\u01c7\u01c6\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8"+
		"\u01c9\3\2\2\2\u01c9\u01cb\5\66\34\2\u01ca\u01cc\5\60\31\2\u01cb\u01ca"+
		"\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc+\3\2\2\2\u01cd\u01ce\7m\2\2\u01ce\u01cf"+
		"\5\u00fa~\2\u01cf\u01d0\7n\2\2\u01d0-\3\2\2\2\u01d1\u01d8\7.\2\2\u01d2"+
		"\u01d3\7+\2\2\u01d3\u01d8\5,\27\2\u01d4\u01d8\7;\2\2\u01d5\u01d8\7*\2"+
		"\2\u01d6\u01d8\7\27\2\2\u01d7\u01d1\3\2\2\2\u01d7\u01d2\3\2\2\2\u01d7"+
		"\u01d4\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d6\3\2\2\2\u01d8/\3\2\2\2"+
		"\u01d9\u01da\7+\2\2\u01da\u01de\5,\27\2\u01db\u01de\7;\2\2\u01dc\u01de"+
		"\7\25\2\2\u01dd\u01d9\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01dc\3\2\2\2"+
		"\u01de\61\3\2\2\2\u01df\u01e1\7\36\2\2\u01e0\u01e2\7\67\2\2\u01e1\u01e0"+
		"\3\2\2\2\u01e1\u01e2\3\2\2\2\u01e2\63\3\2\2\2\u01e3\u01e5\7\36\2\2\u01e4"+
		"\u01e6\7$\2\2\u01e5\u01e4\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\65\3\2\2\2"+
		"\u01e7\u01e8\7A\2\2\u01e8\u01e9\7m\2\2\u01e9\u01ea\5\u0094K\2\u01ea\u01eb"+
		"\7n\2\2\u01eb\67\3\2\2\2\u01ec\u01ed\7y\2\2\u01ed9\3\2\2\2\u01ee\u01f3"+
		"\7`\2\2\u01ef\u01f0\7m\2\2\u01f0\u01f1\5\u00f6|\2\u01f1\u01f2\7n\2\2\u01f2"+
		"\u01f4\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4;\3\2\2\2"+
		"\u01f5\u01fb\5~@\2\u01f6\u01fb\5\u00d2j\2\u01f7\u01fb\5\36\20\2\u01f8"+
		"\u01fb\5&\24\2\u01f9\u01fb\5D#\2\u01fa\u01f5\3\2\2\2\u01fa\u01f6\3\2\2"+
		"\2\u01fa\u01f7\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01f9\3\2\2\2\u01fb="+
		"\3\2\2\2\u01fc\u01ff\5\f\7\2\u01fd\u01ff\5D#\2\u01fe\u01fc\3\2\2\2\u01fe"+
		"\u01fd\3\2\2\2\u01ff?\3\2\2\2\u0200\u0201\7\u00aa\2\2\u0201A\3\2\2\2\u0202"+
		"\u020e\5:\36\2\u0203\u020e\5F$\2\u0204\u020e\5v<\2\u0205\u020e\5x=\2\u0206"+
		"\u020e\5\u00b0Y\2\u0207\u020e\5\u00b2Z\2\u0208\u020e\5\u00bc_\2\u0209"+
		"\u020e\5\u00c8e\2\u020a\u020e\5z>\2\u020b\u020e\5|?\2\u020c\u020e\5D#"+
		"\2\u020d\u0202\3\2\2\2\u020d\u0203\3\2\2\2\u020d\u0204\3\2\2\2\u020d\u0205"+
		"\3\2\2\2\u020d\u0206\3\2\2\2\u020d\u0207\3\2\2\2\u020d\u0208\3\2\2\2\u020d"+
		"\u0209\3\2\2\2\u020d\u020a\3\2\2\2\u020d\u020b\3\2\2\2\u020d\u020c\3\2"+
		"\2\2\u020eC\3\2\2\2\u020f\u0210\7y\2\2\u0210E\3\2\2\2\u0211\u0212\5H%"+
		"\2\u0212\u0213\t\3\2\2\u0213\u0214\5j\66\2\u0214G\3\2\2\2\u0215\u0216"+
		"\b%\1\2\u0216\u0218\5N(\2\u0217\u0219\5L\'\2\u0218\u0217\3\2\2\2\u0218"+
		"\u0219\3\2\2\2\u0219\u0222\3\2\2\2\u021a\u021b\f\4\2\2\u021b\u021c\7i"+
		"\2\2\u021c\u021e\5N(\2\u021d\u021f\5L\'\2\u021e\u021d\3\2\2\2\u021e\u021f"+
		"\3\2\2\2\u021f\u0221\3\2\2\2\u0220\u021a\3\2\2\2\u0221\u0224\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223I\3\2\2\2\u0224\u0222\3\2\2\2"+
		"\u0225\u0227\7m\2\2\u0226\u0228\5V,\2\u0227\u0226\3\2\2\2\u0227\u0228"+
		"\3\2\2\2\u0228\u0229\3\2\2\2\u0229\u022a\7n\2\2\u022aK\3\2\2\2\u022b\u022d"+
		"\5J&\2\u022c\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\u022c\3\2\2\2\u022e"+
		"\u022f\3\2\2\2\u022fM\3\2\2\2\u0230\u0232\5R*\2\u0231\u0230\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\5\u00fa~\2\u0234O\3\2\2"+
		"\2\u0235\u0237\5\u00fa~\2\u0236\u0238\5J&\2\u0237\u0236\3\2\2\2\u0237"+
		"\u0238\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023a\7k\2\2\u023aQ\3\2\2\2\u023b"+
		"\u023d\5P)\2\u023c\u023b\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023c\3\2\2"+
		"\2\u023e\u023f\3\2\2\2\u023fS\3\2\2\2\u0240\u0241\5j\66\2\u0241U\3\2\2"+
		"\2\u0242\u0247\5T+\2\u0243\u0244\7l\2\2\u0244\u0246\5T+\2\u0245\u0243"+
		"\3\2\2\2\u0246\u0249\3\2\2\2\u0247\u0245\3\2\2\2\u0247\u0248\3\2\2\2\u0248"+
		"W\3\2\2\2\u0249\u0247\3\2\2\2\u024a\u024b\7m\2\2\u024b\u024c\5j\66\2\u024c"+
		"\u024d\7n\2\2\u024d\u0267\3\2\2\2\u024e\u024f\7\u008f\2\2\u024f\u0250"+
		"\5j\66\2\u0250\u0251\7n\2\2\u0251\u0267\3\2\2\2\u0252\u0253\7\u0090\2"+
		"\2\u0253\u0254\5j\66\2\u0254\u0255\7n\2\2\u0255\u0267\3\2\2\2\u0256\u0257"+
		"\7\u0093\2\2\u0257\u0258\5j\66\2\u0258\u0259\7n\2\2\u0259\u0267\3\2\2"+
		"\2\u025a\u025b\7\u0091\2\2\u025b\u025c\5j\66\2\u025c\u025d\7n\2\2\u025d"+
		"\u0267\3\2\2\2\u025e\u025f\7\u0092\2\2\u025f\u0260\5j\66\2\u0260\u0261"+
		"\7n\2\2\u0261\u0267\3\2\2\2\u0262\u0263\7\u0094\2\2\u0263\u0264\5j\66"+
		"\2\u0264\u0265\7n\2\2\u0265\u0267\3\2\2\2\u0266\u024a\3\2\2\2\u0266\u024e"+
		"\3\2\2\2\u0266\u0252\3\2\2\2\u0266\u0256\3\2\2\2\u0266\u025a\3\2\2\2\u0266"+
		"\u025e\3\2\2\2\u0266\u0262\3\2\2\2\u0267Y\3\2\2\2\u0268\u026c\5\u00f0"+
		"y\2\u0269\u026c\5\u00eex\2\u026a\u026c\5H%\2\u026b\u0268\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026b\u026a\3\2\2\2\u026c[\3\2\2\2\u026d\u026e\5p9\2\u026e"+
		"\u026f\5j\66\2\u026f]\3\2\2\2\u0270\u0271\t\4\2\2\u0271_\3\2\2\2\u0272"+
		"\u0273\t\5\2\2\u0273a\3\2\2\2\u0274\u0275\t\6\2\2\u0275c\3\2\2\2\u0276"+
		"\u0277\t\7\2\2\u0277e\3\2\2\2\u0278\u0279\t\b\2\2\u0279g\3\2\2\2\u027a"+
		"\u027b\t\t\2\2\u027bi\3\2\2\2\u027c\u027d\b\66\1\2\u027d\u0287\5Z.\2\u027e"+
		"\u0287\5X-\2\u027f\u0287\5\\/\2\u0280\u0281\5J&\2\u0281\u0284\7j\2\2\u0282"+
		"\u0285\5l\67\2\u0283\u0285\5n8\2\u0284\u0282\3\2\2\2\u0284\u0283\3\2\2"+
		"\2\u0285\u0287\3\2\2\2\u0286\u027c\3\2\2\2\u0286\u027e\3\2\2\2\u0286\u027f"+
		"\3\2\2\2\u0286\u0280\3\2\2\2\u0287\u02b8\3\2\2\2\u0288\u0289\f\17\2\2"+
		"\u0289\u028a\7z\2\2\u028a\u02b7\5j\66\17\u028b\u028c\f\16\2\2\u028c\u028d"+
		"\5b\62\2\u028d\u028e\5j\66\17\u028e\u02b7\3\2\2\2\u028f\u0290\f\r\2\2"+
		"\u0290\u0291\5`\61\2\u0291\u0292\5j\66\16\u0292\u02b7\3\2\2\2\u0293\u0294"+
		"\f\f\2\2\u0294\u0295\5^\60\2\u0295\u0296\5j\66\r\u0296\u02b7\3\2\2\2\u0297"+
		"\u0298\f\13\2\2\u0298\u0299\7\u0097\2\2\u0299\u02b7\5j\66\f\u029a\u029b"+
		"\f\n\2\2\u029b\u029c\5r:\2\u029c\u029d\5j\66\13\u029d\u02b7\3\2\2\2\u029e"+
		"\u029f\f\t\2\2\u029f\u02a0\5d\63\2\u02a0\u02a1\5j\66\n\u02a1\u02b7\3\2"+
		"\2\2\u02a2\u02a3\f\b\2\2\u02a3\u02a4\5f\64\2\u02a4\u02a5\5j\66\t\u02a5"+
		"\u02b7\3\2\2\2\u02a6\u02a7\f\7\2\2\u02a7\u02a8\5h\65\2\u02a8\u02a9\5j"+
		"\66\b\u02a9\u02b7\3\2\2\2\u02aa\u02ab\f\6\2\2\u02ab\u02ac\7\u0095\2\2"+
		"\u02ac\u02b7\5j\66\7\u02ad\u02ae\f\5\2\2\u02ae\u02af\7\u0096\2\2\u02af"+
		"\u02b7\5j\66\6\u02b0\u02b1\f\4\2\2\u02b1\u02b4\7j\2\2\u02b2\u02b5\5l\67"+
		"\2\u02b3\u02b5\5n8\2\u02b4\u02b2\3\2\2\2\u02b4\u02b3\3\2\2\2\u02b5\u02b7"+
		"\3\2\2\2\u02b6\u0288\3\2\2\2\u02b6\u028b\3\2\2\2\u02b6\u028f\3\2\2\2\u02b6"+
		"\u0293\3\2\2\2\u02b6\u0297\3\2\2\2\u02b6\u029a\3\2\2\2\u02b6\u029e\3\2"+
		"\2\2\u02b6\u02a2\3\2\2\2\u02b6\u02a6\3\2\2\2\u02b6\u02aa\3\2\2\2\u02b6"+
		"\u02ad\3\2\2\2\u02b6\u02b0\3\2\2\2\u02b7\u02ba\3\2\2\2\u02b8\u02b6\3\2"+
		"\2\2\u02b8\u02b9\3\2\2\2\u02b9k\3\2\2\2\u02ba\u02b8\3\2\2\2\u02bb\u02be"+
		"\7m\2\2\u02bc\u02bf\5j\66\2\u02bd\u02bf\5J&\2\u02be\u02bc\3\2\2\2\u02be"+
		"\u02bd\3\2\2\2\u02bf\u02c7\3\2\2\2\u02c0\u02c3\7l\2\2\u02c1\u02c4\5j\66"+
		"\2\u02c2\u02c4\5J&\2\u02c3\u02c1\3\2\2\2\u02c3\u02c2\3\2\2\2\u02c4\u02c6"+
		"\3\2\2\2\u02c5\u02c0\3\2\2\2\u02c6\u02c9\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c7"+
		"\u02c8\3\2\2\2\u02c8\u02ca\3\2\2\2\u02c9\u02c7\3\2\2\2\u02ca\u02cb\7{"+
		"\2\2\u02cb\u02cc\5j\66\2\u02cc\u02cd\7n\2\2\u02cd\u02cf\3\2\2\2\u02ce"+
		"\u02bb\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02ce\3\2\2\2\u02d0\u02d1\3\2"+
		"\2\2\u02d1\u02d6\3\2\2\2\u02d2\u02d3\7m\2\2\u02d3\u02d4\5j\66\2\u02d4"+
		"\u02d5\7n\2\2\u02d5\u02d7\3\2\2\2\u02d6\u02d2\3\2\2\2\u02d6\u02d7\3\2"+
		"\2\2\u02d7m\3\2\2\2\u02d8\u02d9\7m\2\2\u02d9\u02da\5j\66\2\u02da\u02db"+
		"\7n\2\2\u02db\u02dc\3\2\2\2\u02dc\u02dd\7m\2\2\u02dd\u02de\5j\66\2\u02de"+
		"\u02df\7n\2\2\u02dfo\3\2\2\2\u02e0\u02e1\t\n\2\2\u02e1q\3\2\2\2\u02e2"+
		"\u02e3\t\13\2\2\u02e3s\3\2\2\2\u02e4\u02e5\t\f\2\2\u02e5u\3\2\2\2\u02e6"+
		"\u02e7\7\23\2\2\u02e7\u02e8\5H%\2\u02e8w\3\2\2\2\u02e9\u02ea\7%\2\2\u02ea"+
		"\u02eb\5\u00fa~\2\u02eb\u02ec\7m\2\2\u02ec\u02ed\5j\66\2\u02ed\u02ee\7"+
		"n\2\2\u02ee\u02f2\3\2\2\2\u02ef\u02f0\7%\2\2\u02f0\u02f2\5H%\2\u02f1\u02e9"+
		"\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f2y\3\2\2\2\u02f3\u02f5\7\37\2\2\u02f4"+
		"\u02f6\5\u00fa~\2\u02f5\u02f4\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6{\3\2\2"+
		"\2\u02f7\u02f9\7=\2\2\u02f8\u02fa\5\u00fa~\2\u02f9\u02f8\3\2\2\2\u02f9"+
		"\u02fa\3\2\2\2\u02fa}\3\2\2\2\u02fb\u02fc\t\r\2\2\u02fc\u02fe\5\u00fa"+
		"~\2\u02fd\u02ff\5\u0086D\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3\2\2\2\u02ff"+
		"\u0300\3\2\2\2\u0300\u0301\5\u0080A\2\u0301\u0305\3\2\2\2\u0302\u0303"+
		"\t\r\2\2\u0303\u0305\5\u0082B\2\u0304\u02fb\3\2\2\2\u0304\u0302\3\2\2"+
		"\2\u0305\177\3\2\2\2\u0306\u0307\7\t\2\2\u0307\u0309\5\u00fa~\2\u0308"+
		"\u030a\5\u0092J\2\u0309\u0308\3\2\2\2\u0309\u030a\3\2\2\2\u030a\u0081"+
		"\3\2\2\2\u030b\u030c\5\u00fa~\2\u030c\u030d\5\u0084C\2\u030d\u0083\3\2"+
		"\2\2\u030e\u0310\5\u0086D\2\u030f\u030e\3\2\2\2\u030f\u0310\3\2\2\2\u0310"+
		"\u0311\3\2\2\2\u0311\u0312\5\u0090I\2\u0312\u0085\3\2\2\2\u0313\u0314"+
		"\7m\2\2\u0314\u0315\5\u008aF\2\u0315\u0316\7n\2\2\u0316\u0087\3\2\2\2"+
		"\u0317\u0318\5\u008cG\2\u0318\u0319\7{\2\2\u0319\u031b\3\2\2\2\u031a\u0317"+
		"\3\2\2\2\u031a\u031b\3\2\2\2\u031b\u031c\3\2\2\2\u031c\u031f\5\u008eH"+
		"\2\u031d\u031f\7u\2\2\u031e\u031a\3\2\2\2\u031e\u031d\3\2\2\2\u031f\u0089"+
		"\3\2\2\2\u0320\u0325\5\u0088E\2\u0321\u0322\7l\2\2\u0322\u0324\5\u0088"+
		"E\2\u0323\u0321\3\2\2\2\u0324\u0327\3\2\2\2\u0325\u0323\3\2\2\2\u0325"+
		"\u0326\3\2\2\2\u0326\u008b\3\2\2\2\u0327\u0325\3\2\2\2\u0328\u0329\5j"+
		"\66\2\u0329\u008d\3\2\2\2\u032a\u032b\5j\66\2\u032b\u008f\3\2\2\2\u032c"+
		"\u032e\5\u0094K\2\u032d\u032f\5\u0092J\2\u032e\u032d\3\2\2\2\u032e\u032f"+
		"\3\2\2\2\u032f\u0331\3\2\2\2\u0330\u0332\5\u0098M\2\u0331\u0330\3\2\2"+
		"\2\u0331\u0332\3\2\2\2\u0332\u0357\3\2\2\2\u0333\u0335\5\u0094K\2\u0334"+
		"\u0336\5\u0098M\2\u0335\u0334\3\2\2\2\u0335\u0336\3\2\2\2\u0336\u0338"+
		"\3\2\2\2\u0337\u0339\5\u0092J\2\u0338\u0337\3\2\2\2\u0338\u0339\3\2\2"+
		"\2\u0339\u0357\3\2\2\2\u033a\u033c\5\u0092J\2\u033b\u033d\5\u0094K\2\u033c"+
		"\u033b\3\2\2\2\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u0340\5\u0098"+
		"M\2\u033f\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0357\3\2\2\2\u0341"+
		"\u0343\5\u0092J\2\u0342\u0344\5\u0098M\2\u0343\u0342\3\2\2\2\u0343\u0344"+
		"\3\2\2\2\u0344\u0346\3\2\2\2\u0345\u0347\5\u0094K\2\u0346\u0345\3\2\2"+
		"\2\u0346\u0347\3\2\2\2\u0347\u0357\3\2\2\2\u0348\u034a\5\u0098M\2\u0349"+
		"\u034b\5\u0092J\2\u034a\u0349\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d"+
		"\3\2\2\2\u034c\u034e\5\u0094K\2\u034d\u034c\3\2\2\2\u034d\u034e\3\2\2"+
		"\2\u034e\u0357\3\2\2\2\u034f\u0351\5\u0098M\2\u0350\u0352\5\u0094K\2\u0351"+
		"\u0350\3\2\2\2\u0351\u0352\3\2\2\2\u0352\u0354\3\2\2\2\u0353\u0355\5\u0092"+
		"J\2\u0354\u0353\3\2\2\2\u0354\u0355\3\2\2\2\u0355\u0357\3\2\2\2\u0356"+
		"\u032c\3\2\2\2\u0356\u0333\3\2\2\2\u0356\u033a\3\2\2\2\u0356\u0341\3\2"+
		"\2\2\u0356\u0348\3\2\2\2\u0356\u034f\3\2\2\2\u0357\u0091\3\2\2\2\u0358"+
		"\u035d\7G\2\2\u0359\u035d\7H\2\2\u035a\u035d\5\u00a6T\2\u035b\u035d\5"+
		"\u00a8U\2\u035c\u0358\3\2\2\2\u035c\u0359\3\2\2\2\u035c\u035a\3\2\2\2"+
		"\u035c\u035b\3\2\2\2\u035d\u0093\3\2\2\2\u035e\u0360\5\u0096L\2\u035f"+
		"\u035e\3\2\2\2\u035f\u0360\3\2\2\2\u0360\u0361\3\2\2\2\u0361\u0363\7\f"+
		"\2\2\u0362\u0364\5\u009cO\2\u0363\u0362\3\2\2\2\u0363\u0364\3\2\2\2\u0364"+
		"\u0389\3\2\2\2\u0365\u0367\5\u0096L\2\u0366\u0365\3\2\2\2\u0366\u0367"+
		"\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036a\7\30\2\2\u0369\u036b\5\u009c"+
		"O\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2\2\u036b\u0389\3\2\2\2\u036c"+
		"\u036e\7\f\2\2\u036d\u036f\5\u009cO\2\u036e\u036d\3\2\2\2\u036e\u036f"+
		"\3\2\2\2\u036f\u0371\3\2\2\2\u0370\u0372\5\u0096L\2\u0371\u0370\3\2\2"+
		"\2\u0371\u0372\3\2\2\2\u0372\u0389\3\2\2\2\u0373\u0375\7\30\2\2\u0374"+
		"\u0376\5\u009cO\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378"+
		"\3\2\2\2\u0377\u0379\5\u0096L\2\u0378\u0377\3\2\2\2\u0378\u0379\3\2\2"+
		"\2\u0379\u0389\3\2\2\2\u037a\u0389\7\65\2\2\u037b\u037c\7\r\2\2\u037c"+
		"\u0389\5\u00a4S\2\u037d\u0389\7\24\2\2\u037e\u037f\7I\2\2\u037f\u0389"+
		"\5\u00a2R\2\u0380\u0389\7 \2\2\u0381\u0389\7`\2\2\u0382\u0389\7\61\2\2"+
		"\u0383\u0389\7U\2\2\u0384\u0389\7\27\2\2\u0385\u0389\7\25\2\2\u0386\u0389"+
		"\7\20\2\2\u0387\u0389\7+\2\2\u0388\u035f\3\2\2\2\u0388\u0366\3\2\2\2\u0388"+
		"\u036c\3\2\2\2\u0388\u0373\3\2\2\2\u0388\u037a\3\2\2\2\u0388\u037b\3\2"+
		"\2\2\u0388\u037d\3\2\2\2\u0388\u037e\3\2\2\2\u0388\u0380\3\2\2\2\u0388"+
		"\u0381\3\2\2\2\u0388\u0382\3\2\2\2\u0388\u0383\3\2\2\2\u0388\u0384\3\2"+
		"\2\2\u0388\u0385\3\2\2\2\u0388\u0386\3\2\2\2\u0388\u0387\3\2\2\2\u0389"+
		"\u0095\3\2\2\2\u038a\u038b\t\16\2\2\u038b\u0097\3\2\2\2\u038c\u038e\7"+
		">\2\2\u038d\u038f\7.\2\2\u038e\u038d\3\2\2\2\u038e\u038f\3\2\2\2\u038f"+
		"\u0391\3\2\2\2\u0390\u0392\5\u009aN\2\u0391\u0390\3\2\2\2\u0391\u0392"+
		"\3\2\2\2\u0392\u03b7\3\2\2\2\u0393\u0395\7>\2\2\u0394\u0396\5\u009aN\2"+
		"\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u0398\3\2\2\2\u0397\u0399"+
		"\7.\2\2\u0398\u0397\3\2\2\2\u0398\u0399\3\2\2\2\u0399\u03b7\3\2\2\2\u039a"+
		"\u039c\7.\2\2\u039b\u039d\7>\2\2\u039c\u039b\3\2\2\2\u039c\u039d\3\2\2"+
		"\2\u039d\u039f\3\2\2\2\u039e\u03a0\5\u009aN\2\u039f\u039e\3\2\2\2\u039f"+
		"\u03a0\3\2\2\2\u03a0\u03b7\3\2\2\2\u03a1\u03a3\7.\2\2\u03a2\u03a4\5\u009a"+
		"N\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4\u03a6\3\2\2\2\u03a5"+
		"\u03a7\7>\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7\3\2\2\2\u03a7\u03b7\3\2"+
		"\2\2\u03a8\u03aa\5\u009aN\2\u03a9\u03ab\7.\2\2\u03aa\u03a9\3\2\2\2\u03aa"+
		"\u03ab\3\2\2\2\u03ab\u03ad\3\2\2\2\u03ac\u03ae\7>\2\2\u03ad\u03ac\3\2"+
		"\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03b7\3\2\2\2\u03af\u03b1\5\u009aN\2\u03b0"+
		"\u03b2\7>\2\2\u03b1\u03b0\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b4\3\2"+
		"\2\2\u03b3\u03b5\7.\2\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5"+
		"\u03b7\3\2\2\2\u03b6\u038c\3\2\2\2\u03b6\u0393\3\2\2\2\u03b6\u039a\3\2"+
		"\2\2\u03b6\u03a1\3\2\2\2\u03b6\u03a8\3\2\2\2\u03b6\u03af\3\2\2\2\u03b7"+
		"\u0099\3\2\2\2\u03b8\u03b9\7D\2\2\u03b9\u03ba\7m\2\2\u03ba\u03bb\7^\2"+
		"\2\u03bb\u03bc\7n\2\2\u03bc\u009b\3\2\2\2\u03bd\u03be\7m\2\2\u03be\u03c1"+
		"\5\u009eP\2\u03bf\u03c0\7l\2\2\u03c0\u03c2\5\u00a0Q\2\u03c1\u03bf\3\2"+
		"\2\2\u03c1\u03c2\3\2\2\2\u03c2\u03c3\3\2\2\2\u03c3\u03c4\7n\2\2\u03c4"+
		"\u009d\3\2\2\2\u03c5\u03c8\7d\2\2\u03c6\u03c8\5\u00fa~\2\u03c7\u03c5\3"+
		"\2\2\2\u03c7\u03c6\3\2\2\2\u03c8\u009f\3\2\2\2\u03c9\u03cc\7d\2\2\u03ca"+
		"\u03cc\5\u00fa~\2\u03cb\u03c9\3\2\2\2\u03cb\u03ca\3\2\2\2\u03cc\u00a1"+
		"\3\2\2\2\u03cd\u03d3\7m\2\2\u03ce\u03d4\7u\2\2\u03cf\u03d2\7d\2\2\u03d0"+
		"\u03d2\5\u00fa~\2\u03d1\u03cf\3\2\2\2\u03d1\u03d0\3\2\2\2\u03d2\u03d4"+
		"\3\2\2\2\u03d3\u03ce\3\2\2\2\u03d3\u03d1\3\2\2\2\u03d4\u03d5\3\2\2\2\u03d5"+
		"\u03d6\7n\2\2\u03d6\u00a3\3\2\2\2\u03d7\u03da\7m\2\2\u03d8\u03db\7d\2"+
		"\2\u03d9\u03db\5\u00fa~\2\u03da\u03d8\3\2\2\2\u03da\u03d9\3\2\2\2\u03db"+
		"\u03dc\3\2\2\2\u03dc\u03dd\7n\2\2\u03dd\u00a5\3\2\2\2\u03de\u03e3\7\13"+
		"\2\2\u03df\u03e0\7m\2\2\u03e0\u03e1\5H%\2\u03e1\u03e2\7n\2\2\u03e2\u03e4"+
		"\3\2\2\2\u03e3\u03df\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4\u00a7\3\2\2\2\u03e5"+
		"\u03ea\7\33\2\2\u03e6\u03e7\7m\2\2\u03e7\u03e8\5H%\2\u03e8\u03e9\7n\2"+
		"\2\u03e9\u03eb\3\2\2\2\u03ea\u03e6\3\2\2\2\u03ea\u03eb\3\2\2\2\u03eb\u00a9"+
		"\3\2\2\2\u03ec\u03ed\t\17\2\2\u03ed\u00ab\3\2\2\2\u03ee\u03ef\7*\2\2\u03ef"+
		"\u00ad\3\2\2\2\u03f0\u03f1\7m\2\2\u03f1\u03f6\5\u00fa~\2\u03f2\u03f3\7"+
		"l\2\2\u03f3\u03f5\5\u00fa~\2\u03f4\u03f2\3\2\2\2\u03f5\u03f8\3\2\2\2\u03f6"+
		"\u03f4\3\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f9\3\2\2\2\u03f8\u03f6\3\2"+
		"\2\2\u03f9\u03fa\7n\2\2\u03fa\u00af\3\2\2\2\u03fb\u0400\7?\2\2\u03fc\u03fd"+
		"\7m\2\2\u03fd\u03fe\5j\66\2\u03fe\u03ff\7n\2\2\u03ff\u0401\3\2\2\2\u0400"+
		"\u03fc\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u00b1\3\2\2\2\u0402\u0406\5\u00b6"+
		"\\\2\u0403\u0405\5B\"\2\u0404\u0403\3\2\2\2\u0405\u0408\3\2\2\2\u0406"+
		"\u0404\3\2\2\2\u0406\u0407\3\2\2\2\u0407\u040a\3\2\2\2\u0408\u0406\3\2"+
		"\2\2\u0409\u040b\5\u00b8]\2\u040a\u0409\3\2\2\2\u040a\u040b\3\2\2\2\u040b"+
		"\u040c\3\2\2\2\u040c\u040d\5\u00b4[\2\u040d\u041d\3\2\2\2\u040e\u0412"+
		"\5\u00b6\\\2\u040f\u0411\5B\"\2\u0410\u040f\3\2\2\2\u0411\u0414\3\2\2"+
		"\2\u0412\u0410\3\2\2\2\u0412\u0413\3\2\2\2\u0413\u0416\3\2\2\2\u0414\u0412"+
		"\3\2\2\2\u0415\u0417\5\u00ba^\2\u0416\u0415\3\2\2\2\u0417\u0418\3\2\2"+
		"\2\u0418\u0416\3\2\2\2\u0418\u0419\3\2\2\2\u0419\u041a\3\2\2\2\u041a\u041b"+
		"\5\u00b4[\2\u041b\u041d\3\2\2\2\u041c\u0402\3\2\2\2\u041c\u040e\3\2\2"+
		"\2\u041d\u00b3\3\2\2\2\u041e\u0420\7\36\2\2\u041f\u0421\7&\2\2\u0420\u041f"+
		"\3\2\2\2\u0420\u0421\3\2\2\2\u0421\u00b5\3\2\2\2\u0422\u0423\7&\2\2\u0423"+
		"\u0424\5j\66\2\u0424\u0425\7K\2\2\u0425\u00b7\3\2\2\2\u0426\u042a\7\35"+
		"\2\2\u0427\u0429\5B\"\2\u0428\u0427\3\2\2\2\u0429\u042c\3\2\2\2\u042a"+
		"\u0428\3\2\2\2\u042a\u042b\3\2\2\2\u042b\u00b9\3\2\2\2\u042c\u042a\3\2"+
		"\2\2\u042d\u042e\7\34\2\2\u042e\u042f\5j\66\2\u042f\u0433\7K\2\2\u0430"+
		"\u0432\5B\"\2\u0431\u0430\3\2\2\2\u0432\u0435\3\2\2\2\u0433\u0431\3\2"+
		"\2\2\u0433\u0434\3\2\2\2\u0434\u0437\3\2\2\2\u0435\u0433\3\2\2\2\u0436"+
		"\u0438\5\u00b8]\2\u0437\u0436\3\2\2\2\u0437\u0438\3\2\2\2\u0438\u00bb"+
		"\3\2\2\2\u0439\u043d\7-\2\2\u043a\u043c\5B\"\2\u043b\u043a\3\2\2\2\u043c"+
		"\u043f\3\2\2\2\u043d\u043b\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u0440\3\2"+
		"\2\2\u043f\u043d\3\2\2\2\u0440\u044f\5\u00c2b\2\u0441\u0444\7-\2\2\u0442"+
		"\u0445\5\u00be`\2\u0443\u0445\5\u00c0a\2\u0444\u0442\3\2\2\2\u0444\u0443"+
		"\3\2\2\2\u0445\u0449\3\2\2\2\u0446\u0448\5B\"\2\u0447\u0446\3\2\2\2\u0448"+
		"\u044b\3\2\2\2\u0449\u0447\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044c\3\2"+
		"\2\2\u044b\u0449\3\2\2\2\u044c\u044d\5\u00c2b\2\u044d\u044f\3\2\2\2\u044e"+
		"\u0439\3\2\2\2\u044e\u0441\3\2\2\2\u044f\u00bd\3\2\2\2\u0450\u0452\5\u00c4"+
		"c\2\u0451\u0453\5\u00c6d\2\u0452\u0451\3\2\2\2\u0452\u0453\3\2\2\2\u0453"+
		"\u00bf\3\2\2\2\u0454\u0456\5\u00c6d\2\u0455\u0457\5\u00c4c\2\u0456\u0455"+
		"\3\2\2\2\u0456\u0457\3\2\2\2\u0457\u00c1\3\2\2\2\u0458\u045a\7\36\2\2"+
		"\u0459\u045b\7-\2\2\u045a\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u00c3"+
		"\3\2\2\2\u045c\u045d\7W\2\2\u045d\u045e\7m\2\2\u045e\u045f\5j\66\2\u045f"+
		"\u0460\7n\2\2\u0460\u00c5\3\2\2\2\u0461\u0462\7P\2\2\u0462\u0463\7m\2"+
		"\2\u0463\u0464\5j\66\2\u0464\u0465\7n\2\2\u0465\u00c7\3\2\2\2\u0466\u046a"+
		"\5\u00ccg\2\u0467\u0469\5\u00ceh\2\u0468\u0467\3\2\2\2\u0469\u046c\3\2"+
		"\2\2\u046a\u0468\3\2\2\2\u046a\u046b\3\2\2\2\u046b\u046e\3\2\2\2\u046c"+
		"\u046a\3\2\2\2\u046d\u046f\5\u00d0i\2\u046e\u046d\3\2\2\2\u046e\u046f"+
		"\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471\5\u00caf\2\u0471\u00c9\3\2\2"+
		"\2\u0472\u0474\7\36\2\2\u0473\u0475\7E\2\2\u0474\u0473\3\2\2\2\u0474\u0475"+
		"\3\2\2\2\u0475\u00cb\3\2\2\2\u0476\u047b\7E\2\2\u0477\u0478\7m\2\2\u0478"+
		"\u0479\5j\66\2\u0479\u047a\7n\2\2\u047a\u047c\3\2\2\2\u047b\u0477\3\2"+
		"\2\2\u047b\u047c\3\2\2\2\u047c\u00cd\3\2\2\2\u047d\u047f\7V\2\2\u047e"+
		"\u0480\t\20\2\2\u047f\u047e\3\2\2\2\u047f\u0480\3\2\2\2\u0480\u0481\3"+
		"\2\2\2\u0481\u0482\7m\2\2\u0482\u0487\5j\66\2\u0483\u0484\7l\2\2\u0484"+
		"\u0486\5j\66\2\u0485\u0483\3\2\2\2\u0486\u0489\3\2\2\2\u0487\u0485\3\2"+
		"\2\2\u0487\u0488\3\2\2\2\u0488\u048a\3\2\2\2\u0489\u0487\3\2\2\2\u048a"+
		"\u048e\7n\2\2\u048b\u048d\5B\"\2\u048c\u048b\3\2\2\2\u048d\u0490\3\2\2"+
		"\2\u048e\u048c\3\2\2\2\u048e\u048f\3\2\2\2\u048f\u00cf\3\2\2\2\u0490\u048e"+
		"\3\2\2\2\u0491\u0495\7\35\2\2\u0492\u0494\5B\"\2\u0493\u0492\3\2\2\2\u0494"+
		"\u0497\3\2\2\2\u0495\u0493\3\2\2\2\u0495\u0496\3\2\2\2\u0496\u00d1\3\2"+
		"\2\2\u0497\u0495\3\2\2\2\u0498\u0499\7\32\2\2\u0499\u049a\5\u00fa~\2\u049a"+
		"\u049b\5\u00d4k\2\u049b\u04a5\3\2\2\2\u049c\u049d\7\32\2\2\u049d\u049e"+
		"\5\u00fa~\2\u049e\u049f\5\u00e4s\2\u049f\u04a5\3\2\2\2\u04a0\u04a1\7\32"+
		"\2\2\u04a1\u04a2\5\u00fa~\2\u04a2\u04a3\5\u00d6l\2\u04a3\u04a5\3\2\2\2"+
		"\u04a4\u0498\3\2\2\2\u04a4\u049c\3\2\2\2\u04a4\u04a0\3\2\2\2\u04a5\u00d3"+
		"\3\2\2\2\u04a6\u04ab\7!\2\2\u04a7\u04ac\5\u00d8m\2\u04a8\u04ac\5\u00da"+
		"n\2\u04a9\u04ac\5\u00dco\2\u04aa\u04ac\5\u00dep\2\u04ab\u04a7\3\2\2\2"+
		"\u04ab\u04a8\3\2\2\2\u04ab\u04a9\3\2\2\2\u04ab\u04aa\3\2\2\2\u04ab\u04ac"+
		"\3\2\2\2\u04ac\u04ad\3\2\2\2\u04ad\u04ae\5\u00e0q\2\u04ae\u04b0\7\36\2"+
		"\2\u04af\u04b1\7!\2\2\u04b0\u04af\3\2\2\2\u04b0\u04b1\3\2\2\2\u04b1\u00d5"+
		"\3\2\2\2\u04b2\u04b3\7\4\2\2\u04b3\u04b4\5\u0090I\2\u04b4\u00d7\3\2\2"+
		"\2\u04b5\u04b6\7\f\2\2\u04b6\u04b7\7m\2\2\u04b7\u04b8\5\u00f6|\2\u04b8"+
		"\u04b9\7n\2\2\u04b9\u00d9\3\2\2\2\u04ba\u04bb\7\30\2\2\u04bb\u04bc\7m"+
		"\2\2\u04bc\u04bd\5\u00f6|\2\u04bd\u04be\7n\2\2\u04be\u00db\3\2\2\2\u04bf"+
		"\u04c0\7I\2\2\u04c0\u04c1\7m\2\2\u04c1\u04c2\5\u00f6|\2\u04c2\u04c3\7"+
		"n\2\2\u04c3\u00dd\3\2\2\2\u04c4\u04c5\7\r\2\2\u04c5\u04c6\7m\2\2\u04c6"+
		"\u04c7\5\u00f6|\2\u04c7\u04c8\7n\2\2\u04c8\u00df\3\2\2\2\u04c9\u04cc\5"+
		"\u00fa~\2\u04ca\u04cb\7s\2\2\u04cb\u04cd\5\u00e2r\2\u04cc\u04ca\3\2\2"+
		"\2\u04cc\u04cd\3\2\2\2\u04cd\u04d5\3\2\2\2\u04ce\u04d1\5\u00fa~\2\u04cf"+
		"\u04d0\7s\2\2\u04d0\u04d2\5\u00e2r\2\u04d1\u04cf\3\2\2\2\u04d1\u04d2\3"+
		"\2\2\2\u04d2\u04d4\3\2\2\2\u04d3\u04ce\3\2\2\2\u04d4\u04d7\3\2\2\2\u04d5"+
		"\u04d3\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u00e1\3\2\2\2\u04d7\u04d5\3\2"+
		"\2\2\u04d8\u04dc\5\u00f6|\2\u04d9\u04dc\5\u00eex\2\u04da\u04dc\5\u00f8"+
		"}\2\u04db\u04d8\3\2\2\2\u04db\u04d9\3\2\2\2\u04db\u04da\3\2\2\2\u04dc"+
		"\u00e3\3\2\2\2\u04dd\u04de\7J\2\2\u04de\u04df\5\u00e6t\2\u04df\u04e1\7"+
		"\36\2\2\u04e0\u04e2\7J\2\2\u04e1\u04e0\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2"+
		"\u00e5\3\2\2\2\u04e3\u04e4\5\u00e8u\2\u04e4\u00e7\3\2\2\2\u04e5\u04e9"+
		"\5\u00ecw\2\u04e6\u04e8\5\u00ecw\2\u04e7\u04e6\3\2\2\2\u04e8\u04eb\3\2"+
		"\2\2\u04e9\u04e7\3\2\2\2\u04e9\u04ea\3\2\2\2\u04ea\u00e9\3\2\2\2\u04eb"+
		"\u04e9\3\2\2\2\u04ec\u04ee\5\u00fa~\2\u04ed\u04ef\5\u0086D\2\u04ee\u04ed"+
		"\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0\u04f1\7J\2\2\u04f1"+
		"\u04f2\5\u00e6t\2\u04f2\u04f4\7\36\2\2\u04f3\u04f5\7J\2\2\u04f4\u04f3"+
		"\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u00eb\3\2\2\2\u04f6\u0500\5\u00eav"+
		"\2\u04f7\u04f9\5\u00fa~\2\u04f8\u04fa\5\u0086D\2\u04f9\u04f8\3\2\2\2\u04f9"+
		"\u04fa\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\7\t\2\2\u04fc\u04fd\5\u00fa"+
		"~\2\u04fd\u0500\3\2\2\2\u04fe\u0500\5\u0082B\2\u04ff\u04f6\3\2\2\2\u04ff"+
		"\u04f7\3\2\2\2\u04ff\u04fe\3\2\2\2\u0500\u00ed\3\2\2\2\u0501\u0502\t\21"+
		"\2\2\u0502\u00ef\3\2\2\2\u0503\u0508\5\u00f8}\2\u0504\u0508\5\u00f4{\2"+
		"\u0505\u0508\5\u00f2z\2\u0506\u0508\5\u00f6|\2\u0507\u0503\3\2\2\2\u0507"+
		"\u0504\3\2\2\2\u0507\u0505\3\2\2\2\u0507\u0506\3\2\2\2\u0508\u00f1\3\2"+
		"\2\2\u0509\u050a\7c\2\2\u050a\u00f3\3\2\2\2\u050b\u050c\7b\2\2\u050c\u00f5"+
		"\3\2\2\2\u050d\u0510\7d\2\2\u050e\u0510\7f\2\2\u050f\u050d\3\2\2\2\u050f"+
		"\u050e\3\2\2\2\u0510\u00f7\3\2\2\2\u0511\u0512\7a\2\2\u0512\u00f9\3\2"+
		"\2\2\u0513\u0516\t\22\2\2\u0514\u0516\7\u00a0\2\2\u0515\u0513\3\2\2\2"+
		"\u0515\u0514\3\2\2\2\u0516\u00fb\3\2\2\2\u00a1\u00fd\u0102\u0108\u010a"+
		"\u0115\u011c\u011e\u0129\u012d\u0131\u0139\u0141\u0145\u014e\u015b\u015e"+
		"\u016a\u0174\u0179\u017b\u0183\u0189\u018b\u0190\u0198\u019d\u01a7\u01ae"+
		"\u01b0\u01b8\u01bb\u01c2\u01c7\u01cb\u01d7\u01dd\u01e1\u01e5\u01f3\u01fa"+
		"\u01fe\u020d\u0218\u021e\u0222\u0227\u022e\u0231\u0237\u023e\u0247\u0266"+
		"\u026b\u0284\u0286\u02b4\u02b6\u02b8\u02be\u02c3\u02c7\u02d0\u02d6\u02f1"+
		"\u02f5\u02f9\u02fe\u0304\u0309\u030f\u031a\u031e\u0325\u032e\u0331\u0335"+
		"\u0338\u033c\u033f\u0343\u0346\u034a\u034d\u0351\u0354\u0356\u035c\u035f"+
		"\u0363\u0366\u036a\u036e\u0371\u0375\u0378\u0388\u038e\u0391\u0395\u0398"+
		"\u039c\u039f\u03a3\u03a6\u03aa\u03ad\u03b1\u03b4\u03b6\u03c1\u03c7\u03cb"+
		"\u03d1\u03d3\u03da\u03e3\u03ea\u03f6\u0400\u0406\u040a\u0412\u0418\u041c"+
		"\u0420\u042a\u0433\u0437\u043d\u0444\u0449\u044e\u0452\u0456\u045a\u046a"+
		"\u046e\u0474\u047b\u047f\u0487\u048e\u0495\u04a4\u04ab\u04b0\u04cc\u04d1"+
		"\u04d5\u04db\u04e1\u04e9\u04ee\u04f4\u04f9\u04ff\u0507\u050f\u0515";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}