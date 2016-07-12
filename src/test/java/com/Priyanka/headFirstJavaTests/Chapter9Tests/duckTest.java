package com.Priyanka.headFirstJavaTests.Chapter9Tests;

import com.Priyanka.headFirstJava.Chapter9.duck;

/**
 * Created by Priyanka on 7/12/2016.
 */
public class duckTest {
    public static void main(String[] args) {
        duck d = new duck(); /*
        There's a bad thing here. The duck is alive at this point in the code, but with size = 0 (default value is 0 for integers)
        Then, you are relying on the duck user to KNOW that the duck creation is a 2 part process.
        One to call the constructor and one to call the setter.*/
        d.setSize(32);
        d.duck();
    }
}

