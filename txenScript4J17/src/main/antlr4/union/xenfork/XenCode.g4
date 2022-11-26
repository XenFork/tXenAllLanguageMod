grammar XenCode;
r   : 'hello' NAME';';


fSTR : 'string' NAME '=' STRING';' | 'string' NAME';' ;
fINT : 'int' NAME '=' INT';' | 'int' NAME';';
fFLOAT: 'float' NAME '=' FLOAT';' | 'float' NAME';';
fVAR : 'var' NAME '=' OBJ';' ;
fVAL : 'val' NAME '=' OBJ';' ;
INT : [0-9]+ ;
FLOAT: INT'.'INT'f';
OBJ : STRING | INT;
NAME: [a-z]+ ;
STRING: '"' .*? '"';
WS  : [ \t\r\n]+ -> skip;




