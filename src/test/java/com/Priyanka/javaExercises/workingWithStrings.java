package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 7/27/2016.
 */
public class workingWithStrings {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String first = s.nextLine();
        String second = s.nextLine();

        System.out.println(first.length() + second.length());
        if(first.compareTo(second)<=0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        char char1 = first.charAt(0);
        char char2 = second.charAt(0);

        char1 = Character.toUpperCase(char1);
        char2 = Character.toUpperCase(char2);

        first = char1 + first.substring(1);
        second = char2 + second.substring(1);

        System.out.println(first + " " + second);

    }
}
