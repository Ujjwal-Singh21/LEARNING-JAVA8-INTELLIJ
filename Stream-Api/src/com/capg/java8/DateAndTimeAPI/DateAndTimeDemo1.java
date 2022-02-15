package com.capg.java8.DateAndTimeAPI;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class DateAndTimeDemo1 {
    public static void main(String[] args) {
        //JODA-TIME API other name for Date and Time Api

        // (step-1) to get month using MONTH interface
        LocalDate date = LocalDate.now();
        Month month = date.getMonth();
        int year = date.getYear();
        System.out.println("Month :" + month + " Year :" + year);

        // (step-2) to get local date
        LocalDate date1 = LocalDate.now();
        System.out.println("DATE :" +date1);

        // (step-2.1) to get day, month , year from local date separately and print according to our wish
        int dd = date.getDayOfMonth();
        int mm = date.getMonthValue();
        int yyyy = date.getYear();
        System.out.println(dd + ".." + mm + ".." + yyyy); // using dot spaces
        System.out.printf("%d-%d-%d", dd, mm, yyyy); // using -  as (17-12-2021)

        // (step-3) to get local time
        LocalTime time = LocalTime.now();
        System.out.println("\n TIME :" + time);

        // (step-3.1) to get hour, min, second, nanosecond from local time separately, and print according to our wish
        int hour = time.getHour();
        int min = time.getMinute();
        int second = time.getSecond();
        int nanoSec = time.getNano();
        System.out.println(hour + ".." + min + ".." + second + ".." + nanoSec); // using dot spaces
        System.out.printf("%d:%d:%d:%d", hour, min, second, nanoSec); // using : as (05:13:23:123)

    }
}
