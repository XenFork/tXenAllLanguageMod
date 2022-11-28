package union.xenfork;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import union.xenfork.g4.XenCodeLexer;
import union.xenfork.g4.XenCodeParser;

public class XenLoad {
	private int priority;
	public void loadXenScript(String str) {
		CharStream input = CharStreams.fromString(str);
		XenCodeLexer lexer = new XenCodeLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		XenCodeParser parser = new XenCodeParser(tokens);
		XenCodeParser.AllContext tree = parser.all();
		XenVisitor xv = new XenVisitor();
		xv.visitAll(tree);
		priority = xv.getPriority();
	}

	public int getPriority() {
		return priority;
	}
}
