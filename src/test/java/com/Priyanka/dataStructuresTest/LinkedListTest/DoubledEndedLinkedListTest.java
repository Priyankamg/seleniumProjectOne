package com.Priyanka.dataStructuresTest.LinkedListTest;

import com.Priyanka.dataStructures.linkedList.DoubleEndedLinkedList;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/31/18.
 */
public class DoubledEndedLinkedListTest {
    DoubleEndedLinkedList doubleEndedLinkedList;

    @Before
    public void initialize() {
        doubleEndedLinkedList = new DoubleEndedLinkedList();
    }

    @Test
    public void test1() {
        doubleEndedLinkedList.insertFirst(5);
        doubleEndedLinkedList.insertLast(6);
        doubleEndedLinkedList.insertFirst(4);
        doubleEndedLinkedList.insertFirst(3);
        doubleEndedLinkedList.insertLast(7);
        doubleEndedLinkedList.insertLast(8);
        doubleEndedLinkedList.insertFirst(2);
        doubleEndedLinkedList.insertFirst(1);
        doubleEndedLinkedList.insertLast(9);
        doubleEndedLinkedList.insertLast(10);

        doubleEndedLinkedList.deleteFirst();
        doubleEndedLinkedList.deleteFirst();

        doubleEndedLinkedList.display();
    }



}
