package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 7/14/2016.
 */
public class read3Ints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int a = scan.nextInt();
        System.out.print("Enter second integer: ");
        int b = scan.nextInt();
        System.out.print("Enter third integer: ");
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
