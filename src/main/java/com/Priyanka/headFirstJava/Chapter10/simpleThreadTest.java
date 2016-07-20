package com.Priyanka.headFirstJava.Chapter10;

/**
 * Created by Priyanka on 7/19/2016.
 */
public class simpleThreadTest {
    public static void main(String[] args) {
        System.out.println("1." + Thread.currentThread().getName());
        System.out.println("Hello");
        wait(10);
        System.out.println("3. " + Thread.currentThread().getName());
        System.out.println("World");

    }

    public static void wait(int seconds) {
        try {
            System.out.println("2. " + Thread.currentThread().getName());
            Thread.sleep(seconds * 1000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
