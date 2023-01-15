grammar striterals;

statements:      (string_literal ) + ;
string_literal:  triquote_literal SEMIC | diquote_literal SEMIC | monoquote_literal SEMIC;

// Accept any recognized token within these literals
// we don't care that some recognized tokens might be 
// present inside these literals.

triquote_literal:  STRING_LITERAL_3; //TRIQUOTE  (.)*? TRIQUOTE;
diquote_literal:   STRING_LITERAL_2; //DIQUOTE   (.)*? DIQUOTE;
monoquote_literal: STRING_LITERAL_1; //MONOQUOTE (.)*? MONOQUOTE;

STRING_LITERAL_3: TRIQUOTE (.)*? TRIQUOTE;
STRING_LITERAL_2: DIQUOTE  (.)*? DIQUOTE;
STRING_LITERAL_1: MONOQUOTE   (.)*? MONOQUOTE;

WHITESPACE:		[\r\n ]->skip;
TRIQUOTE:       '"""';
DIQUOTE: 		'""';
MONOQUOTE: 		'"';
SEMIC:          ';';
//STRING_CHARS:	. ;  //[a-zA-Z0-9] ;
