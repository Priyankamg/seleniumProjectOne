package com.Priyanka.junitProgramsTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 7/14/2016.
 */
public class simpleHeadlessDriverTest extends abstractHeadlessDriverTest {
    @Test
    public void aSimpleTest() {
        driver.navigate().to(config.getWebAppUrl());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("fitbit");
        driver.findElement(By.className("nav-input")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='a-color-state a-text-bold']")));
        Assert.assertEquals(driver.findElement(By.cssSelector("[class='a-color-state a-text-bold']")).getText(),"\"fitbit\"");
    }
}
