package com.Priyanka.headFirstJava.Chapter8;

import com.Priyanka.headFirstJava.Chapter7.animal;

/**
 * Created by Priyanka on 7/8/2016.
 */
public class myAnimalList {
    private animal[] animals = new animal[5];
    private int nextIndex = 0;

    public void add(animal a){
        if(nextIndex < animals.length){
            animals[nextIndex] = a;
            System.out.println("Animal added at: " + nextIndex);
            nextIndex++;
        }
    }
}
