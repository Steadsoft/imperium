grammar genesis;

// PARSER

source
    : BYTE_ORDER_MARK PREAMBLE? statement* EOF
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
    : IF identifier THEN statement* END
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
PROC:                   ('proc' (SPACE | NEWLINE)*) {setText("PROC");};
DCL:                    ('dcl' (SPACE | NEWLINE)*) {setText("DCL");};
END:                    ('end' (SPACE | NEWLINE)*) {setText("END");};
THEN:                   ('then' (SPACE | NEWLINE)*){setText("THEN");};
IF:                     ('if' (SPACE | NEWLINE)*){setText("IF");};
EQUAL:                  ('=' (SPACE | NEWLINE)*){setText("=");};
LPAR:                   ('(' (SPACE | NEWLINE)*){setText("(");};
RPAR:                   (')' (SPACE | NEWLINE)*){setText(")");};
COMMA:                  (',' (SPACE | NEWLINE)*){setText(",");};
IDENTIFIER:             ((IDENTIFIER_START IDENTIFIER_REST*) (SPACE | NEWLINE)*) {setText(getText().trim());};
CONT:                   ('`' SPACE* NEWLINE) -> skip;
//WHITE:                  (TAB | SPACE) -> skip;
BYTE_ORDER_MARK:        ('\uFEFF');
PREAMBLE: (SPACE | NEWLINE)+ -> skip;

fragment SPACE:                 (' ');
fragment TAB:                   ('\t');
fragment CR:                    ('\r');
fragment LF:                    ('\n');
fragment NEWLINE:               (CR? LF);
fragment SEMICOLON:             (';');
fragment IDENTIFIER_START:      [$a-zA-Z_];
fragment IDENTIFIER_REST:       [$a-zA-Z_0-9];