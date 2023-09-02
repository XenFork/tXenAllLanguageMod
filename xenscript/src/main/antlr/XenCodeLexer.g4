lexer grammar XenCodeLexer;

NUMBER: [0-9]+; //涵盖所有整型数字
PRECISION:NUMBER '.' NUMBER;//涵盖所有精数
NAMED: [0-9a-zA-Z_]+;//变量名，类名等
STRING: '"' (~["\\\r\n] | EscapeSequence)* '"';//字符串
END: ';';
fragment EscapeSequence
    : '\\' 'u005c'? [btnfr"'\\]
    | '\\' 'u005c'? ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;