package com.Priyanka.headFirstJava.Chapter3;

/**
 * Created by Priyanka on 6/20/2016.
 * Output expected: a-b c-d
 */
public class shuffle {
    public static void main(String[] args) {

        int x = 3;
        while (x >0) {
            if(x>2)
                System.out.print("a");
            x=x-1;
            System.out.print("-");
            if(x==2)
                System.out.print("b c");
            x=x-1;
            System.out.print("-");
            if(x==1) {
                System.out.print("d");
                x = x - 1;
            }
        }
    }
}
