package _2testsuite;

import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class _2OpenBrowser {
	@BeforeClass
	public void readCredentialsFromDatabase(ITestContext icontext) {
		System.out.println("Get the credentials and set into one object");
	}

	@BeforeTest
	public void startFirefox_() {
		System.out.println("Starting firefox");
	}
}
