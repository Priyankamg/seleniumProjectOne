package com.Priyanka.headFirstJavaTests.Chapter10Tests;

import com.Priyanka.headFirstJava.Chapter10.nonStaticClass;

/**
 * Created by Priyanka on 7/18/2016.
 */
public class staticNonStaticClassTest {
    public static void main(String[] args) {
        /*
        In this example, the methods in the class nonStaticClass depend on the
        value of the instance variable. Therefore, we need to create an object of the class.
        Also, the constructor is
        such that the instance variables of the class get initialized
        when we create an object.
         */
        nonStaticClass obj1 = new nonStaticClass("Arijit");
        nonStaticClass obj2 = new nonStaticClass("Sonu Nigam");
        obj1.playMusic();
        obj2.playMusic();

        obj1.hiThere(); // Bad coding. you could use an instance of a class to call a static method but it is misleading.
        obj2.hiThere(); // Bad coding. Same reasoning as above.

        nonStaticClass.hiThere();
    }
}
