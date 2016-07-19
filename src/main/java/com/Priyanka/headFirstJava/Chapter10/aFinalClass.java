package com.Priyanka.headFirstJava.Chapter10;

/**
 * Created by Priyanka on 7/19/2016.
 */
public final class aFinalClass {
    static int objInstanceCount;

    public aFinalClass() {
        objInstanceCount++;
    }

    void hiThere() {
        System.out.println("There, there by BluMax");
    }
}
