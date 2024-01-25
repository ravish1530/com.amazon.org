package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightClickAction {

	public static void main(String[] args) {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (4)\\chromedriver.exe");
	      
	      WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();

	      
	       
	       driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	       
	      WebElement button= driver.findElement(By.xpath("//span[@class=\"context-menu-one btn btn-neutral\"]"));
	       
	      Actions act=new Actions(driver);
	      act.contextClick(button).perform();//right click action
	      

	}

 }
