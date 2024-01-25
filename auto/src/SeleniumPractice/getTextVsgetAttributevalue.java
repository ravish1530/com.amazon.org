package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class getTextVsgetAttributevalue {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	      
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
	       
	       //capturing text from search box
	      WebElement searchbox= driver.findElement(By.xpath("//input[@id=\"small-searchterms\"]"));
	      searchbox.sendKeys("abc");
	      Thread.sleep(3000);
	      searchbox.clear();
	      searchbox.sendKeys("laptop");
	      
	      System.out.println("result from getattribute method: "+searchbox.getAttribute("value"));
	      System.out.println("result from getattribute method: "+searchbox.getText());

	
	      //search button
	      
	      WebElement search=driver.findElement(By.xpath("//button[@class=\"button-1 search-box-button\"]"));
	      
	      System.out.println(search.getAttribute("type"));
	      System.out.println(search.getAttribute("class"));
	      System.out.println(search.getText());
	      
	}

}
