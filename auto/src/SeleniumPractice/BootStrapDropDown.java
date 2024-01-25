package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BootStrapDropDown {

	static WebDriver driver;

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		 DesiredCapabilities cp=new DesiredCapabilities();
		 cp.setCapability(ChromeOptions.CAPABILITY, options);
		 
		 options.merge(cp);
		 
	     driver =new ChromeDriver(options);
	      
	       driver.manage().window().maximize();
	      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://www.hdfcbank.com/");
	       
	       driver.findElement(By.xpath("//button[@id=\"onetrust-accept-btn-handler\"]")).click();
		
	     
	       
	       driver.findElement(By.xpath("//div[@class='drp1']//div[@class=\"dropdown\"]")).click();
	      
	       //productlist
	       
	  List<WebElement>Producttype=driver.findElements(By.xpath("//ul[@class=\"dropdown1 dropdown-menu\"]//li"));
	 System.out.println("number of options:"+Producttype.size());
	 
	 for(WebElement ptype:Producttype) {
		 
		 if(ptype.getText().equals("Accounts")) {
			 ptype.click();
			 break;
		 }
	 }
	
	 //product
	 driver.findElement(By.xpath("//div[@class='drp2']//div[@class=\"dropdown\"]")).click();
	 
	 List<WebElement>product=driver.findElements(By.xpath("//ul[@class=\"dropdown2 dropdown-menu\"]//li"));
	
	 System.out.println("number of produts:"+product.size());
	 
	 for(WebElement prd:product)
	 {
		if(prd.getText().equals("Current Accounts")) {
			
			prd.click();
			break;
		}
	 }
		
	}

}
