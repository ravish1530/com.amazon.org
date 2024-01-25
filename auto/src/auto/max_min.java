package auto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class max_min {

	public static void main(String[] args) throws InterruptedException
	{

         System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://www.flipkart.com/");
         Thread.sleep(2000);
         driver.manage().window().maximize();
         Thread.sleep(2000);
         driver.manage().window().minimize();
         Thread.sleep(2000);
         driver.quit();
         
         
	}

}
