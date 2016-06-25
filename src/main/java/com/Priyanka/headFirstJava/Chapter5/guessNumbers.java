package com.Priyanka.headFirstJava.Chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Priyanka on 6/24/2016.
 */
public class guessNumbers {
    private int num;

    public void setNum() {
        System.out.println("Guess the number ");
        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(is.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getNum(){
        return num;
    }
}
