package net.sahet.antlr.app;

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

public class CobolProgVisitorDemo {
    public static void main(String[] args) {

        try {
            InputStream inputStream = CobolProgVisitorDemo.class.getResourceAsStream("/shortest-prog-listener.txt");
            //Lexer lexer = new ShortestCobolLexer(CharStreams.fromStream(inputStream));

            ANTLRInputStream input = new ANTLRInputStream(inputStream);
            Lexer lexer = new ShortestCobolLexer(input);

            TokenStream tokenStream = new CommonTokenStream(lexer);//tokenize

            ShortestCobolParser parser = new ShortestCobolParser(tokenStream);//parse tokens

//            ShortestCobolParser.CobolProgramContext cobolProgramContext = parser.cobolProgram();
//            System.out.println(cobolProgramContext.getText());


            ParseTree tree = parser.cobolProgram();
            ParseTreeWalker walker = new ParseTreeWalker();
            walker.walk(new ShortestCobolParserListenerImpl(), tree);

            //System.out.println(tree.toStringTree(parser)); // print LISP-style tree


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
