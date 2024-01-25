package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://www.amazon.in/");
	       
	      // driver.findElement(By.linkText("Today's Deals")).click();
	      // driver.findElement(By.partialLinkText("Deals")).click();

	       //How to capture all the links
	       
	      List<WebElement>links= driver.findElements(By.tagName("a"));
	      System.out.println("Number of Links present:"+links.size());
	      
	      //normal for loop
	     /* for(int i=0;i<links.size();i++) {
	    	  
	    	  System.out.println(links.get(i).getText());
	    	  
	    	  System.out.println(links.get(i).getAttribute("href"));

	      }*/
	       
	      //using for each loop
	      
	      for(WebElement link:links) {
	    	  
	    	  System.out.println(link.getText());
	    	  System.out.println(link.getAttribute("href"));
	      }
	       
	       

	}

}
