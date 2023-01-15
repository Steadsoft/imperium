grammar striterals;

statements:      (string_literal | WHITESPACE) + ;
string_literal:  triquote_literal WHITESPACE* SEMIC | diquote_literal WHITESPACE* SEMIC | monoquote_literal WHITESPACE* SEMIC;

//triquote_literal:  TRIQUOTE  (STRING_CHARS | SEMIC | WHITESPACE | MONOQUOTE | DIQUOTE)* TRIQUOTE;
//diquote_literal:   DIQUOTE   (STRING_CHARS | SEMIC | WHITESPACE | MONOQUOTE)* DIQUOTE;
//monoquote_literal: MONOQUOTE (STRING_CHARS | SEMIC | WHITESPACE)* MONOQUOTE;

triquote_literal:  TRIQUOTE  (.)*? TRIQUOTE;
diquote_literal:   DIQUOTE   (.)*? DIQUOTE;
monoquote_literal: MONOQUOTE (.)*? MONOQUOTE;

WHITESPACE:		[\r\n ];
TRIQUOTE:       '"""';
DIQUOTE: 		'""';
MONOQUOTE: 		'"';
SEMIC: ';';
//STRING_CHARS:	. ;  //[a-zA-Z0-9] ;
