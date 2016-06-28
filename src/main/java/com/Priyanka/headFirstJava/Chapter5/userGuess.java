package com.Priyanka.headFirstJava.Chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Priyanka on 6/28/2016.
 */
public class userGuess {
    public int askUserToGuess() {
        int userGuess = -1;
        try {
            System.out.println("Guess a number from 0 to 8: ");
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            String inputNum = is.readLine();
            userGuess = Integer.parseInt(inputNum);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return userGuess;
    }
}
