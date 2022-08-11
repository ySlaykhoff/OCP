package LeoPractic.CH1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TestCH1 {
    public static void main(String[] args) {
        String str = String.valueOf(Character.toChars (128149));
        Map<Character,Integer> countDuplicate = countDuplicateCharacters("Hello world!");
        System.out.println(countDuplicate);
        Map<String, Long> countDuplicate2 = countDuplicateCharactersStreamU32("Hello world\uD83D\uDC95!"+str);
        System.out.println(countDuplicate2);
        Map<Character, Long> result = countDuplicateCharactersStream("Hello world!");
        System.out.println(result);

        System.out.println(str);
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

    public static Map<String, Long> countDuplicateCharactersStreamU32(String str) {
        Map<String, Long> result = str.codePoints()
                .mapToObj (c -> String.valueOf(Character.toChars (c))) .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
        return result;
    }
}
