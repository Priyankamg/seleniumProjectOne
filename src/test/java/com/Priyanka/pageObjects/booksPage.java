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

    public void waitForBooksPageToLoad() {
        Assert.assertEquals("Books",driver.findElement(By.xpath("//*[@id='searchDropdownBox']/option[11]")).getText());

        WebDriverWait waitUntilBookPageLoads = new WebDriverWait(driver,5);
        waitUntilBookPageLoads.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Books")));
    }

    public theNewYorkTimesBestSellersPage clickOnNewYorkTimesBestSellers() {
        waitForBooksPageToLoad();
        clickUsingLinkText("The New York Times Best Sellers");
        return new theNewYorkTimesBestSellersPage(driver);
    }

    public bestSellersPage clickOnBestSellers() {
        waitForBooksPageToLoad();
        clickUsingLinkText("Best Sellers");
        return new bestSellersPage(driver);
    }

    public newReleasesPage clickOnNewReleases() {
        waitForBooksPageToLoad();
        clickUsingLinkText("New Releases");
        return new newReleasesPage(driver);
    }

    public booksForChildrenPage clickOnBooksForChildren() {
        waitForBooksPageToLoad();
        clickUsingLinkText("Children's Books");
        return new booksForChildrenPage(driver);
    }

    public textbooksPage clickOnTextBooks() {
        waitForBooksPageToLoad();
        clickUsingLinkText("Textbooks");
        return new textbooksPage(driver);
    }


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

}
