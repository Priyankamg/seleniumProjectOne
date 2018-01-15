package com.Priyanka.dataStructuresTest.collectionsTest;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by prinks on 1/15/18.
 */
public class arrayAndLinkedList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Banana");
        arrayList.add("Mango");
        arrayList.add("Papaya");
        arrayList.add("Orange");
        arrayList.add("Mango");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("Turmeric");
        linkedList.add("Red chilli");
        linkedList.add("Cumin");
        linkedList.add("Coriander");
        linkedList.add("Cumin");

        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}
