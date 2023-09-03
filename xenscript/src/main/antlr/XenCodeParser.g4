parser grammar XenCodeParser;

options {
    tokenVocab = XenCodeLexer;
}
all: thread+;// more and more bus
thread: priority | importLoaderExpr | expr;// all bus
priority: IL NUMBER END;// priority
importLoaderExpr: IL NAMED ((SPLIT NAMED)+ | ) END;// if NAMED = 1 loader, else import
expr: (forExpr | whileExpr | (expression | ) END)+;
forBlock: (STRING | NUMBER | PRECISION | NAMED) ((SUBLEVEL NAMED) | ) LA (STRING | NUMBER | PRECISION | NAMED);
whileBlock: (STRING | NUMBER | PRECISION | NAMED) bool (STRING | NUMBER | PRECISION | NAMED);
bool: LA | RA | L | R | EQUALS | AND | OR;
forExpr: FOR forBlock LB (expr | ) RB;
whileExpr: WHILE whileBlock LB (expr | ) RB;
expression
    :  STRING # stringExpr
    |  (VAR | VAL | ) (NAMED | NAMED ASSIGN expression) #varValExpr
    |  NUMBER # numberExpr
    |  PRECISION # precisionExpr
    |  NAMED # nameExpr
    |  BOOL # boolExpr
    ;

// test
/*
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
*/