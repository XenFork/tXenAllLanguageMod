grammar XenCode4J17;//重写

@header {

package union.xenfork.news;
/**
 * @author baka4n
 */
}

options {
    language = Java;
}

//跳过注释
LINE_COMMENT : '//' .*? '\n' -> skip;
COMMENT : '/*' .*? '*/' -> skip;
WS  : [ \t\r\n]+ -> skip;
END: ';';
all: union+;//所有读取方式
union: xenfork ;
xenfork: jh | method | field ;//field
jh: ('import' | '#') ((iv ',') | iv)+ END ;
iv: FILEDA | iiv;
iiv: FILEDA iiiv;
iiiv: '<<' NAME;
ifv: evaluation=EVALUATION ( field__=FILEDA | move | name_=NAME | int_=INT | double_=DOUBLE | float_=FLOAT | string_=STRING | b | boolean_=BOOL | ) | ;
field:
    varName=NAME ifv END;
EVALUATION: '=';
MOVE: '<-' | '->';
move: pre=INT  mid=MOVE sub=INT ;//<< and >>
JUDGE: '==' | '>=' | '<=' | '!=' | '<>' | '<' | '>'/*equals*/;

method: '{' '}';
INT: [0-9]+;
FLOAT: INT '.' INT ('f' | 'F') ;
DOUBLE: INT'.' INT;
LONG: INT('L' | 'l');
b: pre=(STRING | NAME | INT | DOUBLE | FLOAT | LONG | BOOL)
   mid=JUDGE
   sub=(STRING | NAME | INT | DOUBLE | FLOAT | LONG | BOOL)
;
BOOL:
'true' |
'false' ;
NAME: [\u4e00-\u9fa5a-zA-Z0-9]+;
FILEDA: (NAME'.')+NAME;
STRING: '"' .*? '"';
