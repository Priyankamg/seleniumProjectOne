package com.Priyanka.headFirstJava.Chapter10;

/**
 * Created by Priyanka on 7/18/2016.
 */
public class brainBarbell {
    private int size;

    private brainBarbell(int size) {
        this.size = size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public static void create10instances() {
        int count = 10;
        brainBarbell[] b = new brainBarbell[count];

        for(int i=0; i<count; i++) {
            b[i] = new brainBarbell(i*2);
        }

        for(int i=0; i<count; i++) {
            System.out.println("size is: " + b[i].getSize());
            /*
            We are inside a static method.
            We cannot access non-static variables
            We cannot access non-static methods.
             */
            //System.out.println("Value of non-static variable is: " + size); // Not permitted as size is not static
            //System.out.println("Calling a non-static method: " + getSize()); // Not permitted as getSize is not static
        }
    }

    public static brainBarbell anInstance() {
        brainBarbell b = new brainBarbell(10);
        return b;
    }


}
