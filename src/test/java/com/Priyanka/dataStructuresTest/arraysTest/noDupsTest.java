package com.Priyanka.dataStructuresTest.arraysTest;

import com.Priyanka.dataStructures.arrays.noDups;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by prinks on 1/31/18.
 */
public class noDupsTest {
    noDups nD;

    @Before
    public void initialize() {
        nD = new noDups();
    }

    @Test
    public void test1() {
        int[] arr = {1,2,4,2,5,1,4,7,8,1};
        try {
            HashSet<Integer> result = nD.noDuplicates(arr);
            Iterator iterator = result.iterator();
            while(iterator.hasNext()) {
                System.out.print(iterator.next() + " ");
            }
            System.out.println();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
