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
	public record Record_(String className, List<String> value) {
	}
	private int priority = -1;
	public Map<String, String> stringMap = new HashMap<>();//存储string变量
	public Map<String, List<String>> stringsMap = new HashMap<>();//存储strings变量
	public Map<String, Boolean> booleanMap = new HashMap<>();//存储boolean变量
	public Map<String, List<Boolean>> booleansMap = new HashMap<>();//存储boolean变量
	public Map<String, Float> floatMap = new HashMap<>();
	public Map<String, List<Float>> floatsMap = new HashMap<>();
	public Map<String, Double> doubleMap = new HashMap<>();
	public Map<String, List<Double>> doublesMap = new HashMap<>();
	public Map<String, Integer> integerMap = new HashMap<>();
	public Map<String, List<Integer>> integersMap = new HashMap<>();
	public Map<String, Long> longMap = new HashMap<>();
	public Map<String, List<Long>> longsMap = new HashMap<>();
	public Map<String, String> nameIsClassNameMap = new HashMap<>();//存储变量名字和类型
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
		if (ctx.boolean_()!= null)  visitBoolean(ctx.boolean_());
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
		booleanMap.put(ctx.NAME().toString(), Boolean.valueOf(ctx.BOOL().toString()));
		nameIsClassNameMap.put(ctx.NAME().toString(), "boolean");
		return super.visitBoolean(ctx);
	}

	@Override
	public Void visitBooleans(XenCodeParser.BooleansContext ctx) {
		booleansMap.put(ctx.NAME().toString(), ctx.BOOL().stream().map(TerminalNode::toString).map(Boolean::valueOf).toList());
		nameIsClassNameMap.put(ctx.NAME().toString(), "booleans");
		return super.visitBooleans(ctx);
	}

	@Override
	public Void visitDouble(XenCodeParser.DoubleContext ctx) {
		doubleMap.put(ctx.NAME().toString(), Double.valueOf(ctx.DOUBLE().toString()));
		nameIsClassNameMap.put(ctx.NAME().toString(), "double");
		return super.visitDouble(ctx);
	}

	@Override
	public Void visitDoubles(XenCodeParser.DoublesContext ctx) {
		doublesMap.put(ctx.NAME().toString(), ctx.DOUBLE().stream().map(TerminalNode::toString).map(Double::valueOf).toList());
		nameIsClassNameMap.put(ctx.NAME().toString(), "doubles");
		return super.visitDoubles(ctx);
	}

	@Override
	public Void visitFloat(XenCodeParser.FloatContext ctx) {
		floatMap.put(ctx.NAME().toString(), Float.valueOf(ctx.FLOAT().toString()));
		nameIsClassNameMap.put(ctx.NAME().toString(), "float");
		return super.visitFloat(ctx);
	}

	@Override
	public Void visitFloats(XenCodeParser.FloatsContext ctx) {
		val.put(ctx.NAME().toString(), new Record_("floats", ctx.FLOAT().stream().map(Object::toString).toList()));
		return super.visitFloats(ctx);
	}

	@Override
	public Void visitInt(XenCodeParser.IntContext ctx) {
		integerMap.put(ctx.NAME().toString(), Integer.parseInt(ctx.INT().toString()));
		nameIsClassNameMap.put(ctx.NAME().toString(), "int");
		return super.visitInt(ctx);
	}

	@Override
	public Void visitInts(XenCodeParser.IntsContext ctx) {
		val.put(ctx.NAME().toString(), new Record_("ints", ctx.INT().stream().map(Object::toString).toList()));
		return super.visitInts(ctx);
	}

	@Override
	public Void visitLong(XenCodeParser.LongContext ctx) {
		longMap.put(ctx.NAME().toString(), Long.valueOf(ctx.LONG().toString()));
		nameIsClassNameMap.put(ctx.NAME().toString(), "long");
		return super.visitLong(ctx);
	}

	@Override
	public Void visitLongs(XenCodeParser.LongsContext ctx) {
		val.put(ctx.NAME().toString(), new Record_("longs", ctx.LONG().stream().map(Object::toString).toList()));
		return super.visitLongs(ctx);
	}

	@Override
	public Void visitStr(XenCodeParser.StrContext ctx) {
		stringMap.put(ctx.NAME().toString(), ctx.STRING().toString());
		nameIsClassNameMap.put(ctx.NAME().toString(), "string");
		return super.visitStr(ctx);
	}

	@Override
	public Void visitStrings(XenCodeParser.StringsContext ctx) {
		stringsMap.put(ctx.NAME().toString(), ctx.STRING().stream().map(TerminalNode::toString).toList());
		nameIsClassNameMap.put(ctx.NAME().toString(), "strings");
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
