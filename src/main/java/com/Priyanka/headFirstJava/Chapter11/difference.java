package com.Priyanka.headFirstJava.Chapter11;

import java.util.Arrays;

/**
 * Created by Priyanka on 8/2/2016.
 */
public class difference {
    private int[] elements;
    public int maximumDifference;

    public difference(int[] elements) {
        this.elements = elements;
    }

    public void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = elements[elements.length-1] - elements[0];
    }

}
