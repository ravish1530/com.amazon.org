package testNG_example;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class priority {
	@Test//(priority=2)
	public void m1() {
		

        // Assert.fail();
		Reporter.log("testing case1",true);
	}
	
	@Test(dependsOnMethods= {"m1"})
	public void m2() {
		Reporter.log("testing case2",true);
	}

	 @Test//(priority=1)
	 public void m3() {
		 
		 Reporter.log("testing case3",true);
	 }
}

