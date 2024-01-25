package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_LoginUser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");
	      
	       WebDriver driver =new ChromeDriver();
	       
	       driver.manage().window().maximize();
	       
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get(" http://stage.cubmcpaws.com/");
	       
	       driver.findElement(By.xpath("//div[@id=\"track-order-id\"]/ul/span/li[1]")).click();
	       driver.findElement(By.xpath("//input[@id=\"mobile\"]")).sendKeys("8888890890");
	       driver.findElement(By.xpath("//input[@id=\"get_otp_btn\"]")).click();
	       driver.findElement(By.xpath("//input[@id=\"login_otp\"]")).sendKeys("1345768");
	       driver.findElement(By.xpath("//input[@id=\"submit_login_otp\"]")).click();

	}

}
