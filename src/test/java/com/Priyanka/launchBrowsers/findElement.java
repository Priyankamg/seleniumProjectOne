package com.Priyanka.launchBrowsers;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
/**
 * Created by Priyanka on 6/29/2016.
 * 1. id - Find an element using the id attribute
 * 2. classname - Find an element using the name of the class
 * 3. cssSelector - Find an element using CSS. If separated by space, use single quotes. Eg: by.cssSelector("[id='pg']")
 * 4. xpath - Find an element using xpath. //* in the beginning refers to everything in the page. Open [, follow it using @.
 * Eg: by.xpath(//*[@id='pg'])
 * 5. name - Used when you have to type in the fields
 * 6. linkText - If there's a link, <a (Anchor tag), use the Entire Link's name
 * 7. partialLinkText - If there's a link, <a (Anchor tag), use the partial link's name
 * 8. tagName - Used for <a (Anchor tags), <p (Paragraphs etc)
 */
public class findElement {
    private WebDriver driver;

    @Before
    public void testSetup() {
        System.setProperty("webdriver.chrome.driver","src/main/java/com/Priyanka/webDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.amazon.com");
    }

    @After
    public void testShutDown() {
        driver.close();
    }

    /*
    If there's a link, it is represented using <a a>(Anchor tag)
    If you wish to click on a Link using the text, you can use the text of the link
    */
    @Test
    public void testFindElementByLinkText() {
        driver.findElement(By.linkText("Today's Deals")).click();
        Assert.assertEquals("New deals. Every day. Shop our Deal of the Day, Lightning Deals and more daily deals and limited-time sales. See deals you're Watching here.",driver.findElement(By.className("gbhcopy")).getText());
    }

    @Test
    public void testFindElementByXpathIdClassNameLinkTextPartialLinkText() {
        driver.findElement(By.xpath("//option[contains(@value, 'search-alias=stripbooks')]")).click();
        Assert.assertEquals("Books",driver.findElement(By.xpath("//option[contains(@value, 'search-alias=stripbooks')]")).getText());
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("enid blyton");
        driver.findElement(By.className("nav-input")).click();
        Assert.assertEquals("Books",driver.findElement(By.linkText("Books")).getText());
        Assert.assertEquals("\"enid blyton\"",driver.findElement(By.partialLinkText("enid")).getText());
        driver.findElement(By.cssSelector("[class=refinementLink]")).click();
    }

    @Test
    public void testFindElementByCssSelector() {
        Select dropdownMenu = new Select(driver.findElement(By.id("searchDropdownBox")));
        dropdownMenu.selectByVisibleText("Books");
        Assert.assertTrue(driver.findElement(By.cssSelector("[title='Search in']")).getText().contains("Books"));
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("enid blyton");
        driver.findElement(By.className("nav-input")).click();
        Assert.assertEquals("Books",driver.findElement(By.linkText("Books")).getText());
        Assert.assertEquals("\"enid blyton\"",driver.findElement(By.partialLinkText("enid")).getText());
        driver.findElement(By.cssSelector("[class='s-layout-picker s-image-layout-picker']")).click();
    }

    /*
    Filling out fields are generally associated with name attribute
     */
    @Test
    public void testFindElementByName() {
        driver.findElement(By.id("nav-link-yourAccount")).click();
        driver.findElement(By.name("email")).sendKeys("priyankamg.test@gmail.com");
        driver.findElement(By.name("password")).sendKeys("karu5%99");
        driver.findElement(By.id("signInSubmit")).click();
        Assert.assertEquals("Hello, priyankamg\nYour Account",driver.findElement(By.id("nav-link-yourAccount")).getText());
    }

    /*
    Find element using tag name.
    Tag name can be for link
    Tag name can be for paragraph
    Tag name can be for Headers etc
     */
    @Test
    public void testFindElementByTagName() {
        List<WebElement> list = driver.findElements(By.tagName("a"));

        for(WebElement we: list) {
            System.out.println(we.getText());
        }

    }
}
