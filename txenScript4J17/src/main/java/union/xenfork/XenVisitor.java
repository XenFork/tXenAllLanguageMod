package union.xenfork;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import union.xenfork.g4.XenCodeBaseVisitor;
import union.xenfork.g4.XenCodeParser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class XenVisitor extends XenCodeBaseVisitor<Void> {

	public record Record(String className, String value) {}
	public record Record_(String className, List<String> value) {}
	private int priority = -1;
	public Map<String, Object> val = new HashMap<>();//局部变量
	//第一个string表示name 第二个string表示int val之类的头， Object存各类参数

	@Override
	public Void visitAll(XenCodeParser.AllContext ctx) {
		if (ctx.all() != null) {
			visitAll(ctx.all());
		} else if (ctx.allField() != null) {
			visitAllField(ctx.allField());
		} else if (ctx.allMethod() != null) {
			visitAllMethod(ctx.allMethod());
		}
		return super.visitAll(ctx);
	}

	@Override
	public Void visitAllField(XenCodeParser.AllFieldContext ctx) {
		if (ctx.allField() != null) {
			visitAllField(ctx.allField());
		} else if (ctx.tmp() != null) {
			visitTmp(ctx.tmp());
		}
		return super.visitAllField(ctx);
	}

	@Override
	public Void visitTmp(XenCodeParser.TmpContext ctx) {
		if (ctx.boolean_()!= null) visitBoolean(ctx.boolean_());
		else if (ctx.booleans()!= null) visitBooleans(ctx.booleans());
		else if (ctx.double_()!= null) visitDouble(ctx.double_());
		else if (ctx.doubles()!= null) visitDoubles(ctx.doubles());
		else if (ctx.float_()!= null) visitFloat(ctx.float_());
		else if (ctx.floats()!= null) visitFloats(ctx.floats());
		else if (ctx.int_()!= null) visitInt(ctx.int_());
		else if (ctx.ints()!= null) visitInts(ctx.ints());
		else if (ctx.long_()!= null) visitLong(ctx.long_());
		else if (ctx.longs()!= null) visitLongs(ctx.longs());
		else if (ctx.str()!= null) visitStr(ctx.str());
		else if (ctx.strings()!= null) visitStrings(ctx.strings());
		else if (ctx.val()!= null) visitVal(ctx.val());
		else if (ctx.var()!= null) visitVar(ctx.var());
		else if (ctx.imports()!= null) visitImports(ctx.imports());
		else if (ctx.add()!=null) visitAdd(ctx.add());
		else if (ctx.addAll()!=null) visitAddAll(ctx.addAll());
		return super.visitTmp(ctx);
	}

	@Override
	public Void visitBoolean(XenCodeParser.BooleanContext ctx) {
		val.put(ctx.NAME().toString(), new Record("bool", ctx.BOOL().toString()));
		return super.visitBoolean(ctx);
	}

	@Override
	public Void visitBooleans(XenCodeParser.BooleansContext ctx) {
		val.put(ctx.NAME().toString(), new Record_("booleans", ctx.BOOL().stream().map(Object::toString).toList()));
		return super.visitBooleans(ctx);
	}

	@Override
	public Void visitDouble(XenCodeParser.DoubleContext ctx) {
		val.put(ctx.NAME().toString(), new Record("double", ctx.DOUBLE().toString()));
		return super.visitDouble(ctx);
	}

	@Override
	public Void visitDoubles(XenCodeParser.DoublesContext ctx) {
		val.put(ctx.NAME().toString(), new Record_("doubles", ctx.DOUBLE().stream().map(Object::toString).toList()));
		return super.visitDoubles(ctx);
	}

	@Override
	public Void visitFloat(XenCodeParser.FloatContext ctx) {
		val.put(ctx.NAME().toString(), new Record("float", ctx.FLOAT().toString()));
		return super.visitFloat(ctx);
	}

	@Override
	public Void visitFloats(XenCodeParser.FloatsContext ctx) {
		val.put(ctx.NAME().toString(), new Record_("floats", ctx.FLOAT().stream().map(Object::toString).toList()));
		return super.visitFloats(ctx);
	}

	@Override
	public Void visitInt(XenCodeParser.IntContext ctx) {
		val.put(ctx.NAME().toString(), new Record("int", ctx.INT().toString()));
		return super.visitInt(ctx);
	}

	@Override
	public Void visitInts(XenCodeParser.IntsContext ctx) {
		val.put(ctx.NAME().toString(), new Record_("ints", ctx.INT().stream().map(Object::toString).toList()));
		return super.visitInts(ctx);
	}

	@Override
	public Void visitLong(XenCodeParser.LongContext ctx) {
		val.put(ctx.NAME().toString(), new Record("long", ctx.LONG().toString()));
		return super.visitLong(ctx);
	}

	@Override
	public Void visitLongs(XenCodeParser.LongsContext ctx) {
		val.put(ctx.NAME().toString(), new Record_("longs", ctx.LONG().stream().map(Object::toString).toList()));
		return super.visitLongs(ctx);
	}

	@Override
	public Void visitStr(XenCodeParser.StrContext ctx) {
		val.put(ctx.NAME().toString(), new Record("string", ctx.STRING().toString()));
		return super.visitStr(ctx);
	}

	@Override
	public Void visitStrings(XenCodeParser.StringsContext ctx) {
		val.put(ctx.NAME().toString(), new Record_("strings", ctx.STRING().stream().map(Object::toString).toList()));
		return super.visitStrings(ctx);
	}

	@Override
	public Void visitImports(XenCodeParser.ImportsContext ctx) {
		if (ctx.NAME() != null && !ctx.NAME().isEmpty()) {
			int t = 0;
			String name = "";
			String value= null;
			for (var a : ctx.NAME()) {
				if (t == 0) {
					name = a.toString();
					t++;
				} else {
					value = a.toString();
				}
			}
			val.put(name, new Record("import", value));
		} else if (ctx.NAME() != null && ctx.NAME().isEmpty()) {
			priority = ctx.INT().getChildCount();
		}

		return super.visitImports(ctx);
	}

	@Override
	public Void visitVal(XenCodeParser.ValContext ctx) {
		if (ctx.BOOL()!= null && !ctx.BOOL().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("val", ctx.BOOL().stream().map(Object::toString).toList()));
		} else if (ctx.INT()!= null && !ctx.INT().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("val", ctx.INT().stream().map(Object::toString).toList()));
		} else if (ctx.DOUBLE()!= null && !ctx.DOUBLE().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("val", ctx.DOUBLE().stream().map(Object::toString).toList()));
		} else if (ctx.FLOAT()!= null && !ctx.FLOAT().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("val", ctx.FLOAT().stream().map(Object::toString).toList()));
		} else if (ctx.LONG()!= null && !ctx.LONG().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("val", ctx.LONG().stream().map(TerminalNode::toString).toList()));
		} else if (ctx.STRING()!= null && !ctx.STRING().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("var", ctx.STRING().stream().map(TerminalNode::toString).toList()));
		}
		return super.visitVal(ctx);
	}

	@Override
	public Void visitVar(XenCodeParser.VarContext ctx) {
		if (ctx.BOOL()!= null && !ctx.BOOL().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("var", ctx.BOOL().stream().map(Object::toString).toList()));
		} else if (ctx.INT()!= null && !ctx.INT().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("var", ctx.INT().stream().map(Object::toString).toList()));
		} else if (ctx.DOUBLE()!= null && !ctx.DOUBLE().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("var", ctx.DOUBLE().stream().map(Object::toString).toList()));
		} else if (ctx.FLOAT()!= null && !ctx.FLOAT().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("var", ctx.FLOAT().stream().map(Object::toString).toList()));
		} else if (ctx.LONG()!= null && !ctx.LONG().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("var", ctx.LONG().stream().map(TerminalNode::toString).toList()));
		} else if (ctx.STRING()!= null && !ctx.STRING().isEmpty()) {
			val.put(ctx.NAME().toString(), new Record_("var", ctx.STRING().stream().map(TerminalNode::toString).toList()));
		}
		return super.visitVar(ctx);
	}

	@Override
	public Void visitAdd(XenCodeParser.AddContext ctx) {
		val.forEach((s, object) -> {
			invoke(object, s,"strings" , ctx.NAME(), ctx.STRING());
			invoke(object, s, "ints", ctx.NAME(), ctx.INT());
			invoke(object, s, "floats", ctx.NAME(), ctx.FLOAT());
			invoke(object, s, "doubles", ctx.NAME(), ctx.DOUBLE());
			invoke(object, s, "longs", ctx.NAME(), ctx.LONG());
			invoke(object, s, "booleans", ctx.NAME(), ctx.BOOL());
		});
		return super.visitAdd(ctx);
	}

	@Override
	public Void visitAddAll(XenCodeParser.AddAllContext ctx) {
		val.forEach((s, object) -> {
			invoke1(object, s,"strings" , ctx.NAME().toString(), ctx.STRING());
			invoke1(object, s, "ints", ctx.NAME().toString(), ctx.INT());
			invoke1(object, s, "floats", ctx.NAME().toString(), ctx.FLOAT());
			invoke1(object, s, "doubles", ctx.NAME().toString(), ctx.DOUBLE());
			invoke1(object, s, "longs", ctx.NAME().toString(), ctx.LONG());
			invoke1(object, s, "booleans", ctx.NAME().toString(), ctx.BOOL());
		});
		return super.visitAddAll(ctx);
	}

	public void invoke1(Object object, String s, String name, String ctx, List<TerminalNode> ctx2) {
		if (object instanceof Record_ record && s.equals(ctx) && record.className.equals(name)) {
			record.value.addAll(ctx2.stream().map(TerminalNode::toString).toList());
//			val.put(s, new Record_(name, record.value));
		}

	}

	public void invoke(Object object, String s, String name, TerminalNode ctx, TerminalNode ctx2) {
		if (object instanceof Record_ record && s.equals(ctx.toString()) && record.className.equals(name)) {
			record.value.add(ctx2.toString());
//			val.put(s, new Record_(name, record.value));
		}
	}

	@Override
	public Void visitAllMethod(XenCodeParser.AllMethodContext ctx) {
		if (ctx.allMethod()!= null) {
			visitAllMethod(ctx.allMethod());
		} else if (ctx.m()!= null) {
			visitM(ctx.m());
		}
		return super.visitAllMethod(ctx);
	}

	public int getPriority() {
		return priority;
	}
}
