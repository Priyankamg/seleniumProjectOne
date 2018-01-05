package com.Priyanka.dataStructures.sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by prinks on 1/4/18.
 */
public class UnderstandHashSet {
    public static void main(String[] args) {
        int[] arr = {2,5,6,5,7,5,5,6,5,6,1,2,19,5,12};

        Set<Integer> uniqueSet = new HashSet<Integer>();

        for(int i : arr) {
            uniqueSet.add(i);
        }

        Iterator<Integer> it = uniqueSet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
      //  System.out.println();
    }
}
