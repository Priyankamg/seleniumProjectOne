package com.Priyanka.junitProgramsTests;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Priyanka on 6/17/2016.
 */
public class arrays {

    @Test
    public void testArraysSort() {
        int[] numbers = {10,3,7,6,6,1,-5,-100};
        Arrays.sort(numbers); // Sort the numbers in the ascending order
        int[] expectedOutput = {-100,-5,1,3,6,6,7,10};
        assertArrayEquals(expectedOutput,numbers); //assertArrayEquals tests expected array with the actual array
    }

    @Test(expected=NullPointerException.class)  // If a null pointer exception is thrown by a method,
                                                // then, you write NullPointerException.class
                                                // Whatever may be the exception, you write that as Expected
    public void testArraysNull() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArraysIndexOutOfBounds() {
        int[] numbers = {1,2,3};
        System.out.println("The 4th element of the array is: " + numbers[3]);
    }

    /*
    If you are testing performance, for instance, how long will it take for a method to finish
    you write that value to be equal to timeout. The value is in ms.
    If the code given inside the method finishes within that time, then the test passes
    Otherwise, it gives a testTimedOutException
    Need to learn how to handle this exception
     */
    @Test(timeout=200)
    public void testPerformance() {
        for(int i=0; i<100000;i++) {
            int[] numbers = {i,i+1,i-1};
            Arrays.sort(numbers);
        }
    }
}
