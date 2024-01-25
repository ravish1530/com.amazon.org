 package crossbrowsertesting;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser_testing {
	
	
//	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
    
 //   WebDriver driver=new ChromeDriver();
    
 //   System.setProperty("webdriver.edge.driver", "C:\\Automation\\chromedriver_win32\\msedgedriver.exe");
    
 //   WebDriver driver=new EdgeDriver();
    
	
	@Parameters("browser")
	@Test
	public void m1(String browser) throws InterruptedException {
		
		WebDriver driver=null;
		if(browser.equals("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe"); 
			 driver=new ChromeDriver();
			
		}
		else if(browser.equals("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Automation\\edgedriver_win64 (1)\\msedgedriver.exe");
		    
		    driver=new EdgeDriver();
			    }
		
		 driver.get("https://www.amazon.com/");
		 Thread.sleep(2000);
	       // driver.close();
			
		}
    

}
