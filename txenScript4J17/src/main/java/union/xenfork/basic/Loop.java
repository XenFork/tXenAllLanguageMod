package union.xenfork.basic;

import java.util.ArrayList;
import java.util.List;

import static union.xenfork.FileLoader.serialize;

public class Loop {
    private final int mode;//单纯的fori语句是0，foreach是1, while是2
    private final String loop_name;
    private int i1,in;//mode 0时适用
    private Object o1, o2;
    private String while_pre;
    private List<String> codes;

    public String getLoop_name() {
        return loop_name;
    }

    private final List<Object> objects = new ArrayList<>();

    public final List<Object> getObjects() {
        //外部只读
        return new ArrayList<>(objects);
    }

    public Loop(String str) {
        if (str.contains("foreach")) {
            mode = 1;
            loop_name = "foreach";
        } else if (str.contains("for")) {
            mode = 0;
            loop_name = "for";
        } else {
            mode = 2;
            loop_name = "while";
        }
        load(str);
    }

    public static void get(Loop loop) {
        loop.getObjects().forEach(object -> {
            if (object instanceof String str) {
                System.out.println(str);
            } else if (object instanceof Loop loop1) {
                get(loop1);
            }
        });
    }

    public int getMode() {
        return mode;
    }

    private void load(String str) {
        var pre = str.substring(0, str.indexOf("{")).replace(loop_name, "");
        var sub = str.substring(str.indexOf("{") + 1, str.lastIndexOf("}"));
        switch (getMode()) {
            case 0 -> {
              var tmp = pre.split("<<");
              i1 = Integer.parseInt(tmp[0].trim());
              in = Integer.parseInt(tmp[1].trim());
              codes = serialize(sub);
               /*
               for 1 << 7 {
                    for 2 << 13 {
                        print >> a;
                    }
               }检索为
               pre: i << 7
               sub: for 2 << 13 {
                    print >> a;
               }
                */
            }
            case 1 -> {
                var tmp = pre.split("<<");
                o1 = tmp[0];
                o2 = tmp[1];
                codes = serialize(sub);
                /*
                foreach i << some {
                    foreach j << some {
                        print >> j;
                    }
                }
                检索为
                pre: i << some
                sub:
                foreach j << some {
                        print >> j;
                }
                 */
            }
            case 2 -> {
                while_pre = pre;
                codes = serialize(sub);
                /*
                while k <= 10 {
                    while l <= 10 + k {
                        print >> l;
                    }
                }
                检索为
                pre k <= 10;
                sub:
                while l <= 10 + k {
                        print >> l;
                }
                 */
            }
        }
        for (var temp : codes) {
            if (temp.contains("for") || temp.contains("foreach") || temp.contains("while")) {
                objects.add(new Loop(temp));
            } else {
                objects.add(temp);
            }
        }
    }
}
