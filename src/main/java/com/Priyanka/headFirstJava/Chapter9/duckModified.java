package com.Priyanka.headFirstJava.Chapter9;

/**
 * Created by Priyanka on 7/12/2016.
 */
public class duckModified {
    int size;

    /*
    2 constructor methods with different arguments.
    We are using Constructor overloading.
     */
    public duckModified() {
        size = 27;
        System.out.println("Duck's size is: " + size);
    }

    public duckModified(int size) {
        this.size = size;
        System.out.println("Duck's size is: " + this.size);
    }

    /*
    The below is not recommended because the person creating the duck object
    when constructing has to give 0 as the argument to set duck's size is 27.
     */

//    public duckModified(int size) {
//        if(size==0) {
//            this.size = 27;
//        } else {
//            this.size = size;
//        }
//    }
}
