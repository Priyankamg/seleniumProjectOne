package com.Priyanka.headFirstJava.Chapter7;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class dairyMilkSilk {
    public int price;
    public int size;

    /*
        The texture of Dairy Milk Silk is smooth and creamy.
        You do not want anyone to override it.
        You then define such a method as FINAL.
        The class can have sub-classes as the class is not defined FINAL.
        But this method cannot be overridden in the sub-classes.
     */
    public final void texture() {
        String texture = "smooth and creamy";
        System.out.println(texture);
    }

    public void setPrice() {
    }

    public int getPrice() {
        return price;
    }

    public void setSize() {
    }

    public int getSize() {
        return size;
    }

}
