package com.Priyanka.dataStructuresTest.collectionsTest;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by prinks on 1/15/18.
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Onion");
        linkedList.add("Tomato");
        linkedList.add("Carrot");
        linkedList.add("Beans");
        linkedList.add("Carrot");
        linkedList.add("Brocolli");
        linkedList.add("Beans");

        Iterator iterator = linkedList.iterator();

        while(iterator.hasNext())
            System.out.println(iterator.next());
    }
}
