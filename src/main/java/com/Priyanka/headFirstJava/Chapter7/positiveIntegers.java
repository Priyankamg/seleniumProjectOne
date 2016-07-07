package com.Priyanka.headFirstJava.Chapter7;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class positiveIntegers extends Integers {
    public int num = 5;

    public int areInstanceVariablesOverriden() {
        int sum;
        System.out.println("Value of num is: " + num);
        System.out.println("Value of num from super class is: " + super.num);
        sum = num + super.num;
        return sum;
    }
}
