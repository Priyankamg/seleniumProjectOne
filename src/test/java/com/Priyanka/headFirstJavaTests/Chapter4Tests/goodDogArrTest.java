package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.goodDog;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class goodDogArrTest {
    public static void main(String[] args) {
        goodDog[] pets = new goodDog[5];
        int i;

        for(i=0; i<pets.length; i++) {
            pets[i] = new goodDog();
        }

        pets[0].setSize(100);
        pets[1].setSize(75);
        pets[2].setSize(50);
        pets[3].setSize(25);
        pets[4].setSize(10);

        for(i=0; i<pets.length; i++) {
            System.out.println("Size of pet " + (i+1) + " is " + pets[i].getSize());
        }

        for(i=0; i<pets.length;i++) {
            pets[i].bark();
        }

    }
}
