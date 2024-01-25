package Practice;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class expliciwait1 {

	public static void main(String[] args) {
		
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver	driver=new ChromeDriver(options);
		    driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
	     //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://www.google.com/");
	       
	       WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
	       
	       
	       
	       driver.findElement(By.name("q")).sendKeys("selenium");
	       driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	       
	      WebElement element= mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"WebDriver\"]")));
	       
 	       element.click();
	       
	}

}
