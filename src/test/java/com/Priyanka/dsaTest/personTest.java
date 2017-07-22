package com.Priyanka.dsaTest;

import com.Priyanka.dsa.person;

/**
 * Created by prinks on 7/22/17.
 */
public class personTest {
    public static void main(String[] args) {
        person p1 = new person("John",165,25,"Black");
        person p2 = new person("Joe", 157, 30, "Brown");
        person p3 = new person("David",160,30,"Blue");

        System.out.println("p1 is speaking now: ");
        p1.speak();
        System.out.println("p2 is speaking now: ");
        p2.speak();
        System.out.println("p3 is speaking now: ");
        p3.speak();
    }
}
