package net.sahet.antlr.app;

import net.sahet.parse.tree.walkers.ShortestCobolParserVisitorImpl;
import net.sahet.parsers.ShortestCobolLexer;
import net.sahet.parsers.ShortestCobolParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.io.InputStream;

public class CobolProgVisitorDemo {
    public static void main(String[] args) {

        try {
            InputStream inputStream = CobolProgVisitorDemo.class.getResourceAsStream("/shortest-prog.txt");

            ANTLRInputStream input = new ANTLRInputStream(inputStream);
            Lexer lexer = new ShortestCobolLexer(input);

            TokenStream tokenStream = new CommonTokenStream(lexer);//tokenize

            ShortestCobolParser parser = new ShortestCobolParser(tokenStream);//parse tokens

            ParseTree tree = parser.cobolProgram();
            ShortestCobolParserVisitorImpl visitor = new ShortestCobolParserVisitorImpl();
            visitor.visit(tree);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
