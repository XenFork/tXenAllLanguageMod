package union.xenfork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.*;

import static union.xenfork.FileLoader.loadFile;

public class TXen {
    public static List<String> extension = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        //test
        init();
    }
    public static void init() throws IOException {
        //注入添加后缀名
        extension.add(".xs");
        File file = new File(System.getProperty("user.dir"), "test");
        var a = loadFile(file);
        for (var b : a) {
            if (b.getName().contains(".xs")) {
//                extension = readXenCode(b);
                var fileLoader = new FileLoader(b);
            }
        }
    }


}
