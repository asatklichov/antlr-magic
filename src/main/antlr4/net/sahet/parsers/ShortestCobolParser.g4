parser grammar ShortestCobolParser;
options {tokenVocab = ShortestCobolLexer; superClass = ParserValidator; }

@header {
import net.sahet.parser.error.stratedy.ParserValidator;
}

@parser::members {
    private static final String MAXLENGHT_MSG = "Max length allowed %s for %s.";

    public void validateLengthHere(String input, int validLength, String objectType) {
      if(input!=null && input.length() > validLength) {
              notifyErrorListeners(String.format(MAXLENGHT_MSG, validLength, objectType));
      }
    }
}

cobolProgram : programUnit EOF;

programUnit : identificationDivision procedureDivision?;

identificationDivision : IDENTIFICATION DIVISION DOT_FS programId;

programId : T=PROGRAM_ID {validateLength($T.text,  8, "Program Id");} DOT_FS programName DOT_FS?;

programName : V=IDENTIFIER+ {validateLengthHere($V.text, 8, "Program Name");};

procedureDivision : PROCEDURE DIVISION DOT_FS displayStatement?;

displayStatement : DISPLAY DOUBLEQUOTE message DOUBLEQUOTE DOT_FS;

message : IDENTIFIER+;
//message : (WORD | NUMBER | WHITESPACE)+;
