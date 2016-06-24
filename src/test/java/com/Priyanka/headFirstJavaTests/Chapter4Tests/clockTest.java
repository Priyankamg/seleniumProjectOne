package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.clock;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class clockTest {
    public static void main(String[] args) {
        clock c = new clock();
        c.setTime("1234");
        System.out.println("Time is: " + c.getTime());
    }
}
