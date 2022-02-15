package com.capg.java8.ExceptionHandling;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExceptionHandling1 {

    public static void main(String[] args) {
        // taking a list of integers as string and parsing it into integers by 2 approaches
        List<String> list1 = Arrays.asList("1", "55", "77");
        // input list for SCENARIO-1 :-
        List<String> list2 = Arrays.asList("1", "4", "xyz");

        // APPROACH-1 (using stream and map method)
        List<Integer> integers1 = list1.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println("Output using map :" + integers1);
        // or using method reference for same thing inside map method
        List<Integer> integers2 = list1.stream().map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(" map with Method Reference :" + integers2);

        // APPROACH-2 (using foreach method)
        list1.forEach(s -> System.out.println("Output using forEach :" + Integer.parseInt(s)));

        // SCENARIO-1 :-
        // now if someone passes "xyz" in list instead of integers as string then ,
        // we will get numberFormat exception, hence we will add try catch in forEach to handle that exception
        list2.forEach(s -> {
            try {
                System.out.println(" try catch inside forEach :" + Integer.parseInt(s));
            } catch (Exception exception) {
                System.out.println("Handling exception :" + exception.getMessage());
            }
        });

        // SCENARIO-2 :-
        // the syntax in scenario-1 is not easily readable, also this is not recommended way to handle using try catch
        // inside foreach method when we are using Lambda , Ideally when we are writing pipeline code using lambda, we should
        // keep each intermediate operation as a single line, otherwise there is no need of using lambda, hence instead of
        // forEach u can use enhanced for loop and perform operation with try catch, hence to overcome all this we can use
        // separate printing method with try catch and call it using forEach with method reference
        list2.forEach(ExceptionHandling1::printList);
    }

    public static void printList(String s) {
        try {
            System.out.println(" try catch inside printList Method :" + Integer.parseInt(s));
        } catch (Exception exception) {
            System.out.println("Handling exception :" + exception.getMessage());
        }
    }

}
