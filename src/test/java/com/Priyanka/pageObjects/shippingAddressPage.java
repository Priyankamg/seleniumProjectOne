package com.Priyanka.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class shippingAddressPage extends abstractPage{
    public shippingAddressPage(WebDriver driver) {
        super(driver);
    }

    public String shippingAddressText() {
        return driver.findElement(By.className("clearfix")).getText();
    }
}
