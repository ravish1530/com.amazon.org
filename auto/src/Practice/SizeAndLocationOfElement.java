package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeAndLocationOfElement {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
        
	       driver.get("https://demo.nopcommerce.com/");
	       
	      WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
	      
	      //location method1
	      System.out.println("Location(x,y):"+logo.getLocation());
	      System.out.println("Location(x):"+logo.getLocation().getX());
	      System.out.println("Location(y):"+logo.getLocation().getY());
	      
	    //location method1
	      System.out.println("Location(x):"+logo.getRect().getX());
	      System.out.println("Location(y):"+logo.getRect().getY());
	      
	      //size method1
	      
	      System.out.println("size(width,height):"+logo.getSize());
	      System.out.println("size(width):"+logo.getSize().getWidth());
	      System.out.println("size(height):"+logo.getSize().getHeight());
	      
	      //size method2
	      System.out.println("size(width):"+logo.getRect().getDimension().getWidth());
	      System.out.println("size(height):"+logo.getRect().getDimension().getHeight());
 
	       driver.close();
	      

	      
	      
	      

	}

}
