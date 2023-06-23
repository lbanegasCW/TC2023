package Compiler;

import org.antlr.v4.runtime.*;
import Compiler.Error.ErrorType;

public class ErrorListener extends BaseErrorListener {
    private ErrorCollection errorCollection;

    public ErrorListener(ErrorCollection errorCollection) {
        this.errorCollection = errorCollection;
    }

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, 
            int charPositionInLine, String msg, RecognitionException e) {
        Error error = new Error(msg, line, charPositionInLine, ErrorType.SINTACTICO);
        errorCollection.addError(error);
    }
}