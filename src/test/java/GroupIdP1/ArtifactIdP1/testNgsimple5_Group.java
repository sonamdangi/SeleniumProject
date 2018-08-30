package GroupIdP1.ArtifactIdP1;

import org.testng.annotations.Test;

public class testNgsimple5_Group {
	@Test(groups = "login")
	public void enterUsername() {
		System.out.println("enter username\n");
	}

	@Test(groups = "login")
	public void enterPassword() {
		System.out.println("enter password\n");
	}
	@Test(groups = "login")
	public void clickonlogin() {
		System.out.println("click on login button\n");
	}

	@Test(groups = "searchflight\n")
	public void selectlocation() {
		System.out.println("select location\n");
	}
	@Test(groups = "searchflight")
	public void selectpreferences() {
		System.out.println("select preferenece\n");
	}
	@Test(groups = "searchflight")
	public void selectDate() {
		System.out.println("select dates\n");
	}
	@Test(groups = "searchflight")
	public void clickonsearch() {
		System.out.println("click on search\n");
	}
	
	@Test(groups = "logout")
	public void clickonlogout() {
		System.out.println("click on logout button");
		System.out.println("Logout from flight reservation system\n");
	}
}
