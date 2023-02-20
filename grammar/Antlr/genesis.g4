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
    : identifier EQUAL identifier
    ;      

if_stmt
    : TERMINATOR* IF identifier THEN statement* END
    ;

dcl_stmt
    : DCL identifier 
    ;

proc_stmt
    : PROC identifier (LPAR IDENTIFIER (COMMA IDENTIFIER)* RPAR)* statement* END  
    ;

identifier
    : (DCL | END | THEN | IF)
    | IDENTIFIER
    ;
// LEXER
PROC:                   ('proc' (SPACE | TERMINATOR)*) {setText("PROC");};
DCL:                    ('dcl' (SPACE | TERMINATOR)*) {setText("DCL");};
END:                    ('end' (SPACE | TERMINATOR)*) {setText("END");};
THEN:                   ('then' (SPACE | TERMINATOR)*){setText("THEN");};
IF:                     ('if' (SPACE | TERMINATOR)*){setText("IF");};
EQUAL:                  ('=' (SPACE | TERMINATOR)*){setText("=");};
LPAR:                  ('(' (SPACE | TERMINATOR)*){setText("(");};
RPAR:                  (')' (SPACE | TERMINATOR)*){setText(")");};
COMMA:                  (',' (SPACE | TERMINATOR)*){setText(",");};
IDENTIFIER:             ((IDENTIFIER_START IDENTIFIER_REST*) (SPACE | TERMINATOR)*) {setText(getText().trim());};
//TERMINATORS:            ((SEMICOLON WHITE*) | (NEWLINE WHITE*))+  {setType(TERMINATOR); /*setText(";");*/};
TERMINATOR:             (NEWLINE);
CONT:                   ('`' SPACE* NEWLINE) -> skip;
//WHITE:                  (TAB | SPACE) -> skip;
BYTE_ORDER_MARK:        ('\uFEFF');

fragment SPACE:                 (' ');
fragment TAB:                   ('\t');
fragment NEWLINE:               ('\r\n');
fragment SEMICOLON:             (';');
fragment IDENTIFIER_START:      [$a-zA-Z_];
fragment IDENTIFIER_REST:       [$a-zA-Z_0-9];