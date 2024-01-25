package Practice;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
 
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		     
	       driver.manage().window().maximize();
	       driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	       
	       //Alert window with OK button
	       
	     /*  driver.findElement(By.xpath("//button[text()=\"Click for JS Alert\"]")).click();
	       Thread.sleep(2000);
	       driver.switchTo().alert().accept();*/
	       
	       //Alert window with OK & cancel button
	  /*     driver.findElement(By.xpath("//button[text()=\"Click for JS Confirm\"]")).click();
	       driver.switchTo().alert().accept();//close alert */
	       
	       //Alert window with input box
	       
	       driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
	       Thread.sleep(2000);
	       
	      Alert alertwindow=driver.switchTo().alert();
	      System.out.println("The message displyed:"+alertwindow.getText());
	      alertwindow.sendKeys("welcome");
	     
	      alertwindow.accept();
	      
	      
	       
	}

}
