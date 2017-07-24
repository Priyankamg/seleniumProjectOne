package com.Priyanka.dsaTest;

import com.Priyanka.dsa.numbers;

/**
 * Created by prinks on 7/23/17.
 */
public class numbersTest {
    public static void main(String[] args) {
        int[] multiplicationOf3 = new int[10];
        int[] multiplicationOf2 = new int[10];

        for(int i=0; i<10;i++) {
            multiplicationOf3[i] = (i+1) * 3;
        }

        for(int i=0; i<10; i++) {
            multiplicationOf2[i] = (i+1) * 2;
        }

        numbers n = new numbers(multiplicationOf3);
        n.setTables2(multiplicationOf2);

        System.out.println("Count of even numbers: " + n.countEvenNumbers()); // Linear operation
        System.out.println("Count of odd numbers: " + n.countOddNumbers()); // Linear operation
        System.out.println("The 1st element in the array is: " + n.getElementFrom(0));
        System.out.println("The 5th element in the array is: " + n.getElementFrom(4));

        System.out.println("Number of duplicates present in tables of 2 and tables of 3 are: " + n.getNumberOfDuplicates());
    }
}
