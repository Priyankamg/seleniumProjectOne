package com.Priyanka.headFirstJavaTests.Chapter8Tests;

import com.Priyanka.headFirstJava.Chapter7.animal;
import com.Priyanka.headFirstJava.Chapter7.cat;
import com.Priyanka.headFirstJava.Chapter7.dog;

import java.util.ArrayList;

/**
 * Created by Priyanka on 7/8/2016.
 */
public class animalArrayList {
    public static void main(String[] args) {

        ArrayList<animal> animalsArrayList = new ArrayList<animal>();
        dog d1 = new dog();
        cat c1 = new cat();
        animalsArrayList.add(d1);
        animalsArrayList.add(c1);

        /*
        You can add a sub-class object to a declaration of the super class.
        But assigning a superclass's object to a sub-class is not allowed.
        This is because animalsArrayList will return an object of type animal.
        You cannot assign it to a sub-class.
         */
//        dog d2 = animalsArrayList.get(0);
//        cat c2 = animalsArrayList.get(1);

        animal a1 = new dog();
        animal a2 = new cat();

        /*
        The same description above holds good for this code too.
        */
//        dog d2 = a1;
//        cat c2 = a2;


        if(a1 instanceof dog) {
            System.out.println("Is a1 referring to an instance of a dog? If so, it will print woof! and whiine!");
            dog d2 = (dog) a1;
            d2.makeNoise();
            d2.reactionWhenAShotIsGivenByVet();
        } else {
            System.out.println("a1 is not an instance of a dog");
        }

        if(a1 instanceof cat) {
            System.out.println("Is a1 referring to an instance of a cat? If so, it will print Meow and Meoooow");
            cat c2 = (cat) a1;
            c2.makeNoise();
            c2.reactionWhenAShotIsGivenByVet();
        } else {
            System.out.println("a1 is not an instance of a cat");
        }

        if(a2 instanceof dog) {
            System.out.println("Is a2 referring to an instance of a dog? If so, it will pring woof! and whiine!");
            dog d3 = (dog) a2;
            d3.makeNoise();
            d3.reactionWhenAShotIsGivenByVet();
        } else {
            System.out.println("a2 is not an instance of a dog");
        }

        if(a2 instanceof cat) {
            System.out.println("Is a2 referring to an instance of a cat? If so, it will print Meow and Meoooow");
            cat c3 = (cat) a2;
            c3.makeNoise();
            c3.reactionWhenAShotIsGivenByVet();
        } else {
            System.out.println("a2 is not an instance of a cat");
        }


    }
}
