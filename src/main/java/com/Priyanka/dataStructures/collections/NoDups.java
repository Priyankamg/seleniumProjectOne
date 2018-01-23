package com.Priyanka.dataStructures.collections;

import java.util.*;

/**
 * Created by prinks on 1/15/18.
 */
public class NoDups {

    public void print(Collection c) {
        Iterator iterator = c.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }

    public HashSet<Integer> noDuplicates(int[] arr) {
        HashSet<Integer> integerHashSet = new HashSet<Integer>();
        for(int i: arr)
            integerHashSet.add(i);

        print(integerHashSet);
        return integerHashSet;
    }

    public LinkedHashSet<Integer> noDupsLinkedHashSet(int[] arr) {
        LinkedHashSet<Integer> integerLinkedHashSet = new LinkedHashSet<Integer>();
        for(int i: arr)
            integerLinkedHashSet.add(i);

        print(integerLinkedHashSet);

        return integerLinkedHashSet;
    }

    public TreeSet<Integer> noDupsTreeSet(int[] arr) {
        TreeSet<Integer> integerTreeSet = new TreeSet<Integer>();
        for(int i: arr)
            integerTreeSet.add(i);

        print(integerTreeSet);
        return integerTreeSet;
    }
}
