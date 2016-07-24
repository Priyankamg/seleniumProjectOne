package com.Priyanka.headFirstJava.Chapter8;

/**
 * Created by Priyanka on 7/23/2016.
 */
public class mac extends cpuCalculation {

    public void calcCpu(int a, String b) {
        System.out.println("Implementation of calc CPu for Mac");
    }

    public void calcCpu(int a) {
        System.out.println("Method with one argument a in sub-class");
    }

    public void calcMem() {
        System.out.println("Implementation of Mem calc for Mac");
    }
}
