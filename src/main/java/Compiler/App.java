package Compiler;

import org.antlr.v4.runtime.tree.ParseTree;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

// Las diferentes entradas se explicaran oportunamente
public class App {
    public static void main(String[] args) throws Exception {
        // Create a CharStream that reads from file
        CharStream input = CharStreams.fromFileName("input/entrada.txt");

        // Create a lexer that feeds off of input CharStream
        CompilerLexer lexer = new CompilerLexer(input);
        
        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // Create a parser that feeds off the tokens buffer
        CompilerParser parser = new CompilerParser(tokens);
                
        // Se genera una coleccion que sera utilizada para recopilar errores
        ErrorCollection errorCollection = ErrorCollection.getInstance();
        
        // Se crea el listener
        ErrorListener errorListener = new ErrorListener(errorCollection);

        // Conecto el objeto con Listeners al parser
        parser.addErrorListener(errorListener);

        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        ParseTree tree =  parser.programa();
        
        // Imprime el arbol obtenido
        System.out.println();
        System.out.println("Arbol sintáctico: ");
        System.out.println(tree.toStringTree(parser));


        // Conectamos el visitor
        System.out.println();
        System.out.println("Tabla de Simbolos por contexto: ");
        SymbolTableVisitor visitor = new SymbolTableVisitor(errorCollection);
        visitor.visit(tree);
        System.out.println(visitor);

        System.out.println();
        System.out.println("Informe de errores: ");
        errorCollection.mostrarErrores();
    }
}
