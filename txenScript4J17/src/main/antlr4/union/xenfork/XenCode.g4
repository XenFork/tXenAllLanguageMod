grammar XenCode;

LINE_COMMENT : '//' .*? '\n' -> skip;
COMMENT : '/*' .*? '*/' -> skip;

all: all method | all field | method | field;


//regin start
//重写
allField: allField tmp | tmp ;
tmp: str | int | float;
str: 'string' NAME ('=' STRING | )';';
int: 'int' NAME ('=' INT | )';' ;
float: 'float' NAME ('=' FLOAT | )';';
double: 'double' NAME ('=' DOUBLE | )';';

strs: ( ('val' NAME | 'var' NAME ) 'as' 'strings'  | 'strings' NAME) '=' '{' (((STRING ',' )+ | )STRING | ) '}' ';' | | 'strings' NAME';';
//int: ('int' | 'var' | 'val') NAME '=' INT';' | 'int' NAME';';
ints: ( ('val' NAME | 'var' NAME ) 'as' 'ints'  | 'ints' NAME) '=' '{' (((INT ',' )+ | )INT | ) '}' ';' | 'ints' NAME';';
//float: ('float' | 'var' | 'val') NAME '=' FLOAT';' | 'float' NAME';';
floats: ( ('val' NAME | 'var' NAME ) 'as' 'floats'  | 'floats' NAME) '=' '{' (((FLOAT ',' ) + | )FLOAT | ) '}' ';' | 'floats' NAME';';
//double: ('double' | 'val' | 'var') NAME '=' DOUBLE';' | 'double' NAME ';';
doubles: ( ('val' NAME | 'var' NAME ) 'as' 'doubles'  | 'doubles' NAME) '=' '{' (((DOUBLE ',' )+ | )DOUBLE | ) '}' ';' | 'doubles' NAME';';
long: ('long' | 'var' | 'val') NAME '=' LONG';' | 'long' NAME';';
longs: ( ('val' NAME | 'var' NAME ) 'as' 'longs'  | 'longs' NAME) '=' '{' (((LONG ',' )+ | )LONG | ) '}' ';' | 'longs' NAME';';
boolean: ('boolean' | 'var' | 'val') NAME '=' BOOL';' | 'boolean' BOOL';';
booleans: ( ('val' NAME | 'var' NAME ) 'as' 'booleans'  | 'longs' NAME) '=' '{' (((BOOL ',' )+ | )BOOL | ) '}' ';' | 'booleans' NAME';';
object: ('var' | 'val' | 'object') NAME ';' | 'object' NAME '=' OBJECT';';
//regin stop

//field
field: field f | f;
f : fSTR | fINT | fFLOAT | fDOUBLE | fBOOLEAN | fVAL | fVAR | fLONG | fIMPORT;
fIMPORT: '#' INT';' | '#' NAME';' | '#' NAME '>' NAME';';

fSTR : 'string' NAME '=' STRING';' | 'string' NAME';';
fINT : 'int' NAME '=' INT';' | 'int' NAME';';
fFLOAT: 'float' NAME '=' FLOAT';' | 'float' NAME';';
fLONG: 'long' NAME '=' LONG ';' | 'long' NAME ';' ;
fDOUBLE: 'double' NAME '=' DOUBLE';' | 'double' NAME';';
fBOOLEAN: 'bool' NAME '=' BOOL';' | 'bool' NAME';';
fVAR : 'var' NAME '='
    (
        STRING |
        INT |
        FLOAT |
        DOUBLE |
        BOOL
    )';'
    | 'var' NAME';'
    | 'object' NAME '='
    (
        STRING |
        INT |
        FLOAT |
        DOUBLE |
        BOOL
    )';'
    | 'object' NAME';'
    | 'var' NAME 'as' 'strings' '=' '{' (STRING ',' )+STRING '}' ';'
    | 'var' NAME 'as' 'ints' '=' '{' (INT ',' )+ INT '}' ';'
    ;//object放在var行列
fVAL : 'val' NAME '=' (
        STRING |
        INT |
        FLOAT |
        DOUBLE |
        BOOL
    )';'
    | 'val' NAME';'
    | 'val' NAME 'as' 'strings' '=' '{' (STRING ',' )+STRING '}' ';'
    | 'val' NAME 'as' 'ints' '=' '{' (INT ',' )+ INT '}' ';';
OBJECT: ;
method: method m | m;
m: mWhile | mFor | mPrint;
mWhile: 'while' NAME WHILE_BOOL INT '{' all '}' ;
WHILE_BOOL: '<=' | '>=' | '>' | '<' | '==';
mFor: 'for' INT '<<' INT '{' all '}' ;
mPrint: 'print'
    ('<<' NAME)+ ';'
    | 'print' '<<' (
    NAME',' |
    (
        STRING
        |INT
        |FLOAT
        |DOUBLE
        |BOOL) ','
    )+
    (NAME |
    (
        STRING
        |INT
        |FLOAT
        |DOUBLE
        |BOOL
    ))';';
INT : [0-9]+ ;
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




