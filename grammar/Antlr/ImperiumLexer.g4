/*
 Named for convenince as a simple term, the grammar is named after Emil Leon Post.
 This grammar is
 based on the PL/I grammar (in particular the grammar defined in ANSI X3.74-1987)
 It has no
 reserved words, any keyword may be used as an identifier without any ambiguit arising.
 It suppors
 multiple keyword languages.
 We can add more keywords over time and never break backward
 compatibility with existing code
 which migt contain identifiers that are the same as these new
 keywords.
 */

/* Multiple languages: https://stackoverflow.com/questions/40325774/antlr4-dynamic-token-type */

lexer grammar ImperiumLexer; // Latin for "control"

COMMENT: '/*' (COMMENT | .)*? '*/' -> channel(2);
LINE_COMMENT: '//' .*? '\n' -> channel(HIDDEN);
WS: (' ')+ -> skip;
NEWLINE: [\r\n]+ -> skip;
TAB: ('\t')+ -> skip;

BYTE_ORDER_MARK: '\u00EF' '\u00BB' '\u00BF';

BASE_B: (':b' | ':B');
BASE_O: (':o' | ':O');
BASE_D: (':d' | ':D');
BASE_H: (':h' | ':H');
FRAC_B: ('.' [0-1]+);
FRAC_D: ('.' [0-9]+);
FRAC_O: ('.' [0-7]+);
FRAC_H: ('.' [0-9a-fA-F]+);

IDENTIFIER: [a-zA-Z_]+;
BINARY_PATTERN: (BIN (LSEP BIN)*)+ FRAC_B? BASE_B;
OCTAL_PATTERN: (OCT (LSEP OCT)*)+ FRAC_O? BASE_O;
HEXADECIMAL_PATTERN: (HEX (LSEP HEX)*)+ FRAC_H? BASE_H;
DECIMAL_PATTERN: (DEC (LSEP DEC)*)+ FRAC_D? BASE_D?;
LSEP: (' ' | '_');

BIN: [0-1];
OCT: [0-7];
DEC: [0-9];
HEX: [0-9a-fA-F];

SHORT_OR: '?|';
OR:    '|';
AND:  '&';
SHORT_AND: '?&';
ARROW: '->';
DOT: '.';
COMMA: ',';
LPAR: '(';
RPAR: ')';
LBRACK: '[';
RBRACK: ']';
LBRACE: '{';
RBRACE: '}';
EQUALS: '=';
TIMES: '*';
DIVIDE: '/';
PLUS: '+';
MINUS: '-';
SEMICOLON: ';';
POWER: '**';
COLON: ':';
DQUOTE: '"';
QUOTE: '\'';
QMARK: '?';
PERCNT: '%';
TILDE: '~';
CONC: '||';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
TGT: '~>';
TEQ: '~=';
TLT: '<~';
GTGT: '>>';
LTLT: '<<';
GTGTGT: '>>>';
LTLTLT: '<<<';
