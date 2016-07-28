package com.Priyanka.pageObjectsTests;

import com.Priyanka.pageObjects.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Priyanka on 7/1/2016.
 */
public class booksForChildrenTest extends searchForBooksTest {
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
        booksForChildrenPage onBooksForChildrenPage = onBooksPage.clickOnBooksForChildren();
        booksAges3To5 onBooksAges3To5 = onBooksForChildrenPage.clickBooksAge3To5();
        goToASingleNovelPage onGoToASingleNovelPage = onBooksAges3To5.clickANovelForChildrenAge3To5("A Unicorn Named Sparkle");
        Assert.assertEquals(onGoToASingleNovelPage.getNovelTitle(),"A Unicorn Named Sparkle");
        AddToCartPage onAddToCartPage = onGoToASingleNovelPage.clickOnAddToCart();
        signInPage onSignInPage = onAddToCartPage.proceedToCheckout();
        onSignInPage = onSignInPage.enterEmailAddressPassword();
        shippingAddressPage onShippingAddressPage = onSignInPage.enterShippingAddress();
        Assert.assertEquals(onShippingAddressPage.shippingAddressText(),"Select a shipping Address");
    }
}
