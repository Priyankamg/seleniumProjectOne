package com.Priyanka.headFirstJavaTests.Chapter10Tests;

/**
 * Created by Priyanka on 7/21/2016.
 */
public class exceptions {
    Integer k;
    int l;

    public static void main(String[] args) {
        int i = 5/0;
        System.out.println("Value of i is: " + i);

        exceptions eo = new exceptions();
        eo.go();

        String s = "two";
        int num = Integer.parseInt(s);
        System.out.println("Value of num is: " + num);
    }

    public void go() {
        l = k;
        System.out.println(l);
        System.out.println(k);
    }
}
