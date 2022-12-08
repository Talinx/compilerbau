import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class ControlFlowGraph<T> {
	List<T> vertices;
	List<ControlFlowGraphEdge<T>> edges;

	ControlFlowGraph() {
		this.vertices = new ArrayList<T>();
		this.edges = new ArrayList<ControlFlowGraphEdge<T>>();
	}

	void addVertice(T vertice) {
		this.vertices.add(vertice);
	}

	void addEdge(ControlFlowGraphEdge<T> edge) {
		this.edges.add(edge);
	}

	public void print() {
		System.out.println("Vertices:");
		for (int i = 0; i < vertices.size(); i++) {
			System.out.println(vertices.get(i));
		}
		System.out.println("Edges:");
		for (int i = 0; i < edges.size(); i++) {
			System.out.println(edges.get(i).toString());
		}
	}

	private static List<ASTNode> processLevel(ControlFlowGraph<List<ASTNode>> cfg, List<ASTNode> part, List<ASTNode> parentLevel, List<CallMetaInfo> ids, Stack<CallMetaInfo> functionCalls) {
		List<ASTNode> level = new ArrayList<ASTNode>();
		List<ASTNode> nextLevel;
		ASTNode currentNode;
		List<ASTNode> preparedPart = new ArrayList<ASTNode>();
		VariableAssignmentASTNode varASTNode;
		for (int i = 0; i < part.size(); i++) {
			currentNode = part.get(i);
			if (currentNode instanceof VariableAssignmentASTNode) {
				varASTNode = (VariableAssignmentASTNode) currentNode;
				preparedPart.add(varASTNode.getExpr());
			}
			preparedPart.add(currentNode);
		}
		for (int i = 0; i < preparedPart.size(); i++) {
			currentNode = preparedPart.get(i);
			if (currentNode instanceof IfASTNode) {
				nextLevel = new ArrayList<ASTNode>();
				ControlFlowGraph.processIf(cfg, (IfASTNode) currentNode, level, nextLevel, ids, functionCalls);
				cfg.addVertice(level);
				level = nextLevel;
			} else
			if (currentNode instanceof WhileASTNode) {
				nextLevel = new ArrayList<ASTNode>();
				ControlFlowGraph.processWhile(cfg, (WhileASTNode) currentNode, level, nextLevel, ids, functionCalls);
				cfg.addVertice(level);
				level = nextLevel;
			} else
			if (currentNode instanceof FunctionCallASTNode) {
				nextLevel = new ArrayList<ASTNode>();
				functionCalls.push(ControlFlowGraph.processFunctionCall(cfg, (FunctionCallASTNode) currentNode, level, nextLevel, ids, functionCalls));
				cfg.addVertice(level);
				level = nextLevel;
			} else {
				level.add(currentNode);
			}
			if (currentNode instanceof FunctionDefinitionASTNode) {
				ControlFlowGraph.processFunctionDefinition(cfg, (FunctionDefinitionASTNode) currentNode, level, ids, functionCalls);
			} else
			if (currentNode instanceof ClassASTNode) {
				ControlFlowGraph.processClassDefinition(cfg, (ClassASTNode) currentNode, level, ids, functionCalls);
			}
		}
		cfg.addVertice(level);
		return level;
	}

	private static void processIf(ControlFlowGraph<List<ASTNode>> cfg, IfASTNode ifNode, List<ASTNode> parentLevel, List<ASTNode> nextLevel, List<CallMetaInfo> ids, Stack<CallMetaInfo> functionCalls) {
		List<ASTNode> ifBody = ifNode.getBody().getContent();
		List<ASTNode> bodyLevel = ControlFlowGraph.processLevel(cfg, ifBody, parentLevel, ids, functionCalls);
		cfg.addEdge(new ControlFlowGraphEdge<List<ASTNode>>(parentLevel, bodyLevel));
		cfg.addEdge(new ControlFlowGraphEdge<List<ASTNode>>(bodyLevel, nextLevel));
		List<ElifASTNode> elifs = ifNode.getElifs();
		List<ASTNode> elifBody;
		List<ASTNode> currentElifLevel;
		for (int i = 0; i < elifs.size(); i++) {
			elifBody = elifs.get(i).getBody().getContent();
			currentElifLevel = ControlFlowGraph.processLevel(cfg, elifBody, parentLevel, ids, functionCalls);
			cfg.addEdge(new ControlFlowGraphEdge<List<ASTNode>>(parentLevel, currentElifLevel));
			cfg.addEdge(new ControlFlowGraphEdge<List<ASTNode>>(currentElifLevel, nextLevel));
		}
		ElseASTNode elsePart = ifNode.getElse();
		if (elsePart != null) {
			List<ASTNode> elseBody = elsePart.getBody().getContent();
			List<ASTNode> elseLevel = ControlFlowGraph.processLevel(cfg, elseBody, parentLevel, ids, functionCalls);
			cfg.addEdge(new ControlFlowGraphEdge<List<ASTNode>>(parentLevel, elseLevel));
			cfg.addEdge(new ControlFlowGraphEdge<List<ASTNode>>(elseLevel, nextLevel));
		}
	}

	private static void processWhile(ControlFlowGraph<List<ASTNode>> cfg, WhileASTNode whileNode, List<ASTNode> parentLevel, List<ASTNode> nextLevel, List<CallMetaInfo> ids, Stack<CallMetaInfo> functionCalls) {
		List<ASTNode> whileBody = whileNode.getBody().getContent();
		List<ASTNode> whileLevel = ControlFlowGraph.processLevel(cfg, whileBody, parentLevel, ids, functionCalls);
		cfg.addEdge(new ControlFlowGraphEdge<List<ASTNode>>(parentLevel, whileLevel));
		cfg.addEdge(new ControlFlowGraphEdge<List<ASTNode>>(whileLevel, whileLevel));
		cfg.addEdge(new ControlFlowGraphEdge<List<ASTNode>>(whileLevel, nextLevel));
	}

	private static CallMetaInfo processFunctionCall(ControlFlowGraph<List<ASTNode>> cfg, FunctionCallASTNode functionCallNode, List<ASTNode> parentLevel, List<ASTNode> nextLevel, List<CallMetaInfo> ids, Stack<CallMetaInfo> functionCalls) {
		return new CallMetaInfo(functionCallNode.getId(), parentLevel, nextLevel);
	}

	private static void processFunctionDefinition(ControlFlowGraph<List<ASTNode>> cfg, FunctionDefinitionASTNode functionDefNode, List<ASTNode> parentLevel, List<CallMetaInfo> ids, Stack<CallMetaInfo> functionCalls) {
		List<ASTNode> level = ControlFlowGraph.processLevel(cfg, functionDefNode.getBody(), null, ids, functionCalls);
		ids.add(new CallMetaInfo(functionDefNode.getId(), level));
	}

	private static void processFunctionInClassDefinition(ControlFlowGraph<List<ASTNode>> cfg, FunctionDefinitionASTNode functionDefNode, List<ASTNode> parentLevel, List<CallMetaInfo> ids, Stack<CallMetaInfo> functionCalls, IDASTNode classId) {
		List<ASTNode> level = ControlFlowGraph.processLevel(cfg, functionDefNode.getBody(), null, ids, functionCalls);
		ids.add(new CallMetaInfo(new IDASTNode(classId.classId, functionDefNode.getId().id), level));
	}

	private static void processClassDefinition(ControlFlowGraph<List<ASTNode>> cfg, ClassASTNode classDefNode, List<ASTNode> parentLevel, List<CallMetaInfo> ids, Stack<CallMetaInfo> functionCalls) {
		List<FunctionDefinitionASTNode> funcDefs = classDefNode.getFunctionDefinitons();
		for (int i = 0; i < funcDefs.size(); i++) {
			ControlFlowGraph.processFunctionInClassDefinition(cfg, funcDefs.get(i), null, ids, functionCalls, classDefNode.getId());
		}
	}

	public static ControlFlowGraph<List<ASTNode>> constructWithASTNodes(AST ast) {
		ControlFlowGraph<List<ASTNode>> output = new ControlFlowGraph<List<ASTNode>>();
		List<ASTNode> topLevelBlock = ast.getContent();
		List<CallMetaInfo> ids = new ArrayList<CallMetaInfo>();
		Stack<CallMetaInfo> functionCalls = new Stack<CallMetaInfo>();
		ControlFlowGraph.processLevel(output, topLevelBlock, null, ids, functionCalls);
		CallMetaInfo currentFunctionCall;
		List<ASTNode> toLevel;
		while (!functionCalls.empty()) {
			currentFunctionCall = functionCalls.pop();
			toLevel = null;
			for (int i = 0; i < ids.size(); i++) {
				if (ids.get(i).id.equals(currentFunctionCall.id)) {
					toLevel = ids.get(i).from;
				}
			}
			if (toLevel != null) {
				output.addEdge(new ControlFlowGraphEdge<List<ASTNode>>(currentFunctionCall.from, toLevel));
				output.addEdge(new ControlFlowGraphEdge<List<ASTNode>>(toLevel, currentFunctionCall.nextLevel));
			} else {
				System.err.print("Skipping function call, vertice not found: ");
				currentFunctionCall.id.print(0);
			}
		}
		return output;
	}
}
