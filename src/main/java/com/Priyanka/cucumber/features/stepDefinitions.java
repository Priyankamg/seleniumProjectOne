package com.Priyanka.cucumber.features;

import com.Priyanka.util.propertyManager;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Priyanka on 7/15/2016.
 */
public class stepDefinitions {
    WebDriver driver;
    propertyManager config;

    @Given("^I navigate to the website$")
    public void navigateToWebsite() throws Throwable {
        System.setProperty("webdriver.chrome.driver","src/main/java/com/Priyanka/webDrivers/chromedriver.exe");
        driver = new ChromeDriver();
        config = new propertyManager();
        driver.manage().window().maximize();
        driver.navigate().to(config.getWebAppUrl());
    }

    @When("^I search for \"([^\"]*)\"$")
    public void searchFor(String searchForSomething) throws Throwable {
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys(searchForSomething);
        driver.findElement(By.cssSelector(".nav-input")).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class='a-color-state a-text-bold']")));
        assertThat(driver.findElement(By.cssSelector("[class='a-color-state a-text-bold']")).getText(),is(equalTo("\"" + searchForSomething + "\"")));

    }

    @When("^I click on \"([^\"]*)\"$")
    public void clickOnAProduct(String particularProduct) throws Throwable {
        driver.findElement(By.linkText(particularProduct)).click();
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("productTitle")));
    }

    @Then("^I check that I am on \"([^\"]*)\" Page$")
    public void checkWhetherIAmOnTheRightPage(String particularProductPage) throws Throwable {
        assertThat(driver.findElement(By.id("productTitle")).getText(),is(equalTo(particularProductPage)));

    }

    @And("^I close the browser$")
    public void closeTheBrowser() throws Throwable {
        driver.close();
    }
}
