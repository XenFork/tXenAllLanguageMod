grammar XenCode;

options {
    language=Java;
}

LINE_COMMENT : '//' .*? '\n' -> skip;
COMMENT : '/*' .*? '*/' -> skip;

all: (str_ | int_ | float_ | double_ | long_ | boolean_ | tmp | m)+;
str_: str | strings;
int_: int | ints;
float_: float | floats;
double_: double | doubles;
long_: long | longs ;
boolean_: boolean | booleans;

//重写
tmp:
imports
| val | var | add | addAll;
str: 'string' NAME ('=' STRING | )';' | 'val' NAME '=' STRING';' | 'var' NAME '=' STRING';';
int: 'int' NAME ('=' INT | )';' | 'val' NAME '=' INT';' | 'var' NAME '=' INT';';
float: 'float' NAME ('=' FLOAT | )';' | 'val' NAME ('=' FLOAT | )';' | 'var' NAME ('=' FLOAT | )';';
double: 'double' NAME ('=' DOUBLE | )';' | 'val' NAME '=' DOUBLE ';' | 'var' NAME '=' DOUBLE ';';
long:  'long' NAME ('=' LONG | )';' | 'val' NAME '=' LONG';' | 'var' NAME '=' LONG';';
boolean: 'bool' NAME ('=' BOOL | )';' | 'boolean' NAME ('=' BOOL | )';' | 'val' NAME '=' BOOL';' | 'var' NAME '=' BOOL';' ;
strings: 'strings' NAME ('=' '{' ((STRING ',')+STRING | STRING | ) '}' | )';' | 'val' NAME 'as' 'strings' ('=' '{' ((STRING ',')+STRING | STRING | ) '}' | ) ';' | 'var' NAME 'as' 'strings' '=' '{' ((STRING ',')+STRING | STRING | ) '}' ';' ;
ints: 'ints' NAME ('=' '{' ((INT ',')+INT | INT | ) '}' | )';' | 'val' NAME 'as' 'ints' ('=' '{' ((INT ',')+INT | INT | ) '}' | )';' | 'var' NAME 'as' 'ints' ('=' '{' ((INT ',')+INT | INT | ) '}' | )';';
floats: 'floats' NAME ('=' '{' ((FLOAT ',')+FLOAT | FLOAT | ) '}' | )';' | 'val' NAME 'as' 'floats' ('=' '{' ((FLOAT ',')+FLOAT | FLOAT | ) '}' | )';' | 'var' NAME 'as' 'floats' ('=' '{' ((FLOAT ',')+FLOAT | FLOAT | ) '}' | )';';
doubles: 'doubles' NAME ('=' '{' ((DOUBLE ',')+DOUBLE | DOUBLE | ) '}' | )';' | 'val' NAME 'as' 'doubles' ('=' '{' ((DOUBLE ',')+DOUBLE | DOUBLE | ) '}' | )';' | 'var' NAME 'as' 'doubles' ('=' '{' ((DOUBLE ',')+DOUBLE | DOUBLE | ) '}' | )';';
longs: 'longs' NAME ('=' '{' ((LONG ',')+LONG | LONG | ) '}' | )';' | 'val' NAME 'as' 'longs' ('=' '{' ((LONG ',')+LONG | LONG | ) '}' | )';' | 'var' NAME 'as' 'longs' ('=' '{' ((LONG ',')+LONG | LONG | ) '}' | )';' ;
booleans: 'booleans' NAME ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )';' | 'bools' NAME ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )';' ;
val: 'val' NAME
( 'as'
( 'booleans' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )
| 'bools' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | ) ) )';';
var: 'var' NAME
('as'
( 'booleans' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )
| 'bools' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | ) ) )';';
imports: '#' (INT | NAME ('>' NAME | )) ';';
add: NAME'.''add''(' (STRING | INT | FLOAT | DOUBLE | LONG | BOOL) ')'';' ;
addAll: NAME'.''addAll''(' (NAME | (STRING',')+STRING | (INT',')+INT | (FLOAT',')+FLOAT | (DOUBLE',')+DOUBLE | (LONG',')+LONG | (BOOL',')+BOOL) ')'';' ;
//regin stop
//regin start
m: while | for | foreach | print;
while: 'while' NAME WHILE_BOOL INT '{' (all | ) '}' ;
for: 'for' NAME INT '<<' INT '{' (all | ) '}' ;
foreach: 'foreach' NAME '<<' NAME '{' (all | ) '}' ;
print:  'print'('<<' NAME)+ ';'| 'print' '<<' (NAME',' |(STRING|INT|FLOAT|DOUBLE|BOOL) ',')+(NAME |(STRING|INT|FLOAT|DOUBLE|BOOL))';';
//regin stop
priority: '#' INT';' ;
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




