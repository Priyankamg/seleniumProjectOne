package com.Priyanka.headFirstJavaTests.Chapter10Tests;

/**
 * Created by Priyanka on 7/21/2016.
 */
public class formatSpecifiers {
    public static void main(String[] args) {
        String decimal = String.format("%,d",23456789);
        System.out.println("Decimal string is: "+ decimal);

        String floatPt = String.format("%,.3f",98887762.345567);
        System.out.println("Floating point string is: " + floatPt);

        System.out.println(String.format("I have %,d websites to visit in %,d browsers",456734, 22331144));
    }
}
