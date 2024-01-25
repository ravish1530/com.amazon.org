package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Check_webelements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable notifications");

		 DesiredCapabilities cp=new DesiredCapabilities();
		 cp.setCapability(ChromeOptions.CAPABILITY, options);
		 
		 options.merge(cp);
		 
	       WebDriver driver =new ChromeDriver(options);
	      
	       //driver.manage().window().maximize();
	      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	       
	       //is displayed
	     WebElement searchstore=  driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
	     System.out.println("display status: "+searchstore.isDisplayed());
	     System.out.println("Enable status: "+searchstore.isEnabled());
	     
	     //isSelected-used for check box, radio buttons,Drop down
	     
	     WebElement male=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
	     WebElement Female=driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
	     
	     System.out.println("male button selected: "+male.isSelected());
	     System.out.println("male button selected: "+Female.isSelected());
	     
      male.click();

      System.out.println("male button selected: "+male.isSelected());
	  System.out.println("male button selected: "+Female.isSelected());
	  
	  Female.click();

      System.out.println("male button selected: "+male.isSelected());
	  System.out.println("male button selected: "+Female.isSelected());
	  
	     

	     
	     

	}

}
