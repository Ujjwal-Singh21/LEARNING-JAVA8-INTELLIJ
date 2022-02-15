package com.capg.java8.IntStreamMethodsDemo;

import java.util.stream.IntStream;

public class IntStreamSum {

    public static void main(String[] args) {

        int sum = IntStream.range(2, 10).filter(value -> value % 3 == 0).sum();
        System.out.println(sum);

        int result = IntStream.range(12, 22).reduce(0, (a, b) -> a + b);
        System.out.println(result);
    }
}
