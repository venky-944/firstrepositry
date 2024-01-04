package testng_package01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_cls {
	
	WebDriver driver=new ChromeDriver();
	
	public WebElement element(String xpath) {
		
		return driver.findElement(By.xpath(xpath));
		
	}
	
	public void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}
	
	public void sendText(String xpath,String text) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}

}
