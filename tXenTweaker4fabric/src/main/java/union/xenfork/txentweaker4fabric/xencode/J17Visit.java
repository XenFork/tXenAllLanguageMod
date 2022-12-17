package union.xenfork.txentweaker4fabric.xencode;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.reflections.Reflections;
import union.xenfork.news.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class J17Visit extends XenCode4J17BaseVisitor<Void> {
    public final Map<String, Class<?>> importMap = new HashMap<>();
    public final Map<String, String> findName = new HashMap<>();
    public final Map<String, Object> var_valMap = new HashMap<>();

    @Override
    public Void visitXenfork(XenCode4J17Parser.XenforkContext ctx) {
        if (ctx.jh() != null) {
            for (var iv : ctx.jh().iv()) {
                if (iv.iiv() != null) {
                    final var t = iv.iiv().FILEDA().toString();
                    var m = t.split("\\.");
                    findName.put(
                            iv.iiv().iiiv() !=null ?
                                    iv.iiv().iiiv().NAME().toString() :
                                    m[m.length - 1],
                            "import");
                    importMap.put(
                            iv.iiv().iiiv() !=null ?
                                    iv.iiv().iiiv().NAME().toString() :
                                    m[m.length - 1],
                            new Reflections().forClass(t));

                } else {
                    var t = iv.FILEDA().toString();
                    var m = t.split("\\.");
                    findName.put(m[m.length - 1], "import");
                    importMap.put(m[m.length - 1], new Reflections().forClass(t));
                }
            }
        }
        else if (ctx.method() != null) visitMethod(ctx.method());
        else if (ctx.field() != null) visitField(ctx.field());
        return null;
    }

    @Override
    public Void visitField(XenCode4J17Parser.FieldContext ctx) {
        var varName = ctx.varName.getText();
        Object o = null;

        if (ctx.ifv() != null) {
            final var c = ctx.ifv();
            if (c.boolean_.getText() != null) {
                o = Boolean.valueOf(c.boolean_.getText());
            } else if (c.double_.getText() != null) {
                o = Double.valueOf(c.double_.getText());
            } else if (c.int_.getText() != null) {
                o = Integer.parseInt(c.int_.getText());
            } else if (c.float_.getText() != null) {
                o = Float.valueOf(c.float_.getText());
            } else if (c.name_.getText() != null) {
                if (findName.containsKey(c.name_.getText())) {
                    if (importMap.containsKey(c.name_.getText())) {
                        var aClass = importMap.get(c.name_.getText());
                    } else {
                        o = var_valMap.get(c.name_.getText());
                    }
                }
            } else if (c.string_.getText() != null) {
                o = c.string_.getText();
            } else if (c.move() != null) {
                var pre = Integer.parseInt(c.move().pre.getText());
                var sub = Integer.parseInt(c.move().sub.getText());
                o = c.move().mid.getText().equals("->") ? pre >> sub : pre << sub;
                //一会写
            } else if (c.b() != null) {
                //一会写
            } else if (c.field__ != null) {

            }
        }
        findName.put(varName, "var_val");
        var_valMap.put(varName, o);
        return super.visitField(ctx);
    }

    @Override
    public Void visitUnion(XenCode4J17Parser.UnionContext ctx) {
        return ctx.xenfork() != null ? visitXenfork(ctx.xenfork()) : null;
    }

    @Override
    public Void visitAll(XenCode4J17Parser.AllContext ctx) {
        for (var union : ctx.union()) {
            visitUnion(union);
        }
        return null;
    }

    public static void main(String[] args) {
        String a = """
                import java.lang.String << string;
                import net.minecraft.item.Item << a ,
                net.minecraft.item.ItemStack << b;
                c = 1->2;
                d = 1<-2;
                e = 1<-1;""";
        CharStream c = CharStreams.fromString(a);
        XenCode4J17Lexer lexer = new XenCode4J17Lexer(c);
        CommonTokenStream co = new CommonTokenStream(lexer);
        XenCode4J17Parser p = new XenCode4J17Parser(co);
        J17Visit visit = new J17Visit();
        visit.visitAll(p.all());
        for (var ab : visit.importMap.keySet()) {
            System.out.println(ab);
        }
    }
}
