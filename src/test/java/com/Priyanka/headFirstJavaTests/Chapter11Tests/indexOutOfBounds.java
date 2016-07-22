package com.Priyanka.headFirstJavaTests.Chapter11Tests;

/**
 * Created by Priyanka on 7/21/2016.
 */
public class indexOutOfBounds {
    public static void main(String[] args) {
        int[] a = new int[5];
        for(int i=0; i<a.length; i++) {
            a[i] = i*2;
        }

        for(int i=0; i<a.length; i++) {
            System.out.println(a[i]);
        }

        try {
            System.out.println("Value of the 6th element: " + a[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Trying to access an element which is outOfBounds for the array");
            e.printStackTrace();
        }
    }
}
