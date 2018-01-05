package com.Priyanka.dataStructures.arraysTest;

import com.Priyanka.dataStructures.arrays.AscendingOrderArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/4/18.
 */
public class AscendingOrderArrayTest {
    AscendingOrderArray ascendingOrderArray;

    @Before
    public void initialize() {
        ascendingOrderArray = new AscendingOrderArray(20);
    }

    @Test
    public void testInsert() {
        ascendingOrderArray.insert(2);
        ascendingOrderArray.insert(4);
        ascendingOrderArray.insert(6);
        ascendingOrderArray.insert(8);
        ascendingOrderArray.insert(10);
        ascendingOrderArray.insert(1);
        ascendingOrderArray.insert(5);
        ascendingOrderArray.insert(18);
        ascendingOrderArray.insert(7);
        ascendingOrderArray.insert(12);
        ascendingOrderArray.insert(9);
        ascendingOrderArray.insert(14);
        ascendingOrderArray.insert(16);
        ascendingOrderArray.insert(20);

        ascendingOrderArray.display();
    }

    @Test
    public void testFind() {
        testInsert();
        Assert.assertEquals(12, ascendingOrderArray.find(18));
        Assert.assertEquals(7, ascendingOrderArray.find(9));
        Assert.assertEquals(14, ascendingOrderArray.find(0)); // If element is not found, it returns number of elements
        Assert.assertEquals(14, ascendingOrderArray.find(11));
    }

    @Test
    public void testDelete() {
        testInsert();
        ascendingOrderArray.delete(1);
        ascendingOrderArray.delete(18);
        ascendingOrderArray.delete(9);
        ascendingOrderArray.delete(100);
        ascendingOrderArray.delete(15);
        ascendingOrderArray.display();
    }

    @Test
    public void testMergeArr1LesserElementsThanArr2() {
        int[] arr1 = {11, 15, 17, 21};
        int[] arr2 = {1, 2, 12, 16, 18, 20, 22, 50, 70, 90, 100};
        ascendingOrderArray.merge(arr1, arr2);
        ascendingOrderArray.display();
    }

    @Test
    public void testMergeArr2LesserElementsThanArr1() {
        int[] arr1 = {-123, 0, 4, 7, 10, 15, 20, 25, 30, 33, 35, 37};
        int[] arr2 = {-20, -1, 1, 5, 6, 12, 13, 22, 34, 100};
        ascendingOrderArray.merge(arr1, arr2);
        ascendingOrderArray.display();
    }

    @Test
    public void testMergeBothArraysEqualSize() {
        int[] arrOne = {25, 35, 45, 55, 65};
        int[] arrTwo = {11, 22, 50, 100, 300};
        ascendingOrderArray.merge(arrOne, arrTwo);
        ascendingOrderArray.display();
    }


}
