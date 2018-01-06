package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/5/18.
 */
public class InsertionSort {
    private int[] arr;
    private int numberOfElements;

    public InsertionSort(int size) {
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

    public void insertionSortMethod() {
        for(int i=1; i<numberOfElements; i++) {
            int temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1]>temp) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }

    public int getMedian() {
        insertionSortMethod();
        return arr[numberOfElements/2];
    }
}
