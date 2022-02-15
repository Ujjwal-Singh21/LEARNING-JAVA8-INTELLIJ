package com.capg.java8.Bi_Functional_Interfaces;

import java.util.function.BiPredicate;

public class BiPredicateExample2 {

    // using two palindrome to compare both and return true or false
    public static void main(String[] args) {

        // EXTRA PRACTISE
        // there are 3 default methods inside Bi-Predicate Interface which are and(), or(), negate()
        // and is used when both conditions should be true , or() is used when one condition true is enough
        // negate() is nothing but simply opposite of test() method of Bi-Predicate interface

        BiPredicate<String, String> equalPredicate = (s1, s2) -> s1.equals(s2);
        System.out.println(equalPredicate.test("Madam", "Madam "));

        // we will create another Bi-predicate here for and & or methods respectively
        //creating a length predicate to check the lengths of two input palindromes which are passed

        // and() method where both conditions should be true
        BiPredicate<String, String> lengthPredicate = (s1, s2) -> s1.length() == s2.length();
        boolean andOutput = lengthPredicate.and(equalPredicate).test("dalda", "dalda");
        System.out.println("and method output :" + andOutput);

        // or() method where any one of the condition should be true
        // HERE , It returns True because length method returns True
        boolean orOutput = lengthPredicate.or(equalPredicate).test("Hero", "zero");
        System.out.println("or method output :" + orOutput);


    }
}
