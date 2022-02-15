package com.capg.java.practiceRandomScenarios;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

    // returning the size/ count of duplicate numbers

    public static List<Integer> findOnlyDuplicatesInStream(Stream<Integer> stream) {
        Set<Integer> set = new HashSet<>();

        return stream.filter(n -> !set.add(n)).collect(Collectors.toList());


    }

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(11, 11, 13, 17, 32, 32, 87, 87);
        List<Integer> duplicatesList = findOnlyDuplicatesInStream(stream);
        System.out.println(duplicatesList.size());
    }
}
