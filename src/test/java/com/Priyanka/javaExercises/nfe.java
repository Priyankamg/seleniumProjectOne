package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 8/1/2016.
 */
public class nfe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException nfe) {
            System.out.println("Bad String");
        }
    }
}
