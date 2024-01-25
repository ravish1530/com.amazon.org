
package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search {

	public static void main(String[] args) throws InterruptedException {
    
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();

	       
	       
	       driver.get("https://www.google.com/");
	       
	       driver.findElement(By.name("q")).sendKeys("testing");
	       Thread.sleep(5000);
	       
	      List<WebElement>list= driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li/descendant::div[@class=\"wM6W7d\"]"));
	       
	      System.out.println("total number of suggestion:"+list.size());
	      
	      for(WebElement item:list) {
	    	  System.out.println(item.getText());
	      }

	}

}
