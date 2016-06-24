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
            System.out.println("Object 1 and Object 2 are referring to the same object. Checked using == operator");
        }
        if(fooObj2==fooObj3) {
            System.out.println("Object 2 and Object 3 are referring to the same object. Checked using == operator");
        }
        if(fooObj3==fooObj1) {
            System.out.println("Object 3 and Object 1 are referring to the same object. Checked using == operator");
        }
        if(fooObj1.equals(fooObj2)) {
            System.out.println("Object 1 and Object 2 are referring to the same object. Checked using equals function");
        }
        if(fooObj2.equals(fooObj3)) {
            System.out.println("Object 2 and Object 3 are referring to the same object. Checked using equals function");
        }
        if(fooObj3.equals(fooObj1)) {
            System.out.println("Object 3 and Object 1 are referring to the same object. Checked using equals function");
        }

        String name1 = "Ria";
        String name2 = "Ria";

        if(name1==name2) {
            System.out.println("Name 1 and 2 are the same. Checked using == operator");
        } else {
            System.out.println("Name 1 and 2 are different");
        }

        if(name1.equals(name2)) {
            System.out.println("Name 1 and 2 are the same. Checked using equals function");
        } else {
            System.out.println("Name 1 and 2 are different when checked using equals function");
        }
    }
}
