package testNG_example;

import org.testng.Reporter;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNG_annotations {
    
	@BeforeSuite
	public void browserconfi() {
		Reporter.log("browser setting",true);
	}
	@BeforeTest
	public void browserwindowseeting() {
		Reporter.log("Code for maximizing",true);
	}
	@BeforeClass
	public void openapplication() {
		Reporter.log("opening an application",true);
	}
	@BeforeMethod
	public void login()
	{
		//Reporter.log("user login successfully");
		System.out.println("user login successfully");
	}
	
	@Test//it will first check test annotation
	public void testcase1()
	{
		Reporter.log("Test case 1 executing for user verification",true);
	}
	
	@AfterMethod
	public void logout() {
		
		//Reporter.log("user logout successfully");
		System.out.println("user logout successfully");
	}
	@Test
	public void testcase2() {
		Reporter.log("Test case2 executing for groceries",true);
	}
	
	@AfterClass
	public void closeapp() {
		Reporter.log("closing application",true);
	}
	
	
	@AfterTest
	public void closingbrowser() {
		Reporter.log("closing browser",true);
	}
	@AfterSuite
	public void browserchange() {
		Reporter.log("browser changing",true);
	}
}
