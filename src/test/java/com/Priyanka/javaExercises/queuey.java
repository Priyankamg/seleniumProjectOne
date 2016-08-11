package com.Priyanka.javaExercises;

import java.util.LinkedList;

/**
 * Created by Priyanka on 8/10/2016.
 */
public class queuey {

    LinkedList queue;

    public queuey() {
        queue = new LinkedList();
    }

    public void enqueue(int n) {
        queue.addLast(n);
    }

    public Integer dequeue()  {
        return (Integer) queue.remove(0);
    }

    public int size() {
        return queue.size();
    }

    public Integer peek() {
        return (Integer) queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }


    public static void main(String[] args) {

        queuey numberQueue = new queuey();
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
        System.out.println("First out: " + numberQueue.dequeue());
        System.out.println("Second out: " + numberQueue.dequeue());
        System.out.println("Third out: " + numberQueue.dequeue());
    }
}
