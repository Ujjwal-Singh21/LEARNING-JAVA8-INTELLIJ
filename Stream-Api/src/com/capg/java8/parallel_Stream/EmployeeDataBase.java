package com.capg.java8.parallel_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EmployeeDataBase {

    // Double.valueOf() -> The java.lang.Double.valueOf(double d) method
    // returns a Double instance representing the specified double value d
    // Random Class -> Random class is used to generate pseudo-random numbers in java
    public static List<Employee> getAllEmployee() {
        List<Employee> employee = new ArrayList<>();
        for (int i = 0; i <= 1000; i++) {
            employee.add(new Employee(i, "employee" + i, "A", Double.valueOf(new Random().nextInt(1000 * 100))));
        }
        return employee;
    }
}
