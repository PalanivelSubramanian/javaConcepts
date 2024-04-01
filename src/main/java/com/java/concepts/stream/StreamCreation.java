package com.java.concepts.stream;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreation {

    static List<String> list1 = Stream.<String>builder().add("one").add("two").add("three").build().collect(Collectors.toList());
    static List<Double> list2 = Stream.generate(Math::random).limit(10).collect(Collectors.toList());
    static List<Integer> list3_1 =  Stream.iterate(1, n -> n * 2).limit(10).collect(Collectors.toList());
    static List<Integer> list3_2 =  Stream.iterate(1, n -> n < 500, n -> n * 2).collect(Collectors.toList());
    static List<Integer> list4_1 = IntStream.range(1, 20).boxed().collect(Collectors.toList());
    static List<Integer> list4_2 = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
    static List<String> list5 = Stream.of("One", "Two", "Three").collect(Collectors.toList());
    static List<String> list6 = list1.stream().toList();
    static List<String> list7 = Arrays.stream(new String[] {"One", "Two", "Three"}).collect(Collectors.toList());
    static List<String> list8 = Pattern.compile(",").splitAsStream("abc,def,ghi").collect(Collectors.toList());
    public static void main(String... args) {
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("List3_1: " + list3_1);
        System.out.println("list3_2: " + list3_2);
        System.out.println("list4_1: " + list4_1);
        System.out.println("list4_2: " + list4_2);
        System.out.println("list5: " + list5);
        System.out.println("list6: " + list6);
        System.out.println("list7: " + list7);
        System.out.println("list8: " + list8);
    }

}
