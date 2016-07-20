package com.Priyanka.javaExercises;

import java.util.Scanner;

/**
 * Created by Priyanka on 7/20/2016.
 */
public class stringExercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numberOfStrings = s.nextInt();
        s.nextLine();
        String[] stringArr = new String[numberOfStrings];
        for(int i=0; i<numberOfStrings; i++) {
            stringArr[i] = new String();
            stringArr[i] = s.nextLine();
        }
        for(int i=0; i<numberOfStrings; i++) {
            int lengthOfString = stringArr[i].length();
            String evenString="";
            String oddString="";
            for(int j=0; j<stringArr[i].length(); j++) {

                if(j%2==0) {
                    evenString += stringArr[i].charAt(j);
                } else {
                    oddString += stringArr[i].charAt(j);
                }
            }
            stringArr[i] = evenString + " " + oddString;
        }

        for(int i=0; i<numberOfStrings; i++) {
            System.out.println(stringArr[i]);
        }
    }
}
