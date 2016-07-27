package com.Priyanka.javaExercises;

/**
 * Created by Priyanka on 7/27/2016.
 */
public class person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    public person(String firstName, String lastName, int idNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}
