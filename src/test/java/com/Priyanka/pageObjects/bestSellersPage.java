package com.Priyanka.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 7/1/2016.
 */
public class bestSellersPage extends abstractPage {

    public bestSellersPage(WebDriver driver) {
        super(driver);
    }

    public void waitForBestSellersPageToLoad() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("zg_listTitle")));
        Assert.assertTrue(driver.findElement(By.id("zg_listTitle")).getText().contains("Best Sellers"));
    }

    public goToASingleNovelPage clickOnNovel(String novelName) {
        waitForBestSellersPageToLoad();
        clickUsingLinkText(novelName);
        return new goToASingleNovelPage(driver);
    }
}
