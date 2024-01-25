package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteGooglePlacesDropDown {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://www.twoplugs.com/");
	       
          driver.findElement(By.xpath("//button[@id=\"details-button\"]")).click();
	       
	       driver.findElement(By.xpath("//a[@id=\"proceed-link\"]")).click();
	       
	       
	       driver.findElement(By.xpath("//a[text()=\"Live Posting\"]")).click();

	      WebElement searchbox=driver.findElement(By.id("autocomplete"));
	      searchbox.clear();
	     
	      
	      searchbox.sendKeys("Toronto");
	   
	      
	      String text;
	      
	      do
	      {
	    	  searchbox.sendKeys(Keys.ARROW_DOWN); 
	    	  Thread.sleep(3000);
	    	  
	    	  text=searchbox.getAttribute("value");
	    	  
	    	  if(text.equals("Toronto, ON, Canada")) 
	    	  {
	    		  
	    		  searchbox.sendKeys(Keys.ENTER);
	    		  break;
	    	  }
	    	  
	    	  Thread.sleep(3000);
	      }while(!text.isEmpty());
	      
	}

}
