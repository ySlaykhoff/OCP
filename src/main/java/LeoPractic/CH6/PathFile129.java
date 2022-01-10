package LeoPractic.CH6;

import java.nio.file.*;

public class PathFile129 {
    public static void main(String[] args) {
        Path path = Paths.get("/Temp/Исходный.pdf");
        System.out.println(path);
        Path path2 = FileSystems.getDefault().getPath("/Temp/Исходный.pdf");
        System.out.println(path2);
        String  baseDir  = System.getProperty("myprog.properties");
        System.out.println(baseDir);
    }
}
