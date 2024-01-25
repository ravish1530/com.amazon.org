package InterviewPrepration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class IsEnabled_IsEnabled {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

	       RemoteWebDriver driver =new ChromeDriver(options);
	       
	       driver.manage().window().maximize();
	       driver.get("https://demo.nopcommerce.com/register");
	       
	       driver.navigate().to("https://demo.nopcommerce.com/register");
	       
	       
	       
	      WebElement searchStore= driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
	      
	     System.out.println("Display status:"+searchStore.isDisplayed());
	     System.out.println("Enable status:"+searchStore.isEnabled());
	     
	     
	     WebElement btn=driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
	     
	     System.out.println("Radio button:"+btn.isSelected());
	      
	      
	       
	       

	}

}
