package net.sahet.parser.error.stratedy;

import lombok.Getter;
import lombok.Setter;
import net.sahet.parser.common.service.MessageResource;
import org.antlr.v4.runtime.*;

public class CobolErrorStrategy extends DefaultErrorStrategy {

    @Getter
    @Setter
    private MessageResource messageResource;

    public CobolErrorStrategy(MessageResource messageResource) {
        this.messageResource = messageResource;
    }

    @Override
    public void reportError(Parser recognizer, RecognitionException e) {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }
        beginErrorCondition(recognizer);

        if (e instanceof NoViableAltException) {
            reportNoViableAlternative(recognizer, (NoViableAltException) e);
        } else if (e instanceof InputMismatchException) {
            reportInputMismatch(recognizer, (InputMismatchException) e);
        } else if (e instanceof FailedPredicateException) {
            reportFailedPredicate(recognizer, (FailedPredicateException) e);
        } else {
            reportUnrecognizedException(recognizer, e);
        }
    }

    private void reportUnrecognizedException(Parser recognizer, RecognitionException e) {
        recognizer.notifyErrorListeners(e.getOffendingToken(), e.getMessage(), e);
    }


    @Override
    protected void reportMissingToken(Parser recognizer) {
        if (inErrorRecoveryMode(recognizer)) {
            return;
        }
        beginErrorCondition(recognizer);
        String msg =
                messageResource.getMessage(
                        "parsers.errorStrategy.err1",
                        getRule(recognizer));
        recognizer.notifyErrorListeners(recognizer.getCurrentToken(), msg, null);
    }

    private String getTokenErrorDisplay(InputMismatchException e) {
        return getTokenErrorDisplay(e.getOffendingToken());
    }

    public static String getRule(Parser recognizer) {
        return recognizer.getRuleInvocationStack().get(0);
    }


}
