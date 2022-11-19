// Generated from l:\Clouds\Onedrive\Mein_Konto\OneDrive\FH Bielefeld\Master\CompilerBau\Blatt01\MiniPython.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPythonParser}.
 */
public interface MiniPythonListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(MiniPythonParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(MiniPythonParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#end}.
	 * @param ctx the parse tree
	 */
	void enterEnd(MiniPythonParser.EndContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#end}.
	 * @param ctx the parse tree
	 */
	void exitEnd(MiniPythonParser.EndContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(MiniPythonParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(MiniPythonParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#funcDefBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncDefBody(MiniPythonParser.FuncDefBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#funcDefBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncDefBody(MiniPythonParser.FuncDefBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(MiniPythonParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(MiniPythonParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(MiniPythonParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(MiniPythonParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(MiniPythonParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#variableAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(MiniPythonParser.VariableAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#returnCall}.
	 * @param ctx the parse tree
	 */
	void enterReturnCall(MiniPythonParser.ReturnCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#returnCall}.
	 * @param ctx the parse tree
	 */
	void exitReturnCall(MiniPythonParser.ReturnCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#whileCall}.
	 * @param ctx the parse tree
	 */
	void enterWhileCall(MiniPythonParser.WhileCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#whileCall}.
	 * @param ctx the parse tree
	 */
	void exitWhileCall(MiniPythonParser.WhileCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void enterWhileBody(MiniPythonParser.WhileBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#whileBody}.
	 * @param ctx the parse tree
	 */
	void exitWhileBody(MiniPythonParser.WhileBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#ifCall}.
	 * @param ctx the parse tree
	 */
	void enterIfCall(MiniPythonParser.IfCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#ifCall}.
	 * @param ctx the parse tree
	 */
	void exitIfCall(MiniPythonParser.IfCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void enterIfBody(MiniPythonParser.IfBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#ifBody}.
	 * @param ctx the parse tree
	 */
	void exitIfBody(MiniPythonParser.IfBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#elifCall}.
	 * @param ctx the parse tree
	 */
	void enterElifCall(MiniPythonParser.ElifCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#elifCall}.
	 * @param ctx the parse tree
	 */
	void exitElifCall(MiniPythonParser.ElifCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#elifBody}.
	 * @param ctx the parse tree
	 */
	void enterElifBody(MiniPythonParser.ElifBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#elifBody}.
	 * @param ctx the parse tree
	 */
	void exitElifBody(MiniPythonParser.ElifBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#elseCall}.
	 * @param ctx the parse tree
	 */
	void enterElseCall(MiniPythonParser.ElseCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#elseCall}.
	 * @param ctx the parse tree
	 */
	void exitElseCall(MiniPythonParser.ElseCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#elseBody}.
	 * @param ctx the parse tree
	 */
	void enterElseBody(MiniPythonParser.ElseBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#elseBody}.
	 * @param ctx the parse tree
	 */
	void exitElseBody(MiniPythonParser.ElseBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#ifElifElse}.
	 * @param ctx the parse tree
	 */
	void enterIfElifElse(MiniPythonParser.IfElifElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#ifElifElse}.
	 * @param ctx the parse tree
	 */
	void exitIfElifElse(MiniPythonParser.IfElifElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MiniPythonParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MiniPythonParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniPythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniPythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniPythonParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniPythonParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#assertion}.
	 * @param ctx the parse tree
	 */
	void enterAssertion(MiniPythonParser.AssertionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#assertion}.
	 * @param ctx the parse tree
	 */
	void exitAssertion(MiniPythonParser.AssertionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#assertOperation}.
	 * @param ctx the parse tree
	 */
	void enterAssertOperation(MiniPythonParser.AssertOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#assertOperation}.
	 * @param ctx the parse tree
	 */
	void exitAssertOperation(MiniPythonParser.AssertOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void enterMathOperation(MiniPythonParser.MathOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#mathOperation}.
	 * @param ctx the parse tree
	 */
	void exitMathOperation(MiniPythonParser.MathOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(MiniPythonParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(MiniPythonParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#classDefBody}.
	 * @param ctx the parse tree
	 */
	void enterClassDefBody(MiniPythonParser.ClassDefBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#classDefBody}.
	 * @param ctx the parse tree
	 */
	void exitClassDefBody(MiniPythonParser.ClassDefBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(MiniPythonParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(MiniPythonParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(MiniPythonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(MiniPythonParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#integer}.
	 * @param ctx the parse tree
	 */
	void enterInteger(MiniPythonParser.IntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#integer}.
	 * @param ctx the parse tree
	 */
	void exitInteger(MiniPythonParser.IntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(MiniPythonParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(MiniPythonParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#assertOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssertOperator(MiniPythonParser.AssertOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#assertOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssertOperator(MiniPythonParser.AssertOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPythonParser#logicOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicOperator(MiniPythonParser.LogicOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPythonParser#logicOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicOperator(MiniPythonParser.LogicOperatorContext ctx);
}