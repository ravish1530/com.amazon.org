package Assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class soft_assert {
	
	@Test
	public void m1()
	{
		SoftAssert s= new SoftAssert();
		
		String actualstr="Velocity";
		String expectedstr="Velocity";
		s.assertEquals(actualstr,expectedstr);
		
		String actualstr1="Velocity1";
		String expectedstr1="velocity1";
		s.assertNotEquals(actualstr1,expectedstr1);
		
		boolean actual=false;
		s.assertFalse(actual);
		
		boolean actual1=true;
		s.assertTrue(actual1);
		System.out.println("hello");
		s.assertAll();
		
	}

}
