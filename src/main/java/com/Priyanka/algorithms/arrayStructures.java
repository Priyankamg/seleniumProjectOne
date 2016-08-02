package com.Priyanka.algorithms;

/**
 * Created by Priyanka on 8/2/2016.
 */
public class arrayStructures {
    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray() {
        for(int i=0; i<arraySize; i++) {
            theArray[i] = (int) ((Math.random()*10)+10);
        }
    }

    public void printArray() {
        System.out.println("----------");
        for(int i=0; i<arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " | ");
        }
        System.out.println("----------");
    }

    public int getValueIndex(int index) {
        if(index<arraySize)
            return theArray[index];
        return 0;
    }

    public boolean doesArrayContainThisValue(int value) {
        boolean valuePresentInArray = false;
        for(int i=0; i<arraySize; i++) {
            if(theArray[i] == value) {
                valuePresentInArray = true;
            }
        }
        return valuePresentInArray;
    }

    public void deleteValueAtIndex(int index) {
        if(index<arraySize) {
            for(int i=index; i<arraySize-1; i++) {
                theArray[i] = theArray[i+1];
            }
        }
        arraySize--;
    }

    public void insertValue(int value){
        if(arraySize<50) {
            theArray[arraySize] = value;
        }
        arraySize++;
    }

    public String linearSearch(int value) {
        String indicesWithValue = "";
        boolean valueFound = false;
        System.out.print("The value was found at the following indices: ");

        for(int i=0; i<arraySize; i++) {
            if(theArray[i] == value) {
                valueFound = true;
                indicesWithValue += i + " ";
            }
        }

        if(!valueFound) {
            indicesWithValue = "none";
        }
        return indicesWithValue;
    }
}
