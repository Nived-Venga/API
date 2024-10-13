package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/Place.feature", glue = "stepDefinitions", plugin = { "pretty",
		"html:target/cucumber-reports.html" })
public class APIPlaceRunner {

	public static void main(String[] args) {
		
	}
}
