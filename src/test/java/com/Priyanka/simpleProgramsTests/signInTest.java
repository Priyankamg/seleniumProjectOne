package com.Priyanka.simpleProgramsTests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 7/11/2016.
 */
public class signInTest extends abstractDriverTest {

    @Before
    public void setup() {
        config.setWebAppAddress();
        config.setSignInCredentials();
        driver.navigate().to(config.getWebAppUrl());
    }

    @Test
    public void signIn() {
        Actions actions = new Actions(driver);
        WebElement menuHover =  driver.findElement(By.cssSelector("[data-nav-role='signin']"));
        actions.moveToElement(menuHover);

        WebElement subMenu = driver.findElement(By.cssSelector("#nav-signin-tooltip > a > span"));
        actions.moveToElement(subMenu);
        actions.click();
        actions.perform();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".a-spacing-small")));
        Assert.assertEquals(driver.findElement(By.cssSelector(".a-spacing-small")).getText(),"Sign in");
        driver.findElement(By.name("email")).sendKeys(config.getEmailAddress());
        driver.findElement(By.name("password")).sendKeys(config.getPassword());
        driver.findElement(By.cssSelector("#signInSubmit")).click();
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#nav-link-shopall > span.nav-line-2")));
        Assert.assertEquals(driver.findElement(By.cssSelector("#nav-link-shopall > span.nav-line-2")).getText(),"Departments");
        Assert.assertTrue(driver.findElement(By.cssSelector("#nav-link-yourAccount")).getText().contains("Hello, " + config.getUserName()));
    }
}
