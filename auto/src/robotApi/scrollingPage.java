package robotApi;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollingPage {

	public static void main(String[] args) throws AWTException {
	 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
        
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.get("http://omayo.blogspot.com/");
	       
	       Robot robot=new Robot();
	       
	       robot.mouseWheel(15);
	       robot.delay(2000);
	       
	       robot.mouseWheel(-8);

	}

}
