package net.sahet.antlr.app;

import net.sahet.parse.tree.walkers.RewritingInputStreamListener;
import net.sahet.parsers.ShortestCobolGrammarLexer;
import net.sahet.parsers.ShortestCobolGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

/**
 - In Listener there is no RETURN value in methods, that is via information sharing between event-methos are done in several
 ways like: using instance variable (lists, errors, .. )

 - Or use Visitor which has a RETURN value
 */
public class InfoSharing {

    public static void main(String[] args) {
        try {
            InputStream inputStream = RewritingInputStreamListenerDemo.class.getResourceAsStream("/shortest-prog2.txt");

            //Lexer lexer = new ShortestCobolLexer(CharStreams.fromStream(inputStream));

            ANTLRInputStream input = new ANTLRInputStream(inputStream);
            Lexer lexer = new ShortestCobolGrammarLexer(input);

            TokenStream tokenStream = new CommonTokenStream(lexer);
            ShortestCobolGrammarParser parser = new ShortestCobolGrammarParser(tokenStream);

            ParseTree tree = parser.cobolProgram();
            ParseTreeWalker walker = new ParseTreeWalker();
            RewritingInputStreamListener reWriterListener = new RewritingInputStreamListener(tokenStream);
            walker.walk(reWriterListener, tree);

            System.out.println(reWriterListener.rewriter.getText());


        } catch (IOException e) {
            e.printStackTrace();
        }
        
        List<String> l = fun();
        for (String string : l) {
        	System.out.println("sasas: "+l);
			
		} 
        System.out.println();
        
        for (String string : fun()) {
        	System.out.println("sasas: "+l);
			
		} 
    }

	private static List<String> fun() {
		System.out.println("--fun()--");
		return List.of("a", "b", "c");
	}
}
