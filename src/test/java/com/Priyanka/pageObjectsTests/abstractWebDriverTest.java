package com.Priyanka.pageObjectsTests;

import org.junit.After;
import org.junit.Before;

/**
 * Created by Priyanka on 7/1/2016.
 */
public class abstractWebDriverTest {

    @Before
    public void testSetup() {
        System.out.println("Before in Abstract");
    }

    @After
    public void testShutDown() {
        System.out.println("After in Abstract");
    }
}
