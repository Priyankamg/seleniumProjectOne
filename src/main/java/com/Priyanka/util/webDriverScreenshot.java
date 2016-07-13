package com.Priyanka.util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

/**
 * Created by Priyanka on 7/13/2016.
 */
public class webDriverScreenshot {
    WebDriver driver;

    public webDriverScreenshot(WebDriver driver) {
        this.driver = driver;
    }

    public void captureScreenshotAndSave(String screenshotName) {
        File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            //FileUtils.copyFile(screenshotFile, new File("C:\\Users\\Abhinav\\IdeaProjects\\seleniumProjectOne\\src\\test\\java\\com\\Priyanka\\screenshots\\" + screenshotName +".png"));
            //FileUtils.copyFile(screenshotFile, new File("src\\test\\java\\com\\Priyanka\\screenshots\\" + screenshotName +".png"));
            FileUtils.copyFile(screenshotFile, new File("src/test/java/com/Priyanka/screenshots/" + screenshotName +".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
