package automation_practice_web;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.Arrays;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Base_class {
  
	public  WebDriver driver;
	
  @BeforeMethod
  public void Base_beforeMethod() {
//	  ChromeOptions options = new ChromeOptions();
//	  options.setExperimentalOption("excludeSwitches",Arrays.asList("disable-popup-blocking"));

	  driver=new ChromeDriver();
	  driver.get("https://practice.automationtesting.in/");
	  driver.manage().window().maximize();
	  
  }
  
  @AfterMethod
  public void Base_afterMethod() {
	  driver.quit();;
  }
  
  

}