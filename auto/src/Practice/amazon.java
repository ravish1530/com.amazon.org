package Practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.oer.its.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazon {

	public static void main(String[] args) {



		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
      
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();

	       
	       
	       driver.get("https://www.amazon.com/");
	       
	       
	       driver.findElement(By.xpath("//span[@class=\"hm-icon-label\"]")).click();
	      WebElement m= driver.findElement(By.xpath("//div[text()=\"Amazon Music\"]"));
	      m.click();
	     

  List<WebElement> music=driver.findElements(By.xpath("//ul[@data-menu-id=\"2\"]//a"));
 
  for(WebElement e:music) {
	  
	  System.out.println(e.getText());
	  
  }
	      
	      
   
	      
	}

}
