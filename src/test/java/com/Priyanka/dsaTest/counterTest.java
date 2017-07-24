package com.Priyanka.dsaTest;

import com.Priyanka.dsa.counter;

/**
 * Created by prinks on 7/23/17.
 */
public class counterTest {
    public static void main(String[] args) {
        counter c1 = new counter("First counter");
        c1.increment();
        System.out.println(c1.getCurrentValue());
        System.out.println(c1.toString());
    }
}
