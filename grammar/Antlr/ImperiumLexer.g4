lexer grammar ImperiumLexer;

@lexer::members
{
    // This code MUST compile for both Java and C#
    // Some constructs here require support code be
    // defined as C# partial and extension classes.

    private String KeywordLexiconCode = "en";

    public Boolean Lexicon(String Code)
    {
        return Code == KeywordLexiconCode;
    }

    public void SetLexicon(String Code)
    {
        KeywordLexiconCode = Code;
    }

    public void ReverseLexeme()
    {
        StringBuilder builder = new StringBuilder();
        builder.append(getText());
        builder.reverse();
        setText(builder.toString());
    }
}

INTRINSIC_ENTER: PROCEDURE SP* IPL_IDENTIFIER SP* (LPAR IPL_IDENTIFIER (COMMA IPL_IDENTIFIER)* RPAR)? SP* INTRINSIC LPAR IPL_IDENTIFIER RPAR SP* SEMICOLON -> pushMode(ACCEPT_ASSEMBLER);

ACCEPT: 
           {Lexicon("en")}? ('accept')      ;
ALIAS: 
           {Lexicon("en")}? ('alias')       ;
ALIGNED: 
           {Lexicon("en")}? ('aligned')     ;
ALL: 
           {Lexicon("en")}? ('all')         ;
ANY: 
           {Lexicon("en")}? ('any')         ;
ARGUMENT: 
           {Lexicon("en")}? ('argument'     | 'arg') ;
AS: 
           {Lexicon("en")}? ('as')          ;
ASSEMBLER: 
           {Lexicon("en")}? ('assembler'    | 'asm') ;
BASED: 
           {Lexicon("en")}? ('based')       ;
BINARY: 
           {Lexicon("en")}? ('binary'       | 'bin') ;
BIT: 
           {Lexicon("en")}? ('bit')         ;
BOOLEAN: 
           {Lexicon("en")}? ('boolean'      | 'bool') ;
BOOTSTRAP: 
           {Lexicon("en")}? ('bootstrap'    | 'boot') ;
BUILTIN: 
           {Lexicon("en")}? ('builtin')     ;
BY: 
           {Lexicon("en")}? ('by')          ;
BYPASS: 
           {Lexicon("en")}? ('bypass')      ;
CALL: 
           {Lexicon("en")}? ('call')        ;
CHARACTER: 
           {Lexicon("en")}? ('character'    | 'char') ;
COFUNCTION: 
           {Lexicon("en")}? ('cofunction')  ;
COLD: 
           {Lexicon("en")}? ('cold')        ;
COROUTINE: 
           {Lexicon("en")}? ('coroutine')   ;
DECIMAL: 
           {Lexicon("en")}? ('decimal'      | 'dec') ;
DECLARE: 
           {Lexicon("en")}? ('declare'      | 'dcl') ;
DEFINE: 
           {Lexicon("en")}? ('define'       | 'def') ;
DEFINED: 
           {Lexicon("en")}? ('defined')     ;
ELIF: 
           {Lexicon("en")}? ('elif')        ;
ELSE: 
           {Lexicon("en")}? ('else')        ;
END: 
           {Lexicon("en")}? ('end')         ;
ENDLOOP: 
           {Lexicon("en")}? ('endloop')     ;
ENTRY: 
           {Lexicon("en")}? ('entry')       ;
ENUM: 
           {Lexicon("en")}? ('enum')        ;
FIXED: 
           {Lexicon("en")}? ('fixed')       ;
FLOAT: 
           {Lexicon("en")}? ('float')       ;
FUNCTION: 
           {Lexicon("en")}? ('function'     | 'func') ;
GOTO: 
           {Lexicon("en")}? ('goto'         | 'go to') ;
IF: 
           {Lexicon("en")}? ('if')          ;
INC: 
           {Lexicon("en")}? ('inc')         ;
INCLUDE: 
           {Lexicon("en")}? ('include')     ;
INTERNAL: 
           {Lexicon("en")}? ('internal')    ;
INTERRUPT: 
           {Lexicon("en")}? ('interrupt'    | 'isr') ;
INTRINSIC: 
           {Lexicon("en")}? ('intrinsic')   ;
LANGUAGE: 
           {Lexicon("en")}? ('lingua')      ;
LOOP: 
           {Lexicon("en")}? ('loop')        ;
MAIN: 
           {Lexicon("en")}? ('main')        ;
NAKED: 
           {Lexicon("en")}? ('naked')       ;
NORETURN: 
           {Lexicon("en")}? ('noreturn')    ;
OFFSET: 
           {Lexicon("en")}? ('offset'       | 'ofx') ;
OTHERWISE: 
           {Lexicon("en")}? ('otherwise')   ;
OUT: 
           {Lexicon("en")}? ('out')         ;
PAD: 
           {Lexicon("en")}? ('pad')         ;
POINTER: 
           {Lexicon("en")}? ('pointer'      | 'ptr') ;
PRIVATE: 
           {Lexicon("en")}? ('private')     ;
PROCEDURE: 
           {Lexicon("en")}? ('procedure'    | 'proc') ;
PUBLIC: 
           {Lexicon("en")}? ('public')      ;
RAW: 
           {Lexicon("en")}? ('raw')         ;
READONLY: 
           {Lexicon("en")}? ('readonly')    ;
RECURSIVE: 
           {Lexicon("en")}? ('recursive'    | 'rec') ;
REF: 
           {Lexicon("en")}? ('ref')         ;
RELOOP: 
           {Lexicon("en")}? ('reloop')      ;
RETAIN: 
           {Lexicon("en")}? ('retain')      ;
RETURN: 
           {Lexicon("en")}? ('return')      ;
RETURNON: 
           {Lexicon("en")}? ('returnon')    ;
RETURNS: 
           {Lexicon("en")}? ('returns')     ;
SCANAS: 
           {Lexicon("en")}? ('scanas')      ;
SCOPE: 
           {Lexicon("en")}? ('scope')       ;
SECTION: 
           {Lexicon("en")}? ('section')     ;
SELECT: 
           {Lexicon("en")}? ('select')      ;
SINGLET: 
           {Lexicon("en")}? ('singlet')     ;
STACK: 
           {Lexicon("en")}? ('stack')       ;
STATIC: 
           {Lexicon("en")}? ('static')      ;
STRING: 
           {Lexicon("en")}? ('string')      ;
STRUCTURE: 
           {Lexicon("en")}? ('structure'    | 'struct') ;
THEN: 
           {Lexicon("en")}? ('then')        ;
TO: 
           {Lexicon("en")}? ('to')          ;
TRAITS: 
           {Lexicon("en")}? ('traits')      ;
TYPE: 
           {Lexicon("en")}? ('type')        ;
UNALIGNED: 
           {Lexicon("en")}? ('unaligned')   ;
UNTIL: 
           {Lexicon("en")}? ('until')       ;
USES: 
           {Lexicon("en")}? ('uses')        ;
USING: 
           {Lexicon("en")}? ('using')       ;
UTF: 
           {Lexicon("en")}? ('utf')         ;
VARIABLE: 
           {Lexicon("en")}? ('variable')    ;
VARYING: 
           {Lexicon("en")}? ('varying')     ;
WHEN: 
           {Lexicon("en")}? ('when')        ;
WHILE: 
           {Lexicon("en")}? ('while')       ;
YIELD: 
           {Lexicon("en")}? ('yield')       ;

/* End of generated Antlr4 keyword token definitions. */



// LEXER TOKEN DEFINITIONS

COMMENT:              (BCOM (COMMENT | .)*? ECOM) -> channel(2);
LINE_COMMENT:         (LCOM .*? LF) -> channel(HIDDEN);
WS:                   (' ')+ -> skip;
NEWLINE:              [\r\n]+ -> skip;
TAB:                  ('\t')+ -> skip;
STRING_LITERAL_3:     (TRIQUOTE (.)*? TRIQUOTE);
STRING_LITERAL_2:     (DIQUOTE  (.)*? DIQUOTE);
STRING_LITERAL_1:     (QUOTE    (.)*? QUOTE);
BYTE_ORDER_MARK:      ('\uFEFF'); // This is the unicode char seen when reading the file, the three bytes themselves are an encoding and not see by the
LABEL:                (AT IPL_IDENTIFIER);
BINARY_PATTERN:       ((BIN (' ' BIN)*)+ | (BIN ('_' BIN)*)+) FRAC_B? BASE_B;
OCTAL_PATTERN:        ((OCT (' ' OCT)*)+ | (OCT ('_' OCT)*)+) FRAC_O? BASE_O;
HEXADECIMAL_PATTERN:  ((HEX (' ' HEX)*)+ | (HEX ('_' HEX)*)+) FRAC_H? BASE_H;
INTEGER:              ([1-9] [0-9]*);
DECIMAL_PATTERN:      (DEC (' ' DEC)*)+ FRAC_D? BASE_D?;

// SYMBOLS AND OPERATORS
IPL_IDENTIFIER:   IDENTIFIER;
// There are some symbols that have a very natural Unicode character that better conveys their
// meanings. These are included below, the grammar will accept either the Unicode or the ASCII
// forms. These are recognized by being name ending in _U

HASH:           ('#');
AT:             ('@');
RARROW_U:       ('->'|'➔'); // U+2794
MAPSTO_U:       ('-->'|'↦'); // U+21A6
DOT:            ('.');
COMMA:          (',');
LPAR:           ('(');
RPAR:           (')');
LBRACK:         ('[');
RBRACK:         (']');
LBRACE:         ('{');
RBRACE:         ('}');
EQUALS:         ('=');
ASSIGN_U:       ('⇐'); // U+21D0
TIMES:          ('*');
DIVIDE_U:       ('/' | '÷'); // U+00F7
PLUS:           ('+');
MINUS:          ('-');
SEMICOLON:      (';');
POWER_U:        ('**' | '🠕');  // U+1F815
COLON:          (':');
TRIQUOTE:       ('"""');
DIQUOTE:        ('""');
QUOTE:          ('"');
SQUOTE:         ('\'');
NOT:            ('~');
GT:             ('>');
LT:             ('<');
GTE_U:          ('>='|'≥');
LTE_U:          ('<='|'≤');
NGT:            ('~>');
NLT:            ('~<');
NE_U:           ('~='|'≠');
PCNT:           ('%');
AND:            ('&');
OR:             ('|');
NAND:           ('~&');
NOR:            ('~|');
XOR_U:          ('^'|'⊕');    // U+2295 excluisve bitwise OR
XNOR_U:         ('~^'|'~⊕');   // U+2295
REDAND:         ('&(');
REDOR:          ('|(');
REDNAND:        ('~&(');
REDNOR:         ('~|(');
REDXOR_U:       ('^('|'⊕(');   // U+2295
REDXNOR_U:      ('~^('|'~⊕('); // U+2295
LOGAND:         ('&&');     // short-circuit, logical AND
LOGOR:          ('||');     // short-circuit, logical OR
CONC:           ('++');   // concatenate character strings or bit strings
L_LOG_SHIFT:    ('<<');   // logical: left bit lost rite bit becomes zero
R_LOG_SHIFT:    ('>>');   // logical: rite bit lost left bit becomes zero
R_ART_SHIFT:    ('>>>');  // arithmetic: rite bit lost left bit is copy of sign bit
L_ROTATE_U:     ('<@'|'⧀');  // U+29C0 rotate: left bit rotated out rite bit becomes that rotated left bit
R_ROTATE_U:     ('@>'|'⧁');  // U+29C1 rotate: rite bit rotated out left bit becomes that rotated rite bit
RANGE:          ('..');   // used to represent a range from some start to some end

//SYMBOLS:        (UNICODE_MATH_OPS | UNICODE_MISC_TECH | UNICODE_MISC_MATH) (UNICODE_MATH_OPS | UNICODE_MISC_TECH | UNICODE_MISC_MATH)*; // do not overlap with identifiers

// LEXER FRAGMENTS

fragment IDENTIFIER:           (IDENTIFIER_START IDENTIFIER_REST*);
fragment BIN:     [0-1];
fragment OCT:     [0-7];
fragment DEC:     [0-9];
fragment HEX:     [0-9a-fA-F];
fragment BASE_B:  (':b' | ':B');
fragment BASE_O:  (':o' | ':O');
fragment BASE_D:  (':d' | ':D');
fragment BASE_H:  (':h' | ':H');
fragment FRAC_B:  ('.' [0-1]+);
fragment FRAC_D:  ('.' [0-9]+);
fragment FRAC_O:  ('.' [0-7]+);
fragment FRAC_H:  ('.' [0-9a-fA-F]+);
fragment BCOM:    ('/*');
fragment ECOM:    ('*/');
fragment LCOM:    ('//');
fragment LF:      ('\n');
// When testing and using Antlr to gen test inputs, we restrict
// identifiers for ease of readability.

//fragment IDENTIFIER_START: [$a-zA-Z_\u0370-\u03ff];
//fragment IDENTIFIER_REST:  [$a-zA-Z_0-9\u0370-\u03ff];
fragment IDENTIFIER_START: [$a-zA-Z_];
fragment IDENTIFIER_REST:  [$a-zA-Z_0-9];

fragment UNICODE_MATH_OPS:  [\u2200-\u22FF]; // Mathematical Operators
fragment UNICODE_MISC_TECH: [\u2300-\u23FF]; // Includes APL
fragment UNICODE_MISC_MATH: [\u27C0-\u27EF]; // Miscellaneous match
fragment SP: (' ');
fragment XP: ('0x'|'0X'|'0h'|'0H');
fragment XS: ('h'|'H');
fragment BP: ('0b'|'0y');
fragment BS: ('b'|'B'|'y'|'Y');
fragment OP: ('0o'|'0q');
fragment OS: ('o'|'q');

// This mode starts when we've encountered a #accept(assembler) token sequence

mode ACCEPT_ASSEMBLER;
ASSEMBLER_END:              (END SP* SEMICOLON)-> popMode;
ASSEMBLER_NEWLINE:          [\r\n]+ ;
ASM_IDENTIFIER:             IDENTIFIER; 
ASSEMBLER_DEC_INTEGER:      '='?'#'?(([0-9] [0-9]*('d')?));
ASSEMBLER_HEX_INTEGER:      '='?'#'?(XP HEX+ | (HEX+XS))  ;
ASSEMBLER_OCT_INTEGER:      '='?'#'?(OP OCT+ | (OCT+OS));
ASSEMBLER_BIN_INTEGER:      '='?'#'?(BP BIN+ | (BIN+BS));
ASSEMBLER_COMMENT:          (BCOM (COMMENT | .)*? ECOM) -> channel(2);
ASSEMBLER_LINE_COMMENT:     ((LCOM | SEMICOLON)(.*?)LF); // -> channel(HIDDEN);
ASSEMBLER_PUNCTUATOR:       (','|'.'|':');
ASSEMBLER_SYMBOL:           ('='|'+'|'#'|'-'|'*'|'/'|'$');
ASSEMBLER_BRACKET:          ('['|']');
ASSEMBLER_PAREN:            ('('|')');
ASM_LBRACE:                 ('{');
ASM_RBRACE:                 ('}');
ASSEMBLER_SPACES:           (' ')+ -> skip;