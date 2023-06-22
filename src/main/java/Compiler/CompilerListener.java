// Generated from /home/luisbanegas/IdeaProjects/TC2023/src/main/java/Compiler/Compiler.g4 by ANTLR 4.9.2

package Compiler;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CompilerParser}.
 */
public interface CompilerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CompilerParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(CompilerParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link CompilerParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(CompilerParser.SContext ctx);
}