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

    /*
    Arrange elements in ascending order.
    Starting from the last to the first
     */
    public void bubbleSort() {
        for(int i=arraySize-1; i>0; i--) {
            for(int j=0; j<i; j++) {
                if(theArray[j] > theArray[j+1]) {
                    swap(j, j+1);
                }
            }
        }
    }

    public void swap(int indexOne, int indexTwo) {
        int temp;
        temp = theArray[indexOne];
        theArray[indexOne] = theArray[indexTwo];
        theArray[indexTwo] = temp;
    }

    public void binarySearchForValue(int value) {
        //bubbleSort();
        int lowIndex = 0;
        int highIndex = arraySize - 1;
        boolean elementPresent = false;
        while(lowIndex<=highIndex) {
            System.out.println("Low Index: " + lowIndex + " High Index: " + highIndex);
            int middleIndex = (lowIndex+highIndex)/2;
            if(theArray[middleIndex]<value) {
                lowIndex = middleIndex + 1;
            } else if(theArray[middleIndex]>value) {
                highIndex = middleIndex - 1;
            } else {
                System.out.println("Found a match for " + value + " at index " + middleIndex);
                elementPresent = true;
                lowIndex = highIndex+1;
            }
        }
        if(!elementPresent) {
            System.out.println("The value " + value + " is not present in the array");
        }
    }

    public void printHorzArray() {
        for(int i=0; i<arraySize; i++) {
            System.out.print(" | " + i );
        }
        System.out.println();
        for(int i=0; i<arraySize; i++) {
            System.out.print(" | " + theArray[i]);
        }
        System.out.println();
    }

    public void selectionSort() {
        for (int j = 0; j < arraySize; j++) {
            int minValue = theArray[j];
            int minValuePos = j;
            for (int i = j; i < (arraySize - 1); i++) {
                if (minValue > theArray[i + 1]) {
                    minValue = theArray[i + 1];
                    minValuePos = i+1;
                }
            }
            if(!(minValuePos==j))
                swap(j,minValuePos);
        }
    }


    public void insertionSort() {
        for(int i=1; i<arraySize; i++) {
            for(int j=i; j>0; j--) {
                if(theArray[j]<theArray[j-1]) {
                    swap(j, j-1);
                }
            }

        }
    }
}
