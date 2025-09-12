package net.sahet.antlr.app;

import net.sahet.parse.tree.walkers.RewritingInputStreamListener;
import net.sahet.parsers.RecordsLexer;
import net.sahet.parsers.RecordsParser;
import net.sahet.parsers.ShortestCobolGrammarLexer;
import net.sahet.parsers.ShortestCobolGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Listeners and visitors are great but happens after the full parsing (building Parse Tree) of the document.
 * <p>
 * For more flexibility and control, better directly embed code snippets (actions) into grammar.
 * Which later added to generated Parser class code.
 * <p>
 * <p>
 * Special kind of action is called "semantic predicates"  used
 * dynamically turn parts of a grammar on and off.
 */
public class ControlDuringParseTimeDemo {

    /**
     * We can compute values or print things out on-the-fly during parsing if we
     * don’t want the overhead of building a parse tree.
     */
    public static void main(String[] args) {
        String fileName = "C:\\workspace-JavaNew\\antlr-magic\\src\\main\\resources\\records";
        File file = new File(fileName);
        try {
            FileInputStream fis = new FileInputStream(file);
            //InputStream is = ControlDuringParseTimeDemo.class.getResourceAsStream("/records");

            // Create a CharStream that reads from standard input
            ANTLRInputStream input = new ANTLRInputStream(fis);
            //ANTLRInputStream input = new ANTLRInputStream(is);

            RecordsLexer lexer = new RecordsLexer(input);
            //Lexer lexer = new ObjectTypesLexer(CharStreams.fromStream(is));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            int col = Integer.valueOf(2); //args[0]
            RecordsParser parser = new RecordsParser(tokens, col);
            parser.setBuildParseTree(false);
            parser.records();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}


/**
 * {_input.LT(-1).getType() == WHITESPACE}? '@MR' WORD ;
 * // Java - If you want to test for the preceding token,
 * //you can use the _input.LT(-1),but you can only do that for parser rules.
 * mention: {_input.LT(-1).getType() == WHITESPACE}? '@' WORD ;
 * <p>
 * IN pARSER ->  {@code LT(k).getType()==LA(k)}.
 * _la = _input.LA(1);
 * public Token LT(int k) {
 * <p>
 * see:  Chat.g4
 */
class ValidationInParseRules {

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
    }
}
