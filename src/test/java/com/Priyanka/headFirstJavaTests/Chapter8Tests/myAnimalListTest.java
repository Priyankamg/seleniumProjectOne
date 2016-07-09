package com.Priyanka.headFirstJavaTests.Chapter8Tests;

import com.Priyanka.headFirstJava.Chapter7.cat;
import com.Priyanka.headFirstJava.Chapter7.dog;
import com.Priyanka.headFirstJava.Chapter8.myAnimalList;

/**
 * Created by Priyanka on 7/8/2016.
 */
public class myAnimalListTest {
    public static void main(String[] args) {
        myAnimalList myAnim = new myAnimalList();
        dog d = new dog();
        cat c = new cat();
        myAnim.add(d);
        myAnim.add(c);

        if(d.equals(c)) {
            System.out.println("dog = cat");
        } else {
            System.out.println("dog is not equal to cat");
        }

        System.out.println("d's name: " + d.getClass());
        System.out.println("c's name: " + c.getClass());

        // Hashcode
        System.out.println("Hashcode of d: " + d.hashCode()); // I don't know what this is.
        System.out.println("Hashcode of c: " + c.hashCode()); // I don't know what this is.

        // To String operation
        System.out.println("d to string: " + d.toString());
        System.out.println("c to string: " + c.toString());

    }
}
