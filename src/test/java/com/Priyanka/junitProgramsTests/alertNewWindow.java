package com.Priyanka.junitProgramsTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Priyanka on 7/6/2016.
 */
public class alertNewWindow {
    private WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver","src/main/java/com/Priyanka/webDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    public void testShutDown() {
        driver.close();
    }

    @Test
    public void handleAlertWindow() {
        driver.navigate().to("http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html");
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("head > title")));
        Assert.assertEquals(driver.getTitle(),"Java SE Development Kit 8 - Downloads");
        driver.findElement(By.xpath("//*[@id='jdk-8u91-oth-JPRXXXjdk-8u91-windows-x64.exe']")).click();
        System.out.println("Driver current handle before: " + driver.getWindowHandle());
        Alert alertObj = driver.switchTo().alert();
        Assert.assertEquals(alertObj.getText(),"Sorry, you must accept the License Agreement before downloading.");
        System.out.println("Driver current handle after: " + driver.getWindowHandle());
        alertObj.accept();
        driver.findElement(By.cssSelector("[onclick='acceptAgreement(window.self, \\'jdk-8u91-oth-JPR\\');']")).click();
        driver.findElement(By.xpath("//*[@id='jdk-8u91-oth-JPRXXXjdk-8u91-windows-x64.exe']")).click();
    }

    @Test
    public void switchBackAndForthWindows() {
        driver.navigate().to("https://hangouts.google.com/");
        driver.findElement(By.cssSelector("[aria-label='Start video call']")).click();
        String parentWindow = driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(parentWindow)) {
                driver.switchTo().window(windowHandle);
            }
        }

        Assert.assertTrue(driver.getCurrentUrl().contains("https://accounts.google.com/ServiceLogin"));
        driver.findElement(By.name("Email")).sendKeys("priyankamg.test");
        driver.findElement(By.cssSelector("#next")).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#Passwd")));
        driver.findElement(By.xpath("//input[@id='PersistentCookie']")).click();
        driver.findElement(By.name("Passwd")).sendKeys("karu5%99");
        driver.findElement(By.cssSelector("#signIn")).click();
        driver.close();
        driver.switchTo().window(parentWindow);
    }
}
