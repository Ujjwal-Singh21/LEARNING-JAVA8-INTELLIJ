package com.capg.java8.DateAndTimeAPI;

import java.time.LocalDateTime;

public class DateAndTimeDemo3 {
    // Using LocalDateTime class to print a particular date of our wish
    // also printing few months before or after from that particular date
    public static void main(String[] args) {

        // printing (21/05/1998) and time (12:45:43)
        LocalDateTime localDateTime = LocalDateTime.of(1998, 05, 21, 12, 45, 43);
        System.out.println("Our Particular Date & Time :" + localDateTime);

        // after six months from a particular date
        System.out.println("After Six Months :" + localDateTime.plusMonths(6));
        // before six months from a particular date
        System.out.println("Before Six Months :" + localDateTime.minusMonths(6));

    }
}
