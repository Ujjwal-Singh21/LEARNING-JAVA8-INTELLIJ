package com.capg.java8.mapVsflatMap;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo1 {

    public static void main(String[] args) {
        Customer customer = new Customer(101, null, null, Arrays.asList("12345", "54321"));

        // optional is a class introduced in Java8
        // There are three ways to create optional object
        // Static methods of optional Class :- empty , of , ofNullable

        // (step-1) empty() method - just create and returns an empty optional object
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);

        // (step-2) of() method returns the object passed to it
        // if passed object is NULL throws NullPointerException
        Optional<String> emailIdOptinal = Optional.of(customer.getEmailId());// throws error
        System.out.println(emailIdOptinal);

        Optional<List<String>> phoneNumbersOptional = Optional.of(customer.getPhoneNumbers());
        System.out.println(phoneNumbersOptional); // no error

        Optional<String> nameOptional = Optional.of(customer.getName());
        System.out.println(nameOptional); // no error

        // (step-3) ofNullable() method returns object passed to it
        // if passed object is null then returns empty optional object
        Optional<String> emailId = Optional.ofNullable(customer.getEmailId());
        System.out.println(emailId); // returns empty optional object

        Optional<List<String>> phoneNumbers = Optional.ofNullable(customer.getPhoneNumbers());
        System.out.println(phoneNumbers); // returns object passed to it


    }
}
