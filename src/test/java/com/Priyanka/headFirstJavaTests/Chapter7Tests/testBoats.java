package com.Priyanka.headFirstJavaTests.Chapter7Tests;

import com.Priyanka.headFirstJava.Chapter7.boat;
import com.Priyanka.headFirstJava.Chapter7.rowBoat;
import com.Priyanka.headFirstJava.Chapter7.sailBoat;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class testBoats {
    public static void main(String[] args) {
        boat b1 = new boat();
        sailBoat b2 = new sailBoat();
        rowBoat b3 = new rowBoat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();
    }
}
