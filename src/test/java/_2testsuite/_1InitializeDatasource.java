package _2testsuite;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class _1InitializeDatasource {

	@BeforeSuite
	  public void initializeDatasource() {
	    System.out.println("We initialize data source before test suite");
	  }


}
