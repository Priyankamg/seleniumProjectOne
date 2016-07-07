package com.Priyanka.headFirstJavaTests.Chapter7Tests;

import com.Priyanka.headFirstJava.Chapter7.apple;
import com.Priyanka.headFirstJava.Chapter7.orange;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class fruitsTest {
    public static void main(String[] args) {
        apple a = new apple();
        orange o = new orange();
        /*
        Fruits class has package access only.
        The Fruits class cannot be accessed outside the package Chapter 7 in src/java
        However, apple class which extends fruit class has public scope. So, I can create object.
        Also apple class inherits setColour and getColour methods,
         */
        // fruits f = new fruits; // Explanation above
        a.setColour("red");
        o.setColour("orange");
        System.out.println("Apple's colour is: " + a.getColour());
        System.out.println("Orange's colour is: " + o.getColour());
    }
}
