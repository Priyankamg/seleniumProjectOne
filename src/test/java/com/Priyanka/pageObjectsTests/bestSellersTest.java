package com.Priyanka.pageObjectsTests;

import com.Priyanka.pageObjects.bestSellersPage;
import com.Priyanka.pageObjects.goToASingleNovelPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Priyanka on 7/1/2016.
 */
public class bestSellersTest extends searchForBooksTest {
    @Before
    public void testSetUp() {
        System.out.println("Before in bestSellersTest");
    }

    @After
    public void testShutDown() {
        System.out.println("After in bestSellersTest");
    }

    @Test
    public void addABestSellerToCart() {
        System.out.println("In bestSellersTest");
        bestSellersPage onBestSellersPage = onBooksPage.clickOnBestSellers();
        goToASingleNovelPage onGoToASingleNovelPage = onBestSellersPage.clickOnNovel("Harry Potter and the Cursed Child - P...");

    }
}
