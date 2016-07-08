package com.Priyanka.headFirstJavaTests.Chapter7Tests;

import com.Priyanka.headFirstJava.Chapter7.dragon;
import com.Priyanka.headFirstJava.Chapter7.monster;
import com.Priyanka.headFirstJava.Chapter7.vampire;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class monsterTest {
    public static void main(String[] args) {
        monster[] ma = new monster[3];
        ma[0] = new vampire();
        ma[1] = new dragon();
        ma[2] = new monster();

        for(int x=0; x<3; x++) {
            ma[x].frighten(x);
        }
    }
}
