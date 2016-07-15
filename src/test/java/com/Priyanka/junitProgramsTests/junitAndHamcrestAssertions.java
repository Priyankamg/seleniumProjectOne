package com.Priyanka.junitProgramsTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by Priyanka on 7/14/2016.
 */
public class junitAndHamcrestAssertions extends abstractDriverTest {
    @Test
    public void diffJunitHamcrestAssertions() {

        driver.navigate().to(config.getWebAppUrl());
        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#nav-your-amazon")));
        driver.findElement(By.cssSelector("#nav-your-amazon")).click();
        /*
        For assertTrue, if test fails, then this message is printed
         */
        Assert.assertTrue("The url obtained is not as per expectation",driver.getCurrentUrl().contains("https://www.amazon.com/ap/signin"));
        Assert.assertTrue(driver.getCurrentUrl().contains("https://www.amazon.com/ap/signin"));


        assertThat(driver.getCurrentUrl(),containsString("https://www.amazn.com/ap/signin"));
        assertThat(driver.getCurrentUrl(),is(equalTo("https://www.amazn.com/ap/signin")));


    }
}
