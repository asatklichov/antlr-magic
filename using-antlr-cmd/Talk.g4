grammar Talk;  

// Lexer
talk                : sentence + EOF #jusTalk; 
sentence            : name command message  #write;
message             : (emoticon | link | color | mention | WORD | WHITESPACE)+ ;

name                : WORD WHITESPACE;

command             : (SAYS | SHOUTS) COLON WHITESPACE ;
                                        
emoticon            : COLON MINUS? LEFTP
                    | COLON MINUS? RIGHTP 
                    ;

link                : LEFTSQRP TEXT RIGHTSQRP LEFTP TEXT RIGHTP ;

color               : BACKSLASH  WORD BACKSLASH message BACKSLASH;

//preceding token only do that for parser rules.
//semantic predicates
//TEXT : {_input.LA(-1) == '[' || _input.LA(-1) == '('}? ~[])]+ ;
mention: {_input.LT(-1).getType() == WHITESPACE}? '@MR' WORD ;
mention2             : AT WORD ;

// Lexer 
fragment A          : ('A'|'a') ;
fragment S          : ('S'|'s') ;
fragment Y          : ('Y'|'y') ;
fragment H          : ('H'|'h') ;
fragment O          : ('O'|'o') ;
fragment U          : ('U'|'u') ;
fragment T          : ('T'|'t') ;

fragment LOWERCASE  : [a-z] ;
fragment UPPERCASE  : [A-Z] ;
fragment DIGIT : [0-9] ;

COLON:  ':';                                       
MINUS: '-';
LEFTP: '(';
RIGHTP: ')';
LEFTSQRP: '[';
RIGHTSQRP: ']'; 
BACKSLASH : '/'; 
AT:  '@';

NUMBER         : DIGIT+ ([.,] DIGIT+)? ;

SAYS                : S A Y S ;

SHOUTS              : S H O U T S;

WORD                : (LOWERCASE | UPPERCASE | '_')+ ;

WHITESPACE          : (' ' | 't') ;

NEWLINE             : ('r'? 'n' | 'r')+ ;  

TEXT                  :  ('['|'(')  [a-zA-Z0-9] (']'|')');


