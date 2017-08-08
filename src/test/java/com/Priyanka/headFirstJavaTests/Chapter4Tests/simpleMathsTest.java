package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.simpleMaths;

/**
 * Created by prinks on 8/6/17.
 */
public class simpleMathsTest {
    public static void main(String[] args) {
        simpleMaths sm1 = new simpleMaths();
        System.out.println("Num1 default value: " + sm1.getNum1());
        System.out.println("Num2 default value: " + sm1.getNum2());
        System.out.println("Operation default value: " + sm1.getOperation());
        sm1.addition();
    }
}
