package Practice;

import java.io.File;


import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShots {

	public static void main(String[] args) throws IOException {
 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();

	       
	       
	       driver.get("https://demo.nopcommerce.com/");
	       
	       //full page screen shot
	       
	     /*  TakesScreenshot ts=(TakesScreenshot)driver;
	       
	       File src=ts.getScreenshotAs(OutputType.FILE);
	       File targ=new File(".\\screenshot\\homepage.png");
	       
	       FileUtils.copyFile(src, targ);*/
	       
	       //screenshot of section/portion of page 
	       
       /*  TakesScreenshot ts=(TakesScreenshot)driver;
	       
           WebElement section=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
	      
           File src=section.getScreenshotAs(OutputType.FILE);
	       File targ=new File(".\\screenshot\\product.png");
	       
	       FileUtils.copyFile(src, targ);*/
	     
	       //Screenshot of specific element
	       WebElement ele=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		      
           File src=ele.getScreenshotAs(OutputType.FILE);
	       File targ=new File(".\\screenshot\\logo.png");
	       
	      FileUtils.copyFile(src, targ);
	     
	       
	    driver.close();
	}

}
