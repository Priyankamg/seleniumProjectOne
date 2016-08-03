package com.Priyanka.algorithmsPackage;

import com.Priyanka.algorithms.arrayStructures;

/**
 * Created by Priyanka on 8/2/2016.
 */
public class arrayStructuresTest {
    public static void main(String[] args) {
        arrayStructures newArr = new arrayStructures();
        newArr.generateRandomArray();
        newArr.printArray();
        System.out.println(newArr.getValueIndex(3));
        System.out.println(newArr.doesArrayContainThisValue(16));

        newArr.deleteValueAtIndex(5);
        newArr.printArray();

        newArr.insertValue(20);
        newArr.printArray();

        System.out.println(newArr.linearSearch(12));
        newArr.printHorzArray();

        newArr.bubbleSort();
        newArr.printHorzArray();
        //newArr.printHorzArray();
        newArr.binarySearchForValue(18);


    }
}
