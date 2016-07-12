package com.Priyanka.headFirstJava.Chapter7;

import com.Priyanka.headFirstJava.Chapter8.Pet;
import com.Priyanka.headFirstJava.Chapter8.breed;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class cat extends animal implements Pet,breed {

    public void whichBreed() {
        System.out.println("Well, I do not know cat breeds :O ");
    }

    public void countryOfOrigin() {
        System.out.println("This cat is from India");
    }

    public void beFriendly() {
        System.out.println("Value of c is: " + c);
        System.out.println("Value of d is: " + d);
        System.out.println("Cats are not all that friendly. Maybe we can train them, I do not know ;)");
    }

    public void play() {
        System.out.println("Cats lurk in the apartment and play");
    }
    public void makeNoise() {
        System.out.println("Meow! Meow!");
    }

    public void reactionWhenAShotIsGivenByVet() {
        System.out.println("Meooooooooow");
    }
}
