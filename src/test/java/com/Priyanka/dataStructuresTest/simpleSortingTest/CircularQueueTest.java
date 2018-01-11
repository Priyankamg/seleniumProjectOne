package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.CircularQueue;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/10/18.
 */
public class CircularQueueTest {
    CircularQueue circularQueue;

    @Before
    public void initialize() {
        circularQueue = new CircularQueue(5);
    }

    @Test
    public void testInsert() {
        for(int i=0; i<5; i++)
            circularQueue.insert((i+1)*9);
        circularQueue.display();

        circularQueue.insert(10);

        circularQueue.display();
    }
}
