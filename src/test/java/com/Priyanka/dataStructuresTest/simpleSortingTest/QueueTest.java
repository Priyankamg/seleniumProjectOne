package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.Queue;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by prinks on 1/10/18.
 */
public class QueueTest {
    Queue queue;

    @Before
    public void initialize() {
        queue = new Queue(10);
    }

    @Test
    public void testInsert() {
        try {
            queue.insert(11);
            queue.insert(22);
            queue.insert(33);
            queue.insert(44);
            queue.insert(55);
            queue.insert(66);

            queue.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRemove() {
        try {
            queue.insert(10);
            queue.insert(20);
            queue.insert(30);
            queue.insert(40);
            queue.insert(50);
            queue.insert(60);
            queue.insert(70);
            queue.insert(80);
            queue.insert(90);
            queue.insert(100);

            while(!queue.isEmpty()) {
                System.out.print(queue.remove() + " ");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertMoreElementsThanMaxSize() {
        try {
            int i = 1;
            while(!queue.isFull()) {
                queue.insert(i*3);
                i++;
            }
            queue.display();
            queue.insert(33);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testDeleteMoreItemsThanInserted() {
        try {
            for(int i=1; i<6; i++) {
                queue.insert(i*4);
            }
            while(!queue.isEmpty()) {
                System.out.print(queue.remove() + " ");
            }
            queue.remove();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
