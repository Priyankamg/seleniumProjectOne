package com.Priyanka.headFirstJavaTests.Chapter10Tests;

/**
 * Created by Priyanka on 7/18/2016.
 */
public class mathfns {
    public static void main(String[] args) {
        //Math math = new Math(); // Math() has private access in java.lang.Math

        int x = Math.round(42.2f);
        int y = Math.min(233, 111);
        int z = Math.abs(-345);

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
    }
}
