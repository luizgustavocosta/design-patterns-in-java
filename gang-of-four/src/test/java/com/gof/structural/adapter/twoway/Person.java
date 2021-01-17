package com.gof.structural.adapter.twoway;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private LocalDate dob;

    public <T> Person(String string, String string1, Gender gender, LocalDate dob) {
        this.firstName = string;
        this.lastName = string1;
        this.gender = gender;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public LocalDate getDateOfBirth() {
        return dob;
    }
}
