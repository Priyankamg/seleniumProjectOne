package com.Priyanka.headFirstJavaTests.Chapter10Tests;

/**
 * Created by Priyanka on 7/21/2016.
 */
public class primitiveWrapper {
    Integer i;
    int j;

    public static void main(String[] args) {
        primitiveWrapper pw = new primitiveWrapper();
        pw.go();
    }

    public void go() {
        j = i;
        System.out.println(i);
        System.out.println(j);
    }
}
