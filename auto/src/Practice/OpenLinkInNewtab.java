package Practice;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenLinkInNewtab {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
            
	       driver.get("https://demo.nopcommerce.com/");
	       
	       String tab=Keys.chord(Keys.CONTROL,Keys.RETURN);
	       driver.findElement(By.linkText("Register")).sendKeys(tab);
	       
	       
	    }

}
