package GroupIdP1.ArtifactIdP1;

import java.util.ArrayList;
import java.util.HashSet;
//import java.util.HashSet;
import java.util.List;

import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;
import org.testng.annotations.Test;
//import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class _61MethodInterceptorListener implements IMethodInterceptor {
	
public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
	// TODO Auto-generated method stub
	
	List result = new ArrayList();
	for (IMethodInstance m : methods) 
	{
		//@SuppressWarnings("deprecation")
		Test test = m.getMethod().getMethod().getAnnotation(Test.class);
		HashSet groups = new HashSet();
		for (String group : test.groups()) {
			groups.add(group);
		}
		if (groups.contains("perf")) {
			result.add(m);
		} else {
			String testMethod = m.getMethod().getMethod().getName();
			System.out.println(testMethod
					+ " not a performance test so remove it");
		}
	}
	return result;
	
	
}
}
