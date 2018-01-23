package com.Priyanka.dataStructuresTest.collectionsTest;

import com.Priyanka.dataStructures.collections.NoDups;
import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Created by prinks on 1/15/18.
 */
public class HashSetTest {

    NoDups noDupsObj;
    HashSet<Integer> result;
    LinkedHashSet<Integer> result2;
    TreeSet<Integer> result3;

    @Before
    public void initialize() {
        noDupsObj = new NoDups();
    }

    @Test
    public void testIntegerArrayWithDuplicates() {
        int[] arr = {1,2,2,4,2,5,7,5,2,1,7};
        result = noDupsObj.noDuplicates(arr);
        System.out.println("Result: " + result);
    }

    @Test
    public void testNegativeAndPositives() {
        int[] arr = {-100,50,50,20,-25,-30,30,20,10,20,10,-95,-65,-45,-95,-65,-45};
        result = noDupsObj.noDuplicates(arr);
        System.out.println("Result: " + result);
    }

    @Test
    public void testOrder() {
        int[] arr = {-100,50,50,20,-25,-30,30,20,10,20,10,-95,-65,-45,-95,-65,-45};
        result = noDupsObj.noDuplicates(arr);
        System.out.println("Result: " + result);

        result2 = noDupsObj.noDupsLinkedHashSet(arr);
        System.out.println("Result2: " + result2);

        result3 = noDupsObj.noDupsTreeSet(arr);
        System.out.println("Result3: " + result3);
    }


}
