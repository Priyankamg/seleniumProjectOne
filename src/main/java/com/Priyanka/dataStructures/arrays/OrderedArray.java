package com.Priyanka.dataStructures.arrays;

/**
 * Created by prinks on 1/3/18.
 */
public class OrderedArray {
    private int[] arr;
    private int numberElements;

    public OrderedArray(int size) {
        arr = new int[size];
        numberElements = 0;
    }

    public int size() {
        return numberElements;
    }

    public int find(int searchKey) {
        int lowerIndex = 0;
        int upperIndex = numberElements - 1;
        int curIn;

        while(true) {
            curIn = (lowerIndex + upperIndex)/2;
            if(arr[curIn] == searchKey)
                return curIn;
            else if (lowerIndex > upperIndex)
                return numberElements;
            else {
                if(arr[curIn] < searchKey) {
                    lowerIndex = curIn + 1;
                } else {
                    upperIndex = curIn - 1;
                }
            }
        }
    }

    public void insert(int value) {
        if(numberElements==0)
            arr[0] = value;
        else if(arr[numberElements-1]<value)
            arr[numberElements] = value;
        else {
            int i;
            for (i = 0; i < numberElements; i++) {
                if (arr[i] > value)
                    break;
            }
            for (int j = numberElements - 1; j >=i; j--) {
                arr[j + 1] = arr[j];
            }
            arr[i] = value;
        }
        numberElements++;
    }

    public boolean delete(int value) {
        int index = find(value);
        if(index==size())
            return false;
        else {
            for(int j=index; j<numberElements-1; j++)
                arr[j] = arr[j+1];
            numberElements--;
            return true;
        }
    }

    public void display() {
        for(int i=0; i<numberElements; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
