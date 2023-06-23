package Compiler;

import java.util.ArrayList;
import java.util.List;

public class ErrorCollection {
    private static ErrorCollection instance;
    private List<Error> errors;

    private ErrorCollection() {
        errors = new ArrayList<>();
    }

    public static ErrorCollection getInstance() {
        if (instance == null) {
            instance = new ErrorCollection();
        }
        return instance;
    }

    public void addError(Error error) {
        errors.add(error);
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void mostrarErrores() {
        System.out.println("=== Errores ===");
        for (Error error : errors) {
            System.out.println("Tipo: " + error.getErrorType() 
                + " | Linea: " + error.getLinea()
                + " | Columna: " + error.getColumna()
                + " | Descripción: " + error.getMensaje());
        }
        System.out.println("================");
    }
}