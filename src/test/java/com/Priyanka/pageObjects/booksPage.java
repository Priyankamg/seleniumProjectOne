package com.Priyanka.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class booksPage extends abstractPage {

    public booksPage(WebDriver driver) {
        super(driver);
    }

    public theNewYorkTimesBestSellersPage clickOnNewYorkTimesBestSellers() {
        Assert.assertEquals("Books",driver.findElement(By.xpath("//*[@id='searchDropdownBox']/option[11]")).getText());

        WebDriverWait waitUntilBookPageLoads = new WebDriverWait(driver,10);
        waitUntilBookPageLoads.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Books")));

        /*
        // Locate the menu to hover over
        WebElement EditorsPicks = driver.findElement(By.linkText("Editors' Picks"));

        // Initiate mouse actions using Actions class
        Actions mouseHover = new Actions(driver);

        // Move the mouse to the earlier identified menu option
        mouseHover.moveToElement(EditorsPicks).build().perform();

        // Wait for 5 seconds before proceeding. This allows sub menu to appear properly before clicking on it.
        //WebDriverWait wait = new WebDriverWait(driver,5);
        //wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("100 Books to Read in a Lifetime")));

        // Click on the Element
        driver.findElement(By.linkText("100 Books to Read in a Lifetime")).click();
        */

        driver.findElement(By.linkText("The New York Times Best Sellers")).click();

        return new theNewYorkTimesBestSellersPage(driver);
    }
}
