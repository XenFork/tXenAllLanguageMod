package union.xenfork;

import org.antlr.v4.runtime.tree.TerminalNode;
import union.xenfork.g4.XenCodeBaseVisitor;
import union.xenfork.g4.XenCodeParser;

import java.util.*;

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
	public HashMap<String, String> importMap = new HashMap<>();
 	public Map<String, Object> val = new HashMap<>();//局部变量
	//第一个string表示name 第二个string表示int val之类的头， Object存各类参数

	@Override
	public Void visitAll(XenCodeParser.AllContext ctx) {
		if (ctx.all() != null) {
			visitAll(ctx.all());
		}
		if (ctx.allField() != null) {
			visitAllField(ctx.allField());
		}
		if (ctx.allMethod() != null) {
			visitAllMethod(ctx.allMethod());
		}
		return null;
	}

	@Override
	public Void visitAllField(XenCodeParser.AllFieldContext ctx) {
		if (ctx.allField() != null) {
			visitAllField(ctx.allField());
		}
		if (ctx.tmp() != null) {
			visitTmp(ctx.tmp());
		}
		return null;
	}

	@Override
	public Void visitTmp(XenCodeParser.TmpContext ctx) {
		if (ctx.boolean_()!= null && !ctx.boolean_().isEmpty())  visitBoolean(ctx.boolean_());
		if (ctx.booleans()!= null && !ctx.booleans().isEmpty())  visitBooleans(ctx.booleans());
		if (ctx.double_()!= null && !ctx.double_().isEmpty())  visitDouble(ctx.double_());
		if (ctx.doubles()!= null)  visitDoubles(ctx.doubles());
		if (ctx.float_()!= null)  visitFloat(ctx.float_());
		if (ctx.floats()!= null) visitFloats(ctx.floats());
		if (ctx.int_()!= null)  visitInt(ctx.int_());
		if (ctx.ints()!= null)  visitInts(ctx.ints());
		if (ctx.long_()!= null)  visitLong(ctx.long_());
		if (ctx.longs()!= null)  visitLongs(ctx.longs());
		if (ctx.str()!= null)  visitStr(ctx.str());
		if (ctx.strings()!= null)  visitStrings(ctx.strings());
		if (ctx.val()!= null)  visitVal(ctx.val());
		if (ctx.var()!= null)  visitVar(ctx.var());
		if (ctx.imports()!= null) visitImports(ctx.imports());
		if (ctx.add()!=null)  visitAdd(ctx.add());
		if (ctx.addAll()!=null) visitAddAll(ctx.addAll());
		return null;
	}

	@Override
	public Void visitBoolean(XenCodeParser.BooleanContext ctx) {
		System.out.println(ctx.NAME().toString());
		booleanMap.put(ctx.NAME().toString(), Boolean.valueOf(ctx.BOOL().toString()));
		nameIsClassNameMap.put(ctx.NAME().toString(), "boolean");
		return null;
	}

	@Override
	public Void visitBooleans(XenCodeParser.BooleansContext ctx) {
		booleansMap.put(ctx.NAME().toString(), ctx.BOOL().stream().map(TerminalNode::toString).map(Boolean::valueOf).toList());
		nameIsClassNameMap.put(ctx.NAME().toString(), "booleans");
		return null;
	}

	@Override
	public Void visitDouble(XenCodeParser.DoubleContext ctx) {
		doubleMap.put(ctx.NAME().toString(), Double.valueOf(ctx.DOUBLE().toString()));
		nameIsClassNameMap.put(ctx.NAME().toString(), "double");
		return null;
	}

	@Override
	public Void visitDoubles(XenCodeParser.DoublesContext ctx) {
		doublesMap.put(ctx.NAME().toString(), ctx.DOUBLE().stream().map(TerminalNode::toString).map(Double::valueOf).toList());
		nameIsClassNameMap.put(ctx.NAME().toString(), "doubles");
		return null;
	}

	@Override
	public Void visitFloat(XenCodeParser.FloatContext ctx) {
		floatMap.put(ctx.NAME().toString(), Float.valueOf(ctx.FLOAT().toString()));
		nameIsClassNameMap.put(ctx.NAME().toString(), "float");
		return null;
	}

	@Override
	public Void visitFloats(XenCodeParser.FloatsContext ctx) {
		floatsMap.put(ctx.NAME().toString(), ctx.FLOAT().stream().map(TerminalNode::toString).map(Float::valueOf).toList());
		nameIsClassNameMap.put(ctx.NAME().toString(), "floats");
		return null;
	}

	@Override
	public Void visitInt(XenCodeParser.IntContext ctx) {
		integerMap.put(ctx.NAME().toString(), Integer.parseInt(ctx.INT().toString()));
		nameIsClassNameMap.put(ctx.NAME().toString(), "int");
		return null;
	}

	@Override
	public Void visitInts(XenCodeParser.IntsContext ctx) {
		integersMap.put(ctx.NAME().toString(), ctx.INT().stream().map(TerminalNode::toString).map(Integer::parseInt).toList());
		nameIsClassNameMap.put(ctx.NAME().toString(), "ints");
		return null;
	}

	@Override
	public Void visitLong(XenCodeParser.LongContext ctx) {
		longMap.put(ctx.NAME().toString(), Long.getLong(ctx.LONG().toString()));
		nameIsClassNameMap.put(ctx.NAME().toString(), "long");
		return null;
	}

	@Override
	public Void visitLongs(XenCodeParser.LongsContext ctx) {
		longsMap.put(ctx.NAME().toString(), ctx.LONG().stream().map(TerminalNode::toString).map(Long::valueOf).toList());
		nameIsClassNameMap.put(ctx.NAME().toString(), "longs");
		return null;
	}

	@Override
	public Void visitStr(XenCodeParser.StrContext ctx) {
		stringMap.put(ctx.NAME().toString(), ctx.STRING().toString());
		nameIsClassNameMap.put(ctx.NAME().toString(), "string");
		return null;
	}

	@Override
	public Void visitStrings(XenCodeParser.StringsContext ctx) {
		stringsMap.put(ctx.NAME().toString(), ctx.STRING().stream().map(TerminalNode::toString).toList());
		nameIsClassNameMap.put(ctx.NAME().toString(), "strings");
		return null;
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
			importMap.put(name,value);
		} else if (ctx.NAME() != null && ctx.NAME().isEmpty()) {
			priority = ctx.INT().getChildCount();
		}

		return null;
	}

	@Override
	public Void visitVal(XenCodeParser.ValContext ctx) {
		invoke(ctx.BOOL(), ctx.NAME(), ctx.BOOL(0), ctx.INT(), ctx.INT(0), ctx.DOUBLE(), ctx.DOUBLE(0), ctx.FLOAT(), ctx.FLOAT(0), ctx.LONG(), ctx.LONG(0), ctx.STRING(), ctx.STRING(0));
		return null;
	}

	private void invoke(List<TerminalNode> bool, TerminalNode name, TerminalNode bool2, List<TerminalNode> anInt, TerminalNode anInt2, List<TerminalNode> aDouble, TerminalNode aDouble2, List<TerminalNode> aFloat, TerminalNode aFloat2, List<TerminalNode> aLong, TerminalNode aLong2, List<TerminalNode> string, TerminalNode string2) {
		if (bool != null && !bool.isEmpty()) {
			if (bool.size() == 1) {
				booleanMap.put(name.toString(), Boolean.valueOf(bool2.toString()));
				nameIsClassNameMap.put(name.toString(), "boolean");
			} else {
				booleansMap.put(name.toString(), bool.stream().map(TerminalNode::toString).map(Boolean::valueOf).toList());
				nameIsClassNameMap.put(name.toString(), "booleans");
			}
		} else if (anInt != null && !anInt.isEmpty()) {
			if (anInt.size() == 1) {
				integerMap.put(name.toString(), Integer.parseInt(anInt2.toString()));
				nameIsClassNameMap.put(name.toString(), "int");
			} else {
				integersMap.put(name.toString(), anInt.stream().map(TerminalNode::toString).map(Integer::parseInt).toList());
				nameIsClassNameMap.put(name.toString(), "ints");
			}
		} else if (aDouble != null && !aDouble.isEmpty()) {
			if (aDouble.size() == 1) {
				doubleMap.put(name.toString(), Double.valueOf(aDouble2.toString()));
				nameIsClassNameMap.put(name.toString(), "double");
			} else {
				doublesMap.put(name.toString(), aDouble.stream().map(TerminalNode::toString).map(Double::valueOf).toList());
				nameIsClassNameMap.put(name.toString(), "doubles");
			}
		} else if (aFloat != null && !aFloat.isEmpty()) {
			if (aFloat.size() == 1) {
				floatMap.put(name.toString(), Float.valueOf(aFloat2.toString()));
				nameIsClassNameMap.put(name.toString(), "float");
			} else {
				floatsMap.put(name.toString(), aFloat.stream().map(TerminalNode::toString).map(Float::valueOf).toList());
				nameIsClassNameMap.put(name.toString(), "floats");
			}
		} else if (aLong != null && !aLong.isEmpty()) {
			if (aLong.size() == 1) {
				longMap.put(name.toString(), Long.getLong(aLong2.toString()));
				nameIsClassNameMap.put(name.toString(), "long");
			} else {
				longsMap.put(name.toString(), aLong.stream().map(TerminalNode::toString).map(Long::getLong).toList());
				nameIsClassNameMap.put(name.toString(), "longs");
			}
			val.put(name.toString(), new Record_("val", aLong.stream().map(TerminalNode::toString).toList()));
		} else if (string != null && !string.isEmpty()) {
			if (string.size() == 1) {
				stringMap.put(name.toString(), string2.toString());
				nameIsClassNameMap.put(name.toString(), "string");
			} else {
				stringsMap.put(name.toString(), string.stream().map(TerminalNode::toString).toList());
				nameIsClassNameMap.put(name.toString(), "strings");
			}
		}
	}

	@Override
	public Void visitVar(XenCodeParser.VarContext ctx) {
		invoke(ctx.BOOL(), ctx.NAME(), ctx.BOOL(0), ctx.INT(), ctx.INT(0), ctx.DOUBLE(), ctx.DOUBLE(0), ctx.FLOAT(), ctx.FLOAT(0), ctx.LONG(), ctx.LONG(0), ctx.STRING(), ctx.STRING(0));
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

	@Override
	public Void visitAdd(XenCodeParser.AddContext ctx) {
		if (nameIsClassNameMap.containsKey(ctx.NAME().toString())) {
			if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("strings") && ctx.STRING() != null) {
				List<String> temp = new ArrayList<>(stringsMap.get(ctx.NAME().toString()));
				temp.add(ctx.STRING().toString());
				stringsMap.put(ctx.NAME().toString(), temp);
			} else if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("ints") && ctx.INT() != null) {
				List<Integer> temp = new ArrayList<>(integersMap.get(ctx.NAME().toString()));
				temp.add(Integer.parseInt(ctx.INT().toString()));
				integersMap.put(ctx.NAME().toString(), temp);
			} else if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("floats") && ctx.FLOAT() != null) {
				List<Float> temp = new ArrayList<>(floatsMap.get(ctx.NAME().toString()));
				temp.add(Float.valueOf(ctx.FLOAT().toString()));
				floatsMap.put(ctx.NAME().toString(), temp);
			} else if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("longs") && ctx.LONG() != null) {
				List<Long> temp = new ArrayList<>(longsMap.get(ctx.NAME().toString()));
				temp.add(Long.getLong(ctx.LONG().toString()));
				longsMap.put(ctx.NAME().toString(), temp);
			} else if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("doubles") && ctx.DOUBLE() != null) {
				List<Double> temp = new ArrayList<>(doublesMap.get(ctx.NAME().toString()));
				temp.add(Double.valueOf(ctx.DOUBLE().toString()));
				doublesMap.put(ctx.NAME().toString(), temp);
			}else if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("booleans") && ctx.BOOL() != null) {
				List<Boolean> temp = new ArrayList<>(booleansMap.get(ctx.NAME().toString()));
				temp.add(Boolean.valueOf(ctx.BOOL().toString()));
				booleansMap.put(ctx.NAME().toString(), temp);
			}
		}
		return super.visitAdd(ctx);
	}

	@Override
	public Void visitAddAll(XenCodeParser.AddAllContext ctx) {
		if (nameIsClassNameMap.containsKey(ctx.NAME().toString())) {
			if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("strings") && ctx.STRING() != null) {
				List<String> temp = new ArrayList<>(stringsMap.get(ctx.NAME().toString()));
				temp.addAll(ctx.STRING().stream().map(TerminalNode::toString).toList());
				stringsMap.put(ctx.NAME().toString(), temp);
			} else if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("ints") && ctx.INT() != null) {
				List<Integer> temp = new ArrayList<>(integersMap.get(ctx.NAME().toString()));
				temp.addAll(ctx.INT().stream().map(TerminalNode::toString).map(Integer::parseInt).toList());
				integersMap.put(ctx.NAME().toString(), temp);
			} else if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("floats") && ctx.FLOAT() != null) {
				List<Float> temp = new ArrayList<>(floatsMap.get(ctx.NAME().toString()));
				temp.addAll(ctx.FLOAT().stream().map(TerminalNode::toString).map(Float::valueOf).toList());
				floatsMap.put(ctx.NAME().toString(), temp);
			} else if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("longs") && ctx.LONG() != null) {
				List<Long> temp = new ArrayList<>(longsMap.get(ctx.NAME().toString()));
				temp.addAll(ctx.LONG().stream().map(TerminalNode::toString).map(Long::getLong).toList());
				longsMap.put(ctx.NAME().toString(), temp);
			} else if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("doubles") && ctx.DOUBLE() != null) {
				List<Double> temp = new ArrayList<>(doublesMap.get(ctx.NAME().toString()));
				temp.addAll(ctx.DOUBLE().stream().map(TerminalNode::toString).map(Double::valueOf).toList());
				doublesMap.put(ctx.NAME().toString(), temp);
			}else if (nameIsClassNameMap.get(ctx.NAME().toString()).equals("booleans") && ctx.BOOL() != null) {
				List<Boolean> temp = new ArrayList<>(booleansMap.get(ctx.NAME().toString()));
				temp.addAll(ctx.BOOL().stream().map(TerminalNode::toString).map(Boolean::valueOf).toList());
				booleansMap.put(ctx.NAME().toString(), temp);
			}
		}
		return super.visitAddAll(ctx);
	}

	@Override
	public Void visitM(XenCodeParser.MContext ctx) {
		if (ctx.for_()!=null) {
			visitFor(ctx.for_());
		} else if (ctx.foreach() != null) {
			visitForeach(ctx.foreach());
		} else if (ctx.while_() != null) {
			visitWhile(ctx.while_());
		} else if (ctx.print() != null) {
			visitPrint(ctx.print());
		}
		return super.visitM(ctx);
	}

	@Override
	public Void visitFor(XenCodeParser.ForContext ctx) {

		if (ctx.INT() != null && !ctx.INT().isEmpty()) {
			integerMap.put(ctx.NAME().toString(), Integer.parseInt(ctx.INT(0).toString()));
			for (int temp = integerMap.get(ctx.NAME().toString()); temp < Integer.parseInt(ctx.INT(1).toString()); temp++) {
				integerMap.put(ctx.NAME().toString(), temp);
				visitAll(ctx.all());
			}
		}
		return super.visitFor(ctx);
	}

	@Override
	public Void visitForeach(XenCodeParser.ForeachContext ctx) {
		if (stringsMap.containsKey(ctx.NAME(1).toString())) {
			for (var tmp : stringsMap.get(ctx.NAME(1).toString())) {
				stringMap.put(ctx.NAME(0).toString(), tmp);
				visitAll(ctx.all());
			}
		} else if (integersMap.containsKey(ctx.NAME(1).toString())) {
			for (var tmp : integersMap.get(ctx.NAME(1).toString())) {
				integerMap.put(ctx.NAME(0).toString(), tmp);
				visitAll(ctx.all());
			}
		} else if (floatsMap.containsKey(ctx.NAME(1).toString())) {
			for (var tmp : floatsMap.get(ctx.NAME(1).toString())) {
				floatMap.put(ctx.NAME(0).toString(), tmp);
				visitAll(ctx.all());
			}
		} else if (doublesMap.containsKey(ctx.NAME(1).toString())) {
			for (var tmp : doublesMap.get(ctx.NAME(1).toString())) {
				doubleMap.put(ctx.NAME(0).toString(), tmp);
				visitAll(ctx.all());
			}
		} else if (longsMap.containsKey(ctx.NAME(1).toString())) {
			for (var tmp : longsMap.get(ctx.NAME(1).toString())) {
				longMap.put(ctx.NAME(0).toString(), tmp);
				visitAll(ctx.all());
			}
		} else if (booleansMap.containsKey(ctx.NAME(1).toString())) {
			for (var tmp : booleansMap.get(ctx.NAME(1).toString())) {
				booleanMap.put(ctx.NAME(0).toString(), tmp);
				visitAll(ctx.all());
			}
		}
		return super.visitForeach(ctx);
	}

	@Override
	public Void visitPrint(XenCodeParser.PrintContext ctx) {
//		System.out.println(ctx.NAME().toString());
		return super.visitPrint(ctx);
	}

	public int getPriority() {
		return priority;
	}
}
