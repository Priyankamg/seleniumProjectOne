package com.Priyanka.headFirstJava.Chapter7;

/**
 * Created by Priyanka on 7/7/2016.
 */
public class fruitsTestInSamePkg {
    public static void main(String[] args) {
        fruits[] f = new fruits[2];
        f[0] = new apple();
        f[1] = new orange();
        f[0].setColour("red");
        f[1].setColour("orange");

        for(int i=0; i<f.length; i++) {
            System.out.println(f[i].getColour());
        }
    }
}
