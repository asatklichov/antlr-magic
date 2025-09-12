grammar ObjectTypes;

object : 	'{' item 	(',' item )* '}'; // must match at least one value

item : object | INT | TEXT;

INT : [0-9]+;
TEXT: [a-zA-Z]+;
WS : [ \t\r\n]+ -> skip;