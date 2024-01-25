package Practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropDown1 {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://www.hdfcbank.com/");
	       
	       driver.findElement(By.xpath("//div[@class=\"drp1\"]//div[@class=\"dropdown\"]")).click();
	       
	       //product type
	       List<WebElement> ProductTypes=driver.findElements(By.xpath("//ul[@class=\"dropdown1 dropdown-menu\"]//li"));
	       
	       System.out.println("Number of options:"+ProductTypes.size());
	       
	       selectoptionfromdropdown(ProductTypes,"Accounts");
	       
	     
	       
	       //product
	       
	       driver.findElement(By.xpath("//div[@class=\"drp2\"]//div[@class=\"dropdown\"]")).click();
	       
	       List<WebElement> products=driver.findElements(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]//li"));
	       
	      System.out.println("Number of Products:"+products.size());
	      
	      selectoptionfromdropdown(products,"Savings Accounts");



	}

	
	public static  void selectoptionfromdropdown(List<WebElement> options, String value) {
		

	       for(WebElement option:options) {
	    	   
	    	   if(option.getText().equals(value)) {
	    		   option.click();
	    		   break;
	    	   }
	       }
		
	}
	
}
