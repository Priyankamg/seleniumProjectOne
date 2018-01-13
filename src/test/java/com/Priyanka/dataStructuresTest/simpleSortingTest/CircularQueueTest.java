package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.CircularQueue;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/10/18.
 */
public class CircularQueueTest {
    CircularQueue circularQueue;

    @Test
    public void testCircularQueue() {
        circularQueue = new CircularQueue(5);
        try {
            circularQueue.insert(10);
            circularQueue.insert(20);
            circularQueue.insert(30);
            circularQueue.insert(40);
            circularQueue.insert(50);
            circularQueue.display();

            while (!circularQueue.isEmpty()) {
                System.out.print(circularQueue.remove() + " ");
            }
            System.out.println();

            circularQueue.insert(100);
            circularQueue.insert(200);
            circularQueue.display();

            System.out.println(circularQueue.remove());

            circularQueue.display();

            circularQueue.insert(300);
            circularQueue.insert(400);
            circularQueue.insert(500);
            circularQueue.insert(600);
            circularQueue.display();

            while(!circularQueue.isEmpty())
                System.out.print(circularQueue.remove() + " ");
            System.out.println();

            circularQueue.insert(3);
            circularQueue.insert(6);
            circularQueue.insert(9);

            circularQueue.display();

            circularQueue.insert(12);
            circularQueue.insert(15);
            circularQueue.display();

            System.out.println(circularQueue.remove());
            System.out.println(circularQueue.remove());
            circularQueue.insert(18);
            circularQueue.insert(21);
            circularQueue.display();

            while(!circularQueue.isEmpty())
                System.out.print(circularQueue.remove() + " ");
            System.out.println();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
