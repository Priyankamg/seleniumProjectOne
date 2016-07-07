package com.Priyanka.headFirstJava.Chapter7;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class bigDairyMilkSilk extends dairyMilkSilk {
    public void setSize() {
        size = 5;
    }

    public void setPrice() {
        price = 120;
    }

    /*
    This is not possible as the method texture is final in the super-class.
     */
//    public final void texture() {
//
//    }
}
