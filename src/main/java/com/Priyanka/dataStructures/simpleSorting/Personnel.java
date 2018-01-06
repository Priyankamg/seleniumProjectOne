package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/5/18.
 */
public class Personnel {
    private String firstName;
    private String lastName;
    private int age;

    public Personnel(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void display() {
        System.out.println("FirstName: " + firstName + " LastName: " + lastName + " Age: " + age);
    }

    public String getLastName() {
        return lastName;
    }
}
