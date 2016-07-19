package com.Priyanka.headFirstJavaTests.Chapter10Tests;

import com.Priyanka.headFirstJava.Chapter10.combinationsStatic;
import com.Priyanka.headFirstJava.Chapter10.subClassCombinationsStatic;

/**
 * Created by Priyanka on 7/19/2016.
 */
public class combinationsStaticTest {
    public static void main(String[] args) {
        combinationsStatic.aStaticMethod(); // A static method is called using the Class name itself
        combinationsStatic cs1 = new combinationsStatic();
        System.out.println("Value of x after 1st object is created  is: " + combinationsStatic.x);
        combinationsStatic cs2 = new combinationsStatic();
        System.out.println("Value of x after 2nd object is created is: " + combinationsStatic.x);
        combinationsStatic cs3 = new combinationsStatic();
        System.out.println("Value of x after 3rd object is created is: " + combinationsStatic.x);
        cs1.aNonStaticMethod(); // A non-static method is called using the object of the class
        cs2.aNonStaticMethod();
        cs3.aNonStaticMethod();

        subClassCombinationsStatic subClass = new subClassCombinationsStatic();
        subClass.aNonStaticMethod();



    }
}
