package com.Priyanka.headFirstJavaTests.Chapter5Tests;

import com.Priyanka.headFirstJava.Chapter5.userGuess;

/**
 * Created by Priyanka on 6/28/2016.
 */
public class userGuessTest {
    public static void main(String[] args) {
        userGuess ug = new userGuess();
        int num = ug.askUserToGuess();
        System.out.println("User guessed the number: " + num);
    }
}

