package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.foo;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class fooTest {
    public static void main(String[] args) {
        int a = 3;
        byte b = 3;

        boolean ans = (a==b) ? true: false;
        System.out.println("Is a equal to b? " + ans);

        foo fooObj1 = new foo();
        foo fooObj2 = new foo();
        foo fooObj3 = fooObj1;

        if(fooObj1==fooObj2) {
            System.out.println("Object 1 and Object 2 are referring to the same object");
        }
        if(fooObj2==fooObj3) {
            System.out.println("Object 2 and Object 3 are referring to the same object");
        }
        if(fooObj3==fooObj1) {
            System.out.println("Object 3 and Object 1 are referring to the same object");
        }


    }
}
