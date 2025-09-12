grammar csv;

//csv
csv: (csvrecord NL)+ ;
csvrecord: CSVCHARS (',' CSVCHARS)* ;

CSVCHARS:  ~[,\r\n"]+ ;
NL   :  '\r'? '\n' ;
