package POM_DDF_TestNG_withmandatory_classes;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass  extends BaseClass
{
	
	//WebDriver driver;
	Flipkart_Login_Page lpage;
	Flipkart_Home_Page  hpage;
	XSSFSheet sh;
	
	
	
	@BeforeClass
	public void openapp() throws IOException 
	{
		  configurebrowser();
            
         lpage=new Flipkart_Login_Page(driver);
         hpage=new Flipkart_Home_Page(driver);
    
	}
	
	@BeforeMethod
	public void loginapp() throws IOException {
		
	
		lpage.enterEmail(utilityclass.fetchdata(0, 0));
		lpage.enterPassword(utilityclass.fetchdata(0, 1));
		lpage.loginclick();
		
		utilityclass.screenshot(driver, "login");
		
	}
	
	@Test
	public void verifyuser() throws InterruptedException, IOException {
		String actualreslt=hpage.validateusername();
		String expected=utilityclass.fetchdata(0, 2);
		//String expectedreslt="Ravikumar";
		Assert.assertEquals(actualreslt, expected,"Failed:both values not same");
		Thread.sleep(2000);
		utilityclass.screenshot(driver, "userverified");
		
	}
	
	@AfterMethod
	public void logout() {
		 
        // WebElement name=driver.findElement(By.xpath("//div[contains(text(),\"Ravikumar\")]"));
       
       
         
         
       //  Thread.sleep(6000);
         
        // WebElement log=driver.findElement(By.xpath("//div[contains(text(),\"Logout\")]"));
           //   act.click(log).perform();
		System.out.println("log out from application");

	}
	


		
	}






