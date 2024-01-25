package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       //Flash,Drawing border & take screenshot,Getting title of the page,Click action,Generate alert
	       //Refreshing page,Scrolling down page,Scroll up page,Zoom page
	       
	       
	       driver.get("http://demo.nopcommerce.com/");
	       
	       //Drawing border
	  /*    WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	      JavaScriptUtil.draderwBor(logo, driver);
	      
	      TakesScreenshot ts=(TakesScreenshot)driver;
	      File src=ts.getScreenshotAs(OutputType.FILE);
	      File targ=new File(".\\screenshot\\logo.png");
	      FileUtils.copyFile(src, targ);
*/	      
	      
	      //capture Title of webPage
	  //   String title=JavaScriptUtil.getTitleByJS(driver);
	  //    System.out.println(title);
	      
	      //Click action
	  //    WebElement reglink=driver.findElement(By.xpath("//a[normalize-space()='Register']"));
	  //    JavaScriptUtil.clickElementByJS(reglink, driver);
	      
	      //Generate Alert
	      
	    //   JavaScriptUtil.generateAlert(driver, "This is My Alert....");
	       
	       //Refresh the page
	     //  JavaScriptUtil.refreshBrowserByJS(driver);
	       
	       //Scroll Down
	      // JavaScriptUtil.scrollpageDown(driver);
	       
	  //     Thread.sleep(4000);
	       //Scroll up
	    //   JavaScriptUtil.scrollpageUp(driver);
	       
	       //zoom page
	     //  JavaScriptUtil.zoomPageByJS(driver);
	       
	       //flash
	    WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
 
	    JavaScriptUtil.flash(logo, driver);
	    
	       
	       
	     

	}

}
