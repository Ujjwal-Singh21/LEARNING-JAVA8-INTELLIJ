package com.capg.java8.streamapi;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(333);
        set.add(333);
        set.add(31);
        set.add(22);
        set.add(55);
        set.add(1);

        Integer reduce = set.stream().sorted().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);

        Optional<Integer> reduce1 = set.stream().sorted().reduce((x, y) -> x * y);
        System.out.println(reduce1);

    }
}
