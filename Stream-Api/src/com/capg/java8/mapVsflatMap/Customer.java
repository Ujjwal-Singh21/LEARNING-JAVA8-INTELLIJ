package com.capg.java8.mapVsflatMap;

import java.util.List;

public class Customer {

    private int id;
    private String name;
    private String emailId;
    private List<String> phoneNumbers;

    public Customer() {
    }

    public Customer(int id, String name, String emailId, List<String> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.emailId = emailId;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emailId='" + emailId + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
