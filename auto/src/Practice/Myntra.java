package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {

 

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();

	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	              
	       driver.get("https://www.myntra.com/");
	       
	       WebElement men=driver.findElement(By.xpath("//a[@class=\"desktop-main\" and @data-reactid=\"21\"]"));
	       
	     List<WebElement> list=driver.findElements(By.xpath("//ul[@data-reactid=\"60\" and @class=\"desktop-navBlock\"]//li//a"));
	     
	     Actions act=new Actions(driver);
	     act.moveToElement(men).perform();
	     
	     
	     
	     System.out.println("list of options:"+list.size());
	     
	     for(WebElement li:list) {
	    	 
	    	 System.out.println(li.getText());
	     }

	}

}
