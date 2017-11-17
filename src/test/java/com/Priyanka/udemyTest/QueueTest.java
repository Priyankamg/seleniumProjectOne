package com.Priyanka.udemyTest;

import udemy.Queue;

/**
 * Created by prinks on 11/11/17.
 */
public class QueueTest {
    public static void main(String[] args) {
       Queue queue = new Queue(3);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
       // queue.insert(4);

        while(!queue.isEmpty()) {
            System.out.println(queue.delete());
        }
        //queue.delete();
    }
}
