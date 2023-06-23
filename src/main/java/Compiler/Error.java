package Compiler;

public class Error {
    public enum ErrorType {
        SINTACTICO,
        SEMANTICO
    }
    
    private String mensaje;
    private int linea;
    private int columna;
    private ErrorType errorType;

    public Error(String mensaje, int linea, int columna, ErrorType errorType) {
        this.mensaje = mensaje;
        this.linea = linea;
        this.columna = columna;
        this.errorType = errorType;
    }

    public String getMensaje() {
        return mensaje;
    }

    public int getLinea() {
        return linea;
    }

    public int getColumna() {
        return columna;
    }

    public ErrorType getErrorType() {
        return errorType;
    }
}