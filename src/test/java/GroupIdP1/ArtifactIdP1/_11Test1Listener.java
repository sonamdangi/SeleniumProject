package GroupIdP1.ArtifactIdP1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class _11Test1Listener implements ITestListener {

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test start");
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
	System.out.println("test successs");	
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test failure");
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("test skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("failed 2");
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on start");
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("on finish");
	}
  
}
