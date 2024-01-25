package Practice;

import java.time.Duration;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class isdisplyed_ {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origin=*");
		 options.addArguments("--disable notifications");

		 DesiredCapabilities cp=new DesiredCapabilities();
		 cp.setCapability(ChromeOptions.CAPABILITY, options);
		 options.merge(cp);
		 
	       WebDriver driver =new ChromeDriver(options);
	       
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://demo.nopcommerce.com/");
	       
	       WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	       
	       System.out.println("display status:"+search.isDisplayed());//boolean true false
	       System.out.println("Enable status:"+search.isEnabled());//boolean true false
	       
        //isSelected
	       
	       WebElement very=driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
	       WebElement verygood=driver.findElement(By.xpath("//input[@id='pollanswers-2']"));
	       
	       System.out.println(very.isSelected());
	       System.out.println(verygood.isSelected());
	       
	       very.click();
	       
	       System.out.println(very.isSelected());
	       
	       
	}

}
