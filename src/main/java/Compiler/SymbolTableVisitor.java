/*
    Patron visitor para tabla de simbolos - Banegas Luis  UBP - 2023
*/

package Compiler;

import org.antlr.v4.runtime.tree.TerminalNode;

import Compiler.CompilerParser.AsignacionContext;
import Compiler.CompilerParser.BloqueContext;
import Compiler.CompilerParser.DeclaracionContext;
import Compiler.CompilerParser.IforContext;
import Compiler.CompilerParser.MinExprContext;
import Compiler.CompilerParser.ProgramaContext;
import Compiler.CompilerParser.FuncionContext;

public class SymbolTableVisitor extends CompilerBaseVisitor<Void> {
    private TablaSimbolos tablaSimbolos;

    public SymbolTableVisitor() {
        tablaSimbolos = TablaSimbolos.getInstance();
    }

    @Override
    public Void visitDeclaracion(DeclaracionContext ctx) {
        // Se ve la declaracion de variables, y si esta inicializada. 
        for (TerminalNode idContext : ctx.listaId().ID()) {
            Variable variable = new Variable();
            variable.setNombre(idContext.getText());
            variable.setTipoDato(ctx.TYPE().getText());
            variable.setUsado(false);
            variable.setInicializado((ctx.listaId().inicializacion().size() > 0) ? true : false);
            tablaSimbolos.addSimbolo(variable);
        }
        super.visitDeclaracion(ctx);
        return null;
    }

    @Override
    public Void visitFuncion(FuncionContext ctx) {
        Funcion funcion = new Funcion();
        funcion.setTipoDato(ctx.TYPE().getText());
        funcion.setNombre(ctx.ID().getText());
        if (ctx.parametros() != null) {
            for (TerminalNode idContext : ctx.parametros().TYPE()) {
                funcion.getArgumentos().add(idContext.getText());
            }
        }        
        funcion.setUsado(false);
        tablaSimbolos.addSimbolo(funcion);
        super.visitFuncion(ctx);
        return null;
    }

    @Override
    public Void visitAsignacion(AsignacionContext ctx) {
        // Si se realiza una asignacion se considera variable inicializada
        String nombre = ctx.ID().getText();
        Id id = tablaSimbolos.buscarSimbolo(nombre);
        if (id != null && id instanceof Variable) {
            Variable variable = (Variable) id;
            variable.setInicializado(true);
        }
        super.visitAsignacion(ctx);
        return null;
    }

    @Override
    public Void visitMinExpr(MinExprContext ctx) {
        // Si se realiza una operacion algebraica se considera variable utilizada
        if (ctx.ID() != null) {
            Id id = tablaSimbolos.buscarSimbolo(ctx.ID().getText());
            if (id != null && id instanceof Variable) {
                id.setUsado(true);
            } 
        }
        super.visitMinExpr(ctx);
        return null;
    }

    @Override
    public Void visitIfor(IforContext ctx) {
        // En el caso del for nos interesa interceptarlo ya que la declaracion 
        // de variables antes del bloque deberian ser parte de un nivel inferior al principal
        tablaSimbolos.addContexto();
        for (TerminalNode idContext : ctx.declaracion().listaId().ID()) {
            Variable variable = new Variable();
            variable.setNombre(idContext.getText());
            variable.setTipoDato(ctx.declaracion().TYPE().getText());
            variable.setInicializado(true);
            variable.setUsado(true);
            tablaSimbolos.addSimbolo(variable);
        }
        super.visitIfor(ctx);
        tablaSimbolos.delContexto();
        return null;
    }

    @Override
    public Void visitBloque(BloqueContext ctx) {
        // Cuando se ingresa a un bloque, se declara un contexto nuevo
        tablaSimbolos.addContexto();
        super.visitBloque(ctx);
        String text = ctx.getText().length() > 35 ? ctx.getText().substring(0, 35) + "..." : ctx.getText();
        System.out.println("====== Contexto bloque " + text + " ======");
        tablaSimbolos.mostrarTablaSimbolos();
        System.out.println("=================================================================");
        tablaSimbolos.delContexto();
        return null;
    }

    @Override
    public Void visitPrograma(ProgramaContext ctx) {
        // Cuando se ingresa al programa se declara el contexto principal
        tablaSimbolos.addContexto();
        super.visitPrograma(ctx);
        System.out.println("======================= Contexto Programa =======================");
        tablaSimbolos.mostrarTablaSimbolos();
        System.out.println("=================================================================");
        tablaSimbolos.delContexto();
        return null;
    }
}