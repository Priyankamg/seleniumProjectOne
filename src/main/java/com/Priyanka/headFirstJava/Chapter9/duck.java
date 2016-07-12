package com.Priyanka.headFirstJava.Chapter9;

/**
 * Created by Priyanka on 7/12/2016.
 */
public class duck {
    int size;

    public duck(){
        System.out.println("Quack!");
    }

    public void duck() {
        System.out.println("A method that has the same name as that of the class");
        System.out.println("The only difference being that this is not a constructor but a method as it has a return type");
        System.out.println("This is valid to have. This is NEWS to me. I did not know.");
    }

    public void setSize(int size) {
        this.size = size;
    }
}
