package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.DogE;

/**
 * Created by prinks on 8/6/17.
 */
public class DogETest {
    public static void main(String[] args) {
        DogE d1 = new DogE();
        d1.setName("Tommy");
        try {
            d1.setWeight(70);
            System.out.println("d1: " + d1.getName() + " " + d1.getWeight());
            d1.bark();
        } catch (Exception e) {
            e.printStackTrace();
        }

        DogE d2 = new DogE();
        d2.setName("Timmy");
        try {
            d2.setWeight(0);
            System.out.println("d2: " + d2.getName() + " " + d2.getWeight());
            d2.bark();
        } catch (Exception e) {
            e.printStackTrace();
        }
   }
}
