grammar striterals;

statements:      (string_literal | WHITESPACE) + ;
string_literal:  diquote_literal WHITESPACE* SEMIC | monoquote_literal WHITESPACE* SEMIC;

diquote_literal:   DIQUOTE   (STRING_CHARS | WHITESPACE | MONOQUOTE)* DIQUOTE;
monoquote_literal: MONOQUOTE (STRING_CHARS | WHITESPACE)* MONOQUOTE;

WHITESPACE:		[\r\n ];
DIQUOTE: 		'""';
MONOQUOTE: 		'"';
STRING_CHARS:	[a-zA-Z0-9] ;
SEMIC: ';';