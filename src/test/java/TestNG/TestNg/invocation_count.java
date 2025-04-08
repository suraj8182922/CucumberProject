package TestNG.TestNg;

import org.testng.annotations.*;

public class invocation_count {
	
	@Test(invocationCount=4)
	public void test1()
	{
		System.out.println("Test case1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("Test case2");
	}

}
