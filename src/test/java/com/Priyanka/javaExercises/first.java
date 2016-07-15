package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 7/14/2016.
 */
public class first {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please type in a statement: ");
        String inputFromUser = scan.nextLine();
        scan.close();
        System.out.println("Hello world!");
        System.out.println(inputFromUser);
    }
}
