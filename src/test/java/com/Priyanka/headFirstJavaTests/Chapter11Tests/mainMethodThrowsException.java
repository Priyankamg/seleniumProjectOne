package com.Priyanka.headFirstJavaTests.Chapter11Tests;

import com.Priyanka.headFirstJava.Chapter11.tooColdException;
import com.Priyanka.headFirstJava.Chapter11.tooHotException;

/**
 * Created by Priyanka on 8/1/2016.
 */
public class mainMethodThrowsException {
    public static void main(String[] args) throws tooHotException,tooColdException {
        double cocoaTemp = 165;
        hotChocolate.drinkHotChocolate(cocoaTemp);
    }
}
