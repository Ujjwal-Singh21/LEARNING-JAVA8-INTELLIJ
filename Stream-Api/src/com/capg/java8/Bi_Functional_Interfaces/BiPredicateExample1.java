package com.capg.java8.Bi_Functional_Interfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample1 {

    // using two palindrome to compare both and return true or false
    public static void main(String[] args) {

        // approach-1 using anonymous class
        BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };
        System.out.println(biPredicate.test("Malyalam", "Malyalam"));

        // approach-2 using Lambda Expression
        BiPredicate<String, String> biPredicate2 = (s1, s2) -> s1.equals(s2);
        System.out.println(biPredicate2.test("Madam", "Madam "));

    }
}
