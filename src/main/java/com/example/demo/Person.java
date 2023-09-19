package com.example.demo;

public class Person {
    private String name;
    private int dateOfBirth;

    public String getName() {
        return name;
    }
    public int getAge() {
        return dateOfBirth;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}

