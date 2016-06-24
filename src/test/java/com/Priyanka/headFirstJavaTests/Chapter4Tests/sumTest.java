package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.sum;

/**
 * Created by Priyanka on 6/23/2016.
 * Local variables in a function have to be initialized when they are used in any computation on RHS
 * If they are assigned to a value directly, they don't complain
 */
public class sumTest {
    public static void main(String[] args) {
        sum s = new sum();
        int total=100;
        total = total + s.add();
        System.out.println("Sum is: " + total);

        int t = s.add();
        System.out.println("Value of s.add is: " + t);

    }
}
