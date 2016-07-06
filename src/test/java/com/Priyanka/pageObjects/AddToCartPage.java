package com.Priyanka.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class AddToCartPage extends abstractPage{

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    public signInPage proceedToCheckout() {
        Assert.assertEquals(driver.findElement(By.id("huc-v2-order-row-confirm-text")).getText(),"Added to Cart");
        driver.findElement(By.partialLinkText("Proceed to checkout")).click();
        return new signInPage(driver);
    }
}
