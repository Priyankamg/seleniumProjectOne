package com.Priyanka.headFirstJava.Chapter10;

/**
 * Created by Priyanka on 7/19/2016.
 */
public class combinationsStatic {
    public static int x=0; // A static variable is shared by all the instances
    public int y;

    public combinationsStatic() {
        x++;
        y++;
    }

    public static void aStaticMethod() {
        System.out.println("This is a static method");
        System.out.println("A sub-class cannot override this method");
        System.out.println("Value of x is: " + x);
        // aNonStaticMethod(); // A non-static method cannot be referenced from a static method
                                // The reason being that the non-static method can access instance variables
                                // and a static method only works on the variable inside it
    }

    public void aNonStaticMethod() {
        System.out.println("This is a non-static method");
        System.out.println("A sub-class can override this method");
        System.out.println("non-static method can access static variable and invoke static method");
        System.out.println("Value of static variable x accessed from nonstatic method: " + x);
        aStaticMethod();
        System.out.println("Value of non-static variable y: " + y);
    }

    public static void aStaticMethodWithNonStaticArgument(int x) {
        System.out.println("value of x is: " + x);// This x is local to the method
    }

    /* A static variable cannot be an argument in a method */
//    public static void isAStaticMethodWithAStaticArgumentPossible(static int a) {
//        System.out.println("Not possible");
//    }

}
