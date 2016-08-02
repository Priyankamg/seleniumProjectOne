package com.Priyanka.headFirstJavaTests.Chapter11Tests;

import com.Priyanka.headFirstJava.Chapter11.Calculator;

import java.util.Scanner;

/**
 * Created by Priyanka on 8/2/2016.
 */
public class aPowerb {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        while(T-- > 0) {
            int n = s.nextInt();
            int p = s.nextInt();
            Calculator myCalc = new Calculator();
            try {
                int ans = myCalc.power(n,p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
