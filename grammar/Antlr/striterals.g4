grammar striterals;
/*
literals: literal*;
literal: quote (text)* quote semc ;

quote: QUOTE;
text:  TEXT;
semc:  SEMC;

TEXT: (CHARS+ | NEWLINE+ | TWOQT+);

QUOTE: '"' ;
fragment CHARS:  ([a-z0-9 ])+;
TWOQT: ('""' | '\\"') {setText("\"");};
fragment NEWLINE: (('\r' '\n') | [\r\n])+ ;
SEMC: ';';
*/


statements: (string_literal)+ ;
string_literal:  diquote_literal SEMIC ;//| monoquote_literal SEMIC;

diquote_literal:   DIQUOTE (STRING_CHARS | MONOQUOTE) * DIQUOTE;


//monoquote_literal: MONOQUOTE MONOQUOTE_CHARS* MONOQUOTE;

WHITESPACE:			[\r\n ] -> channel(HIDDEN) ;

// Can contain escape sequences like \r and \n which are recognized, acted upon.
// Literal \ symbols must be escaped as \\ quotes and newlines are not permitted
//STRING: 	QUOTE CHARS* QUOTE ;
DIQUOTE: '""';
MONOQUOTE: '"';




//fragment CHARS: [\u0000-\uFFFE]; 
STRING_CHARS:    [a-zA-Z0-9] ;
//MONOQUOTE_CHARS:  [a-zA-Z0-9] | WHITESPACE;



SEMIC: ';';



