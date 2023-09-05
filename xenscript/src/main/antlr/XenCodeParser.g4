parser grammar XenCodeParser;

options {
    tokenVocab = XenCodeLexer;
}
thread: (classMappings+ | ) (priority | ) (extendExpr | ) (loaderExpr+ | ) (importExpr+ | ) ((forExpr | whileExpr | expr)+ | );// all bus
extendExpr: EXTEND  name_split  END;
maven: url;
classMappings: L (dependencies=.*? | maven) R;
loaderExpr: IL NAMED END;// such as # a_xcs; to use a.xcs this script or #a_b_xcs; to use a_b.xcs or a.b.xcs //check some script
priority: IL NUMBER END;// priority
importExpr: IL NAMED (SPLIT NAMED)+ END;
expr: (expression | ) END;
forBlock: type ((SUBLEVEL NAMED) | ) LA type;
whileBlock: type bool type;
bool: LA | RA | L | R | EQUALS | AND | OR;
forExpr: FOR forBlock LB (expr | ) RB;
whileExpr: WHILE whileBlock LB (expr | ) RB;
expression
    :  STRING                           # stringExpr
    |  assignBlock                      # assignExpr
    |  VAR assignBlock                  # varExpr
    |  VAL assignBlock                  # valExpr
    |  NUMBER                           # defaultNumberExpr
    |  PRECISION                        # defaultPrecisionExpr
    |  NAMED                            # nameExpr
    |  not BOOL                         # defaultBoolExpr
    |  not boolBlock                    # boolExpr
    |  name_split                       # fieldExpr
    |  name_split INVOKE types          # methodExpr
    |  type operation type              # operationExpr
    |  types                            # arrayExpr
    ;
not: NOT | ;
operation: ADD | SUB | MUL | DIV;
boolBlock: type bool type;//string bool have version select and more
assignBlock: NAMED | NAMED ASSIGN expression;
name_split: NAMED (SPLIT NAMED)+;
number_split: NUMBER (SPLIT NUMBER)+;

types: type ((SUBLEVEL type)+ | ) | ;
type: STRING | NUMBER | PRECISION | NAMED;

url: NAMED URI_HEAD (name_split | number_split) DIV;



// test
/*
<https://maven.fabricmc.net/>
<net.fabricmc:yarn:1.20.1+build.10:v2>
<https://maven.parchmentmc.org/>
<org.parchmentmc.data:parchment-1.20.1:2023.06.26@zip>
# 1;
# loader;
# a.b;
var a = "ab";

for j <= a {//for each a="ab" j = ['a', 'b']

}
for j,i <= a {//for int i = 0 j = 'a' int i = 1; j = 'b'

}
var b = 0;
while b <= 0 {

}

a.b <- "a";
a.b;
var c = 1+1;
*/