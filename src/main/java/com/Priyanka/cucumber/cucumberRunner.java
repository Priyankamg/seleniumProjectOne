package com.Priyanka.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Priyanka on 7/7/2016.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
        format = {"pretty", "json:target/cucumber.json"}, // Format of the report. It is json. It could be html too.
        features = {"src/main/java/com/Priyanka/cucumber/"}
)
/*
Whenever a feature file runs, this class also runs.
It runs with the CucumberOptions mentioned above.
 */
public class cucumberRunner {
}
