package com.fdmgroup.testScript;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(format = { "pretty", "html:target/cucumber" }, features = { "feature/" })
public class TestRunner {

}
//, tags = {"@SecondTest"}