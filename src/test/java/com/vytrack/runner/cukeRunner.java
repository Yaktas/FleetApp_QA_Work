package com.vytrack.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"html:target/cucumber_report.html"},
        features = "src/test/resources",
        glue="com/vytrack/step_Definitions",
        tags="@fleet ")

public class cukeRunner {



}
