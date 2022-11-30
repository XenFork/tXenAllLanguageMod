package union.xenfork;

import union.xenfork.g4.XenCodeBaseVisitor;
import union.xenfork.g4.XenCodeParser;

public class PriorityVisitor extends XenCodeBaseVisitor<Void> {
	private int priority = -1;
	@Override
	public Void visitPriority(XenCodeParser.PriorityContext ctx) {
		if (ctx.INT() != null) {
			priority = Integer.parseInt(ctx.INT().toString());
		}
		return super.visitPriority(ctx);
	}

	public int getPriority() {
		return priority;
	}
}
