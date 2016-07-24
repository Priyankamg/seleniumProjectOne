package com.Priyanka.headFirstJavaTests.Chapter11Tests;

import com.Priyanka.headFirstJava.Chapter8.cpuCalculation;
import com.Priyanka.headFirstJava.Chapter8.mac;

/**
 * Created by Priyanka on 7/23/2016.
 */
public class macTest {
    public static void main(String[] args) {
        cpuCalculation cc = new mac();
        cc.calcCpu(100); // Using a super-class to access a method that has been overridden in a sub-class

        mac ma = new mac();
        ma.calcCpu(10,"pg"); // Using method overloading. Name of method is same. However, the arguments and return types can be diff
        ma.calcCpu(50); // Explanation same as above
    }
}
