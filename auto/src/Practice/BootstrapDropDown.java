package Practice;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BootstrapDropDown {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
       driver.get("https://www.hdfcbank.com/");
       
       driver.findElement(By.xpath("//div[@class=\"drp1\"]//div[@class=\"dropdown\"]")).click();
       
       //product type
       List<WebElement> ProductTypes=driver.findElements(By.xpath("//ul[@class=\"dropdown1 dropdown-menu\"]//li"));
       
       System.out.println("Number of options:"+ProductTypes.size());
       
       for(WebElement ptype:ProductTypes) {
    	   
    	   if(ptype.getText().equals("Cards")) {
    		   ptype.click();
    		   break;
    	   }
       } 
       
       //product
       
       driver.findElement(By.xpath("//div[@class=\"drp2\"]//div[@class=\"dropdown\"]")).click();
       
       List<WebElement> products=driver.findElements(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]//li"));
       
      System.out.println("Number of Products:"+products.size());
      
      for(WebElement prd:products) {
    	  
    	  if(prd.getText().equals("Credit Cards")) {
    		  
    		  prd.click();
    		  break;
    	  }
      }
       
	}

}
