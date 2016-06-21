package com.Priyanka.headFirstJavaTests;

import com.Priyanka.headFirstJava.DVDPlayer;

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
