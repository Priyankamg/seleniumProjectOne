package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 8/1/2016.
 */
public class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        String revStr="";
        for(int i=(str.length()-1);i>=0;i--) {
            revStr += str.charAt(i);
        }
        if(str.equals(revStr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
