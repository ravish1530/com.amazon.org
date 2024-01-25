package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class StickSecure {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	    
		ChromeOptions options=new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 options.addArguments("--disable notifications");

		 DesiredCapabilities cp=new DesiredCapabilities();
		 cp.setCapability(ChromeOptions.CAPABILITY, options);
		 
		 options.merge(cp);
		 
	    WebDriver driver =new ChromeDriver(options);
	    
	    driver.manage().window().maximize();
	    
	    driver.get("https://app-sticksecure-web-dev-ae.azurewebsites.net/");
	    
	    WebElement login=driver.findElement(By.xpath("//input[@id='email']"));
	    WebElement password=driver.findElement(By.xpath("//input[@id='passw']"));
	    
	    login.sendKeys("stickman@stickmancyber.com");
	    password.sendKeys("Al!Y0UrBA5eaR3BE|0NGTOU5!");
	    
	    driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	    
	    driver.findElement(By.xpath("//div[contains(@class,'btn btn-primary w-[480px] text-center text-base leading-4 h-12 py-4')]")).click();

	    driver.quit();
	}

}
