package union.xenfork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TXen {
    public static final List<String> extension = new ArrayList<>();
    public static void main(String[] args) {
        //test
        init();
        File file = new File(System.getProperty("user.dir"), "test");
        var a = loadFile(file);
        for (var b : a) {
            System.out.println(b);
            try {
                read(b);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void read(File file) throws IOException {
        Path path = file.toPath();
        Scanner scanner = new Scanner(path);
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    }


    public static void init() {
        //注入添加后缀名
        extension.add(".xs");
    }
    //写入教科书式的读取文件列表
    public static List<File> loadFile(File file) {
        List<File> files = new ArrayList<>();
        final var listFiles = file.listFiles();
        final var stream = extension.stream();
        if (listFiles != null)
            for (var f : listFiles)
                if (f.isDirectory())
                    files.addAll(loadFile(f));
                else
                    stream.filter(e -> f.getName().contains(e)).map(e -> f).forEach(files::add);
        return files;
    }

}
