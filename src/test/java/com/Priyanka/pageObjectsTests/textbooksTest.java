package com.Priyanka.pageObjectsTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Priyanka on 7/1/2016.
 */
public class textbooksTest extends abstractWebDriverTest {
    @Before
    public void testSetUp() {
        System.out.println("Before in textbooksTest");
    }

    @After
    public void testShutDown() {
        System.out.println("After in textbooksTest");
    }

    @Test
    public void addATextBookToCart() {
        System.out.println("In textbooksTest");
    }
}
