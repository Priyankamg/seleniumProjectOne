package com.Priyanka.pageObjectsTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Priyanka on 7/1/2016.
 */
public class newReleasesTest extends abstractWebDriverTest {
    @Before
    public void testSetUp() {
        System.out.println("Before in newReleasesTest");
    }

    @After
    public void testShutDown() {
        System.out.println("After in newReleasesTest");
    }

    @Test
    public void addANewReleaseBookToCart() {
        System.out.println("In newReleasesTest");
    }
}
