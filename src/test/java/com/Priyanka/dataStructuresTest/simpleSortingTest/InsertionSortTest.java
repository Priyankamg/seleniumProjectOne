package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.InsertionSort;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/5/18.
 */
public class InsertionSortTest {
    InsertionSort insertionSort;

    @Before
    public void initialize() {
        insertionSort = new InsertionSort(10);


    }

    @Test
    public void testInsertionSort() {
        insertionSort.insert(9);
        insertionSort.insert(4);
        insertionSort.insert(8);
        insertionSort.insert(7);
        insertionSort.insert(1);
        insertionSort.insert(5);
        insertionSort.insert(6);
        insertionSort.insert(2);
        insertionSort.insert(3);
        insertionSort.insert(10);

        insertionSort.display();
        insertionSort.insertionSortMethod();

        insertionSort.display();
    }

    @Test
    public void testInsertionSortDesc() {
        insertionSort.insert(10);
        insertionSort.insert(9);
        insertionSort.insert(8);
        insertionSort.insert(7);
        insertionSort.insert(6);
        insertionSort.insert(5);
        insertionSort.insert(4);
        insertionSort.insert(3);
        insertionSort.insert(2);
        insertionSort.insert(1);

        insertionSort.display();

        insertionSort.insertionSortMethod();
        insertionSort.display();
    }

    @Test
    public void testThree() {
        insertionSort.insert(9);
        insertionSort.insert(7);
        insertionSort.insert(10);
        insertionSort.insert(1);
        insertionSort.insert(8);

        insertionSort.display();

        insertionSort.insertionSortMethod();
        insertionSort.display();
    }

    @Test
    public void testFour() {
        insertionSort.insert(11);
        insertionSort.insert(10);
        insertionSort.insert(100);
        insertionSort.insert(99);
        insertionSort.insert(88);
        insertionSort.insert(88);
        insertionSort.insert(99);
        insertionSort.insert(99);

        insertionSort.display();

        insertionSort.insertionSortMethod();

        insertionSort.display();
    }

    @Test
    public void testMedianEven() {
        for(int i=4; i>0; i--)
            insertionSort.insert(i);

        insertionSort.display();

        System.out.println("Median of 8 numbers is: " + insertionSort.getMedian());


    }

    @Test
    public void testMedianOdd() {
        for(int i=5; i>0; i--)
            insertionSort.insert(i);

        insertionSort.display();

        System.out.println("Median of 9 numbers is: " + insertionSort.getMedian());
    }
}
