package TestNG.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import junit.framework.Assert;

public class testing_google_parameter {
	
	@Parameters({"keyword"})
	@Test
	public void googleSearch(String keyword)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys(keyword);
		Assert.assertEquals(keyword, search.getDomAttribute("value"));
	}

}
