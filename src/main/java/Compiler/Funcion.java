package Compiler;

import java.util.ArrayList;
import java.util.List;

public class Funcion extends Id {
    private List<String> argumentos;

    public Funcion() {
        argumentos = new ArrayList<>();
    }

    public List<String> getArgumentos() {
        return argumentos;
    }

    public void setArgumentos(List<String> argumentos) {
        this.argumentos = argumentos;
    }
}
