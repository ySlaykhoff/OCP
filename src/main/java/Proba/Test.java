package Proba;

import java.util.*;
import java.io.*;

class Test {
    public static void main(String[] args) throws IOException {
       Scanner scanner = new Scanner(System.in);
        int i = 1;
        List<String> list = new ArrayList<>();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            list.add(line);
        }
        scanner.close();
        for (String str : list
             ) {
            System.out.println(i + " " + str);
            i++;
        }
    }

}
