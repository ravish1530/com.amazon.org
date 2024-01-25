package robotApi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keypress_demo {

	public static void main(String[] args) throws AWTException {
	 
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
         
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.get("http://tutorialsninja.com/demo/");
	       
	       driver.findElement(By.name("search")).sendKeys("HP");
	       
	       Robot robot=new Robot();
	       
	       robot.keyPress(KeyEvent.VK_ENTER);
	       robot.keyRelease(KeyEvent.VK_ENTER);
	       
	       

	}

}
