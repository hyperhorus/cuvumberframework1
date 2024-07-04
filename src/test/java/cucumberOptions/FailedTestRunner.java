package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		//features={"C:\\Users\\hyper\\eclipse-workspace\\CucumberFramework\\src\\test\\java\\features"},
		features={"@target/failed_scenarios.txt"},
		glue = {"stepDefinition"},
		monochrome = true,
		plugin = {"pretty", "html:target/cucumber.html"},
		dryRun = false
		
		)
public class FailedTestRunner {

}
