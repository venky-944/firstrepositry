package testng_package01;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class TestNg_02 extends Base_cls{
	
	WebDriver driver = new ChromeDriver();
	
  @Test
  public void f() {
	  
	  
	  driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		super.element("//*[text()=\"Log in\"]").click();
		//driver.findElement(By.xpath("//*[text()=\"Log in\"]")).click();
		super.click("//*[text()=\"Log in\"]");
		super.sendText("input[id=\"Password\"]", "userpassword");
		super.click("input[id=\"RememberMe\"]");
		super.click("//button[contains(@class,\"login-button\")]");
  }


}
