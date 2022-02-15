package com.capg.java8.parallel_Stream;

import java.util.stream.IntStream;

public class ParallelStreamExample1 {

    public static void main(String[] args) {
        long start = 0;
        long end = 0;

        start = System.currentTimeMillis();
        IntStream.range(1, 10000).forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Plain Stream Total Time :" + (end - start));

        System.out.println("===============================================");

        start = System.currentTimeMillis();
        IntStream.range(1, 101).parallel().forEach(System.out::println);
        end = System.currentTimeMillis();
        System.out.println("Parallel Stream Total Time :" + (end - start));

        // comparison between single core and multicore

        //Single core
        IntStream.range(1, 10).forEach(a -> {
            System.out.println("Thread :" + Thread.currentThread().getName() + ":" + a);
        });

        //MultiCore
        IntStream.range(1, 10).parallel().forEach(a -> {
            System.out.println("Thread :" + Thread.currentThread().getName() + ":" + a);
        });


    }
}
