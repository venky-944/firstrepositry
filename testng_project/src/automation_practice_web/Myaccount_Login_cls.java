package automation_practice_web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Myaccount_Login_cls extends Base_class {

	@BeforeMethod
	public void rg_beforMethod() {
		driver.findElement(By.xpath("//*[@id=\"menu-item-50\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Test(priority = 1)
	public void login() {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("venkatnasana644@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Venky@1234");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();

		boolean content = driver.findElement(By.xpath("//*[contains(@class,\"MyAccount-content\")]")).isDisplayed();
		Assert.assertTrue(content, "User not login....");
	}

	@Test(priority = 2)
	public void login_wrong_password_username() {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("venkat@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Venky1234");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();

		String error_msg = driver.findElement(By.xpath("//*[@class=\"woocommerce-error\"]//li")).getText();
		System.out.println(error_msg);

	}

	@Test(priority = 3)
	public void login_empty_password() {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("venkat@gmail.com");
		// driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Venky1234");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();

		String error_msg = driver.findElement(By.xpath("//*[@class=\"woocommerce-error\"]//li")).getText();
		System.out.println(error_msg);

	}

	@Test(priority = 4)
	public void login_empty_username() {

		// driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("venkat@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Venky1234");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();

		String error_msg = driver.findElement(By.xpath("//*[@class=\"woocommerce-error\"]//li")).getText();
		System.out.println(error_msg);

	}

	@Test(priority = 5)
	public void login_empty_username_password() {

		// driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("venkat@gmail.com");
		// driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Venky1234");
		driver.findElement(By.xpath("//*[@name=\"login\"]")).click();

		String error_msg = driver.findElement(By.xpath("//*[@class=\"woocommerce-error\"]//li")).getText();
		System.out.println(error_msg);

	}

	@Test(priority = 6)
	public void verfiy_password_masked() {

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("venkat@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		pass.sendKeys("Venky1234");

		String actual_type = pass.getAttribute("type");
		String expected_type = "password";
		Assert.assertEquals(actual_type, expected_type, "password not masked..");

	}

}
