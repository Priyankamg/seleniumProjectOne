package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.xCopy;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class xCopyTest {
    public static void main(String[] args) {
        int org = 42;
        xCopy xOb = new xCopy();

        int doub = xOb.go(org);
        System.out.println("Original: " + org);
        System.out.println("Double: " + doub);

    }
}
