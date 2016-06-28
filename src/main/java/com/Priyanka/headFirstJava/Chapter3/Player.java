package com.Priyanka.headFirstJava.Chapter3;

/**
 * Created by Priyanka on 6/20/2016.
 */
public class Player {
    public int number;

    public int guess(){
        number = (int) (Math.random() * 10);
        return number;
    }
}
