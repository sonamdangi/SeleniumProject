package _2testsuite;

import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class _5CloseFirefox {
	@AfterTest
	public void startFirefox_() {
		System.out.println("closing firefox");
	}
	@AfterClass
	public void removeUserObject(ITestContext icontext) {
		System.out.println("Remove user object from test suite");
	}

}
