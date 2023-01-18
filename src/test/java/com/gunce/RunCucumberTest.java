package com.gunce;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "features", plugin = {"json:target/surefire-reports/Cucumber.json", "html:target/surefire-reports/report.html"})
public class RunCucumberTest {
    //{"json:target/surefire-reports/Cucumber.json", "html:target/surefire-reports/report.html"}

}
