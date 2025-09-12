package net.sahet.parse.tree.walkers;

import net.sahet.parsers.ShortestCobolParser;
import net.sahet.parsers.ShortestCobolParserBaseListener;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.TokenStreamRewriter;

import java.util.ArrayList;
import java.util.List;

public class RewritingInputStreamListener extends ShortestCobolParserBaseListener {

    public TokenStreamRewriter rewriter;

    private final List<Error> errors = new ArrayList<>();

    public RewritingInputStreamListener(TokenStream tokens){
      rewriter =new TokenStreamRewriter(tokens);
    }

    @Override
    public void enterDisplayStatement(ShortestCobolParser.DisplayStatementContext ctx) {
        System.out.println("enter DISPLAY Statement");
    }

    /**
     * Prints a warning message once DISPLAY texts does not start with "Hello" word
     */
    @Override
    public void exitDisplayStatement(ShortestCobolParser.DisplayStatementContext ctx) {
        String message = ctx.message().getText();
        String field = "\t DISPLAY \"Mind Eclipse - reading ellerindeki roadmap\".;";
        //rewriter.insertAfter(ctx.start, field);
        rewriter.insertBefore(ctx.start, field+"\n");
        rewriter.insertAfter(ctx.stop, field);
        System.out.println("inserting dynamically  string fields into the original token stream and print it");
        System.out.println("exit DISPLAY Statement");

    }
}
