package com.Priyanka.headFirstJavaTests.Chapter10Tests;

import com.Priyanka.headFirstJava.Chapter10.finalAndStatic;

/**
 * Created by Priyanka on 7/19/2016.
 */
public class finalAndStaticTest {
    public static void main(String[] args) {
        System.out.println("Door number: " + finalAndStatic.myDoorNum);
        System.out.println("Value of PI: " + finalAndStatic.PI);

        finalAndStatic anObj = new finalAndStatic();
        System.out.println("Value of number: " + anObj.myNumber);
        // anObj.myNumber = 20; // This is not permitted as the variable myNumber is final
        System.out.println("Value of name: " + anObj.myName);
    }
}
