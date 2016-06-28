package com.Priyanka.headFirstJavaTests.Chapter2Tests;

import com.Priyanka.headFirstJava.Chapter2.dog;

/**
 * Created by Priyanka on 6/20/2016.
 */
public class dogTest {
    public static void main(String[] args) {
        dog d = new dog();

        d.size = 40;
        d.name = "Tommy";
        d.breed = "Pomeranian";

        System.out.println("Size of the dog is: " + d.size);
        System.out.println("Name of the dog is: " + d.name);
        System.out.println("Breed of the dog is: " + d.breed);

        d.bark();
    }

}
