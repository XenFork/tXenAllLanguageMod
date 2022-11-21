package union.xenfork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import static union.xenfork.FileLoader.loadFile;

public class TXen {
    public static final List<String> extension = new ArrayList<>();
    public static final List<List<String>> listListString = new ArrayList<>();
    public static boolean b = true;
    public static void main(String[] args) throws IOException {
        //test
        init();
        File file = new File(System.getProperty("user.dir"), "test");
        var a = loadFile(file);
        for (var b : a) {
            if (b.getName().contains(".xs")) {
                listListString.add(readXen(b));
            }
        }
        for (var l : listListString) {
            for (var k : l) {
                System.out.println(k);
            }
        }
    }


    public static List<String> readXen(File file) throws IOException {
        final List<String> list = new ArrayList<>();
        final Map<Integer, List<String>> map = new HashMap<>();//以后会用到
        Path path = file.toPath();
        Scanner scanner = new Scanner(path);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (b) list.add(delete_note(line).replaceAll(" {2}", " "));
            if (line.contains("/*") && !line.contains("*/")) {
                b = false;
                list.add(delete_note(line));
            } else if (line.contains("*/")) b = true;
        }
        return list;
    }

    //删除注释
    public static String delete_note(String line) {
        String line_ = line;
        if (line_.contains("//")) {
            line_ = line_.substring(0, line_.indexOf("//"));
        }
        while (line_.contains("/*")) {
            if (line_.contains("*/")) {
                line_ = line_.substring(0, line_.indexOf("/*")) + line_.substring(line_.indexOf("*/") + 2);
            } else {
                line_ = line_.substring(0, line_.indexOf("/*"));
            }
        }
        if (line_.contains("*/")) {
            line_ = line_.substring(line_.indexOf("*/") + 2);
        }
        return line_;
    }


    public static void init() {
        //注入添加后缀名
        extension.add(".xs");
    }


}
