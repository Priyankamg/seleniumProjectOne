package com.Priyanka.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 7/5/2016.
 */
public class booksAges3To5 extends abstractPage{

    public booksAges3To5(WebDriver driver) {
        super(driver);
    }

    public void waitForPageAge3To5ToLoad() {
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='merchandised-content']/table/tbody/tr/td/table/tbody/tr/td/img")));
    }

    public goToASingleNovelPage clickANovelForChildrenAge3To5(String book) {
        waitForPageAge3To5ToLoad();
        clickUsingLinkText(book);
        return new goToASingleNovelPage(driver);
    }
}
