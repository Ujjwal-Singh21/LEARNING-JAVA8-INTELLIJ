package com.capg.java8.mapAndReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// whenever using reduce() method with single argument always use get method
public class MapAndReduce1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 4, 3, 6, 8, 9);
        // traditional approach to sum all values in list
        int sum = 0;
        for (int numbers : list) {
            sum = sum + numbers;
        }
        System.out.println("Traditional Approach :" + sum);

        //(Step-1) using mapToInt() to get and covert values to int and
        // stream provided sum() reduction method to sum all
        int sum1 = list.stream().mapToInt(i -> i).sum();
        System.out.println("Using sum method :" + sum1);

        // (step-2)using reduce() method with 2 arguments
        Integer reduceSum = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println("ReduceSum :" + reduceSum);

        // (step-3) using method reference and another reduce() method with 1 argument
        // The sum() method of Java Integer class numerically returns the sum of its arguments specified by a user
        Optional<Integer> reduceSum2 = list.stream().reduce(Integer::sum);
        System.out.println("ReduceSum2 :" + reduceSum2.get());

        // (step-3.1) same thing in another way
        Integer reduceSumWithMethodReference = list.stream().reduce(Integer::sum).get();
        System.out.println("ReduceSumWithMethodReference :" + reduceSumWithMethodReference);

        // (step-4) reduce() method for multiply
        Integer reduceForMultiply = list.stream().reduce(1, (x, y) -> x * y);
        System.out.println("MultiplyResult :" + reduceForMultiply);

        // (step-5) reduce() method for finding max from list
        Integer maxReduce = list.stream().reduce(0, (m, n) -> m > n ? m : n);
        System.out.println("MaxReduce1 :" + maxReduce);

        // (step-5.1) same using method reference
        Integer maxReduce2 = list.stream().reduce(Integer::max).get();
        System.out.println("MaxReduce1 :" +maxReduce2);

    }
}
