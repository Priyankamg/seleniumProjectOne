package com.Priyanka.dsaTest;

import com.Priyanka.dsa.car;
import com.Priyanka.dsa.engine;

/**
 * Created by prinks on 7/22/17.
 */
public class carTest {
    public static void main(String[] args) {
        car car1 = new car(500);

        car car2 = new car(1000);
        car2.setEngine1(new engine());

        System.out.println("Car 1 details: ");
        System.out.println("Hp: " + car1.getHp());
        System.out.println("Engine: " + car1.getEngine1());

        System.out.println("Car 2 details: ");
        System.out.println("Hp: " + car2.getHp());
        System.out.println("Engine: " + car2.getEngine1());


    }
}
