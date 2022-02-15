package com.capg.java8.mapVsflatMap;

import java.util.List;
import java.util.stream.Collectors;

public class MapVsFlatMAp {


    public static void main(String[] args) {

        List<Customer> customers = EkartDataBase.getAllCustomers();

        // using map() method List<Customers> convert List<String>
        // customer -> customer.getEmailId() ONE TO ONE MAPPING
        List<String> emails = customers.stream().map(customer -> customer.getEmailId()).collect(Collectors.toList());
        System.out.println("emails :" + emails);

        // customer -> customer -> employee.getPhoneNumbers() ONE TO MANY MAPPING
        // but output is non-flattered returns list of list of  String:(List<List<String>>)
        List<List<String>> phoneNumbers = customers.stream().map(customer -> customer.getPhoneNumbers())
                .collect(Collectors.toList());
        System.out.println("PhoneNumbers using normal Map :" + phoneNumbers);

        // hence using flatMap() which takes input as stream of stream and gives flattered output
        List<String> phoneNumbers2 = customers.stream().flatMap(customer -> customer.getPhoneNumbers().stream())
                .collect(Collectors.toList());
        System.out.println("PhoneNumbers2 using FlatMap :" + phoneNumbers2);

    }

}
