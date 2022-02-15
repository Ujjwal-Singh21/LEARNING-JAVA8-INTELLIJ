package com.capg.java8.IntStreamMethodsDemo;

import java.util.stream.IntStream;

public class IntStreamRange {

    public static void main(String[] args) {
        IntStream stream = IntStream.range(2, 20); // prints from 2 to 19
        stream.forEach(System.out::println);
    }
}
