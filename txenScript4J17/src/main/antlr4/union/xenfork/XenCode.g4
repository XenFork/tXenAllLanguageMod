grammar XenCode;
r   : 'hello' NAME';';

//field
field: field f | f;
f : fSTR | fINT | fFLOAT | fDOUBLE | fBOOLEAN | fVAL | fVAR;
fSTR : 'string' NAME '=' STRING';' | 'string' NAME';' ;
fINT : 'int' NAME '=' INT';' | 'int' NAME';';
fFLOAT: 'float' NAME '=' FLOAT';' | 'float' NAME';';
fDOUBLE: 'double' NAME '=' DOUBLE';' | 'double' NAME';';
fBOOLEAN: 'bool' NAME '=' BOOL';' | 'bool' NAME';';
fVAR : 'var' NAME '=' OBJ';' ;
fVAL : 'val' NAME '=' OBJ';' ;

INT : [0-9]+ ;
FLOAT: INT'.'INT'f';
OBJ : STRING | INT | FLOAT;
DOUBLE: INT'.'INT;
BOOL: 'true' | 'false';
NAME: [a-z]+ ;
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




