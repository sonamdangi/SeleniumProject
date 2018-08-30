package GroupIdP1.ArtifactIdP1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGsimple3_beforeAfterMethod {
	@BeforeMethod
	public void initializeFirefox() {
      System.out.println("Initializing firefox");
	}

	@Test
	public void executeTest() {
	   System.out.println("Executing test case...");
	   System.out.println("test case completed");
	   System.out.println(" ");
	}

	@Test
	public void runTest() {
	   System.out.println("Running test case...");
	   System.out.println("test case completed");
	}

	@AfterMethod
	public void closeFirefox() {
		System.out.println("closing firefox");
	}
}
