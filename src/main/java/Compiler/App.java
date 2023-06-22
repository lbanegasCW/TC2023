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
                
        // Se crea el listener
        // ExpRegBaseListener escucha = new Escucha();

        // Conecto el objeto con Listeners al parser
        // parser.addParseListener(escucha);

        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        ParseTree tree =  parser.programa();
        
        // Conectamos el visitor
        // Caminante visitor = new Caminante();
        // visitor.visit(tree);
        // System.out.println(visitor);
        // System.out.println(visitor.getErrorNodes());

        // Imprime el arbol obtenido
        System.out.println("Print tree: ");
        System.out.println(tree.toStringTree(parser));
        // System.out.println(escucha);
    }
}
