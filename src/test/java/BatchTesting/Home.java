package BatchTesting;

import org.testng.annotations.*;
public class Home {
	
	@Test
	public void startApplication()
	{
		System.out.println("app started");
	}
	
	@Test
	public void verifyTitle()
	{
		System.out.println("title verified");
	}
	
	@Test
	public void verifyLogo() 
	{
		System.out.println("logo verified");
	}

}
