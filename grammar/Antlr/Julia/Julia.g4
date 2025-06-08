grammar Julia;

// Parser rules

source: ((statement_separator? (statement)* ) end_of_file) | end_of_file;
statement:  ((scope_statement | path_statement | struct_statement | if_statement) statement_separator) ;
scope_statement:  scope_keyword newlines? identifier;
path_statement: path_keyword newlines? identifier (newlines? DOT newlines? identifier)*;
struct_statement: struct_keyword newlines? identifier newlines? member_separator struct_member_list newlines? end;

if_statement: if_keyword newlines? expression newlines? then_keyword newlines? (statement)* end;

// Scope


// struct
struct_member_list: struct_member+ ;
struct_member:  newlines? identifier newlines? typename member_separator;

identifier: SCOPE | PATH | IDENTIFIER;
typename: BYTE | WORD | DWORD | QWORD | TEXT;
end: END;

path_keyword: PATH ;

// Expresions

expression: identifier '=' identifier;

// Keywords
struct_keyword: STRUCT;
scope_keyword: SCOPE;
if_keyword: IF;
then_keyword: THEN;

// Punctuation rules
statement_separator : (SEMICOLON | NEWLINE)+ | EOF;
member_separator : NEWLINE* COMMA NEWLINE*;

// Utility rules
end_of_file: newlines? EOF;
newlines: NEWLINE+;

// Lexer rules
SCOPE: 'scope';
PATH: 'path';
STRUCT: 'struct';
IF: 'if';
THEN: 'then';
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
IDENTIFIER: [_a-z]+;
NEWLINE: ('\r' '\n'); 
WS: [ \t]+ -> skip;