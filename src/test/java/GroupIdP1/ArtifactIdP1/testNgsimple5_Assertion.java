package GroupIdP1.ArtifactIdP1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class testNgsimple5_Assertion {
	@Test
	  public void OpenLoginpage() {
	    System.out.println("Open Login page");
	  }
	  @Test
	  public void testLogin(){
		  System.out.println("Login into app");
		  Assert.assertEquals("Logged in successfully", "Logged successfully");
	  }
	  @Test(dependsOnMethods="testLogin")
	  public void testLogout(){
		  System.out.println("Logout from the system");
	  }
}
