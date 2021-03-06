package com.Priyanka.dataStructuresTest.arraysTest;

import com.Priyanka.dataStructures.arrays.UnorderedArray;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by prinks on 1/4/18.
 */
public class UnorderedArrayTest {
    UnorderedArray unorderedArray;

    @Before
    public void initialize() {
        unorderedArray = new UnorderedArray(10);
        unorderedArray.insert(2);
        unorderedArray.insert(10);
        unorderedArray.insert(15);
        unorderedArray.insert(5);
        unorderedArray.insert(1);
        unorderedArray.display();
    }

    @Test
    public void testGetMax() {
        Assert.assertEquals(unorderedArray.getMax(),15);
    }

    @Test
    public void testRemoveMax() {
        unorderedArray.removeMax();
        System.out.println("After removing the max element: ");
        unorderedArray.display();
    }

    @Test
    public void testDelete() {
        unorderedArray.delete(1);
        unorderedArray.display();
        unorderedArray.delete(10);
        unorderedArray.delete(2);
        unorderedArray.delete(15);
        unorderedArray.display();
    }

    @Test
    public void testFind() {
        Assert.assertEquals(unorderedArray.find(2), true);
        Assert.assertEquals(unorderedArray.find(17), false);
    }

    @Test
    public void sortDesc() {
        int[] newArr = new int[unorderedArray.getSize()];
        int numberOfElementsNew = 0;
        while(unorderedArray.getSize()!=0) {
            newArr[numberOfElementsNew] = unorderedArray.getMax();
            numberOfElementsNew++;
            unorderedArray.removeMax();
        }

        for(int i=0; i<numberOfElementsNew; i++) {
            System.out.print(newArr[i] + " ");
        }
        System.out.println();
    }

    @Test
    public void testNoDuplicates() {
        unorderedArray = new UnorderedArray(20);
        unorderedArray.insert(2);
        unorderedArray.insert(5);
        unorderedArray.insert(6);
        unorderedArray.insert(5);
        unorderedArray.insert(7);
        unorderedArray.insert(5);
        unorderedArray.insert(5);
        unorderedArray.insert(6);
        unorderedArray.insert(5);
        unorderedArray.insert(6);
        unorderedArray.insert(1);
        unorderedArray.insert(3);
        unorderedArray.insert(10);
        unorderedArray.insert(5);
        unorderedArray.insert(12);

        unorderedArray.display();

        unorderedArray.noDuplicates();

        unorderedArray.display();
    }

    @Test
    public void testNoDuplicatesUsingSet() {
        unorderedArray = new UnorderedArray(20);
        unorderedArray.insert(1);
        unorderedArray.insert(2);
        unorderedArray.insert(1);
        unorderedArray.insert(2);
        unorderedArray.insert(15);
        unorderedArray.insert(1);
        unorderedArray.insert(15);
        unorderedArray.insert(15);
        unorderedArray.insert(20);
        unorderedArray.insert(20);
        unorderedArray.insert(20);
        unorderedArray.insert(20);
        unorderedArray.insert(25);
        unorderedArray.insert(90);
        unorderedArray.insert(75);
        unorderedArray.insert(20);
        unorderedArray.insert(45);
        unorderedArray.insert(50);

        unorderedArray.display();

        unorderedArray.noDuplicatesUsingSet();
    }
}
