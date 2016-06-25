package com.Priyanka.headFirstJavaTests.Chapter5Tests;

import com.Priyanka.headFirstJava.Chapter5.takeInputFromUser;

/**
 * Created by Priyanka on 6/24/2016.
 */
public class takeInputFromUserTest {
    public static void main(String[] args) {

        takeInputFromUser takeInput = new takeInputFromUser();
        String num1 = takeInput.getUserInput("Enter number 1:");
        String num2 = takeInput.getUserInput("Enter number 2:");

        int total = Integer.parseInt(num1) + Integer.parseInt(num2);
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + total);
    }
}
