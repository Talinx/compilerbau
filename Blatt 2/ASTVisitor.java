import java.util.ArrayList;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.RuleNode;

public class ASTVisitor implements MiniPythonVisitor<ASTNode> {
	@Override
	public ASTNode visit(ParseTree tree) {
		// should not be called
		return new AST(new ArrayList<ASTNode>());
	}

	@Override
	public ASTNode visitStartbuildingblock(MiniPythonParser.StartbuildingblockContext ctx) {
		var statementCtx = ctx.statement();
		if (statementCtx != null) {
			return this.visitStatement(statementCtx);
		}
		var deffuncCtx = ctx.deffunc();
		if (deffuncCtx != null) {
			return this.visitDeffunc(deffuncCtx);
		}
		var classDefCtx = ctx.classDef();
		if (classDefCtx != null) {
			return this.visitClassDef(classDefCtx);
		}
		var ifElifElseCtx = ctx.ifElifElse();
		if (ifElifElseCtx != null) {
			return this.visitIfElifElse(ifElifElseCtx);
		}
		var whileCallCtx = ctx.whileCall();
		return this.visitWhileCall(whileCallCtx);
	}

	@Override
	public ASTNode visitStart(MiniPythonParser.StartContext ctx) {
		var buildingBlockCount = ctx.startbuildingblock().size();
		var buildingBlocks = new ArrayList<ASTNode>(buildingBlockCount);
		for (int i = 0; i < buildingBlockCount; i++) {
			var subCtx = ctx.startbuildingblock(i);
			var node = this.visitStartbuildingblock(subCtx);
			buildingBlocks.add(i, node);
		}
		return new AST(buildingBlocks);
	}

	@Override
	public ASTNode visitStartfile(MiniPythonParser.StartfileContext ctx) {
		var buildingBlockCount = ctx.startbuildingblock().size();
		var buildingBlocks = new ArrayList<ASTNode>(buildingBlockCount);
		for (int i = 0; i < buildingBlockCount; i++) {
			var subCtx = ctx.startbuildingblock(i);
			var node = this.visitStartbuildingblock(subCtx);
			buildingBlocks.add(i, node);
		}
		return new AST(buildingBlocks);
	}

	@Override
	public ASTNode visitLiteral(MiniPythonParser.LiteralContext ctx) {
		var intLiteral = ctx.INTLITERAL();
		if (intLiteral != null) {
			return new IntLiteralASTNode(intLiteral.getSymbol().getText());
		}
		var stringLiteral = ctx.STRINGLITERAL();
		if (stringLiteral != null) {
			var strText = stringLiteral.getSymbol().getText();
			var textWithoutQuotes = strText.substring(1, strText.length() - 1);
			return new StringLiteralASTNode(textWithoutQuotes);
		}
		var booleanLiteral = ctx.BOOLEANLITERAL();
		var booleanLiteralText = booleanLiteral.getSymbol().getText();
		if (booleanLiteralText.equals("True")) {
			return new BooleanLiteralASTNode(true);
		}
		return new BooleanLiteralASTNode(false);
	}

	@Override
	public ASTNode visitEllipsis(MiniPythonParser.EllipsisContext ctx) {
		return new EllipsisASTNode();
	}

	@Override
	public ASTNode visitStatement(MiniPythonParser.StatementContext ctx) {
		var ellipsisCtx = ctx.ellipsis();
		if (ellipsisCtx != null) {
			return this.visitEllipsis(ellipsisCtx);
		}
		var classDefCtx = ctx.classDef();
		if (classDefCtx != null) {
			return this.visitClassDef(classDefCtx);
		}
		var deffuncCtx = ctx.deffunc();
		if (deffuncCtx != null) {
			return this.visitDeffunc(deffuncCtx);
		}
		var variableAssignmentCtx = ctx.variableAssignment();
		if (variableAssignmentCtx != null) {
			return this.visitVariableAssignment(variableAssignmentCtx);
		}
		var ifElifElseCtx = ctx.ifElifElse();
		if (ifElifElseCtx != null) {
			return this.visitIfElifElse(ifElifElseCtx);
		}
		var whileCallCtx = ctx.whileCall();
		if (whileCallCtx != null) {
			return this.visitWhileCall(whileCallCtx);
		}
		var exprCtx = ctx.expr();
		if (exprCtx != null) {
			return this.visitExpr(exprCtx);
		}
		return new PassASTNode();
	}

	@Override
	public ASTNode visitBody(MiniPythonParser.BodyContext ctx) {
		var count = ctx.statement().size();
		var statements = new ArrayList<ASTNode>(count);
		for (int i = 0; i < count; i++) {
			var statementNode = this.visitStatement(ctx.statement(i));
			statements.add(i, statementNode);
		}
		return new BodyASTNode(statements);
	}

	@Override
	public ASTNode visitClassDef(MiniPythonParser.ClassDefContext ctx) {
		var id = ctx.ID(0);
		var idNode = new IDASTNode(id.getSymbol());
		IDASTNode superIdNode = null;
		if (ctx.ID().size() == 2) {
			var superId = ctx.ID(1);
			superIdNode = new IDASTNode(superId.getSymbol());
		}
		var variablesCount = ctx.variableAssignment().size();
		var variables = new ArrayList<VariableAssignmentASTNode>(variablesCount);
		for (int i = 0; i < variablesCount; i++) {
			var variableCtx = ctx.variableAssignment(i);
			var variableNode = (VariableAssignmentASTNode) this.visitVariableAssignment(variableCtx);
			variables.add(i, variableNode);
		}
		var functionsCount = ctx.deffunc().size();
		var functions = new ArrayList<FunctionDefinitionASTNode>(functionsCount);
		for (int i = 0; i < functionsCount; i++) {
			var functionCtx = ctx.deffunc(i);
			var functionNode = (FunctionDefinitionASTNode) this.visitDeffunc(functionCtx);
			functions.add(i, functionNode);
		}
		return new ClassASTNode(idNode, superIdNode, variables, functions);
	}

	@Override
	public ASTNode visitClassid(MiniPythonParser.ClassidContext ctx) {
		var classId = ctx.ID(0);
		var id = ctx.ID(1);
		return new IDASTNode(classId.getSymbol(), id.getSymbol());
	}

	@Override
	public ASTNode visitVariableAssignment(MiniPythonParser.VariableAssignmentContext ctx) {
		var exprCtx = ctx.expr();
		var exprNode = this.visitExpr(exprCtx);
		if (ctx.ID().size() == 1) {
			var id = ctx.ID(0);
			var idNode = new IDASTNode(id.getSymbol());
			return new VariableAssignmentASTNode(idNode, exprNode);
		}
		var classId = ctx.ID(0);
		var id = ctx.ID(1);
		var idNode = new IDASTNode(classId.getSymbol(), id.getSymbol());
		return new VariableAssignmentASTNode(idNode, exprNode);
	}

	@Override
	public ASTNode visitParameterdecl(MiniPythonParser.ParameterdeclContext ctx) {
		var count = ctx.ID().size();
		var parameters = new ArrayList<ParameterASTNode>(count);
		for (int i = 0; i < count; i++) {
			var idNode = new IDASTNode(ctx.ID(i).getSymbol());
			var parameterNode = new ParameterASTNode(idNode);
			parameters.add(i, parameterNode);
		}
		return new ParametersASTNode(parameters);
	}

	@Override
	public ASTNode visitDeffunccontent(MiniPythonParser.DeffunccontentContext ctx) {
        var count = ctx.statement().size();
		var statements = new ArrayList<ASTNode>(count);
		for (int i = 0; i < count; i++) {
			var statementNode = this.visitStatement(ctx.statement(i));
			statements.add(i, statementNode);
		}

		var exprCtx = ctx.expr();
		ASTNode returnExprNode = null;
		if (exprCtx != null) {
			returnExprNode = this.visitExpr(exprCtx);
		}

		return new FunctionContentASTNode(statements, returnExprNode);
	}

	@Override
	public ASTNode visitDeffunc(MiniPythonParser.DeffuncContext ctx) {
		var id = ctx.ID();
		var idNode = new IDASTNode(id.getSymbol());
		var parameterCtx = ctx.parameterdecl();
		var parametersNode = (ParametersASTNode) this.visitParameterdecl(parameterCtx);
		var contentCtx = ctx.deffunccontent();
		var contentNode = (FunctionContentASTNode) this.visitDeffunccontent(contentCtx);
		return new FunctionDefinitionASTNode(idNode, parametersNode, contentNode);
	}

	@Override
	public ASTNode visitParametercall(MiniPythonParser.ParametercallContext ctx) {
		var count = ctx.expr().size();
		var arguments = new ArrayList<ASTNode>(count);
		for (int i = 0; i < count; i++) {
			var exprCtx = ctx.expr(i);
			var exprNode = this.visitExpr(exprCtx);
			arguments.add(i, exprNode);
		}
		return new ArgumentsASTNode(arguments);
	}

	@Override
	public ASTNode visitFunccall(MiniPythonParser.FunccallContext ctx) {
		var id = ctx.ID();
		var idNode = new IDASTNode(id.getSymbol());
		var argumentsCtx = ctx.parametercall();
		var argumentsNode = (ArgumentsASTNode) this.visitParametercall(argumentsCtx);
		return new FunctionCallASTNode(idNode, argumentsNode);
	}

	@Override
	public ASTNode visitClassfunccall(MiniPythonParser.ClassfunccallContext ctx) {
		var classId = ctx.ID(0);
		var id = ctx.ID(1);
		var idNode = new IDASTNode(classId.getSymbol(), id.getSymbol());
		var argumentsCtx = ctx.parametercall();
		var argumentsNode = (ArgumentsASTNode) this.visitParametercall(argumentsCtx);
		return new FunctionCallASTNode(idNode, argumentsNode);
	}

	@Override
	public ASTNode visitIfElifElse(MiniPythonParser.IfElifElseContext ctx) {
		var exprCtx = ctx.expr();
		var exprNode = this.visitExpr(exprCtx);
		var bodyCtx = ctx.body();
		var bodyNode = (BodyASTNode) this.visitBody(bodyCtx);
		var elifsCount = ctx.elif().size();
		var elifs = new ArrayList<ElifASTNode>(elifsCount);
		for (int i = 0; i < elifsCount; i++) {
			var elifCtx = ctx.elif(i);
			var elifNode = (ElifASTNode) this.visitElif(elifCtx);
			elifs.add(i, elifNode);
		}
		var elseCtx = ctx.elses();
		ElseASTNode elseNode = null;
		if (elseCtx != null) {
			elseNode = (ElseASTNode) this.visitElses(elseCtx);
		}
		return new IfASTNode(exprNode, bodyNode, elifs, elseNode);
	}

	@Override
	public ASTNode visitElif(MiniPythonParser.ElifContext ctx) {
		var exprCtx = ctx.expr();
		var exprNode = this.visitExpr(exprCtx);
		var bodyCtx = ctx.body();
		var bodyNode = (BodyASTNode) this.visitBody(bodyCtx);
		return new ElifASTNode(exprNode, bodyNode);
	}

	@Override
	public ASTNode visitElses(MiniPythonParser.ElsesContext ctx) {
		var bodyCtx = ctx.body();
		var bodyNode = (BodyASTNode) this.visitBody(bodyCtx);
		return new ElseASTNode(bodyNode);
	}

	@Override
	public ASTNode visitWhileCall(MiniPythonParser.WhileCallContext ctx) {
		var exprCtx = ctx.expr();
		var exprNode = this.visitExpr(exprCtx);
		var bodyCtx = ctx.body();
		var bodyNode = (BodyASTNode) this.visitBody(bodyCtx);
		return new WhileASTNode(exprNode, bodyNode);
	}

	@Override
	public ASTNode visitBaseexpr(MiniPythonParser.BaseexprContext ctx) {
		var literalCtx = ctx.literal();
		if (literalCtx != null) {
			return this.visitLiteral(literalCtx);
		}
		var funccallCtx = ctx.funccall();
		if (funccallCtx != null) {
			return this.visitFunccall(funccallCtx);
		}
		var classfunccallCtx = ctx.classfunccall();
		if (classfunccallCtx != null) {
			return this.visitClassfunccall(classfunccallCtx);
		}
		var classidCtx = ctx.classid();
		if (classidCtx != null) {
			return this.visitClassid(classidCtx);
		}
		var exprCtx = ctx.expr();
		if (exprCtx != null) {
			return this.visitExpr(exprCtx);
		}
		var id = ctx.ID();
		return new IDASTNode(id.getSymbol());
	}

	@Override
	public ASTNode visitOpadd(MiniPythonParser.OpaddContext ctx) {
		var count = ctx.baseexpr().size();
		if (count == 1) {
			return this.visitBaseexpr(ctx.baseexpr(0));
		}
		/*
		visit A +- B +- C in such a way:
				+-
			/		\
			A		+-
				/		\
				B		C
		*/
		ASTNode output = null;
		var lastCtx = ctx.baseexpr(count - 1);
		var secondToLastCtx = ctx.baseexpr(count - 2);
		var lastNode = this.visitBaseexpr(lastCtx);
		var secondToLastNode = this.visitBaseexpr(secondToLastCtx);
		var currentOperator = ctx.MATHADDSUB(count - 2).getSymbol().getText();
		switch (currentOperator) {
		case "+":
			output = new PlusASTNode(secondToLastNode, lastNode);
			break;
		case "-":
			output = new MinusASTNode(secondToLastNode, lastNode);
			break;
		}
		for (int i = (count - 3); i >= 0; i--) {
			var currentCtx = ctx.baseexpr(i);
			var currentNode = this.visitBaseexpr(currentCtx);
			currentOperator = ctx.MATHADDSUB(i).getSymbol().getText();
			switch (currentOperator) {
			case "+":
				output = new PlusASTNode(currentNode, output);
				break;
			case "-":
				output = new MinusASTNode(currentNode, output);
				break;
			}
		}
		return output;
	}

	@Override
	public ASTNode visitOpmul(MiniPythonParser.OpmulContext ctx) {
		var exprCtx = ctx.expr();
		if (exprCtx != null) {
			return this.visitExpr(exprCtx);
		}
		var count = ctx.opadd().size();
		if (count == 1) {
			return this.visitOpadd(ctx.opadd(0));
		}
		/*
		visit A * B * C in such a way:
				*
			/		\
			A		*
				/		\
				B		C
		*/
		ASTNode output = null;
		var lastCtx = ctx.opadd(count - 1);
		var secondToLastCtx = ctx.opadd(count - 2);
		var lastNode = this.visitOpadd(lastCtx);
		var secondToLastNode = this.visitOpadd(secondToLastCtx);
		var currentOperator = ctx.MATHMULDIV(count - 2).getSymbol().getText();
		switch (currentOperator) {
		case "*":
			output = new MulASTNode(secondToLastNode, lastNode);
			break;
		case "/":
			output = new DivASTNode(secondToLastNode, lastNode);
			break;
		}
		for (int i = (count - 3); i >= 0; i--) {
			var currentCtx = ctx.opadd(i);
			var currentNode = this.visitOpadd(currentCtx);
			currentOperator = ctx.MATHMULDIV(i).getSymbol().getText();
			switch (currentOperator) {
			case "*":
				output = new MulASTNode(currentNode, output);
				break;
			case "/":
				output = new DivASTNode(currentNode, output);
				break;
			}
		}
		return output;
	}

	@Override
	public ASTNode visitOpcompare(MiniPythonParser.OpcompareContext ctx) {
		var exprCtx = ctx.expr();
		if (exprCtx != null) {
			return this.visitExpr(exprCtx);
		}
		var count = ctx.opmul().size();
		if (count == 1) {
			return this.visitOpmul(ctx.opmul(0));
		}
		/*
		visit A CMP B CMP C in such a way:
				CMP
			/		\
			A		CMP
				/		\
				B		C
		*/
		ASTNode output = null;
		var lastCtx = ctx.opmul(count - 1);
		var secondToLastCtx = ctx.opmul(count - 2);
		var lastNode = this.visitOpmul(lastCtx);
		var secondToLastNode = this.visitOpmul(secondToLastCtx);
		var currentOperator = ctx.ASSERTOPERATOR(count - 2).getSymbol().getText();
		switch (currentOperator) {
		case "==":
			output = new EqualsASTNode(secondToLastNode, lastNode);
			break;
		case "!=":
			output = new NotEqualsASTNode(secondToLastNode, lastNode);
			break;
		case "<":
			output = new LessASTNode(secondToLastNode, lastNode);
			break;
		case ">":
			output = new GreaterASTNode(secondToLastNode, lastNode);
			break;
		case "<=":
			output = new LessEqualsASTNode(secondToLastNode, lastNode);
			break;
		case ">=":
			output = new GreaterEqualsASTNode(secondToLastNode, lastNode);
			break;
		}
		for (int i = (count - 3); i >= 0; i--) {
			var currentCtx = ctx.opmul(i);
			var currentNode = this.visitOpmul(currentCtx);
			currentOperator = ctx.ASSERTOPERATOR(i).getSymbol().getText();
			switch (currentOperator) {
			case "==":
				output = new EqualsASTNode(currentNode, output);
				break;
			case "!=":
				output = new NotEqualsASTNode(currentNode, output);
				break;
			case "<":
				output = new LessASTNode(currentNode, output);
				break;
			case ">":
				output = new GreaterASTNode(currentNode, output);
				break;
			case "<=":
				output = new LessEqualsASTNode(currentNode, output);
				break;
			case ">=":
				output = new GreaterEqualsASTNode(currentNode, output);
				break;
			}
		}
		return output;
	}

	@Override
	public ASTNode visitOpand(MiniPythonParser.OpandContext ctx) {
		var exprCtx = ctx.expr();
		if (exprCtx != null) {
			return this.visitExpr(exprCtx);
		}
		var count = ctx.opcompare().size();
		if (count == 1) {
			return this.visitOpcompare(ctx.opcompare(0));
		}
		/*
		visit A AND B AND C in such a way:
				AND
			/		\
			A		AND
				/		\
				B		C
		*/
		AndASTNode output = null;
		var lastCtx = ctx.opcompare(count - 1);
		var secondToLastCtx = ctx.opcompare(count - 2);
		var lastNode = this.visitOpcompare(lastCtx);
		var secondToLastNode = this.visitOpcompare(secondToLastCtx);
		output = new AndASTNode(secondToLastNode, lastNode);
		for (int i = (count - 3); i >= 0; i--) {
			var currentCtx = ctx.opcompare(i);
			var currentNode = this.visitOpcompare(currentCtx);
			output = new AndASTNode(currentNode, output);
		}
		return output;
	}

	@Override
	public ASTNode visitOpdisjunction(MiniPythonParser.OpdisjunctionContext ctx) {
		var exprCtx = ctx.expr();
		if (exprCtx != null) {
			return this.visitExpr(exprCtx);
		}
		var count = ctx.opand().size();
		if (count == 1) {
			return this.visitOpand(ctx.opand(0));
		}
		/*
		visit A OR B OR C in such a way:
				OR
			/		\
			A		OR
				/		\
				B		C
		*/
		OrASTNode output = null;
		var lastCtx = ctx.opand(count - 1);
		var secondToLastCtx = ctx.opand(count - 2);
		var lastNode = this.visitOpand(lastCtx);
		var secondToLastNode = this.visitOpand(secondToLastCtx);
		output = new OrASTNode(secondToLastNode, lastNode);
		for (int i = (count - 3); i >= 0; i--) {
			var currentCtx = ctx.opand(i);
			var currentNode = this.visitOpand(currentCtx);
			output = new OrASTNode(currentNode, output);
		}
		return output;
	}

	@Override
	public ASTNode visitOpnot(MiniPythonParser.OpnotContext ctx) {
		var opdisjunctionCtx = ctx.opdisjunction();
		if (opdisjunctionCtx != null) {
			return this.visitOpdisjunction(opdisjunctionCtx);
		}
		var opnotCtx = ctx.opnot();
		var opnotNode = this.visitOpnot(opnotCtx);
		return new NotASTNode(opnotNode);
	}

	@Override
	public ASTNode visitExpr(MiniPythonParser.ExprContext ctx) {
		var funccallCtx = ctx.funccall();
		if (funccallCtx != null) {
			return this.visitFunccall(funccallCtx);
		}
		var exprCtx = ctx.expr();
		if (exprCtx != null) {
			return this.visitExpr(exprCtx);
		}
		var opnotCtx = ctx.opnot();
		return this.visitOpnot(opnotCtx);
	}

	@Override
	public ASTNode visitErrorNode(ErrorNode node) {
		// should not be called
		return new AST(new ArrayList<ASTNode>());
	}

	@Override
	public ASTNode visitTerminal(TerminalNode node) {
		// should not be called
		return new AST(new ArrayList<ASTNode>());
	}

	@Override
	public ASTNode visitChildren(RuleNode node) {
		// should not be called
		return new AST(new ArrayList<ASTNode>());
	}
}
