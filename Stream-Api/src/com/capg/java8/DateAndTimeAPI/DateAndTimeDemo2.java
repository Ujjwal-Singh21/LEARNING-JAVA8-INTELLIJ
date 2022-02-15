package com.capg.java8.DateAndTimeAPI;

import java.time.LocalDateTime;

public class DateAndTimeDemo2 {

    public static void main(String[] args) {
       // using LocalDateTime class to get both date and time at a time
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Date and Time :" +localDateTime);

     // getting all separately from this common class
        // DATE
        int dd = localDateTime.getDayOfMonth();
        int mm = localDateTime.getMonthValue();
        int yyyy = localDateTime.getYear();
        System.out.printf("%d-%d-%d", dd, mm, yyyy); // using -  as (17-12-2021)

        // TIME
        int hour = localDateTime.getHour();
        int min = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        int nanoSec = localDateTime.getNano();
        System.out.printf("\n %d:%d:%d:%d", hour, min, second, nanoSec); // using : as (05:13:23:123)
    }

}
