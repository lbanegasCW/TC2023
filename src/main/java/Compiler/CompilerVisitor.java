// Generated from /home/luisbanegas/IdeaProjects/TC2023/src/main/java/Compiler/Compiler.g4 by ANTLR 4.9.2

 package Compiler;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CompilerParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CompilerVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CompilerParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(CompilerParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(CompilerParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(CompilerParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(CompilerParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(CompilerParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(CompilerParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(CompilerParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#inicializacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion(CompilerParser.InicializacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#listaId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaId(CompilerParser.ListaIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(CompilerParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(CompilerParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRetorno(CompilerParser.RetornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#iif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIif(CompilerParser.IifContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(CompilerParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfor(CompilerParser.IforContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(CompilerParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(CompilerParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(CompilerParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#aditivo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAditivo(CompilerParser.AditivoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#multipl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipl(CompilerParser.MultiplContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#minExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinExpr(CompilerParser.MinExprContext ctx);
}