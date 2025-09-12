package net.sahet.parser.error.stratedy;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;

public abstract class ParserValidator extends Parser {

    public ParserValidator(TokenStream input) {
        super(input);
    }

    /**
     * Validates input value with given valid value and throws error in case fail
     *
     * @param input
     * @param validInput
     * @param objectDesc
     */
    public void validateLength(String input, Integer validInput, String objectDesc) {
        if (null != input && input.length() > validInput) {
            notifyError("parsers.maxLength", validInput.toString(), objectDesc);
        }
    }


    /**
     * Validates actual input value with given valid value and throws error in case fail
     *
     * @param actual
     * @param expected
     */
    protected void validateValue(String actual, String expected) {
        if (actual != null && !actual.equals(expected)) {
            notifyError("parsers.validValueMsg", actual, expected);
        }
    }


    private String getMessageForParser(String messageKey, String... parameters) {
        return ((CobolErrorStrategy) this.getErrorHandler())
                .getMessageResource()
                .getMessage(messageKey, parameters);
    }

    public void notifyListeners(String message) {
        super.notifyErrorListeners(message);
    }


    public void notifyError(String messageId, String... parameters) {
        String message = getMessageForParser(messageId, parameters);
        notifyListeners(message);
    }

}
