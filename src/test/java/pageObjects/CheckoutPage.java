package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.TestContextSetup;

public class CheckoutPage {

	public WebDriver driver;
	
	public CheckoutPage (WebDriver driver) {
		this.driver = driver;
	}
	By searchOffer = By.xpath("//input[@type='search']");
	By pruebaBy = By.cssSelector("tr td:nth-child(1)");  //"//p[@class='product-name']"
	By checkOutPageProduct = By.xpath("//p[@class='product-name']");
	By clickPlaceOrderBtnBy = By.xpath("//button[.='Place Order']"); 
	By applyButtonBy = By.xpath("//button[@class='promoBtn']");
	By brocolliAddBtnBy = By.xpath("//div[@class='products-wrapper']/div/div[1]/div[@class='product-action']/button[@type='button']");
	By carrotAddBtnBy = By.xpath("//div[@class='products-wrapper']/div/div[5]/div[@class='product-action']/button[@type='button']");
	By potatoAddBtnBy = By.xpath("//div[@class='products-wrapper']/div/div[11]/div[@class='product-action']/button[@type='button']");
	
	
	public void search(String name) {
		driver.findElement(searchOffer).sendKeys(name);
	}
	
	public String checkoutNameProduct() {		
		return driver.findElement(checkOutPageProduct).getText();
	}
	
	public String ccsbusca() {
		return driver.findElement(pruebaBy).getText();
	}
	
	public String placeButtonClick() {
		return driver.findElement(clickPlaceOrderBtnBy).getText();
	}
	
	public String applyButton() {
		return driver.findElement(applyButtonBy).getText();
	}
	
	public void brocolliSelect() {
		driver.findElement(brocolliAddBtnBy).click();
		
	}
	
	public void carrotSelect() {
		driver.findElement(carrotAddBtnBy).click();		
	}
	
	public void potatoeSelect() {
		driver.findElement(potatoAddBtnBy).click();
		
	}
	
	
}


