package BlackBelt.Streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("sdcsdsvd");
        list.add("sdcs");
        list.add("sdcs4wrwsd");
        list.add("sdcsdsv");

        List<Integer> intList = list.stream().map(e->e.length()).collect(Collectors.toList());

        System.out.println(intList);

        int[] array = {5,7,9,3,18,7};

        array = Arrays.stream(array).map(e->{
            if (e % 3 == 0){
                e = e/3;
            }
            return e;
        }).toArray();

        System.out.println(Arrays.toString(array));
    }
}
