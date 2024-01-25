package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();

	       
	       
	       driver.get("https://jqueryui.com/tooltip/");
	       
	       driver.switchTo().frame(0);
	       
	      WebElement inputbox= driver.findElement(By.xpath("//input[@id='age']"));
	      
	      String tooltip=inputbox.getAttribute("title");
	      System.out.println(tooltip);
	      

	}

}
