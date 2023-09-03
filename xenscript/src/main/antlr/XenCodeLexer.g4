lexer grammar XenCodeLexer;

channels {
    SPACE_CHANNEL,
    COMMENTS_CHANNEL
}
VAL: 'val';
VAR: 'var';
FOR: 'for';
WHILE: 'while';
BOOL: 'true' | 'false' | 'True' | 'False';
SUBLEVEL: ',';
LA: '<=';
RA: '>=';//R assign
LAMBDA: '=>';// lambda
L: '<';
R: '>';
AND: '&&';
OR: '||';
LB: '{';
RB: '}';
ASSIGN: '=';
EQUALS: '==';
SPLIT: '.';
ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
NOT: '!';

INVOKE: '<-'; // method invoker
OUT: '->'; // output method some vararg to val or var
NUMBER: [0-9]+; //all number
PRECISION:NUMBER '.' NUMBER;// all float or double
NAMED: [a-zA-Z_]+ ([0-9a-zA-Z]+ | );//var val name
END: ';';// the end
IL: '#';// import and loader

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