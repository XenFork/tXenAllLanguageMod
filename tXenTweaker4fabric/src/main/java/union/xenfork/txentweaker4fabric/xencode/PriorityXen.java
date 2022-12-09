package union.xenfork.txentweaker4fabric.xencode;

import union.xenfork.g4.XenCodeBaseVisitor;
import union.xenfork.g4.XenCodeParser;

import static union.xenfork.txentweaker4fabric.TXenTweaker4fabric.logger;

public class PriorityXen extends XenCodeBaseVisitor<Void> {
	private int priority = -1;

	@Override
	public Void visitPriority(XenCodeParser.PriorityContext ctx) {
		try {
			Integer.parseInt(ctx.INT().getText());
			priority = Integer.parseInt(ctx.INT().getText());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return null;
	}

	public int getPriority() {
		return priority;
	}
}
