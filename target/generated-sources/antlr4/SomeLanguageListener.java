// Generated from SomeLanguage.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SomeLanguageParser}.
 */
public interface SomeLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SomeLanguageParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SomeLanguageParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(SomeLanguageParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(SomeLanguageParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SomeLanguageParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SomeLanguageParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(SomeLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(SomeLanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(SomeLanguageParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(SomeLanguageParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SomeLanguageParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SomeLanguageParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(SomeLanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(SomeLanguageParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SomeLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SomeLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SomeLanguageParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SomeLanguageParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#logicalEquation}.
	 * @param ctx the parse tree
	 */
	void enterLogicalEquation(SomeLanguageParser.LogicalEquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#logicalEquation}.
	 * @param ctx the parse tree
	 */
	void exitLogicalEquation(SomeLanguageParser.LogicalEquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#printfCall}.
	 * @param ctx the parse tree
	 */
	void enterPrintfCall(SomeLanguageParser.PrintfCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#printfCall}.
	 * @param ctx the parse tree
	 */
	void exitPrintfCall(SomeLanguageParser.PrintfCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeLanguageParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(SomeLanguageParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeLanguageParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(SomeLanguageParser.LineContext ctx);
}