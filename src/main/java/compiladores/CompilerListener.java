// Generated from /home/luisbanegas/IdeaProjects/TC2023/src/main/java/compiladores/compiladores.g4 by ANTLR 4.9.2
 
package compiladores;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilerParser}.
 */
public interface CompilerListener extends ParseTreeListener {
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
	 * Enter a parse tree produced by {@link CompilerParser#incFor}.
	 * @param ctx the parse tree
	 */
	void enterIncFor(CompilerParser.IncForContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#incFor}.
	 * @param ctx the parse tree
	 */
	void exitIncFor(CompilerParser.IncForContext ctx);
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
	 * Enter a parse tree produced by {@link CompilerParser#listaid}.
	 * @param ctx the parse tree
	 */
	void enterListaid(CompilerParser.ListaidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#listaid}.
	 * @param ctx the parse tree
	 */
	void exitListaid(CompilerParser.ListaidContext ctx);
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
	 * Enter a parse tree produced by {@link CompilerParser#decFunc}.
	 * @param ctx the parse tree
	 */
	void enterDecFunc(CompilerParser.DecFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#decFunc}.
	 * @param ctx the parse tree
	 */
	void exitDecFunc(CompilerParser.DecFuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#parametrosfunc}.
	 * @param ctx the parse tree
	 */
	void enterParametrosfunc(CompilerParser.ParametrosfuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#parametrosfunc}.
	 * @param ctx the parse tree
	 */
	void exitParametrosfunc(CompilerParser.ParametrosfuncContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDec(CompilerParser.DecContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDec(CompilerParser.DecContext ctx);
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
	 * Enter a parse tree produced by {@link CompilerParser#fi}.
	 * @param ctx the parse tree
	 */
	void enterFi(CompilerParser.FiContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#fi}.
	 * @param ctx the parse tree
	 */
	void exitFi(CompilerParser.FiContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#rof}.
	 * @param ctx the parse tree
	 */
	void enterRof(CompilerParser.RofContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#rof}.
	 * @param ctx the parse tree
	 */
	void exitRof(CompilerParser.RofContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#expresion_bool}.
	 * @param ctx the parse tree
	 */
	void enterExpresion_bool(CompilerParser.Expresion_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#expresion_bool}.
	 * @param ctx the parse tree
	 */
	void exitExpresion_bool(CompilerParser.Expresion_boolContext ctx);
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
	 * Enter a parse tree produced by {@link CompilerParser#termino}.
	 * @param ctx the parse tree
	 */
	void enterTermino(CompilerParser.TerminoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#termino}.
	 * @param ctx the parse tree
	 */
	void exitTermino(CompilerParser.TerminoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(CompilerParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(CompilerParser.ExpContext ctx);
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
	 * Enter a parse tree produced by {@link CompilerParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(CompilerParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(CompilerParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link CompilerParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(CompilerParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(CompilerParser.FactorContext ctx);
}