package TestNG.TestNg;
import org.testng.annotations.*;

import junit.framework.Assert;
public class annotations {
	
	@Test
	public void test1()
	{
		System.out.println("Antem");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Bentely");
		Assert.assertTrue(false);
		
	}

	@Test(dependsOnMethods= {"test2"})
	public void test3()
	{
		System.out.println("Charley");
	}
	
	@Test
	public void test4()
	{
		System.out.println("Doctor");
	}
}
