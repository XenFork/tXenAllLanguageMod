package union.xenfork.xenscript.read;

import cn.hutool.core.lang.Pair;
import cn.hutool.core.map.BiMap;
import union.xenfork.xenscript.parser.XenCodeParser;
import union.xenfork.xenscript.parser.XenCodeParserBaseVisitor;

import java.io.File;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CodeVisitor extends XenCodeParserBaseVisitor<Object> {
    private final BiMap<BigInteger, List<Pair<String, CodeVisitor>>> priorityFile;
    private final File file;

    private List<CodeVisitor> loader = new ArrayList<>();
    public CodeVisitor(File file, BiMap<BigInteger, List<Pair<String, CodeVisitor>>> priorityFile) {
        this.priorityFile = priorityFile;
        this.file = file;
    }
    @Override
    public Object visitThread(XenCodeParser.ThreadContext ctx) {

        initLoader(ctx);
        return null;
    }

    private void initLoader(XenCodeParser.ThreadContext ctx) {
        if (!ctx.loaderExpr().isEmpty() && ctx.loaderExpr() != null) {
            for (XenCodeParser.LoaderExprContext loader : ctx.loaderExpr()) {
                String l = visitLoaderExpr(loader);
                boolean error = true;
                for (var entry : priorityFile) {
                    List<Pair<String, CodeVisitor>> value = entry.getValue();
                    for (Pair<String, CodeVisitor> kv : value) {
                        if (kv.getKey().equals(l)) {
                            error = false;
                            this.loader.add(kv.getValue());
                        }
                    }
                }
                if (error) {
                    error("not load " + l);
                }
            }
        }
    }



    @Override
    public String visitLoaderExpr(XenCodeParser.LoaderExprContext ctx) {
        return ctx.NAMED().getText();
    }

    public void error(String message) {
        throw new AssertionError();
    }

}
