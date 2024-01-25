package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hard_assert {

	//assertEquals()
		@Test
		public void m1()
		{
			String actualResult="Good Morning";
			String expectedResult="Good Morning";
			Assert.assertFalse(false);
			Assert.assertEquals(actualResult,expectedResult,"Failed due to both values are different");
		System.out.println("method passed");
		}
		
		//assertNotEquals()
		
		@Test(enabled=false)
		public void m2()
		{
			String actualResult="Good Morning";
			String expectedResult="Good Morning";
			Assert.assertNotEquals(actualResult,expectedResult);
			
		}
		
		//asserTrue()
		@Test(enabled=false)
		public void m3()
		{
			boolean actualResult=true;
			Assert.assertTrue(actualResult);
		}
		
		//assertFalse()
		@Test(enabled=false)
		public void m4()
		{
			boolean actualResult=false;
			Assert.assertFalse(actualResult);
		}
		
		//assertNull()
		@Test
		
		public void m5()
		{
			String actualResult=null;
			Assert.assertNull(actualResult);
		}
		
		//assertNotNull()
		@Test
		public void m6()
		{
			String actualResult="Good Morning";
			Assert.assertNotNull(actualResult);
		}

}
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	

