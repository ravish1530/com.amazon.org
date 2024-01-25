package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_sibling_preceding_child_parent {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
          
	       driver.get("https://www.actitime.com/");
	       
	       //xpath of the child 
	    WebElement el=driver.findElement(By.xpath("//div[@class=\"header__container\"]/child::div/child::div/child::ul/child::li[1]"));
	      el.click();
	      
	      //Xpath of the sibling
	      driver.findElement(By.xpath("//span[contains(text(),\"Features\")]/parent::*/following-sibling::li[2]/a"));
	      
	      //xpath of preceding-sibling
	      driver.findElement(By.xpath("//span[contains(text(),\"Help Center\")]/parent::li/preceding-sibling::li[1]/a"));
	      
	      
		
		
	}
	
}
