package stepDefinition;

import org.checkerframework.checker.units.qual.t;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;
import utils.GenericUtils;
import utils.TestContextSetup;

public class LandingPageStepDefinition {
	
	TestContextSetup testContextSetup;
	GenericUtils genericUtils;
	LandingPage landingPage;
	public String prodOffer;
	
	public LandingPageStepDefinition(TestContextSetup testContentSetup) {
		this.testContextSetup = testContentSetup;	
		
	}
	
	@Given("User is on GreenKart Landing Page")
	public void user_is_on_green_kart_landing_page() throws Exception {
		//testContextSetup.driver = new ChromeDriver();
		//testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		genericUtils = new GenericUtils(testContextSetup.testBase.WebDriverManager());
		landingPage = testContextSetup.pageObjectManager.getLandingPage(); //new LandingPage(testContentSetup.driver);
	}
	@When("^User searched  with shortname (.+) and extracted actual name for product$")
	public void user_searched_with_shortname_and_extracted_actual_name_for_product(String shortName) throws Exception  {
		//landingPage = testContextSetup.pageObjectManager.getLandingPage(); //new LandingPage(testContentSetup.driver);
		landingPage.searchItem(shortName);		
	    genericUtils.sleepTime(1000);
	    testContextSetup.productLandingPage = landingPage.getProductName().split("-")[0].trim();
	    //landingPage.clickAddButton();	    
	}
	
	//Nuevo escenario
	@Then("Increase {int} the quantity of product selected")
	public void increase_the_quantity_of_product_selected(Integer int1) throws Exception {
		landingPage.incQtyButton();
		landingPage.incQtyButton();
		landingPage.incQtyButton();
		landingPage.clickAddButton();	
		genericUtils.sleepTime(1000);
	}
	@Then("Navigate to place order page")
	public void navigate_to_place_order_page() throws Exception {
		//landingPage = testContextSetup.pageObjectManager.getLandingPage(); //new LandingPage(testContentSetup.driver);
		landingPage.selectCartImg();
		genericUtils.sleepTime(500);
		landingPage.proceedCheckOut();
		genericUtils.sleepTime(2000);
	    
	}


}
