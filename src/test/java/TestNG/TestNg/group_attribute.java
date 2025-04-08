package TestNG.TestNg;
import org.testng.annotations.*;
public class group_attribute {
	
	@Test(groups="IT companies")
	public void infosys()
	{
		System.out.println("This is infosys");
	}

	@Test(groups="IT companies")
	public void TCS()
	{
		System.out.println("This is TCS");
	}
	
	@Test(groups="CAR companies")
	public void TATA()
	{
		System.out.println("This is TATA");
	}
	
	@Test(groups="CAR companies")
	public void BENZ()
	{
		System.out.println("This is BENZ");
	}
	
}
