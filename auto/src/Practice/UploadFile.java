package Practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {


		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();

	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	       
	    
	       
	              
	       driver.get("https://www.monsterindia.com/");
	       
	       driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
	       
	       //using sendKeys() use this method when attribute file=type is there
	      // driver.findElement(By.xpath("(//input[@id='file-upload'])[1]")).sendKeys("D:\\resume\\RResume.pdf");
	       
	       //using Robot Class methods
	       
	       WebElement button=driver.findElement(By.xpath("(//input[@id='file-upload'])[1]"));
	       
	       JavascriptExecutor js=(JavascriptExecutor)driver;
	       
	       js.executeScript("arguments[0].click();",button);
	       
	       Robot rb=new Robot();
	       
	       rb.delay(1000);
	       
	       //put path to file in clip board
	       StringSelection ss=new StringSelection("D:\\resume\\RResume.pdf");
	       Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	       
	       //CTRL+v
	       
	       rb.keyPress(KeyEvent.VK_CONTROL);//press on CTRL key
	       rb.keyPress(KeyEvent.VK_V);
	       
	       rb.keyRelease(KeyEvent.VK_CONTROL);
	       rb.keyRelease(KeyEvent.VK_V);
	       
	       //Enter 
	       
	       rb.keyPress(KeyEvent.VK_ENTER);
	       rb.keyRelease(KeyEvent.VK_ENTER);
	       
	       
	       
	       
	       
	    		 
	     
	}

}
