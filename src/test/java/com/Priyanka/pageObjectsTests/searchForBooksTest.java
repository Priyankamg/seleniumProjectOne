package com.Priyanka.pageObjectsTests;

import com.Priyanka.pageObjects.booksPage;
import org.junit.After;
import org.junit.Before;

/**
 * Created by Priyanka on 7/1/2016.
 */
public class searchForBooksTest extends abstractWebDriverTest {

    protected booksPage onBooksPage;

    @Before
    public void testSearchSetup() {
        System.out.println("Before in searchForBooks");
        onHomePage.navigateToWebApp();
        onBooksPage = onHomePage.searchFor("Books");
    }

    @After
    public void testSearchShutDown() {
        System.out.println("After in searchForBooks");
    }
}
