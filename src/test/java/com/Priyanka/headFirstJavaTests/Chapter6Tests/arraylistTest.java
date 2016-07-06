package com.Priyanka.headFirstJavaTests.Chapter6Tests;

import java.util.ArrayList;

/**
 * Created by Priyanka on 7/6/2016.
 */
public class arraylistTest {
    public static void main(String[] args) {
        ArrayList<String> num = new ArrayList<String>();
        num.add("Priyanka");
        num.add("Abhinav");
        num.add("Rohini");
        num.add("Karthik");
        num.add("Preetika");
        num.add("Nikitha");

        for(int i=0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }

        num.remove("Baskaran");
        num.remove(2);

        for(int i=0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }

        int indexOfUsha = num.indexOf("Usha");
        int indexOfNiki = num.indexOf("Nikitha");

        boolean  isGaneshPresent = num.contains("Ganesh");

        boolean isNumEmpty = num.isEmpty();

        System.out.println("Index of Usha: " + indexOfUsha);
        System.out.println("Index of Niki: " + indexOfNiki);
        System.out.println("is Ganesh Present? " + isGaneshPresent);
        System.out.println("is the Num ArrayList empty? " + isNumEmpty);


    }
}
