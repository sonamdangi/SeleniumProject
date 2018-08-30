package GroupIdP1.ArtifactIdP1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _1TestNGDataProvideSimpleTestcase {
	  @Test(dataProvider="Paramters")
	  public void f(String username,String password) {
	    System.out.println(username + " " + password);
	  }
	   
	  @DataProvider
	  public Object[][] Paramters(){
		  return new Object[][] { { "jayant", "jayant" }, { "qatraining", "qatraining" }};
	  }
}
