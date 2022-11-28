package union.xenfork;

import union.xenfork.g4.XenCodeBaseVisitor;
import union.xenfork.g4.XenCodeParser;

import java.util.HashMap;
import java.util.Map;

public class XenVisitor extends XenCodeBaseVisitor<Void> {
	private int priority = -1;
	public Map<String, TXen.Record> val = new HashMap<>();//局部变量
	//第一个string表示name 第二个string表示int val之类的头， Object存各类参数

	@Override
	public Void visitAll(XenCodeParser.AllContext ctx) {
		if (!ctx.all().isEmpty()) {
			visitAll(ctx.all());
		} else if (!ctx.allField().isEmpty()) {
			visitAllField(ctx.allField());
		} else if (!ctx.allMethod().isEmpty()) {
			visitAllMethod(ctx.allMethod());
		}
		return super.visitAll(ctx);
	}

	@Override
	public Void visitAllField(XenCodeParser.AllFieldContext ctx) {
		if (!ctx.allField().isEmpty()) {
			visitAllField(ctx.allField());
		} else if (!ctx.tmp().isEmpty()) {
			visitTmp(ctx.tmp());
		}
		return super.visitAllField(ctx);
	}

	@Override
	public Void visitTmp(XenCodeParser.TmpContext ctx) {
		if (!ctx.boolean_().isEmpty()) visitBoolean(ctx.boolean_());
		else if (!ctx.booleans().isEmpty()) visitBooleans(ctx.booleans());
		else if (!ctx.double_().isEmpty()) visitDouble(ctx.double_());
		else if (!ctx.doubles().isEmpty()) visitDoubles(ctx.doubles());
		else if (!ctx.float_().isEmpty()) visitFloat(ctx.float_());
		else if (!ctx.floats().isEmpty()) visitFloats(ctx.floats());
		else if (!ctx.int_().isEmpty()) visitInt(ctx.int_());
		else if (!ctx.ints().isEmpty()) visitInts(ctx.ints());
		else if (!ctx.long_().isEmpty()) visitLong(ctx.long_());
		else if (!ctx.longs().isEmpty()) visitLongs(ctx.longs());
		else if (!ctx.str().isEmpty()) visitStr(ctx.str());
		else if (!ctx.strings().isEmpty()) visitStrings(ctx.strings());
		else if (!ctx.val().isEmpty()) visitVal(ctx.val());
		else if (!ctx.var().isEmpty()) visitVar(ctx.var());
		else if (!ctx.imports().isEmpty()) {
			val.put(ctx.imports().NAME(0).toString(), new TXen.Record("import", ctx.imports().NAME(1)));
		}
		return super.visitTmp(ctx);
	}

	@Override
	public Void visitBoolean(XenCodeParser.BooleanContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("bool", ctx.BOOL()));
		return super.visitBoolean(ctx);
	}

	@Override
	public Void visitBooleans(XenCodeParser.BooleansContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("booleans", ctx.BOOL()));
		return super.visitBooleans(ctx);
	}

	@Override
	public Void visitDouble(XenCodeParser.DoubleContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("double", ctx.DOUBLE()));
		return super.visitDouble(ctx);
	}

	@Override
	public Void visitDoubles(XenCodeParser.DoublesContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("doubles", ctx.DOUBLE()));
		return super.visitDoubles(ctx);
	}

	@Override
	public Void visitFloat(XenCodeParser.FloatContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("float", ctx.FLOAT()));
		return super.visitFloat(ctx);
	}

	@Override
	public Void visitFloats(XenCodeParser.FloatsContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("floats", ctx.FLOAT()));
		return super.visitFloats(ctx);
	}

	@Override
	public Void visitInt(XenCodeParser.IntContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("int", ctx.INT()));
		return super.visitInt(ctx);
	}

	@Override
	public Void visitInts(XenCodeParser.IntsContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("ints", ctx.INT()));
		return super.visitInts(ctx);
	}

	@Override
	public Void visitLong(XenCodeParser.LongContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("long", ctx.LONG()));
		return super.visitLong(ctx);
	}

	@Override
	public Void visitLongs(XenCodeParser.LongsContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("longs", ctx.LONG()));
		return super.visitLongs(ctx);
	}

	@Override
	public Void visitStr(XenCodeParser.StrContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("string", ctx.STRING()));
		return super.visitStr(ctx);
	}

	@Override
	public Void visitStrings(XenCodeParser.StringsContext ctx) {
		val.put(ctx.NAME().toString(), new TXen.Record("strings", ctx.STRING()));
		return super.visitStrings(ctx);
	}

	@Override
	public Void visitImports(XenCodeParser.ImportsContext ctx) {
		if (!ctx.NAME().isEmpty()) {
			val.put(ctx.NAME(0).toString(), new TXen.Record("import", ctx.NAME(1)));
		} else {
			priority = ctx.INT().getChildCount();
		}
		return super.visitImports(ctx);
	}

	@Override
	public Void visitVal(XenCodeParser.ValContext ctx) {
		if (!ctx.BOOL().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("val", ctx.BOOL()));
		} else if (!ctx.INT().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("val", ctx.INT()));
		} else if (!ctx.DOUBLE().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("val", ctx.DOUBLE()));
		} else if (!ctx.FLOAT().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("val", ctx.FLOAT()));
		} else if (!ctx.LONG().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("val", ctx.LONG()));
		} else if (!ctx.STRING().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("val", ctx.STRING()));
		}
		return super.visitVal(ctx);
	}

	@Override
	public Void visitVar(XenCodeParser.VarContext ctx) {
		if (!ctx.BOOL().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("var", ctx.BOOL()));
		} else if (!ctx.INT().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("var", ctx.INT()));
		} else if (!ctx.DOUBLE().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("var", ctx.DOUBLE()));
		} else if (!ctx.FLOAT().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("var", ctx.FLOAT()));
		} else if (!ctx.LONG().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("var", ctx.LONG()));
		} else if (!ctx.STRING().isEmpty()) {
			val.put(ctx.toString(), new TXen.Record("var", ctx.STRING()));
		}
		return super.visitVar(ctx);
	}

	@Override
	public Void visitAllMethod(XenCodeParser.AllMethodContext ctx) {
		if (!ctx.allMethod().isEmpty()) {
			visitAllMethod(ctx.allMethod());
		} else if (!ctx.m().isEmpty()) {
			visitM(ctx.m());
		}
		return super.visitAllMethod(ctx);
	}

	public int getPriority() {
		return priority;
	}
}
