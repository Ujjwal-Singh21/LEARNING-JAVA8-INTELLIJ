package com.capg.java8.IntStreamMethodsDemo;

import java.util.stream.IntStream;

public class IntStreamOf {

    // IntStream of() returns a sequential intStream having a single element
    public static void main(String[] args) {

        IntStream intStream = IntStream.of(-7);
        intStream.forEach(System.out::println);


    }
}
