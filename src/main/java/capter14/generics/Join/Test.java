package capter14.generics.Join;

import java.util.*;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;


public class Test {
    public static void main(String[] args) {
        testJoin();
    }

    public static void testJoin(){
        List<Pair<Integer, String>> list1 = new ArrayList<>();
        Pair<Integer, String> pair1 = new Pair<>(0,"Shop");
        Pair<Integer, String> pair2 = new Pair<>(1,"Bakery");
        Pair<Integer, String> pair3 = new Pair<>(2,"Meat");
        list1.add(pair1);
        list1.add(pair2);
        list1.add(pair3);

        List<Pair<Integer, String>> list2 = new ArrayList<>();
        Pair<Integer, String> pair20 = new Pair<>(0,"Perekrestok");
        Pair<Integer, String> pair21 = new Pair<>(0,"Pyatorochka");
        Pair<Integer, String> pair22 = new Pair<>(0,"Magnit");
        Pair<Integer, String> pair23 = new Pair<>(1,"Baton");
        Pair<Integer, String> pair24 = new Pair<>(1,"Kruosan");
        Pair<Integer, String> pair25 = new Pair<>(2,"Kuriza");
        Pair<Integer, String> pair26 = new Pair<>(2,"Svinina");
        list2.add(pair20);
        list2.add(pair21);
        list2.add(pair22);
        list2.add(pair23);
        list2.add(pair24);
        list2.add(pair25);
        list2.add(pair26);

        PrintListPair(list1);
        System.out.println("============================================================");
        PrintListPair(list2);
        System.out.println("============================================================");
        List<Triple<Integer, String, String>> tripleList1 = nestedLoopsJoin(list1,list2);
        System.out.println("nestedLoopsJoin");
        PrintListTriple(tripleList1);
        System.out.println("============================================================");
        List<Triple<Integer, String, String>> tripleList2 = hashJoinGuava(list1,list2);
        System.out.println("hashJoinGuava");
        PrintListTriple(tripleList2);
        System.out.println("============================================================");
        List<Triple<Integer, String, String>> tripleList3 = hashJoin(list1,list2);
        System.out.println("hashJoin");
        PrintListTriple(tripleList3);
        System.out.println("============================================================");
        List<Triple<Integer, String, String>> tripleList4 = hashJoin2(list1,list2);
        System.out.println("hashJoin2");
        PrintListTriple(tripleList4);

    }

    public static <K, V> void PrintListPair(List<Pair<K,V>> list){
        for (Pair pair : list){
            System.out.print("key:" + pair.getKey() + " value:" + pair.getValue());
            System.out.println();
        }

    }

    public static <K, V1, V2> void PrintListTriple(List<Triple<K,V1,V2>> list){
        for (Triple triple : list){
            System.out.print("key:" + triple.getKey() + " value1:" + triple.getValue1() + " value2:" + triple.getValue2());
            System.out.println();
        }

    }

    public static  <K, V1, V2> List<Triple<K, V1, V2>> nestedLoopsJoin(List<Pair<K, V1>> left, List<Pair<K, V2>> right) {
        List<Triple<K, V1, V2>> result = new ArrayList<>();
        for (Pair<K, V1> leftPair: left) {
            for (Pair<K, V2> rightPair: right) {
                if (Objects.equals(leftPair.getKey(), rightPair.getKey())) {
                    result.add(new Triple<>(leftPair.getKey(), leftPair.getValue(), rightPair.getValue()));
                }
            }
        }
        return result;
    }

    public static  <K, V1, V2> List<Triple<K, V1, V2>> hashJoin(List<Pair<K, V1>> left, List<Pair<K, V2>> right) {
        Map<K, V2> hash = new HashMap<>(right.size());
        for (Pair<K, V2> rightPair: right) {
            hash.put(rightPair.getKey(), rightPair.getValue());
        }

        List<Triple<K, V1, V2>> result = new ArrayList<>();
        for (Pair<K, V1> leftPair: left) {
            if (hash.containsKey(leftPair.getKey())) {
                result.add(new Triple<>(leftPair.getKey(), leftPair.getValue(), hash.get(leftPair.getKey())));
            }
        }

        return result;
    }

    public static  <K, V1, V2> List<Triple<K, V1, V2>> hashJoin2(List<Pair<K, V1>> left, List<Pair<K, V2>> right) {
        Map<K, List<V2>> hash = new HashMap<>(right.size());
        for (Pair<K, V2> rightPair : right) {

            if (hash.get(rightPair.getKey()) == null) {
                List<V2> listValue = new ArrayList<>();
                listValue.add(rightPair.getValue());
                hash.put(rightPair.getKey(), listValue);
            } else {
                List<V2> listValue = hash.get(rightPair.getKey());
                listValue.add(rightPair.getValue());
                hash.put(rightPair.getKey(), listValue);
            }

        }

        List<Triple<K, V1, V2>> result = new ArrayList<>();
        for (Pair<K, V1> leftPair : left) {
            if (hash.containsKey(leftPair.getKey())) {
                for (V2 element : hash.get(leftPair.getKey())) {
                    result.add(new Triple<K, V1, V2>(leftPair.getKey(), leftPair.getValue(), (V2) element));
                }
            }
        }
        return result;
    }
    public static  <K, V1, V2> List<Triple<K, V1, V2>> hashJoinGuava(List<Pair<K, V1>> left, List<Pair<K, V2>> right) {
        Multimap<K, V2> hash = ArrayListMultimap.create();
        for (Pair<K, V2> rightPair: right) {
            hash.put(rightPair.getKey(), rightPair.getValue());
        }

        List<Triple<K, V1, V2>> result = new ArrayList<>();
        for (Pair<K, V1> leftPair: left) {
            if (hash.containsKey(leftPair.getKey())) {
                result.add(new Triple<K, V1, V2>(leftPair.getKey(), leftPair.getValue(), (V2)hash.get(leftPair.getKey())));
            }
        }

        return result;
    }
}
