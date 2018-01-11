package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.PriorityQueue;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/11/18.
 */
public class PriorityQueueTest {
    PriorityQueue priorityQueue;

    @Before
    public void initialize() {
        priorityQueue = new PriorityQueue(10);
    }

    @Test
    public void testInsertPeekRemove() {
        try {
            priorityQueue.insert(10);
            priorityQueue.insert(5);
            priorityQueue.insert(15);
            priorityQueue.insert(30);
            priorityQueue.insert(1);
            priorityQueue.insert(20);
            priorityQueue.insert(25);
            priorityQueue.display();

            System.out.println("Element to remove: " + priorityQueue.peek());

            while (!priorityQueue.isEmpty()) {
                System.out.print(priorityQueue.remove() + " ");
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void insertGreaterThanNumberOfElements() {
        priorityQueue = new PriorityQueue(5);
        try {
            priorityQueue.insert(20);
            priorityQueue.insert(25);
            priorityQueue.insert(11);
            priorityQueue.insert(22);
            priorityQueue.insert(2);

            priorityQueue.display();

            priorityQueue.insert(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void removeMoreThanNumberOfElements() {
        priorityQueue = new PriorityQueue(5);
        try {
            priorityQueue.insert(25);
            priorityQueue.insert(11);
            priorityQueue.insert(30);
            priorityQueue.insert(27);
            priorityQueue.insert(12);

            priorityQueue.display();

            while(!priorityQueue.isEmpty()) {
                System.out.print(priorityQueue.remove() + " ");
            }
            System.out.println();
            System.out.println(priorityQueue.remove());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
