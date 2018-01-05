package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.SelectionSort;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/4/18.
 */
public class SelectionSortTest {
    SelectionSort selectionSort;

    @Before
    public void initialize() {
        selectionSort = new SelectionSort(10);

        selectionSort.insert(10);
        selectionSort.insert(9);
        selectionSort.insert(5);
        selectionSort.insert(4);
        selectionSort.insert(1);
        selectionSort.insert(3);
        selectionSort.insert(2);
        selectionSort.insert(8);
        selectionSort.insert(6);
        selectionSort.insert(7);

        selectionSort.display();
    }

    @Test
    public void testSelectionSort() {
        selectionSort.selectSort();

        selectionSort.display();
    }
}
