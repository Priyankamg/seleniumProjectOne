package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 7/20/2016.
 */
public class arithmeticProgression {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfTestcases = s.nextInt();
        int[] a = new int[numberOfTestcases];
        int[] b = new int[numberOfTestcases];
        int[] n = new int[numberOfTestcases];

        for(int i=0; i<numberOfTestcases;i++) {
            a[i] = s.nextInt();
            b[i] = s.nextInt();
            n[i] = s.nextInt();
        }
        System.out.println(numberOfTestcases);
        for(int i=0; i<numberOfTestcases; i++) {
            System.out.println(a[i] + " " + b[i] + " " + n[i]);
        }


    }

}
