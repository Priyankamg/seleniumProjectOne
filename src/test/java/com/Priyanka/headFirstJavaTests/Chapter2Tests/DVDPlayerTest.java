package com.Priyanka.headFirstJavaTests.Chapter2Tests;

import com.Priyanka.headFirstJava.Chapter2.DVDPlayer;

/**
 * Created by Priyanka on 6/21/2016.
 */
public class DVDPlayerTest {
    public static void main(String[] args) {
        DVDPlayer d = new DVDPlayer();
        d.canRecord = true;


        if(d.canRecord==true){
            d.recordDVD();
        }
    }
}
