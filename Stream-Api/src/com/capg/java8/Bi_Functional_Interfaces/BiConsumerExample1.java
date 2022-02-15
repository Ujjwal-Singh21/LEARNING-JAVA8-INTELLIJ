package com.capg.java8.Bi_Functional_Interfaces;

import java.util.function.BiConsumer;

//Bi-Consumer takes two input of both any type and returns nothing , just print it if wanted.
//approach-1  traditional approach using Separate anonymous class
public class BiConsumerExample1 implements BiConsumer<String, Integer> {

    @Override
    public void accept(String s, Integer i) {
        System.out.println("Traditional Input :" + s + "," + i);
    }

    public static void main(String[] args) {

        BiConsumer biConsumer = new BiConsumerExample1();
        biConsumer.accept("Ujjwal Singh", 1998);

        //approach-2 using anonymous class
        BiConsumer<String, Integer> biConsumer2 = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer i) {
                System.out.println("Anonymous input :" + s + "," + i);
            }
        };
        biConsumer2.accept("MS Dhoni", 1987);

        // approach-3 using Lambda
        BiConsumer<String, Integer> biConsumer3 = (s, i) -> System.out.println("Lambda input : " + s + "," + i);
        biConsumer2.accept("Virat Kohli", 1992);

    }
}
