package union.xenfork;

import java.io.File;
import java.io.IOException;
import java.util.*;

import static union.xenfork.FileLoader.loadFile;

public class TXen {
    public static Map<Integer, FileLoader> fileLoaderMap = new HashMap<>();
    private static int i = 0, j = 0;
    public static List<String> extension = new ArrayList<>();
    public static Map<String, Record> gobal = new HashMap<>();//全局变量
    public static void main(String[] args) throws IOException {
        extension.add(".xs");
        var files = loadFile(new File(System.getProperty("user.dir"), "test"));
        XenLoad tXen = new XenLoad();
        List<File> tmp = new ArrayList<>(files);
        while (!tmp.isEmpty()) {
            for (var file : files) {
                FileLoader fileLoader = new FileLoader(file);
                tXen.loadPriority(fileLoader.toString());
                if (tXen.getPriority()==i && tXen.getPriority() >= 0) {
                    if (!fileLoaderMap.containsKey(i)) {
                        fileLoaderMap.put(j + i, fileLoader);
                        tmp.removeIf(file1 -> file1.equals(file));
                    } else {
                        j++;
                        fileLoaderMap.put(j + i, fileLoader);
                        tmp.removeIf(file1 -> file1.equals(file));
                    }
                }
            }
            int k = 0;
            for (var temp : tmp) {
                tXen.loadXenScript(new FileLoader(temp).toString());
                if (tXen.getPriority() >= 0) {
                    k++;
                }
            }
            if (k == 0) {
                break;
            }
            i++;
        }
        for (var temp : tmp) {
            FileLoader fileLoader = new FileLoader(temp);
            fileLoaderMap.put(i + j + 10, fileLoader);
        }

        for (var map : fileLoaderMap.values()) {
            System.out.println(map);
            tXen.loadXenScript(map.toString());
        }
    }

}