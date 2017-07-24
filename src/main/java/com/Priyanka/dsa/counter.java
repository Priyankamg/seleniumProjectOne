package com.Priyanka.dsa;

/**
 * Created by prinks on 7/23/17.
 */
public class counter {
    private String name;
    private int count;

    public counter(String str) {
        this.name = str;
    }

    public void increment() {
        count++;
    }

    public int getCurrentValue() {
        return count;
    }

    public String toString() {
        return name + ": " + count;
    }
}
