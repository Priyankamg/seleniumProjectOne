package com.Priyanka.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Priyanka on 6/30/2016.
 */
public class homePage extends abstractPage{

    public homePage(WebDriver driver) {
        super(driver);
    }

    public booksPage searchForBooks() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
        driver.findElement(By.className("nav-input")).click();
        return new booksPage(driver);
    }
}
