package com.Priyanka.dataStructures.arraysTest;

import com.Priyanka.dataStructures.arrays.OrderedArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/3/18.
 */
public class OrderedArrayTest {
    OrderedArray orderedArray;

    @Before
    public void initialize() {
        int arraySize = 10;
        orderedArray = new OrderedArray(50);

        for(int i=0; i<arraySize; i++)
            orderedArray.insert((i+1)*11);

        orderedArray.display();
    }

    @Test
    public void testFind44() {
        Assert.assertEquals(orderedArray.find(44),3);
    }

    @Test
    public void testFind10() {
        Assert.assertEquals(orderedArray.find(10),10);
    }

    @Test
    public void testFind70() {
        Assert.assertEquals(orderedArray.find(70),10);
    }

    @Test
    public void testFind110() {
        Assert.assertEquals(orderedArray.find(110),9);
    }

    @Test
    public void deleteValidValues() {
        orderedArray.delete(11);
        orderedArray.delete(88);
        orderedArray.delete(33);
        orderedArray.display();
    }

    @Test
    public void deleteValuesNotInRange() {
        orderedArray.delete(1);
        orderedArray.delete(222);
        orderedArray.delete(49);
        orderedArray.display();
    }

    @Test
    public void insertValuesInBetween() {
        orderedArray.insert(29);
        orderedArray.insert(49);
        orderedArray.insert(80);
        orderedArray.insert(90);
        orderedArray.display();
    }

    @Test
    public void insertValuesLessThanLeast() {
        orderedArray.insert(1);
        orderedArray.insert(2);
        orderedArray.insert(5);
        orderedArray.display();
    }

    @Test
    public void insertValuesGreaterThanGreatest() {
        orderedArray.insert(123);
        orderedArray.insert(200);
        orderedArray.insert(350);
        orderedArray.display();
    }

    @Test
    public void insertZeroNegativeNumbers() {
        orderedArray.insert(-1);
        orderedArray.insert(-20);
        orderedArray.insert(-50);
        orderedArray.insert(0);
        orderedArray.display();
    }

    @Test
    public void testAllCombinations() {
        orderedArray.insert(-10);
        orderedArray.insert(-100);
        orderedArray.insert(0);
        orderedArray.insert(30);
        orderedArray.insert(40);
        orderedArray.insert(57);
        orderedArray.insert(59);
        orderedArray.insert(61);
        orderedArray.insert(122);
        orderedArray.insert(444);
        orderedArray.display();
    }

}
