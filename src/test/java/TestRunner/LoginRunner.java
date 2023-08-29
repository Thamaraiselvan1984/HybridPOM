package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\resources\\com\\feature\\MyAccountSteps.feature"},
		glue = {"stepdefinitions","Hooks"},
		plugin = {"pretty"},
		publish = true
		)
public class LoginRunner {
	
}