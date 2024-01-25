package Practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) {


		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (1)\\chromedriver.exe");
	      
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
	       driver.get("https://www.amazon.com/");
	      // driver.get("https://www.snapdeal.com/");
	       driver.navigate().to("https://www.snapdeal.com/");
	       
	       driver.navigate().back();
	       driver.navigate().forward();
	       driver.navigate().refresh();

	}

}
