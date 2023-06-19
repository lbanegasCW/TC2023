// Generated from /home/luisbanegas/IdeaProjects/TC2023/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2
 
    package compiladores;

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
	 * Visit a parse tree produced by {@link CompilerParser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(CompilerParser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#incFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncFor(CompilerParser.IncForContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(CompilerParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#inicializacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicializacion(CompilerParser.InicializacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#incremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncremento(CompilerParser.IncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#listaid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaid(CompilerParser.ListaidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(CompilerParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#decFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecFunc(CompilerParser.DecFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#parametrosfunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametrosfunc(CompilerParser.ParametrosfuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDec(CompilerParser.DecContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(CompilerParser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#fi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFi(CompilerParser.FiContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#rof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRof(CompilerParser.RofContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#expresion_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion_bool(CompilerParser.Expresion_boolContext ctx);
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
	 * Visit a parse tree produced by {@link CompilerParser#termino}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermino(CompilerParser.TerminoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(CompilerParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(CompilerParser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(CompilerParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link CompilerParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(CompilerParser.FactorContext ctx);
}