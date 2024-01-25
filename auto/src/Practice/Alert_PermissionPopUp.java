package Practice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alert_PermissionPopUp {

	public static void main(String[] args) {
 
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver(options);
		 
	       driver.manage().window().maximize();
	       //driver.manage().deleteAllCookies();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       
	       driver.get("https://www.redbus.in/");
	       
	}

}
