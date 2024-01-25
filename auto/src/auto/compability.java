package auto;

import java.util.Scanner;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class compability {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

     System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
     
     System.setProperty("webdriver.edge.driver", "C:\\Automation\\edgedriver_win64\\msedgedriver.exe");
     
     Scanner sc =new Scanner(System.in);
     System.out.println("enter the browser: ");
     String str=sc.nextLine();
     if(str.equalsIgnoreCase("chrome")) {
    	  driver=new ChromeDriver(); 
    	 
     }
     if(str.equalsIgnoreCase("edge")) {
    	driver=new EdgeDriver();
     }
      driver.get("https://login.oracle.com/");
      Thread.sleep(2000);
      driver.manage().window().minimize();
      Thread.sleep(2000);
      Dimension d= new Dimension(1000,700);
      driver.manage().window().setSize(d);
      String title=driver.getTitle();
      String url=driver.getCurrentUrl();
      System.out.println("title of webpage: "+title+"url of webpage: "+url);
      Thread.sleep(2000);
      driver.navigate().to("https://www.flipkart.com/");
      driver.navigate().refresh();
      Thread.sleep(2000);
      Point p=new Point(100,100);
      driver.manage().window().setPosition(p);
      Thread.sleep(2000);
      driver.navigate().back();
      String t=driver.getTitle();
      if(t.equalsIgnoreCase("oracle login - single sign on")) {
    	  System.out.println("test is passed!");
      }else {
    	  System.out.println("test is failed!");
      }
      driver.navigate().refresh();
      Thread.sleep(2000);
      driver.quit();
      
      
      
	}



	

}
