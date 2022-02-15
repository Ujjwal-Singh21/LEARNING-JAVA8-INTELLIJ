package com.capg.java8.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// Stream api is not only limited to collections Interface
// different ways to get a stream object or use  Static methods available in stream
public class StreamDemo2 {

    public static void main(String[] args) {

        // step-1 creating a blank stream object using "empty() method"
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(e -> System.out.println(e));

        // step-2 using stream methods on simple Arrays, collections, object using "of method"
        String[] Names = {"Ujjwal", "Ankit", "Anurag", "Syed"};

        Stream<String> stream1 = Stream.of(Names);
        stream1.forEach(e -> System.out.println(e));

        // step-3 using builder() method of stream interface
        Stream<Object> builder = Stream.builder().build();

        // step-4 using direct Stream methods on any arrays but return type and variable matters here eg:IntStream
        // otherwise class cast exception
        Stream<String> stream2 = Arrays.stream(new String[]{"Raj", "Prashant", "Vasu", "Avinash"});
        stream2.forEach(e -> System.out.println(e));

        IntStream stream3 = Arrays.stream(new int[]{2, 3, 4, 7, 8});
        stream3.forEach(s -> System.out.println(s));

        // step-5 using normally on collections by direct stream() method on reference of List,set etc interfaces
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(22);
        arrayList.add(34);
        arrayList.add(43);
        arrayList.add(98);
        arrayList.add(11);

        arrayList.stream().filter(e -> e > 30).forEach(System.out::println);


    }
}
