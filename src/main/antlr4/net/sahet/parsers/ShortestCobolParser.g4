parser grammar ShortestCobolParser;

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
