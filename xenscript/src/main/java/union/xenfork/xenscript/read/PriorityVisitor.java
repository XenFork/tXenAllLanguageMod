package union.xenfork.xenscript.read;

import cn.hutool.core.lang.Pair;
import cn.hutool.core.map.BiMap;
import cn.hutool.core.text.StrBuilder;
import union.xenfork.xenscript.parser.XenCodeParser;
import union.xenfork.xenscript.parser.XenCodeParserBaseVisitor;

import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PriorityVisitor extends XenCodeParserBaseVisitor<Object> {

    private final BiMap<Integer, List<Pair<String, File>>> priorityFile;
    private final File file, path;

    public PriorityVisitor(File file, BiMap<Integer, List<Pair<String, File>>> priorityFile, File path) {
        this.priorityFile = priorityFile;
        this.file = file;
        this.path = path;
    }
    @Override
    public Object visitThread(XenCodeParser.ThreadContext ctx) {
        int integer;
        if (ctx.priority() != null) {
            integer = visitPriority(ctx.priority());
        } else {
            integer = Integer.MAX_VALUE;
        }
        List<Pair<String, File>> list = priorityFile.containsKey(integer)? priorityFile.get(integer) : new ArrayList<>();

        String replace = file.getAbsolutePath().replace(path.getAbsolutePath() + File.separator, "").replace(File.separator, "_").replace(".", "_");

        StrBuilder sb = new StrBuilder(String.valueOf(replace.charAt(0)).toUpperCase(Locale.ROOT));
        for (int i = 1; i < replace.length(); i++) {
            sb.append(replace.charAt(i));
        }
        list.add(new Pair<>("union.xenfork.xcs." + sb, file));
        priorityFile.put(integer, list);
        return null;
    }

    @Override
    public Integer visitPriority(XenCodeParser.PriorityContext ctx) {
        BigInteger bigInteger = new BigInteger(ctx.NUMBER().getText());
        // max int or less
        return bigInteger.intValue();
    }
}
