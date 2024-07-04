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
import pageObjects.LandingPage;
import pageObjects.OffersPage;
import pageObjects.PageObjectManager;
import utils.GenericUtils;
import utils.TestContextSetup;

public class OfferPageStepDefinition {
	
	String prodOffer;
	TestContextSetup testContextSetup;
	PageObjectManager pageObjectManager;
	GenericUtils genericUtils;
	OffersPage offersPage;
	
	public OfferPageStepDefinition (TestContextSetup testContentSetup) {
		this.testContextSetup = testContentSetup;
	}
	
	@Then("^user searched  for (.+) shortname in offers page$")
	public void user_searched_for_same_shortname_in_offers_page_to_check_if_product_exits(String str1) throws Exception {		
		offersPage = new OffersPage(testContextSetup.testBase.WebDriverManager());
		genericUtils = new GenericUtils(testContextSetup.testBase.WebDriverManager());
		
		switchToOffersPage();
		offersPage.search(str1);		
		genericUtils.sleepTime(1000);
		prodOffer =  offersPage.OfferNameProduct(); 
		
	}

	public void switchToOffersPage() {			
		LandingPage landingPage = testContextSetup.pageObjectManager.getLandingPage();		
		landingPage.selectTopDeals();
		testContextSetup.genericUtils.swithToChildWindow();	
		
	}
	
	@Then("validate product name in offers page matches with Landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(testContextSetup.productLandingPage, prodOffer);
		//offersPage.driver.quit();
	
		
	   
	}




}
