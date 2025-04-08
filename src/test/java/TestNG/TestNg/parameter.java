package TestNG.TestNg;
import org.testng.annotations.*;
public class parameter {
	
	@Test
	@Parameters({"a","b"})
	public void add(int a, int b)
	{
		System.out.println("addition is :" + (a+b));
	}

}
