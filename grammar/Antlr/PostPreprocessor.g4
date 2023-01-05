
grammar PostPreprocessor;

translation_unit
    : include_statement;

include_statement
    :   '%' 'include' QUOTE     