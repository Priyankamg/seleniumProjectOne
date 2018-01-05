package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.BubbleSort;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/4/18.
 */
public class BubbleSortTest {

    BubbleSort bubbleSort;

    @Before
    public void initialize() {
        bubbleSort = new BubbleSort(10);
    }

    @Test
    public void testBubbleMethod() {
        for(int i=10; i>0; i--) {
            bubbleSort.insert(i);
        }
        bubbleSort.display();

        bubbleSort.bubble();
        bubbleSort.display();
    }
}
