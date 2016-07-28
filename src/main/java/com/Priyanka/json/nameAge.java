package com.Priyanka.json;

import java.util.List;

/**
 * Created by Priyanka on 7/27/2016.
 */
public class nameAge {
    private String firstName;
    private String lastName;
    private int age;
    private Address address;
    private List<PhoneNumbers> phoneNumbers;

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

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setPhoneNumbers(List<PhoneNumbers> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<PhoneNumbers> getPhNo() {
        return phoneNumbers;
    }
}
