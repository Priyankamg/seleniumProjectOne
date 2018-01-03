package com.Priyanka.dataStructures.arraysTest;

import com.Priyanka.dataStructures.arrays.HighArray;

/**
 * Created by prinks on 1/2/18.
 */
public class HighArrayTest {
    public static void main(String[] args) {
        HighArray highArray = new HighArray(8);
        highArray.insert(10);
        highArray.insert(20);
        highArray.insert(30);
        highArray.insert(40);
        highArray.insert(50);
        highArray.insert(60);
        highArray.insert(70);
        highArray.insert(80);

        highArray.display();

        if(highArray.find(30)) {
            System.out.println("Found element 30");
        } else {
            System.out.println("Did not find element 30");
        }

        if(highArray.find(100)) {
            System.out.println("Found element 100");
        } else {
            System.out.println("Did not find element 100");
        }

        highArray.delete(40);
        highArray.display();

        highArray.delete(80);
        highArray.display();

        highArray.delete(11);
        highArray.display();

        highArray.delete(20);
        highArray.delete(50);
        highArray.delete(10);
        highArray.display();
    }
}
