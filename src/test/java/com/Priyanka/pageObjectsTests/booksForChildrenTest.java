package com.Priyanka.pageObjectsTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Priyanka on 7/1/2016.
 */
public class booksForChildrenTest extends abstractWebDriverTest {
    @Before
    public void testSetUp() {
        System.out.println("Before in booksForChildrenTest");
    }

    @After
    public void testShutDown() {
        System.out.println("After in booksForChildrenTest");
    }

    @Test
    public void addABookForChildrenToCart() {
        System.out.println("In a bookForChildrenTest");
    }
}
