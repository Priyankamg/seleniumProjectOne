package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.poorDog;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class poorDogTest {
    public static void main(String[] args) {
        poorDog dogOne = new poorDog();

        System.out.println("The default size of dogOne is: " + dogOne.getSize());
        System.out.println("The default name of dogOne is: " + dogOne.getName());
    }
}
