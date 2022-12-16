grammar XenCode;

options {
    language = Java;
}

@parser::header {
import java.util.*;
import java.lang.*;
}

@parser::members {
    public Map<String, String> stringMap = new HashMap<>();
    public Map<String, Integer> integerMap = new HashMap<>();
    public void put(String key, String value) { stringMap.put(key, value); }
    public void put(String key, Integer value) {integerMap.put(key, value); }
    public String getString(String key) { return stringMap.get(key);}
    public String substring(String str) { return str.substring(str.indexOf("\"") + 1, str.lastIndexOf("\""));}
    public Integer getInt(String a) {
        try {Integer.parseInt(a);return Integer.parseInt(a);} catch (NumberFormatException e) {e.printStackTrace();}
        return null;
    }
}
LINE_COMMENT : '//' .*? '\n' -> skip;
COMMENT : '/*' .*? '*/' -> skip;



all:  sy+;
sy:jh | fieldA | while | for | print | field;//add | addAll |
jh: priority | import_;//对于#号键
field: s | i | f | d | l | b;
s: str | strings;
i: int | ints;
f: float | floats;
d: double | doubles;
l: long | longs ;
b: boolean | booleans;
str: 'string' name=NAME ('=' id=STRING {put($name.text, substring($id.text));} | )';' | 'val' name=NAME '=' id=STRING {put($name.text, substring($id.text));}';' | 'var' name=NAME '=' id=STRING {put($name.text, substring($id.text));}';';
int: 'int' name=NAME ('=' id=INT {put($name.text, getInt($id.text));} | )';' | 'val' name=NAME '=' id=INT {put($name.text, getInt($id.text));}';' | 'var' name=NAME '=' id=INT {put($name.text, getInt($id.text));}';';
float: 'float' NAME ('=' FLOAT | )';' | 'val' NAME ('=' FLOAT | )';' | 'var' NAME ('=' FLOAT | )';';
double: 'double' NAME ('=' DOUBLE | )';' | 'val' NAME '=' DOUBLE ';' | 'var' NAME '=' DOUBLE ';';
long:  'long' NAME ('=' LONG | )';' | 'val' NAME '=' LONG';' | 'var' NAME '=' LONG';';
boolean: 'bool' NAME ('=' BOOL | )';' | 'boolean' NAME ('=' BOOL | )';' | 'val' NAME '=' BOOL';' | 'var' NAME '=' BOOL';' ;
strings: 'strings' name=NAME ('=' '{' ((STRING ',')+ STRING | STRING | ) '}' | )';' | 'val' NAME 'as' 'strings' ('=' '{' ((STRING ',')+STRING | STRING | ) '}' | ) ';' | 'var' NAME 'as' 'strings' '=' '{' ((STRING ',')+STRING | STRING | ) '}' ';' ;
ints: 'ints' NAME ('=' '{' ((INT ',')+INT | INT | ) '}' | )';' | 'val' NAME 'as' 'ints' ('=' '{' ((INT ',')+INT | INT | ) '}' | )';' | 'var' NAME 'as' 'ints' ('=' '{' ((INT ',')+INT | INT | ) '}' | )';';
floats: 'floats' NAME ('=' '{' ((FLOAT ',')+FLOAT | FLOAT | ) '}' | )';' | 'val' NAME 'as' 'floats' ('=' '{' ((FLOAT ',')+FLOAT | FLOAT | ) '}' | )';' | 'var' NAME 'as' 'floats' ('=' '{' ((FLOAT ',')+FLOAT | FLOAT | ) '}' | )';';
doubles: 'doubles' NAME ('=' '{' ((DOUBLE ',')+DOUBLE | DOUBLE | ) '}' | )';' | 'val' NAME 'as' 'doubles' ('=' '{' ((DOUBLE ',')+DOUBLE | DOUBLE | ) '}' | )';' | 'var' NAME 'as' 'doubles' ('=' '{' ((DOUBLE ',')+DOUBLE | DOUBLE | ) '}' | )';';
longs: 'longs' NAME ('=' '{' ((LONG ',')+LONG | LONG | ) '}' | )';' | 'val' NAME 'as' 'longs' ('=' '{' ((LONG ',')+LONG | LONG | ) '}' | )';' | 'var' NAME 'as' 'longs' ('=' '{' ((LONG ',')+LONG | LONG | ) '}' | )';' ;
booleans: 'booleans' NAME ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )';' | 'bools' NAME ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )';' | 'val' NAME 'as' 'bools' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )';' | 'var' NAME 'as' 'bools' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )';' | 'val' NAME 'as' 'booleans' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )';' | 'var' NAME 'as' 'booleans' ('=' '{' ((BOOL ',')+BOOL | BOOL | ) '}' | )';';
import_: '#' CLASSNAME '>' (NAME | )';';
priority: '#' INT ';' ;
//add: NAME'.''add''<<' (STRING | INT | FLOAT | DOUBLE | LONG | BOOL) ';' ;
//addAll: NAME'.''addAll''<<' (NAME | (STRING',')+STRING | (INT',')+INT | (FLOAT',')+FLOAT | (DOUBLE',')+DOUBLE | (LONG',')+LONG | (BOOL',')+BOOL) ';' ;
//regin stop
//regin start
while: 'while' NAME WHILE_BOOL INT '{' (all | ) '}' ;
for: 'for' NAME INT '<<' INT '{' (all | ) '}' ;
print:  'print'('<<' NAME)+ ';'| 'print' '<<' (NAME',' |(STRING|INT|FLOAT|DOUBLE|BOOL) ',')+(NAME |(STRING|INT|FLOAT|DOUBLE|BOOL))';';
fieldA: CLASSNAME '<<' (fa | (NAME | STRING | INT | FLOAT | DOUBLE | LONG | BOOL));


fa: (NAME ',' | STRING ',' | INT ',' | FLOAT ',' | DOUBLE ',' | LONG ',' | BOOL ',')+ (NAME | STRING | INT | FLOAT | DOUBLE | LONG | BOOL);
CLASSNAME: (NAME '.')+ NAME;
INT : [0-9]+ ;
WHILE_BOOL: '<=' | '>=' | '>' | '<' | '==' | '<>' | '!=';
FLOAT: INT'.'INT('f' | 'F');
LONG: INT('l' |'L') ;
DOUBLE: INT'.'INT;
BOOL: 'true' | 'false';
NAME: [a-zA-Z]+ | ([a-zA-Z]+ INT)+ ( | [a-zA-Z]+) ;
//[a-zA-Z] | [a-zA-Z]+ | [a-zA-Z]+INT
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
