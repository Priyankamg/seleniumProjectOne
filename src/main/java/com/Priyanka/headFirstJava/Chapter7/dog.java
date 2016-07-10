package com.Priyanka.headFirstJava.Chapter7;

import com.Priyanka.headFirstJava.Chapter8.Pet;
import com.Priyanka.headFirstJava.Chapter8.breed;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class dog extends animal implements Pet,breed {

    public void whichBreed() {
        System.out.println("This dog is a pomeranian");
    }

    public void countryOfOrigin() {
        System.out.println("This dog was born in India");
    }

    public void beFriendly() {
        System.out.println("Dogs are the friendliest creatures on the planet");
    }

    public void play() {
        System.out.println("Dogs love to play");
    }

    public void makeNoise() {
        System.out.println("Woof! Woof!");
    }

    public void reactionWhenAShotIsGivenByVet() {
        System.out.println("Whine...");
    }
}
