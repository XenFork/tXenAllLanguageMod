package union.xenfork.txentweaker4fabric.xencode;

import org.antlr.v4.runtime.tree.ParseTree;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;
import org.reflections.util.ConfigurationBuilder;
import union.xenfork.g4.XenCodeBaseVisitor;
import union.xenfork.g4.XenCodeLexer;
import union.xenfork.g4.XenCodeParser;

import java.util.Set;

import static union.xenfork.txentweaker4fabric.TXenTweaker4fabric.logger;

public class Visit extends XenCodeBaseVisitor<Visit> {

	@Override
	public Visit visitAll(XenCodeParser.AllContext ctx) {
		for (var temp : ctx.sy()) {
			visitSy(temp);
		}
		return null;
	}

	@Override
	public Visit visitSy(XenCodeParser.SyContext ctx) {
		if (ctx.jh() != null) {
			visitJh(ctx.jh());
		} else if (ctx.field() != null) {
			visitField(ctx.field());
		} else if (ctx.add() != null) {
			visitAdd(ctx.add());
		} else if (ctx.addAll() != null) {
			visitAddAll(ctx.addAll());
		}
		return null;
	}

	@Override
	public Visit visitJh(XenCodeParser.JhContext ctx) {
		if (ctx.priority() != null && !ctx.priority().isEmpty()) {
			visitPriority(ctx.priority());
		}
		if (ctx.import_() != null && !ctx.import_().isEmpty()) {
			visitImport_(ctx.import_());
		}
		return null;
	}

	@Override
	public Visit visitPriority(XenCodeParser.PriorityContext ctx) {
		try {
			Integer.parseInt(ctx.INT().getText());
			logger.warn(String.valueOf(Integer.parseInt(ctx.INT().getText())));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return null;
	}
	public Class<?> findClazz(String className) {
		try {
			Class.forName(className);
			return Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public Visit visitImport_(XenCodeParser.Import_Context ctx) {
		Class<?> clazz;
		String id;
		if (ctx.NAME().size() == 1) {
			clazz = Runtime.getRuntime().getClass();
		}
		return super.visitImport_(ctx);
	}
}
