package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenURLin2Tab {

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
          
	       driver.get("https://demo.nopcommerce.com/");
	       
	       driver.switchTo().newWindow(WindowType.TAB);
	       //driver.switchTo().newWindow(WindowType.WINDOW);
	       
	       driver.get("https://www.opencart.com/");
	       
	       }

}
