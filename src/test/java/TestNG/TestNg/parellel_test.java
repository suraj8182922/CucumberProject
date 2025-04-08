package TestNG.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import junit.framework.Assert;

public class parellel_test {
	
	@Test
	public void verify_title()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://nexasoftware.com/");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(), "Nexa software - Digital, Technology, Elevator business solutions | Nexa Software");
	}
	
	@Test
	public void verify_logo()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://nexasoftware.com/");
		driver.manage().window().maximize();
		WebElement logo = driver.findElement(By.xpath("//a[@class='navbar-brand tw-nav-brand']"));
		Assert.assertTrue(logo.isDisplayed());		
	}
	

}
