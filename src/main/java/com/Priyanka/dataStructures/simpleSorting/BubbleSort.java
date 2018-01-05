package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/4/18.
 */
public class BubbleSort {

    private int[] arr;
    private int numberOfElements;

    public BubbleSort(int size) {
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

    public void bubble() {
        for (int j = 0; j < numberOfElements; j++) {
            for (int i = 0; i < numberOfElements - (j + 1); i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(i, i + 1);
                }
            }
        }
    }
}
