package com.Priyanka.headFirstJava.Chapter8;

/**
 * Created by Priyanka on 7/23/2016.
 */
public class cpuCalculation {

    public void calcCpu(int a, int b) {
        System.out.println("Method in super class has 2 args a and b");
    }

    public void calcCpu(int a) {
        System.out.println("Method in super class has 1 arg a");
    }

    public void calcCpu(String a, int b, boolean val) {
        System.out.println("Method in super class has 3 args a,b and val");
    }
}
