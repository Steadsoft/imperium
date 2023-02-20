grammar genesis;

// PARSER

source
    : BYTE_ORDER_MARK statement* EOF
    ;

statement
    : if_stmt
    | assign_stmt
    | dcl_stmt
    | proc_stmt
    ;

assign_stmt
    : reference EQUAL expression
    ;      

if_stmt
    : IF expression THEN statement* (ELSE statement*)? END
    ;

dcl_stmt
    : DCL identifier 
    ;

proc_stmt
    : PROC identifier (LPAR identifier (COMMA identifier)* RPAR)* statement* END  
    ;

reference
    : identifier ((DOT identifier) | (LPAR identifier (COMMA identifier)* RPAR))*
    ;
identifier
    : keyword
    | IDENTIFIER
    ;

expression
    : reference
    | expression (TIMES | DIVIDE) expression
    | expression (PLUS | MINUS) expression
    ;

keyword
    : (DCL | END | THEN | IF | PROC | ELSE)
    ;    
// LEXER
PROC:                   ('proc');
DCL:                    ('dcl') ;
END:                    ('end')  ;
THEN:                   ('then')  ;
ELSE:                   ('else')  ;
IF:                     ('if')  ;
EQUAL:                  ('=')    ;
LPAR:                   ('(')   ;
RPAR:                   (')')  ;
COMMA:                  (',')  ;
DOT:                    ('.');
PLUS:                   ('+');
MINUS:                  ('-');
TIMES:                  ('*');
DIVIDE:                 ('/');

IDENTIFIER:             ((IDENTIFIER_START IDENTIFIER_REST*)) {setText(getText().trim());};
//CONT:                   ('`' SPACE* NEWLINE) -> skip;
//WHITE:                  (TAB | SPACE) -> skip;
BYTE_ORDER_MARK:        ('\uFEFF');
PREAMBLE: [ \t\r\n]+ -> skip; //channel(2);

fragment SPACE:                 (' ');
fragment TAB:                   ('\t');
fragment CR:                    ('\r');
fragment LF:                    ('\n');
//fragment NEWLINE:               (CR LF);
fragment SEMICOLON:             (';');
fragment IDENTIFIER_START:      [$a-zA-Z_];
fragment IDENTIFIER_REST:       [$a-zA-Z_0-9];