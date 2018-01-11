package com.Priyanka.dataStructuresTest.arraysTest;

import org.junit.Test;

import java.util.*;

/**
 * Created by prinks on 1/9/18.
 */
public class basicTests {
    @Test
    public void testHashSet() {
        int[] arr = {9,8,7,7,1,1,2,2,1,7,8,4,7};
        Set<Integer> noDups = new HashSet<Integer>();

        for(int i: arr) {
            noDups.add(i);
        }

        Iterator<Integer> noDupsIterator = noDups.iterator();

        while (noDupsIterator.hasNext()) {
            System.out.print(noDupsIterator.next() + " ");
        }
        System.out.println();
    }

    @Test
    public void testLinkedHashSet() {
        int[] arr = {20, 40, 50, 50, 40, 40, 20, 70, 90, 70, 100, 200};

        Set<Integer> noDupsLinkedHashSet = new LinkedHashSet<Integer>();

        for(int i: arr)
            noDupsLinkedHashSet.add(i);

        Iterator<Integer> noDupsLinkedHashSetIterator = noDupsLinkedHashSet.iterator();

        while(noDupsLinkedHashSetIterator.hasNext()) {
            System.out.print(noDupsLinkedHashSetIterator.next() + " ");
        }
        System.out.println();
    }

    @Test
    public void testHashMap() {
        int[] arr = {20, 40, 50, 50, 40, 40, 20, 70, 90, 70, 100, 200};

        HashMap<Integer, Integer> noDupsHashMap = new HashMap<Integer, Integer>();

        for(int i: arr) {
            if(!noDupsHashMap.containsKey(i)) {
                noDupsHashMap.put(i,1);
            }
        }

//        for(Map.Entry<Integer, Integer> i: noDupsHashMap.entrySet()) {
//            System.out.println(i.getKey() + " : " + i.getValue());
//        }

        for(int i: noDupsHashMap.keySet()) {
            System.out.println(i + ": " + noDupsHashMap.get(i));
        }
    }
}
