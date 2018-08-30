package GroupIdP1.ArtifactIdP1;

import org.testng.annotations.Test;

public class testNgsimple5_Priority {
  
	@Test(priority = 2)
	public void testLogin2() {
		System.out.println("Login in application");
	}

	@Test(priority = 1)
	public void testOpenLoginLink1() {
		System.out.println("Open login page");
	}
	
	@Test(priority = 3)
	public void testOpenLoginLink3() {
		System.out.println("Open login page");
	}
	
	@Test(priority = 4)
	public void testOpenLoginLink4() {
		System.out.println("Open login page");
	}

	@Test(priority = 5)
	public void testOpenLoginLink5() {
		System.out.println("Open login page");
	}
}
