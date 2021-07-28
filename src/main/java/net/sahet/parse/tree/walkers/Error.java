package net.sahet.parse.tree.walkers;

public class Error {
    private String code;
    private String message;

    Error(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getErrorMessage() {
        return "Error: "+code + ", desc = " + message;
    }
}
