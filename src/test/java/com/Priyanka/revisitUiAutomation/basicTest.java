package com.Priyanka.revisitUiAutomation;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by prinks on 1/8/18.
 */
public class basicTest {
    private WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver","src/main/java/com/Priyanka/webDrivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
    }

    @After
    public void testShutDown() {
        driver.close();
    }

    @Test
    public void search() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Try Prime")));
        Assert.assertEquals(element.getText(),"Try Prime");
        Assert.assertEquals("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more", driver.getTitle());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Tom and Jerry");
        driver.findElement(By.cssSelector("input.nav-input")).click();

        Assert.assertTrue((new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("quartsPagelet"))).getText().contains("Showing most relevant results. See all results for "));
    }
}
