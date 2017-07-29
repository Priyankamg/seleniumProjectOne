package com.Priyanka.dsaTest;

import com.Priyanka.dsa.StackAgain;

/**
 * Created by prinks on 7/29/17.
 */
public class StackAgainTest {
    public static void main(String[] args) {
        StackAgain sa1 = new StackAgain(5);

        try {
            sa1.push(10);
            sa1.push(20);
            sa1.push(30);
            sa1.push(40);
            sa1.push(50);
            sa1.push(60);
            sa1.printStack();
            while(!sa1.isEmpty()) {
                System.out.println(sa1.pop());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You are trying to insert more elements into the stack than it's maximum size.");
            System.out.println("Increase the size in the constructor itself");
        }


    }
}
