package com.Priyanka.dataStructures.arrays;

/**
 * Created by prinks on 1/4/18.
 */
public class UnorderedArray {
    private int[] arr;
    private int numberOfElements;

    public UnorderedArray(int size) {
        arr = new int[size];
        numberOfElements = 0;
    }

    public void insert(int element) {
        arr[numberOfElements] = element;
        numberOfElements++;
    }

    public boolean find(int element) {
        for(int i=0; i<numberOfElements; i++) {
            if(arr[i]==element)
                return true;
        }
        return false;
    }

    public boolean delete(int element) {
        if(find(element)) {
            int i;
            for (i = 0; i < numberOfElements; i++) {
                if (arr[i] == element)
                    break;
            }
            for(int j=i; j<numberOfElements-1; j++) {
                arr[j] = arr[j+1];
            }
            numberOfElements--;
            return true;
        }
        return false;
    }

    public void display() {
        if(numberOfElements!=0) {
            for(int i=0; i<numberOfElements; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public int getSize() {
        return numberOfElements;
    }

    public int getMax() {
        if(numberOfElements==0)
            return -1;
        else {
            int max = arr[0];
            for(int i=1; i<numberOfElements; i++) {
                if(arr[i]>max)
                    max = arr[i];
            }
            return max;
        }
    }

    public boolean removeMax() {
        if(numberOfElements==0)
            return false;
        else {
            int max = getMax();
            delete(max);
            return true;
        }
    }

    public void noDuplicates() {
        for(int i=0; i<numberOfElements-1; i++) {
            for(int j=i+1; j<numberOfElements; j++) {
                if(arr[j] == arr[i]) {
                    for(int k = j; k <numberOfElements-1; k++) {
                        arr[k] = arr[k+1];
                    }
                    numberOfElements--;
                    j--;
                }
            }
        }
    }
}
