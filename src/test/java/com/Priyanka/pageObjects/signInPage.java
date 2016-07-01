package com.Priyanka.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class signInPage extends abstractPage{

    public signInPage(WebDriver driver) {
        super(driver);
    }

    public signInPage enterEmailAddressPassword() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("a-spacing-small")));
        Assert.assertEquals(driver.findElement(By.className("a-spacing-small")).getText(),"Sign in");
        driver.findElement(By.name("email")).sendKeys("priyankamg.test@gmail.com");
        driver.findElement(By.name("password")).sendKeys("karu5%99");
        return new signInPage(driver);// Need to understand why a new signInPage is returned
                                // We are already on signInPage. Why is a new signInPage returned?
    }

    public shippingAddressPage enterShippingAddress() {
        driver.findElement(By.id("signInSubmit")).click();
        return new shippingAddressPage(driver);
    }
}
