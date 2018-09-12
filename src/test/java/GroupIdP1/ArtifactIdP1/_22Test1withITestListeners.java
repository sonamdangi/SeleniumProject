package GroupIdP1.ArtifactIdP1;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

@Listeners({_11Test1Listener.class})


public class _22Test1withITestListeners {
	@Test(testName="F")
	  public void f() {
		if("Test".equals("Test")){
			Assert.assertTrue(true);
		}else{
			Assert.assertTrue(false);
		}
	  }
}
