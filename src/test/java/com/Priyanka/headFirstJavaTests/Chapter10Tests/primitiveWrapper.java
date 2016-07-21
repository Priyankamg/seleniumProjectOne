package com.Priyanka.headFirstJavaTests.Chapter10Tests;

/**
 * Created by Priyanka on 7/21/2016.
 */
public class primitiveWrapper {
    Integer i;
    int j;

    public static void main(String[] args) {
        primitiveWrapper pw = new primitiveWrapper();
        try {
            pw.go();
        } catch (NullPointerException ne) {
            System.out.println("Integer is an object. Default value is null.");
            System.out.println("integer is a primitive. Assigning an object to a primitive is possible.");
            System.out.println("However, if the object is null, a null pointer exception is thrown");
        }

    }

    public void go() {
        j = i;
        System.out.println(i);
        System.out.println(j);
    }
}
