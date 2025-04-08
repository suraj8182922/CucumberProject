package TestNG.TestNg;
import org.testng.annotations.*; 
public class bank_loan {

	@Test(enabled=true)
	public void personal_mobile()
	{
		System.out.println("personal mobile loan");
	}
	
	@Test
	public void personal_web()
	{
		System.out.println("personal web loan");
	}
	
	@Test
	public void personal_api()
	{
		System.out.println("personal api loan");
	}
	
	@Test
	public void automobile_web()
	{
		System.out.println("automobile web loan");
	}
	
	@Test
	public void automobile_mobile()
	{
		System.out.println("automobile mob loan");
	}
	
	@Test(enabled=true)
	public void automobile_api()
	{
		System.out.println("automobile api loan");
	}
	
	
}

