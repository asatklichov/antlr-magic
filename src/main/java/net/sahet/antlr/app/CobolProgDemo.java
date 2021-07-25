package net.sahet.antlr.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
//
//import net.sahet.parser.examples.Cobol85Lexer;
//import net.sahet.parser.examples.Cobol85Parser;
//import net.sahet.parser.examples.Cobol85Parser.StartRuleContext;
// 
// 
//class CobolProgDemo {
//   public static void main(String[] args) { 
//      try {
//         /*
//          * get the input file as an InputStream
//          */
//         InputStream inputStream = CobolProgDemo.class.getResourceAsStream("/prog.txt");
//         /*
//          * make Lexer
//          */
//         Lexer lexer = new Cobol85Lexer(CharStreams.fromStream(inputStream));
//         /*
//          * get a TokenStream on the Lexer
//          */
//         TokenStream tokenStream = new CommonTokenStream(lexer);
//         /*
//          * make a Parser on the token stream
//          */
//         Cobol85Parser parser = new Cobol85Parser(tokenStream);
//         /*
//          * get the top node of the AST. This corresponds to the topmost rule of equation.q4, "equation"
//          */
//         @SuppressWarnings("unused")
//         StartRuleContext startRuleContext = parser.startRule();
//         System.out.println(startRuleContext.getText());
//      } catch (IOException e) {
//         e.printStackTrace();
//      }
import org.antlr.v4.runtime.tree.ParseTree;


//   }
//}
//
//InputStreamReader r = new InputStreamReader(System.in);
//BufferedReader br = new BufferedReader(r);
//System.out.println("Enter your expression");
//String txt = br.readLine() + "\n";
//
//ANTLRInputStream input = new ANTLRInputStream(txt);
//
//SalamLexer lexer = new SalamLexer(input);
//
//CommonTokenStream tokens = new CommonTokenStream(lexer);
////
//SalamParser parser = new SalamParser(tokens);
//
//ParseTree tree = parser.rec(); // begin parsing at rule 'r'
//System.out.println(tree.toStringTree(parser)); // print LISP-style tree
//
//System.out.println();