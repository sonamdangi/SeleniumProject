package GroupIdP1.ArtifactIdP1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class _1TestNGDataProvideSimpleTestcase {
	  @Test(dataProvider="Parameters")
	  public void f(String username,String password) {
	    System.out.println(username + " " + password);
	  }
	   
	  @DataProvider
	  public Object[][] Parameters(){
		  return new Object[][] {
			  { "infotek", "infotek" }, 
			  { "qatraining", "qatraining" }
			  
		  };
	  }
}
