package com.Priyanka.dataStructuresTest.collectionsTest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by prinks on 1/15/18.
 */
public class testArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Dan");
        arrayList.add("Matt");
        arrayList.add("Tom");
        arrayList.add("Matt");

        System.out.println("Iteration method 1: ");
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println("Iteration method 2: ");

        for(String i: arrayList)
            System.out.println(i);
    }
}
