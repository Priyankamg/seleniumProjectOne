package com.Priyanka.headFirstJava.Chapter9;

/**
 * Created by Priyanka on 7/12/2016.
 */
public class animal {
    int size;

    public animal() {
        System.out.println("Making an animal");
    }

    public animal(int size) {
        this.size = size;
        System.out.println("Size in animal class is: " + this.size);
    }
}
