package com.Priyanka.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class abstractPage {

    protected WebDriver driver; // Protected - Methods can access this.
                                // Classes that extend this class can access this.

    public abstractPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver getWebDriver() {
        return driver;
    }

    public homePage navigateToWebApp() {
        driver.navigate().to("https://www.amazon.com/");
        WebDriverWait wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='nav-logo-base nav-sprite']")));
        Assert.assertEquals(driver.getTitle(),"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
        return new homePage(driver);
    }
}
