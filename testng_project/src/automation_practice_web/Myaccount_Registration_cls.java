package automation_practice_web;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Myaccount_Registration_cls extends Base_class{
	
	@BeforeMethod
	public void rg_beforMethod() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
  @Test(priority = 1)
  public void registration() {
	  driver.findElement(By.cssSelector("input[id=\"reg_email\"]")).sendKeys("venkatnasana644@gmail.com");
	  driver.findElement(By.cssSelector("input[id=\"reg_password\"]")).sendKeys("Venky@1234");
	  driver.findElement(By.cssSelector("input[name=\"register\"]")).click();
  }
  
  @Test(priority = 2)
  public void registration_invalid_email_id() {
	  driver.findElement(By.cssSelector("input[id=\"reg_email\"]")).sendKeys("venkatnasa644");
	  driver.findElement(By.cssSelector("input[id=\"reg_password\"]")).sendKeys("Venky@1234");
	  driver.findElement(By.cssSelector("input[name=\"register\"]")).click();
	  
	  
  }
  
  @Test(priority = 3)
  public void registration_empty_email_id() {
	  //driver.findElement(By.cssSelector("input[id=\"reg_email\"]")).sendKeys("venkatnasa644");
	  driver.findElement(By.cssSelector("input[id=\"reg_password\"]")).sendKeys("Venky@1234");
	  driver.findElement(By.cssSelector("input[name=\"register\"]")).click();
	  
	  String error_msg=driver.findElement(By.xpath("//*[@class=\"woocommerce-error\"]//li")).getText(); 
	  System.out.println(error_msg);
	  
  }
  
  @Test(priority = 4)
  public void registration_empty_password() {
	  driver.findElement(By.cssSelector("input[id=\"reg_email\"]")).sendKeys("venkatnasa644@gmail.com");
	  //driver.findElement(By.cssSelector("input[id=\"reg_password\"]")).sendKeys("Venky@1234");
	  driver.findElement(By.cssSelector("input[name=\"register\"]")).click();
	  
	  String error_msg=driver.findElement(By.xpath("//*[@class=\"woocommerce-error\"]//li")).getText(); 
	  System.out.println(error_msg);
	  
  }
  
  @Test(priority = 5)
  public void registration_empty_password_email_id() {
	 // driver.findElement(By.cssSelector("input[id=\"reg_email\"]")).sendKeys("venkatnasa644");
	  //driver.findElement(By.cssSelector("input[id=\"reg_password\"]")).sendKeys("Venky@1234");
	  driver.findElement(By.cssSelector("input[name=\"register\"]")).click();
	  
	  String error_msg=driver.findElement(By.xpath("//*[@class=\"woocommerce-error\"]//li")).getText(); 
	  System.out.println(error_msg);
	  
  }
}