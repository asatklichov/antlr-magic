package net.sahet.antlr.app;

import net.sahet.parse.tree.walkers.RewritingInputStreamListener;
import net.sahet.parse.tree.walkers.ShortestCobolParserListenerImpl;
import net.sahet.parsers.ShortestCobolLexer;
import net.sahet.parsers.ShortestCobolParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;
import java.io.InputStream;

public class RewritingInputStreamListenerDemo {
    public static void main(String[] args) {

        try {
            InputStream inputStream = RewritingInputStreamListenerDemo.class.getResourceAsStream("/shortest-prog.txt");
            //Lexer lexer = new ShortestCobolLexer(CharStreams.fromStream(inputStream));

            ANTLRInputStream input = new ANTLRInputStream(inputStream);
            Lexer lexer = new ShortestCobolLexer(input);

            TokenStream tokenStream = new CommonTokenStream(lexer);
            ShortestCobolParser parser = new ShortestCobolParser(tokenStream);

            ParseTree tree = parser.cobolProgram();
            ParseTreeWalker walker = new ParseTreeWalker();
            RewritingInputStreamListener reWriterListener =  new RewritingInputStreamListener(tokenStream);
            walker.walk(reWriterListener, tree);

            System.out.println(reWriterListener.rewriter.getText());


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
