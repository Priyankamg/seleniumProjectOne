package com.Priyanka.headFirstJavaTests.Chapter7Tests;

import com.Priyanka.headFirstJava.Chapter7.A;
import com.Priyanka.headFirstJava.Chapter7.B;
import com.Priyanka.headFirstJava.Chapter7.C;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 = new C();

        // B's m1, A's m2,  A's m3
        b.m1();
        c.m2();
        a.m3();
        System.out.println("");
        // B's m1, A's m2, C's m3, 13
        c.m1();
        c.m2();
        c.m3();
        System.out.println("");
        // A's m1, A's m2, C's m3, 13
        a.m1();
        b.m2();
        c.m3();
        System.out.println("");
        // B's m1, A's m2, C's m3, 13
        a2.m1();
        a2.m2();
        a2.m3();
    }
}
