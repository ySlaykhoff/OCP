package LeoPractic.CH1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestCH1 {
    public static void main(String[] args) {
        Map<Character,Integer> countDuplicate = countDuplicateCharacters("Hello world!");
        System.out.println(countDuplicate);
        Map<Character, Long> result = countDuplicateCharactersStream("Hello world!");
        System.out.println(result);
    }

    public static Map<Character, Integer> countDuplicateCharacters(String strLine) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : strLine.toCharArray()) {
            result.compute(ch, (K, V) -> (V == null) ? V = 1 : ++V);
        }
        return result;
    }

    public static Map<Character, Long> countDuplicateCharactersStream(String strLine) {
        Map<Character, Long> result = strLine.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(c -> c,Collectors.counting()));
        return result;
    }
}
