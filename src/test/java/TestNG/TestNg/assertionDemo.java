package TestNG.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;
public class assertionDemo {
	
	@Test
	public void verify_title()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://nexasoftware.com/");
		driver.manage().window().maximize();
		SoftAssert softVerify=new SoftAssert();
		softVerify.assertEquals(driver.getTitle(), "Nexa - Digital, Technology, Elevator business solutions | Nexa Software");
		
		softVerify.assertTrue(driver.findElement(By.xpath("//i[@class='fa fa-facebook']")).isDisplayed());
		driver.quit();
		softVerify.assertAll();
	}

}
