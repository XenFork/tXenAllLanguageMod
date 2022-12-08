package union.xenfork;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.TerminalNode;
import union.xenfork.g4.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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
		xv.val.forEach((s, o) -> {
			if (o instanceof XenVisitor.Record record) {
				System.out.println(record.className() + " " + s + " = " + record.value());
			} else if (o instanceof XenVisitor.Record_ record) {
				System.out.println(record.className() + " " + s + " = " + record.value());
			}
		});
		parser.stringMap.forEach((s, s2) -> {
			System.out.println(s + " " + s2);
		});
		parser.integerMap.forEach((s, integer) -> {
			System.out.println(s + " " + integer);
		});



	}

	public void loadPriority(String str) {
		CharStream input = CharStreams.fromString(str);
		XenCodeLexer lexer = new XenCodeLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		XenCodeParser parser = new XenCodeParser(tokens);
		XenCodeParser.PriorityContext tree = parser.priority();
		PriorityVisitor pv = new PriorityVisitor();
		pv.visitPriority(tree);
		priority = pv.getPriority();
	}

	public int getPriority() {
		return priority;
	}
}
