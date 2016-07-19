package com.Priyanka.headFirstJava.Chapter10;

/**
 * Created by Priyanka on 7/19/2016.
 */
public class subClassCombinationsStatic extends combinationsStatic {

    public void aNonStaticMethod() {
        System.out.println("The sub-class is overriding the non static method");
    }

    /*
    The code below is not permitted. The sub-class cannot override a static method.
    Why?
    A static method does not use any instance variables of the class in which it is written.
    It only uses local variables that are within its method or variables that are defined as arguments.
    Since it does not use instance variables, it is not  dependent on the instance (the object) that
    can be created using the class.

     public void aStaticMethod() {

    }
     */

}
