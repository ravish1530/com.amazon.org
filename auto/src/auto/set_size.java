package auto;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class set_size {

	public static void main(String[] args) throws InterruptedException
	{
             
		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/");
		Thread.sleep(2000);
		Dimension d= new Dimension(600,600);
		driver.manage().window().setSize(d);
		System.out.println(driver.manage().window().getSize());
		Thread.sleep(2000);
		
		Point p =new Point(400,400);
		driver.manage().window().setPosition(p);
		System.out.println(driver.manage().window().getPosition());
		Thread.sleep(2000);
		
		
		
		
		

	}

}
