package Practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear_field {

	public static void main(String[] args) throws InterruptedException {
	 
		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://demo.nopcommerce.com/login");
	       
	       WebElement email=driver.findElement(By.xpath(" //input[@id=\"Email\"]"));
	       email.sendKeys("xyz");
	       
	      
	      Thread.sleep(2000);
	      email.clear();
	      
	      email.sendKeys("ravi@gmail.com");
	      
	     System.out.println("result from getattribute:"+ email.getAttribute("value"));
	     System.out.println(email.getText());
	     
	     //login button
	     WebElement button=driver.findElement(By.xpath(" //button[@class=\"button-1 login-button\"]"));
	     System.out.println(button.getAttribute("type"));
	     System.out.println(button.getAttribute("class"));
	     
	     System.out.println(button.getText());
	       
	     String title=driver.findElement(By.xpath("//div[@class=\"page-title\"]//h1")).getText();
	     System.out.println(title);
	}

}
