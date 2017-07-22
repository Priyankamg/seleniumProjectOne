package com.Priyanka.dsaTest;

import com.Priyanka.dsa.human;

/**
 * Created by prinks on 7/22/17.
 */
public class earth {
    public static void main(String[] args) {
        human tom = new human();
        tom.setName("Tom Hanks");
        tom.setAge(40);
        tom.setEyeColor("Blue");

        tom.speak();

        human pg = new human();
        pg.setName("Priya");
        pg.setAge(26);
        pg.setEyeColor("Brown");

        pg.speak();
        pg.eat();
        pg.work();
        pg.walk();
    }
}
