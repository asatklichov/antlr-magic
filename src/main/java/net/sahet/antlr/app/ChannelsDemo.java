package net.sahet.antlr.app;

import net.sahet.parse.tree.walkers.RewritingInputStreamListener;
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


/**
 * Generally in grammars, comments and whitespace are ignored by parser.
 *
 * If we want to ignore them in Lexer. Ideally preserve them, but ignore them (whitespaces & comments)
 * via sending them via different channel - hidden channel.
 * Parser concentrate on single channel (configurable).
 *
 * e.g.
 *
 * WS : [ \r\t\u000C\n]+ -> channel(HIDDEN)
 *
 * The -> channel(HIDDEN) is a lexer command like the -> skip
 *
 * The token stream still maintains the original sequence of tokens
 * but skips over WS via HIDDEN-channel tokens when feeding the parser
 */
public class ChannelsDemo {
    public static void main(String[] args) {

        try {
            InputStream inputStream = ChannelsDemo.class.getResourceAsStream("/shortest-prog.txt");
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
