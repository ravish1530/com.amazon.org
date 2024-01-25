package CWR;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class myntra {

	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("https://www.myntra.com/");
	        Thread.sleep(2000);
	        
	        
	       WebElement we= driver.findElement(By.xpath("//a[contains(@data-reactid,\"180\")]"));
	       Actions act1=new Actions(driver);
	        act1.moveToElement(we).perform();
             Thread.sleep(10000);
	       
	       WebElement el= driver.findElement(By.xpath("//a[contains(@data-reactid,\"190\")]"));
	       Actions act = new Actions(driver);
		act.click(el).perform();
	        
	        Thread.sleep(5000);
	        
	        
	        
	        

	}

}
