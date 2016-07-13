package com.Priyanka.headFirstJava.Chapter9;

/**
 * Created by Priyanka on 7/12/2016.
 */
public abstract class animal1 {
    private String name;

    public String getName() {
        return name;
    }

    public animal1(String name) {
        System.out.println("Constructing animal1");
        this.name = name;
    }
}
