package com.Priyanka.junitProgramsTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 7/14/2016.
 */
public class junitAssertions extends abstractDriverTest {
    @Test
    public void onlyJunitAssertions() {
        driver.navigate().to(config.getWebAppUrl());
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#nav-your-amazon")));
        driver.findElement(By.cssSelector("#nav-your-amazon")).click();
        /*
        For assertTrue, if test fails, then this message is printed
         */
        Assert.assertTrue("The url obtained is not as per expectation",driver.getCurrentUrl().contains("https://www.amazin.com/ap/signin"));
    }
}
