package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class OffersPage {

	public WebDriver driver;
	
	public OffersPage (WebDriver driver) {
		this.driver = driver;
	}
	By searchOffer = By.xpath("//input[@type='search']");
	By offerPageProduct = By.cssSelector("tr td:nth-child(1)");
	
	
	public void search(String name) {
		driver.findElement(searchOffer).sendKeys(name);
	}
	
	public String OfferNameProduct() {
		return driver.findElement(offerPageProduct).getText();
	}
}
