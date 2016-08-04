package com.Priyanka.algorithmsTest;

import com.Priyanka.algorithms.stack;
import com.Priyanka.algorithms.stackEmptyException;
import com.Priyanka.algorithms.stackFullException;

/**
 * Created by Priyanka on 8/3/2016.
 */
public class stackTest {
    public static void main(String[] args) {
        stack  stk = new stack(5);
        try {
            stk.push("Apple");
            stk.push("Banana");
            stk.push("Mango");
            stk.push("Grapes");
            stk.push("WaterMelon");
          //  stk.push("Cherries");
        } catch (stackFullException s) {
            s.printStackTrace();
        }
        try {
            stk.displayStack();
        } catch (stackEmptyException s) {
            s.printStackTrace();
        }

        try {
            System.out.println("-------");
            stk.pop();
            stk.pop();
            System.out.println("+++"+ stk.peek());
            stk.displayStack();
            System.out.println("-------");
            stk.pop();
            stk.pop();
            System.out.println("+++" + stk.peek());
            stk.displayStack();
            System.out.println("-------");

            stk.pushMany("Cherry BlueBerry Orange");
            stk.displayStack();

            stk.popAll();
            stk.displayStack();
        } catch (stackEmptyException s) {
            s.printStackTrace();
        } catch (stackFullException s) {
            s.printStackTrace();
        }


    }
}
