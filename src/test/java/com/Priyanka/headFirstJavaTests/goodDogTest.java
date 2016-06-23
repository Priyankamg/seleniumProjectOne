package com.Priyanka.headFirstJavaTests;

import com.Priyanka.headFirstJava.goodDog;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class goodDogTest {
    public static void main(String[] args) {
        goodDog dogOne = new goodDog();
        dogOne.setSize(80);

        goodDog dogTwo =  new goodDog();
        dogTwo.setSize(5);

        goodDog dogThree = new goodDog();
        dogThree.setSize(50);

        System.out.println("Size of Dog 1: " + dogOne.getSize());
        System.out.println("Size of Dog 2: " + dogTwo.getSize());
        System.out.println("Size of Dog 3: " + dogThree.getSize());

        dogOne.bark();
        dogTwo.bark();
        dogThree.bark();
    }
}
