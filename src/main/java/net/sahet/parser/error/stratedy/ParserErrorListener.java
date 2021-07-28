package net.sahet.parser.error.stratedy;

import net.sahet.parse.tree.walkers.Error;
import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;

import java.util.ArrayList;
import java.util.List;

public class ParserErrorListener extends BaseErrorListener {

    private final List<Error> errors = new ArrayList<>();

    @Override
    public void syntaxError(
            Recognizer<?, ?> recognizer,
            Object offendingSymbol,
            int line,
            int charPositionInLine,
            String msg,
            RecognitionException e) {


        errors.add(new Error("1", msg));
    }
}
