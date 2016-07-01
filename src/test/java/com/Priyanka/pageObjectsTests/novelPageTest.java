package com.Priyanka.pageObjectsTests;

import com.Priyanka.pageObjects.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class novelPageTest extends abstractWebDriverTest {

    @Before
    public void testSetup() {
        onHomePage.navigateToWebApp();
        System.out.println("Before in novelPage");
    }

    @After
    public void testShutDown() {
        System.out.println("After in novelPage");
    }

    @Test
    public void addLifetimeReadBookToCart() {
        booksPage onBooksPage = onHomePage.searchFor("Books");
        theNewYorkTimesBestSellersPage onTheNewYorkTimesBestSellersPage = onBooksPage.clickOnNewYorkTimesBestSellers();
        goToASingleNovelPage onASingleNovelPage = onTheNewYorkTimesBestSellersPage.clickOnANovel();
        Assert.assertEquals(onASingleNovelPage.getSneakPeak(),"A Man Called Ove: A Novel");
        AddToCartPage onAddToCartPage = onASingleNovelPage.clickOnAddToCart();
        signInPage onSignInPage = onAddToCartPage.enterFieldsToSignIn();
        shippingAddressPage onShippingAddressPage = onSignInPage.enterEmailAddressPassword().enterShippingAddress();
        Assert.assertEquals(onShippingAddressPage.shippingAddressText(),"Select a shipping address");
    }
}
