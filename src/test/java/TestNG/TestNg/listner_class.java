package TestNG.TestNg;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listner_class implements ITestListener{
	
	public void onStart(ITestContext result) {
		
		 
		System.out.println("This is onStart method " +result.getName());
		
	}
 
	public void onFinish(ITestContext result) {
			
		System.out.println("This is onFinish method " +result.getName());
	}
	
    public void onTestStart(ITestResult result) {
		
		System.out.println("New Test Started " +result.getName());
		
	}
	
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test Successfully Finished " +result.getName());
		
	}
 
	public void onTestFailure(ITestResult result) {
		
		System.out.println("Test Failed " +result.getName());
		
	}
 
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test Skipped " +result.getName());
		
	}
 
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		System.out.println("Test Failed but within success percentage" +result.getName());
		
	}
 


}
