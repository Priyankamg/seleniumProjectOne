package com.Priyanka.headFirstJava.Chapter14;

import java.io.Serializable;

/**
 * Created by Priyanka on 8/17/2016.
 */
public class rectangle implements Serializable {
    private int length;
    private int breadth;

    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth =  breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
