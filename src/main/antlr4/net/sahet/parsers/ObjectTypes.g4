grammar ObjectTypes;


//object
object : 	'{' item 	(',' item )* '}';
item : object | INT | STRING;
//item : object | INT | DOUBLEQUOTE STRING DOUBLEQUOTE;


//comment
comment : LINE_COMMENT | BLOCK_COMMENT;



//string
STRING : DOUBLEQUOTE .*? DOUBLEQUOTE | SINGLEQUOTE .*? SINGLEQUOTE;



LINE_COMMENT : '//' .*? '\r'? '\n' -> skip ; // not feed parser
BLOCK_COMMENT      : '/*' .*? '*/' -> skip ;
INT : [0-9]+;
IP : INT '.' INT '.' INT '.' INT ;
TEXT: [a-zA-Z0-9]+;
WS : [ \t\r\n]+ -> skip;
//WS : (' '|'\t'|'\n')+ -> skip ;// not feed parser
DOUBLEQUOTE: '"';
SINGLEQUOTE : '\'';
TAB  :  '\t' -> skip ;
NL   :  '\r'? '\n' ;


