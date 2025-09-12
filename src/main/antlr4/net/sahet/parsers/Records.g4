grammar Records;

@parser::members {
    int col;
    public RecordsParser(TokenStream input, int col) {
        this(input);
        this.col = col;
    }
}

//records
records: (record NL)+ ;
record
locals [int i=0]
    : (   CHARS
          {
          $i++;
          if ( $i == col ) System.out.println($CHARS.text);
          if ( $i % 2 == 1 ) System.out.println("Odd record");
          }

          {col % 2 == 0}? {System.out.println("Even record");}

      )+
    ;

CHARS:  ~[\r\n"]+ ;
NL   :  '\r'? '\n' ;
