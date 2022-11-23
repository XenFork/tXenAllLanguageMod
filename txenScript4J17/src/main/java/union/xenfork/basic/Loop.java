package union.xenfork.basic;

import java.util.ArrayList;
import java.util.List;

public class Loop {
    private final int mode;//单纯的fori语句是0，foreach是1, while是2
    private final String s;
    private int i1,in;//mode 0时适用
    private final List<Object> objects = new ArrayList<>();
    public Loop(String str) {
        if (str.contains("foreach")) {
            mode = 1;
            s = "foreach";
        } else if (str.contains("for")) {
            mode = 0;
            s = "for";
        } else {
            mode = 2;
            s = "while";
        }
    }

    public int getMode() {
        return mode;
    }

    public void load(String str) {
        var pre = str.substring(0, str.indexOf("{")).replace(s, "");
        var sub = str.substring(str.indexOf("{") + 1, str.lastIndexOf("}"));
        switch (getMode()) {
            case 0 -> {
              var tmp = pre.split("<<");
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

            }
            case 2 -> {

            }
        }
    }
}
