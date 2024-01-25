package Practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

public class handle_dropdown {

	public static void main(String[] args) {
	 
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver	driver=new ChromeDriver(options);
		  
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://www.opencart.com/index.php?route=account/register");
	       
	       WebElement dropdown=driver.findElement(By.id("input-country"));
	       
	       Select drop=new Select(dropdown);
	      // drop.selectByVisibleText("Aruba");
	       
	      // drop.selectByValue("2");
	       
	      // drop.selectByIndex(12);

	       
	       //selecting option from table without using methods
	       List<WebElement>allop=drop.getOptions();
	       
	       for(WebElement option:allop) {
	    	   
	    	   if(option.getText().equals("Cuba"))
	    	   {
	    		   option.click();
	    		   break;
	    	   }
	       }
	       
	       
	       
	}

}
