package union.xenfork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import static union.xenfork.FileLoader.loadFile;

public class TXen {
    public static List<String> extension = new ArrayList<>();
    public static final List<List<String>> listListString = new ArrayList<>();
    public static boolean b = true;
    public static boolean isMethod = false;
    public static void main(String[] args) throws IOException {
        //test
        init();
        File file = new File(System.getProperty("user.dir"), "test");
        var a = loadFile(file);
        for (var b : a) {
            if (b.getName().contains(".xs")) {
                extension = readXenCode(b);
            }
        }
        for (var d : extension) {
            System.out.println(d);
        }
    }

    public static List<String> readXenCode(File file) throws IOException {
        final List<String> codes = new ArrayList<>();
        Scanner scanner = new Scanner(file.toPath());
        StringBuilder sb = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();

            if (b) {
                if (line.contains("{")) {
                    isMethod = true;
                }
                if (isMethod) {
                    if (line.contains("}")) {
                        isMethod = false;
                        sb.append(delete_note(line));
                        codes.add(sb.toString());
                        sb = new StringBuilder();
                    } else {
                        sb.append(delete_note(line));
                    }
                } else {
                    if (line.contains(";")) {
                        sb.append(delete_note(line));
                        codes.add(sb.toString());

                        sb = new StringBuilder();
                    } else {
                        sb.append(delete_note(line));
                    }
                }

            }
            if (line.contains("/*") && !line.contains("*/")) {
                b = false;
                sb.append(delete_note(line));
            } else if (line.contains("*/")) {
                b = true;
                sb.append(delete_note(line));
            }

        }
        return codes;
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
