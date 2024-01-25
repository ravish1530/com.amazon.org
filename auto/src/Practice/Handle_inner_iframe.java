package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_inner_iframe {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	      WebDriver  driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("http://demo.automationtesting.in/Frames.html");
	       
	       driver.findElement(By.xpath("//a[normalize-space()='Iframe with in an Iframe']")).click();
	       
	       WebElement outerframe=driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
	       
	       driver.switchTo().frame(outerframe);//here we are passing frame as a webElement
	       
	     WebElement innerframe=  driver.findElement(By.xpath("/html/body/section/div/div/iframe"));
	       
	     driver.switchTo().frame(innerframe);
	     
	     driver.findElement(By.xpath("//input[@type='text']")).sendKeys("welcome");
	       
	       
	     
	}

}
