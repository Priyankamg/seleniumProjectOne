package com.Priyanka.dataStructuresTest.collectionsTest;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by prinks on 1/15/18.
 */
public class testPrev {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Chair");
        al.add("Table");
        al.add("Sofa");
        al.add("Mattress");
        al.add(3,"Bed");

        ListIterator<String> itr = al.listIterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
