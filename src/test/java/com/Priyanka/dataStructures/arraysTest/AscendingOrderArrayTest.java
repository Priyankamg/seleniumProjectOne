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


}
