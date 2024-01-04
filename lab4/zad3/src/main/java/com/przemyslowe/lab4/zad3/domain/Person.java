package com.przemyslowe.lab4.zad3.domain;

public class Person {
    private String firstName;
    private String lastName;
    private String email;
    private String companyName;

    public Person(String firstName, String lastName, String email, String companyName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}

