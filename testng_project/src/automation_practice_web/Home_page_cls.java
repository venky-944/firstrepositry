package automation_practice_web;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.util.concurrent.Runnables;

public class Home_page_cls extends Base_class {

	@BeforeMethod
	public void f() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@id=\"menu-item-40\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Home\"]")).click();

	}

	@Test(priority = 1)
	public void verify_sliders() {
		int actual_sliders = driver.findElements(By.xpath("//*[contains(@class,\"n2-ss-slider-3\")]//img")).size();
		int expected_sliders = 2;
		Assert.assertEquals(actual_sliders, expected_sliders);

	}

	@Test(priority = 2)
	public void verify_arreval() {

		int actual_arrival = driver.findElements(By.xpath("//*[@class=\"products\"]")).size();
		int expecte_arrival = 3;
		Assert.assertEquals(actual_arrival, expecte_arrival);
	}

	@Test(priority = 3)
	public void verify_Arrivals_navigation() {

		driver.findElement(By.xpath("//*[@alt=\"Selenium Ruby\"]")).click();

		String actual_title = driver.getTitle();
		String expected_title = "Selenium Ruby – Automation Practice Site";
		Assert.assertEquals(actual_title, expected_title);

	}

	@Test(priority = 4)
	public void verify_Arrivals_imgs_description() {

		driver.findElement(By.xpath("//*[@alt=\"Thinking in HTML\"]")).click();

		driver.findElement(By.xpath("//a[text()=\"Description\"]")).click();
		// driver.findElement(By.xpath("//a[text()=\"Reviews (0)\"]")).click();
		boolean description = driver.findElement(By.xpath("//*[@id=\"tab-description\"]")).isDisplayed();
		Assert.assertTrue(description, "Discription not shown...");

	}

	@Test(priority = 5)
	public void verify_Arrivals_imgs_Reviwes() {
		driver.findElement(By.xpath("//*[@alt=\"Mastering JavaScript\"]")).click();

		// driver.findElement(By.xpath("//a[text()=\"Description\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"Reviews (0)\"]")).click();
		boolean description = driver.findElement(By.xpath("//*[@id=\"reviews\"]")).isDisplayed();
		Assert.assertTrue(description, "Reviwes is  not shown...");

	}

	@Test(priority = 6)
	public void verify_Arrivals_AddtoBasket() {
		driver.findElement(By.xpath("//*[@alt=\"Selenium Ruby\"]")).click();

		driver.findElement(By.xpath("//button[text()=\"Add to basket\"]")).click();
		boolean message = driver.findElement(By.xpath("//*[@class=\"woocommerce-message\"]")).isDisplayed();
		Assert.assertTrue(message, "Item is not added to basket..");
	}

	@Test(priority = 7)
	public void verify_Viwe_Basket_button() {
		driver.findElement(By.xpath("//*[@alt=\"Selenium Ruby\"]")).click();

		driver.findElement(By.xpath("//button[text()=\"Add to basket\"]")).click();
		driver.findElement(By.xpath("//*[text()=\"View Basket\"]")).click();

		String actual_page_title = driver.getTitle();
		String expected_title = "Basket – Automation Practice Site";
		Assert.assertEquals(actual_page_title, expected_title);
		boolean table = driver.findElement(By.xpath("//*[contains(@class,\"shop_table\")]")).isDisplayed();
		Assert.assertTrue(table, "Tabel is not shown");

	}

	@Test(priority = 8)
	public void Verify_Basket_Items() {

		driver.findElement(By.xpath("//*[@alt=\"Mastering JavaScript\"]")).click();
		
		String qauntity=driver.findElement(By.xpath("//*[@name=\"quantity\"]")).getText();
		
		
		driver.findElement(By.xpath("//*[@name=\"quantity\"]")).sendKeys("2");
		
		String new_qauntity=driver.findElement(By.xpath("//*[@name=\"quantity\"]")).getText();
	
		
		Assert.assertEquals(qauntity, new_qauntity, "Qauntity not updated");
		driver.findElement(By.xpath("//*[@name=\"add-to-cart\"]")).click();

		driver.findElement(By.xpath("//*[@id=\"wpmenucartli\"]")).click();
		

	}

}
