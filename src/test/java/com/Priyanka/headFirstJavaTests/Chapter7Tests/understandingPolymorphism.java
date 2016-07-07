package com.Priyanka.headFirstJavaTests.Chapter7Tests;

import com.Priyanka.headFirstJava.Chapter7.*;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class understandingPolymorphism {
    public static void main(String[] args) {
        animal[] animals = new animal[5]; // Making objects of super class
        vet v = new vet();

        animals[0] = new dog(); // Creating an object of one subclass and assigning it to animals[0]
        animals[1] = new cat();
        animals[2] = new horse();
        animals[3] = new lion();
        animals[4] = new elephant();

        animals[0].setName("Dog");
        animals[1].setName("Cat");
        animals[2].setName("Horse");
        animals[3].setName("Lion");
        animals[4].setName("Elephant");

        for(int i=0; i<animals.length; i++) {
            System.out.print(animals[i].getName() + " makes noise ");
            animals[i].makeNoise();
        }


        for(int i=0; i<animals.length; i++) {
            System.out.print(animals[i].getName() + " when given a shot makes the sound ");
            v.giveShot(animals[i]);
        }

    }
}
