package com.Priyanka.pageObjectsfactory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 7/12/2016.
 */
public class homePage extends abstractPage {

    public homePage(WebDriver driver) {
        super(driver);
    }

    public vaselinePage navigateToVaseline() {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("vaseline petroleum jelly");
        driver.findElement(By.cssSelector(".nav-input")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='a-color-state a-text-bold']")));
        Assert.assertEquals(driver.findElement(By.cssSelector("[class='a-color-state a-text-bold']")).getText(),"\"vaseline petroleum jelly\"");
       return new vaselinePage(driver);
    }
}
