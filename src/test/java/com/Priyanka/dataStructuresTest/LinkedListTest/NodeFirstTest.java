package com.Priyanka.dataStructuresTest.LinkedListTest;

import com.Priyanka.dataStructures.linkedList.NodeFirst;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/31/18.
 */
public class NodeFirstTest {

    NodeFirst nF;

    @Before
    public void initialize() {
        nF = new NodeFirst();
    }

    @Test
    public void test1() {
        nF.insertFirst(2,12);
        nF.insertFirst(3,13);
        nF.insertFirst(4,14);
        nF.insertFirst(5,15);
        nF.display();
    }

    @Test
    public void test2() {
        nF.insertFirst(1,11);
        nF.insertFirst(2,22);
        nF.insertFirst(3,33);
        nF.insertFirst(4,44);
        nF.insertFirst(5,55);
        nF.display();

        System.out.println("----------");

        try {
            nF.deleteFirst();
            nF.deleteFirst();
            nF.display();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
