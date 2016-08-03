package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 8/3/2016.
 */
public class calcInterface {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        calculator c = new calculator();
        int sum = c.divisor(n);
        System.out.println("I implemented: " + c.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}
