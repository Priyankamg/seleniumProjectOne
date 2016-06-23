package com.Priyanka.headFirstJava;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class dogBark {
    public int size;
    public String name;

    public void bark() {
        if(size > 60) {
            System.out.println("Woof! Woof!");
        } else if(size>14){
            System.out.println("Ruff! Ruff!");
        } else{
            System.out.println("Yip! Yip");
        }
    }
}
