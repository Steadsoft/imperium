// Generated from Imperium.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ImperiumParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTranslationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTranslationUnit(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007216459776064L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 18014398509483009L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterUses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitUses(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterScope(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitScope(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007216459776064L) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & 18014398509483009L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterScopeStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitScopeStart(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ScopeEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SCOPE() { return getToken(ImperiumParser.SCOPE, 0); }
		public ScopeEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scopeEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterScopeEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitScopeEnd(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAssemblerToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAssemblerToken(this);
		}
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
			if ( !(((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 1152921504609009419L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTraits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTraits(this);
		}
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
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007216459776064L) != 0) || _la==SEMICOLON) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTraitsStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTraitsStart(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TraitsEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode TRAITS() { return getToken(ImperiumParser.TRAITS, 0); }
		public TraitsEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_traitsEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTraitsEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTraitsEnd(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclarationTraits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclarationTraits(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclarationTrait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclarationTrait(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureTraits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureTraits(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureTraitsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureTraitsList(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureTrait(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureTrait(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureRule(this);
		}
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
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007216459776320L) != 0) || _la==SEMICOLON) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTarget(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTarget(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAsmBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAsmBlock(this);
		}
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
			while (((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 1152921504609009419L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAsmOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAsmOptions(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterFunctionRule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitFunctionRule(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterFunctionStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitFunctionStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTargetSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTargetSpec(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureAttributes(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterFunctionAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitFunctionAttributes(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode PROCEDURE() { return getToken(ImperiumParser.PROCEDURE, 0); }
		public ProcedureEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedureEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedureEnd(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode FUNCTION() { return getToken(ImperiumParser.FUNCTION, 0); }
		public FunctionEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterFunctionEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitFunctionEnd(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterReturnsDescriptor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitReturnsDescriptor(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class TerminatorContext extends VisitorContext {
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public TerminatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTerminator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTerminator(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterLabelStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitLabelStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends PassiveStmtContext {
		public FunctionRuleContext functionRule() {
			return getRuleContext(FunctionRuleContext.class,0);
		}
		public FunctionContext(PassiveStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitFunction(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NullContext extends PassiveStmtContext {
		public NullStmtContext nullStmt() {
			return getRuleContext(NullStmtContext.class,0);
		}
		public NullContext(PassiveStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterNull(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitNull(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends PassiveStmtContext {
		public DefineStmtContext defineStmt() {
			return getRuleContext(DefineStmtContext.class,0);
		}
		public DefinitionContext(PassiveStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDefinition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureContext extends PassiveStmtContext {
		public ProcedureRuleContext procedureRule() {
			return getRuleContext(ProcedureRuleContext.class,0);
		}
		public ProcedureContext(PassiveStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterProcedure(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitProcedure(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends PassiveStmtContext {
		public DeclareStmtContext declareStmt() {
			return getRuleContext(DeclareStmtContext.class,0);
		}
		public DeclarationContext(PassiveStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclaration(this);
		}
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
				_localctx = new DefinitionContext(_localctx);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAssemblerStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAssemblerStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AssemblerInlineCommentContext extends VisitorContext {
		public TerminalNode ASSEMBLER_LINE_COMMENT() { return getToken(ImperiumParser.ASSEMBLER_LINE_COMMENT, 0); }
		public AssemblerInlineCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assemblerInlineComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAssemblerInlineComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAssemblerInlineComment(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterActiveStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitActiveStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NullStmtContext extends VisitorContext {
		public TerminalNode SEMICOLON() { return getToken(ImperiumParser.SEMICOLON, 0); }
		public NullStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterNullStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitNullStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAssignmentStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
	public static class BasicRefContext extends ReferenceContext {
		public BasicReferenceContext basicReference() {
			return getRuleContext(BasicReferenceContext.class,0);
		}
		public ArgumentsListContext argumentsList() {
			return getRuleContext(ArgumentsListContext.class,0);
		}
		public BasicRefContext(ReferenceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBasicRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBasicRef(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterPtrRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitPtrRef(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitArguments(this);
		}
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
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 4638716513694515199L) != 0) || ((((_la - 141)) & ~0x3f) == 0 && ((1L << (_la - 141)) & 131135L) != 0)) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterArgumentsList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitArgumentsList(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBasicReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBasicReference(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructureQualification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructureQualification(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructureQualificationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructureQualificationList(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SubscriptContext extends VisitorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SubscriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitSubscript(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterSubscriptCommalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitSubscriptCommalist(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitParenthesizedExpression(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterPrimitiveExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitPrimitiveExpression(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitPrefixExpression(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBitAdjustOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBitAdjustOperator(this);
		}
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
			if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & 31L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AdditionOperatorContext extends VisitorContext {
		public TerminalNode PLUS() { return getToken(ImperiumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperiumParser.MINUS, 0); }
		public AdditionOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_additionOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAdditionOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAdditionOperator(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class MultiplyOperatorContext extends VisitorContext {
		public TerminalNode TIMES() { return getToken(ImperiumParser.TIMES, 0); }
		public TerminalNode DIVIDE_U() { return getToken(ImperiumParser.DIVIDE_U, 0); }
		public TerminalNode PCNT() { return getToken(ImperiumParser.PCNT, 0); }
		public MultiplyOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiplyOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMultiplyOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMultiplyOperator(this);
		}
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
			if ( !(((((_la - 115)) & ~0x3f) == 0 && ((1L << (_la - 115)) & 524291L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolAndOperatorContext extends VisitorContext {
		public TerminalNode AND() { return getToken(ImperiumParser.AND, 0); }
		public TerminalNode NAND() { return getToken(ImperiumParser.NAND, 0); }
		public BoolAndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolAndOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBoolAndOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBoolAndOperator(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolXorOperatorContext extends VisitorContext {
		public TerminalNode XOR_U() { return getToken(ImperiumParser.XOR_U, 0); }
		public TerminalNode XNOR_U() { return getToken(ImperiumParser.XNOR_U, 0); }
		public BoolXorOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolXorOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBoolXorOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBoolXorOperator(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BoolOrOperatorContext extends VisitorContext {
		public TerminalNode OR() { return getToken(ImperiumParser.OR, 0); }
		public TerminalNode NOR() { return getToken(ImperiumParser.NOR, 0); }
		public TerminalNode NOT() { return getToken(ImperiumParser.NOT, 0); }
		public BoolOrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolOrOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBoolOrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBoolOrOperator(this);
		}
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
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 5121L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMapExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMapExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprBoolAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprBoolAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprConcat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprConcat(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprRaise(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprRaise(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprBoolXor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprBoolXor(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMapArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMapArguments(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprLogAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprLogAnd(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprBitAdjust(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprBitAdjust(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprAddSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenthesizedContext extends ExpressionContext {
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public ExprParenthesizedContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprParenthesized(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprParenthesized(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprMulDiv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprLogOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprLogOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprCompare(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPrefixedContext extends ExpressionContext {
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public ExprPrefixedContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprPrefixed(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprPrefixed(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprBoolOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprBoolOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprPrimitiveContext extends ExpressionContext {
		public PrimitiveExpressionContext primitiveExpression() {
			return getRuleContext(PrimitiveExpressionContext.class,0);
		}
		public ExprPrimitiveContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterExprPrimitive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitExprPrimitive(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMap_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMap_set(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBool_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBool_set(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class PrefixOperatorContext extends VisitorContext {
		public TerminalNode PLUS() { return getToken(ImperiumParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(ImperiumParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(ImperiumParser.NOT, 0); }
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterPrefixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitPrefixOperator(this);
		}
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
			if ( !(((((_la - 117)) & ~0x3f) == 0 && ((1L << (_la - 117)) & 515L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitComparisonOperator(this);
		}
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
			if ( !(((((_la - 113)) & ~0x3f) == 0 && ((1L << (_la - 113)) & 2080769L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ShiftOperatorContext extends VisitorContext {
		public TerminalNode R_LOG_SHIFT() { return getToken(ImperiumParser.R_LOG_SHIFT, 0); }
		public TerminalNode L_LOG_SHIFT() { return getToken(ImperiumParser.L_LOG_SHIFT, 0); }
		public TerminalNode R_ART_SHIFT() { return getToken(ImperiumParser.R_ART_SHIFT, 0); }
		public ShiftOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shiftOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterShiftOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitShiftOperator(this);
		}
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
			if ( !(((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & 7L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallStmtContext extends VisitorContext {
		public TerminalNode CALL() { return getToken(ImperiumParser.CALL, 0); }
		public ReferenceContext reference() {
			return getRuleContext(ReferenceContext.class,0);
		}
		public CallStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterCallStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitCallStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterGotoStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitGotoStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class EndloopStmtContext extends VisitorContext {
		public TerminalNode ENDLOOP() { return getToken(ImperiumParser.ENDLOOP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EndloopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endloopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterEndloopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitEndloopStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class ReloopStmtContext extends VisitorContext {
		public TerminalNode RELOOP() { return getToken(ImperiumParser.RELOOP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReloopStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reloopStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterReloopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitReloopStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclareStmtContext extends VisitorContext {
		public DeclareStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareStmt; }
	 
		public DeclareStmtContext() { }
		public void copyFrom(DeclareStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareAsContext extends DeclareStmtContext {
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
		public DeclareAsContext(DeclareStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclareAs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclareAs(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclareNameContext extends DeclareStmtContext {
		public DeclarationBodyContext declarationBody() {
			return getRuleContext(DeclarationBodyContext.class,0);
		}
		public TerminalNode DECLARE() { return getToken(ImperiumParser.DECLARE, 0); }
		public TerminalNode ARGUMENT() { return getToken(ImperiumParser.ARGUMENT, 0); }
		public DeclareNameContext(DeclareStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclareName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclareName(this);
		}
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
				_localctx = new DeclareAsContext(_localctx);
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
				_localctx = new DeclareNameContext(_localctx);
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclareAsBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclareAsBody(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDeclarationBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDeclarationBody(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterTypeInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitTypeInfo(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDimensionSuffix(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDimensionSuffix(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBoundPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBoundPair(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBoundPairCommalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBoundPairCommalist(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LowerBoundContext extends VisitorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LowerBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lowerBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterLowerBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitLowerBound(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class UpperBoundContext extends VisitorContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public UpperBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_upperBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterUpperBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitUpperBound(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAttributes(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMemoryAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMemoryAttribute(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDataAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDataAttribute(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumericScaleContext extends VisitorContext {
		public TerminalNode FIXED() { return getToken(ImperiumParser.FIXED, 0); }
		public TerminalNode FLOAT() { return getToken(ImperiumParser.FLOAT, 0); }
		public NumericScaleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericScale; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterNumericScale(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitNumericScale(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterLinkageOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitLinkageOption(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LinkageSectionContext extends VisitorContext {
		public TerminalNode SECTION() { return getToken(ImperiumParser.SECTION, 0); }
		public TerminalNode LPAR() { return getToken(ImperiumParser.LPAR, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public TerminalNode RPAR() { return getToken(ImperiumParser.RPAR, 0); }
		public LinkageSectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_linkageSection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterLinkageSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitLinkageSection(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitPrecision(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberOfDigitsContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NumberOfDigitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberOfDigits; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterNumberOfDigits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitNumberOfDigits(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class Scale_factorContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public Scale_factorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scale_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterScale_factor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitScale_factor(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMaxStringLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMaxStringLength(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterMaxLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitMaxLength(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBased(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBased(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDefined(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDefined(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class CoprocedureSpecifierContext extends VisitorContext {
		public TerminalNode COROUTINE() { return getToken(ImperiumParser.COROUTINE, 0); }
		public TerminalNode COFUNCTION() { return getToken(ImperiumParser.COFUNCTION, 0); }
		public CoprocedureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_coprocedureSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterCoprocedureSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitCoprocedureSpecifier(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class HandlerSpecifierContext extends VisitorContext {
		public TerminalNode INTERRUPT() { return getToken(ImperiumParser.INTERRUPT, 0); }
		public HandlerSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_handlerSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterHandlerSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitHandlerSpecifier(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterParameterNameCommalist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitParameterNameCommalist(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterReturnStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitReturnStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitIfStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode IF() { return getToken(ImperiumParser.IF, 0); }
		public IfEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterIfEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitIfEnd(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterThenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitThenClause(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitElseClause(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterElifClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitElifClause(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterLoopStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitLoopStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitWhileLoop(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterUntilLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitUntilLoop(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class LoopEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode LOOP() { return getToken(ImperiumParser.LOOP, 0); }
		public LoopEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterLoopEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitLoopEnd(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterWhileOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitWhileOption(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterUntilOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitUntilOption(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterSelectStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitSelectStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectEndContext extends VisitorContext {
		public TerminalNode END() { return getToken(ImperiumParser.END, 0); }
		public TerminalNode SELECT() { return getToken(ImperiumParser.SELECT, 0); }
		public SelectEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterSelectEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitSelectEnd(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitSelectClause(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitWhenClause(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterOtherwiseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitOtherwiseClause(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDefineStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDefineStmt(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterEnumType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitEnumType(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class AliasTypeContext extends VisitorContext {
		public TerminalNode ALIAS() { return getToken(ImperiumParser.ALIAS, 0); }
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AliasTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterAliasType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitAliasType(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBinaryEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBinaryEnum(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDecimalEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDecimalEnum(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStringEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStringEnum(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBitEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBitEnum(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterEnumBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitEnumBody(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterEnumLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitEnumLiteral(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructType(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StructBodyContext extends VisitorContext {
		public StructMemberListContext structMemberList() {
			return getRuleContext(StructMemberListContext.class,0);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructBody(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructMemberList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructMemberList(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructSubstruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructSubstruct(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStructMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStructMember(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends VisitorContext {
		public TerminalNode STRING_LITERAL_3() { return getToken(ImperiumParser.STRING_LITERAL_3, 0); }
		public TerminalNode STRING_LITERAL_2() { return getToken(ImperiumParser.STRING_LITERAL_2, 0); }
		public TerminalNode STRING_LITERAL_1() { return getToken(ImperiumParser.STRING_LITERAL_1, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitStringLiteral(this);
		}
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
			if ( !(((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & 7L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitNumericLiteral(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class HexLiteralContext extends VisitorContext {
		public TerminalNode HEXADECIMAL_PATTERN() { return getToken(ImperiumParser.HEXADECIMAL_PATTERN, 0); }
		public HexLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterHexLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitHexLiteral(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class OctalLiteralContext extends VisitorContext {
		public TerminalNode OCTAL_PATTERN() { return getToken(ImperiumParser.OCTAL_PATTERN, 0); }
		public OctalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_octalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterOctalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitOctalLiteral(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends VisitorContext {
		public TerminalNode INTEGER() { return getToken(ImperiumParser.INTEGER, 0); }
		public TerminalNode DECIMAL_PATTERN() { return getToken(ImperiumParser.DECIMAL_PATTERN, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitDecimalLiteral(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryLiteralContext extends VisitorContext {
		public TerminalNode BINARY_PATTERN() { return getToken(ImperiumParser.BINARY_PATTERN, 0); }
		public BinaryLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitBinaryLiteral(this);
		}
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

	@SuppressWarnings("CheckReturnValue")
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ImperiumListener ) ((ImperiumListener)listener).exitIdentifier(this);
		}
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
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & -2L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 8388607L) != 0)) ) {
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
		"\u0004\u0001\u00af\u0516\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0001\u0000\u0003\u0000\u00fc\b\u0000\u0001\u0000\u0005\u0000\u00ff"+
		"\b\u0000\n\u0000\f\u0000\u0102\t\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u0107\b\u0000\n\u0000\f\u0000\u010a\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001\u0112"+
		"\b\u0001\n\u0001\f\u0001\u0115\t\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0005\u0002\u011b\b\u0002\n\u0002\f\u0002\u011e\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003\u0126\b\u0003\n\u0003\f\u0003\u0129\t\u0003\u0001\u0003\u0003\u0003"+
		"\u012c\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004\u0130\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0005\u0006\u0136\b\u0006\n"+
		"\u0006\f\u0006\u0139\t\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0140\b\u0007\u0001\b\u0001\b\u0003\b\u0144"+
		"\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u014b\b\t\n\t\f\t"+
		"\u014e\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0003\n\u015a\b\n\u0001\n\u0003\n\u015d\b\n\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0167\b\f\n\f\f\f\u016a\t\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0003\r\u0173\b\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0005\u000e\u0178\b\u000e\n\u000e\f\u000e\u017b\t\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0182\b\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0188\b\u000e"+
		"\n\u000e\f\u000e\u018b\t\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u018f"+
		"\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0003\u0010\u0197\b\u0010\u0001\u0010\u0005\u0010\u019a\b\u0010"+
		"\n\u0010\f\u0010\u019d\t\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01a6\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0005\u0012\u01ad"+
		"\b\u0012\n\u0012\f\u0012\u01b0\t\u0012\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0003\u0013\u01b7\b\u0013\u0001\u0013\u0003\u0013"+
		"\u01ba\b\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u01c1\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u01c6\b\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01ca\b\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01d6\b\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u01dc\b\u0017\u0001"+
		"\u0018\u0001\u0018\u0003\u0018\u01e0\b\u0018\u0001\u0019\u0001\u0019\u0003"+
		"\u0019\u01e4\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0003\u001c\u01f2\b\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01f9\b\u001d\u0001\u001e\u0001"+
		"\u001e\u0003\u001e\u01fd\b\u001e\u0001\u001f\u0001\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003"+
		" \u020c\b \u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001"+
		"#\u0001#\u0003#\u0217\b#\u0001#\u0001#\u0001#\u0001#\u0003#\u021d\b#\u0005"+
		"#\u021f\b#\n#\f#\u0222\t#\u0001$\u0001$\u0003$\u0226\b$\u0001$\u0001$"+
		"\u0001%\u0004%\u022b\b%\u000b%\f%\u022c\u0001&\u0003&\u0230\b&\u0001&"+
		"\u0001&\u0001\'\u0001\'\u0003\'\u0236\b\'\u0001\'\u0001\'\u0001(\u0004"+
		"(\u023b\b(\u000b(\f(\u023c\u0001)\u0001)\u0001*\u0001*\u0001*\u0005*\u0244"+
		"\b*\n*\f*\u0247\t*\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001+\u0001"+
		"+\u0003+\u0265\b+\u0001,\u0001,\u0001,\u0003,\u026a\b,\u0001-\u0001-\u0001"+
		"-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00012\u0001"+
		"2\u00013\u00013\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00034\u0283\b4\u00034\u0285\b4\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"+
		"4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00034\u02b3"+
		"\b4\u00054\u02b5\b4\n4\f4\u02b8\t4\u00015\u00015\u00015\u00035\u02bd\b"+
		"5\u00015\u00015\u00015\u00035\u02c2\b5\u00055\u02c4\b5\n5\f5\u02c7\t5"+
		"\u00015\u00015\u00015\u00015\u00045\u02cd\b5\u000b5\f5\u02ce\u00015\u0001"+
		"5\u00015\u00015\u00035\u02d5\b5\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00017\u00017\u00018\u00018\u00019\u00019\u0001:\u0001"+
		":\u0001:\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0001;\u0003"+
		";\u02f0\b;\u0001<\u0001<\u0003<\u02f4\b<\u0001=\u0001=\u0003=\u02f8\b"+
		"=\u0001>\u0001>\u0001>\u0003>\u02fd\b>\u0001>\u0001>\u0001>\u0001>\u0003"+
		">\u0303\b>\u0001?\u0001?\u0001?\u0003?\u0308\b?\u0001@\u0001@\u0001@\u0001"+
		"A\u0003A\u030e\bA\u0001A\u0001A\u0001B\u0001B\u0001B\u0001B\u0001C\u0001"+
		"C\u0001C\u0003C\u0319\bC\u0001C\u0001C\u0003C\u031d\bC\u0001D\u0001D\u0001"+
		"D\u0005D\u0322\bD\nD\fD\u0325\tD\u0001E\u0001E\u0001F\u0001F\u0001G\u0001"+
		"G\u0003G\u032d\bG\u0001G\u0003G\u0330\bG\u0001G\u0001G\u0003G\u0334\b"+
		"G\u0001G\u0003G\u0337\bG\u0001G\u0001G\u0003G\u033b\bG\u0001G\u0003G\u033e"+
		"\bG\u0001G\u0001G\u0003G\u0342\bG\u0001G\u0003G\u0345\bG\u0001G\u0001"+
		"G\u0003G\u0349\bG\u0001G\u0003G\u034c\bG\u0001G\u0001G\u0003G\u0350\b"+
		"G\u0001G\u0003G\u0353\bG\u0003G\u0355\bG\u0001H\u0001H\u0001H\u0001H\u0003"+
		"H\u035b\bH\u0001I\u0003I\u035e\bI\u0001I\u0001I\u0003I\u0362\bI\u0001"+
		"I\u0003I\u0365\bI\u0001I\u0001I\u0003I\u0369\bI\u0001I\u0001I\u0003I\u036d"+
		"\bI\u0001I\u0003I\u0370\bI\u0001I\u0001I\u0003I\u0374\bI\u0001I\u0003"+
		"I\u0377\bI\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001I\u0001"+
		"I\u0001I\u0001I\u0001I\u0001I\u0001I\u0003I\u0387\bI\u0001J\u0001J\u0001"+
		"K\u0001K\u0003K\u038d\bK\u0001K\u0003K\u0390\bK\u0001K\u0001K\u0003K\u0394"+
		"\bK\u0001K\u0003K\u0397\bK\u0001K\u0001K\u0003K\u039b\bK\u0001K\u0003"+
		"K\u039e\bK\u0001K\u0001K\u0003K\u03a2\bK\u0001K\u0003K\u03a5\bK\u0001"+
		"K\u0001K\u0003K\u03a9\bK\u0001K\u0003K\u03ac\bK\u0001K\u0001K\u0003K\u03b0"+
		"\bK\u0001K\u0003K\u03b3\bK\u0003K\u03b5\bK\u0001L\u0001L\u0001L\u0001"+
		"L\u0001L\u0001M\u0001M\u0001M\u0001M\u0003M\u03c0\bM\u0001M\u0001M\u0001"+
		"N\u0001N\u0003N\u03c6\bN\u0001O\u0001O\u0003O\u03ca\bO\u0001P\u0001P\u0001"+
		"P\u0001P\u0003P\u03d0\bP\u0003P\u03d2\bP\u0001P\u0001P\u0001Q\u0001Q\u0001"+
		"Q\u0003Q\u03d9\bQ\u0001Q\u0001Q\u0001R\u0001R\u0001R\u0001R\u0001R\u0003"+
		"R\u03e2\bR\u0001S\u0001S\u0001S\u0001S\u0001S\u0003S\u03e9\bS\u0001T\u0001"+
		"T\u0001U\u0001U\u0001V\u0001V\u0001V\u0001V\u0005V\u03f3\bV\nV\fV\u03f6"+
		"\tV\u0001V\u0001V\u0001W\u0001W\u0001W\u0001W\u0001W\u0003W\u03ff\bW\u0001"+
		"X\u0001X\u0005X\u0403\bX\nX\fX\u0406\tX\u0001X\u0003X\u0409\bX\u0001X"+
		"\u0001X\u0001X\u0001X\u0005X\u040f\bX\nX\fX\u0412\tX\u0001X\u0004X\u0415"+
		"\bX\u000bX\fX\u0416\u0001X\u0001X\u0003X\u041b\bX\u0001Y\u0001Y\u0003"+
		"Y\u041f\bY\u0001Z\u0001Z\u0001Z\u0001Z\u0001[\u0001[\u0005[\u0427\b[\n"+
		"[\f[\u042a\t[\u0001\\\u0001\\\u0001\\\u0001\\\u0005\\\u0430\b\\\n\\\f"+
		"\\\u0433\t\\\u0001\\\u0003\\\u0436\b\\\u0001]\u0001]\u0005]\u043a\b]\n"+
		"]\f]\u043d\t]\u0001]\u0001]\u0001]\u0001]\u0003]\u0443\b]\u0001]\u0005"+
		"]\u0446\b]\n]\f]\u0449\t]\u0001]\u0001]\u0003]\u044d\b]\u0001^\u0001^"+
		"\u0003^\u0451\b^\u0001_\u0001_\u0003_\u0455\b_\u0001`\u0001`\u0003`\u0459"+
		"\b`\u0001a\u0001a\u0001a\u0001a\u0001a\u0001b\u0001b\u0001b\u0001b\u0001"+
		"b\u0001c\u0001c\u0005c\u0467\bc\nc\fc\u046a\tc\u0001c\u0003c\u046d\bc"+
		"\u0001c\u0001c\u0001d\u0001d\u0003d\u0473\bd\u0001e\u0001e\u0001e\u0001"+
		"e\u0001e\u0003e\u047a\be\u0001f\u0001f\u0003f\u047e\bf\u0001f\u0001f\u0001"+
		"f\u0001f\u0005f\u0484\bf\nf\ff\u0487\tf\u0001f\u0001f\u0005f\u048b\bf"+
		"\nf\ff\u048e\tf\u0001g\u0001g\u0005g\u0492\bg\ng\fg\u0495\tg\u0001h\u0001"+
		"h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001h\u0001"+
		"h\u0003h\u04a3\bh\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u04aa\bi\u0001"+
		"i\u0001i\u0001i\u0003i\u04af\bi\u0001j\u0001j\u0001j\u0001k\u0001k\u0001"+
		"k\u0001k\u0001k\u0001l\u0001l\u0001l\u0001l\u0001l\u0001m\u0001m\u0001"+
		"m\u0001m\u0001m\u0001n\u0001n\u0001n\u0001n\u0001n\u0001o\u0001o\u0001"+
		"o\u0003o\u04cb\bo\u0001o\u0001o\u0001o\u0003o\u04d0\bo\u0005o\u04d2\b"+
		"o\no\fo\u04d5\to\u0001p\u0001p\u0001p\u0003p\u04da\bp\u0001q\u0001q\u0001"+
		"q\u0001q\u0003q\u04e0\bq\u0001r\u0001r\u0001s\u0001s\u0005s\u04e6\bs\n"+
		"s\fs\u04e9\ts\u0001t\u0001t\u0003t\u04ed\bt\u0001t\u0001t\u0001t\u0001"+
		"t\u0003t\u04f3\bt\u0001u\u0001u\u0001u\u0003u\u04f8\bu\u0001u\u0001u\u0001"+
		"u\u0001u\u0003u\u04fe\bu\u0001v\u0001v\u0001w\u0001w\u0001w\u0001w\u0003"+
		"w\u0506\bw\u0001x\u0001x\u0001y\u0001y\u0001z\u0001z\u0003z\u050e\bz\u0001"+
		"{\u0001{\u0001|\u0001|\u0003|\u0514\b|\u0001|\u0000\u0002Fh}\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u0000\u0011\u0005"+
		"\u0000bceejqww\u009e\u009e\u0001\u0000qr\u0001\u0000\u0096\u009a\u0001"+
		"\u0000uv\u0002\u0000st\u0086\u0086\u0002\u0000\u0087\u0087\u0089\u0089"+
		"\u0001\u0000\u008b\u008c\u0003\u0000~~\u0088\u0088\u008a\u008a\u0002\u0000"+
		"uv~~\u0002\u0000qq\u007f\u0085\u0001\u0000\u0096\u0098\u0002\u0000\u0006"+
		"\u0006\u0017\u0017\u0001\u0000 !\u0002\u0000\u0013\u0013\u0015\u0015\u0001"+
		"\u0000\u0004\u0005\u0001\u0000Z\\\u0001\u0000\u0001V\u057e\u0000\u00fb"+
		"\u0001\u0000\u0000\u0000\u0002\u010d\u0001\u0000\u0000\u0000\u0004\u0116"+
		"\u0001\u0000\u0000\u0000\u0006\u0121\u0001\u0000\u0000\u0000\b\u012d\u0001"+
		"\u0000\u0000\u0000\n\u0131\u0001\u0000\u0000\u0000\f\u0133\u0001\u0000"+
		"\u0000\u0000\u000e\u013c\u0001\u0000\u0000\u0000\u0010\u0141\u0001\u0000"+
		"\u0000\u0000\u0012\u0145\u0001\u0000\u0000\u0000\u0014\u015c\u0001\u0000"+
		"\u0000\u0000\u0016\u015e\u0001\u0000\u0000\u0000\u0018\u0163\u0001\u0000"+
		"\u0000\u0000\u001a\u0172\u0001\u0000\u0000\u0000\u001c\u018e\u0001\u0000"+
		"\u0000\u0000\u001e\u0190\u0001\u0000\u0000\u0000 \u0194\u0001\u0000\u0000"+
		"\u0000\"\u01a0\u0001\u0000\u0000\u0000$\u01a9\u0001\u0000\u0000\u0000"+
		"&\u01b3\u0001\u0000\u0000\u0000(\u01c2\u0001\u0000\u0000\u0000*\u01cb"+
		"\u0001\u0000\u0000\u0000,\u01d5\u0001\u0000\u0000\u0000.\u01db\u0001\u0000"+
		"\u0000\u00000\u01dd\u0001\u0000\u0000\u00002\u01e1\u0001\u0000\u0000\u0000"+
		"4\u01e5\u0001\u0000\u0000\u00006\u01ea\u0001\u0000\u0000\u00008\u01ec"+
		"\u0001\u0000\u0000\u0000:\u01f8\u0001\u0000\u0000\u0000<\u01fc\u0001\u0000"+
		"\u0000\u0000>\u01fe\u0001\u0000\u0000\u0000@\u020b\u0001\u0000\u0000\u0000"+
		"B\u020d\u0001\u0000\u0000\u0000D\u020f\u0001\u0000\u0000\u0000F\u0213"+
		"\u0001\u0000\u0000\u0000H\u0223\u0001\u0000\u0000\u0000J\u022a\u0001\u0000"+
		"\u0000\u0000L\u022f\u0001\u0000\u0000\u0000N\u0233\u0001\u0000\u0000\u0000"+
		"P\u023a\u0001\u0000\u0000\u0000R\u023e\u0001\u0000\u0000\u0000T\u0240"+
		"\u0001\u0000\u0000\u0000V\u0264\u0001\u0000\u0000\u0000X\u0269\u0001\u0000"+
		"\u0000\u0000Z\u026b\u0001\u0000\u0000\u0000\\\u026e\u0001\u0000\u0000"+
		"\u0000^\u0270\u0001\u0000\u0000\u0000`\u0272\u0001\u0000\u0000\u0000b"+
		"\u0274\u0001\u0000\u0000\u0000d\u0276\u0001\u0000\u0000\u0000f\u0278\u0001"+
		"\u0000\u0000\u0000h\u0284\u0001\u0000\u0000\u0000j\u02cc\u0001\u0000\u0000"+
		"\u0000l\u02d6\u0001\u0000\u0000\u0000n\u02de\u0001\u0000\u0000\u0000p"+
		"\u02e0\u0001\u0000\u0000\u0000r\u02e2\u0001\u0000\u0000\u0000t\u02e4\u0001"+
		"\u0000\u0000\u0000v\u02ef\u0001\u0000\u0000\u0000x\u02f1\u0001\u0000\u0000"+
		"\u0000z\u02f5\u0001\u0000\u0000\u0000|\u0302\u0001\u0000\u0000\u0000~"+
		"\u0304\u0001\u0000\u0000\u0000\u0080\u0309\u0001\u0000\u0000\u0000\u0082"+
		"\u030d\u0001\u0000\u0000\u0000\u0084\u0311\u0001\u0000\u0000\u0000\u0086"+
		"\u031c\u0001\u0000\u0000\u0000\u0088\u031e\u0001\u0000\u0000\u0000\u008a"+
		"\u0326\u0001\u0000\u0000\u0000\u008c\u0328\u0001\u0000\u0000\u0000\u008e"+
		"\u0354\u0001\u0000\u0000\u0000\u0090\u035a\u0001\u0000\u0000\u0000\u0092"+
		"\u0386\u0001\u0000\u0000\u0000\u0094\u0388\u0001\u0000\u0000\u0000\u0096"+
		"\u03b4\u0001\u0000\u0000\u0000\u0098\u03b6\u0001\u0000\u0000\u0000\u009a"+
		"\u03bb\u0001\u0000\u0000\u0000\u009c\u03c5\u0001\u0000\u0000\u0000\u009e"+
		"\u03c9\u0001\u0000\u0000\u0000\u00a0\u03cb\u0001\u0000\u0000\u0000\u00a2"+
		"\u03d5\u0001\u0000\u0000\u0000\u00a4\u03dc\u0001\u0000\u0000\u0000\u00a6"+
		"\u03e3\u0001\u0000\u0000\u0000\u00a8\u03ea\u0001\u0000\u0000\u0000\u00aa"+
		"\u03ec\u0001\u0000\u0000\u0000\u00ac\u03ee\u0001\u0000\u0000\u0000\u00ae"+
		"\u03f9\u0001\u0000\u0000\u0000\u00b0\u041a\u0001\u0000\u0000\u0000\u00b2"+
		"\u041c\u0001\u0000\u0000\u0000\u00b4\u0420\u0001\u0000\u0000\u0000\u00b6"+
		"\u0424\u0001\u0000\u0000\u0000\u00b8\u042b\u0001\u0000\u0000\u0000\u00ba"+
		"\u044c\u0001\u0000\u0000\u0000\u00bc\u044e\u0001\u0000\u0000\u0000\u00be"+
		"\u0452\u0001\u0000\u0000\u0000\u00c0\u0456\u0001\u0000\u0000\u0000\u00c2"+
		"\u045a\u0001\u0000\u0000\u0000\u00c4\u045f\u0001\u0000\u0000\u0000\u00c6"+
		"\u0464\u0001\u0000\u0000\u0000\u00c8\u0470\u0001\u0000\u0000\u0000\u00ca"+
		"\u0474\u0001\u0000\u0000\u0000\u00cc\u047b\u0001\u0000\u0000\u0000\u00ce"+
		"\u048f\u0001\u0000\u0000\u0000\u00d0\u04a2\u0001\u0000\u0000\u0000\u00d2"+
		"\u04a4\u0001\u0000\u0000\u0000\u00d4\u04b0\u0001\u0000\u0000\u0000\u00d6"+
		"\u04b3\u0001\u0000\u0000\u0000\u00d8\u04b8\u0001\u0000\u0000\u0000\u00da"+
		"\u04bd\u0001\u0000\u0000\u0000\u00dc\u04c2\u0001\u0000\u0000\u0000\u00de"+
		"\u04c7\u0001\u0000\u0000\u0000\u00e0\u04d9\u0001\u0000\u0000\u0000\u00e2"+
		"\u04db\u0001\u0000\u0000\u0000\u00e4\u04e1\u0001\u0000\u0000\u0000\u00e6"+
		"\u04e3\u0001\u0000\u0000\u0000\u00e8\u04ea\u0001\u0000\u0000\u0000\u00ea"+
		"\u04fd\u0001\u0000\u0000\u0000\u00ec\u04ff\u0001\u0000\u0000\u0000\u00ee"+
		"\u0505\u0001\u0000\u0000\u0000\u00f0\u0507\u0001\u0000\u0000\u0000\u00f2"+
		"\u0509\u0001\u0000\u0000\u0000\u00f4\u050d\u0001\u0000\u0000\u0000\u00f6"+
		"\u050f\u0001\u0000\u0000\u0000\u00f8\u0513\u0001\u0000\u0000\u0000\u00fa"+
		"\u00fc\u0005]\u0000\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fb\u00fc"+
		"\u0001\u0000\u0000\u0000\u00fc\u0100\u0001\u0000\u0000\u0000\u00fd\u00ff"+
		"\u0003\u0002\u0001\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00ff\u0102"+
		"\u0001\u0000\u0000\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u0101"+
		"\u0001\u0000\u0000\u0000\u0101\u0108\u0001\u0000\u0000\u0000\u0102\u0100"+
		"\u0001\u0000\u0000\u0000\u0103\u0107\u0003\u0004\u0002\u0000\u0104\u0107"+
		"\u0003\f\u0006\u0000\u0105\u0107\u0003:\u001d\u0000\u0106\u0103\u0001"+
		"\u0000\u0000\u0000\u0106\u0104\u0001\u0000\u0000\u0000\u0106\u0105\u0001"+
		"\u0000\u0000\u0000\u0107\u010a\u0001\u0000\u0000\u0000\u0108\u0106\u0001"+
		"\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010b\u0001"+
		"\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010b\u010c\u0005"+
		"\u0000\u0000\u0001\u010c\u0001\u0001\u0000\u0000\u0000\u010d\u010e\u0005"+
		"O\u0000\u0000\u010e\u0113\u0003\u00f8|\u0000\u010f\u0110\u0005i\u0000"+
		"\u0000\u0110\u0112\u0003\u00f8|\u0000\u0111\u010f\u0001\u0000\u0000\u0000"+
		"\u0112\u0115\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000"+
		"\u0113\u0114\u0001\u0000\u0000\u0000\u0114\u0003\u0001\u0000\u0000\u0000"+
		"\u0115\u0113\u0001\u0000\u0000\u0000\u0116\u011c\u0003\u0006\u0003\u0000"+
		"\u0117\u011b\u0003\u0004\u0002\u0000\u0118\u011b\u0003\f\u0006\u0000\u0119"+
		"\u011b\u0003:\u001d\u0000\u011a\u0117\u0001\u0000\u0000\u0000\u011a\u0118"+
		"\u0001\u0000\u0000\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011e"+
		"\u0001\u0000\u0000\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d"+
		"\u0001\u0000\u0000\u0000\u011d\u011f\u0001\u0000\u0000\u0000\u011e\u011c"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0003\b\u0004\u0000\u0120\u0005\u0001"+
		"\u0000\u0000\u0000\u0121\u0122\u0005A\u0000\u0000\u0122\u0127\u0003\u00f8"+
		"|\u0000\u0123\u0124\u0005i\u0000\u0000\u0124\u0126\u0003\u00f8|\u0000"+
		"\u0125\u0123\u0001\u0000\u0000\u0000\u0126\u0129\u0001\u0000\u0000\u0000"+
		"\u0127\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000\u0000"+
		"\u0128\u012b\u0001\u0000\u0000\u0000\u0129\u0127\u0001\u0000\u0000\u0000"+
		"\u012a\u012c\u00054\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012b"+
		"\u012c\u0001\u0000\u0000\u0000\u012c\u0007\u0001\u0000\u0000\u0000\u012d"+
		"\u012f\u0005\u001c\u0000\u0000\u012e\u0130\u0005A\u0000\u0000\u012f\u012e"+
		"\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000\u0130\t\u0001"+
		"\u0000\u0000\u0000\u0131\u0132\u0007\u0000\u0000\u0000\u0132\u000b\u0001"+
		"\u0000\u0000\u0000\u0133\u0137\u0003\u000e\u0007\u0000\u0134\u0136\u0003"+
		":\u001d\u0000\u0135\u0134\u0001\u0000\u0000\u0000\u0136\u0139\u0001\u0000"+
		"\u0000\u0000\u0137\u0135\u0001\u0000\u0000\u0000\u0137\u0138\u0001\u0000"+
		"\u0000\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0137\u0001\u0000"+
		"\u0000\u0000\u013a\u013b\u0003\u0010\b\u0000\u013b\r\u0001\u0000\u0000"+
		"\u0000\u013c\u013f\u0005K\u0000\u0000\u013d\u0140\u0003\u0012\t\u0000"+
		"\u013e\u0140\u0003\u0016\u000b\u0000\u013f\u013d\u0001\u0000\u0000\u0000"+
		"\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u000f\u0001\u0000\u0000\u0000"+
		"\u0141\u0143\u0005\u001c\u0000\u0000\u0142\u0144\u0005K\u0000\u0000\u0143"+
		"\u0142\u0001\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144"+
		"\u0011\u0001\u0000\u0000\u0000\u0145\u0146\u0005\u0017\u0000\u0000\u0146"+
		"\u0147\u0005k\u0000\u0000\u0147\u014c\u0003\u0014\n\u0000\u0148\u0149"+
		"\u0005j\u0000\u0000\u0149\u014b\u0003\u0014\n\u0000\u014a\u0148\u0001"+
		"\u0000\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001"+
		"\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001"+
		"\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0005"+
		"l\u0000\u0000\u0150\u0013\u0001\u0000\u0000\u0000\u0151\u0152\u0005B\u0000"+
		"\u0000\u0152\u0153\u0005k\u0000\u0000\u0153\u0154\u0005\\\u0000\u0000"+
		"\u0154\u015d\u0005l\u0000\u0000\u0155\u0159\u0005\u0003\u0000\u0000\u0156"+
		"\u0157\u0005k\u0000\u0000\u0157\u0158\u0005b\u0000\u0000\u0158\u015a\u0005"+
		"l\u0000\u0000\u0159\u0156\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000"+
		"\u0000\u0000\u015a\u015d\u0001\u0000\u0000\u0000\u015b\u015d\u0005<\u0000"+
		"\u0000\u015c\u0151\u0001\u0000\u0000\u0000\u015c\u0155\u0001\u0000\u0000"+
		"\u0000\u015c\u015b\u0001\u0000\u0000\u0000\u015d\u0015\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u00055\u0000\u0000\u015f\u0160\u0005k\u0000\u0000\u0160"+
		"\u0161\u0003\u0018\f\u0000\u0161\u0162\u0005l\u0000\u0000\u0162\u0017"+
		"\u0001\u0000\u0000\u0000\u0163\u0168\u0003\u001a\r\u0000\u0164\u0165\u0005"+
		"j\u0000\u0000\u0165\u0167\u0003\u001a\r\u0000\u0166\u0164\u0001\u0000"+
		"\u0000\u0000\u0167\u016a\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000"+
		"\u0000\u0000\u0168\u0169\u0001\u0000\u0000\u0000\u0169\u0019\u0001\u0000"+
		"\u0000\u0000\u016a\u0168\u0001\u0000\u0000\u0000\u016b\u0173\u0005\u0014"+
		"\u0000\u0000\u016c\u0173\u0005-\u0000\u0000\u016d\u016e\u0005B\u0000\u0000"+
		"\u016e\u016f\u0005k\u0000\u0000\u016f\u0170\u0005\\\u0000\u0000\u0170"+
		"\u0173\u0005l\u0000\u0000\u0171\u0173\u0005<\u0000\u0000\u0172\u016b\u0001"+
		"\u0000\u0000\u0000\u0172\u016c\u0001\u0000\u0000\u0000\u0172\u016d\u0001"+
		"\u0000\u0000\u0000\u0172\u0171\u0001\u0000\u0000\u0000\u0173\u001b\u0001"+
		"\u0000\u0000\u0000\u0174\u0179\u0003&\u0013\u0000\u0175\u0178\u0003:\u001d"+
		"\u0000\u0176\u0178\u0003@ \u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0177"+
		"\u0176\u0001\u0000\u0000\u0000\u0178\u017b\u0001\u0000\u0000\u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a"+
		"\u017c\u0001\u0000\u0000\u0000\u017b\u0179\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u00030\u0018\u0000\u017d\u018f\u0001\u0000\u0000\u0000\u017e\u017f"+
		"\u00055\u0000\u0000\u017f\u0181\u0003\u00f8|\u0000\u0180\u0182\u0003\u00ac"+
		"V\u0000\u0181\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000"+
		"\u0000\u0182\u0183\u0001\u0000\u0000\u0000\u0183\u0184\u0005)\u0000\u0000"+
		"\u0184\u0189\u0003\u001e\u000f\u0000\u0185\u0188\u0003:\u001d\u0000\u0186"+
		"\u0188\u0003 \u0010\u0000\u0187\u0185\u0001\u0000\u0000\u0000\u0187\u0186"+
		"\u0001\u0000\u0000\u0000\u0188\u018b\u0001\u0000\u0000\u0000\u0189\u0187"+
		"\u0001\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c"+
		"\u0001\u0000\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000\u018c\u018d"+
		"\u0005\u001c\u0000\u0000\u018d\u018f\u0001\u0000\u0000\u0000\u018e\u0174"+
		"\u0001\u0000\u0000\u0000\u018e\u017e\u0001\u0000\u0000\u0000\u018f\u001d"+
		"\u0001\u0000\u0000\u0000\u0190\u0191\u0005k\u0000\u0000\u0191\u0192\u0003"+
		"\u00f8|\u0000\u0192\u0193\u0005l\u0000\u0000\u0193\u001f\u0001\u0000\u0000"+
		"\u0000\u0194\u0196\u0005\b\u0000\u0000\u0195\u0197\u0003\"\u0011\u0000"+
		"\u0196\u0195\u0001\u0000\u0000\u0000\u0196\u0197\u0001\u0000\u0000\u0000"+
		"\u0197\u019b\u0001\u0000\u0000\u0000\u0198\u019a\u0003<\u001e\u0000\u0199"+
		"\u0198\u0001\u0000\u0000\u0000\u019a\u019d\u0001\u0000\u0000\u0000\u019b"+
		"\u0199\u0001\u0000\u0000\u0000\u019b\u019c\u0001\u0000\u0000\u0000\u019c"+
		"\u019e\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000\u0000\u019e"+
		"\u019f\u0005\u001c\u0000\u0000\u019f!\u0001\u0000\u0000\u0000\u01a0\u01a5"+
		"\u0005k\u0000\u0000\u01a1\u01a2\u0005B\u0000\u0000\u01a2\u01a3\u0005k"+
		"\u0000\u0000\u01a3\u01a4\u0005\\\u0000\u0000\u01a4\u01a6\u0005l\u0000"+
		"\u0000\u01a5\u01a1\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000"+
		"\u0000\u01a6\u01a7\u0001\u0000\u0000\u0000\u01a7\u01a8\u0005l\u0000\u0000"+
		"\u01a8#\u0001\u0000\u0000\u0000\u01a9\u01ae\u0003(\u0014\u0000\u01aa\u01ad"+
		"\u0003:\u001d\u0000\u01ab\u01ad\u0003@ \u0000\u01ac\u01aa\u0001\u0000"+
		"\u0000\u0000\u01ac\u01ab\u0001\u0000\u0000\u0000\u01ad\u01b0\u0001\u0000"+
		"\u0000\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01ae\u01af\u0001\u0000"+
		"\u0000\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000"+
		"\u0000\u0000\u01b1\u01b2\u00032\u0019\u0000\u01b2%\u0001\u0000\u0000\u0000"+
		"\u01b3\u01b4\u00055\u0000\u0000\u01b4\u01b6\u0003\u00f8|\u0000\u01b5\u01b7"+
		"\u0003\u00acV\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000\u01b6\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8\u01ba\u0003"+
		",\u0016\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01b9\u01ba\u0001\u0000"+
		"\u0000\u0000\u01ba\u01c0\u0001\u0000\u0000\u0000\u01bb\u01bc\u0005K\u0000"+
		"\u0000\u01bc\u01bd\u0005k\u0000\u0000\u01bd\u01be\u0003\u0018\f\u0000"+
		"\u01be\u01bf\u0005l\u0000\u0000\u01bf\u01c1\u0001\u0000\u0000\u0000\u01c0"+
		"\u01bb\u0001\u0000\u0000\u0000\u01c0\u01c1\u0001\u0000\u0000\u0000\u01c1"+
		"\'\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005\"\u0000\u0000\u01c3\u01c5"+
		"\u0003\u00f8|\u0000\u01c4\u01c6\u0003\u00acV\u0000\u01c5\u01c4\u0001\u0000"+
		"\u0000\u0000\u01c5\u01c6\u0001\u0000\u0000\u0000\u01c6\u01c7\u0001\u0000"+
		"\u0000\u0000\u01c7\u01c9\u00034\u001a\u0000\u01c8\u01ca\u0003.\u0017\u0000"+
		"\u01c9\u01c8\u0001\u0000\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000"+
		"\u01ca)\u0001\u0000\u0000\u0000\u01cb\u01cc\u0005k\u0000\u0000\u01cc\u01cd"+
		"\u0003\u00f8|\u0000\u01cd\u01ce\u0005l\u0000\u0000\u01ce+\u0001\u0000"+
		"\u0000\u0000\u01cf\u01d6\u0005,\u0000\u0000\u01d0\u01d1\u0005)\u0000\u0000"+
		"\u01d1\u01d6\u0003*\u0015\u0000\u01d2\u01d6\u00059\u0000\u0000\u01d3\u01d6"+
		"\u0005(\u0000\u0000\u01d4\u01d6\u0005\u0015\u0000\u0000\u01d5\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d0\u0001\u0000\u0000\u0000\u01d5\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001"+
		"\u0000\u0000\u0000\u01d6-\u0001\u0000\u0000\u0000\u01d7\u01d8\u0005)\u0000"+
		"\u0000\u01d8\u01dc\u0003*\u0015\u0000\u01d9\u01dc\u00059\u0000\u0000\u01da"+
		"\u01dc\u0005\u0013\u0000\u0000\u01db\u01d7\u0001\u0000\u0000\u0000\u01db"+
		"\u01d9\u0001\u0000\u0000\u0000\u01db\u01da\u0001\u0000\u0000\u0000\u01dc"+
		"/\u0001\u0000\u0000\u0000\u01dd\u01df\u0005\u001c\u0000\u0000\u01de\u01e0"+
		"\u00055\u0000\u0000\u01df\u01de\u0001\u0000\u0000\u0000\u01df\u01e0\u0001"+
		"\u0000\u0000\u0000\u01e01\u0001\u0000\u0000\u0000\u01e1\u01e3\u0005\u001c"+
		"\u0000\u0000\u01e2\u01e4\u0005\"\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000"+
		"\u0000\u01e3\u01e4\u0001\u0000\u0000\u0000\u01e43\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e6\u0005?\u0000\u0000\u01e6\u01e7\u0005k\u0000\u0000\u01e7\u01e8"+
		"\u0003\u0092I\u0000\u01e8\u01e9\u0005l\u0000\u0000\u01e95\u0001\u0000"+
		"\u0000\u0000\u01ea\u01eb\u0005w\u0000\u0000\u01eb7\u0001\u0000\u0000\u0000"+
		"\u01ec\u01f1\u0005^\u0000\u0000\u01ed\u01ee\u0005k\u0000\u0000\u01ee\u01ef"+
		"\u0003\u00f4z\u0000\u01ef\u01f0\u0005l\u0000\u0000\u01f0\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f1\u01ed\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000"+
		"\u0000\u0000\u01f29\u0001\u0000\u0000\u0000\u01f3\u01f9\u0003|>\u0000"+
		"\u01f4\u01f9\u0003\u00d0h\u0000\u01f5\u01f9\u0003\u001c\u000e\u0000\u01f6"+
		"\u01f9\u0003$\u0012\u0000\u01f7\u01f9\u0003B!\u0000\u01f8\u01f3\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f4\u0001\u0000\u0000\u0000\u01f8\u01f5\u0001"+
		"\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000\u01f8\u01f7\u0001"+
		"\u0000\u0000\u0000\u01f9;\u0001\u0000\u0000\u0000\u01fa\u01fd\u0003\n"+
		"\u0005\u0000\u01fb\u01fd\u0003B!\u0000\u01fc\u01fa\u0001\u0000\u0000\u0000"+
		"\u01fc\u01fb\u0001\u0000\u0000\u0000\u01fd=\u0001\u0000\u0000\u0000\u01fe"+
		"\u01ff\u0005\u00a8\u0000\u0000\u01ff?\u0001\u0000\u0000\u0000\u0200\u020c"+
		"\u00038\u001c\u0000\u0201\u020c\u0003D\"\u0000\u0202\u020c\u0003t:\u0000"+
		"\u0203\u020c\u0003v;\u0000\u0204\u020c\u0003\u00aeW\u0000\u0205\u020c"+
		"\u0003\u00b0X\u0000\u0206\u020c\u0003\u00ba]\u0000\u0207\u020c\u0003\u00c6"+
		"c\u0000\u0208\u020c\u0003x<\u0000\u0209\u020c\u0003z=\u0000\u020a\u020c"+
		"\u0003B!\u0000\u020b\u0200\u0001\u0000\u0000\u0000\u020b\u0201\u0001\u0000"+
		"\u0000\u0000\u020b\u0202\u0001\u0000\u0000\u0000\u020b\u0203\u0001\u0000"+
		"\u0000\u0000\u020b\u0204\u0001\u0000\u0000\u0000\u020b\u0205\u0001\u0000"+
		"\u0000\u0000\u020b\u0206\u0001\u0000\u0000\u0000\u020b\u0207\u0001\u0000"+
		"\u0000\u0000\u020b\u0208\u0001\u0000\u0000\u0000\u020b\u0209\u0001\u0000"+
		"\u0000\u0000\u020b\u020a\u0001\u0000\u0000\u0000\u020cA\u0001\u0000\u0000"+
		"\u0000\u020d\u020e\u0005w\u0000\u0000\u020eC\u0001\u0000\u0000\u0000\u020f"+
		"\u0210\u0003F#\u0000\u0210\u0211\u0007\u0001\u0000\u0000\u0211\u0212\u0003"+
		"h4\u0000\u0212E\u0001\u0000\u0000\u0000\u0213\u0214\u0006#\uffff\uffff"+
		"\u0000\u0214\u0216\u0003L&\u0000\u0215\u0217\u0003J%\u0000\u0216\u0215"+
		"\u0001\u0000\u0000\u0000\u0216\u0217\u0001\u0000\u0000\u0000\u0217\u0220"+
		"\u0001\u0000\u0000\u0000\u0218\u0219\n\u0002\u0000\u0000\u0219\u021a\u0005"+
		"g\u0000\u0000\u021a\u021c\u0003L&\u0000\u021b\u021d\u0003J%\u0000\u021c"+
		"\u021b\u0001\u0000\u0000\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d"+
		"\u021f\u0001\u0000\u0000\u0000\u021e\u0218\u0001\u0000\u0000\u0000\u021f"+
		"\u0222\u0001\u0000\u0000\u0000\u0220\u021e\u0001\u0000\u0000\u0000\u0220"+
		"\u0221\u0001\u0000\u0000\u0000\u0221G\u0001\u0000\u0000\u0000\u0222\u0220"+
		"\u0001\u0000\u0000\u0000\u0223\u0225\u0005k\u0000\u0000\u0224\u0226\u0003"+
		"T*\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000"+
		"\u0000\u0226\u0227\u0001\u0000\u0000\u0000\u0227\u0228\u0005l\u0000\u0000"+
		"\u0228I\u0001\u0000\u0000\u0000\u0229\u022b\u0003H$\u0000\u022a\u0229"+
		"\u0001\u0000\u0000\u0000\u022b\u022c\u0001\u0000\u0000\u0000\u022c\u022a"+
		"\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022dK\u0001"+
		"\u0000\u0000\u0000\u022e\u0230\u0003P(\u0000\u022f\u022e\u0001\u0000\u0000"+
		"\u0000\u022f\u0230\u0001\u0000\u0000\u0000\u0230\u0231\u0001\u0000\u0000"+
		"\u0000\u0231\u0232\u0003\u00f8|\u0000\u0232M\u0001\u0000\u0000\u0000\u0233"+
		"\u0235\u0003\u00f8|\u0000\u0234\u0236\u0003H$\u0000\u0235\u0234\u0001"+
		"\u0000\u0000\u0000\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0237\u0001"+
		"\u0000\u0000\u0000\u0237\u0238\u0005i\u0000\u0000\u0238O\u0001\u0000\u0000"+
		"\u0000\u0239\u023b\u0003N\'\u0000\u023a\u0239\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023a\u0001\u0000\u0000\u0000"+
		"\u023c\u023d\u0001\u0000\u0000\u0000\u023dQ\u0001\u0000\u0000\u0000\u023e"+
		"\u023f\u0003h4\u0000\u023fS\u0001\u0000\u0000\u0000\u0240\u0245\u0003"+
		"R)\u0000\u0241\u0242\u0005j\u0000\u0000\u0242\u0244\u0003R)\u0000\u0243"+
		"\u0241\u0001\u0000\u0000\u0000\u0244\u0247\u0001\u0000\u0000\u0000\u0245"+
		"\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001\u0000\u0000\u0000\u0246"+
		"U\u0001\u0000\u0000\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0248\u0249"+
		"\u0005k\u0000\u0000\u0249\u024a\u0003h4\u0000\u024a\u024b\u0005l\u0000"+
		"\u0000\u024b\u0265\u0001\u0000\u0000\u0000\u024c\u024d\u0005\u008d\u0000"+
		"\u0000\u024d\u024e\u0003h4\u0000\u024e\u024f\u0005l\u0000\u0000\u024f"+
		"\u0265\u0001\u0000\u0000\u0000\u0250\u0251\u0005\u008e\u0000\u0000\u0251"+
		"\u0252\u0003h4\u0000\u0252\u0253\u0005l\u0000\u0000\u0253\u0265\u0001"+
		"\u0000\u0000\u0000\u0254\u0255\u0005\u0091\u0000\u0000\u0255\u0256\u0003"+
		"h4\u0000\u0256\u0257\u0005l\u0000\u0000\u0257\u0265\u0001\u0000\u0000"+
		"\u0000\u0258\u0259\u0005\u008f\u0000\u0000\u0259\u025a\u0003h4\u0000\u025a"+
		"\u025b\u0005l\u0000\u0000\u025b\u0265\u0001\u0000\u0000\u0000\u025c\u025d"+
		"\u0005\u0090\u0000\u0000\u025d\u025e\u0003h4\u0000\u025e\u025f\u0005l"+
		"\u0000\u0000\u025f\u0265\u0001\u0000\u0000\u0000\u0260\u0261\u0005\u0092"+
		"\u0000\u0000\u0261\u0262\u0003h4\u0000\u0262\u0263\u0005l\u0000\u0000"+
		"\u0263\u0265\u0001\u0000\u0000\u0000\u0264\u0248\u0001\u0000\u0000\u0000"+
		"\u0264\u024c\u0001\u0000\u0000\u0000\u0264\u0250\u0001\u0000\u0000\u0000"+
		"\u0264\u0254\u0001\u0000\u0000\u0000\u0264\u0258\u0001\u0000\u0000\u0000"+
		"\u0264\u025c\u0001\u0000\u0000\u0000\u0264\u0260\u0001\u0000\u0000\u0000"+
		"\u0265W\u0001\u0000\u0000\u0000\u0266\u026a\u0003\u00eew\u0000\u0267\u026a"+
		"\u0003\u00ecv\u0000\u0268\u026a\u0003F#\u0000\u0269\u0266\u0001\u0000"+
		"\u0000\u0000\u0269\u0267\u0001\u0000\u0000\u0000\u0269\u0268\u0001\u0000"+
		"\u0000\u0000\u026aY\u0001\u0000\u0000\u0000\u026b\u026c\u0003n7\u0000"+
		"\u026c\u026d\u0003h4\u0000\u026d[\u0001\u0000\u0000\u0000\u026e\u026f"+
		"\u0007\u0002\u0000\u0000\u026f]\u0001\u0000\u0000\u0000\u0270\u0271\u0007"+
		"\u0003\u0000\u0000\u0271_\u0001\u0000\u0000\u0000\u0272\u0273\u0007\u0004"+
		"\u0000\u0000\u0273a\u0001\u0000\u0000\u0000\u0274\u0275\u0007\u0005\u0000"+
		"\u0000\u0275c\u0001\u0000\u0000\u0000\u0276\u0277\u0007\u0006\u0000\u0000"+
		"\u0277e\u0001\u0000\u0000\u0000\u0278\u0279\u0007\u0007\u0000\u0000\u0279"+
		"g\u0001\u0000\u0000\u0000\u027a\u027b\u00064\uffff\uffff\u0000\u027b\u0285"+
		"\u0003X,\u0000\u027c\u0285\u0003V+\u0000\u027d\u0285\u0003Z-\u0000\u027e"+
		"\u027f\u0003H$\u0000\u027f\u0282\u0005h\u0000\u0000\u0280\u0283\u0003"+
		"j5\u0000\u0281\u0283\u0003l6\u0000\u0282\u0280\u0001\u0000\u0000\u0000"+
		"\u0282\u0281\u0001\u0000\u0000\u0000\u0283\u0285\u0001\u0000\u0000\u0000"+
		"\u0284\u027a\u0001\u0000\u0000\u0000\u0284\u027c\u0001\u0000\u0000\u0000"+
		"\u0284\u027d\u0001\u0000\u0000\u0000\u0284\u027e\u0001\u0000\u0000\u0000"+
		"\u0285\u02b6\u0001\u0000\u0000\u0000\u0286\u0287\n\r\u0000\u0000\u0287"+
		"\u0288\u0005x\u0000\u0000\u0288\u02b5\u0003h4\r\u0289\u028a\n\f\u0000"+
		"\u0000\u028a\u028b\u0003`0\u0000\u028b\u028c\u0003h4\r\u028c\u02b5\u0001"+
		"\u0000\u0000\u0000\u028d\u028e\n\u000b\u0000\u0000\u028e\u028f\u0003^"+
		"/\u0000\u028f\u0290\u0003h4\f\u0290\u02b5\u0001\u0000\u0000\u0000\u0291"+
		"\u0292\n\n\u0000\u0000\u0292\u0293\u0003\\.\u0000\u0293\u0294\u0003h4"+
		"\u000b\u0294\u02b5\u0001\u0000\u0000\u0000\u0295\u0296\n\t\u0000\u0000"+
		"\u0296\u0297\u0005\u0095\u0000\u0000\u0297\u02b5\u0003h4\n\u0298\u0299"+
		"\n\b\u0000\u0000\u0299\u029a\u0003p8\u0000\u029a\u029b\u0003h4\t\u029b"+
		"\u02b5\u0001\u0000\u0000\u0000\u029c\u029d\n\u0007\u0000\u0000\u029d\u029e"+
		"\u0003b1\u0000\u029e\u029f\u0003h4\b\u029f\u02b5\u0001\u0000\u0000\u0000"+
		"\u02a0\u02a1\n\u0006\u0000\u0000\u02a1\u02a2\u0003d2\u0000\u02a2\u02a3"+
		"\u0003h4\u0007\u02a3\u02b5\u0001\u0000\u0000\u0000\u02a4\u02a5\n\u0005"+
		"\u0000\u0000\u02a5\u02a6\u0003f3\u0000\u02a6\u02a7\u0003h4\u0006\u02a7"+
		"\u02b5\u0001\u0000\u0000\u0000\u02a8\u02a9\n\u0004\u0000\u0000\u02a9\u02aa"+
		"\u0005\u0093\u0000\u0000\u02aa\u02b5\u0003h4\u0005\u02ab\u02ac\n\u0003"+
		"\u0000\u0000\u02ac\u02ad\u0005\u0094\u0000\u0000\u02ad\u02b5\u0003h4\u0004"+
		"\u02ae\u02af\n\u0002\u0000\u0000\u02af\u02b2\u0005h\u0000\u0000\u02b0"+
		"\u02b3\u0003j5\u0000\u02b1\u02b3\u0003l6\u0000\u02b2\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b2\u02b1\u0001\u0000\u0000\u0000\u02b3\u02b5\u0001\u0000"+
		"\u0000\u0000\u02b4\u0286\u0001\u0000\u0000\u0000\u02b4\u0289\u0001\u0000"+
		"\u0000\u0000\u02b4\u028d\u0001\u0000\u0000\u0000\u02b4\u0291\u0001\u0000"+
		"\u0000\u0000\u02b4\u0295\u0001\u0000\u0000\u0000\u02b4\u0298\u0001\u0000"+
		"\u0000\u0000\u02b4\u029c\u0001\u0000\u0000\u0000\u02b4\u02a0\u0001\u0000"+
		"\u0000\u0000\u02b4\u02a4\u0001\u0000\u0000\u0000\u02b4\u02a8\u0001\u0000"+
		"\u0000\u0000\u02b4\u02ab\u0001\u0000\u0000\u0000\u02b4\u02ae\u0001\u0000"+
		"\u0000\u0000\u02b5\u02b8\u0001\u0000\u0000\u0000\u02b6\u02b4\u0001\u0000"+
		"\u0000\u0000\u02b6\u02b7\u0001\u0000\u0000\u0000\u02b7i\u0001\u0000\u0000"+
		"\u0000\u02b8\u02b6\u0001\u0000\u0000\u0000\u02b9\u02bc\u0005k\u0000\u0000"+
		"\u02ba\u02bd\u0003h4\u0000\u02bb\u02bd\u0003H$\u0000\u02bc\u02ba\u0001"+
		"\u0000\u0000\u0000\u02bc\u02bb\u0001\u0000\u0000\u0000\u02bd\u02c5\u0001"+
		"\u0000\u0000\u0000\u02be\u02c1\u0005j\u0000\u0000\u02bf\u02c2\u0003h4"+
		"\u0000\u02c0\u02c2\u0003H$\u0000\u02c1\u02bf\u0001\u0000\u0000\u0000\u02c1"+
		"\u02c0\u0001\u0000\u0000\u0000\u02c2\u02c4\u0001\u0000\u0000\u0000\u02c3"+
		"\u02be\u0001\u0000\u0000\u0000\u02c4\u02c7\u0001\u0000\u0000\u0000\u02c5"+
		"\u02c3\u0001\u0000\u0000\u0000\u02c5\u02c6\u0001\u0000\u0000\u0000\u02c6"+
		"\u02c8\u0001\u0000\u0000\u0000\u02c7\u02c5\u0001\u0000\u0000\u0000\u02c8"+
		"\u02c9\u0005y\u0000\u0000\u02c9\u02ca\u0003h4\u0000\u02ca\u02cb\u0005"+
		"l\u0000\u0000\u02cb\u02cd\u0001\u0000\u0000\u0000\u02cc\u02b9\u0001\u0000"+
		"\u0000\u0000\u02cd\u02ce\u0001\u0000\u0000\u0000\u02ce\u02cc\u0001\u0000"+
		"\u0000\u0000\u02ce\u02cf\u0001\u0000\u0000\u0000\u02cf\u02d4\u0001\u0000"+
		"\u0000\u0000\u02d0\u02d1\u0005k\u0000\u0000\u02d1\u02d2\u0003h4\u0000"+
		"\u02d2\u02d3\u0005l\u0000\u0000\u02d3\u02d5\u0001\u0000\u0000\u0000\u02d4"+
		"\u02d0\u0001\u0000\u0000\u0000\u02d4\u02d5\u0001\u0000\u0000\u0000\u02d5"+
		"k\u0001\u0000\u0000\u0000\u02d6\u02d7\u0005k\u0000\u0000\u02d7\u02d8\u0003"+
		"h4\u0000\u02d8\u02d9\u0005l\u0000\u0000\u02d9\u02da\u0001\u0000\u0000"+
		"\u0000\u02da\u02db\u0005k\u0000\u0000\u02db\u02dc\u0003h4\u0000\u02dc"+
		"\u02dd\u0005l\u0000\u0000\u02ddm\u0001\u0000\u0000\u0000\u02de\u02df\u0007"+
		"\b\u0000\u0000\u02dfo\u0001\u0000\u0000\u0000\u02e0\u02e1\u0007\t\u0000"+
		"\u0000\u02e1q\u0001\u0000\u0000\u0000\u02e2\u02e3\u0007\n\u0000\u0000"+
		"\u02e3s\u0001\u0000\u0000\u0000\u02e4\u02e5\u0005\u0011\u0000\u0000\u02e5"+
		"\u02e6\u0003F#\u0000\u02e6u\u0001\u0000\u0000\u0000\u02e7\u02e8\u0005"+
		"#\u0000\u0000\u02e8\u02e9\u0003\u00f8|\u0000\u02e9\u02ea\u0005k\u0000"+
		"\u0000\u02ea\u02eb\u0003h4\u0000\u02eb\u02ec\u0005l\u0000\u0000\u02ec"+
		"\u02f0\u0001\u0000\u0000\u0000\u02ed\u02ee\u0005#\u0000\u0000\u02ee\u02f0"+
		"\u0003F#\u0000\u02ef\u02e7\u0001\u0000\u0000\u0000\u02ef\u02ed\u0001\u0000"+
		"\u0000\u0000\u02f0w\u0001\u0000\u0000\u0000\u02f1\u02f3\u0005\u001d\u0000"+
		"\u0000\u02f2\u02f4\u0003\u00f8|\u0000\u02f3\u02f2\u0001\u0000\u0000\u0000"+
		"\u02f3\u02f4\u0001\u0000\u0000\u0000\u02f4y\u0001\u0000\u0000\u0000\u02f5"+
		"\u02f7\u0005;\u0000\u0000\u02f6\u02f8\u0003\u00f8|\u0000\u02f7\u02f6\u0001"+
		"\u0000\u0000\u0000\u02f7\u02f8\u0001\u0000\u0000\u0000\u02f8{\u0001\u0000"+
		"\u0000\u0000\u02f9\u02fa\u0007\u000b\u0000\u0000\u02fa\u02fc\u0003\u00f8"+
		"|\u0000\u02fb\u02fd\u0003\u0084B\u0000\u02fc\u02fb\u0001\u0000\u0000\u0000"+
		"\u02fc\u02fd\u0001\u0000\u0000\u0000\u02fd\u02fe\u0001\u0000\u0000\u0000"+
		"\u02fe\u02ff\u0003~?\u0000\u02ff\u0303\u0001\u0000\u0000\u0000\u0300\u0301"+
		"\u0007\u000b\u0000\u0000\u0301\u0303\u0003\u0080@\u0000\u0302\u02f9\u0001"+
		"\u0000\u0000\u0000\u0302\u0300\u0001\u0000\u0000\u0000\u0303}\u0001\u0000"+
		"\u0000\u0000\u0304\u0305\u0005\u0007\u0000\u0000\u0305\u0307\u0003\u00f8"+
		"|\u0000\u0306\u0308\u0003\u0090H\u0000\u0307\u0306\u0001\u0000\u0000\u0000"+
		"\u0307\u0308\u0001\u0000\u0000\u0000\u0308\u007f\u0001\u0000\u0000\u0000"+
		"\u0309\u030a\u0003\u00f8|\u0000\u030a\u030b\u0003\u0082A\u0000\u030b\u0081"+
		"\u0001\u0000\u0000\u0000\u030c\u030e\u0003\u0084B\u0000\u030d\u030c\u0001"+
		"\u0000\u0000\u0000\u030d\u030e\u0001\u0000\u0000\u0000\u030e\u030f\u0001"+
		"\u0000\u0000\u0000\u030f\u0310\u0003\u008eG\u0000\u0310\u0083\u0001\u0000"+
		"\u0000\u0000\u0311\u0312\u0005k\u0000\u0000\u0312\u0313\u0003\u0088D\u0000"+
		"\u0313\u0314\u0005l\u0000\u0000\u0314\u0085\u0001\u0000\u0000\u0000\u0315"+
		"\u0316\u0003\u008aE\u0000\u0316\u0317\u0005y\u0000\u0000\u0317\u0319\u0001"+
		"\u0000\u0000\u0000\u0318\u0315\u0001\u0000\u0000\u0000\u0318\u0319\u0001"+
		"\u0000\u0000\u0000\u0319\u031a\u0001\u0000\u0000\u0000\u031a\u031d\u0003"+
		"\u008cF\u0000\u031b\u031d\u0005s\u0000\u0000\u031c\u0318\u0001\u0000\u0000"+
		"\u0000\u031c\u031b\u0001\u0000\u0000\u0000\u031d\u0087\u0001\u0000\u0000"+
		"\u0000\u031e\u0323\u0003\u0086C\u0000\u031f\u0320\u0005j\u0000\u0000\u0320"+
		"\u0322\u0003\u0086C\u0000\u0321\u031f\u0001\u0000\u0000\u0000\u0322\u0325"+
		"\u0001\u0000\u0000\u0000\u0323\u0321\u0001\u0000\u0000\u0000\u0323\u0324"+
		"\u0001\u0000\u0000\u0000\u0324\u0089\u0001\u0000\u0000\u0000\u0325\u0323"+
		"\u0001\u0000\u0000\u0000\u0326\u0327\u0003h4\u0000\u0327\u008b\u0001\u0000"+
		"\u0000\u0000\u0328\u0329\u0003h4\u0000\u0329\u008d\u0001\u0000\u0000\u0000"+
		"\u032a\u032c\u0003\u0092I\u0000\u032b\u032d\u0003\u0090H\u0000\u032c\u032b"+
		"\u0001\u0000\u0000\u0000\u032c\u032d\u0001\u0000\u0000\u0000\u032d\u032f"+
		"\u0001\u0000\u0000\u0000\u032e\u0330\u0003\u0096K\u0000\u032f\u032e\u0001"+
		"\u0000\u0000\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0355\u0001"+
		"\u0000\u0000\u0000\u0331\u0333\u0003\u0092I\u0000\u0332\u0334\u0003\u0096"+
		"K\u0000\u0333\u0332\u0001\u0000\u0000\u0000\u0333\u0334\u0001\u0000\u0000"+
		"\u0000\u0334\u0336\u0001\u0000\u0000\u0000\u0335\u0337\u0003\u0090H\u0000"+
		"\u0336\u0335\u0001\u0000\u0000\u0000\u0336\u0337\u0001\u0000\u0000\u0000"+
		"\u0337\u0355\u0001\u0000\u0000\u0000\u0338\u033a\u0003\u0090H\u0000\u0339"+
		"\u033b\u0003\u0092I\u0000\u033a\u0339\u0001\u0000\u0000\u0000\u033a\u033b"+
		"\u0001\u0000\u0000\u0000\u033b\u033d\u0001\u0000\u0000\u0000\u033c\u033e"+
		"\u0003\u0096K\u0000\u033d\u033c\u0001\u0000\u0000\u0000\u033d\u033e\u0001"+
		"\u0000\u0000\u0000\u033e\u0355\u0001\u0000\u0000\u0000\u033f\u0341\u0003"+
		"\u0090H\u0000\u0340\u0342\u0003\u0096K\u0000\u0341\u0340\u0001\u0000\u0000"+
		"\u0000\u0341\u0342\u0001\u0000\u0000\u0000\u0342\u0344\u0001\u0000\u0000"+
		"\u0000\u0343\u0345\u0003\u0092I\u0000\u0344\u0343\u0001\u0000\u0000\u0000"+
		"\u0344\u0345\u0001\u0000\u0000\u0000\u0345\u0355\u0001\u0000\u0000\u0000"+
		"\u0346\u0348\u0003\u0096K\u0000\u0347\u0349\u0003\u0090H\u0000\u0348\u0347"+
		"\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000\u0000\u0349\u034b"+
		"\u0001\u0000\u0000\u0000\u034a\u034c\u0003\u0092I\u0000\u034b\u034a\u0001"+
		"\u0000\u0000\u0000\u034b\u034c\u0001\u0000\u0000\u0000\u034c\u0355\u0001"+
		"\u0000\u0000\u0000\u034d\u034f\u0003\u0096K\u0000\u034e\u0350\u0003\u0092"+
		"I\u0000\u034f\u034e\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000"+
		"\u0000\u0350\u0352\u0001\u0000\u0000\u0000\u0351\u0353\u0003\u0090H\u0000"+
		"\u0352\u0351\u0001\u0000\u0000\u0000\u0352\u0353\u0001\u0000\u0000\u0000"+
		"\u0353\u0355\u0001\u0000\u0000\u0000\u0354\u032a\u0001\u0000\u0000\u0000"+
		"\u0354\u0331\u0001\u0000\u0000\u0000\u0354\u0338\u0001\u0000\u0000\u0000"+
		"\u0354\u033f\u0001\u0000\u0000\u0000\u0354\u0346\u0001\u0000\u0000\u0000"+
		"\u0354\u034d\u0001\u0000\u0000\u0000\u0355\u008f\u0001\u0000\u0000\u0000"+
		"\u0356\u035b\u0005E\u0000\u0000\u0357\u035b\u0005F\u0000\u0000\u0358\u035b"+
		"\u0003\u00a4R\u0000\u0359\u035b\u0003\u00a6S\u0000\u035a\u0356\u0001\u0000"+
		"\u0000\u0000\u035a\u0357\u0001\u0000\u0000\u0000\u035a\u0358\u0001\u0000"+
		"\u0000\u0000\u035a\u0359\u0001\u0000\u0000\u0000\u035b\u0091\u0001\u0000"+
		"\u0000\u0000\u035c\u035e\u0003\u0094J\u0000\u035d\u035c\u0001\u0000\u0000"+
		"\u0000\u035d\u035e\u0001\u0000\u0000\u0000\u035e\u035f\u0001\u0000\u0000"+
		"\u0000\u035f\u0361\u0005\n\u0000\u0000\u0360\u0362\u0003\u009aM\u0000"+
		"\u0361\u0360\u0001\u0000\u0000\u0000\u0361\u0362\u0001\u0000\u0000\u0000"+
		"\u0362\u0387\u0001\u0000\u0000\u0000\u0363\u0365\u0003\u0094J\u0000\u0364"+
		"\u0363\u0001\u0000\u0000\u0000\u0364\u0365\u0001\u0000\u0000\u0000\u0365"+
		"\u0366\u0001\u0000\u0000\u0000\u0366\u0368\u0005\u0016\u0000\u0000\u0367"+
		"\u0369\u0003\u009aM\u0000\u0368\u0367\u0001\u0000\u0000\u0000\u0368\u0369"+
		"\u0001\u0000\u0000\u0000\u0369\u0387\u0001\u0000\u0000\u0000\u036a\u036c"+
		"\u0005\n\u0000\u0000\u036b\u036d\u0003\u009aM\u0000\u036c\u036b\u0001"+
		"\u0000\u0000\u0000\u036c\u036d\u0001\u0000\u0000\u0000\u036d\u036f\u0001"+
		"\u0000\u0000\u0000\u036e\u0370\u0003\u0094J\u0000\u036f\u036e\u0001\u0000"+
		"\u0000\u0000\u036f\u0370\u0001\u0000\u0000\u0000\u0370\u0387\u0001\u0000"+
		"\u0000\u0000\u0371\u0373\u0005\u0016\u0000\u0000\u0372\u0374\u0003\u009a"+
		"M\u0000\u0373\u0372\u0001\u0000\u0000\u0000\u0373\u0374\u0001\u0000\u0000"+
		"\u0000\u0374\u0376\u0001\u0000\u0000\u0000\u0375\u0377\u0003\u0094J\u0000"+
		"\u0376\u0375\u0001\u0000\u0000\u0000\u0376\u0377\u0001\u0000\u0000\u0000"+
		"\u0377\u0387\u0001\u0000\u0000\u0000\u0378\u0387\u00053\u0000\u0000\u0379"+
		"\u037a\u0005\u000b\u0000\u0000\u037a\u0387\u0003\u00a2Q\u0000\u037b\u0387"+
		"\u0005\u0012\u0000\u0000\u037c\u037d\u0005G\u0000\u0000\u037d\u0387\u0003"+
		"\u00a0P\u0000\u037e\u0387\u0005\u001e\u0000\u0000\u037f\u0387\u0005^\u0000"+
		"\u0000\u0380\u0387\u0005/\u0000\u0000\u0381\u0387\u0005S\u0000\u0000\u0382"+
		"\u0387\u0005\u0015\u0000\u0000\u0383\u0387\u0005\u0013\u0000\u0000\u0384"+
		"\u0387\u0005\u000e\u0000\u0000\u0385\u0387\u0005)\u0000\u0000\u0386\u035d"+
		"\u0001\u0000\u0000\u0000\u0386\u0364\u0001\u0000\u0000\u0000\u0386\u036a"+
		"\u0001\u0000\u0000\u0000\u0386\u0371\u0001\u0000\u0000\u0000\u0386\u0378"+
		"\u0001\u0000\u0000\u0000\u0386\u0379\u0001\u0000\u0000\u0000\u0386\u037b"+
		"\u0001\u0000\u0000\u0000\u0386\u037c\u0001\u0000\u0000\u0000\u0386\u037e"+
		"\u0001\u0000\u0000\u0000\u0386\u037f\u0001\u0000\u0000\u0000\u0386\u0380"+
		"\u0001\u0000\u0000\u0000\u0386\u0381\u0001\u0000\u0000\u0000\u0386\u0382"+
		"\u0001\u0000\u0000\u0000\u0386\u0383\u0001\u0000\u0000\u0000\u0386\u0384"+
		"\u0001\u0000\u0000\u0000\u0386\u0385\u0001\u0000\u0000\u0000\u0387\u0093"+
		"\u0001\u0000\u0000\u0000\u0388\u0389\u0007\f\u0000\u0000\u0389\u0095\u0001"+
		"\u0000\u0000\u0000\u038a\u038c\u0005<\u0000\u0000\u038b\u038d\u0005,\u0000"+
		"\u0000\u038c\u038b\u0001\u0000\u0000\u0000\u038c\u038d\u0001\u0000\u0000"+
		"\u0000\u038d\u038f\u0001\u0000\u0000\u0000\u038e\u0390\u0003\u0098L\u0000"+
		"\u038f\u038e\u0001\u0000\u0000\u0000\u038f\u0390\u0001\u0000\u0000\u0000"+
		"\u0390\u03b5\u0001\u0000\u0000\u0000\u0391\u0393\u0005<\u0000\u0000\u0392"+
		"\u0394\u0003\u0098L\u0000\u0393\u0392\u0001\u0000\u0000\u0000\u0393\u0394"+
		"\u0001\u0000\u0000\u0000\u0394\u0396\u0001\u0000\u0000\u0000\u0395\u0397"+
		"\u0005,\u0000\u0000\u0396\u0395\u0001\u0000\u0000\u0000\u0396\u0397\u0001"+
		"\u0000\u0000\u0000\u0397\u03b5\u0001\u0000\u0000\u0000\u0398\u039a\u0005"+
		",\u0000\u0000\u0399\u039b\u0005<\u0000\u0000\u039a\u0399\u0001\u0000\u0000"+
		"\u0000\u039a\u039b\u0001\u0000\u0000\u0000\u039b\u039d\u0001\u0000\u0000"+
		"\u0000\u039c\u039e\u0003\u0098L\u0000\u039d\u039c\u0001\u0000\u0000\u0000"+
		"\u039d\u039e\u0001\u0000\u0000\u0000\u039e\u03b5\u0001\u0000\u0000\u0000"+
		"\u039f\u03a1\u0005,\u0000\u0000\u03a0\u03a2\u0003\u0098L\u0000\u03a1\u03a0"+
		"\u0001\u0000\u0000\u0000\u03a1\u03a2\u0001\u0000\u0000\u0000\u03a2\u03a4"+
		"\u0001\u0000\u0000\u0000\u03a3\u03a5\u0005<\u0000\u0000\u03a4\u03a3\u0001"+
		"\u0000\u0000\u0000\u03a4\u03a5\u0001\u0000\u0000\u0000\u03a5\u03b5\u0001"+
		"\u0000\u0000\u0000\u03a6\u03a8\u0003\u0098L\u0000\u03a7\u03a9\u0005,\u0000"+
		"\u0000\u03a8\u03a7\u0001\u0000\u0000\u0000\u03a8\u03a9\u0001\u0000\u0000"+
		"\u0000\u03a9\u03ab\u0001\u0000\u0000\u0000\u03aa\u03ac\u0005<\u0000\u0000"+
		"\u03ab\u03aa\u0001\u0000\u0000\u0000\u03ab\u03ac\u0001\u0000\u0000\u0000"+
		"\u03ac\u03b5\u0001\u0000\u0000\u0000\u03ad\u03af\u0003\u0098L\u0000\u03ae"+
		"\u03b0\u0005<\u0000\u0000\u03af\u03ae\u0001\u0000\u0000\u0000\u03af\u03b0"+
		"\u0001\u0000\u0000\u0000\u03b0\u03b2\u0001\u0000\u0000\u0000\u03b1\u03b3"+
		"\u0005,\u0000\u0000\u03b2\u03b1\u0001\u0000\u0000\u0000\u03b2\u03b3\u0001"+
		"\u0000\u0000\u0000\u03b3\u03b5\u0001\u0000\u0000\u0000\u03b4\u038a\u0001"+
		"\u0000\u0000\u0000\u03b4\u0391\u0001\u0000\u0000\u0000\u03b4\u0398\u0001"+
		"\u0000\u0000\u0000\u03b4\u039f\u0001\u0000\u0000\u0000\u03b4\u03a6\u0001"+
		"\u0000\u0000\u0000\u03b4\u03ad\u0001\u0000\u0000\u0000\u03b5\u0097\u0001"+
		"\u0000\u0000\u0000\u03b6\u03b7\u0005B\u0000\u0000\u03b7\u03b8\u0005k\u0000"+
		"\u0000\u03b8\u03b9\u0005\\\u0000\u0000\u03b9\u03ba\u0005l\u0000\u0000"+
		"\u03ba\u0099\u0001\u0000\u0000\u0000\u03bb\u03bc\u0005k\u0000\u0000\u03bc"+
		"\u03bf\u0003\u009cN\u0000\u03bd\u03be\u0005j\u0000\u0000\u03be\u03c0\u0003"+
		"\u009eO\u0000\u03bf\u03bd\u0001\u0000\u0000\u0000\u03bf\u03c0\u0001\u0000"+
		"\u0000\u0000\u03c0\u03c1\u0001\u0000\u0000\u0000\u03c1\u03c2\u0005l\u0000"+
		"\u0000\u03c2\u009b\u0001\u0000\u0000\u0000\u03c3\u03c6\u0005b\u0000\u0000"+
		"\u03c4\u03c6\u0003\u00f8|\u0000\u03c5\u03c3\u0001\u0000\u0000\u0000\u03c5"+
		"\u03c4\u0001\u0000\u0000\u0000\u03c6\u009d\u0001\u0000\u0000\u0000\u03c7"+
		"\u03ca\u0005b\u0000\u0000\u03c8\u03ca\u0003\u00f8|\u0000\u03c9\u03c7\u0001"+
		"\u0000\u0000\u0000\u03c9\u03c8\u0001\u0000\u0000\u0000\u03ca\u009f\u0001"+
		"\u0000\u0000\u0000\u03cb\u03d1\u0005k\u0000\u0000\u03cc\u03d2\u0005s\u0000"+
		"\u0000\u03cd\u03d0\u0005b\u0000\u0000\u03ce\u03d0\u0003\u00f8|\u0000\u03cf"+
		"\u03cd\u0001\u0000\u0000\u0000\u03cf\u03ce\u0001\u0000\u0000\u0000\u03d0"+
		"\u03d2\u0001\u0000\u0000\u0000\u03d1\u03cc\u0001\u0000\u0000\u0000\u03d1"+
		"\u03cf\u0001\u0000\u0000\u0000\u03d2\u03d3\u0001\u0000\u0000\u0000\u03d3"+
		"\u03d4\u0005l\u0000\u0000\u03d4\u00a1\u0001\u0000\u0000\u0000\u03d5\u03d8"+
		"\u0005k\u0000\u0000\u03d6\u03d9\u0005b\u0000\u0000\u03d7\u03d9\u0003\u00f8"+
		"|\u0000\u03d8\u03d6\u0001\u0000\u0000\u0000\u03d8\u03d7\u0001\u0000\u0000"+
		"\u0000\u03d9\u03da\u0001\u0000\u0000\u0000\u03da\u03db\u0005l\u0000\u0000"+
		"\u03db\u00a3\u0001\u0000\u0000\u0000\u03dc\u03e1\u0005\t\u0000\u0000\u03dd"+
		"\u03de\u0005k\u0000\u0000\u03de\u03df\u0003F#\u0000\u03df\u03e0\u0005"+
		"l\u0000\u0000\u03e0\u03e2\u0001\u0000\u0000\u0000\u03e1\u03dd\u0001\u0000"+
		"\u0000\u0000\u03e1\u03e2\u0001\u0000\u0000\u0000\u03e2\u00a5\u0001\u0000"+
		"\u0000\u0000\u03e3\u03e8\u0005\u0019\u0000\u0000\u03e4\u03e5\u0005k\u0000"+
		"\u0000\u03e5\u03e6\u0003F#\u0000\u03e6\u03e7\u0005l\u0000\u0000\u03e7"+
		"\u03e9\u0001\u0000\u0000\u0000\u03e8\u03e4\u0001\u0000\u0000\u0000\u03e8"+
		"\u03e9\u0001\u0000\u0000\u0000\u03e9\u00a7\u0001\u0000\u0000\u0000\u03ea"+
		"\u03eb\u0007\r\u0000\u0000\u03eb\u00a9\u0001\u0000\u0000\u0000\u03ec\u03ed"+
		"\u0005(\u0000\u0000\u03ed\u00ab\u0001\u0000\u0000\u0000\u03ee\u03ef\u0005"+
		"k\u0000\u0000\u03ef\u03f4\u0003\u00f8|\u0000\u03f0\u03f1\u0005j\u0000"+
		"\u0000\u03f1\u03f3\u0003\u00f8|\u0000\u03f2\u03f0\u0001\u0000\u0000\u0000"+
		"\u03f3\u03f6\u0001\u0000\u0000\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000"+
		"\u03f4\u03f5\u0001\u0000\u0000\u0000\u03f5\u03f7\u0001\u0000\u0000\u0000"+
		"\u03f6\u03f4\u0001\u0000\u0000\u0000\u03f7\u03f8\u0005l\u0000\u0000\u03f8"+
		"\u00ad\u0001\u0000\u0000\u0000\u03f9\u03fe\u0005=\u0000\u0000\u03fa\u03fb"+
		"\u0005k\u0000\u0000\u03fb\u03fc\u0003h4\u0000\u03fc\u03fd\u0005l\u0000"+
		"\u0000\u03fd\u03ff\u0001\u0000\u0000\u0000\u03fe\u03fa\u0001\u0000\u0000"+
		"\u0000\u03fe\u03ff\u0001\u0000\u0000\u0000\u03ff\u00af\u0001\u0000\u0000"+
		"\u0000\u0400\u0404\u0003\u00b4Z\u0000\u0401\u0403\u0003@ \u0000\u0402"+
		"\u0401\u0001\u0000\u0000\u0000\u0403\u0406\u0001\u0000\u0000\u0000\u0404"+
		"\u0402\u0001\u0000\u0000\u0000\u0404\u0405\u0001\u0000\u0000\u0000\u0405"+
		"\u0408\u0001\u0000\u0000\u0000\u0406\u0404\u0001\u0000\u0000\u0000\u0407"+
		"\u0409\u0003\u00b6[\u0000\u0408\u0407\u0001\u0000\u0000\u0000\u0408\u0409"+
		"\u0001\u0000\u0000\u0000\u0409\u040a\u0001\u0000\u0000\u0000\u040a\u040b"+
		"\u0003\u00b2Y\u0000\u040b\u041b\u0001\u0000\u0000\u0000\u040c\u0410\u0003"+
		"\u00b4Z\u0000\u040d\u040f\u0003@ \u0000\u040e\u040d\u0001\u0000\u0000"+
		"\u0000\u040f\u0412\u0001\u0000\u0000\u0000\u0410\u040e\u0001\u0000\u0000"+
		"\u0000\u0410\u0411\u0001\u0000\u0000\u0000\u0411\u0414\u0001\u0000\u0000"+
		"\u0000\u0412\u0410\u0001\u0000\u0000\u0000\u0413\u0415\u0003\u00b8\\\u0000"+
		"\u0414\u0413\u0001\u0000\u0000\u0000\u0415\u0416\u0001\u0000\u0000\u0000"+
		"\u0416\u0414\u0001\u0000\u0000\u0000\u0416\u0417\u0001\u0000\u0000\u0000"+
		"\u0417\u0418\u0001\u0000\u0000\u0000\u0418\u0419\u0003\u00b2Y\u0000\u0419"+
		"\u041b\u0001\u0000\u0000\u0000\u041a\u0400\u0001\u0000\u0000\u0000\u041a"+
		"\u040c\u0001\u0000\u0000\u0000\u041b\u00b1\u0001\u0000\u0000\u0000\u041c"+
		"\u041e\u0005\u001c\u0000\u0000\u041d\u041f\u0005$\u0000\u0000\u041e\u041d"+
		"\u0001\u0000\u0000\u0000\u041e\u041f\u0001\u0000\u0000\u0000\u041f\u00b3"+
		"\u0001\u0000\u0000\u0000\u0420\u0421\u0005$\u0000\u0000\u0421\u0422\u0003"+
		"h4\u0000\u0422\u0423\u0005I\u0000\u0000\u0423\u00b5\u0001\u0000\u0000"+
		"\u0000\u0424\u0428\u0005\u001b\u0000\u0000\u0425\u0427\u0003@ \u0000\u0426"+
		"\u0425\u0001\u0000\u0000\u0000\u0427\u042a\u0001\u0000\u0000\u0000\u0428"+
		"\u0426\u0001\u0000\u0000\u0000\u0428\u0429\u0001\u0000\u0000\u0000\u0429"+
		"\u00b7\u0001\u0000\u0000\u0000\u042a\u0428\u0001\u0000\u0000\u0000\u042b"+
		"\u042c\u0005\u001a\u0000\u0000\u042c\u042d\u0003h4\u0000\u042d\u0431\u0005"+
		"I\u0000\u0000\u042e\u0430\u0003@ \u0000\u042f\u042e\u0001\u0000\u0000"+
		"\u0000\u0430\u0433\u0001\u0000\u0000\u0000\u0431\u042f\u0001\u0000\u0000"+
		"\u0000\u0431\u0432\u0001\u0000\u0000\u0000\u0432\u0435\u0001\u0000\u0000"+
		"\u0000\u0433\u0431\u0001\u0000\u0000\u0000\u0434\u0436\u0003\u00b6[\u0000"+
		"\u0435\u0434\u0001\u0000\u0000\u0000\u0435\u0436\u0001\u0000\u0000\u0000"+
		"\u0436\u00b9\u0001\u0000\u0000\u0000\u0437\u043b\u0005+\u0000\u0000\u0438"+
		"\u043a\u0003@ \u0000\u0439\u0438\u0001\u0000\u0000\u0000\u043a\u043d\u0001"+
		"\u0000\u0000\u0000\u043b\u0439\u0001\u0000\u0000\u0000\u043b\u043c\u0001"+
		"\u0000\u0000\u0000\u043c\u043e\u0001\u0000\u0000\u0000\u043d\u043b\u0001"+
		"\u0000\u0000\u0000\u043e\u044d\u0003\u00c0`\u0000\u043f\u0442\u0005+\u0000"+
		"\u0000\u0440\u0443\u0003\u00bc^\u0000\u0441\u0443\u0003\u00be_\u0000\u0442"+
		"\u0440\u0001\u0000\u0000\u0000\u0442\u0441\u0001\u0000\u0000\u0000\u0443"+
		"\u0447\u0001\u0000\u0000\u0000\u0444\u0446\u0003@ \u0000\u0445\u0444\u0001"+
		"\u0000\u0000\u0000\u0446\u0449\u0001\u0000\u0000\u0000\u0447\u0445\u0001"+
		"\u0000\u0000\u0000\u0447\u0448\u0001\u0000\u0000\u0000\u0448\u044a\u0001"+
		"\u0000\u0000\u0000\u0449\u0447\u0001\u0000\u0000\u0000\u044a\u044b\u0003"+
		"\u00c0`\u0000\u044b\u044d\u0001\u0000\u0000\u0000\u044c\u0437\u0001\u0000"+
		"\u0000\u0000\u044c\u043f\u0001\u0000\u0000\u0000\u044d\u00bb\u0001\u0000"+
		"\u0000\u0000\u044e\u0450\u0003\u00c2a\u0000\u044f\u0451\u0003\u00c4b\u0000"+
		"\u0450\u044f\u0001\u0000\u0000\u0000\u0450\u0451\u0001\u0000\u0000\u0000"+
		"\u0451\u00bd\u0001\u0000\u0000\u0000\u0452\u0454\u0003\u00c4b\u0000\u0453"+
		"\u0455\u0003\u00c2a\u0000\u0454\u0453\u0001\u0000\u0000\u0000\u0454\u0455"+
		"\u0001\u0000\u0000\u0000\u0455\u00bf\u0001\u0000\u0000\u0000\u0456\u0458"+
		"\u0005\u001c\u0000\u0000\u0457\u0459\u0005+\u0000\u0000\u0458\u0457\u0001"+
		"\u0000\u0000\u0000\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u00c1\u0001"+
		"\u0000\u0000\u0000\u045a\u045b\u0005U\u0000\u0000\u045b\u045c\u0005k\u0000"+
		"\u0000\u045c\u045d\u0003h4\u0000\u045d\u045e\u0005l\u0000\u0000\u045e"+
		"\u00c3\u0001\u0000\u0000\u0000\u045f\u0460\u0005N\u0000\u0000\u0460\u0461"+
		"\u0005k\u0000\u0000\u0461\u0462\u0003h4\u0000\u0462\u0463\u0005l\u0000"+
		"\u0000\u0463\u00c5\u0001\u0000\u0000\u0000\u0464\u0468\u0003\u00cae\u0000"+
		"\u0465\u0467\u0003\u00ccf\u0000\u0466\u0465\u0001\u0000\u0000\u0000\u0467"+
		"\u046a\u0001\u0000\u0000\u0000\u0468\u0466\u0001\u0000\u0000\u0000\u0468"+
		"\u0469\u0001\u0000\u0000\u0000\u0469\u046c\u0001\u0000\u0000\u0000\u046a"+
		"\u0468\u0001\u0000\u0000\u0000\u046b\u046d\u0003\u00ceg\u0000\u046c\u046b"+
		"\u0001\u0000\u0000\u0000\u046c\u046d\u0001\u0000\u0000\u0000\u046d\u046e"+
		"\u0001\u0000\u0000\u0000\u046e\u046f\u0003\u00c8d\u0000\u046f\u00c7\u0001"+
		"\u0000\u0000\u0000\u0470\u0472\u0005\u001c\u0000\u0000\u0471\u0473\u0005"+
		"C\u0000\u0000\u0472\u0471\u0001\u0000\u0000\u0000\u0472\u0473\u0001\u0000"+
		"\u0000\u0000\u0473\u00c9\u0001\u0000\u0000\u0000\u0474\u0479\u0005C\u0000"+
		"\u0000\u0475\u0476\u0005k\u0000\u0000\u0476\u0477\u0003h4\u0000\u0477"+
		"\u0478\u0005l\u0000\u0000\u0478\u047a\u0001\u0000\u0000\u0000\u0479\u0475"+
		"\u0001\u0000\u0000\u0000\u0479\u047a\u0001\u0000\u0000\u0000\u047a\u00cb"+
		"\u0001\u0000\u0000\u0000\u047b\u047d\u0005T\u0000\u0000\u047c\u047e\u0007"+
		"\u000e\u0000\u0000\u047d\u047c\u0001\u0000\u0000\u0000\u047d\u047e\u0001"+
		"\u0000\u0000\u0000\u047e\u047f\u0001\u0000\u0000\u0000\u047f\u0480\u0005"+
		"k\u0000\u0000\u0480\u0485\u0003h4\u0000\u0481\u0482\u0005j\u0000\u0000"+
		"\u0482\u0484\u0003h4\u0000\u0483\u0481\u0001\u0000\u0000\u0000\u0484\u0487"+
		"\u0001\u0000\u0000\u0000\u0485\u0483\u0001\u0000\u0000\u0000\u0485\u0486"+
		"\u0001\u0000\u0000\u0000\u0486\u0488\u0001\u0000\u0000\u0000\u0487\u0485"+
		"\u0001\u0000\u0000\u0000\u0488\u048c\u0005l\u0000\u0000\u0489\u048b\u0003"+
		"@ \u0000\u048a\u0489\u0001\u0000\u0000\u0000\u048b\u048e\u0001\u0000\u0000"+
		"\u0000\u048c\u048a\u0001\u0000\u0000\u0000\u048c\u048d\u0001\u0000\u0000"+
		"\u0000\u048d\u00cd\u0001\u0000\u0000\u0000\u048e\u048c\u0001\u0000\u0000"+
		"\u0000\u048f\u0493\u0005\u001b\u0000\u0000\u0490\u0492\u0003@ \u0000\u0491"+
		"\u0490\u0001\u0000\u0000\u0000\u0492\u0495\u0001\u0000\u0000\u0000\u0493"+
		"\u0491\u0001\u0000\u0000\u0000\u0493\u0494\u0001\u0000\u0000\u0000\u0494"+
		"\u00cf\u0001\u0000\u0000\u0000\u0495\u0493\u0001\u0000\u0000\u0000\u0496"+
		"\u0497\u0005\u0018\u0000\u0000\u0497\u0498\u0003\u00f8|\u0000\u0498\u0499"+
		"\u0003\u00d2i\u0000\u0499\u04a3\u0001\u0000\u0000\u0000\u049a\u049b\u0005"+
		"\u0018\u0000\u0000\u049b\u049c\u0003\u00f8|\u0000\u049c\u049d\u0003\u00e2"+
		"q\u0000\u049d\u04a3\u0001\u0000\u0000\u0000\u049e\u049f\u0005\u0018\u0000"+
		"\u0000\u049f\u04a0\u0003\u00f8|\u0000\u04a0\u04a1\u0003\u00d4j\u0000\u04a1"+
		"\u04a3\u0001\u0000\u0000\u0000\u04a2\u0496\u0001\u0000\u0000\u0000\u04a2"+
		"\u049a\u0001\u0000\u0000\u0000\u04a2\u049e\u0001\u0000\u0000\u0000\u04a3"+
		"\u00d1\u0001\u0000\u0000\u0000\u04a4\u04a9\u0005\u001f\u0000\u0000\u04a5"+
		"\u04aa\u0003\u00d6k\u0000\u04a6\u04aa\u0003\u00d8l\u0000\u04a7\u04aa\u0003"+
		"\u00dam\u0000\u04a8\u04aa\u0003\u00dcn\u0000\u04a9\u04a5\u0001\u0000\u0000"+
		"\u0000\u04a9\u04a6\u0001\u0000\u0000\u0000\u04a9\u04a7\u0001\u0000\u0000"+
		"\u0000\u04a9\u04a8\u0001\u0000\u0000\u0000\u04a9\u04aa\u0001\u0000\u0000"+
		"\u0000\u04aa\u04ab\u0001\u0000\u0000\u0000\u04ab\u04ac\u0003\u00deo\u0000"+
		"\u04ac\u04ae\u0005\u001c\u0000\u0000\u04ad\u04af\u0005\u001f\u0000\u0000"+
		"\u04ae\u04ad\u0001\u0000\u0000\u0000\u04ae\u04af\u0001\u0000\u0000\u0000"+
		"\u04af\u00d3\u0001\u0000\u0000\u0000\u04b0\u04b1\u0005\u0002\u0000\u0000"+
		"\u04b1\u04b2\u0003\u008eG\u0000\u04b2\u00d5\u0001\u0000\u0000\u0000\u04b3"+
		"\u04b4\u0005\n\u0000\u0000\u04b4\u04b5\u0005k\u0000\u0000\u04b5\u04b6"+
		"\u0003\u00f4z\u0000\u04b6\u04b7\u0005l\u0000\u0000\u04b7\u00d7\u0001\u0000"+
		"\u0000\u0000\u04b8\u04b9\u0005\u0016\u0000\u0000\u04b9\u04ba\u0005k\u0000"+
		"\u0000\u04ba\u04bb\u0003\u00f4z\u0000\u04bb\u04bc\u0005l\u0000\u0000\u04bc"+
		"\u00d9\u0001\u0000\u0000\u0000\u04bd\u04be\u0005G\u0000\u0000\u04be\u04bf"+
		"\u0005k\u0000\u0000\u04bf\u04c0\u0003\u00f4z\u0000\u04c0\u04c1\u0005l"+
		"\u0000\u0000\u04c1\u00db\u0001\u0000\u0000\u0000\u04c2\u04c3\u0005\u000b"+
		"\u0000\u0000\u04c3\u04c4\u0005k\u0000\u0000\u04c4\u04c5\u0003\u00f4z\u0000"+
		"\u04c5\u04c6\u0005l\u0000\u0000\u04c6\u00dd\u0001\u0000\u0000\u0000\u04c7"+
		"\u04ca\u0003\u00f8|\u0000\u04c8\u04c9\u0005q\u0000\u0000\u04c9\u04cb\u0003"+
		"\u00e0p\u0000\u04ca\u04c8\u0001\u0000\u0000\u0000\u04ca\u04cb\u0001\u0000"+
		"\u0000\u0000\u04cb\u04d3\u0001\u0000\u0000\u0000\u04cc\u04cf\u0003\u00f8"+
		"|\u0000\u04cd\u04ce\u0005q\u0000\u0000\u04ce\u04d0\u0003\u00e0p\u0000"+
		"\u04cf\u04cd\u0001\u0000\u0000\u0000\u04cf\u04d0\u0001\u0000\u0000\u0000"+
		"\u04d0\u04d2\u0001\u0000\u0000\u0000\u04d1\u04cc\u0001\u0000\u0000\u0000"+
		"\u04d2\u04d5\u0001\u0000\u0000\u0000\u04d3\u04d1\u0001\u0000\u0000\u0000"+
		"\u04d3\u04d4\u0001\u0000\u0000\u0000\u04d4\u00df\u0001\u0000\u0000\u0000"+
		"\u04d5\u04d3\u0001\u0000\u0000\u0000\u04d6\u04da\u0003\u00f4z\u0000\u04d7"+
		"\u04da\u0003\u00ecv\u0000\u04d8\u04da\u0003\u00f6{\u0000\u04d9\u04d6\u0001"+
		"\u0000\u0000\u0000\u04d9\u04d7\u0001\u0000\u0000\u0000\u04d9\u04d8\u0001"+
		"\u0000\u0000\u0000\u04da\u00e1\u0001\u0000\u0000\u0000\u04db\u04dc\u0005"+
		"H\u0000\u0000\u04dc\u04dd\u0003\u00e4r\u0000\u04dd\u04df\u0005\u001c\u0000"+
		"\u0000\u04de\u04e0\u0005H\u0000\u0000\u04df\u04de\u0001\u0000\u0000\u0000"+
		"\u04df\u04e0\u0001\u0000\u0000\u0000\u04e0\u00e3\u0001\u0000\u0000\u0000"+
		"\u04e1\u04e2\u0003\u00e6s\u0000\u04e2\u00e5\u0001\u0000\u0000\u0000\u04e3"+
		"\u04e7\u0003\u00eau\u0000\u04e4\u04e6\u0003\u00eau\u0000\u04e5\u04e4\u0001"+
		"\u0000\u0000\u0000\u04e6\u04e9\u0001\u0000\u0000\u0000\u04e7\u04e5\u0001"+
		"\u0000\u0000\u0000\u04e7\u04e8\u0001\u0000\u0000\u0000\u04e8\u00e7\u0001"+
		"\u0000\u0000\u0000\u04e9\u04e7\u0001\u0000\u0000\u0000\u04ea\u04ec\u0003"+
		"\u00f8|\u0000\u04eb\u04ed\u0003\u0084B\u0000\u04ec\u04eb\u0001\u0000\u0000"+
		"\u0000\u04ec\u04ed\u0001\u0000\u0000\u0000\u04ed\u04ee\u0001\u0000\u0000"+
		"\u0000\u04ee\u04ef\u0005H\u0000\u0000\u04ef\u04f0\u0003\u00e4r\u0000\u04f0"+
		"\u04f2\u0005\u001c\u0000\u0000\u04f1\u04f3\u0005H\u0000\u0000\u04f2\u04f1"+
		"\u0001\u0000\u0000\u0000\u04f2\u04f3\u0001\u0000\u0000\u0000\u04f3\u00e9"+
		"\u0001\u0000\u0000\u0000\u04f4\u04fe\u0003\u00e8t\u0000\u04f5\u04f7\u0003"+
		"\u00f8|\u0000\u04f6\u04f8\u0003\u0084B\u0000\u04f7\u04f6\u0001\u0000\u0000"+
		"\u0000\u04f7\u04f8\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000"+
		"\u0000\u04f9\u04fa\u0005\u0007\u0000\u0000\u04fa\u04fb\u0003\u00f8|\u0000"+
		"\u04fb\u04fe\u0001\u0000\u0000\u0000\u04fc\u04fe\u0003\u0080@\u0000\u04fd"+
		"\u04f4\u0001\u0000\u0000\u0000\u04fd\u04f5\u0001\u0000\u0000\u0000\u04fd"+
		"\u04fc\u0001\u0000\u0000\u0000\u04fe\u00eb\u0001\u0000\u0000\u0000\u04ff"+
		"\u0500\u0007\u000f\u0000\u0000\u0500\u00ed\u0001\u0000\u0000\u0000\u0501"+
		"\u0506\u0003\u00f6{\u0000\u0502\u0506\u0003\u00f2y\u0000\u0503\u0506\u0003"+
		"\u00f0x\u0000\u0504\u0506\u0003\u00f4z\u0000\u0505\u0501\u0001\u0000\u0000"+
		"\u0000\u0505\u0502\u0001\u0000\u0000\u0000\u0505\u0503\u0001\u0000\u0000"+
		"\u0000\u0505\u0504\u0001\u0000\u0000\u0000\u0506\u00ef\u0001\u0000\u0000"+
		"\u0000\u0507\u0508\u0005a\u0000\u0000\u0508\u00f1\u0001\u0000\u0000\u0000"+
		"\u0509\u050a\u0005`\u0000\u0000\u050a\u00f3\u0001\u0000\u0000\u0000\u050b"+
		"\u050e\u0005b\u0000\u0000\u050c\u050e\u0005d\u0000\u0000\u050d\u050b\u0001"+
		"\u0000\u0000\u0000\u050d\u050c\u0001\u0000\u0000\u0000\u050e\u00f5\u0001"+
		"\u0000\u0000\u0000\u050f\u0510\u0005_\u0000\u0000\u0510\u00f7\u0001\u0000"+
		"\u0000\u0000\u0511\u0514\u0007\u0010\u0000\u0000\u0512\u0514\u0005\u009e"+
		"\u0000\u0000\u0513\u0511\u0001\u0000\u0000\u0000\u0513\u0512\u0001\u0000"+
		"\u0000\u0000\u0514\u00f9\u0001\u0000\u0000\u0000\u009f\u00fb\u0100\u0106"+
		"\u0108\u0113\u011a\u011c\u0127\u012b\u012f\u0137\u013f\u0143\u014c\u0159"+
		"\u015c\u0168\u0172\u0177\u0179\u0181\u0187\u0189\u018e\u0196\u019b\u01a5"+
		"\u01ac\u01ae\u01b6\u01b9\u01c0\u01c5\u01c9\u01d5\u01db\u01df\u01e3\u01f1"+
		"\u01f8\u01fc\u020b\u0216\u021c\u0220\u0225\u022c\u022f\u0235\u023c\u0245"+
		"\u0264\u0269\u0282\u0284\u02b2\u02b4\u02b6\u02bc\u02c1\u02c5\u02ce\u02d4"+
		"\u02ef\u02f3\u02f7\u02fc\u0302\u0307\u030d\u0318\u031c\u0323\u032c\u032f"+
		"\u0333\u0336\u033a\u033d\u0341\u0344\u0348\u034b\u034f\u0352\u0354\u035a"+
		"\u035d\u0361\u0364\u0368\u036c\u036f\u0373\u0376\u0386\u038c\u038f\u0393"+
		"\u0396\u039a\u039d\u03a1\u03a4\u03a8\u03ab\u03af\u03b2\u03b4\u03bf\u03c5"+
		"\u03c9\u03cf\u03d1\u03d8\u03e1\u03e8\u03f4\u03fe\u0404\u0408\u0410\u0416"+
		"\u041a\u041e\u0428\u0431\u0435\u043b\u0442\u0447\u044c\u0450\u0454\u0458"+
		"\u0468\u046c\u0472\u0479\u047d\u0485\u048c\u0493\u04a2\u04a9\u04ae\u04ca"+
		"\u04cf\u04d3\u04d9\u04df\u04e7\u04ec\u04f2\u04f7\u04fd\u0505\u050d\u0513";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}