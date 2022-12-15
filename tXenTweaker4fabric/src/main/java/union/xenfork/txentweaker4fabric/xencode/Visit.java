package union.xenfork.txentweaker4fabric.xencode;

import org.reflections.Reflections;
import union.xenfork.g4.XenCodeBaseVisitor;
import union.xenfork.g4.XenCodeParser;

import java.util.HashMap;
import java.util.Map;

import static union.xenfork.txentweaker4fabric.TXenTweaker4fabric.logger;

public class Visit extends XenCodeBaseVisitor<Visit> {
	private final Map<String, Class<?>> stringClassMap = new HashMap<>();

	public Map<String, Class<?>> getStringClassMap() {
		return stringClassMap;
	}



	@Override
	public Visit visitSy(XenCodeParser.SyContext ctx) {
		if (ctx.jh() != null) {
			visitJh(ctx.jh());
		} else if (ctx.m() != null) {
			visitM(ctx.m());
		} else if (ctx.field() != null) {
			visitField(ctx.field());
		} else if (ctx.fieldA() != null) {
			visitFieldA(ctx.fieldA());
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
	//#带有的import代码在下面
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
	@Override
	public Visit visitImport_(XenCodeParser.Import_Context ctx) {
		String[] cName = ctx.CLASSNAME().toString().split("\\.");
		stringClassMap.put(
				ctx.NAME() != null ? ctx.NAME().toString() : cName[cName.length - 1],
				new Reflections().forClass(ctx.CLASSNAME().toString()));
		return null;
	}



	//只写一遍无需改动放下面
	@Override
	public Visit visitAll(XenCodeParser.AllContext ctx) {
		for (var temp : ctx.sy()) {
			visitSy(temp);
		}
		return null;
	}
}
