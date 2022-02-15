package com.capg.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo1 {

    public static void main(String[] args) {

        // method-1 to create list
        List<Integer> list1 = new ArrayList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);

        // method-2 to create list (Unmuttable)
        List<Integer> list2 = List.of(22, 3, 45, 67, 89, 89);
        list2.forEach(System.out::println);

        // method-3 to create list(unmuttable)
        List<Integer> list3 = Arrays.asList(33, 4, 56, 78, 91);
        System.out.println(list3);

        // using normal java code without stream (print even numbers)
        for (Integer i : list1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // using stream to print same logic (print even numbers)
        list1.stream().filter(c -> c % 2 == 0).forEach(System.out::println);

        // using old java (for printing elements above 20 from list 2)
        for (Integer i2 : list2) {
            if (i2 > 20) {
                System.out.println("using old java above twenty :" + i2);
            }
        }

        // using stream api (for printing elements above 20 from list 2)
        Set<Integer> newList = list2.stream().filter(i -> i > 20).collect(Collectors.toSet());
        System.out.println("using stream above twenty :" + newList);
        List<Integer> newList2 = list2.stream().filter(i -> i > 20).collect(Collectors.toList());
        System.out.println("using stream above twenty :" + newList2);


    }
}
