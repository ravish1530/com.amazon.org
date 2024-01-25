package Practice;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class Fluentwait1 {

	public static void main(String[] args) {
		 

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
 
	       Wait<WebDriver> mywait=new FluentWait<WebDriver>(driver)
	    		                  .withTimeout(Duration.ofSeconds(30))
	    		                  .pollingEvery(Duration.ofSeconds(5))
	    		                  .ignoring(NoSuchElementException.class);
	       
	       
	       driver.get("https://www.google.com/");
	       
	    //   WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	       
	       
	       
	       driver.findElement(By.name("q")).sendKeys("selenium");
	       driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	       
	       //a[text()=\"WebDriver\"]
	       
	       //usage of fluent wait
	       
	       WebElement element=mywait.until(new Function<WebDriver, WebElement>(){
	    	   
	    	   public WebElement apply(WebDriver driver) {
	    		   return driver.findElement(By.xpath("//a[text()=\"WebDriver\"]"));
	    	   }
	    	   
	       });
	       
	       element.click();
	 
 
	}

}
