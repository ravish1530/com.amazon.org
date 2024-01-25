package robotApi;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class robotapiDemo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
         
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.edureka.co");
	       
	       driver.findElement(By.linkText("Courses")).click();
	       
//limitations of robot class:mouse or keyboard event will only work on the current instance of window
//it is difficult to switch among different frames or window
//MouseMove()depends on the screen resolution	       
	       Robot robot=new Robot();
	       
	       Thread.sleep(3000);
	       
	       robot.keyPress(KeyEvent.VK_DOWN);

	       Thread.sleep(3000);
	       robot.keyPress(KeyEvent.VK_TAB);
           Thread.sleep(3000);
	 System.out.println("a");
	 robot.keyPress(KeyEvent.VK_TAB);
	 System.out.println("b");
	 robot.keyPress(KeyEvent.VK_TAB);

     Thread.sleep(3000);
     System.out.println("c");
     
     robot.mouseMove(30, 100);
     System.out.println("d");
     driver.quit();
	   
	       
	       
		
	       
	}

}
