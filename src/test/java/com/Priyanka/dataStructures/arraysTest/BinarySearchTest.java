package com.Priyanka.dataStructures.arraysTest;

import com.Priyanka.dataStructures.arrays.BinarySearch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/2/18.
 */
public class BinarySearchTest {

    BinarySearch binarySearch;

    @Before
    public void initialize() {
        binarySearch = new BinarySearch(10);
        for(int i=0; i<10; i++) {
            binarySearch.insert((i+1)*10);
        }
        binarySearch.display();
    }

    @Test
    public void testPositive() {
        Assert.assertEquals(binarySearch.find(20), true);
    }

    @Test
    public void testNegative() {
        Assert.assertEquals(binarySearch.find(33),false);
    }

    @Test
    public void testOutsideHigherRange() {
        Assert.assertEquals(binarySearch.find(101), false);
    }

    @Test
    public void testOutsideLowerRange() {
        Assert.assertEquals(binarySearch.find(-10), false);
    }

}
