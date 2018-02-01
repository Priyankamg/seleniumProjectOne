package com.Priyanka.dataStructuresTest.LinkedListTest;

import com.Priyanka.dataStructures.linkedList.Node;
import com.Priyanka.dataStructures.linkedList.NodeFirst;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/31/18.
 */
public class NodeFirstTest {

    NodeFirst nF;
    Node n;

    @Before
    public void initialize() {
        nF = new NodeFirst();
    }

    @Test
    public void testInsert() {
        nF.insertFirst(2,12);
        nF.insertFirst(3,13);
        nF.insertFirst(4,14);
        nF.insertFirst(5,15);
        nF.display();
    }

    @Test
    public void testInsertDelete() {
        nF.insertFirst(1,11);
        nF.insertFirst(2,22);
        nF.insertFirst(3,33);
        nF.insertFirst(4,44);
        nF.insertFirst(5,55);
        nF.display();
        System.out.println("----------");
        try {
            n = nF.deleteFirst();
            System.out.print("Deleted...");
            n.display();
            n = nF.deleteFirst();
            System.out.print("Deleted..");
            n.display();
            System.out.println("Rest of the list: ");
            nF.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertFindKeyInList() {
        nF.insertFirst(1,111);
        nF.insertFirst(2,222);
        nF.insertFirst(3,333);
        nF.insertFirst(4,444);
        nF.insertFirst(5,555);
        nF.display();
        System.out.println("----");
        Node n;

        try {
            n = nF.find(2);
            n.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testInsertFindKeyNotInList() {
        nF.insertFirst(1,111);
        nF.insertFirst(2,222);
        nF.insertFirst(3,333);
        nF.insertFirst(4,444);
        nF.insertFirst(5,555);
        nF.display();
        System.out.println("----");
        Node n;

        try {
            n = nF.find(6);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindWhenLinkedListIsEmpty() {
        try {
            n = nF.find(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findAndDeleteSingleElement() {
        nF.insertFirst(1,100);
        try {
            Node n = nF.deleteAfterFind(1);
            System.out.println("Deleted...");
            n.display();
            System.out.println("Remaining list...");
            nF.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findAndDeleteOnly2ElementsLinkedList() {
        nF.insertFirst(2,200);
        nF.insertFirst(3,300);
        System.out.println("Initial list...");
        nF.display();
        try {
            Node n = nF.deleteAfterFind(2);
            System.out.println("Deleted...");
            n.display();
            System.out.println("Remaining list...");
            nF.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findAndDelete3ElementsLinkedList() {
        nF.insertFirst(4,400);
        nF.insertFirst(5,500);
        nF.insertFirst(6,600);
        System.out.println("Initial list...");
        nF.display();

        try {
            Node n = nF.deleteAfterFind(5);
            System.out.println("Deleted...");
            n.display();
            System.out.println("Remaining list...");
            nF.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findAndDeleteTest4() {
        nF.insertFirst(4,400);
        nF.insertFirst(5,500);
        nF.insertFirst(6,600);
        System.out.println("Initial list...");
        nF.display();

        try {
            Node n = nF.deleteAfterFind(4);
            System.out.println("Deleted...");
            n.display();
            System.out.println("Remaining list...");
            nF.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void findAndDeleteTest5() {
        nF.insertFirst(1,100);
        nF.insertFirst(2,200);
        nF.insertFirst(3,300);
        nF.insertFirst(4,400);
        nF.insertFirst(5,500);
        System.out.println("Initial list...");
        nF.display();

        try {
            Node n = nF.deleteAfterFind(3);
            System.out.println("Deleted...");
            n.display();
            System.out.println("Remaining list...");
            nF.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
