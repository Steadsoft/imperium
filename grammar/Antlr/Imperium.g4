/*------------------------------------------------------------------------------*/
/*     This is the grammar for IPL - the Imperium programming language          */
/*------------------------------------------------------------------------------*/
/* It's based primarily on the PL/I grammar because that has no reserved words. */
/* This grammar supports keywords for multiple cultures, this is done by having */
/* a JSON lexicon file that defines the literal text for each keyword for each  */
/* language.                                                                    */
/*                                                                              */
/* No reserved words means an identifier can be the same as a keyword and the   */
/* text will still parse correctly. We do this to facilitate the addition of    */
/* new keywords in future releases of the language.                             */
/*                                                                              */
/* This also means that if an identifier happens to also match a keyword in     */
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
/* Keyword translation info kindly contributed by:                              */
/* English (en) - Hugh Gleaves                                                  */
/* Dutch (nl)   - Gabor de Mooij (https://github.com/gabordemooij/citrine)      */
/*------------------------------------------------------------------------------*/

grammar Imperium; // Latin for "control"

options
{
  contextSuperClass=VisitorContext ;
  tokenVocab = ImperiumLexer;
}


translationUnit
  : BYTE_ORDER_MARK? uses* (scope | traits | passiveStmt)* EOF
  ;

uses
  : USES identifier (DOT identifier)* SEMICOLON
  ;
scope
  : scopeStmt (scope | traits | passiveStmt)* scopeEnd
  ;

scopeStmt
  : SCOPE identifier (DOT identifier)* PRIVATE? SEMICOLON
  ;

scopeEnd
  : END SCOPE? SEMICOLON
  ;

assemblerToken
  : (ASSEMBLER_DEC_INTEGER | ASSEMBLER_HEX_INTEGER | ASSEMBLER_BIN_INTEGER | ASSEMBLER_OCT_INTEGER)
  | ASSEMBLER_PUNCTUATOR
  | ASSEMBLER_SYMBOL
  | ASSEMBLER_BRACKET
  | ASSEMBLER_PAREN
  | ASM_IDENTIFIER
  ;

// Traits is mainly a means to implement these kinds of options
// https://gcc.gnu.org/onlinedocs/gcc/Variable-Attributes.html


traits
  : traitStmt passiveStmt* traitsEnd
  ;

traitsEnd
 : END TRAITS? SEMICOLON
 ;

traitStmt
  : TRAITS (declarationTraits | procedureTraits) SEMICOLON
  ;

declarationTraits
  : DECLARE LPAR declarationTrait (COMMA declarationTrait)* RPAR
  ;

declarationTrait
  : SECTION LPAR STRING_LITERAL_1 RPAR
  | ALIGNED (LPAR INTEGER RPAR)?
  | RETAIN  
  ;

procedureTraits
  : PROCEDURE LPAR procedureTraitsList RPAR
  ;

procedureTraitsList
  : procedureTrait (COMMA procedureTrait)*
  ;

procedureTrait
  : COLD
  // there might be a case to be made for a limited type of declaration, a "reg" or "register. 
  // A naked procedure could then declare say an integer as a "reg" meaning it acts as a local variable BUILTIN
  // is not on the stack.
  | NAKED   
  | SECTION LPAR STRING_LITERAL_1 RPAR
  | RETAIN
  ;

procedure
  : procedureStmt passiveStmt* activeStmt* procedureEnd
  ;

function
  :  functionStmt passiveStmt* activeStmt* functionEnd
  ;

procedureStmt
  : PROCEDURE identifier parameterNameCommalist? procedureAttributes? (TRAITS LPAR procedureTraitsList RPAR)? SEMICOLON
  ;

functionStmt
  : FUNCTION identifier parameterNameCommalist? returnsDescriptor functionAttributes? SEMICOLON
  ;

targetSpec
  : LPAR identifier RPAR
  ;

procedureAttributes
  : MAIN
  | INTRINSIC targetSpec
  | RECURSIVE
  | INTERRUPT
  | COROUTINE
  ;

functionAttributes
  : INTRINSIC targetSpec 
  | RECURSIVE
  | COFUNCTION
  ;  

procedureEnd
  : END PROCEDURE? SEMICOLON
  ;

functionEnd
  : END FUNCTION? SEMICOLON
  ;

returnsDescriptor
  : RETURNS LPAR dataAttribute RPAR
  ;
    // consider using keyword 'is' instead and forcing it to be right after the params...

terminator
  : SEMICOLON
  ;

labelStmt
  : LABEL (LPAR decimalLiteral RPAR)?
  ;

passiveStmt
  : declareStmt
  | defineStmt
  | procedure
  | function
  | intrinsic
  | nullStmt
  ;

intrinsic
  : INTRINSIC_ENTER assemblerStmt* ASSEMBLER_END
  ;

assemblerStmt
  : assemblerToken* ASSEMBLER_NEWLINE  
   ;
activeStmt
  : labelStmt
  | assignmentStmt
  | callStmt
  | gotoStmt
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
  : reference RARROW_U basicReference argumentsList?    # PtrRef
  | basicReference argumentsList?                     # BasicRef
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

// see expr '^'<assoc=right> expr 

expression
  : primitiveExpression                       # ExprPrimitive
  | parenthesizedExpression                   # ExprParenthesized
  | prefixExpression                          # ExprPrefixed
  | <assoc=right> expression POWER_U expression # ExprRaise
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
  | expression MAPSTO_U (map_set | bool_set)  # ExpreMap1
  | arguments MAPSTO_U (map_set | bool_set)   # ExpreMap2
  //| expression custop expression              # ExprCustom
  ;
/*
custop
  : LBRACE identifier RBRACE
  | SYMBOLS
  ;
  */
/*
brace_set
  : LBRACE expression (COMMA (expression | brace_set))* RBRACE
  ;
*/

map_set
  : (LPAR (expression | arguments) (COMMA (expression | arguments))* COLON expression RPAR)+ (LPAR expression RPAR)?
  ;

bool_set
  : (LPAR expression RPAR) (LPAR expression RPAR)
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

callStmt
  : CALL reference SEMICOLON
  ;

gotoStmt
  : (GOTO identifier LPAR expression RPAR) SEMICOLON
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
  : (dataAttribute | BUILTIN | VARIABLE | memoryAttribute | linkage_attribute)
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

linkage_attribute
  : RETAIN
  | SECTION LPAR STRING_LITERAL_1 RPAR
  | MAIN
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
  : (INTEGER | identifier)
  ;

scale_factor
  : (INTEGER | identifier)
  ;

maxStringLength
  : LPAR (TIMES | (INTEGER | identifier)) RPAR
  ;

maxLength
  : LPAR (INTEGER | identifier) RPAR
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
  : thenClause activeStmt* elseClause? ifEnd
  | thenClause activeStmt* elifClause+ ifEnd
  ;

ifEnd
  : END IF? SEMICOLON
  ;

thenClause
  : IF expression THEN
  ;

elseClause
  : ELSE activeStmt*
  ;

elifClause
  : ELIF expression THEN activeStmt* elseClause?
  ;

loopStmt
  : LOOP  SEMICOLON activeStmt* loopEnd
    | LOOP (
          (whileOption untilOption? SEMICOLON activeStmt* loopEnd)
        | (untilOption whileOption? SEMICOLON activeStmt* loopEnd)
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
  : WHEN (ANY | ALL)? LPAR (expression (COMMA expression)*) RPAR activeStmt*
  ;

otherwiseClause
  : ELSE activeStmt*
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
  : binaryLiteral
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
  : (INTEGER)
  | (DECIMAL_PATTERN)
  ;

binaryLiteral
  : (BINARY_PATTERN)
  ;

/* ---------------------------------------------------------------------------------------------------- */
/* These Antlr4 keyword token definitions were generated by a utility on 2/16/2023 at 10:57 AM          */
/* Input:  D:\Git\GitHub\Steadsoft\imperium\grammar\antlr\imperium.keywords.json                        */
/* Output: D:\Git\GitHub\Steadsoft\imperium\grammar\antlr\ImperiumKeywords.txt                          */
/*                                                                                                      */
/* Number of languages 1.                                                                               */
/* Expected number of keywords per language 85.                                                         */
/* ---------------------------------------------------------------------------------------------------- */

identifier: (
    ACCEPT
  | ALIAS
  | ALIGNED
  | ALL
  | ANY
  | ARGUMENT
  | AS
  | ASSEMBLER
  | BASED
  | BINARY
  | BIT
  | BOOLEAN
  | BOOTSTRAP
  | BUILTIN
  | BY
  | BYPASS
  | CALL
  | CHARACTER
  | COFUNCTION
  | COLD
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
  | MAIN
  | NAKED
  | NORETURN
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
  | RETAIN
  | RETURN
  | RETURNON
  | RETURNS
  | SCANAS
  | SCOPE
  | SECTION
  | SELECT
  | SINGLET
  | STACK
  | STATIC
  | STRING
  | STRUCTURE
  | THEN
  | TO
  | TRAITS
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
  )
  | IPL_IDENTIFIER
  ;