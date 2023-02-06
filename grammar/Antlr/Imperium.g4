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
  : BYTE_ORDER_MARK? uses* scope* | stmtBlock? EOF
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
  : procedureStmt stmtBlock? procedureEnd
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
  : parameterNameCommalist? ((coprocedureSpecifier?) | ((coprocedureSpecifier | handlerSpecifier)? RECURSIVE?))
  ;

funcDescriptor
  : parameterNameCommalist? ((returnsDescriptor coprocedureSpecifier?) | ((coprocedureSpecifier | handlerSpecifier)? RECURSIVE? returnsDescriptor))
  ;

returnsDescriptor
  : RETURNS LPAR dataAttribute RPAR
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

// Any parser rules that need to match and identifier, must match
// against the 'identifier' rule and not the IDENTFIER token.
// If this is not done then it might fail to parse correctly
// if an identifer happens to be a keyword.



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
  : thenClause executableStmt* elseClause? ifEnd
  | thenClause executableStmt* elifClause+ ifEnd
  ;

ifEnd
  : END IF? SEMICOLON
  ;

thenClause
  : IF expression THEN
  ;

elseClause
  : ELSE executableStmt*
  ;

elifClause
  : ELIF expression THEN executableStmt* elseClause?
  ;

loopStmt
  : LOOP  SEMICOLON executableStmt* loopEnd
    | LOOP (
          (whileOption untilOption? SEMICOLON executableStmt* loopEnd)
        | (untilOption whileOption? SEMICOLON executableStmt* loopEnd)
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
  : WHEN (ANY | ALL)? LPAR (expression (COMMA expression)*) RPAR executableStmt*
  ;

otherwiseClause
  : ELSE executableStmt*
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

// LEXER TOKEN DEFINITIONS

COMMENT:            '/*' (COMMENT | .)*? '*/' -> channel(2);
LINE_COMMENT:       '//' .*? '\n' -> channel(HIDDEN);
WS:                 (' ')+ -> skip;
NEWLINE:            [\r\n]+ -> skip;
TAB:                ('\t')+ -> skip;
STRING_LITERAL_3:   TRIQUOTE (.)*? TRIQUOTE;
STRING_LITERAL_2:   DIQUOTE  (.)*? DIQUOTE;
STRING_LITERAL_1:   QUOTE    (.)*? QUOTE;
BYTE_ORDER_MARK:    '\u00EF' '\u00BB' '\u00BF';

/* ---------------------------------------------------------------------------------------------------- */
/* These Antlr4 keyword token definitions were generated by a utility on 2/4/2023 at 9:40 AM            */
/* Input:  D:\Git\GitHub\Steadsoft\imperium\grammar\antlr\imperium.keywords.json                        */
/* Output: D:\Git\GitHub\Steadsoft\imperium\grammar\antlr\ImperiumKeywords.txt                          */
/*                                                                                                      */
/* Number of languages 1.                                                                               */
/* Expected number of keywords per language 75.                                                         */
/* ---------------------------------------------------------------------------------------------------- */

identifier: (
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
  )
  | IDENTIFIER
  ;

ALIAS: 
           {Lexicon("en")}? ('alias')       ;
ALIGNED: 
           {Lexicon("en")}? ('aligned')     ;
ALL: 
           {Lexicon("en")}? ('all')         ;
ANY: 
           {Lexicon("en")}? ('any')         ;
ARGUMENT: 
           {Lexicon("en")}? ('argument'     | 'arg') ;
AS: 
           {Lexicon("en")}? ('as')          ;
BASED: 
           {Lexicon("en")}? ('based')       ;
BINARY: 
           {Lexicon("en")}? ('binary'       | 'bin') ;
BIT: 
           {Lexicon("en")}? ('bit')         ;
BOOLEAN: 
           {Lexicon("en")}? ('boolean'      | 'bool') ;
BUILTIN: 
           {Lexicon("en")}? ('builtin')     ;
BY: 
           {Lexicon("en")}? ('by')          ;
BYPASS: 
           {Lexicon("en")}? ('bypass')      ;
CALL: 
           {Lexicon("en")}? ('call')        ;
CHARACTER: 
           {Lexicon("en")}? ('character'    | 'char') ;
COFUNCTION: 
           {Lexicon("en")}? ('cofunction')  ;
COROUTINE: 
           {Lexicon("en")}? ('coroutine')   ;
DECIMAL: 
           {Lexicon("en")}? ('decimal'      | 'dec') ;
DECLARE: 
           {Lexicon("en")}? ('declare'      | 'dcl') ;
DEFINE: 
           {Lexicon("en")}? ('define'       | 'def') ;
DEFINED: 
           {Lexicon("en")}? ('defined')     ;
ELIF: 
           {Lexicon("en")}? ('elif')        ;
ELSE: 
           {Lexicon("en")}? ('else')        ;
END: 
           {Lexicon("en")}? ('end')         ;
ENDLOOP: 
           {Lexicon("en")}? ('endloop')     ;
ENTRY: 
           {Lexicon("en")}? ('entry')       ;
ENUM: 
           {Lexicon("en")}? ('enum')        ;
FIXED: 
           {Lexicon("en")}? ('fixed')       ;
FLOAT: 
           {Lexicon("en")}? ('float')       ;
FUNCTION: 
           {Lexicon("en")}? ('function'     | 'func') ;
GOTO: 
           {Lexicon("en")}? ('goto'         | 'go to') ;
IF: 
           {Lexicon("en")}? ('if')          ;
INC: 
           {Lexicon("en")}? ('inc')         ;
INCLUDE: 
           {Lexicon("en")}? ('include')     ;
INTERNAL: 
           {Lexicon("en")}? ('internal')    ;
INTERRUPT: 
           {Lexicon("en")}? ('interrupt')   ;
INTRINSIC: 
           {Lexicon("en")}? ('intrinsic')   ;
LANGUAGE: 
           {Lexicon("en")}? ('lingua')      ;
LOOP: 
           {Lexicon("en")}? ('loop')        ;
OFFSET: 
           {Lexicon("en")}? ('offset'       | 'ofx') ;
OTHERWISE: 
           {Lexicon("en")}? ('otherwise')   ;
OUT: 
           {Lexicon("en")}? ('out')         ;
PAD: 
           {Lexicon("en")}? ('pad')         ;
POINTER: 
           {Lexicon("en")}? ('pointer'      | 'ptr') ;
PRIVATE: 
           {Lexicon("en")}? ('private')     ;
PROCEDURE: 
           {Lexicon("en")}? ('procedure'    | 'proc') ;
PUBLIC: 
           {Lexicon("en")}? ('public')      ;
RAW: 
           {Lexicon("en")}? ('raw')         ;
READONLY: 
           {Lexicon("en")}? ('readonly')    ;
RECURSIVE: 
           {Lexicon("en")}? ('recursive'    | 'rec') ;
REF: 
           {Lexicon("en")}? ('ref')         ;
RELOOP: 
           {Lexicon("en")}? ('reloop')      ;
RETURN: 
           {Lexicon("en")}? ('return')      ;
RETURNON: 
           {Lexicon("en")}? ('returnon')    ;
RETURNS: 
           {Lexicon("en")}? ('returns')     ;
SCOPE: 
           {Lexicon("en")}? ('scope')       ;
SELECT: 
           {Lexicon("en")}? ('select')      ;
SINGLET: 
           {Lexicon("en")}? ('singlet')     ;
STACK: 
           {Lexicon("en")}? ('stack')       ;
STATIC: 
           {Lexicon("en")}? ('static')      ;
STRING: 
           {Lexicon("en")}? ('string')      ;
STRUCTURE: 
           {Lexicon("en")}? ('structure'    | 'struct') ;
THEN: 
           {Lexicon("en")}? ('then')        ;
TO: 
           {Lexicon("en")}? ('to')          ;
TYPE: 
           {Lexicon("en")}? ('type')        ;
UNALIGNED: 
           {Lexicon("en")}? ('unaligned')   ;
UNTIL: 
           {Lexicon("en")}? ('until')       ;
USES: 
           {Lexicon("en")}? ('uses')        ;
USING: 
           {Lexicon("en")}? ('using')       ;
UTF: 
           {Lexicon("en")}? ('utf')         ;
VARIABLE: 
           {Lexicon("en")}? ('variable')    ;
VARYING: 
           {Lexicon("en")}? ('varying')     ;
WHEN: 
           {Lexicon("en")}? ('when')        ;
WHILE: 
           {Lexicon("en")}? ('while')       ;
YIELD: 
           {Lexicon("en")}? ('yield')       ;

/* End of generated Antlr4 keyword token definitions. */



LABEL:                (AT IDENTIFIER);
IDENTIFIER:           (IDENTIFIER_START IDENTIFIER_REST*);
BINARY_PATTERN:       (BIN (LSEP BIN)*)+ FRAC_B? BASE_B;
OCTAL_PATTERN:        (OCT (LSEP OCT)*)+ FRAC_O? BASE_O;
HEXADECIMAL_PATTERN:  (HEX (LSEP HEX)*)+ FRAC_H? BASE_H;
INTEGER:              ([1-9] [0-9]*);
DECIMAL_PATTERN:      (DEC (LSEP DEC)*)+ FRAC_D? BASE_D?;



// SYMBOLS AND OPERATORS

// There are some symbols that have a very natural Unicode character that better conveys their
// meanings. These are included below, the grammar will accept either the Unicode or the ASCII
// forms. These are recognized by being name ending in _U

AT:             ('@');
RARROW_U:       ('->'|'➔'); // U+2794
MAPSTO_U:       ('-->'|'↦'); // U+21A6
DOT:            ('.');
COMMA:          (',');
LPAR:           ('(');
RPAR:           (')');
LBRACK:         ('[');
RBRACK:         (']');
LBRACE:         ('{');
RBRACE:         ('}');
EQUALS:         ('=');
ASSIGN_U:       ('⇐'); // U+21D0
TIMES:          ('*');
DIVIDE_U:       ('/' | '÷'); // U+00F7
PLUS:           ('+');
MINUS:          ('-');
SEMICOLON:      (';');
POWER_U:        ('**' | '🠕');  // U+1F815
COLON:          (':');
TRIQUOTE:       ('"""');
DIQUOTE:        ('""');
QUOTE:          ('"');
SQUOTE:         ('\'');
NOT:            ('~');
GT:             ('>');
LT:             ('<');
GTE_U:          ('>='|'≥');
LTE_U:          ('<='|'≤');
NGT:            ('~>');
NLT:            ('~<');
NE_U:           ('~='|'≠');
PCNT:           ('%');
AND:            ('&');
OR:             ('|');
NAND:           ('~&');
NOR:            ('~|');
XOR_U:          ('^'|'⊕');    // U+2295 excluisve bitwise OR
XNOR_U:         ('~^'|'~⊕');   // U+2295
REDAND:         ('&(');
REDOR:          ('|(');
REDNAND:        ('~&(');
REDNOR:         ('~|(');
REDXOR_U:       ('^('|'⊕(');   // U+2295
REDXNOR_U:      ('~^('|'~⊕('); // U+2295
LOGAND:         ('&&');     // short-circuit, logical AND
LOGOR:          ('||');     // short-circuit, logical OR
CONC:           ('++');   // concatenate character strings or bit strings
L_LOG_SHIFT:    ('<<');   // logical: left bit lost rite bit becomes zero
R_LOG_SHIFT:    ('>>');   // logical: rite bit lost left bit becomes zero
R_ART_SHIFT:    ('>>>');  // arithmetic: rite bit lost left bit is copy of sign bit
L_ROTATE_U:     ('<<@'|'⧀');  // U+29C0 rotate: left bit rotated out rite bit becomes that rotated left bit
R_ROTATE_U:     ('@>>'|'⧁');  // U+29C1 rotate: rite bit rotated out left bit becomes that rotated rite bit
RANGE:          ('..');   // used to represent a range from some start to some end

//SYMBOLS:        (UNICODE_MATH_OPS | UNICODE_MISC_TECH | UNICODE_MISC_MATH) (UNICODE_MATH_OPS | UNICODE_MISC_TECH | UNICODE_MISC_MATH)*; // do not overlap with identifiers

// LEXER FRAGMENTS

fragment LSEP:    (' ' | '_');
fragment BIN:     [0-1];
fragment OCT:     [0-7];
fragment DEC:     [0-9];
fragment HEX:     [0-9a-fA-F];
fragment BASE_B:  (':b' | ':B');
fragment BASE_O:  (':o' | ':O');
fragment BASE_D:  (':d' | ':D');
fragment BASE_H:  (':h' | ':H');
fragment FRAC_B:  ('.' [0-1]+);
fragment FRAC_D:  ('.' [0-9]+);
fragment FRAC_O:  ('.' [0-7]+);
fragment FRAC_H:  ('.' [0-9a-fA-F]+);

// When testing and using Antlr to gen test inputs, we restrict
// identifiers for ease of readability.

//fragment IDENTIFIER_START: [$a-zA-Z_\u0370-\u03ff];
//fragment IDENTIFIER_REST:  [$a-zA-Z_0-9\u0370-\u03ff];
fragment IDENTIFIER_START: [$a-zA-Z_];
fragment IDENTIFIER_REST:  [$a-zA-Z_0-9];

fragment UNICODE_MATH_OPS:  [\u2200-\u22FF]; // Mathematical Operators
fragment UNICODE_MISC_TECH: [\u2300-\u23FF]; // Includes APL
fragment UNICODE_MISC_MATH: [\u27C0-\u27EF]; // Miscellaneous match
