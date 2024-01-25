package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_RegisterPage {

	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get(" http://stage.cubmcpaws.com/");
	       
	       driver.findElement(By.xpath("//div[@id=\"track-order-id\"]/ul/span/li[2]")).click();
	       
	       driver.findElement(By.xpath("//input[@name=\"reg_name\"]")).sendKeys("Rahul");
	       
	       driver.findElement(By.xpath("//input[@name=\"reg_phn\"]")).sendKeys("8888890890");
	       
	       driver.findElement(By.xpath("//input[@name=\"reg_email\"]")).sendKeys("rahul@gmail.com");
	       driver.findElement(By.xpath("//div[@class=\"reg-coup-modal-lftpnl-form-group\"]/button")).click();

	       
	       
	       

	}

}
