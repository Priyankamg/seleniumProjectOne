package com.Priyanka.headFirstJava.Chapter1;

/**
 * Created by Priyanka on 6/20/2016.
 */
public class Exercise2A {
    public static void main(String[] args) {
        int x =0;
        int y=0;
        while(x<5) {
            y = x - y;
            System.out.print(x+""+y+" ");
            x = x + 1;
        }
    }
}
