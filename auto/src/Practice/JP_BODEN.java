package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JP_BODEN {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Automation\\chromedriver_win32 (3)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

        
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://www.boden.co.uk/");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[text()=\"Accept & Proceed\"]")).click();
        
        driver.findElement(By.xpath("//button[@class=\"header-rd__account\"]")).click();
        
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[text()=\"Sign in now\"]")).click();
        
        driver.findElement(By.xpath("//button[text()=\"Accept & Proceed\"]")).click();

        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("ravikumarshinde1543@gmail.com");
        
        driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Ravi@1234");
        
        driver.findElement(By.xpath("//button[@id=\"login\"]")).click();
        

	}

}
