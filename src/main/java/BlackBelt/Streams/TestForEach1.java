package BlackBelt.Streams;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestForEach1 {


    public static void main(String[] args) {
        int[] array = {1,4,3,6,78,3,1,54};
        Arrays.stream(array).forEach(e-> {
            e *= 2;
            System.out.println(e);
        });
    }
}
