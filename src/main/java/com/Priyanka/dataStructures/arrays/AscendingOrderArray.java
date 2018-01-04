package com.Priyanka.dataStructures.arrays;

/**
 * Created by prinks on 1/4/18.
 */
public class AscendingOrderArray {
    private int[] arr;
    private int numberOfElements;

    public AscendingOrderArray(int size) {
        arr = new int[size];
        numberOfElements = 0;
    }

    public int getSize() {
        return numberOfElements;
    }

    public int find(int element) {
        int lowerIndex = 0;
        int upperIndex = numberOfElements - 1;
        int curIn;

        while(true) {
            curIn = (lowerIndex + upperIndex) / 2;
            if(arr[curIn] == element)
                return curIn;
            else if(lowerIndex > upperIndex)
                return numberOfElements;
            else {
                if(arr[curIn] < element) {
                    lowerIndex = curIn + 1;
                } else {
                    upperIndex = curIn - 1;
                }
            }
        }
    }

    public int findIndexForInsert(int element) {
        int lowerIndex = 0;
        int upperIndex = numberOfElements - 1;
        int curIn;

        while(true) {
            curIn = (lowerIndex + upperIndex) / 2;
            if(arr[curIn]==element) {
                return curIn;
            } else if(lowerIndex > upperIndex) {
                return lowerIndex;
            } else {
                if(arr[curIn] < element) {
                    lowerIndex = curIn + 1;
                } else {
                    upperIndex = curIn - 1;
                }
            }
        }
    }

    public void insert(int element) {
        if(numberOfElements==0) {
            arr[numberOfElements] = element;
        } else {
            int indexToInsert = findIndexForInsert(element);
            for(int i=numberOfElements-1; i>=indexToInsert; i--) {
                arr[i+1] = arr[i];
            }
            arr[indexToInsert] = element;
        }
        numberOfElements++;
    }

    public boolean delete(int element) {
        int indexToDelete = find(element);
        if(indexToDelete==getSize())
            return false;
        else {
            for(int i=indexToDelete; i<numberOfElements-1; i++)
                arr[i] = arr[i+1];
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
