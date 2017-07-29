package com.Priyanka.dsaTest;

import com.Priyanka.dsa.Queue;

/**
 * Created by prinks on 7/29/17.
 */
public class QueueTest  {
    public static void main(String[] args) {
        Queue q = new Queue(10);
        try {
            for (int i = 0; i < 10; i++) {
                q.push((i + 1));
            }
            q.printQueue();

            for (int i = 9; i >= 0; i--) {
                System.out.print(q.pop() + " ");
            }
            System.out.println();
            System.out.print(q.pop());
        } catch (ArrayIndexOutOfBoundsException e) {

        }



    }
}
