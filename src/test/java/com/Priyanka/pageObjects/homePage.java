package com.Priyanka.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class homePage extends abstractPage{

    public homePage(WebDriver driver) {
        super(driver);
    }

    public booksPage searchFor(String searchForSomething) {
        WebDriverWait wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("nav-input")));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchForSomething);
        driver.findElement(By.className("nav-input")).click();
        return new booksPage(driver);
    }
}
