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

    public void bubbleBiDirection() {
        for(int i=0; i<numberOfElements/2; i++) {
            int j;
            for(j=0; j<numberOfElements-(i+1); j++) {
                if(arr[j]>arr[j+1])
                    swap(j,j+1);
            }

            for(int k=j; k>0; k--) {
                if(arr[k]<arr[k-1]) {
                    swap(k,k-1);
                }
            }
        }
    }

    public void oddEvenSort() {

        int evenSortVar;
        int oddSortVar;

        if(numberOfElements%2==0) {
            evenSortVar = numberOfElements;
            oddSortVar = numberOfElements-1;
        } else {
            evenSortVar = numberOfElements-1;
            oddSortVar = numberOfElements;
        }

        for(int i=0; i<numberOfElements/2; i++) {
            for(int j=0; j<evenSortVar; j+=2) {
                if(arr[j]>arr[j+1])
                    swap(j,j+1);
            }

            for(int k=1; k<oddSortVar; k+=2) {
                if(arr[k]>arr[k+1])
                    swap(k,k+1);
            }
        }

        if(numberOfElements%2!=0) {
            for(int j=0; j<evenSortVar; j+=2) {
                if(arr[j]>arr[j+1])
                    swap(j,j+1);
            }
        }
    }
}
