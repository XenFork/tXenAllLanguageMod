lexer grammar XenCodeV1Lexer;

channels {
    ESQLCOMMENT,
    ERRORCHANNEL
}

SPACE: [ \t\r\n]+ -> channel(HIDDEN) ;
SPEC_ESSQL_COMMENT: '/*!' .+? '*/' -> channel(ESQLCOMMENT) ;
COMMENT_INPUT: '/*' .*? '*/' -> channel(HIDDEN) ;
LINE_COMMENT: (
        ('==' | '#') ~[\r\n]* ('\r'? '\n' | EOF)
        | '--' ('\r'? '\n' | EOF)
    ) -> channel(HIDDEN) ;
