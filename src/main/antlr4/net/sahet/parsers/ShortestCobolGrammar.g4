//combined grammar
grammar ShortestCobolGrammar;

/* parser rules */
cobolProgram : programUnit EOF;

programUnit : identificationDivision procedureDivision?;

identificationDivision : IDENTIFICATION DIVISION DOT_FS programId;

programId : PROGRAM_ID DOT_FS programName DOT_FS?;

programName : IDENTIFIER+;

procedureDivision : PROCEDURE DIVISION DOT_FS displayStatement?;

displayStatement : DISPLAY DOUBLEQUOTE message DOUBLEQUOTE DOT_FS;

message : IDENTIFIER+;
//message : (WORD | NUMBER | WHITESPACE)+;

/* lexer rules */
//language keywords
DISPLAY : D I S P L A Y;
DIVISION : D I V I S I O N;
IDENTIFICATION : I D E N T I F I C A T I O N;
PROCEDURE : P R O C E D U R E;
PROGRAM_ID : P R O G R A M MINUSCHAR I D;

// literals
IDENTIFIER : ([a-zA-Z0-9]+ [-_a-zA-Z0-9]*);
INT : (PLUSCHAR | MINUSCHAR)? [0-9]+;
NUMBER : DIGIT+ ([.,] DIGIT+)?;
WORD : (LOWERCASE | UPPERCASE | '_')+ ;

//symbols
DOT_FS : DOT ('\r' | '\n' | '\f' | '\t' | ' ')+ | DOT EOF;
DOT : '.';
DOUBLEQUOTE : '"';
MINUSCHAR : '-';
PLUSCHAR : '+';

// Define whitespace rule 
WS : [ \t\f;]+ -> channel(HIDDEN);
//WHITESPACE : (' ' | 't') ;
NEWLINE : '\r'? '\n' -> channel(HIDDEN);

// case insensitive characters
fragment A:('a'|'A');
fragment B:('b'|'B');
fragment C:('c'|'C');
fragment D:('d'|'D');
fragment E:('e'|'E');
fragment F:('f'|'F');
fragment G:('g'|'G');
fragment H:('h'|'H');
fragment I:('i'|'I');
fragment J:('j'|'J');
fragment K:('k'|'K');
fragment L:('l'|'L');
fragment M:('m'|'M');
fragment N:('n'|'N');
fragment O:('o'|'O');
fragment P:('p'|'P');
fragment Q:('q'|'Q');
fragment R:('r'|'R');
fragment S:('s'|'S');
fragment T:('t'|'T');
fragment U:('u'|'U');
fragment V:('v'|'V');
fragment W:('w'|'W');
fragment X:('x'|'X');
fragment Y:('y'|'Y');
fragment Z:('z'|'Z');

fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment DIGIT : [0-9] ;
