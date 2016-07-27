package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 7/25/2016.
 */
public class recursion {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int result=0;
        if(number>=2 && number<=12) {
            result = factorial(number);
        }
        System.out.println(result);
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }  else {
            return n * factorial(n - 1);
        }
    }

    }

