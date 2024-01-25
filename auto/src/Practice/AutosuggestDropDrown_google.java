package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropDrown_google {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("http://www.google.com/");
	       
	       driver.findElement(By.name("q")).sendKeys("java tutorial");
	       
	       Thread.sleep(3000);
	       
	       List<WebElement> list=driver.findElements(By.xpath("//li[@class=\"sbct\"]//div[@role=\"option\"]//div[1]/span"));
	       
	       System.out.println("Size of Auto Suggestions:"+list.size());
	       
	       for(WebElement item:list) {
	    	   System.out.println(item.getText());
	    	   if(item.getText().contains("beginners")) {
	    		  // item.click();
	    		   break;
	    	   }
	    	   
	       }
	       

	}

}
