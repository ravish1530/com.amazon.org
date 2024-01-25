package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDoubleClickAction {

	public static void main(String[] args) {
		 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();

	       
	       
	       driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
	       
	       driver.switchTo().frame("iframeResult");
	       
	      WebElement field1= driver.findElement(By.id("field1"));
	      field1.clear();
	      field1.sendKeys("welcome");
	      
	  WebElement button= driver.findElement(By.xpath("//button[@ondblclick=\"myFunction()\"]"));
 
	  Actions act=new Actions(driver);
	  act.doubleClick(button).perform();
	  
	  System.out.println(field1.getAttribute("value"));
	       
	       

	}

}
