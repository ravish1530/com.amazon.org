package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait2 {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
	     //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://www.google.com/");
	       
	    //   WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	       
	       
	       
	       driver.findElement(By.name("q")).sendKeys("selenium");
	       driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	       
	     // WebElement element= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"WebDriver\"]")));
	       By elelocator=By.xpath("//a[text()=\"WebDriver\"]");
	       waitforElementPresent(driver,  elelocator, 10).click();
	       
 
	}
	
	public static WebElement waitforElementPresent(WebDriver driver, By locator, int timeout) {
		
	       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
        
		      WebElement element= wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		
		return driver.findElement(locator);
	}

}
