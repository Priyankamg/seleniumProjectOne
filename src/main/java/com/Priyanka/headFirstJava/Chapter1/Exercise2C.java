package com.Priyanka.headFirstJava.Chapter1;

/**
 * Created by Priyanka on 6/20/2016.
 */
public class Exercise2C {
    public static void main(String[] args) {
        int x =0;
        int y=0;
        while(x<5) {
            y = y + 2;
            if (y>4) {
                y = y - 1;
            }
            System.out.print(x+""+y+" ");
            x = x + 1;
        }
    }
}