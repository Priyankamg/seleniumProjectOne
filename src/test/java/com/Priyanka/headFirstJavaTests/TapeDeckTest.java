package com.Priyanka.headFirstJavaTests;

import com.Priyanka.headFirstJava.TapeDeck;

/**
 * Created by Priyanka on 6/21/2016.
 */
public class TapeDeckTest {
    public static void main(String[] args) {
        TapeDeck t = new TapeDeck();
        t.canRecord = true;
        t.playTape();

        if(t.canRecord==true) {
            t.recordTape();
        }
    }
}
