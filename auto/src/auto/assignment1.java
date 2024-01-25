package auto;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {

             System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
             WebDriver driver = new ChromeDriver();
             driver.get("https://www.facebook.com/");
             
             String title = driver.getTitle();
             System.out.println(title);
             
             if(title.equalsIgnoreCase("facebook - login or sign up")) {
            	 System.out.println("taste is passed");
             }else {
            	 System.out.println("taste is failed");
             }
             Thread.sleep(5000);
             Dimension d=new Dimension(700,700);
             driver.manage().window().setSize(d);
             System.out.println(driver.manage().window().getSize());
             Thread.sleep(5000);
             
             Point p=new Point(400,600);
             driver.manage().window().setPosition(p);
             System.out.println(driver.manage().window().getPosition());
             Thread.sleep(5000);
             
             driver.manage().window().maximize();
             Thread.sleep(5000);
             driver.manage().window().minimize();
             Thread.sleep(5000);
             driver.quit();
             
             
             
             
	}

}
