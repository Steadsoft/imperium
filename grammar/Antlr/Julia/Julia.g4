grammar Julia;

// Parser rules

stmts: ((scope | path | struct) ending | ending)* fileEnd;

scope:  
   whitespace? scope_keyword whitespace? identifier whitespace?  
   ;

path:  
   whitespace? path_keyword whitespace? identifier (whitespace? DOT whitespace? identifier)* whitespace?  
   ;

struct:
    whitespace? struct_keyword whitespace? identifier comma struct_member_list whitespace? end 
    ;

fileEnd:
   whitespace? EOF
   ;

ending
    : (SEMICOLON | NEWLINE)+ 
    ;

comma
    : COMMA
    ;
struct_member_list: 
    struct_member+
    ;

struct_member:    
    whitespace? identifier whitespace? typename comma
    ;

whitespace:
    NEWLINE+
    ;

identifier:
    SCOPE | PATH | IDENTIFIER
    ;

typename:
    BYTE | WORD | DWORD | QWORD | TEXT
    ;

end:
    END
    ;

struct_keyword: 
    STRUCT
    ;
scope_keyword:
    SCOPE 
    ;

path_keyword:
    PATH 
    ;

//expr: term (('+' | '-') term)*;
//term: factor (('*' | '/') factor)*;
//factor: NUMBER | '(' expr ')' | ('-' | '+') factor;

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
SEMICOLON: ';'; //-> channel(HIDDEN);
COMMA: ',';
NUMBER: [0-9]+ ('.' [0-9]+)?;
IDENTIFIER: [a-z]+;
NEWLINE: ('\r' '\n'); //-> channel(HIDDEN);
WS: [ \t]+ -> skip;