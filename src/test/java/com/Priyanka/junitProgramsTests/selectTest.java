package com.Priyanka.junitProgramsTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 7/13/2016.
 */
public class selectTest extends abstractDriverTest {
    Select dropDown;


    @Before
    public void setup() {
        driver.navigate().to(config.getWebAppUrl());
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".nav-logo-base.nav-sprite")));
        Assert.assertEquals(driver.getTitle(),"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
        dropDown = new Select(driver.findElement(By.cssSelector("[class='nav-search-dropdown searchSelect']")));
    }

    @Test
    public void test1() {
        dropDown.selectByIndex(1);
        Assert.assertEquals(driver.findElement(By.xpath("//option[contains(@value,'search-alias=amazonfresh')]")).getText(),"Amazon Fresh");
    }

    @Test
    public void test2() {
        dropDown.selectByValue("search-alias=appliances");
        Assert.assertEquals(driver.findElement(By.xpath("//option[contains(@value,'search-alias=appliances')]")).getText(),"Appliances");
    }

    @Test
    public void test3() {
        dropDown.selectByVisibleText("Automotive");
        Assert.assertEquals(driver.findElement(By.xpath("//option[contains(@value,'search-alias=automotive')]")).getText(),"Automotive");
    }
}
