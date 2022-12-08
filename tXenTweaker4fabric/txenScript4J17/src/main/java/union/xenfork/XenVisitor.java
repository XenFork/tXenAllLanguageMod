package union.xenfork;

import union.xenfork.g4.XenCodeBaseVisitor;
import union.xenfork.g4.XenCodeParser;

import java.util.*;

public class XenVisitor extends XenCodeBaseVisitor<Void> {

	public record Record(String className, String value) {}
	public record Record_(String className, List<String> value) {
	}
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
}
