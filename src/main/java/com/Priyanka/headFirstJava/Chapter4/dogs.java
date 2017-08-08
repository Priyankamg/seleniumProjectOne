package com.Priyanka.headFirstJava.Chapter4;

/**
 * Created by prinks on 8/6/17.
 */
public class dogs {
    String name;
    int size;

    public dogs(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void bark() {
        if(size>60) {
            System.out.println("Woof! Woof!");
        } else if(size>14) {
            System.out.println("Ruff! Ruff!");
        } else {
            System.out.println("Yip! Yip!");
        }
    }

}
