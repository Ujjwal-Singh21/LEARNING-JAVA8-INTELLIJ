package com.capg.java8.parallel_Stream;

import java.util.List;

public class ParallelStreamExample2 {
    public static void main(String[] args) {

        List<Employee> employees = EmployeeDataBase.getAllEmployee();

        long start=0;
        long end =0;

        // case-1 for time comparison between normal vs parallel stream
        // printing full 1000 employee data
//        start=System.currentTimeMillis();
//        employees.stream().forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("Exection time for normal Stream :" +(end-start));
//
//        System.out.println("******************************************");
//
//        start=System.currentTimeMillis();
//        employees.parallelStream().forEach(System.out::println);
//        end=System.currentTimeMillis();
//        System.out.println("Exection time for parallel Stream :" +(end-start));

        // (case-2) for time comparison between normal vs parallel stream
        // printing average salaries
        start=System.currentTimeMillis();

        double salaryWithStream = employees.stream()
                .map(employee -> employee.getSalary())
                .mapToDouble(i -> i)
                .average().getAsDouble();

        end=System.currentTimeMillis();
        System.out.println("Exection time for normal Stream :" +(end-start) +" : Avg Salary : " +salaryWithStream);
        //System.out.println(salaryWithStream);

        System.out.println("****************************************");

        start=System.currentTimeMillis();

     double salaryWithParallelStream =   employees.parallelStream()
             .map(Employee::getSalary) // Method reference used, can also be written as map(employee->employee.getSalary)
             .mapToDouble(i->i)
             .average().getAsDouble();

     end=System.currentTimeMillis();
        System.out.println("Exection time for Parallel Stream :" +(end-start) +" : Avg Salary : " +salaryWithParallelStream);

    }
}
