package com.capg.java8.mapAndReduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDataBase {

    public static List<Employee> getAllEmployee(){

        return Stream.of(
                new Employee(103,"Smith","A",89000),
                new Employee(101,"James","A",43000),
                new Employee(107,"Tony","A",41000),
                new Employee(109,"Albert","B",21000),
                new Employee(102,"Rajkumar","C",33000),
                new Employee(111,"Suresh","D",32000)
                ).collect(Collectors.toList());
    }
}
