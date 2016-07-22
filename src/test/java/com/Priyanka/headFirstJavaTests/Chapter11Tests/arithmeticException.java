package com.Priyanka.headFirstJavaTests.Chapter11Tests;

/**
 * Created by Priyanka on 7/21/2016.
 */
public class arithmeticException {
    public static void main(String[] args) {
        int i;
        try {
            i = 5/0;
            System.out.println("Value of i in try block is: " + i);
        } catch (ArithmeticException ae) {
            System.out.println("Arithmetic exception because of / by 0");
            ae.printStackTrace();
        }
        i = 2/0; // Divide by 0 throws a ArithmeticException at runtime. The compiler does not know it in advance.
                // Such exceptions are known as runtime exceptions or UNCHECKED exceptions
       System.out.println("Value of i is: " + i);


    }
}
