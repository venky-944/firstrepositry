package testng_package01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.RunInfo;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;

public class NewTest {
	
	//NewTest ob=new NewTest();
	WebDriver driver = new ChromeDriver();
	
  @BeforeMethod
  public void browser_lunch() {
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
  
//  @Test
//  public void lg() {
//		
//	  driver.get("https://demo.nopcommerce.com/");
//		// Click on the login 
//			
//			driver.findElement(By.xpath("//*[text()=\"Log in\"]")).click();
//					
//			// Fill the login details.
////			 name="venkateshnasana7@gmail.com";
////			 pass="Venky#123";
//			
//			ob.sendText("input[id=\"Email\"]", "username");
//			ob.sendText("input[id=\"Password\"]", "userpassword");
//			ob.click("input[id=\"RememberMe\"]");
//			ob.click("//button[contains(@class,\"login-button\")]");
//			
//		 
//	 }
  
}
