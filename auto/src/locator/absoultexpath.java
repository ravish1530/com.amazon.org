package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class absoultexpath {

	public static void main(String[] args) throws InterruptedException {

		  System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32\\chromedriver.exe");
	        
	        WebDriver driver=new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
	        Thread.sleep(2000);
	        
	        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[2]/input")).sendKeys("Admin");
	        
	        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[3]/input")).sendKeys("admin123");
	         
	        driver.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[2]/div[2]/form/div[5]/input")).click();
	        
	}

}
