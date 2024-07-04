package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class GenericUtils {
	public WebDriver driver;
	
	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public void swithToChildWindow() {
		
		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> t = s1.iterator();
		String parentWindow = t.next();
		String childWindow = t.next();
		driver.switchTo().window(childWindow);
	}
	
	public void sleepTime(int seconds) throws Exception {
		Thread.sleep(seconds);
		
	}
	

}
