package com.capg.java8.DateAndTimeAPI;

import java.time.Year;
import java.util.Scanner;

public class LeapYearDemo {

    public static void main(String[] args) {

        // taking a year as input from user and checking whether it's a leap year or not
        // we will use the Year class here that has a    method to check leap year
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year :");
        int yearByUser = scanner.nextInt();
        //creating Year class object and passing user's entered year to it
        Year year = Year.of(yearByUser);
        if (year.isLeap()) {
            System.out.printf("The year %d is a Leap Year", yearByUser);
        } else {
            System.out.printf("Sorry %d Is Not a Leap Year", yearByUser);
        }


    }
}
