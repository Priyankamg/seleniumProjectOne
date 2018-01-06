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

    @Test
    public void testBubbleSortBiDirection() {
        for(int i=9; i>0; i--)
            bubbleSort.insert(i);

        bubbleSort.display();

        bubbleSort.bubbleBiDirection();
        bubbleSort.display();
    }

    @Test
    public void testBubbleSortRandomBiDirection() {
        bubbleSort.insert(5);
        bubbleSort.insert(3);
        bubbleSort.insert(9);
        bubbleSort.insert(12);
        bubbleSort.insert(6);
        bubbleSort.insert(4);
        bubbleSort.insert(1);
        bubbleSort.insert(10);
        bubbleSort.insert(100);
        bubbleSort.insert(50);

        bubbleSort.display();

        bubbleSort.bubbleBiDirection();
        bubbleSort.display();
    }

    @Test
    public void oddEvenSortTest() {
        for(int i=10; i>0; i--)
            bubbleSort.insert(i*3);

        bubbleSort.display();

        bubbleSort.oddEvenSort();

        bubbleSort.display();
    }

    @Test
    public void oddEvenSortTest2() {
        for(int i=9; i>0; i--)
            bubbleSort.insert(i*7);

        bubbleSort.display();

        bubbleSort.oddEvenSort();

        bubbleSort.display();
    }
}
