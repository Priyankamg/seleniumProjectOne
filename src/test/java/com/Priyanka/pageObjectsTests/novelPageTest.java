package com.Priyanka.pageObjectsTests;

import com.Priyanka.pageObjects.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class novelPageTest {
    WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver","src/main/java/com/Priyanka/webDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void testShutDown() {
        driver.close();
    }

    @Test
    public void addLifetimeReadBookToCart() {
        homePage onHomePage = new homePage(driver);
        onHomePage = onHomePage.navigateToWebApp();
        booksPage onBooksPage = onHomePage.searchForBooks();
        theNewYorkTimesBestSellersPage onTheNewYorkTimesBestSellersPage = onBooksPage.clickOnNewYorkTimesBestSellers();
        goToASingleNovelPage onASingleNovelPage = onTheNewYorkTimesBestSellersPage.clickOnABriefHistoryOfTime();
        Assert.assertEquals(onASingleNovelPage.getSneakPeak(),"A Man Called Ove: A Novel");
    }
}
