package robotApi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class uploadFile1 {

	public static void main(String[] args) throws AWTException {
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
        
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.get("http://the-internet.herokuapp.com/upload");
	       
	     
	       
	       String path=System.getProperty("user.dir")+"\\screenshot\\robot.png";
	       
	       StringSelection stringSelection=new StringSelection(path);
	       
	       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	       
	        Actions act=new Actions(driver);
	        
	       WebElement file= driver.findElement(By.xpath("//input[@id='file-upload']"));
	       act.moveToElement(file).click().build().perform();
	       
	       Robot robot =new Robot();
	       robot.delay(2000);
	       
	       robot.keyPress(KeyEvent.VK_CONTROL);
	       robot.keyPress(KeyEvent.VK_V);
	       robot.keyRelease(KeyEvent.VK_CONTROL);
	       robot.keyRelease(KeyEvent.VK_V);
	       
	       robot.delay(3000);
	       robot.keyPress(KeyEvent.VK_ENTER);
	       robot.keyRelease(KeyEvent.VK_ENTER);
	       
	       driver.findElement(By.xpath("//input[@id='file-submit']")).click();
	       
	       

	}

}
