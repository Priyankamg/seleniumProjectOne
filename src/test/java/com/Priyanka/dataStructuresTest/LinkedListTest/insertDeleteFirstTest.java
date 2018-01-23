package com.Priyanka.dataStructuresTest.LinkedListTest;

import com.Priyanka.dataStructures.linkedList.Link;
import com.Priyanka.dataStructures.linkedList.insertDeleteFirst;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/20/18.
 */
public class insertDeleteFirstTest {

    insertDeleteFirst idf;

    @Before
    public void initialize() {
        idf = new insertDeleteFirst();
    }

    @Test
    public void testInsertion() {
        idf.insertFirst(1,11);
        idf.insertFirst(2,12);
        idf.insertFirst(3,13);
        idf.insertFirst(4,14);
        idf.insertFirst(5,15);
        idf.display();
    }

    @Test
    public void testInsertionAndRemoval() {
        idf.insertFirst(9,999);
        idf.insertFirst(8,888);
        idf.insertFirst(7,777);
        idf.insertFirst(6,666);
        idf.insertFirst(5,555);
        System.out.println("Linked list in the beginning:");
        idf.display();

        try {
            Link l = idf.removeFirst();
            System.out.println("Removed Linked List:");
            l.display();
            System.out.println("Linked List after removing the first node:");
            idf.display();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRemovalEmptyLinkedList() {
        idf.insertFirst(2,20);
        idf.display();

        try {
            Link l = idf.removeFirst();
            System.out.println("--");
            System.out.println("Removal of first node: ");
            l.display();

            System.out.println("--");
            System.out.println("Removal when there are no nodes: ");
            idf.removeFirst();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertFind() {
        idf.insertFirst(5,10);
        idf.insertFirst(15,20);
        idf.insertFirst(25,30);
        idf.insertFirst(35,40);
        idf.insertFirst(45,50);

        idf.display();

        try {
            Link l = idf.find(5);
            System.out.println("-- After find method --");
            l.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertFindIntElementDoesNotExist() {
        idf.insertFirst(5,10);
        idf.insertFirst(15,20);
        idf.insertFirst(25,30);
        idf.insertFirst(35,40);
        idf.insertFirst(45,50);

        idf.display();

        try {
            Link l = idf.find(40);
            System.out.println("-- After find method --");
            l.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
