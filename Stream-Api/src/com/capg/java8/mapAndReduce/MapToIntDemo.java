package com.capg.java8.mapAndReduce;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MapToIntDemo {

    //The mapToInt() method returns an IntStream consisting of the results
    // of applying the given function to the elements of this stream.

    public static void main(String[] args) {

        // mapping String type into integer using mapToInt()
        String[] numbers = {"One","two","three","eight","six"};
        Stream<String> numbersStream = Stream.of(numbers);
        //numbersStream.mapToInt(i->i.length()).forEach(System.out::println);

        // mapping Long type into integer using mapToInt() and intValue() method
        Long[] salary = {10000L,12000L,15000L};
        Stream<Long> salaryStream = Stream.of(salary);
        salaryStream.mapToInt(i -> i.intValue()).forEach(System.out::println);

    }
}
