package stepDefinition;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.CheckoutPage;
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.GenericUtils;
import utils.TestContextSetup;

public class CheckoutPageStepDefinition {
	
	String checkoutProdName;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	GenericUtils genericUtils;
	CheckoutPage checkoutPage;
	
	public CheckoutPageStepDefinition (TestContextSetup testContentSetup) throws Exception {
		this.testContextSetup = testContentSetup;
		checkoutPage = new CheckoutPage(testContextSetup.testBase.WebDriverManager());
	}
	@Then("^Verify the (.+) is displayed$")
	public void verify_the_tom_is_displayed(String name) throws Exception {
		//checkoutPage = new CheckoutPage(testContextSetup.testBase.WebDriverManager());	   
	    checkoutProdName = checkoutPage.checkoutNameProduct();
	    System.out.println("checkout name " + checkoutProdName);
	    Assert.assertTrue(checkoutProdName.contains(name));	    
	}
	@Then("Verify that {string} and {string} buttons")
	public void verify_that_apply_and_place_order_buttons(String str1, String str2) {		
		Assert.assertEquals(checkoutPage.placeButtonClick(), str2);
		Assert.assertEquals(checkoutPage.applyButton(), str1);

	}
		
}
