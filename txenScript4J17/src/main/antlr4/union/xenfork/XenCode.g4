grammar XenCode;

LINE_COMMENT : '//' .*? '\n' -> skip;
COMMENT : '/*' .*? '*/' -> skip;

all: all allMethod | all allField | allMethod | allField;


//regin start
//重写
allField: allField tmp | tmp ;
tmp:
imports |
str | int | float | double | long | boolean
| strings | ints | floats | doubles | longs | booleans
| val | var | add | addAll;
str: 'string' NAME ('=' STRING | )';';
int: 'int' NAME ('=' INT | )';' ;
float: 'float' NAME ('=' FLOAT | )';';
double: 'double' NAME ('=' DOUBLE | )';';
long:  'long' NAME ('=' LONG | )';';
boolean: 'bool' NAME ('=' BOOL | )';' | 'boolean' NAME ('=' BOOL | )';' ;
strings: 'strings' NAME ('=' '{' ((STRING ',')+STRING | STRING | ) '}' | )';' ;
ints: 'ints' NAME ('=' '{' ((INT ',')+INT | INT | ) '}' | )';' ;
floats: 'floats' NAME ('=' '{' ((FLOAT ',')+FLOAT | FLOAT | ) '}' | )';' ;
doubles: 'doubles' NAME ('=' '{' ((DOUBLE ',')+DOUBLE | DOUBLE | ) '}' | )';' ;
longs: 'longs' NAME ('=' '{' ((LONG ',')+LONG | LONG | ) '}' | )';' ;
booleans: 'booleans' NAME ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )';' | 'bools' NAME ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )';' ;
val: 'val' NAME
('=' (INT | STRING | FLOAT | DOUBLE | LONG | BOOL)
| 'as'
('strings' ('=' '{' ((STRING ',')+STRING | STRING | ) '}' | )
| 'ints' ('=' '{' ((INT ',')+INT | INT | ) '}' | )
| 'floats' ('=' '{' ((FLOAT ',')+FLOAT | FLOAT | ) '}' | )
| 'doubles' ('=' '{' ((DOUBLE ',')+DOUBLE | DOUBLE | ) '}' | )
| 'longs' ('=' '{' ((LONG ',')+LONG | LONG | ) '}' | )
| 'booleans' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )
| 'bools' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | ) ) )';';

var: 'var' NAME
('=' (INT | STRING | FLOAT | DOUBLE | LONG | BOOL)
| 'as'
('strings' ('=' '{' ((STRING ',')+STRING | STRING | ) '}' | )
| 'ints' ('=' '{' ((INT ',')+INT | INT | ) '}' | )
| 'floats' ('=' '{' ((FLOAT ',')+FLOAT | FLOAT | ) '}' | )
| 'doubles' ('=' '{' ((DOUBLE ',')+DOUBLE | DOUBLE | ) '}' | )
| 'longs' ('=' '{' ((LONG ',')+LONG | LONG | ) '}' | )
| 'booleans' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )
| 'bools' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | ) ) )';';
imports: '#' (INT | NAME ('>' NAME | )) ';';
add: NAME'.''add''(' (STRING | INT | FLOAT | DOUBLE | LONG | BOOL) ')'';' ;
addAll: NAME'.''addAll''(' (NAME | (STRING',')+STRING | (INT',')+INT | (FLOAT',')+FLOAT | (DOUBLE',')+DOUBLE | (LONG',')+LONG | (BOOL',')+BOOL) ')'';' ;
//regin stop
//regin start
allMethod: allMethod m | m ;
m: while | for | print;
while: 'while' NAME WHILE_BOOL INT '{' all '}' ;
for: 'for' INT '<<' INT '{' all '}' ;
print:  'print'('<<' NAME)+ ';'| 'print' '<<' (NAME',' |(STRING|INT|FLOAT|DOUBLE|BOOL) ',')+(NAME |(STRING|INT|FLOAT|DOUBLE|BOOL))';';
//regin stop
INT : [0-9]+ ;
WHILE_BOOL: '<=' | '>=' | '>' | '<' | '==' | '<>' | '!=';
FLOAT: INT'.'INT('f' | 'F');
LONG: INT('l' |'L') ;
DOUBLE: INT'.'INT;
BOOL: 'true' | 'false';
NAME: [a-zA-Z]+ | [a-zA-Z]+INT;
SECONDNAME: [a-z]+ ;
STRING: '"' .*? '"';
WS  : [ \t\r\n]+ -> skip;

/*
    string a = "a";
    int b = 1;
    float c = 1.0f;
    double d = 1.00003;
    var e = "a";
    val f = 1;
*/

r   : 'hello' NAME';';




