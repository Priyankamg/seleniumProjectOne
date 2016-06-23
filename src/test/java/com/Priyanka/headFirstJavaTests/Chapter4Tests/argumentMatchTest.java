package com.Priyanka.headFirstJavaTests.Chapter4Tests;

import com.Priyanka.headFirstJava.Chapter4.argumentMatch;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class argumentMatchTest {
    public static void main(String[] args) {
        argumentMatch argMatch = new argumentMatch();
        argMatch.num = 12;
        argMatch.name = "123";
        argMatch.ch = 'a';
        argMatch.isFun = true;

        argMatch.variousTypes();

        argMatch.multipleParams(3,"12",'A',false);
    }
}
