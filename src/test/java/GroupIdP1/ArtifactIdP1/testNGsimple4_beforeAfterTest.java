package GroupIdP1.ArtifactIdP1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNGsimple4_beforeAfterTest {
 
	@BeforeTest
	public void startFirefox_OpenDashboard() {
		System.out.println("inside BeforeTest");
		System.out.println("Starting firefox ");
		System.out.println("Opening dashboard link \n");
	}
	
	@BeforeMethod
    public void CheckUserisLoggedin(){
		System.out.println("inside BeforeMethod");

    	System.out.println("user is logged in");
    	System.out.println("he can access his dashboard\n");
    }

	@Test
	public void executeTest() {
		System.out.println("inside Test1");

		System.out.println("User clicked on test scores and he is able to see his test score \n");
	}
	@Test
	public void RunTest() {
		System.out.println("Testmethod2");
		System.out.println("User clicked on test scores and he is able to see his test score \n");
	}
 
 
	@AfterMethod
    public void LogoutUser(){
		System.out.println("inside afterMethod");

    	System.out.println("User clicked on logout button");
    	System.out.println("User is logged out\n");
    }
    
	@AfterTest
	public void executeAftertest() {
		System.out.println("inside afterTest");

		System.out.println("removing all the assets");
		System.out.println("Closing firefox\n");
	}

}
