package runner;

import org.testng.ITestListener;
import org.testng.annotations.Listeners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features = "src/test/java/features/TestLoginFeature.feature",tags="", glue = "stepDefinitions", plugin = { "pretty",
		"html:target/cucumber-reports.html" })


public class TestNGRunner extends AbstractTestNGCucumberTests {
	
	

}
