package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 7/29/2016.
 */
public class staircase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        stair(n);
    }

    public static void stair(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=0;j<n-i;j++) {
                System.out.print(" ");
            }
            for(int k=n-i;k<n;k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
