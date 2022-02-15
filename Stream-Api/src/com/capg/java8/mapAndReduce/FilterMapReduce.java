package com.capg.java8.mapAndReduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterMapReduce {

    public static void main(String[] args) {

        // getting sum of all grade A salaries
        // My way
       List<Employee> gradeA = EmployeeDataBase.getAllEmployee().stream().filter(employee -> employee.getGrade() == "A").collect(Collectors.toList());
        List<Double> salaryOfGradeA = gradeA.stream().map(employee -> employee.getSalary()).collect(Collectors.toList());
        double sum = salaryOfGradeA.stream().mapToDouble(i -> i).sum();
        System.out.println("sum of all grade A salaries :" +sum);

        // Java Techie Way
        // getting sum of all other grade salaries
       double otherGradesSalary = EmployeeDataBase.getAllEmployee().stream()
               .filter(employee -> employee.getGrade()!="A")
                .map(employee -> employee.getSalary())
                .mapToDouble(i->i)
                .sum();
        System.out.println("Sum of all other Grade Salaries :" +otherGradesSalary);

        // Java Techie Way average salary of all Grade-A
      double averageGradeAsalary =  EmployeeDataBase.getAllEmployee().stream()
                 .filter(employee -> employee.getGrade()=="A")
                 .map(employee->employee.getSalary())
                 .mapToDouble(i->i)
              .average()
              .getAsDouble();
        System.out.println("average salary of all Grade-A :"+averageGradeAsalary);


    }
}
