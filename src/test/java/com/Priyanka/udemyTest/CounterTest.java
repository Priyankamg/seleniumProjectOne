package com.Priyanka.udemyTest;

import udemy.Counter;

/**
 * Created by prinks on 11/11/17.
 */
public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter("firstCounter");
        counter.increment();
        counter.increment();
        counter.increment();
        counter.increment();

        System.out.println(counter.getCurrentValue());
        System.out.println(counter.toString());
    }
}
