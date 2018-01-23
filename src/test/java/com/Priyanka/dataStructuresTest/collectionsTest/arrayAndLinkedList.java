package com.Priyanka.dataStructuresTest.collectionsTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

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

        ListIterator<String> arrayListIterator = arrayList.listIterator();
        System.out.println("ArrayList: Printing in forward direction: ");
        while(arrayListIterator.hasNext())
            System.out.println(arrayListIterator.next());


        System.out.println("ArrayList: Printing in reverse direction: ");
        while(arrayListIterator.hasPrevious())
            System.out.println(arrayListIterator.previous());

        ListIterator<String> linkedListIterator = linkedList.listIterator();
        System.out.println("LinkedList: Printing in forward direction: ");
        while (linkedListIterator.hasNext())
            System.out.println(linkedListIterator.next());

        System.out.println("LinkedList: Printing in reverse direction: ");
        while(linkedListIterator.hasPrevious())
            System.out.println(linkedListIterator.previous());
        }

    }
