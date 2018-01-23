package com.Priyanka.dataStructuresTest.collectionsTest;

import com.Priyanka.dataStructures.collections.IndicesOfSum;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/17/18.
 */
public class indicesOfSumTest {
    IndicesOfSum indicesOfSum;

    @Before
    public void initialize() {
        indicesOfSum = new IndicesOfSum();
    }

    @Test
    public void test1() {
        int[] input = {11,15,2,7};
        int[] output = indicesOfSum.usingHashMap(input, 9);
        Assert.assertEquals(2, output[0]);
        Assert.assertEquals(3, output[1]);
    }

    @Test
    public void test2() {
        int[] input = {3,2,4};
        int[] output = indicesOfSum.optimisedHashMap(input,6);
        Assert.assertEquals(1, output[0]);
        Assert.assertEquals(2, output[1]);
    }

}
