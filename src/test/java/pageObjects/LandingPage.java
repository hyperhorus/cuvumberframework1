package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	
	public WebDriver driver;
	public LandingPage (WebDriver driver) {
		this.driver = driver;
	}
		
	By search = By.xpath("//input[@type='search']");
	By productName = By.cssSelector("h4.product-name");
	By topDealsBy = By.xpath("//a[@href='#/offers']");
	By addBtnBy = By.xpath("//div[@class='products-wrapper']//button[@type='button']");
	By incQtyProdBy = By.xpath("//a[@class='increment']");
	By cartImgLinkBy = By.xpath("//img[@alt='Cart']");
	By proceedCheckoutBy = By.xpath("//button[text()[contains(.,'PROCEED TO CHECKOUT')]]");
	
	public void searchItem(String name) {
		driver.findElement(search).sendKeys(name);
	}
	
	public void getSearchText() {
		driver.findElement(search).getText();
	}
	
	public String getProductName() {
		return driver.findElement(productName).getText();
	}
	
	public void selectTopDeals() {
		driver.findElement(topDealsBy).click();
	}
	
	public void clickAddButton() {
		driver.findElement(addBtnBy).click();
	}
	
	public void incQtyButton() {
		driver.findElement(incQtyProdBy).click();
	}
	
	public void selectCartImg() {
		driver.findElement(cartImgLinkBy).click();
	}
	
	public void proceedCheckOut() {
		driver.findElement(proceedCheckoutBy).click();
	}
}
