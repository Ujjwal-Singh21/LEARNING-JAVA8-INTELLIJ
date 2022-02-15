package com.capg.java8.Bi_Functional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// (STEP-2) using anonymous class approach
public class BiFunctionExample2 {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(74, 32, 44, 56, 98);
        List<Integer> list2 = Arrays.asList(83, 22, 44, 56, 99);

        BiFunction biFunction = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {

            @Override
            public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
                return Stream.of(list1, list2).flatMap(integers -> integers.stream())
                        .distinct()
                        .collect(Collectors.toList());
            }
        };
        System.out.println("Anonymous Approach :" + biFunction.apply(list1, list2));

        // (STEP-3) using lambda approach
        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction2 = (l1, l2) -> {
            return Stream.of(l1, l2).flatMap(integers -> integers.stream())
                    .distinct()
                    .collect(Collectors.toList());
        };
        System.out.println("Lambda Approach :" + biFunction.apply(list1, list2));

        // (STEP-4) output is in random order and if we want to get a sorted order output then,
        // here we will create a Function Interface that takes output from BiFunction and sort it
        // also we are using here andThen() method that is available in BiFunction interface
        // for doing some extra operation, this method can be used after getting output from bi-function
        BiFunction<List<Integer>, List<Integer>, List<Integer>> biFunction3 = (l1, l2) -> {
            return Stream.of(l1, l2).flatMap(integers -> integers.stream())
                    .distinct()
                    .collect(Collectors.toList());
        };
        // creating an extra Function for sorting purpose
        Function<List<Integer>, List<Integer>> sortedList = (unsortedList) -> unsortedList.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Sorted Approach :" + biFunction3.andThen(sortedList).apply(list1, list2));

    }
}
