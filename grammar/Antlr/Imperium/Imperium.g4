/*----------------------------------------FIDENT--------------------------------------*/
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
  tokenVocab = ImperiumLexer;  
  contextSuperClass=VisitorContext ;
}


translationUnit
  : BYTE_ORDER_MARK? uses* (Scopes+=scope | Traits=traits | PassiveStatements+=passiveStmt)* EOF // BOM is skipped by lexer, but we mention here
  ;

uses
  : USES identifier (DOT identifier)* 
  ;
scope
  : scopeStart  (Scopes+=scope | Traits+=traits | PassiveStatements+=passiveStmt)* scopeEnd
  ;

scopeStart
  : SCOPE NEWLINE* identifier (DOT identifier)* PRIVATE? 
  ;

scopeEnd
  : END SCOPE? 
  ;

//assemblerToken
//  : IDENTIFIER
//  //| SEMICOLON
//  | COMMA
//  | EQUALS
//  | LBRACK
//  | RBRACK
//  | LBRACE
//  | RBRACE
//  | LPAR
//  | RPAR
//  | HASH
//  | INTEGER
//  | AINTEGER
//  ;

// Traits is mainly a means to implement these kinds of options
// https://gcc.gnu.org/onlinedocs/gcc/Variable-Attributes.html

stmtEnd
    : SEMICOLON 
    | NEWLINE
    ;

traits
  : traitsStart passiveStmt* traitsEnd
  ;

traitsStart
  : TRAITS (declarationTraits | procedureTraits) 
  ;

traitsEnd
  : END TRAITS?
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

procedureRule
  : procedureStmt (passiveStmt | activeStmt)* procedureEnd
  | PROCEDURE ProcedureName=identifier parameterNameCommalist? INTRINSIC target (passiveStmt)* END
  ;

target
  : LPAR identifier RPAR
  ;

//asmBlock
//  : (ASSEMBLER asmOptions? assemblerStmt* END)
//  ;

//asmOptions
//   : LPAR (SECTION LPAR STRING_LITERAL_1 RPAR)? RPAR
//   ;

functionRule
  :  functionStmt (passiveStmt | activeStmt)* functionEnd
  ;

  // AST: Node
procedureStmt
  : PROCEDURE ProcedureName=identifier parameterNameCommalist? procedureAttributes? (TRAITS LPAR procedureTraitsList RPAR)? 
  ;
  // AST: Node
functionStmt
  : FUNCTION FunctionName=identifier parameterNameCommalist? returnsDescriptor functionAttributes?
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
  : END PROCEDURE? 
  ;

functionEnd
  : END FUNCTION? 
  ;

returnsDescriptor
  : RETURNS LPAR dataAttribute RPAR
  ;
    // consider using keyword 'is' instead and forcing it to be right after the params...

//terminator
//  : SEMICOLON
//  ;

labelStmt
  : LABEL (LPAR decimalLiteral RPAR)?
  ;

passiveStmt
  : declareStmt stmtEnd        # Declaration
  | defineStmt stmtEnd         # Definition
  | procedureRule stmtEnd     # Procedure
  | functionRule  stmtEnd      # Function
//  | stmtEnd            # Sep
  ;


//assemblerStmt
//  : assemblerToken
//  | nullStmt
//  ;

//assemblerInlineComment
//  : ASSEMBLER_LINE_COMMENT
//  ;

activeStmt
  : labelStmt stmtEnd
  | assignmentStmt stmtEnd
  | callStmt stmtEnd
  | gotoStmt stmtEnd
  | returnStmt stmtEnd
  | ifStmt stmtEnd
  | loopStmt stmtEnd
  | selectStmt stmtEnd
  | endloopStmt stmtEnd
  | reloopStmt stmtEnd
//  | stmtEnd
  ;

//nullStmt
//  : SEMICOLON
//  ;

assignmentStmt
  : Target=reference (ASSIGN_U | EQUALS) Source=expression 
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
  : primitiveExpression                                     # ExprPrimitive
  | parenthesizedExpression                                 # ExprParenthesized
  | prefixExpression                                        # ExprPrefixed
  | <assoc=right> Left=expression POWER_U Rite=expression   # ExprRaise
  | Left=expression multiplyOperator Rite=expression        # ExprMulDiv
  | Left=expression additionOperator Rite=expression        # ExprAddSub
  | Left=expression bitAdjustOperator Rite=expression       # ExprBitAdjust
  | Left=expression CONC Rite=expression                    # ExprConcat
  | Left=expression comparisonOperator Rite=expression      # ExprCompare
  | Left=expression boolAndOperator Rite=expression         # ExprBoolAnd
  | Left=expression boolXorOperator Rite=expression         # ExprBoolXor
  | Left=expression boolOrOperator Rite=expression          # ExprBoolOr
  | Left=expression LOGAND Rite=expression                  # ExprLogAnd
  | Left=expression LOGOR Rite=expression                   # ExprLogOr
  | Mapex=expression MAPSTO_U (map_set | bool_set)          # MapExpression
  | MapArgs=arguments MAPSTO_U (map_set | bool_set)         # MapArguments
  ;

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
  : CALL reference 
  ;

gotoStmt
  : (GOTO identifier LPAR expression RPAR) 
  | (GOTO reference) 
  ;

endloopStmt
  : ENDLOOP identifier?
  ;

reloopStmt
  : RELOOP identifier?
  ;

declareStmt
  : (DECLARE | ARGUMENT) identifier dimensionSuffix? declareAsBody #DeclareAs
  | (DECLARE | ARGUMENT) declarationBody                           #DeclareName
  ;

declareAsBody
  : AS identifier memoryAttribute?
  ;

declarationBody
  : identifier typeInfo
  ;

typeInfo
  : dimensionSuffix? attributes
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

attributes
  : (dataAttribute memoryAttribute? linkageOption?)
  | (dataAttribute linkageOption? memoryAttribute?)
  | (memoryAttribute dataAttribute? linkageOption?)
  | (memoryAttribute linkageOption? dataAttribute?)
  | (linkageOption memoryAttribute? dataAttribute?)
  | (linkageOption dataAttribute? memoryAttribute?)
  ;

memoryAttribute
  : STACK
  | STATIC
  | based
  | defined
  ;

dataAttribute
  : numericScale? BINARY (precision)?
  | numericScale? DECIMAL (precision)?
  | BINARY (precision)? numericScale?
  | DECIMAL (precision)? numericScale?
  | POINTER
  | BIT maxLength
  | CHARACTER
  | STRING maxStringLength 
  | ENTRY
  | LABEL
  | OFFSET
  | VARYING
  | COROUTINE
  | COFUNCTION
  | BUILTIN
  | INTRINSIC
  ;

numericScale
    : (FIXED | FLOAT)
    ;

linkageOption
  : RETAIN MAIN? linkageSection?
  | RETAIN linkageSection? MAIN?
  | MAIN RETAIN? linkageSection?
  | MAIN linkageSection? RETAIN?
  | linkageSection MAIN? RETAIN?
  | linkageSection RETAIN? MAIN?
  ;

linkageSection
    : (SECTION LPAR STRING_LITERAL_1 RPAR)
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
  : RETURN (LPAR expression RPAR)? 
  ;

ifStmt
  : thenClause Then=activeStmt* ElseClause=elseClause? ifEnd
  | thenClause Then=activeStmt* ElifClause=elifClause+ ifEnd
  ;

ifEnd
  : END IF?
  ;

thenClause
  : IF expression THEN
  ;

elseClause
  : ELSE Else=activeStmt*
  ;

elifClause
  : ELIF expression THEN Elif=activeStmt* elseClause?
  ;

loopStmt
  : LOOP  activeStmt* loopEnd
  | LOOP (whileLoop | untilLoop) activeStmt* loopEnd
  ;

// each of the two loop orderings, must be semantically identical
// A while(x) until(y) must not behave differently to an until(y) while(x).

whileLoop
  : (whileOption untilOption?)
  ;

untilLoop
  : (untilOption whileOption?)
  ;

loopEnd
  : END LOOP? 
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
  : END SELECT? 
  ;

selectClause
  : SELECT (LPAR expression RPAR)? 
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
  : ENUM (binaryEnum | decimalEnum | stringEnum | bitEnum)? enumBody END ENUM? 
  ;

aliasType
  : ALIAS attributes
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
  : identifier (EQUALS enumLiteral)? (identifier (EQUALS enumLiteral)? )*
  ;

enumLiteral
  : (decimalLiteral | stringLiteral | binaryLiteral)
  ;

structType
  : STRUCTURE structBody END STRUCTURE? 
  ;

structBody
  : structMemberList
  ;

structMemberList
  : structMember  (structMember )*
  ;

structSubstruct
  : StructName=identifier dimensionSuffix? STRUCTURE  structBody END STRUCTURE?
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
  | IDENTIFIER
  ;