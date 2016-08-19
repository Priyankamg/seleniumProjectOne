package com.Priyanka.json;

import java.util.List;

/**
 * Created by Priyanka on 7/27/2016.
 */
public class nameAge {
    private String firstName;
    private String lastName;
    private int age;
    private address address;
    private List<phoneNumbers> phoneNumbers;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAddress(address address) {
        this.address = address;
    }

    public address getAddress() {
        return address;
    }

    public void setPhoneNumbers(List<phoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<phoneNumbers> getPhNo() {
        return phoneNumbers;
    }
}
