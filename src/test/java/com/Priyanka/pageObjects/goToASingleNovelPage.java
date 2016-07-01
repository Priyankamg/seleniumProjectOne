package com.Priyanka.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class goToASingleNovelPage extends abstractPage{

    public goToASingleNovelPage(WebDriver driver) {
        super(driver);
    }

    public String getSneakPeak() {
        return driver.findElement(By.id("productTitle")).getText();
    }

    public AddToCartPage clickOnAddToCart() {
        driver.findElement(By.id("add-to-cart-button")).click();
        return new AddToCartPage(driver);
    }
}
