package com.Priyanka.headFirstJavaTests;

import com.Priyanka.headFirstJava.simpleMath;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class simpleMathTest {
    public static void main(String[] args) {
        simpleMath mathObj = new simpleMath();
        mathObj.num1 = 23;
        mathObj.num2 = -234;
        mathObj.num3 = 987;
        mathObj.num4 = 1234567890;
        mathObj.num5 = -567.89123f;
        mathObj.num6 = 88888888.8888;

        int total;
        total = (int) mathObj.add(); // The method is returning double. If you are assinged the result
                                     // to an integer, you need to explicitly cast it to an integer.
        double sum;
        sum = mathObj.add();         // Likewise, if you try to return a bigger value, but the parameters
                                     // of the method have smaller values, it is done implicitly.
                                     // You don't have to do anything. Implicit type cast is happening.

        mathObj.add(); // In Java, even if a function is returning something, you don't have to
                       // take the returned value and assign it to a variable
                       // You can just let the method perform its operations and not care about
                       // the return value
        System.out.println("Total in INT is: " + total);
        System.out.println("Total in DOUBLE is: " + sum);

    }
}
