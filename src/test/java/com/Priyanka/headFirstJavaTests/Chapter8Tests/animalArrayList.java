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



    }
}
