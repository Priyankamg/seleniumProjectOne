package com.Priyanka.headFirstJavaTests.Chapter11Tests;

import com.Priyanka.headFirstJava.Chapter11.difference;

import java.util.Scanner;

/**
 * Created by Priyanka on 8/2/2016.
 */
public class maxDiff {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int[] ele = new int[T];
        for(int i=0; i<T; i++) {
            ele[i] = s.nextInt();
        }
        difference diff = new difference(ele);
        diff.computeDifference();
        System.out.println(diff.maximumDifference);
    }
}
