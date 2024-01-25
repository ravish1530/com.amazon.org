package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handle_iframe {

	public static void main(String[] args) throws InterruptedException {
 

		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		 
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	       
	       //1st frame
	       driver.switchTo().frame("packageListFrame");//name of frame
	       driver.findElement(By.xpath("//a[normalize-space()='org.openqa.selenium']")).click();
	       driver.switchTo().defaultContent();
	       Thread.sleep(2000);
	       
	       //2nd frame
	       driver.switchTo().frame("packageFrame");
	       driver.findElement(By.xpath("//span[normalize-space()='WebDriver']")).click();
	       driver.switchTo().defaultContent();
	       
	       Thread.sleep(5000);
	       //3rd frame
	       
	      // driver.switchTo().frame("classFrame");
	      // driver.findElement(By.xpath("//div[@class='topNav']//li[@class='navBarCell1Rev'][normalize-space()='Help']")).click();
	}

}
