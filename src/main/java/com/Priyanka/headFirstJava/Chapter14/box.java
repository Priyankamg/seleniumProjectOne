package com.Priyanka.headFirstJava.Chapter14;

import java.io.Serializable;

/**
 * Created by Priyanka on 8/11/2016.
 */
public class box implements Serializable {
    private int height;
    private int width;

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
