// Generated from SomeLanguage.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SomeLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SomeLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(SomeLanguageParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(SomeLanguageParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(SomeLanguageParser.VariableDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(SomeLanguageParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(SomeLanguageParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SomeLanguageParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SomeLanguageParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SomeLanguageParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SomeLanguageParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#logicalEquation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalEquation(SomeLanguageParser.LogicalEquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#printfCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintfCall(SomeLanguageParser.PrintfCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeLanguageParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SomeLanguageParser.LineContext ctx);
}