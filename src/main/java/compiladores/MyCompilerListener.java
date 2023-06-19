package compiladores;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class MyCompilerListener extends CompilerBaseListener {
    private SymbolTable symbolTable = new SymbolTable();
    private List<ErrorReport> errorReports = new ArrayList<>();

    private Integer nodos = 0;
    private Integer tokens = 0;
    private Integer rules = 0;
    private Integer error = 0;

    @Override
    public void enterDeclaracion(CompilerParser.DeclaracionContext ctx) {
        TerminalNode idNode = ctx.ID();
        if (idNode != null) {
            String id = idNode.getText();
            String type = ctx.TYPE().getText();

            // Verificar si el identificador ya ha sido declarado previamente
            if (symbolTable.containsSymbol(id)) {
                // Agregar informe de error semántico
                String typeError = "Error semántico";
                String description = "Doble declaración del identificador '" + id + "'";
                int line = idNode.getSymbol().getLine();
                int column = idNode.getSymbol().getCharPositionInLine();
                ErrorReport errorReport = new ErrorReport(typeError, description, line, column);
                errorReports.add(errorReport);
            }

            // Agregar el símbolo a la tabla de símbolos
            Symbol symbol = new Symbol(id, type);
            symbolTable.addSymbol(symbol);
            
            System.out.println("ID: " + id + ", Type: " + type); // Agrega este mensaje de depuración
        }
    }

    @Override
    public void enterPrograma(CompilerParser.ProgramaContext ctx) {
        System.out.println("Entrando al programa...");
    }

    @Override
    public void exitPrograma(CompilerParser.ProgramaContext ctx) {
        System.out.println("Fin del programa");
        System.out.println("Se visitaron " + nodos + " nodos");
        System.out.println("- Hay " + tokens + " Tokens");
        System.out.println("- Hay " + error + " Errores");
        System.out.println("- Hay " + rules + " Rules");
        System.out.println("Tabla de símbolos del programa:");
            
        System.out.println("Informe de errores:");
        for (ErrorReport errorReport : errorReports) {
            System.out.println("Tipo: " + errorReport.getType());
            System.out.println("Descripción: " + errorReport.getDescription());
            System.out.println("Línea: " + errorReport.getLine());
            System.out.println("Columna: " + errorReport.getColumn());
            System.out.println("------------------------------------");
        }
        System.out.println(symbolTable.toString());
    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {
        rules++; // Incrementar contador de reglas
        nodos++; // Incrementar contador de nodos visitados
    }

    @Override
    public void visitErrorNode(ErrorNode node) {
        error++;

        // Agregar informe de error sintáctico
        String type = "Error sintáctico";
        String description = "Error en la sintaxis del código";
        int line = node.getSymbol().getLine();
        int column = node.getSymbol().getCharPositionInLine();
        ErrorReport errorReport = new ErrorReport(type, description, line, column);
        errorReports.add(errorReport);
    }

    @Override
    public void visitTerminal(TerminalNode node) {
        tokens++;
    }
}