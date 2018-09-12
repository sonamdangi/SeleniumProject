package GroupIdP1.ArtifactIdP1;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNgsimple5_suite {
	@BeforeSuite
	  public void initializeDatasource() {
	    System.out.println("We initialize data source before test suite");
	  }
	@BeforeClass
	public void readCredentialsFromDatabase(ITestContext icontext) {
		System.out.println("Get the credentials and set into one object");
	}

	@BeforeTest
	public void startFirefox_() {
		System.out.println("Starting firefox");
	}
	 @Test
	  public void loginTest(ITestContext icontext) {
		   System.out.println("Get the credentials from data object");
		  System.out.println("Pass credentials to user name and password of page");
	  }

	  @Test
	  public void checkEmployeeoffday() {
	   System.out.println("HR will go to dashboard page");
	   System.out.println("HR will search particular emplyoee with help of id");
	   System.out.println("Check the working days");
	   System.out.println("Calculate the salary");
	   System.out.println("Pass information to financial department");
	   System.out.println("logout from payroll application");
	  }
	  @AfterTest
		public void closeFirefox() {
			System.out.println("closing firefox");
		}
		@AfterClass
		public void removeUserObject(ITestContext icontext) {
			System.out.println("Remove user object from test suite");
		}
		
		 @AfterSuite
		  public void TerminateDatasource() {
		    System.out.println("We terminate data source after executing of testsuite");
		  }
}
