package com.Priyanka.dataStructures.arrays;

/**
 * Created by prinks on 1/3/18.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void display() {
        System.out.println("firstName: " + firstName + " lastName: " + lastName + " age: " + age);
    }

    public String getLastName() {
        return lastName;
    }
}
