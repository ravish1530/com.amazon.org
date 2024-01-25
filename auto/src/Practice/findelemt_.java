package Practice;

import java.time.Duration;
import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findelemt_ {

	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
	      
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://demo.nopcommerce.com/");
	       //1
	       WebElement search=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	       search.sendKeys("xyx");
	       
	      
	       
	       //2
	       
	     /*  List<WebElement> links=driver.findElements(By.xpath("//div[@class=\"footer-upper\"]//a"));
	       
	       System.out.println("number of elements captured:"+  links.size());
	       
	       for(WebElement ele:links) {
	    	   
	    	   System.out.println(ele.getText());
	       }*/
	       
	       
	       
	       
	       
	       //3
	       
	    //   List<WebElement> logo=driver.findElements(By.xpath("//img[@alt=\"nopCommerce demo store\"]"));
	       
	     //  System.out.println("logo:"+logo.size());
	       
	       //4 for wrong locator not giving exception
	       
	    List<WebElement> list=  driver.findElements(By.xpath("//img[contains(title,'Electronics')]"));
      System.out.println("number of elements:"+list.size());
	}

}
