package com.Priyanka.junitProgramsTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 7/6/2016.
 */
public class cssSelectorTest {
    private WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver","src\\main\\java\\com\\Priyanka\\webDrivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
    }

    @After
    public void testShutDown() {
        driver.close();
    }

    @Test
    public void clickElementsUsingCss() {
        // To find an element using Id attribute in CSS, use #
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("laundry brush");
        
        // To find an element using class attribute in CSS, use .
        driver.findElement(By.cssSelector(".nav-input")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        
        // To find an element using class attribute wherein the name of the class is separated by spaces,
        // use a .<FirstWord>.<SecondWord>
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".a-color-state.a-text-bold")));
        Assert.assertEquals(driver.findElement(By.cssSelector(".a-color-state.a-text-bold")).getText(),"\"laundry brush\"");
        
        // You can use other attributes in CSS also.
        // Format "[<attributeName>='<attributeValue>']"
        driver.findElement(By.cssSelector("[data-attribute='OXO Good Grips Household Scrub Brush']")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#productTitle")));
        
        Assert.assertEquals(driver.findElement(By.cssSelector("#productTitle")).getText(),"OXO Good Grips Household Scrub Brush");
    }
}
