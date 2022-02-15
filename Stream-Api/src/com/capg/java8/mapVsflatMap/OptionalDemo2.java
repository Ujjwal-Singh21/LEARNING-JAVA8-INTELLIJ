package com.capg.java8.mapVsflatMap;

import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo2 {
    public static void main(String[] args) {
        Customer customer = new Customer(102, "smith", null, Arrays.asList("22222", "33333"));
        // isPresent() and get() methods
        //example-1.1
        Optional<String> emailId2 = Optional.ofNullable(customer.getEmailId());
        System.out.println(emailId2.get()); // NoSuchElementException

        // example-1.2
        Optional<String> name1 = Optional.ofNullable(customer.getName());
        System.out.println(name1.orElse("Smith")); // giving an optional name if name is null

        // example-1.3
        System.out.println(name1.orElseGet(() -> "Tony"));

        // example-1.4
        System.out.println(name1.orElseThrow(() -> new IllegalArgumentException("No Name Present Exception Message")));

        // example-1.5 ( when name is non null)
        System.out.println(name1.map(String::toUpperCase));

        //hence use isPresent() method always before using get() Method
        //example-2.1
        Optional<String> emailId3 = Optional.ofNullable(customer.getEmailId());
        if (emailId3.isPresent()) {
            System.out.println(emailId3.get());
        }

        //example 2.2
        Optional<String> name2 = Optional.ofNullable(customer.getName());
        if (name2.isPresent()) {
            System.out.println(name2);
        } else System.out.println("No name available");


    }
}
