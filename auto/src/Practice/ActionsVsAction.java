package Practice;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();

	       
	       
	       driver.get("http://automationpractice.com/index.php");
	    
	       WebElement women=driver.findElement(By.xpath("//a[@title='Women']"));
	       
	       //actions is a class
	       Actions act=new Actions(driver);
	       
	      // act.moveToElement(women).perform();
        
	       //action is an interface
	       Action action=act.moveToElement(women).build();
	       action.perform();
	       


	}

}
