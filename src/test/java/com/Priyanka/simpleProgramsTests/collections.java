package com.Priyanka.simpleProgramsTests;

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

import java.util.List;

/**
 * Created by Priyanka on 7/9/2016.
 */
public class collections {
    private WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver","src/main/java/com/Priyanka/webDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com/");
    }

    @After
    public void testShutDown() {
        driver.close();
    }

    @Test
    public void understandingCollections() {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("books");
        driver.findElement(By.cssSelector(".nav-input")).click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Books")));
        List<WebElement> links= driver.findElements(By.tagName("a"));

        for(WebElement linkName: links) {
            if(linkName.getText().equals("Textbook Rentals")) {
                linkName.click();
                break;
            }
        }
        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".unified_widget.pageBanner > h1")));
        Assert.assertEquals(driver.findElement(By.cssSelector(".unified_widget.pageBanner > h1")).getText(),"Textbooks Rentals");

        List<WebElement> booksWithSameClassName =  driver.findElements(By.cssSelector(".a-link-normal.acs_product-title"));

        for(WebElement books: booksWithSameClassName) {
            if(books.getText().contains("Psychology")) {
                books.click();
                break;
            }
        }

        wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("productTitle")));
        Assert.assertEquals(driver.findElement(By.id("productTitle")).getText(),"Psychology, 11th Edition");

    }



}
