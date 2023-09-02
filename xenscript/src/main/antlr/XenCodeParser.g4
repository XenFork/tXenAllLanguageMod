parser grammar XenCodeParser;

options {
    tokenVocab = XenCodeLexer;
}

a: ( (expression | ) END)+;
expression
    :  STRING # stringExpr
    |  NUMBER # numberExpr
    |  PRECISION # precisionExpr
    |  NAMED # nameExpr
    ;