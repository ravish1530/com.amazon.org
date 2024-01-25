package Practice;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutosuggestDrop_Drown {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
	  
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("http://www.bing.com/");
	       
	       driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
	       
	       List<WebElement> list=driver.findElements(By.xpath("//li[@class=\"sa_sg as_extra_pad\"]//span"));
	       
	     Thread.sleep(3000);
	    		   
	       System.out.println("size of Auto Suggestions:"+list.size());
	       
	       for(WebElement item:list) {
	    	   
	    	   if(item.getText().equals("selenium webdriver")) {
	    		   item.click();
	    		   break;
	    	   }
	       }
	       
	       

	}

}
