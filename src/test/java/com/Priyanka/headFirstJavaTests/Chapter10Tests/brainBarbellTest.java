package com.Priyanka.headFirstJavaTests.Chapter10Tests;

import com.Priyanka.headFirstJava.Chapter10.brainBarbell;

/**
 * Created by Priyanka on 7/18/2016.
 */
public class brainBarbellTest {
    public static void main(String[] args) {
        brainBarbell.create10instances(); // Static method creating instances of a class which has a private constructor
        int s = brainBarbell.anInstance().getSize(); // Static method returns an instance of the class brainBarbell which can be used
                                                     // to perform different operations on non-static methods.
        System.out.println("Size is: " + s);
    }
}
