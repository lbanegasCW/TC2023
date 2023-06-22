// Generated from /home/luisbanegas/IdeaProjects/TC2023/src/main/java/Compiler/Compiler.g4 by ANTLR 4.9.2

 package Compiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilerParser}.
 */
public interface CompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilerParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpecifier(CompilerParser.TypeSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#typeSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpecifier(CompilerParser.TypeSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(CompilerParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(CompilerParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(CompilerParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(CompilerParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(CompilerParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(CompilerParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(CompilerParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(CompilerParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(CompilerParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(CompilerParser.DeclaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(CompilerParser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(CompilerParser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#incremento}.
	 * @param ctx the parse tree
	 */
	void enterIncremento(CompilerParser.IncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#incremento}.
	 * @param ctx the parse tree
	 */
	void exitIncremento(CompilerParser.IncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void enterInicializacion(CompilerParser.InicializacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#inicializacion}.
	 * @param ctx the parse tree
	 */
	void exitInicializacion(CompilerParser.InicializacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#listaId}.
	 * @param ctx the parse tree
	 */
	void enterListaId(CompilerParser.ListaIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#listaId}.
	 * @param ctx the parse tree
	 */
	void exitListaId(CompilerParser.ListaIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(CompilerParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(CompilerParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#iif}.
	 * @param ctx the parse tree
	 */
	void enterIif(CompilerParser.IifContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#iif}.
	 * @param ctx the parse tree
	 */
	void exitIif(CompilerParser.IifContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(CompilerParser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(CompilerParser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#ifor}.
	 * @param ctx the parse tree
	 */
	void enterIfor(CompilerParser.IforContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#ifor}.
	 * @param ctx the parse tree
	 */
	void exitIfor(CompilerParser.IforContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(CompilerParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(CompilerParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(CompilerParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(CompilerParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(CompilerParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(CompilerParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#aditivo}.
	 * @param ctx the parse tree
	 */
	void enterAditivo(CompilerParser.AditivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#aditivo}.
	 * @param ctx the parse tree
	 */
	void exitAditivo(CompilerParser.AditivoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#multipl}.
	 * @param ctx the parse tree
	 */
	void enterMultipl(CompilerParser.MultiplContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#multipl}.
	 * @param ctx the parse tree
	 */
	void exitMultipl(CompilerParser.MultiplContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#minExpr}.
	 * @param ctx the parse tree
	 */
	void enterMinExpr(CompilerParser.MinExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#minExpr}.
	 * @param ctx the parse tree
	 */
	void exitMinExpr(CompilerParser.MinExprContext ctx);
}