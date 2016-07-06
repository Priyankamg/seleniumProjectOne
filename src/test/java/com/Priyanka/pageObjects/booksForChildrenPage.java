package com.Priyanka.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 7/1/2016.
 */
public class booksForChildrenPage extends abstractPage{

    public booksForChildrenPage(WebDriver driver) {
        super(driver);
    }

    public void waitForBooksForChildrenPageToLoad() {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='unified_widget pageBanner']")));
        Assert.assertEquals(driver.findElement(By.cssSelector("[class='unified_widget pageBanner']")).getText(),"Children's Books");
    }

    public booksAges3To5 clickBooksAge3To5() {
        waitForBooksForChildrenPageToLoad();
        driver.findElement(By.xpath("//img[contains(@alt,'Ages 3 to 5')]")).click();
        return new booksAges3To5(driver);
    }

}
