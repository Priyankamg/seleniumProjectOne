package com.Priyanka.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class theNewYorkTimesBestSellersPage extends abstractPage{

    public theNewYorkTimesBestSellersPage(WebDriver driver) {
        super(driver);
    }

    public void waitForNewYorkTimesPageToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='merchandised-content']/div[1]/h1/b")));
        Assert.assertEquals(driver.findElement(By.xpath("//*[@id='merchandised-content']/div[1]/h1/b")).getText(),"The New York Times Best Sellers");
    }

    public goToASingleNovelPage clickOnNovel(String novelName) {
        waitForNewYorkTimesPageToLoad();
        clickUsingLinkText(novelName);
        return new goToASingleNovelPage(driver);
    }
}
