package com.capg.java8.ExceptionHandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandling2 {

    public static void main(String[] args) {

        // In the previous approach we created separate method to handle exception but that is also not a good approach, because
        // we need to add all intermediate operations in a single stream or a single pipe , hence we are creating a method here
        // which will handle exception and also return Consumer object which is usually accepted by forEach method

        List<String> normalList = Arrays.asList("1", "55", "77");        // normal list
        List<String> abnormalList = Arrays.asList("23", "47", "xyz");   // list that can cause exception
        abnormalList.forEach(handleExceptionIfAny(s -> System.out.println(Integer.parseInt(s))));
    }

    static Consumer<String> handleExceptionIfAny(Consumer<String> input) {
        return obj -> {
            try {
                input.accept(obj);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        };
    }
}