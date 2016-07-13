package com.Priyanka.headFirstJava.Chapter9;

/**
 * Created by Priyanka on 7/12/2016.
 */
public class hippo extends animal {
    int size;

    /*
    By default (The compiler inserts it), a super() constructor with no arguments has been called.
    If default super() constructor does not exist in the parent class,
    you have to either create a default constructor in the parent class
    or the method needs to call the overloaded constructor.
     */
    public hippo() {
        System.out.println("Making a hippo");
        // super(); // Call to super must be the first statement in the constructor body. Parents come first, then children come.
    }

    public hippo(String location) {
        //super(size); //-- INVALID. Cannot reference hippo.size before super type constructor has been called
        // This means that in the stack, the hippo method goes in first with the variables location and size
        // Then the constructor of the class above it in the inheritance tree gets called.
        // Since that has to be called first and only then, the hippo's constructor can be called which will initialise size variable,
        // it is invalid.
        System.out.println("Hippo class with an argument. A super constructor with no arguments has been instantiated");
        System.out.println("Location is: " + location);
    }

    public hippo(int size) {
        super(size);
        System.out.println("Hippo class with an argument. A super constructor with that particular argument has been instantiated");
        System.out.println("Size in Hippo class is: " + size);

    }
}
