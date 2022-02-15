package com.capg.java8.Bi_Functional_Interfaces;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctionUsingMap {

    // taking String : name , and Integer : salary as input to Bi-Function and increasing salary by 1000
    // using replaceAll() method here that takes Bi-Function as input
    public static void main(String[] args) {

        Map<String, Integer> employeeData = new LinkedHashMap<>();
        employeeData.put("Rajesh", 4500);
        employeeData.put("Vikas", 6600);
        employeeData.put("Sameer", 7700);
        employeeData.put("Vinay", 9500);

        // (STEP-1) using anonymous approach
        BiFunction<String, Integer, Integer> newEmployeeData = new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String Key, Integer salaryAsValue) {
                return salaryAsValue + 1000;
            }
        };
        employeeData.replaceAll(newEmployeeData);  // takes biFunction as input
        System.out.println("Anonymous Approach :" + employeeData);

        // (STEP-2) using Lambda approach
        BiFunction<String, Integer, Integer> newEmployeeData1 = (Key, salaryAsValue) -> salaryAsValue + 2000;
        employeeData.replaceAll(newEmployeeData1);  // takes biFunction as input
        System.out.println("Lambda Approach :" + employeeData);

        // (STEP-3) More Simplified Lambda approach
        // passing lambda of Bi-function directly to replaceAll() method instead of passing reference
        employeeData.replaceAll((Key, salaryAsValue) -> salaryAsValue + 3000); // takes biFunction as input
        System.out.println("Simplified Lambda Approach :" + employeeData);


    }
}
