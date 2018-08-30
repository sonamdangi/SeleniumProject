package _2testsuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class _6TerminateDataSource {
	 @AfterSuite
	  public void TerminateDatasource() {
	    System.out.println("We terminate data source after executing of testsuite");
	  }
}
