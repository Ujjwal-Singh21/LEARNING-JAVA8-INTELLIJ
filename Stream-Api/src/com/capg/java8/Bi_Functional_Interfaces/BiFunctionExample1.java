package com.capg.java8.Bi_Functional_Interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// (STEP-1) using traditional approach with separate implementation class
// taking two integers list with duplicate elements and returning a single list with unique distinct elements
public class BiFunctionExample1 implements BiFunction<List<Integer>,List<Integer>, List<Integer>> {

    @Override
    public List<Integer> apply(List<Integer> list1, List<Integer> list2) {  // line 16 can also be as flatMap(List::Stream)
        return Stream.of(list1,list2)
                .flatMap(integers -> integers.stream())
                .distinct()
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(74,32,44,56,98);
        List<Integer> list2 = Arrays.asList(83,22,44,56,99);
        BiFunction biFunction = new BiFunctionExample1();
        System.out.println("Traditional Approach :" +biFunction.apply(list1,list2));
    }
}
