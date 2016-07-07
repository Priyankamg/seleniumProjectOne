package com.Priyanka.headFirstJavaTests.Chapter7Tests;

import com.Priyanka.headFirstJava.Chapter7.positiveIntegers;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class positiveIntegersTest {
    public static void main(String[] args) {
        int sum;
        positiveIntegers posInt = new positiveIntegers();
        sum = posInt.areInstanceVariablesOverriden();
        System.out.println("Sum is: " + sum);
    }
}
