package com.Priyanka.dsa;

/**
 * Created by prinks on 7/22/17.
 */
public class car {


    int hp;
    engine engine1;

    public car(int hp) {
        this.hp = hp;
    }

    public void setEngine1(engine engine1) {
        this.engine1 = engine1;
        System.out.println("Inside set method of engine 1");
    }

    public engine getEngine1() {
        return engine1;
    }

    public int getHp() {
        return hp;
    }

}
