package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {

	public static void main(String[] args) {
 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://www.google.com/");
	       
	       driver.findElement(By.name("q")).sendKeys("selenium");
	       driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
	       
	       driver.findElement(By.xpath("//a[text()=\"WebDriver\"]")).click();
	       
	       
	}

}
