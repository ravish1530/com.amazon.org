package auto;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class get_size {

	public static void main(String[] args) throws InterruptedException
	{

       System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
         
       WebDriver driver =new ChromeDriver();
       driver.get("https://outlook.live.com/");
       //to get current size browser
       Dimension d=driver.manage().window().getSize();
       System.out.println(d);
       Thread.sleep(2000);
       
       //to get current position browser
       Point p=driver.manage().window().getPosition();
       System.out.println(p);
       
       
	}

}
