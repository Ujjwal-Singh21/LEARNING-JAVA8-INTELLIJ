package com.capg.java8.DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class DateAndTimeDemo4 {
    // Using Period class which has a between() static method to calculate birthday in detail
    public static void main(String[] args) {

        LocalDate birthdayDate = LocalDate.of(1998, 05, 21);
        LocalDate todayDate = LocalDate.now();
        Period period = Period.between(birthdayDate, todayDate);
        System.out.println("Your age is " + period.getYears() + " Years " + period.getMonths() + " Months And " + period.getDays() + " Days ");

        //printing the same exact thing using printf() method
        System.out.printf("Your Age is %d Years %d Months and %d Days", period.getYears(),period.getMonths(),period.getDays());

        LocalDate endDay = LocalDate.of(1998+60,9,25);
        Period period2 = Period.between(todayDate,endDay);
        int d = period2.getYears()*365+period2.getMonths()+30+period2.getDays();
        System.out.println("\n End Date Comes in "+d+" days from today");
    }
}
