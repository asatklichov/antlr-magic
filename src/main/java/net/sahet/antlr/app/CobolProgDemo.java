package net.sahet.antlr.app;

import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import net.sahet.parsers.ShortestCobolGrammarLexer;
import net.sahet.parsers.ShortestCobolGrammarParser;
import net.sahet.parsers.ShortestCobolGrammarParser.CobolProgramContext;

public class CobolProgDemo {
	public static void main(String[] args) {

		try {
			/*
			 * get the input file as an InputStream
			 */
			// InputStreamReader r = new InputStreamReader(System.in)
			InputStream inputStream = CobolProgDemo.class.getResourceAsStream("/shortest-prog.txt");
//         BufferedReader br = new BufferedReader(r);
//         System.out.println("Enter your expression");
//     	 String txt = br.readLine() + "\n";
			// ANTLRInputStream input = new ANTLRInputStream(txt);
			// SalamLexer lexer = new SalamLexer(input);

			/*
			 * make Lexer
			 */
			Lexer lexer = new ShortestCobolGrammarLexer(CharStreams.fromStream(inputStream));
			/*
			 * get a TokenStream on the Lexer
			 */
			TokenStream tokenStream = new CommonTokenStream(lexer);
			// CommonTokenStream tokens = new CommonTokenStream(lexer);
			/*
			 * make a Parser on the token stream
			 */
			ShortestCobolGrammarParser parser = new ShortestCobolGrammarParser(tokenStream);
			/*
			 * get the top node of the AST. This corresponds to the topmost rule of
			 * equation.q4, "equation"
			 */
			@SuppressWarnings("unused")
			CobolProgramContext cobolProgramContext = parser.cobolProgram();
			System.out.println(cobolProgramContext.getText());

			ParseTree tree = parser.cobolProgram(); 
            System.out.println(tree.toStringTree(parser)); // print LISP-style tree
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}