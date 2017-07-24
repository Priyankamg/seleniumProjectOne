package com.Priyanka.dsaTest;

import com.Priyanka.dsa.numbers;

/**
 * Created by prinks on 7/23/17.
 */
public class numbersTest {
    public static void main(String[] args) {
        int[] ages = new int[10];

        for(int i=0; i<10;i++) {
            ages[i] = i * 3;
        }

        numbers n = new numbers(ages);

        System.out.println("Count of even numbers: " + n.countEvenNumbers());
        System.out.println("Count of odd numbers: " + n.countOddNumbers());
    }
}
