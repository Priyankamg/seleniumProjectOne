package com.Priyanka.headFirstJavaTests.Chapter5Tests;

import com.Priyanka.headFirstJava.Chapter5.anotherFor;

/**
 * Created by Priyanka on 6/24/2016.
 * Understanding the for method in another implementation
 * For each element in the array for(int i: arr)
 */
public class anotherForTest {
    public static void main(String[] args) {
        anotherFor another = new anotherFor();

        int[] nums = {1,2,3,4};

        another.setArr(nums);

        for(int i: another.getArr()) {
            System.out.println("Value of each element: " + i);
        }
    }
}
