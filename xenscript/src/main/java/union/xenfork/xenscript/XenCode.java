package union.xenfork.xenscript;

import cn.hutool.core.lang.Pair;
import cn.hutool.core.map.BiMap;
import union.xenfork.xenscript.read.PriorityVisitor;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XenCode {
    public static final BiMap<Integer, List<Pair<String, File>>> priorityFile = new BiMap<>(new HashMap<>());
    public static void loader(File file) {
        File path = new File(file, "alm");
        File[] files = path.listFiles();
        if (files != null) {
            for (File f : files) {
                new PriorityVisitor(f, priorityFile);
            }
        }
        for (var var : priorityFile) {
            for (var var1 : var.getValue()) {
                String key = var1.getKey();
                
            }
        }
    }
}
