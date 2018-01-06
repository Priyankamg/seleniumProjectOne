package com.Priyanka.dataStructures.simpleSorting;

/**
 * Created by prinks on 1/5/18.
 */
public class InsertionSortObject {
    private Personnel[] arr;
    private int numberOfElements;

    public InsertionSortObject(int size) {
        arr = new Personnel[size];
        numberOfElements = 0;
    }

    public void insert(String firstName, String lastName, int age) {
        arr[numberOfElements] = new Personnel(firstName, lastName, age);
        numberOfElements++;
    }

    public void display() {
        for(int i=0; i<numberOfElements; i++) {
            arr[i].display();
        }
    }

    public void sortInsertionMethod() {
        for(int i=1; i<numberOfElements; i++) {
            Personnel temp = arr[i];
            int j = i;
            while(j>0 && arr[j-1].getLastName().compareTo(temp.getLastName())>0) {
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}
