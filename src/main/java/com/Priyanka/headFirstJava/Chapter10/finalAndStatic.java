package com.Priyanka.headFirstJava.Chapter10;

/**
 * Created by Priyanka on 7/19/2016.
 */
public class finalAndStatic {
    /*
    Initialisation of final variable can be done:
    1. During declaration
    2. In constructor
     */
    public final int myNumber = 123456789;
    public final String myName;


    public finalAndStatic() {
        myName = new String("Priyanka");
    }

    /*
    Initialisation of static variable can be done:
    1. During declaration
    2. In the static
     */
    public static int myDoorNum = 8888;
    public static double PI;

    static {
        PI = 3.14159;
    }

    public final void aFinalMethod() {
        System.out.println("This is a final method");
    }

    public void aMethodWithAFinalArgument(final int x) {
        System.out.println("Value of x is: " + x);
    }
}
