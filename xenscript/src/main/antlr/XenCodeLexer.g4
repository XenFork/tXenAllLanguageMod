lexer grammar XenCodeLexer;

channels {
    SPACE_CHANNEL,
    COMMENTS_CHANNEL
}
AT: '@';
VAL: 'val';
VAR: 'var';
FOR: 'for';
WHILE: 'while';
BOOL: 'true' | 'false' | 'True' | 'False';
SUBLEVEL: ',';
LA: '<=' | '!+';
RA: '>=' | '!-';//R assign
LAMBDA: '=>';// lambda
L: '<';
NOT: '!';
WHAT: '?';
THAN: ':';
D_THAN: '::';


R: '>';
FAND: '&';
AND: '&&';
OR: '||';
LS: '(';
RS: ')';
LM: '[';
RM: ']';
LB: '{';
RB: '}';
ASSIGN: '=';
EQUALS: '==';
SPLIT: '.';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
URI_HEAD: '://';

INVOKE: '<-'; // method invoker
OUT: '->'; // output method some vararg to val or var
VERSION_SELECT: (NUMBER | PRECISION) ((SPLIT NUMBER)+ | );
NUMBER: [0-9]+; //all number
PRECISION:NUMBER '.' NUMBER;// all float or double
NAMED: [a-zA-Z_]+ ([0-9a-zA-Z_$]+ | );//var val name
URL_NAMED: ([a-zA-Z_-]+ | ADD)+;
END: ';';// the end
IL: '#';// import and loader
EXTEND: '##';//extend subclass

STRING: '"' (~["\\\r\n] | EscapeSequence)* '"';// string using java
fragment EscapeSequence
    : '\\' 'u005c'? [btnfr"'\\]
    | '\\' 'u005c'? ([0-3]? [0-7])? [0-7]
    | '\\' 'u'+ HexDigit HexDigit HexDigit HexDigit
    ;

fragment HexDigit
    : [0-9a-fA-F]
    ;

WHITE_SPACE: [ \t\r\n]+ -> channel(SPACE_CHANNEL);
BLOCK_COMMENT: '/*' .*? '*/' -> channel(COMMENTS_CHANNEL);
LINE_COMMENT: '//' ~[\r\n]* -> channel(COMMENTS_CHANNEL);