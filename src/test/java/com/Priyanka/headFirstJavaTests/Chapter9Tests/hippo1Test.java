package com.Priyanka.headFirstJavaTests.Chapter9Tests;

import com.Priyanka.headFirstJava.Chapter9.hippo1;

/**
 * Created by Priyanka on 7/12/2016.
 */
public class hippo1Test {
    public static void main(String[] args) {
        hippo1 h1 = new hippo1("Gloria");
        String name = h1.getName();
        System.out.println("Name is: " + name);
    }
}
