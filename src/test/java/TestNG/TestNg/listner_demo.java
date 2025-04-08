package TestNG.TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.*;

import junit.framework.Assert;

@Listeners(TestNG.TestNg.listner_class.class)
public class listner_demo {
	
	@Test
	public void login()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		driver.close();
	}
	
	@Test
	public void testFail()
	{
		System.out.println("Failed test case");
		Assert.assertTrue(false);
	}
	
	@Test
	public void skip_test()
	{
		System.out.println("Skipped test case");
		throw new SkipException("skip exception");
	}
	

	

}
