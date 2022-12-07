package union.xenfork.txentweaker4fabric.xencode;

import org.antlr.v4.runtime.tree.ParseTree;
import union.xenfork.g4.XenCodeBaseVisitor;
import union.xenfork.g4.XenCodeParser;

import static union.xenfork.txentweaker4fabric.TXenTweaker4fabric.logger;

public class Visit extends XenCodeBaseVisitor<Visit> {
	@Override
	public Visit visit(ParseTree tree) {
		if (tree.getChildCount() == 0) {
			return null;
		}
		for (int i = 0; i < tree.getChildCount(); i++) {
			visit(tree.getChild(i));
			logger.info(tree.getChild(i).toStringTree());
		}
		return null;
	}
}
