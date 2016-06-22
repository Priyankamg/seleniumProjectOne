package com.Priyanka.headFirstJavaTests;

import com.Priyanka.headFirstJava.dogAgain;

/**
 * Created by Priyanka on 6/22/2016.
 */
public class dogAgainTest {
    public static void main(String[] args) {
        dogAgain dogAgainObj = new dogAgain();
        dogAgainObj.bark();
        dogAgainObj.name = "Tommy";

        dogAgain dogAgainArr[] = new dogAgain[3];
        dogAgainArr[0] = new dogAgain();
        dogAgainArr[1] = new dogAgain();
        dogAgainArr[2] = dogAgainObj;

        dogAgainArr[0].name = "Fred";
        dogAgainArr[1].name = "Marge";

        System.out.println("What is dogAgainArr[2]'s name?");
        System.out.println(dogAgainArr[2].name);

        int x = 0;
        while (x < dogAgainArr.length) {
            dogAgainArr[x].bark();
            x = x + 1;
        }
    }
}
