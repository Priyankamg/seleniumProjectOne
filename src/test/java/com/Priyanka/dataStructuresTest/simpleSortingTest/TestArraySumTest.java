package com.Priyanka.dataStructuresTest.simpleSortingTest;

import com.Priyanka.dataStructures.simpleSorting.TestArraySum;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/11/18.
 */
public class TestArraySumTest {
    TestArraySum testArraySum;

    @Before
    public void initialize() {
        testArraySum = new TestArraySum();
    }

    @Test
    public void test1() {
        int[] arr = {42, 43, 8, 3, 14, 32, 1, 13, 15, 20};
        int sum = 33;
        testArraySum.printPairs(arr, sum);
    }

    @Test
    public void test2() {
        int[] arr = {45, 46, 35, 33, 1, 2, 3, 4, 10, 23, 20, 31, 17, 15, 16, 19, 11, 32};
        int sum = 33;
        testArraySum.printPairs(arr, sum);
    }
}
