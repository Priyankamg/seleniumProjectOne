package com.Priyanka.exercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 7/14/2016.
 */
public class understandingPrintf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("========");
        String[] sArr = new String[3];
        int[] xArr = new int[3];

        for(int i=0; i<sArr.length; i++) {
            sArr[i] = new String();
        }
        for(int i = 0; i < 3; i++) {
            String s1 = scan.next();
            int x = scan.nextInt();
            if(s1.length()<=10 && s1.matches("[a-zA-Z]+")) {
                sArr[i] = s1;
            }
            if(x>=0 && x<=999)
                xArr[i] = x;
        }

        for(int i=0; i<3; i++) {
            System.out.printf("%-15s",sArr[i]);
            System.out.printf("%03d\n",xArr[i]);
        }
    }
}
