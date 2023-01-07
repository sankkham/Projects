package numedic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGlisteners extends qa implements ITestListener{
	
	@Override
	public void onTestStart(ITestResult result) {
		
		ITestListener.super.onTestStart(result);
		System.out.println("Test cases Started and results are: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		System.out.println("Test cases passed and results are: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		ITestListener.super.onTestFailure(result);
		System.out.println("Test cases failed and results are: "+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		ITestListener.super.onTestSkipped(result);
		System.out.println("Test cases Skipped and results are: "+result.getName());
	}

	

	@Override
	public void onFinish(ITestContext context) {
		
		ITestListener.super.onFinish(context);
		System.out.println("Test cases finished and resuts are: "+context.getName());
	}
	
	

}
