package GroupIdP1.ArtifactIdP1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;
//to fail

@Listeners({_11Test1Listener.class})

public class _21Test1withITestListeners {
	 @Test(testName="F")
	  public void f() {
		if("Test".equals("Test1")){
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}
	  }
}
