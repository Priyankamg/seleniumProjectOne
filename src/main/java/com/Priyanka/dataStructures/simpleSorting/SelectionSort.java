package com.Priyanka.dataStructures.simpleSorting;

import cucumber.api.java.eo.Se;

/**
 * Created by prinks on 1/4/18.
 */
public class SelectionSort {
    private int[] arr;
    private int numberOfElements;

    public SelectionSort(int size) {
        arr = new int[size];
        numberOfElements = 0;
    }

    public void insert(int element) {
        arr[numberOfElements] = element;
        numberOfElements++;
    }

    public void display() {
        for(int i=0; i<numberOfElements; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void swap(int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void selectSort() {
        for(int j=0; j <numberOfElements; j++) {
            int min = arr[j];
            int minIndex = j;
            for(int i=j+1; i<numberOfElements; i++) {
                if(arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
            swap(j,minIndex);
        }
    }
}
