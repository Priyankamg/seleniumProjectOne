package com.Priyanka.dataStructures.arrays;

/**
 * Created by prinks on 1/3/18.
 */
public class PersonHighArray {
    private Person[] arr;
    private int numberElements;

    public PersonHighArray(int size) {
        arr = new Person[size];
        numberElements = 0;
    }

    public Person find(String keyValue) {
        for(int i=0; i<numberElements; i++) {
            if(arr[i].getLastName().equals(keyValue))
                return arr[i];
        }
        return null;
    }

    public void insert(String firstName, String lastName, int age) {
        arr[numberElements] = new Person(firstName, lastName, age);
        numberElements++;
    }

    public boolean delete(String keyValue) {

        int i;
        for(i=0; i<numberElements; i++) {
            if(arr[i].getLastName().equals(keyValue))
                break;
        }

        if(i==numberElements) {
            return false;
        } else {
            for(int j=i; j<numberElements-1; j++) {
                arr[j] = arr[j+1];
            }
            numberElements--;
            return true;
        }
    }

    public void display() {
        for(int i=0; i<numberElements; i++) {
            arr[i].display();
        }
    }
}
