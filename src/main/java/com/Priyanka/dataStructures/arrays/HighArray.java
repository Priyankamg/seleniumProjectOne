package com.Priyanka.dataStructures.arrays;

/**
 * Created by prinks on 1/2/18.
 */
public class HighArray {
    private int[] arr;
    private int numberOfElements;

    public HighArray(int size) {
        arr = new int[size];
        numberOfElements = 0;
    }

    public void insert(int element) {
        arr[numberOfElements] = element;
        numberOfElements++;
    }

    public boolean find(int element) {
        int i;
        for(i=0; i<numberOfElements; i++) {
            if(arr[i]==element)
                break;
        }

       return (i==numberOfElements) ? false: true;
    }

    public boolean delete(int element) {
        int i;
        for(i=0; i<numberOfElements; i++) {
            if(arr[i]==element)
                break;
        }

        if(i==numberOfElements) {
            return false;
        } else {
            for (int j = i; j < numberOfElements-1; j++) {
                arr[j] = arr[j + 1];
            }
            numberOfElements--;
            return true;
        }
    }

    public void display() {
        for(int i=0; i<numberOfElements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
