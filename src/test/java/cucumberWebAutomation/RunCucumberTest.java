package cucumberWebAutomation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = { "classpath:cucumberWebAutomation" }, plugin = {
		"pretty" }, monochrome = false)
public class RunCucumberTest {
}