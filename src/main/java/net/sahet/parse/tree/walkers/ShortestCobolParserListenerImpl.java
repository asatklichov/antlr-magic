package net.sahet.parse.tree.walkers;

import net.sahet.parsers.ShortestCobolParser;
import net.sahet.parsers.ShortestCobolParserBaseListener;

import java.util.ArrayList;
import java.util.List;

public class ShortestCobolParserListenerImpl extends ShortestCobolParserBaseListener {

    private final List<Error> errors = new ArrayList<>();

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
        if (null == message || message.isBlank() || !message.startsWith("Hello")) {
            Error error = new Error("1", "Text must start with 'Hello' word");
            errors.add(error);
            System.out.println(error.getErrorMessage());
        }
        System.out.println("exit DISPLAY Statement");
    }

}
