/*------------------------------------------------------------------------------*/
/*     This is the grammar for IPL - the Imperium programming language 	        */
/*------------------------------------------------------------------------------*/
/* It's based primarily on the PL/I grammar because that has no reserved words. */
/* This grammar supports keywords for multiple cultures, this is done by having */
/* a JSON lexicon file that defines the literal text for each keyword for each  */
/* language.	 															                                    */
/*			 																	                                      */
/* No reserved words means an identifier can be the same as a keyword and the   */
/* text will still parse correctly. We do this to facilitate the addition of    */
/* new keywords in future releases of the language.                             */
/*										 										                                      */
/* This also means that if an identifier happens to also match a keyword in  	  */
/* one of the other supported keyword lexicon languages, then the text will     */
/* nevertheless compile without any issues.                                     */
/*------------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------*/
/*                                  IMPORTANT                                   */
/*------------------------------------------------------------------------------*/
/* Changing the names of any rules or hash tags in here might break any code    */
/* that has been writte to traverse the parse tree, do not change rule names    */
/* without due care and attention!                                              */
/*------------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------*/
/* Keyword translation info kindly contributed by:                           	  */
/* English (en) - Hugh Gleaves                                               	  */
/* Dutch (nl)   - Gabor de Mooij (https://github.com/gabordemooij/citrine)   	  */
/*------------------------------------------------------------------------------*/

grammar Imperium; // Latin for "control"

options
{
  contextSuperClass=VisitorContext ;
}

@lexer::members 
{    
	// This code MUST compile for both Java and C#
  // Some constructs here require support code be
	// defined as C# partial and extension classes.
    
	private String KeywordLexiconCode = "en";

	public Boolean Lexicon(String Code)
	{
		return Code == KeywordLexiconCode;
	}

	public void SetLexicon(String Code)
	{
		KeywordLexiconCode = Code;
	}

	public void ReverseLexeme()
	{
		StringBuilder builder = new StringBuilder();
		builder.append(getText());
		builder.reverse();
		setText(builder.toString());
	}
}

translationUnit
  :	BYTE_ORDER_MARK? uses* scope* | stmtBlock? EOF
  ;

uses
  : USES identifier (DOT identifier)* SEMICOLON
  ;
scope
  : scopeStmt stmtBlock? scopeEnd
  | scopeStmt scope scopeEnd
  ;

scopeStmt
  : SCOPE identifier (DOT identifier)* PRIVATE? SEMICOLON
  ;

scopeEnd
  : END SCOPE? SEMICOLON
  ;

procedure
  :	procedureStmt stmtBlock? procedureEnd
  | functionStmt  stmtBlock? functionEnd
  ;

procedureStmt
  : PROCEDURE identifier procDescriptor SEMICOLON 
  ;

functionStmt
  : FUNCTION identifier funcDescriptor SEMICOLON 
  ;

procedureEnd
  : END PROCEDURE? SEMICOLON
  ;

functionEnd
  : END FUNCTION? SEMICOLON
  ;

procDescriptor
  :	parameterNameCommalist? ((coprocedureSpecifier?) | ((coprocedureSpecifier | handlerSpecifier)? RECURSIVE?))
  ;

funcDescriptor
  :	parameterNameCommalist? ((returnsDescriptor coprocedureSpecifier?) | ((coprocedureSpecifier | handlerSpecifier)? RECURSIVE? returnsDescriptor))
  ;

returnsDescriptor
  :	RETURNS LPAR dataAttribute RPAR
  ;
	// consider using keyword 'is' instead and forcing it to be right after the params...

stmtBlock 
  : nonexecutableStmt+                   
  | executableStmt+                      
  | nonexecutableStmt+ executableStmt+  
  ;

terminator
  : SEMICOLON
  ;

labelStmt
  : LABEL (LPAR decimalLiteral RPAR)? 
  ;

nonexecutableStmt
	: declareStmt	  
	| defineStmt		 
  | nullStmt       
  ;
 
executableStmt
  : labelStmt      
  | assignmentStmt	    
	| callStmt		    
	| gotoStmt		    
	| procedure       
	| returnStmt	    
	| ifStmt		      
	| loopStmt		    
  | selectStmt     
	| endloopStmt    
	| reloopStmt     
  | nullStmt       
	;

nullStmt
  : SEMICOLON
  ;

assignmentStmt
  : reference (ASSIGN_U | EQUALS) expression SEMICOLON
  ;

reference
  :	reference RARROW_U basicReference argumentsList?	
	| basicReference argumentsList?					            
  ;

arguments
  : LPAR subscriptCommalist? RPAR
  ;

argumentsList
  : arguments+;

basicReference
  : structureQualificationList? identifier
  ;

structureQualification
  : identifier arguments? DOT
  ;

structureQualificationList
  : structureQualification+
  ;

subscript
  : expression
  ;

subscriptCommalist
  : subscript (COMMA subscript)*
  ;

parenthesizedExpression
  : LPAR expression RPAR
  | REDAND expression RPAR
  | REDOR expression RPAR
  | REDXOR_U expression RPAR
  | REDNAND expression RPAR
  | REDNOR expression RPAR
  | REDXNOR_U expression RPAR
  ;

primitiveExpression
  : numericLiteral 
  | stringLiteral 
  | reference
  ;

prefixExpression
  : prefixOperator expression
  ;

bitAdjustOperator
  : (L_ROTATE_U | R_ROTATE_U | L_LOG_SHIFT | R_LOG_SHIFT | R_ART_SHIFT)
  ;

additionOperator
  : (PLUS | MINUS)
  ;

multiplyOperator
  : (TIMES | DIVIDE_U | PCNT)
  ;

boolAndOperator
  : (AND | NAND)
  ;

boolXorOperator
  : (XOR_U | XNOR_U) 
  ;

boolOrOperator
  : (OR | NOR | NOT)
  ;

expression
  : primitiveExpression                       # ExprPrimitive                                              
  | parenthesizedExpression                   # ExprParenthesized
  | prefixExpression	                        # ExprPrefixed
  | expression multiplyOperator expression    # ExprMulDiv
  | expression additionOperator expression    # ExprAddSub
  | expression bitAdjustOperator expression   # ExprBitAdjust
  | expression CONC expression                # ExprConcat
  | expression comparisonOperator expression  # ExprCompare
  | expression boolAndOperator expression     # ExprBoolAnd
  | expression boolXorOperator expression     # ExprBoolXor
  | expression boolOrOperator expression      # ExprBoolOr
  | expression LOGAND expression              # ExprLogAnd
  | expression LOGOR expression               # ExprLogOr
  ;

prefixOperator
  : PLUS 
  | MINUS 
  | NOT
  ;

comparisonOperator
  : GT
	| GTE_U
	| EQUALS
	| LT
	| LTE_U
	| NGT
	| NE_U
	| NLT
  ;

shiftOperator
  : R_LOG_SHIFT 
  | L_LOG_SHIFT 
  | R_ART_SHIFT 
  ;

// Any parser rules that need to match and identifier, must match
// against the 'identifier' rule and not the IDENTFIER token.
// If this is not done then it might fail to parse correctly
// if an identifer happens to be a keyword.

identifier
  :	keyword			//# Keyword_
	| IDENTIFIER	//# Identifier
  ;

callStmt
  : CALL reference SEMICOLON
  ;

gotoStmt
	:	(GOTO identifier LPAR expression RPAR) SEMICOLON
	| (GOTO reference) SEMICOLON
  ;

endloopStmt
  : ENDLOOP identifier? 
  ;

reloopStmt
  : RELOOP identifier? 
  ;

declareStmt
  : (DECLARE | ARGUMENT) identifier dimensionSuffix? declareAsBody SEMICOLON 
  | (DECLARE | ARGUMENT) declarationBody SEMICOLON
  ;

declareAsBody
  : AS identifier memoryAttribute?
  ;

declarationBody
  : identifier typeInfo
  ;

typeInfo
  : dimensionSuffix? attribute+
  ;

dimensionSuffix
  : LPAR boundPairCommalist RPAR
  ;

boundPair
  : (lowerBound COLON)? upperBound 
  | TIMES
  ;

boundPairCommalist
  : boundPair (COMMA boundPair)*
  ;

// See page 208 PL/I Subset G standard. Lower bound must be <= upper 
// (but this is not a grammar issue, just a note)

lowerBound
  : expression
  ;

upperBound
  : expression
  ;

attribute
    : (dataAttribute | BUILTIN | VARIABLE | memoryAttribute)
    ;

memoryAttribute
  : STACK                       
  | STATIC                      
  | based                       
  | defined                     
  ;

dataAttribute
  : BINARY (precision)?			
	| DECIMAL (precision)?	
	| POINTER							        
	| BIT maxLength				  
	| CHARACTER							      
	| STRING maxStringLength (utfSpec | rawSpec)?           	
	| ENTRY								       
	| FIXED								      
	| FLOAT								      
	| OFFSET							       
	| VARYING							        
	| COROUTINE							      
	| COFUNCTION						      
	| BUILTIN							        
	| INTRINSIC							      
  ;

utfSpec
  : (UTF LPAR decimalLiteral RPAR)
  ;

rawSpec
  : (RAW LPAR decimalLiteral RPAR)
  ;
precision
  : LPAR numberOfDigits (COMMA scale_factor)? RPAR
  ;

numberOfDigits
  : (decimalLiteral | identifier)
  ;

scale_factor
  : (decimalLiteral | identifier)
  ;

maxStringLength
  : LPAR (TIMES | (decimalLiteral | identifier)) RPAR
  ;

maxLength
  : LPAR (decimalLiteral | identifier) RPAR
  ;

based
  : BASED (LPAR reference RPAR)?
  ;

defined
  : DEFINED (LPAR reference RPAR)?
  ;


coprocedureSpecifier
  : (COROUTINE | COFUNCTION)
  ;

handlerSpecifier
  : INTERRUPT 
  ;

parameterNameCommalist
  : LPAR identifier (COMMA identifier)* RPAR
  ;

returnStmt
  : RETURN (LPAR expression RPAR)? SEMICOLON
  ;

ifStmt
  :	thenClause stmtBlock elseClause? ifEnd
	| thenClause stmtBlock elifClause+ ifEnd
  ;

ifEnd
  : END IF? SEMICOLON
  ;  

thenClause
  : IF expression THEN
  ;

elseClause
  : ELSE stmtBlock
  ;

elifClause
  :	ELIF expression THEN stmtBlock elseClause?
  ;

loopStmt
  :	LOOP  SEMICOLON stmtBlock loopEnd                                  
	| LOOP (
          (whileOption untilOption? SEMICOLON stmtBlock loopEnd) 
        | (untilOption whileOption? SEMICOLON stmtBlock loopEnd)
        )                                                                
  ;

loopEnd
  : END LOOP? SEMICOLON
  ;

whileOption
  : WHILE LPAR expression RPAR
  ;

untilOption
  : UNTIL LPAR expression RPAR
  ;

selectStmt
  : selectClause whenClause* otherwiseClause? selectEnd
  ;

selectEnd
  : END SELECT? SEMICOLON
  ;

selectClause
  : SELECT (LPAR expression RPAR)? SEMICOLON 
  ;

whenClause
  : WHEN (ANY | ALL)? LPAR (expression (COMMA expression)*) RPAR stmtBlock
  ;

otherwiseClause
  : ELSE stmtBlock
  ;

defineStmt // defines a type, like a structure
  : DEFINE identifier enumType 
  | DEFINE identifier structType
  | DEFINE identifier aliasType
  ;

enumType
  : ENUM (binaryEnum | decimalEnum | stringEnum | bitEnum)? SEMICOLON enumBody END ENUM? SEMICOLON
  ;

aliasType
  : ALIAS attribute+ SEMICOLON
  ;

binaryEnum
  : (BINARY LPAR decimalLiteral RPAR)
  ;

decimalEnum
  : (DECIMAL LPAR decimalLiteral RPAR)
  ;

stringEnum
  : (STRING LPAR decimalLiteral RPAR)
  ;

bitEnum
  : (BIT LPAR decimalLiteral RPAR)
  ;

enumBody
  : identifier (EQUALS enumLiteral)? SEMICOLON (identifier (EQUALS enumLiteral)? SEMICOLON)*
  ;

enumLiteral
  : (decimalLiteral | stringLiteral | binaryLiteral)
  ;

structType
  : STRUCTURE SEMICOLON structBody END STRUCTURE? SEMICOLON
  ;

structBody
  : structMemberList
  ;

structMemberList
  : structMember SEMICOLON (structMember SEMICOLON)* 
  ;  

structSubstruct
  : identifier dimensionSuffix? STRUCTURE SEMICOLON structBody END
  ;

structMember
  : structSubstruct 
  | identifier dimensionSuffix? AS identifier 
  | declarationBody
  ;

stringLiteral
  : STRING_LITERAL_3 
  | STRING_LITERAL_2 
  | STRING_LITERAL_1
  ;

numericLiteral
  :	binaryLiteral
	| octalLiteral
	| hexLiteral
	| decimalLiteral
  ;

hexLiteral
  : (HEXADECIMAL_PATTERN)
  ;

octalLiteral
  : (OCTAL_PATTERN)
  ;

decimalLiteral
  : (DECIMAL_PATTERN)
  ;

binaryLiteral
  : (BINARY_PATTERN)
  ;

// LEXER TOKEN DEFINITIONS

COMMENT:          '/*' (COMMENT | .)*? '*/' -> channel(2);
LINE_COMMENT:     '//' .*? '\n' -> channel(HIDDEN);
WS:               (' ')+ -> skip;
NEWLINE:          [\r\n]+ -> skip;
TAB:              ('\t')+ -> skip;
STRING_LITERAL_3: TRIQUOTE (.)*? TRIQUOTE;
STRING_LITERAL_2: DIQUOTE  (.)*? DIQUOTE;
STRING_LITERAL_1: QUOTE    (.)*? QUOTE;
BYTE_ORDER_MARK: '\u00EF' '\u00BB' '\u00BF';

/* ---------------------------------------------------------------------------------------------------- */
/* These Antlr4 keyword token definitions were generated by a utility on 1/27/2023 at 4:56 PM           */
/* Input:  D:\Git\GitHub\Steadsoft\imperium\grammar\antlr\imperium.keywords.json                        */
/* Output: D:\Git\GitHub\Steadsoft\imperium\grammar\antlr\ImperiumKeywords.txt                          */
/*                                                                                                      */
/* Number of languages 8.                                                                               */
/* Expected number of keywords per language 75.                                                         */
/* ---------------------------------------------------------------------------------------------------- */

keyword:
    ALIAS
  | ALIGNED
  | ALL
  | ANY
  | ARGUMENT
  | AS
  | BASED
  | BINARY
  | BIT
  | BOOLEAN
  | BUILTIN
  | BY
  | BYPASS
  | CALL
  | CHARACTER
  | COFUNCTION
  | COROUTINE
  | DECIMAL
  | DECLARE
  | DEFINE
  | DEFINED
  | ELIF
  | ELSE
  | END
  | ENDLOOP
  | ENTRY
  | ENUM
  | FIXED
  | FLOAT
  | FUNCTION
  | GOTO
  | IF
  | INC
  | INCLUDE
  | INTERNAL
  | INTERRUPT
  | INTRINSIC
  | LANGUAGE
  | LOOP
  | OFFSET
  | OTHERWISE
  | OUT
  | PAD
  | POINTER
  | PRIVATE
  | PROCEDURE
  | PUBLIC
  | RAW
  | READONLY
  | RECURSIVE
  | REF
  | RELOOP
  | RETURN
  | RETURNON
  | RETURNS
  | SCOPE
  | SELECT
  | SINGLET
  | STACK
  | STATIC
  | STRING
  | STRUCTURE
  | THEN
  | TO
  | TYPE
  | UNALIGNED
  | UNTIL
  | USES
  | USING
  | UTF
  | VARIABLE
  | VARYING
  | WHEN
  | WHILE
  | YIELD
  ;

ALIAS: 
           {Lexicon("en")}? ('alias')             ;
ALIGNED: 
           {Lexicon("bg")}? ('выровнены')         | 
           {Lexicon("da")}? ('justeret')          | 
           {Lexicon("de")}? ('ausgerichtet')      | 
           {Lexicon("en")}? ('aligned')           | 
           {Lexicon("fr")}? ('aligné')            | 
           {Lexicon("he")}? ('aligned')           | 
           {Lexicon("ru")}? ('выровнены')         ;
ALL: 
           {Lexicon("en")}? ('all')               ;
ANY: 
           {Lexicon("en")}? ('any')               ;
ARGUMENT: 
           {Lexicon("bg")}? ('argument'           | 'arg') | 
           {Lexicon("da")}? ('argument'           | 'arg') | 
           {Lexicon("de")}? ('argument')          | 
           {Lexicon("en")}? ('argument'           | 'arg') | 
           {Lexicon("fr")}? ('argument')          | 
           {Lexicon("he")}? ('argument')          | 
           {Lexicon("nl")}? ('argument')          | 
           {Lexicon("ru")}? ('argument'           | 'arg') ;
AS: 
           {Lexicon("en")}? ('as')                ;
BASED: 
           {Lexicon("bg")}? ('based')             | 
           {Lexicon("da")}? ('based')             | 
           {Lexicon("de")}? ('based')             | 
           {Lexicon("en")}? ('based')             | 
           {Lexicon("fr")}? ('based')             | 
           {Lexicon("ru")}? ('based')             ;
BINARY: 
           {Lexicon("bg")}? ('двоичен')           | 
           {Lexicon("da")}? ('binær'              | 'bin') | 
           {Lexicon("de")}? ('binär')             | 
           {Lexicon("en")}? ('binary'             | 'bin') | 
           {Lexicon("fr")}? ('binaire')           | 
           {Lexicon("he")}? ('binary')            | 
           {Lexicon("nl")}? ('binair')            | 
           {Lexicon("ru")}? ('бинарный'           | 'bin') ;
BIT: 
           {Lexicon("bg")}? ('бит')               | 
           {Lexicon("da")}? ('bit')               | 
           {Lexicon("de")}? ('bit')               | 
           {Lexicon("en")}? ('bit')               | 
           {Lexicon("fr")}? ('bit')               | 
           {Lexicon("ru")}? ('бит')               ;
BOOLEAN: 
           {Lexicon("bg")}? ('boolean'            | 'bool') | 
           {Lexicon("da")}? ('boolesk'            | 'bool') | 
           {Lexicon("de")}? ('boolesch')          | 
           {Lexicon("en")}? ('boolean'            | 'bool') | 
           {Lexicon("fr")}? ('booléenne')         | 
           {Lexicon("he")}? ('boolean')           | 
           {Lexicon("nl")}? ('boolean')           | 
           {Lexicon("ru")}? ('boolean'            | 'bool') ;
BUILTIN: 
           {Lexicon("bg")}? ('builtin')           | 
           {Lexicon("da")}? ('builtin')           | 
           {Lexicon("de")}? ('eingebaut')         | 
           {Lexicon("en")}? ('builtin')           | 
           {Lexicon("fr")}? ('intégré')           | 
           {Lexicon("he")}? ('builtin')           | 
           {Lexicon("nl")}? ('ingebouwd')         | 
           {Lexicon("ru")}? ('builtin')           ;
BY: 
           {Lexicon("bg")}? ('by')                | 
           {Lexicon("da")}? ('by')                | 
           {Lexicon("de")}? ('by')                | 
           {Lexicon("en")}? ('by')                | 
           {Lexicon("fr")}? ('by')                | 
           {Lexicon("he")}? ('by')                | 
           {Lexicon("nl")}? ('door')              | 
           {Lexicon("ru")}? ('by')                ;
BYPASS: 
           {Lexicon("bg")}? ('bypass')            | 
           {Lexicon("da")}? ('bypass')            | 
           {Lexicon("de")}? ('bypass')            | 
           {Lexicon("en")}? ('bypass')            | 
           {Lexicon("fr")}? ('bypass')            | 
           {Lexicon("ru")}? ('bypass')            ;
CALL: 
           {Lexicon("bg")}? ('вызов')             | 
           {Lexicon("da")}? ('påberåbe sig')      | 
           {Lexicon("de")}? ('aufrufen')          | 
           {Lexicon("en")}? ('call')              | 
           {Lexicon("fr")}? ('appeler')           | 
           {Lexicon("he")}? ('call')              | 
           {Lexicon("nl")}? ('aanroepen')         | 
           {Lexicon("ru")}? ('вызов')             ;
CHARACTER: 
           {Lexicon("bg")}? ('character'          | 'char') | 
           {Lexicon("da")}? ('character'          | 'char') | 
           {Lexicon("de")}? ('character')         | 
           {Lexicon("en")}? ('character'          | 'char') | 
           {Lexicon("fr")}? ('character')         | 
           {Lexicon("ru")}? ('character'          | 'char') ;
COFUNCTION: 
           {Lexicon("bg")}? ('cofunction')        | 
           {Lexicon("da")}? ('cofunction')        | 
           {Lexicon("de")}? ('cofunction')        | 
           {Lexicon("en")}? ('cofunction')        | 
           {Lexicon("fr")}? ('cofunction')        | 
           {Lexicon("ru")}? ('cofunction')        ;
COROUTINE: 
           {Lexicon("bg")}? ('coroutine')         | 
           {Lexicon("da")}? ('coroutine')         | 
           {Lexicon("de")}? ('coroutine')         | 
           {Lexicon("en")}? ('coroutine')         | 
           {Lexicon("fr")}? ('coroutine')         | 
           {Lexicon("he")}? ('coroutine')         | 
           {Lexicon("nl")}? ('co routine')        | 
           {Lexicon("ru")}? ('coroutine')         ;
DECIMAL: 
           {Lexicon("bg")}? ('decimal'            | 'dec') | 
           {Lexicon("da")}? ('decimal'            | 'dec') | 
           {Lexicon("de")}? ('dezimal')           | 
           {Lexicon("en")}? ('decimal'            | 'dec') | 
           {Lexicon("fr")}? ('décimal')           | 
           {Lexicon("he")}? ('decimal')           | 
           {Lexicon("nl")}? ('decimaal')          | 
           {Lexicon("ru")}? ('decimal'            | 'dec') ;
DECLARE: 
           {Lexicon("bg")}? ('обявявам')          | 
           {Lexicon("da")}? ('erklære'            | 'dcl') | 
           {Lexicon("de")}? ('deklarieren')       | 
           {Lexicon("en")}? ('declare'            | 'dcl') | 
           {Lexicon("fr")}? ('déclarer')          | 
           {Lexicon("he")}? ('declare')           | 
           {Lexicon("nl")}? ('declareer')         | 
           {Lexicon("ru")}? ('объявлять'          | 'dcl') ;
DEFINE: 
           {Lexicon("bg")}? ('define'             | 'def') | 
           {Lexicon("da")}? ('define'             | 'def') | 
           {Lexicon("de")}? ('define')            | 
           {Lexicon("en")}? ('define'             | 'def') | 
           {Lexicon("fr")}? ('define')            | 
           {Lexicon("he")}? ('define')            | 
           {Lexicon("ru")}? ('define'             | 'def') ;
DEFINED: 
           {Lexicon("bg")}? ('defined')           | 
           {Lexicon("da")}? ('defined')           | 
           {Lexicon("de")}? ('defined')           | 
           {Lexicon("en")}? ('defined')           | 
           {Lexicon("fr")}? ('defined')           | 
           {Lexicon("ru")}? ('defined')           ;
ELIF: 
           {Lexicon("bg")}? ('elif')              | 
           {Lexicon("da")}? ('elif')              | 
           {Lexicon("de")}? ('elif')              | 
           {Lexicon("en")}? ('elif')              | 
           {Lexicon("fr")}? ('elif')              | 
           {Lexicon("ru")}? ('elif')              ;
ELSE: 
           {Lexicon("bg")}? ('друго')             | 
           {Lexicon("da")}? ('andet')             | 
           {Lexicon("de")}? ('anders')            | 
           {Lexicon("en")}? ('else')              | 
           {Lexicon("fr")}? ('autre')             | 
           {Lexicon("he")}? ('אחרת')              | 
           {Lexicon("ru")}? ('еще')               ;
END: 
           {Lexicon("bg")}? ('конец')             | 
           {Lexicon("da")}? ('ende')              | 
           {Lexicon("de")}? ('ende')              | 
           {Lexicon("en")}? ('end')               | 
           {Lexicon("fr")}? ('fin')               | 
           {Lexicon("he")}? ('end')               | 
           {Lexicon("nl")}? ('einde')             | 
           {Lexicon("ru")}? ('конец')             ;
ENDLOOP: 
           {Lexicon("bg")}? ('endloop')           | 
           {Lexicon("da")}? ('endloop')           | 
           {Lexicon("de")}? ('ende wiederholen')  | 
           {Lexicon("en")}? ('endloop')           | 
           {Lexicon("fr")}? ('endloop')           | 
           {Lexicon("ru")}? ('endloop')           ;
ENTRY: 
           {Lexicon("bg")}? ('entry')             | 
           {Lexicon("da")}? ('entry')             | 
           {Lexicon("de")}? ('entry')             | 
           {Lexicon("en")}? ('entry')             | 
           {Lexicon("fr")}? ('entry')             | 
           {Lexicon("ru")}? ('entry')             ;
ENUM: 
           {Lexicon("bg")}? ('enum')              | 
           {Lexicon("da")}? ('enum')              | 
           {Lexicon("de")}? ('enum')              | 
           {Lexicon("en")}? ('enum')              | 
           {Lexicon("fr")}? ('enum')              | 
           {Lexicon("he")}? ('enum')              | 
           {Lexicon("nl")}? ('opsomming')         | 
           {Lexicon("ru")}? ('enum')              ;
FIXED: 
           {Lexicon("bg")}? ('fixed')             | 
           {Lexicon("da")}? ('fixed')             | 
           {Lexicon("de")}? ('stationär')         | 
           {Lexicon("en")}? ('fixed')             | 
           {Lexicon("fr")}? ('fixe')              | 
           {Lexicon("he")}? ('fixed')             | 
           {Lexicon("nl")}? ('fixed')             | 
           {Lexicon("ru")}? ('fixed')             ;
FLOAT: 
           {Lexicon("bg")}? ('float')             | 
           {Lexicon("da")}? ('float')             | 
           {Lexicon("de")}? ('flottant')          | 
           {Lexicon("en")}? ('float')             | 
           {Lexicon("fr")}? ('flottant')          | 
           {Lexicon("he")}? ('float')             | 
           {Lexicon("nl")}? ('float')             | 
           {Lexicon("ru")}? ('float')             ;
FUNCTION: 
           {Lexicon("bg")}? ('function'           | 'func') | 
           {Lexicon("da")}? ('function'           | 'func') | 
           {Lexicon("de")}? ('fonction')          | 
           {Lexicon("en")}? ('function'           | 'func') | 
           {Lexicon("fr")}? ('fonction')          | 
           {Lexicon("he")}? ('function')          | 
           {Lexicon("nl")}? ('functie')           | 
           {Lexicon("ru")}? ('function'           | 'func') ;
GOTO: 
           {Lexicon("bg")}? ('перейти к')         | 
           {Lexicon("da")}? ('goto'               | 'go to') | 
           {Lexicon("de")}? ('gehen')             | 
           {Lexicon("en")}? ('goto'               | 'go to') | 
           {Lexicon("fr")}? ('aller à')           | 
           {Lexicon("he")}? ('goto')              | 
           {Lexicon("nl")}? ('ga')                | 
           {Lexicon("ru")}? ('перейти к')         ;
IF: 
           {Lexicon("bg")}? ('ако')               | 
           {Lexicon("da")}? ('hvis')              | 
           {Lexicon("de")}? ('wenn')              | 
           {Lexicon("en")}? ('if')                | 
           {Lexicon("fr")}? ('si')                | 
           {Lexicon("he")}? ('אם')                | 
           {Lexicon("nl")}? ('als')               | 
           {Lexicon("ru")}? ('если')              ;
INC: 
           {Lexicon("bg")}? ('inc')               | 
           {Lexicon("da")}? ('inc')               | 
           {Lexicon("de")}? ('inc')               | 
           {Lexicon("en")}? ('inc')               | 
           {Lexicon("fr")}? ('inc')               | 
           {Lexicon("ru")}? ('inc')               ;
INCLUDE: 
           {Lexicon("bg")}? ('include')           | 
           {Lexicon("da")}? ('include')           | 
           {Lexicon("de")}? ('enthalten')         | 
           {Lexicon("en")}? ('include')           | 
           {Lexicon("fr")}? ('comprendre')        | 
           {Lexicon("ru")}? ('include')           ;
INTERNAL: 
           {Lexicon("bg")}? ('internal')          | 
           {Lexicon("da")}? ('internal')          | 
           {Lexicon("de")}? ('intern')            | 
           {Lexicon("en")}? ('internal')          | 
           {Lexicon("fr")}? ('interne')           | 
           {Lexicon("he")}? ('internal')          | 
           {Lexicon("nl")}? ('intern')            | 
           {Lexicon("ru")}? ('internal')          ;
INTERRUPT: 
           {Lexicon("bg")}? ('interrupt')         | 
           {Lexicon("da")}? ('interrupt')         | 
           {Lexicon("de")}? ('unterbrechen')      | 
           {Lexicon("en")}? ('interrupt')         | 
           {Lexicon("fr")}? ('interrompre')       | 
           {Lexicon("he")}? ('interrupt')         | 
           {Lexicon("nl")}? ('interrupt')         | 
           {Lexicon("ru")}? ('interrupt')         ;
INTRINSIC: 
           {Lexicon("bg")}? ('intrinsic')         | 
           {Lexicon("da")}? ('intrinsic')         | 
           {Lexicon("de")}? ('intrinsisch')       | 
           {Lexicon("en")}? ('intrinsic')         | 
           {Lexicon("fr")}? ('intrinsic')         | 
           {Lexicon("ru")}? ('intrinsic')         ;
LANGUAGE: 
           {Lexicon("bg")}? ('lingua')            | 
           {Lexicon("da")}? ('lingua')            | 
           {Lexicon("de")}? ('lingua')            | 
           {Lexicon("en")}? ('lingua')            | 
           {Lexicon("fr")}? ('lingua')            | 
           {Lexicon("he")}? ('lingua')            | 
           {Lexicon("ru")}? ('lingua')            ;
LOOP: 
           {Lexicon("bg")}? ('повторете')         | 
           {Lexicon("da")}? ('gentage')           | 
           {Lexicon("de")}? ('wiederholen')       | 
           {Lexicon("en")}? ('loop')              | 
           {Lexicon("fr")}? ('boucle')            | 
           {Lexicon("he")}? ('loop')              | 
           {Lexicon("nl")}? ('lus')               | 
           {Lexicon("ru")}? ('повторять')         ;
NAMESPACE: 
           {Lexicon("fr")}? ('namespace')         ;
OFFSET: 
           {Lexicon("bg")}? ('offset'             | 'ofx') | 
           {Lexicon("da")}? ('offset'             | 'ofx') | 
           {Lexicon("de")}? ('offset'             | 'ofx') | 
           {Lexicon("en")}? ('offset'             | 'ofx') | 
           {Lexicon("fr")}? ('offset'             | 'ofx') | 
           {Lexicon("he")}? ('offset'             | 'ofx') | 
           {Lexicon("ru")}? ('offset'             | 'ofx') ;
OTHERWISE: 
           {Lexicon("en")}? ('otherwise')         ;
OUT: 
           {Lexicon("bg")}? ('out')               | 
           {Lexicon("da")}? ('out')               | 
           {Lexicon("de")}? ('depuis')            | 
           {Lexicon("en")}? ('out')               | 
           {Lexicon("fr")}? ('depuis')            | 
           {Lexicon("he")}? ('out')               | 
           {Lexicon("nl")}? ('out')               | 
           {Lexicon("ru")}? ('out')               ;
PAD: 
           {Lexicon("bg")}? ('pad')               | 
           {Lexicon("da")}? ('pad')               | 
           {Lexicon("de")}? ('pad')               | 
           {Lexicon("en")}? ('pad')               | 
           {Lexicon("fr")}? ('pad')               | 
           {Lexicon("he")}? ('pad')               | 
           {Lexicon("ru")}? ('pad')               ;
POINTER: 
           {Lexicon("bg")}? ('pointer'            | 'ptr') | 
           {Lexicon("da")}? ('pointer'            | 'ptr') | 
           {Lexicon("de")}? ('pointer')           | 
           {Lexicon("en")}? ('pointer'            | 'ptr') | 
           {Lexicon("fr")}? ('pointer')           | 
           {Lexicon("he")}? ('pointer')           | 
           {Lexicon("ru")}? ('pointer'            | 'ptr') ;
PRIVATE: 
           {Lexicon("bg")}? ('private')           | 
           {Lexicon("da")}? ('private')           | 
           {Lexicon("de")}? ('privé')             | 
           {Lexicon("en")}? ('private')           | 
           {Lexicon("fr")}? ('privé')             | 
           {Lexicon("he")}? ('private')           | 
           {Lexicon("nl")}? ('private')           | 
           {Lexicon("ru")}? ('private')           ;
PROCEDURE: 
           {Lexicon("bg")}? ('процедура')         | 
           {Lexicon("da")}? ('procedure'          | 'proc') | 
           {Lexicon("de")}? ('routine')           | 
           {Lexicon("en")}? ('procedure'          | 'proc') | 
           {Lexicon("fr")}? ('procédé')           | 
           {Lexicon("he")}? ('procedure')         | 
           {Lexicon("nl")}? ('procedure')         | 
           {Lexicon("ru")}? ('процедура')         ;
PUBLIC: 
           {Lexicon("bg")}? ('public')            | 
           {Lexicon("da")}? ('public')            | 
           {Lexicon("de")}? ('öffentlich')        | 
           {Lexicon("en")}? ('public')            | 
           {Lexicon("fr")}? ('public')            | 
           {Lexicon("he")}? ('public')            | 
           {Lexicon("nl")}? ('publiek')           | 
           {Lexicon("ru")}? ('public')            ;
RAW: 
           {Lexicon("en")}? ('raw')               ;
READONLY: 
           {Lexicon("bg")}? ('readonly')          | 
           {Lexicon("da")}? ('readonly')          | 
           {Lexicon("de")}? ('readonly')          | 
           {Lexicon("en")}? ('readonly')          | 
           {Lexicon("fr")}? ('readonly')          | 
           {Lexicon("he")}? ('readonly')          | 
           {Lexicon("nl")}? ('alleen lezen')      | 
           {Lexicon("ru")}? ('readonly')          ;
RECURSIVE: 
           {Lexicon("en")}? ('recursive'          | 'rec') ;
REF: 
           {Lexicon("bg")}? ('ref')               | 
           {Lexicon("da")}? ('ref')               | 
           {Lexicon("de")}? ('ref')               | 
           {Lexicon("en")}? ('ref')               | 
           {Lexicon("fr")}? ('ref')               | 
           {Lexicon("he")}? ('ref')               | 
           {Lexicon("nl")}? ('referentie')        | 
           {Lexicon("ru")}? ('ref')               ;
RELOOP: 
           {Lexicon("bg")}? ('reloop')            | 
           {Lexicon("da")}? ('reloop')            | 
           {Lexicon("de")}? ('reloop')            | 
           {Lexicon("en")}? ('reloop')            | 
           {Lexicon("fr")}? ('reloop')            | 
           {Lexicon("ru")}? ('reloop')            ;
RETURN: 
           {Lexicon("bg")}? ('возврат')           | 
           {Lexicon("da")}? ('vende tilbage')     | 
           {Lexicon("de")}? ('rückkehr')          | 
           {Lexicon("en")}? ('return')            | 
           {Lexicon("fr")}? ('retour')            | 
           {Lexicon("he")}? ('return')            | 
           {Lexicon("nl")}? ('terug')             | 
           {Lexicon("ru")}? ('возврат')           ;
RETURNON: 
           {Lexicon("bg")}? ('returnon')          | 
           {Lexicon("da")}? ('returnon')          | 
           {Lexicon("de")}? ('retour_si')         | 
           {Lexicon("en")}? ('returnon')          | 
           {Lexicon("fr")}? ('retour_si')         | 
           {Lexicon("he")}? ('returnon')          | 
           {Lexicon("nl")}? ('terug bij')         | 
           {Lexicon("ru")}? ('returnon')          ;
RETURNS: 
           {Lexicon("bg")}? ('returns')           | 
           {Lexicon("da")}? ('returns')           | 
           {Lexicon("de")}? ('rückkehrs')         | 
           {Lexicon("en")}? ('returns')           | 
           {Lexicon("fr")}? ('retours')           | 
           {Lexicon("ru")}? ('returns')           ;
SCOPE: 
           {Lexicon("bg")}? ('scope')             | 
           {Lexicon("da")}? ('scope')             | 
           {Lexicon("de")}? ('scope')             | 
           {Lexicon("en")}? ('scope')             | 
           {Lexicon("fr")}? ('scope')             | 
           {Lexicon("he")}? ('scope')             | 
           {Lexicon("nl")}? ('scope')             | 
           {Lexicon("ru")}? ('scope')             ;
SELECT: 
           {Lexicon("en")}? ('select')            ;
SINGLET: 
           {Lexicon("bg")}? ('singlet')           | 
           {Lexicon("da")}? ('singlet')           | 
           {Lexicon("de")}? ('singlet')           | 
           {Lexicon("en")}? ('singlet')           | 
           {Lexicon("fr")}? ('singlet')           | 
           {Lexicon("he")}? ('singlet')           | 
           {Lexicon("nl")}? ('singlet')           | 
           {Lexicon("ru")}? ('singlet')           ;
STACK: 
           {Lexicon("bg")}? ('stack')             | 
           {Lexicon("da")}? ('stack')             | 
           {Lexicon("de")}? ('stack')             | 
           {Lexicon("en")}? ('stack')             | 
           {Lexicon("fr")}? ('stack')             | 
           {Lexicon("he")}? ('stack')             | 
           {Lexicon("nl")}? ('stack')             | 
           {Lexicon("ru")}? ('stack')             ;
STATIC: 
           {Lexicon("bg")}? ('static')            | 
           {Lexicon("da")}? ('static')            | 
           {Lexicon("de")}? ('static')            | 
           {Lexicon("en")}? ('static')            | 
           {Lexicon("fr")}? ('static')            | 
           {Lexicon("he")}? ('static')            | 
           {Lexicon("nl")}? ('statisch')          | 
           {Lexicon("ru")}? ('static')            ;
STRING: 
           {Lexicon("bg")}? ('string')            | 
           {Lexicon("da")}? ('string')            | 
           {Lexicon("de")}? ('text')              | 
           {Lexicon("en")}? ('string')            | 
           {Lexicon("fr")}? ('chaîne')            | 
           {Lexicon("he")}? ('string')            | 
           {Lexicon("nl")}? ('string')            | 
           {Lexicon("ru")}? ('string')            ;
STRUCTURE: 
           {Lexicon("bg")}? ('structure'          | 'struct') | 
           {Lexicon("da")}? ('structure'          | 'struct') | 
           {Lexicon("de")}? ('structure')         | 
           {Lexicon("en")}? ('structure'          | 'struct') | 
           {Lexicon("fr")}? ('structure')         | 
           {Lexicon("he")}? ('structure')         | 
           {Lexicon("nl")}? ('structuur')         | 
           {Lexicon("ru")}? ('structure'          | 'struct') ;
THEN: 
           {Lexicon("bg")}? ('тогава')            | 
           {Lexicon("da")}? ('derefter')          | 
           {Lexicon("de")}? ('dann')              | 
           {Lexicon("en")}? ('then')              | 
           {Lexicon("fr")}? ('ensuite')           | 
           {Lexicon("ru")}? ('то')                ;
TO: 
           {Lexicon("bg")}? ('to')                | 
           {Lexicon("da")}? ('to')                | 
           {Lexicon("de")}? ('to')                | 
           {Lexicon("en")}? ('to')                | 
           {Lexicon("fr")}? ('to')                | 
           {Lexicon("he")}? ('to')                | 
           {Lexicon("nl")}? ('tot')               | 
           {Lexicon("ru")}? ('to')                ;
TYPE: 
           {Lexicon("bg")}? ('type')              | 
           {Lexicon("da")}? ('type')              | 
           {Lexicon("de")}? ('art')               | 
           {Lexicon("en")}? ('type')              | 
           {Lexicon("fr")}? ('type')              | 
           {Lexicon("he")}? ('type')              | 
           {Lexicon("nl")}? ('type')              | 
           {Lexicon("ru")}? ('type')              ;
UNALIGNED: 
           {Lexicon("bg")}? ('unaligned')         | 
           {Lexicon("da")}? ('unaligned')         | 
           {Lexicon("de")}? ('unaligned')         | 
           {Lexicon("en")}? ('unaligned')         | 
           {Lexicon("fr")}? ('unaligned')         | 
           {Lexicon("he")}? ('unaligned')         | 
           {Lexicon("ru")}? ('unaligned')         ;
UNTIL: 
           {Lexicon("bg")}? ('пока')              | 
           {Lexicon("da")}? ('indtil'             | 'til') | 
           {Lexicon("de")}? ('bis')               | 
           {Lexicon("en")}? ('until')             | 
           {Lexicon("fr")}? ('avant')             | 
           {Lexicon("he")}? ('until')             | 
           {Lexicon("nl")}? ('totdat')            | 
           {Lexicon("ru")}? ('пока')              ;
USES: 
           {Lexicon("en")}? ('uses')              ;
USING: 
           {Lexicon("bg")}? ('using')             | 
           {Lexicon("da")}? ('using')             | 
           {Lexicon("de")}? ('using')             | 
           {Lexicon("en")}? ('using')             | 
           {Lexicon("fr")}? ('using')             | 
           {Lexicon("he")}? ('using')             | 
           {Lexicon("nl")}? ('gebruikende')       | 
           {Lexicon("ru")}? ('using')             ;
UTF: 
           {Lexicon("en")}? ('utf')               ;
VARIABLE: 
           {Lexicon("bg")}? ('variable')          | 
           {Lexicon("da")}? ('variable')          | 
           {Lexicon("de")}? ('variable')          | 
           {Lexicon("en")}? ('variable')          | 
           {Lexicon("fr")}? ('variable')          | 
           {Lexicon("ru")}? ('variable')          ;
VARYING: 
           {Lexicon("bg")}? ('varying')           | 
           {Lexicon("da")}? ('varying')           | 
           {Lexicon("de")}? ('varying')           | 
           {Lexicon("en")}? ('varying')           | 
           {Lexicon("fr")}? ('varying')           | 
           {Lexicon("he")}? ('varying')           | 
           {Lexicon("nl")}? ('varierend')         | 
           {Lexicon("ru")}? ('varying')           ;
WHEN: 
           {Lexicon("en")}? ('when')              ;
WHILE: 
           {Lexicon("bg")}? ('докато')            | 
           {Lexicon("da")}? ('mens')              | 
           {Lexicon("de")}? ('solang')            | 
           {Lexicon("en")}? ('while')             | 
           {Lexicon("fr")}? ('tandis que')        | 
           {Lexicon("he")}? ('כלעוד')             | 
           {Lexicon("nl")}? ('zolang')            | 
           {Lexicon("ru")}? ('в то время как')    ;
YIELD: 
           {Lexicon("bg")}? ('yield')             | 
           {Lexicon("da")}? ('overdrage')         | 
           {Lexicon("de")}? ('abtreten')          | 
           {Lexicon("en")}? ('yield')             | 
           {Lexicon("fr")}? ('donner')            | 
           {Lexicon("he")}? ('yield')             | 
           {Lexicon("nl")}? ('opbrengst')         | 
           {Lexicon("ru")}? ('yield')             ;

/* End of generated Antlr4 keyword token definitions. */

LABEL:                (AT IDENTIFIER);
IDENTIFIER:           (IDENTIFIER_START IDENTIFIER_REST*); 
BINARY_PATTERN:       (BIN (LSEP BIN)*)+ FRAC_B? BASE_B;
OCTAL_PATTERN:        (OCT (LSEP OCT)*)+ FRAC_O? BASE_O;
HEXADECIMAL_PATTERN:  (HEX (LSEP HEX)*)+ FRAC_H? BASE_H;
DECIMAL_PATTERN:      (DEC (LSEP DEC)*)+ FRAC_D? BASE_D?;

// SYMBOLS AND OPERATORS

// There are some symbols that have a very natural Unicode character that better conveys their
// meanings. These are included below, the grammar will accept either the Unicode or the ASCII 
// forms. These are recognized by being name ending in _U

AT:           ('@');
RARROW_U:     ('->' | '➔'); // U+2794
DOT:          ('.');
COMMA:        (',');
LPAR: 		    ('(');
RPAR: 		    (')');
LBRACK: 	    ('[');
RBRACK: 	    (']');
LBRACE: 	    ('{');
RBRACE: 	    ('}');
EQUALS: 	    ('=');
ASSIGN_U:     ('⇐'); // U+21D0
TIMES: 		    ('*');
DIVIDE_U:     ('/' | '÷'); // U+00F7
PLUS: 		    ('+');
MINUS: 		    ('-');
SEMICOLON:	  (';');
POWER_U: 		  ('**' | '🠕');  // U+1F815
COLON: 		    (':');
TRIQUOTE:     ('"""');
DIQUOTE:      ('""'); 
QUOTE: 	      ('"');
SQUOTE: 	    ('\'');
NOT:   		    ('~');
GT:    		    ('>');
LT:    		    ('<');
GTE_U:        ('>=' |'≥');
LTE_U:   	    ('<=' |'≤');
NGT:   		    ('~>');
NLT:   		    ('~<');
NE_U: 		    ('~=' | '≠');
PCNT:  		    ('%');
AND:    	    ('&');
OR:     	    ('|');
NAND:         ('~&');
NOR:          ('~|');  
XOR_U:        ('^'  | '⊕');    // U+2295 excluisve bitwise OR
XNOR_U:       ('~^' | '~⊕');   // U+2295
REDAND:       ('&(');
REDOR:        ('|(');
REDNAND:      ('~&(');
REDNOR:       ('~|(');
REDXOR_U:     ('^('  | '⊕(');   // U+2295
REDXNOR_U:    ('~^(' | '~⊕('); // U+2295
LOGAND:  	    ('&&'); 	// short-circuit, logical AND
LOGOR:   	    ('||');  	// short-circuit, logical OR
CONC:   	    ('++');   // concatenate character strings or bit strings
L_LOG_SHIFT:  ('<<');   // logical: left bit lost rite bit becomes zero
R_LOG_SHIFT:  ('>>');   // logical: rite bit lost left bit becomes zero
R_ART_SHIFT:  ('>>>');  // arithmetic: rite bit lost left bit is copy of sign bit
L_ROTATE_U:   ('<<@' | '⧀');  // U+29C0 rotate: left bit rotated out rite bit becomes that rotated left bit
R_ROTATE_U:   ('@>>' | '⧁');  // U+29C1 rotate: rite bit rotated out left bit becomes that rotated rite bit
RANGE:        ('..');   // used to represent a range from some start to some end

// LEXER FRAGMENTS

fragment LSEP: (' ' | '_');
fragment BIN: [0-1];
fragment OCT: [0-7];
fragment DEC: [0-9];
fragment HEX: [0-9a-fA-F];
fragment BASE_B: (':b' | ':B');
fragment BASE_O: (':o' | ':O');
fragment BASE_D: (':d' | ':D');
fragment BASE_H: (':h' | ':H');
fragment FRAC_B: ('.' [0-1]+);
fragment FRAC_D: ('.' [0-9]+);
fragment FRAC_O: ('.' [0-7]+);
fragment FRAC_H: ('.' [0-9a-fA-F]+);
fragment IDENTIFIER_START: [$a-zA-Z_\u0370-\u03ff];
fragment IDENTIFIER_REST:  [$a-zA-Z_0-9\u0370-\u03ff];