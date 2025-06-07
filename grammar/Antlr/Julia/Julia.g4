grammar Julia;

// Parser rules

stmts: ((scope | path | struct) stmtTerminator | e)* fileEnd;

scope:  
   x? SCOPE x? identifier x?  
   ;

path:  
   x? PATH x? identifier (x? DOT x? identifier)* x?  
   ;

struct:
    x? STRUCT x? identifier memberTerminator memberList x? end 
    ;

e:
    stmtTerminator
    ;

fileEnd:
   x? EOF
   ;

stmtTerminator
    : SEMICOLON
    | NEWLINE 
    ;

memberTerminator
    : COMMA
    | NEWLINE 
    ;
memberList: 
    (x? identifier x? typename memberTerminator)+
    ;
x:
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