
/*
    GRAMMAR OVERVIEW
    This grammar is based in part on the concrete syntax of PL/I defined in ANSI standard X3.74-1987. 
    This grammar has several important characteristics that reflect language design goals.
    1. There are no reserved words, identfiers can be keywords, new keywords can be added over time with backward compatibility.
    2. Statements are either block or single in nature. Block statements are terminated by 'end' and single by either Newline or Semicolon.
    3. Staments may be preceded by any number of Newlines and or Semicolons which are simply ignored.
    4. One or more newlines may appear inbetween the terms of a statement so that a statement can be split across lines.
    5. Semicolons must appear at the end of single statements or in front of statements (which are ignored like empty statements)
 */

grammar Syscode;

// Parser rules

preamble: (NEWLINE | SEMICOLON)+;
statementSeparator : (SEMICOLON | NEWLINE);
emptyLines: NEWLINE+;


compilation: (statement* endOfFile); 
statement:  preamble? realStatement ;
realStatement : (assignment | label | scope | enum | struct | if | declare | procedure );

//statements: (statement)*;
label: AT identifier statementSeparator;
scope: lineScope | blockScope;
lineScope:  (SCOPE emptyLines? Name=qualifiedName emptyLines? statementSeparator);
blockScope: (SCOPE emptyLines? Name=qualifiedName emptyLines? statement* emptyLines? END)  ;
procedure: PROC emptyLines? Spelling=identifier paramList? statement* emptyLines? END;
struct: STRUCT structDefinition ;
enum: ENUM emptyLines? Name=identifier emptyLines? typename? memberSeparator emptyLines? Members=enumMembers emptyLines? END;

declare: DCL Spelling=identifier Bounds=dimensionSuffix? typename statementSeparator ;

if:             IF emptyLines? exprThenBlock emptyLines? elifBlock? emptyLines? elseBlock? emptyLines? END;
exprThenBlock:  expression emptyLines? THEN emptyLines? thenBlock;
thenBlock :     statement*;
elseBlock :     (ELSE emptyLines? thenBlock);
elifBlock :     (ELIF emptyLines? exprThenBlock)+;

assignment : Target=reference (EQUALS) Source=expression statementSeparator;


reference
  : reference RARROW basicReference argumentsList?  
  | basicReference argumentsList?                    
  ;

basicReference
  : structureQualificationList? Spelling=identifier
  ;

argumentsList
  : arguments+;

structureQualificationList
  : structureQualification+
  ;

structureQualification
  : Spelling=identifier arguments? DOT
  ;

arguments
  : LPAR subscriptCommalist? RPAR
  ;

subscriptCommalist
  : subscript (COMMA subscript)*
  ;

subscript
  : expression
  ;

expression
  : primitiveExpression                                     # ExprPrimitive
  | parenthesizedExpression                                 # ExprParenthesized
  | prefixExpression                                        # ExprPrefixed

  | <assoc=right> 
    Left=expression power Rite=expression       # ExprBinary
  | Left=expression mulDiv Rite=expression      # ExprBinary
  | Left=expression addSub Rite=expression      # ExprBinary
  | Left=expression bitAdjust Rite=expression   # ExprBinary
  | Left=expression concatenate Rite=expression # ExprBinary
  | Left=expression comparison Rite=expression  # ExprBinary
  | Left=expression boolAnd Rite=expression     # ExprBinary
  | Left=expression boolXor Rite=expression     # ExprBinary
  | Left=expression boolOr Rite=expression      # ExprBinary
  | Left=expression logand Rite=expression      # ExprBinary
  | Left=expression logor Rite=expression       # ExprBinary
  ;

primitiveExpression
  : numericLiteral
  | stringLiteral
  | reference
  ;

stringLiteral
  : STRING_LITERAL_1
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

parenthesizedExpression
  : LPAR expression RPAR
  | REDAND expression RPAR
  | REDOR expression RPAR
  | REDXOR expression RPAR
  | REDNAND expression RPAR
  | REDNOR expression RPAR
  | REDXNOR expression RPAR
  ;

prefixExpression
  : prefixOperator expression
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

logand: LOGAND;
logor: LOGOR;
concatenate: CONC;
power: POWER;
bitAdjust
  : (L_ROTATE | R_ROTATE | L_LOG_SHIFT | R_LOG_SHIFT | R_ART_SHIFT)
  ;

addSub
  : (PLUS | MINUS)
  ;

mulDiv
  : (TIMES | DIVIDE | PCNT)
  ;

boolAnd
  : (AND | NAND)
  ;

boolXor
  : (XOR | XNOR)
  ;

boolOr
  : (OR | NOR | NOT)
  ;

comparison
  : GT
  | GTE
  | EQUALS
  | LT
  | LTE
  | NGT
  | NE 
  | NLT
  ;

prefixOperator
  : PLUS
  | MINUS
  | NOT
  ;

structDefinition: structName emptyLines? memberSeparator emptyLines? Members=structMembers emptyLines? END;
 
qualifiedName: identifier (DOT identifier)*;
paramList: LPAR identifier (COMMA identifier)* RPAR;
constArrayList: (LPAR INTEGER (COMMA INTEGER)* RPAR);
//numericConstant: INTEGER;
// struct
//structMemberList: structMember+ ;
structName: Spelling=identifier Bounds=dimensionSuffix?;
structMembers
    :  emptyLines? structMember emptyLines? (memberSeparator emptyLines? structMember emptyLines?)*  memberSeparator? emptyLines?;
enumMembers: emptyLines? enumMember emptyLines? (memberSeparator emptyLines? enumMember emptyLines?)* memberSeparator? emptyLines?;
structMember
    : structField
    | structDefinition;

structField:   (Spelling=identifier emptyLines? Bounds=dimensionSuffix? Type=typename );
structStruct:  structDefinition; 

enumMember: (Name=identifier);
identifier: keyword | IDENTIFIER;
typename 
    : binaryType
    | decimalType
    | stringType 
    | bitstringType 
    ;

binaryType: BIN8 | BIN16 | BIN32 | BIN64 | UBIN8 | UBIN16 | UBIN32 | UBIN64 | ((BIN | UBIN) argumentsList?) ;
decimalType:  ((DEC | UDEC) argumentsList) ;

stringType: STRING argumentsList? ; //'(' INTEGER ')';
bitstringType: BIT argumentsList? ;//'(' INTEGER ')';

// Punctuation rules
memberSeparator : COMMA;

// Utility rules
endOfFile: emptyLines? EOF;


// Allow comment blocks slash/star TEXT star/slash to be nested 
COMMENT: (BCOM (COMMENT | .)*? ECOM) -> skip; //channel(HIDDEN);

fragment BINARY:     [0-1];
fragment OCT:     [0-7];
fragment DECIMAL:     [0-9];
fragment HEX:     [0-9a-fA-F];
fragment BCOM:    ('/*');
fragment ECOM:    ('*/');
fragment FRAC_H:  ('.' [0-9a-fA-F]+);
fragment BASE_H:  (':h' | ':H');
fragment FRAC_D:  ('.' [0-9]+);
fragment BASE_D:  (':d' | ':D');
fragment FRAC_O:  ('.' [0-7]+);
fragment BASE_O:  (':o' | ':O');
fragment FRAC_B:  ('.' [0-1]+);
fragment BASE_B:  (':b' | ':B');

HEXADECIMAL_PATTERN:  ((HEX (' ' HEX)*)+ | (HEX ('_' HEX)*)+) FRAC_H? BASE_H;
OCTAL_PATTERN:        ((OCT (' ' OCT)*)+ | (OCT ('_' OCT)*)+) FRAC_O? BASE_O;
DECIMAL_PATTERN:      (DECIMAL (' ' DECIMAL)*)+ FRAC_D? BASE_D?;
BINARY_PATTERN:       ((BINARY (' ' BINARY)*)+ | (BINARY ('_' BINARY)*)+) FRAC_B? BASE_B;

INTEGER:              ([1-9] [0-9]*);

keyword: BIN16|BIN32|BIN64|BIN8|BIN|BIT|DCL|DEC|ELIF|ELSE|ENUM|FOR|FOREVER|FUNC|IF|PATH|PROC|SCOPE|STRING|STRUCT|THEN|UBIN16|UBIN32|UBIN64|UBIN8|UBIN|UDEC|UNTIL|WHILE ;

// Keyword Tokens

BIN16: 'bin16';
BIN32: 'bin32';
BIN64: 'bin64';
BIN8: 'bin8';
BIN: 'bin';
BIT: 'bit';
DCL: 'dcl' ;
DEC: 'dec';
ELIF: 'elif';
ELSE: 'else';
ENUM: 'enum';
FOR: 'for';
FOREVER: 'forever';
FUNC: 'func' | 'function';
IF: 'if';
PATH: 'path';
PROC: 'proc' | 'procedure';
SCOPE: 'scope';
STRING: 'string';
STRUCT: 'struct';
THEN: 'then';
UBIN16: 'ubin16';
UBIN32: 'ubin32';
UBIN64: 'ubin64';
UBIN8: 'ubin8';
UBIN: 'ubin';
UDEC: 'udec';
UNTIL:  'until';
WHILE: 'while';

COLON:          (':');
CONC:           ('++');   // concatenate character strings or bit strings
LOGAND:         ('&&');     // short-circuit, logical AND
LOGOR:          ('||');     // short-circuit, logical OR
AND:            ('&');
OR:             ('|');
NAND:           ('~&');
NOR:            ('~|');
XOR:          ('^'|'⊕');    // U+2295 excluisve bitwise OR
XNOR:         ('~^'|'~⊕');   // U+2295
NOT:            ('~');
GT:             ('>');
LT:             ('<');
GTE:          ('>='|'≥');
LTE:          ('<='|'≤');
NGT:            ('~>');
NLT:            ('~<');
NE:           ('~='|'≠');
POWER:        ('**' | '🠕');  // U+1F815
STRING_LITERAL_1:     (QUOTE    (.)*? QUOTE);
PLUS:           ('+');
MINUS:          ('-');
TIMES:          ('*');
DIVIDE:       ('/' | '÷'); // U+00F7
PCNT:           ('%');

QUOTE:          ('"');
REDAND:         ('&(');
REDOR:          ('|(');
REDNOR:         ('~|(');
REDXOR:       ('^('|'⊕(');   // U+2295
REDXNOR:      ('~^('|'~⊕('); // U+2295
REDNAND:        ('~&(');
L_LOG_SHIFT:    ('<<');   // logical: left bit lost rite bit becomes zero
R_LOG_SHIFT:    ('>>');   // logical: rite bit lost left bit becomes zero
R_ART_SHIFT:    ('>>>');  // arithmetic: rite bit lost left bit is copy of sign bit
L_ROTATE:     ('<@'|'⧀');  // U+29C0 rotate: left bit rotated out rite bit becomes that rotated left bit
R_ROTATE:     ('@>'|'⧁');  // U+29C1 rotate: rite bit rotated out left bit becomes that rotated rite bit


EQUALS: '=' ;
ASSIGN: '<-';
COMPASSIGN: ('+=' | '-=' | '*=' | '/=');
END: 'end';
DOT: '.';
AT: '@';
SEMICOLON: ';'; 
COMMA: ',';
LPAR: '(';
RPAR: ')';
RARROW: '->';
//NUMBER: [0-9]+ ('.' [0-9]+)?;
IDENTIFIER:  [a-zA-Z_] [a-zA-Z0-9_]*;
NEWLINE: ('\r' '\n'); 
WS: [ \t]+ -> skip;
//COMMENT: '/*' .*? '*/' -> channel(HIDDEN);