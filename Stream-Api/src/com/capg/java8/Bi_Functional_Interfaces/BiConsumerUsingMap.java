package com.capg.java8.Bi_Functional_Interfaces;

import java.util.LinkedHashMap;
import java.util.Map;

// we will take a map here and use overridden forEach() method that takes Bi-Consumer as input
public class BiConsumerUsingMap {

    public static void main(String[] args) {

        Map<String, Integer> employeeData = new LinkedHashMap<>();
        employeeData.put("Rajesh", 4500);
        employeeData.put("Vikas", 6600);
        employeeData.put("Sameer", 7700);
        employeeData.put("Vinay", 9500);

        employeeData.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));
    }
}
