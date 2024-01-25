package paralleltesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class paraller_class1 {
	
	@Test
	public void flipkart() throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       
        driver.get("https://www.flipkart.com/");
        Thread.sleep(2000);
        driver.close();
	}
	
	@Test
	public void facebook() {
System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
        
        WebDriver driver=new ChromeDriver();
        
       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");
        driver.close();
		
	}

}
