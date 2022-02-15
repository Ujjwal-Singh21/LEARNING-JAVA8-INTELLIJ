package com.capg.java8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

// methods in stream api
public class StreamDemo3 {
    public static void main(String[] args) {

        // our data
        List<Integer> integers = Arrays.asList(11, 25, 1, 3, 5, 7, 9, 9);
        Stream<String> citiesStream = Arrays.stream(new String[]{"Delhi", "Dehradun", "Chennai", "Bangalore", "Darbhanga"});

        //map
        integers.stream().map(e -> e * e).forEach(System.out::println);

        //filter
        integers.stream().filter(e -> e > 4).forEach(System.out::println);
        citiesStream.filter(e -> e.startsWith("D")).forEach(System.out::println);

        //sorted
        integers.stream().sorted().forEach(System.out::println); // natural default ascending order
        integers.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println); // descending order

        //min (returns an optional type always)
        Optional<Integer> minValue = integers.stream().min((x, y) -> x.compareTo(y));
        System.out.println("Min value :" + minValue);
        Integer integer = integers.stream().min((x, y) -> x.compareTo(y)).get();
        System.out.println("Min value :" + integer);

        //max
        Integer maxValue = integers.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println("Max Value :" + maxValue);

        //distinct
         integers.stream().distinct().forEach(System.out::println);
    }
}
