grammar Julia;

// Parser rules

source: (newlines? statement? (statement_separator statement)* ) fileEnd;
statement:  (scope_statement | path_statement | struct_statement) ;
scope_statement:  scope_keyword newlines? identifier  ;
path_statement: path_keyword newlines? identifier (newlines? DOT newlines? identifier)*    ;
struct_statement: struct_keyword newlines? identifier newlines? member_separator struct_member_list newlines? end    ;
fileEnd: newlines? EOF ;
statement_separator : (SEMICOLON | NEWLINE)+   ;
member_separator : COMMA  ;
struct_member_list: struct_member+ ;
struct_member:  newlines? identifier newlines? typename newlines? member_separator  ;
newlines: NEWLINE+ ;
identifier: SCOPE | PATH | IDENTIFIER ;
typename: BYTE | WORD | DWORD | QWORD | TEXT ;
end: END ;
struct_keyword: STRUCT ;
scope_keyword: SCOPE  ;
path_keyword: PATH ;

// Lexer rules
SCOPE: 'scope';
PATH: 'path';
STRUCT: 'struct';

BYTE: 'byte';
WORD: 'word';
DWORD: 'dword';
QWORD: 'qword';
TEXT: 'text';

END: 'end';
DOT: '.';
SEMICOLON: ';'; 
COMMA: ',';
NUMBER: [0-9]+ ('.' [0-9]+)?;
IDENTIFIER: [a-z]+;
NEWLINE: ('\r' '\n'); 
WS: [ \t]+ -> skip;