package stepDefinition;

import java.io.File;
import java.io.FileInputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.TestContextSetup;

public class Hooks {
	
	TestContextSetup testContextSetup;
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
	}
	
	@After
	public void closeBrowser() throws Exception {
		testContextSetup.testBase.WebDriverManager().quit();
	}
	
	@Before
	public void maximizeWindows() throws Exception {
		testContextSetup.testBase.WebDriverManager().manage().window().maximize();
	}
	
	@AfterStep
	public void addScreenShot(Scenario scenario) throws Exception	{
		WebDriver driver = testContextSetup.testBase.WebDriverManager();
		if (scenario.isFailed()) {
			File sourcePathFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(sourcePathFile);
			scenario.attach(fileContent, "image/png", "image");
		}
		//System.out.println("Aqui va esta madre");
		
	}
}
