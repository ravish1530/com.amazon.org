package robotApi;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot_robotclass {

	public static void main(String[] args) throws AWTException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
        
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.get("http://tutorialsninja.com/demo/");
	       
	       driver.findElement(By.name("search")).sendKeys("HP");
	       
	       Robot robot=new Robot();
	       
	       
	       //approach 1 (putting values manually)
	     //  Rectangle rectangle=new Rectangle(25,50,1500,300);
	       
	     //  BufferedImage srcImage = robot.createScreenCapture(rectangle);
	       
	     //  ImageIO.write(srcImage, "PNG", new File("./screenshot/robot.png"));
	       
	    //approach 2
	     java.awt.Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	     Rectangle rectangle=new Rectangle(d);
	     
	    BufferedImage srcFile=robot.createScreenCapture(rectangle);
	    ImageIO.write(srcFile, "PNG", new File("./screenshot/robot.png"));
	    
	     
	       

	}

}
