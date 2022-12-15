package union.xenfork.txentweaker4fabric.xencode;

import org.reflections.Reflections;
import union.xenfork.g4.XenCodeBaseVisitor;
import union.xenfork.g4.XenCodeParser;

import java.util.*;

import static union.xenfork.txentweaker4fabric.TXenTweaker4fabric.logger;

public class Visit extends XenCodeBaseVisitor<Visit> {
	private final Map<String, Class<?>> stringClassMap = new HashMap<>();
	private final Map<String, String> findName = new HashMap<>();
	private final Map<String, String> stringStringMap = new HashMap<>();
	private final Map<String, List<String>> stringStringsMap = new HashMap<>();
	private final Map<String, Integer> stringIntegerMap = new HashMap<>();
	private final Map<String, List<Integer>> stringIntegersMap = new HashMap<>();
	private final Map<String, Float> stringFloatMap = new HashMap<>();
	private final Map<String, List<Float>> stringFloatsMap = new HashMap<>();
	private final Map<String, Double> stringDoubleMap = new HashMap<>();
	private final Map<String, List<Double>> stringDoublesMap = new HashMap<>();
	private final Map<String, Long> stringLongMap = new HashMap<>();
	private final Map<String, List<Long>> stringLongsMap = new HashMap<>();
	private final Map<String, Boolean> stringBooleanMap = new HashMap<>();
	private final Map<String, List<Boolean>> stringBooleansMap = new HashMap<>();

	public Map<String, Class<?>> getStringClassMap() {
		return stringClassMap;
	}

	public Map<String, String> getStringStringMap() {
		return stringStringMap;
	}

	public Map<String, String> getFindName() {
		return findName;
	}

	public Map<String, List<String>> getStringStringsMap() {
		return stringStringsMap;
	}

	public Map<String, Integer> getStringIntegerMap() {
		return stringIntegerMap;
	}

	public Map<String, List<Integer>> getStringIntegersMap() {
		return stringIntegersMap;
	}

	public Map<String, Float> getStringFloatMap() {
		return stringFloatMap;
	}

	public Map<String, List<Float>> getStringFloatsMap() {
		return stringFloatsMap;
	}

	public Map<String, Double> getStringDoubleMap() {
		return stringDoubleMap;
	}

	public Map<String, List<Double>> getStringDoublesMap() {
		return stringDoublesMap;
	}

	public Map<String, Long> getStringLongMap() {
		return stringLongMap;
	}

	public Map<String, List<Long>> getStringLongsMap() {
		return stringLongsMap;
	}

	public Map<String, Boolean> getStringBooleanMap() {
		return stringBooleanMap;
	}

	public Map<String, List<Boolean>> getStringBooleansMap() {
		return stringBooleansMap;
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

	//field变量
	public void reset(String name, String field) {
		if (findName.containsKey(name)) {
			if (!findName.get(name).equals(field)) {
				invoke(findName.get(name)).remove(name);
			}
		}
	}
	public Map<String, ?> invoke(String field) {
		return switch (field) {
			case "string" -> stringStringMap;
			case "strings" -> stringStringsMap;
			case "int" -> stringIntegerMap;
			case "ints" -> stringIntegersMap;
			case "float" -> stringFloatMap;
			case "floats" -> stringFloatsMap;
			case "double" -> stringDoubleMap;
			case "doubles" -> stringDoublesMap;
			case "long" -> stringLongMap;
			case "longs" -> stringLongsMap;
			case "boolean" -> stringBooleanMap;
			case "booleans" -> stringBooleansMap;
			default -> null;
		};
	}
	@Override
	public Visit visitStr(XenCodeParser.StrContext ctx) {
		String field = "string";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringStringMap.put(ctx.NAME().toString(), ctx.STRING().toString().substring(ctx.STRING().toString().indexOf("\"") + 1, ctx.STRING().toString().lastIndexOf("\"")));
		return null;
	}

	@Override
	public Visit visitStrings(XenCodeParser.StringsContext ctx) {
		String field = "strings";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringStringsMap.put(
				ctx.NAME().toString(),
				ctx.STRING().stream().map(Object::toString).toList());
		return null;
	}

	@Override
	public Visit visitInt(XenCodeParser.IntContext ctx) {
		String field = "int";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringIntegerMap.put(ctx.NAME().toString(), Integer.parseInt(ctx.INT().toString()));
		return null;
	}

	@Override
	public Visit visitInts(XenCodeParser.IntsContext ctx) {
		String field = "ints";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringIntegersMap.put(
				ctx.NAME().toString(),
				ctx.INT().stream().map(Object::toString).map(Integer::parseInt).toList());
		return null;
	}

	@Override
	public Visit visitFloat(XenCodeParser.FloatContext ctx) {
		String field = "float";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringFloatMap.put(ctx.NAME().toString(), Float.valueOf(ctx.FLOAT().toString()));
		return null;
	}

	@Override
	public Visit visitFloats(XenCodeParser.FloatsContext ctx) {
		String field = "floats";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringFloatsMap.put(
				ctx.NAME().toString(),
				ctx.FLOAT().stream().map(Object::toString).map(Float::valueOf).toList());
		return null;
	}

	@Override
	public Visit visitDouble(XenCodeParser.DoubleContext ctx) {
		String field = "double";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringDoubleMap.put(ctx.NAME().toString(), Double.valueOf(ctx.DOUBLE().toString()));
		return null;
	}

	@Override
	public Visit visitDoubles(XenCodeParser.DoublesContext ctx) {
		String field = "doubles";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringDoublesMap.put(
				ctx.NAME().toString(),
				ctx.DOUBLE().stream().map(Object::toString).map(Double::valueOf).toList());
		return null;
	}

	@Override
	public Visit visitLong(XenCodeParser.LongContext ctx) {
		String field = "long";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringLongMap.put(ctx.NAME().toString(), Long.getLong(ctx.LONG().toString()));
		return null;
	}

	@Override
	public Visit visitLongs(XenCodeParser.LongsContext ctx) {
		String field = "longs";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringLongsMap.put(
				ctx.NAME().toString(),
				ctx.LONG().stream().map(Object::toString).map(Long::getLong).toList());
		return null;
	}

	@Override
	public Visit visitBoolean(XenCodeParser.BooleanContext ctx) {
		String field = "boolean";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringBooleanMap.put(ctx.NAME().toString(), Boolean.getBoolean(ctx.BOOL().toString()));
		return null;
	}

	@Override
	public Visit visitBooleans(XenCodeParser.BooleansContext ctx) {
		String field = "booleans";
		reset(ctx.NAME().toString(), field);
		findName.put(ctx.NAME().toString(), field);
		stringBooleansMap.put(
				ctx.NAME().toString(),
				ctx.BOOL().stream().map(Object::toString).map(Boolean::getBoolean).toList());
		return null;
	}

	//#带有的import代码在下面
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
	@Override
	public Visit visitField(XenCodeParser.FieldContext ctx) {
		if (ctx.s() != null) {
			visitS(ctx.s());
		} else if (ctx.i() != null) {
			visitI(ctx.i());
		} else if (ctx.f() != null) {
			visitF(ctx.f());
		} else if (ctx.d() != null) {
			visitD(ctx.d());
		} else if (ctx.l() != null) {
			visitL(ctx.l());
		} else if (ctx.b() != null) {
			visitB(ctx.b());
		}
		return null;
	}
	@Override
	public Visit visitS(XenCodeParser.SContext ctx) {
		if (ctx.str() != null) {
			visitStr(ctx.str());
		} else if (ctx.strings() != null) {
			visitStrings(ctx.strings());
		}
		return null;
	}

	@Override
	public Visit visitI(XenCodeParser.IContext ctx) {
		if (ctx.int_() != null) {
			visitInt(ctx.int_());
		} else if (ctx.ints() != null) {
			visitInts(ctx.ints());
		}
		return null;
	}

	@Override
	public Visit visitF(XenCodeParser.FContext ctx) {
		if (ctx.float_() != null) {
			visitFloat(ctx.float_());
		} else if (ctx.floats() != null) {
			visitFloats(ctx.floats());
		}
		return null;
	}

	@Override
	public Visit visitD(XenCodeParser.DContext ctx) {
		if (ctx.double_() != null) {
			visitDouble(ctx.double_());
		} else if (ctx.doubles() != null) {
			visitDoubles(ctx.doubles());
		}
		return null;
	}

	@Override
	public Visit visitL(XenCodeParser.LContext ctx) {
		if (ctx.long_() != null) {
			visitLong(ctx.long_());
		} else if (ctx.longs() != null) {
			visitLongs(ctx.longs());
		}
		return null;
	}

	@Override
	public Visit visitB(XenCodeParser.BContext ctx) {
		if (ctx.boolean_() != null) {
			visitBoolean(ctx.boolean_());
		} else if (ctx.booleans() != null) {
			visitBooleans(ctx.booleans());
		}
		return null;
	}
}
