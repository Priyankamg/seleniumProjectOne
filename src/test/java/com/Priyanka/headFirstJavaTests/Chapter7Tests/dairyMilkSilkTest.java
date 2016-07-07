package com.Priyanka.headFirstJavaTests.Chapter7Tests;

import com.Priyanka.headFirstJava.Chapter7.bigDairyMilkSilk;
import com.Priyanka.headFirstJava.Chapter7.dairyMilkSilk;
import com.Priyanka.headFirstJava.Chapter7.smallDairyMilkSilk;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class dairyMilkSilkTest {
    public static void main(String[] args) {
        dairyMilkSilk[] silk = new dairyMilkSilk[2];
        silk[0] = new smallDairyMilkSilk();
        silk[1] = new bigDairyMilkSilk();

        for(int i=0; i<silk.length;i++) {
            silk[i].setSize();
            silk[i].setPrice();
        }

        /*
        Texture method in DairyMilkSilk class is final.
        It cannot be overridden in subclasses
        */
        System.out.print("Texture of Dairy Milk Silk when small is: ");
        silk[0].texture();
        System.out.print("Texture of Dairy Milk Silk when big is: ");
        silk[1].texture();


        for(int i=0; i<silk.length;i++) {
            System.out.println("Size: " + silk[i].getSize() + " Price: " + silk[i].getPrice());
        }
    }
}
