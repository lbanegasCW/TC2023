/*
    Implementación Tabla de simbolos - Banegas Luis  UBP - 2023
*/

package Compiler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablaSimbolos {
    private static TablaSimbolos instance;
    private List<Map<String, Id>> ts;
    private int contextoActual;

    private TablaSimbolos() {
        ts = new ArrayList<>();
        addContexto();
    }

    public static TablaSimbolos getInstance() {
        // Implementación Singleton
        if (instance == null) {
            instance = new TablaSimbolos();
        }
        return instance;
    }

    public void addSimbolo(Id id) {
        // Se agrega un simbolo al hashMap
        Map<String, Id> contexto = ts.get(contextoActual);
        contexto.put(id.getNombre(), id);
    }

    public Id buscarSimbolo(String nombre) {
        // Busca el simbolo en el nivel actual o niveles superiores
        for (int i = contextoActual; i >= 0; i--) {
            Map<String, Id> contexto = ts.get(i);
            if (contexto.containsKey(nombre)) {
                return contexto.get(nombre);
            }
        }
        return null;
    }

    public void addContexto() {
        // Se agrega un HashMap por contexto
        ts.add(new HashMap<>());
        contextoActual = ts.size() - 1;
    }

    public void delContexto() {
        // Se elimina el hashMap (contexto) actual
        if (contextoActual >= 0) {
            ts.remove(contextoActual);
            contextoActual--;
        }
    }

    public void mostrarTablaSimbolos() {
        // Se recorren todos los contextos actuales y superiores para mostrar simbolos
        for (int i = 1; i <= contextoActual; i++) {
            Map<String, Id> contexto = ts.get(i);
            for (Id id : contexto.values()) {
                System.out.print(
                    "Nombre: " + id.getNombre() + " | " +
                    "Tipo de dato: " + id.getTipoDato() + " | " + 
                    "Nivel: " + i + " | " +
                    "Usado: " + id.isUsado() + " | ");
                if (id instanceof Variable) {
                    Variable variable = (Variable) id;
                    System.out.println("Inicializado: " + variable.isInicializado());
                } else {
                    Funcion funcion = (Funcion) id;
                    System.out.println("Parametros: " + funcion.getArgumentos().toString());
                }
            }
        }
    }
}