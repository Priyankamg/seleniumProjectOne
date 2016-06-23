package com.Priyanka.headFirstJava.Chapter4;

/**
 * Created by Priyanka on 6/23/2016.
 */
public class goodDog {
    private int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void bark() {
        if(size >  70){
            System.out.println("Woof! Woof!");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }
}
