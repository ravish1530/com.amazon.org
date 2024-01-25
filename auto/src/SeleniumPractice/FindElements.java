package SeleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class FindElements {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	      
		 ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable notifications");

		 DesiredCapabilities cp=new DesiredCapabilities();
		 cp.setCapability(ChromeOptions.CAPABILITY, options);
		 
		 options.merge(cp);
		 
	       WebDriver driver =new ChromeDriver(options);
	      
	       //driver.manage().window().maximize();
	      // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://demo.nopcommerce.com/");
	       
	       //Findelement--> returns single webeleemnt
	       
	       //1
	     WebElement searchbox= driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
	     searchbox.sendKeys("abd");
	    
	     //2
	   WebElement footer= driver.findElement(By.xpath("//div[@class=\"footer-upper\"]//a"));
	   
	   System.out.println(footer.getText());
	   
	   //3
	  // WebElement search=driver.findElement(By.xpath("//button[@class=\"button-1 search-box-\"]"));
	   
	   ///FindElements--> returns multiple webelement
	   
	  List<WebElement> ele= driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
	   System.out.println("No. Of values present: "+ele.size());
	   
	   for(WebElement list:ele) {
		   
		   System.out.println(list.getText());
		   
	   }
	   
	}

}
