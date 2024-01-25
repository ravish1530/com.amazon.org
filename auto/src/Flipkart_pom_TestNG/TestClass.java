package Flipkart_pom_TestNG;

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

public class TestClass {
	
	WebDriver driver;
	Flipkart_Login_Page lpage;
	Flipkart_Home_Page  hpage;
	XSSFSheet sh;
	
	
	
	@BeforeClass
	public void openapp() throws IOException {
		
		 System.setProperty("webdriver.edge.driver", "C:\\Automation\\edgedriver_win64\\msedgedriver.exe");
          driver = new EdgeDriver();
         
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.get("https://www.flipkart.com/");
         
         lpage=new Flipkart_Login_Page(driver);
         hpage=new Flipkart_Home_Page(driver);
         
         FileInputStream file=new FileInputStream("C:\\Automation\\parameterise\\demo.xlsx");
         XSSFWorkbook book=new XSSFWorkbook(file); 
         sh=book.getSheet("Sheet3");
         
       
	}
	
	@BeforeMethod
	public void loginapp() {
		
	
		lpage.enterEmail(sh.getRow(0).getCell(0).getStringCellValue());
		lpage.enterPassword(sh.getRow(0).getCell(1).getStringCellValue());
		lpage.loginclick();
		
	}
	
	@Test
	public void verifyuser() throws InterruptedException {
		String actualreslt=hpage.validateusername();
		//String expected=sh.getRow(0).getCell(2).getStringCellValue();
		String expectedreslt="Ravikumar";
		Assert.assertEquals(actualreslt, expectedreslt,"Failed:both values not same");
		Thread.sleep(2000);
		
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
