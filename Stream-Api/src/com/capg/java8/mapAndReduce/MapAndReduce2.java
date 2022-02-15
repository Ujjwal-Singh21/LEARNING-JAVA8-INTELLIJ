package com.capg.java8.mapAndReduce;

import java.util.Arrays;
import java.util.List;

public class MapAndReduce2 {
    public static void main(String[] args) {

        // whenever using reduce() method with single argument always use get method
        List<String> stringList = Arrays.asList("Ujjwal", "Steve", "Sudhakar", "Roy");

        String newStringList = stringList.stream().reduce((a, b) -> a.length() > b.length() ? a : b).get();
        System.out.println(newStringList);

    }
}