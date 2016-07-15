package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 7/15/2016.
 */
public class aSimpleProgram {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        int number;
        double decimalNumber;
        String aString;

        number = scan.nextInt();
        decimalNumber = scan.nextDouble();
        scan.nextLine();
        aString = scan.nextLine();

        System.out.println(i+number);
        System.out.printf("%.1f\n",d+decimalNumber);
        System.out.println(s.concat(aString));
    }
}
