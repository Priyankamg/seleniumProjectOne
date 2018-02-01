package com.Priyanka.dataStructuresTest.arraysTest;

import com.Priyanka.dataStructures.arrays.Find;
import com.Priyanka.dataStructures.arrays.MinMax;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/31/18.
 */
public class FindTest {
    Find find;
    MinMax minMax;

    @Before
    public void initialize() {
        find = new Find();
    }

    @Test
    public void test1() {
        int[] input = {9,8,7,1,2,3};
        minMax = find.findMinMax(input);
        Assert.assertEquals(9, minMax.getMax());
        Assert.assertEquals(1, minMax.getMin());
    }

    @Test
    public void test2() {
        int[] input = {10};
        minMax = find.findMinMax(input);
        Assert.assertEquals(10, minMax.getMax());
        Assert.assertEquals(10, minMax.getMin());
    }

    @Test
    public void test3() {
        int[] input = {15, 15, 15};
        minMax = find.findMinMax(input);
        Assert.assertEquals(15, minMax.getMax());
        Assert.assertEquals(15, minMax.getMin());
    }

    @Test
    public void test4() {
        int[] input = {-5, 10, 11, 2, 4, -10, -15};
        minMax = find.findMinMax(input);
        Assert.assertEquals(11, minMax.getMax());
        Assert.assertEquals(-15, minMax.getMin());
    }

    @Test
    public void test5() {
        int[] input = {};
        try {
            minMax = find.findMinMax(input);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

}
