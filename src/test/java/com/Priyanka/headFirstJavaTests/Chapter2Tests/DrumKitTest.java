package com.Priyanka.headFirstJavaTests.Chapter2Tests;

import com.Priyanka.headFirstJava.Chapter2.DrumKit;

/**
 * Created by Priyanka on 6/21/2016.
 */
public class DrumKitTest {
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.snare  = false;
        d.playSnare();
        if(d.snare==true) {
            d.playSnare();
        }
        d.playTopHat();
    }
}
