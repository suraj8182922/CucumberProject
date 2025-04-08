package TestNG.TestNg;
import org.testng.annotations.*;
public class Testcase1 {
	
		@BeforeSuite
	    public void beforesuit() {
	    	System.out.println("Before suit");
	    }

		@AfterSuite
	    public void aftersuit() {
	    	System.out.println("After suit");
	    }
		
	    @BeforeTest
		public void beforeTest()
		{
			System.out.println("Before Test");
		}
		
	    @AfterTest
		public void afterTest()
		{
			System.out.println("After Test");
		}
	
		@BeforeClass
	    public void beforeClass() {
			System.out.println("Before Class");
	    }	

		@AfterClass
	    public void afterClass() {
			System.out.println("After Class");
	    }
		
		@BeforeMethod
		public void beforeMethod() {
			System.out.println("Before Method");
		}
		@AfterMethod
		public void afterMethod() {
			System.out.println("After Method\n");
		}
		
	 
		@Test
		public void test1()
		{
			System.out.println("First test case");
		}
		@Test
		public void test2()
		{
			System.out.println("Second test case");
		}
		
}
