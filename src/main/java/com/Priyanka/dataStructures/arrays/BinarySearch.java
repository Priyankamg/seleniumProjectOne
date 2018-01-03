package com.Priyanka.dataStructures.arrays;

/**
 * Created by prinks on 1/2/18.
 */
public class BinarySearch {
    private int[] arr;
    private int numberOfElements;

    public BinarySearch(int size) {
        arr = new int[size];
        numberOfElements = 0;
    }

    public void insert(int element) {
        arr[numberOfElements] = element;
        numberOfElements++;
    }

    public void display() {
        for (int i=0; i<numberOfElements; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public boolean find(int element) {
        int lowerIndex = 0;
        int higherIndex = numberOfElements-1;

        if(element<arr[lowerIndex] || element>arr[higherIndex])
            return false;
        else {
            while(higherIndex>lowerIndex) {
                int guessValue = (arr[lowerIndex] + arr[higherIndex])/2;
                System.out.println("Lower Index: " + lowerIndex);
                System.out.println("Higher Index: " + higherIndex);
                System.out.println("Guess value: " + guessValue);

                if(guessValue < element) {
                    lowerIndex = (lowerIndex+higherIndex)/2;
                } else if(guessValue > element) {
                    higherIndex = (lowerIndex+higherIndex)/2;
                } else {
                    return true;
                }
            }
            return false;
        }
    }
}
