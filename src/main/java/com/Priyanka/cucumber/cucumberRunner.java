package com.Priyanka.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Priyanka on 7/7/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "json:target/"},
        features = {"src/main/java/com/Priyanka/cucumber"}
)
public class cucumberRunner {
}
